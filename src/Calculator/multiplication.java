package Calculator;

public class multiplication extends calculator {

    public static double num1 ,num2;
    multiplication(int n1, int n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public void multiply() {
        double mul =num1*num2;
        System.out.println("Multiplication of the two numbers is : "+mul);
    }
}
