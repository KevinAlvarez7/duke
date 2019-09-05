import java.io.Serializable;
import java.util.ArrayList;
import java.io.Serializable;

//A-classes
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
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

    public String getTask() {
        String icon = this.getStatusIcon();
        String description = this.desc;
        return "[" + icon + "] " + description;
    }

}




