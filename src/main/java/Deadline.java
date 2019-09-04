
public class Deadline extends Task {
    protected String by;

    public Deadline (String desc, String by) {
        super(desc);
        this.by = by;
    }

    public String getTask(){
        String taskString = super.getTask();
        return "[D]" + taskString + "(by: " + this.by + ")";
    }
}