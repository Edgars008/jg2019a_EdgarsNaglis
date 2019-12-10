package HomeWork_7.Array_Service;

public class ArrayService {
    private int [] numberCollection;
    private static int arraysCount = 0;
    private static int sum = 0;


    public int[] create(int number){
     numberCollection = new int [number];
     return numberCollection;
    }

    public void fillArrayWithRandomNumbers(int number){
        numberCollection [arraysCount] = number;
        if (arraysCount >= 0 && arraysCount <=100){
            arraysCount++;
        }else {
            System.out.println("Nav vietas masīvā!");
        }
    }

    public void printArrayToConsole(){

        for (int i=0; i<numberCollection.length; i++){

                System.out.println("Arrays number: " + i + " is " + numberCollection[i]);

        }
//        for (int num: numberCollection){
//            System.out.println("Arrays to number: " + num);
//        }

    }

    public void sumInArray(){

        for (int i=0; i<numberCollection.length; i++){
            sum += numberCollection[i];
        }
        System.out.println("Arrays numbers sum: " + sum);
    }
}
