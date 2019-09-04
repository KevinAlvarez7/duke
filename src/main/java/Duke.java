import java.util.Scanner;
import java.util.*;


public class Duke {

    public static ArrayList<Task> todoList = new ArrayList<Task>();

    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! I am Duke\n");
        System.out.println("What can I do for you?\n");

        while(true){
            //initial input
            String Input = input.nextLine();
            //command and number
            String[] inputs = Input.split(" ");
            //command and date&time
            String[] inputDateTime = Input.split ("/");
//            System.out.println(Input);
            if (Input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            }
            else if (Input.equals("list")){
                int listSize = todoList.size();
                for (int i = 0; i < listSize; i++ ) {
                    String printTask = todoList.get(i).getTask();
                    System.out.println(i+1 + "." + printTask);
                }
            }
            else if (inputs[0].equals("done")){
                int inputSize = inputs.length;
                if (inputSize == 1) {
                    System.out.println("☹ OOPS!!! Sorry you'd have to include the index of your task.");
                    continue;
                }

                int numIndex = Integer.parseInt(inputs[1]);
                //Task number set the icon to done
                todoList.get(numIndex-1).makeDone();
                System.out.println("Nice! I've marked this task as done");
                String printTask = todoList.get(numIndex-1).getTask();
                System.out.println(printTask);
            }
            else if (inputs[0].equals("todo")) {
                int inputSize = inputs.length;
                if (inputSize == 1) {
                    System.out.println("☹ OOPS!!! The description of a " + inputs[0] + " cannot be empty.");
                    continue;
                }
                System.out.println("Got it. I've added this task: ");
                String[] commandInfo = inputDateTime[0].split(" ", 2);
//                String[] byInfo = inputDateTime[1].split(" ", 2);
                Todo todo = new Todo(commandInfo[1]);
                String printTask = todo.getTask();
                System.out.println(printTask);
                todoList.add(todo);

                //print size of list
                int listSize = todoList.size();
                if (listSize > 1){
                    System.out.println("Now you have " + listSize + " tasks in the list.");
                }
                else {
                    System.out.println("Now you have " + listSize + " task in the list.");
                }

            }
            else if (inputs[0].equals("deadline")) {
                int inputSize = inputs.length;
                if (inputSize == 1) {
                    System.out.println("☹ OOPS!!! The description of a " + inputs[0] + " cannot be empty.");
                    continue;
                }

                System.out.println("Got it. I've added this task: ");
                String[] commandInfo = inputDateTime[0].split(" ", 2); //to get the desc
                String[] byInfo = inputDateTime[1].split(" ", 2); // to the split the by/at info
                Deadline deadline = new Deadline(commandInfo[1], byInfo[1]); //insert desc and other info
                String printTask = deadline.getTask();
                System.out.println(printTask);
                todoList.add(deadline);

                //print size of list
                int listSize = todoList.size();
                if (listSize > 1){
                    System.out.println("Now you have " + listSize + " tasks in the list.");
                }
                else {
                    System.out.println("Now you have " + listSize + " task in the list.");
                }
            }
            else if (inputs[0].equals("event")) {
                int inputSize = inputs.length;
                if (inputSize == 1) {
                    System.out.println("☹ OOPS!!! The description of a " + inputs[0] + " cannot be empty.");
                    continue;
                }

                System.out.println("Got it. I've added this task: ");
                String[] commandInfo = inputDateTime[0].split(" ", 2); //to get the desc
                String[] byInfo = inputDateTime[1].split(" ", 2); // to the split the by/at info
                Event event = new Event(commandInfo[1], byInfo[1]); //insert desc and other info
                String printTask = event.getTask();
                System.out.println(printTask);
                todoList.add(event);

                //print size of list
                int listSize = todoList.size();
                if (listSize > 1){
                    System.out.println("Now you have " + listSize + " tasks in the list.");
                }
                else {
                    System.out.println("Now you have " + listSize + " task in the list.");
                }
            }
            else {
                System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
            }
        }
    }
}


