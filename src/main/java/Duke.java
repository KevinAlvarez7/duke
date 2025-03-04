import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;


public class Duke {

    public static ArrayList<Task> todoList = new ArrayList<Task>();

    public static void main(String[] args) throws IOException {
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

            String Input = input.nextLine(); //initial input

            String[] inputs = Input.split(" "); //command and number

            String[] inputDateTime = Input.split ("/"); //command and date&time

            //END CODE
            if (Input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            }

            //LIST
            else if (Input.equals("list")){
                int listSize = todoList.size();

                //printing Tasks
                for (int i = 0; i < listSize; i++ ) {
                    String printTask = todoList.get(i).getTask();
                    System.out.println(i+1 + "." + printTask);
                }
            }

            //DONE
            else if (inputs[0].equals("done")){
                int inputSize = inputs.length;

                //Error Messages
                if (inputSize == 1) {
                    DukeExceptions.noIndexErrorMessage();
                    continue;
                }

                Done.finishTask(todoList, inputs[1]);

            }

            //DELETE
            else if (inputs[0].equals("delete")){
                int inputSize = inputs.length;

                //Error Messages
                if (inputSize == 1) {
                    DukeExceptions.noIndexErrorMessage();
                    continue;
                }

                int numIndex = Integer.parseInt(inputs[1]); //parsing of strings to ge the index of task to delete

                String printTask = todoList.get(numIndex-1).getTask();

                //Removing Tasks
                System.out.println("Noted. I've removed this task:");
                System.out.println(printTask);
                todoList.remove(numIndex-1); //delete TASK

                int listSize = todoList.size();
                //Print out acknowledgement of Tasks
                if (listSize > 1){
                    System.out.println("Now you have " + listSize + " tasks in the list.");
                }
                else {
                    System.out.println("Now you have " + listSize + " task in the list.");
                }
            }

            //FIND
            else if (inputs[0].equals("find")) {
                int inputSize = inputs.length;
                if (inputSize == 1) {
                    DukeExceptions.noIndexErrorMessage();
                    continue;
                }

                ArrayList <Integer> indexArr = Search.getIndex(todoList,inputs[1]);
                int indexArrSize = indexArr.size();
                System.out.println("Here are the matching tasks in your list:");
                for (int i = 0; i < indexArrSize; i++){
                    int numIndex = indexArr.get(i);
                    String printTask = todoList.get(numIndex).getTask();
                    System.out.println(printTask);
                }
            }

            else if (inputs[0].equals("todo")) {
                int inputSize = inputs.length;
                if (inputSize == 1) {
                    DukeExceptions.noDescMessage(inputs[0]);
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
                    DukeExceptions.noDescMessage(inputs[0]);
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
                    DukeExceptions.noDescMessage(inputs[0]);
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
//            else if (Input.equals("save")){
//                FileWriter writer = new FileWriter("output.txt");
//                for(Task str: todoList) {
//                    writer.write(str + System.lineSeparator());
//                }
//                writer.close();
//            }
            else {
                DukeExceptions.invalidCommand();
            }
        }
    }
}


