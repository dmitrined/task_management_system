public class PriorityFilter implements TaskFilter{
   private int priority;

    public PriorityFilter(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean filter(Task task) {
        return task.getPriority() == priority;
    }
}
