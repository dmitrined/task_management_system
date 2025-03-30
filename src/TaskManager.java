import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    //добавляет задачу в список.
    public void addTask(Task task) {
        tasks.add(task);
    }

    //удаляет задачу по индексу.
    public void removeTaskByIndex(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    //возвращает задачу по индексу.
    public Task getTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            return tasks.get(index);
        }
        return null;
    }


    //  возвращает список всех задач.(копию)
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    // возвращает список выполненных задач.
    public List<Task> getCompletedTasks() {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted()) {
                result.add(task);
            }
        }
        return result;
    }

    //возвращает список невыполненных задач.
    public List<Task> getPendingTasks() {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                result.add(task);
            }
        }
        return result;
    }

    //возвращает список задач, удовлетворяющих заданному фильтру.
    public List<Task> filterTasks(TaskFilter filter) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (filter.filter(task)) {
                result.add(task);
            }
        }
        return new ArrayList<>(result);
    }

    //сортирует список задач с использованием заданного компаратора(ByPriority).
    public List<Task> sortTasks(Comparator<Task> comparator) {
        List<Task> result = new ArrayList<>(tasks);
        Collections.sort(result, comparator);
        return result;
    }
}