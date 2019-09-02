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

        while(true){
            String Input = input.nextLine();
            System.out.println(Input);
            if (Input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            }
        }
    }
}
