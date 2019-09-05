import java.util.ArrayList;

public class Search {

    public Search (){

    }

    //getter
    public static ArrayList getIndex(ArrayList<Task> todoList, String findWord) {
        int numSize = todoList.size();
        ArrayList<Integer> indexArr = new ArrayList<Integer>();

        for (int i = 0; i < numSize; i++){
            String description = todoList.get(i).desc;
            String [] words = description.split (" ");
//            System.out.println(i);
            int wordCount = words.length;
            for (int j = 0; j < wordCount; j++){
                if (words[j].equals(findWord)){
                    indexArr.add(i);
//                    System.out.println(indexArr[nextIndex]);
                    break;
                }
            }
        }
        return indexArr;
    }
}
