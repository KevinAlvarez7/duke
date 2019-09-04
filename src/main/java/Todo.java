public class Todo extends Task {
//    protected String by;

    public Todo (String desc) {
        super(desc);
    }

    public String getTask(){
        String taskString = super.getTask();
        return "[T]" + taskString; //+ "(by: " + this.by + ")"
    }

}

