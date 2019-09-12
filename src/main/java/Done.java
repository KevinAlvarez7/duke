import java.util.ArrayList;

public class Done{

    public Done(){

    }

    public static void finishTask(ArrayList<Task> todoList, String number) {
        int numIndex = Integer.parseInt(number); //parsing of strings to get the index of task to mark as done

        todoList.get(numIndex-1).makeDone(); //Set Task to done

        //Finished Task
        System.out.println("Nice! I've marked this task as done");
        String printTask = todoList.get(numIndex-1).getTask();
        System.out.println(printTask);
    }
}
