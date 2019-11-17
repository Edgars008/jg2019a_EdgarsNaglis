package HomeWork_6.NumberService;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        numberService.sumInRange(100,5);
        numberService.sumInRange(5,100);

        numberService.getEvenNumberCount(60,5);
        numberService.getEvenNumberCount(5,60);

    }
}
