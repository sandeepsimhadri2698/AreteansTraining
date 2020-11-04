package Calculator;
 public class addition extends calculator {
    private static int num1 ,num2;
    addition(int n1, int n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public void add() {
        int sum =num1+num2;
        System.out.println("Addition of the two numbers is : "+sum);
    }
}
