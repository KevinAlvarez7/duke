import java.util.ArrayList;

//A-classes
public class Task {
    protected String desc;
    protected boolean isDone;

    //contsr
    public Task(String desc) {
        this.desc = desc;
        this.isDone = false;
    }

    //setter
    public void makeDone(){
        this.isDone = true;
    }

    //getter
    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

}
