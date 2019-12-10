package HomeWork_9.Unique_Word_Counter;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounterTest {

    public static void main(String[] args) {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        uniqueWordCounter.addWord("apple");
        uniqueWordCounter.addWord("apple");
        uniqueWordCounter.addWord("mango");
        uniqueWordCounter.addWord("");

        uniqueWordCounter.printAllCollection();
    }
}
