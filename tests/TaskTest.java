import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testTaskCreation() {
        Task task = new Task("Заголовок задачи", "Описание задачи", 1, "2023-11-23", false);
        assertEquals("Заголовок задачи", task.getTitle());
        assertEquals("Описание задачи", task.getDesription());
        assertEquals(1, task.getPriority());
        assertEquals("2023-11-23", task.getDueData());
        assertFalse(task.isCompleted());
    }

    @Test
    public void testTaskSetters() {
        Task task = new Task("Заголовок задачи", "Описание задачи", 1, "2023-11-23", false);
        task.setTitle("Новый заголовок");
        task.setDesription("Новое описание");
        task.setPriority(2);
        task.setDueData("2023-11-24");
        task.setCopleted(true);

        assertEquals("Новый заголовок", task.getTitle());
        assertEquals("Новое описание", task.getDesription());
        assertEquals(2, task.getPriority());
        assertEquals("2023-11-24", task.getDueData());
        assertTrue(task.isCompleted());
    }

    @Test
    public void testTaskToString() {
        Task task = new Task("Заголовок задачи", "Описание задачи", 1, "2023-11-23", true);
        String expectedToString = "Task{title='Заголовок задачи', desription='Описание задачи', priority=1, dueData='2023-11-23', isCopleted=true}";
        assertEquals(expectedToString, task.toString());
    }
}