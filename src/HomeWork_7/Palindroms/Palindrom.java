package HomeWork_7.Palindroms;

import java.util.Arrays;

public class Palindrom {

    public boolean isPalindrom(String[] name) {

        String[] lowCaseArray = {name.toString().toLowerCase()};


        int i = 0;
        int j = name.length;

        int middleI = lowCaseArray.length / 2;

        while (i < j) {
            if ((lowCaseArray[i] != lowCaseArray[j])) {
                System.out.println("Vārds nav palindroms!");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("Vārds ir palindroms!");
        return true;
    }
}
