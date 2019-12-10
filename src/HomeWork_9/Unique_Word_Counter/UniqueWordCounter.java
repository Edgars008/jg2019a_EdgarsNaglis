package HomeWork_9.Unique_Word_Counter;

import java.util.*;

public class UniqueWordCounter {

    public int counter = 0;

    private Map<Integer,String> uniqueWordCounter = new HashMap();

    public void addWord(String word){
        if (!word.isEmpty()){
            uniqueWordCounter.put(counter++,word);
            System.out.println("The word: " + "'" + word + "'" + " is added!");
        }else {
            System.out.println("The word is empty, can't add!");
        }
    }

    public void mostUsedWord(){

        Map<Integer,String> treeMap = new TreeMap<>(uniqueWordCounter);


       for (int i=0; i<treeMap.size(); i++){
          String word1 = treeMap.get(i);
          String word2 = treeMap.get(i+1);

       }

    }

    public void printAllCollection(){
        System.out.println("Collection Map: " + uniqueWordCounter);
    }
}
