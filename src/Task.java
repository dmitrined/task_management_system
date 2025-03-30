public class Task {
    private String title;
    private String desription;
    private int priority;
    private String dueData;
    private boolean isCompleted = false;

    public Task(String title, String desription, int priority, String dueData, boolean isCopleted) {
        this.title = title;
        this.desription = desription;
        this.priority = priority;
        this.dueData = dueData;
        this.isCompleted = isCopleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDueData() {
        return dueData;
    }

    public void setDueData(String dueData) {
        this.dueData = dueData;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCopleted(boolean copleted) {
        isCompleted = copleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", desription='" + desription + '\'' +
                ", priority=" + priority +
                ", dueData='" + dueData + '\'' +
                ", isCopleted=" + isCompleted +
                '}';
    }
}
