package HomeWork_7.Sort_Swap;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();


        System.out.println(arrayService.create(101).length);
        arrayService.fillArrayWithRandomNumbers(10);
        arrayService.fillArrayWithRandomNumbers(50);
        arrayService.fillArrayWithRandomNumbers(60);
        arrayService.fillArrayWithRandomNumbers(70);
        arrayService.fillArrayWithRandomNumbers(80);

        arrayService.printArrayToConsole();
        arrayService.sumInArray();

        arrayService.sortArray();
    }
}
