package HomeWork_9.Unique_Word_Vocabulary;

import java.util.HashSet;
import java.util.Set;

public class Vocabulary {

    private Set<String> vocabulary = new HashSet<>();

        public void addWord(String word){
            if (word.isEmpty()){
                System.out.println("Can't add empty word!");
            }
            vocabulary.add(word);
        }

        public void getUniqueWords(String word){

            if (vocabulary.contains(word)){
                System.out.println("The word " + word + " is fount in vocabulary!");
            }else {
                System.out.println("The " + word + " hasn't been added to vocabulary!");
            }
        }

        public void getUniqueWordsCount(){
            System.out.println("Word added to vocabulary is: " + vocabulary.size());

        }

        public void printToConsole(){
            System.out.println("Words added to vocabulary: " + vocabulary);
        }
    }

