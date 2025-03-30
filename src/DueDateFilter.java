public class DueDateFilter implements TaskFilter{
    private String dueData;

    public DueDateFilter(String dueData) {
        this.dueData = dueData;
    }

    public boolean filter(Task task) {
        return task.getDueData().equals(dueData);
    }
}
