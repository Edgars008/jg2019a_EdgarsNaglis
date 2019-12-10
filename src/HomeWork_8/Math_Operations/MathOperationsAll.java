package HomeWork_8.Math_Operations;

public class MathOperationsAll implements MathOperation {

    AdditionOperation additionOperation = new AdditionOperation();
    SubstractionOperation substractionOperation = new SubstractionOperation();
    DivideOperation divideOperation = new DivideOperation();
    MultiplyOperation multiplyOperation = new MultiplyOperation();

    @Override
    public double execute(double num1, double num2) {
        System.out.println(additionOperation.execute(num1,num2));
        System.out.println(substractionOperation.execute(num1,num2));
        System.out.println(divideOperation.execute(num1, num2));
        System.out.println(multiplyOperation.execute(num1,num2));
        return 0;
    }



//    public void executeAll(double num1, double num2) {
//        System.out.println(additionOperation.execute(num1,num2));
//        System.out.println(substractionOperation.execute(num1,num2));
//        System.out.println(divideOperation.execute(num1, num2));
//        System.out.println(multiplyOperation.execute(num1,num2));
//        }

    public void executeAll(double num1, double num2) {
       execute(num1,num2);
    }


}
