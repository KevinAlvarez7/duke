import java.util.Scanner;
import java.util.*;


public class Duke {


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
        ArrayList<String> todoList = new ArrayList<String>();

        while(true){
            String Input = input.nextLine();
//            System.out.println(Input);
            if (Input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            }
            else if (Input.equals("list")){
                int size = todoList.size();
                for (int i = 0; i < size; i++ ) {
                    System.out.println(i+1 + ". " + todoList.get(i));
                }
            }
            else {
                todoList.add(Input);
                System.out.println("added:" + Input);
            }

        }
    }
}


