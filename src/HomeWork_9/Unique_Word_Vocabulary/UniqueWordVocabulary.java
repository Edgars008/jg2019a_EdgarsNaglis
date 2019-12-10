package HomeWork_9.Unique_Word_Vocabulary;

public class UniqueWordVocabulary {

    public static void main(String[] args) {

        Vocabulary vocabulary = new Vocabulary();

        vocabulary.addWord("Laukums");
        vocabulary.addWord("Mala");
        vocabulary.addWord("Ziedonis");
        vocabulary.addWord("Futbols");
        vocabulary.addWord("Seja");
        vocabulary.addWord("Laukums");

        vocabulary.getUniqueWordsCount();

        vocabulary.getUniqueWords("laukums");
        vocabulary.getUniqueWords("Seja");
        vocabulary.getUniqueWords("Zobs");

        vocabulary.printToConsole();





    }




}
