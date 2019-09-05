public class Event extends Task {
    protected String by;

    public Event (String desc, String by) {
        super(desc);
        this.by = by;
    }

    public String getTask(){
        String taskString = super.getTask();
        return "[E]" + taskString + "(at: " + this.by + ")";
    }
}
