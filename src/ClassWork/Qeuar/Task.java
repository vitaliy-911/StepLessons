package ClassWork.Qeuar;

public class Task {
    private int priority;
    private String title;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Task o) {
        return Integer.compare(this.priority,o.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", title='" + title + '\'' +
                '}';
    }
}
