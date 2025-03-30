import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    private TaskManager taskManager;
    private Task task1;
    private Task task2;
    private Task task3;

    @BeforeEach
    public void setUp() {
        taskManager = new TaskManager();
        task1 = new Task("Задача 1", "Описание 1", 1, "2023-11-23", false);
        task2 = new Task("Задача 2", "Описание 2", 2, "2023-11-24", true);
        task3 = new Task("Задача 3", "Описание 3", 3, "2023-11-25", false);
    }

    @Test
    public void testAddTask() {
        taskManager.addTask(task1);
        assertEquals(1, taskManager.getAllTasks().size());
        assertTrue(taskManager.getAllTasks().contains(task1));
    }

    @Test
    public void testRemoveTaskByIndex() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.removeTaskByIndex(0);
        assertEquals(1, taskManager.getAllTasks().size());
        assertFalse(taskManager.getAllTasks().contains(task1));
    }

    @Test
    public void testGetTask() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        assertEquals(task1, taskManager.getTask(0));
        assertNull(taskManager.getTask(2));
    }

    @Test
    public void testGetAllTasks() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        List<Task> allTasks = taskManager.getAllTasks();
        assertEquals(2, allTasks.size());
        assertTrue(allTasks.contains(task1));
        assertTrue(allTasks.contains(task2));
    }

    @Test
    public void testGetCompletedTasks() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        List<Task> completedTasks = taskManager.getCompletedTasks();
        assertEquals(1, completedTasks.size());
        assertTrue(completedTasks.contains(task2));
    }

    @Test
    public void testGetPendingTasks() {
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        List<Task> pendingTasks = taskManager.getPendingTasks();
        assertEquals(2, pendingTasks.size());
        assertTrue(pendingTasks.contains(task1));
        assertTrue(pendingTasks.contains(task3));
    }

    @Test
    public void testSortTasks() {
        taskManager.addTask(task3);
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        List<Task> sortedTasks = taskManager.sortTasks(Comparator.comparingInt(Task::getPriority));
        assertEquals(task1, sortedTasks.get(0));
        assertEquals(task2, sortedTasks.get(1));
        assertEquals(task3, sortedTasks.get(2));
    }
}