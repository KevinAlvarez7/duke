public class Task {
    protected String desc;
    protected boolean isDone;

    //constr
    public Task(String desc) {
        this.desc = desc;
        this.isDone = false;
    }
    //getter
    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }
}
