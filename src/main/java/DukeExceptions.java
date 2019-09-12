public class DukeExceptions {

    public DukeExceptions(){

    }


    public static void noIndexErrorMessage(){
        System.out.println("☹ OOPS!!! Sorry you'd have to include the index of your task.");
    }

    public static void noDescMessage(String command){
        System.out.println("☹ OOPS!!! The description of a " + command + " cannot be empty.");
    }

    public static void invalidCommand(){
        System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
    }
}
