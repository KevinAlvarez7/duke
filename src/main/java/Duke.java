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
            String Input = input.nextLine();
            String[] inputs = Input.split(" ");
//            System.out.println(Input);
            if (Input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            }
            else if (Input.equals("list")){
                int listSize = todoList.size();
                for (int i = 0; i < listSize; i++ ) {
                    System.out.println(i+1 + "." + "[" + todoList.get(i).getStatusIcon() + "] "+todoList.get(i).desc);
                }
            }
            else if (inputs[0].equals("done")){
                int numIndex = Integer.parseInt(inputs[1]);
                //Task number set the icon to done
                todoList.get(numIndex-1).makeDone();
                System.out.println("Nice! I've marked this task as done");
                String icon = todoList.get(numIndex-1).getStatusIcon();
                String desc = todoList.get(numIndex-1).desc;
                System.out.println("[" + icon + "] " + desc);
            }
            else if (Input.equals(" ")){
                continue;
            }
            else {
                todoList.add(new Task(Input));
                System.out.println("added:" + Input);
            }
        }
    }
}


