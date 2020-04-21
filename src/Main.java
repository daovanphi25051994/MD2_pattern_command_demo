public class Main {
    public static void main(String[] args) {
        Calculator calculatorSum = new Calculator(new AddOperator());
        Calculator calculatorSub = new Calculator(new SubOperator());
        int sum = calculatorSum.execute(2, 3);
        int sub = calculatorSub.execute(2, 3);
        System.out.println(sum);
        System.out.println(sub);
    }
}
