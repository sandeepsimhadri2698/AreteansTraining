package Calculator;

public class division extends calculator {

    public static float num1 ,num2;
    division(float n1, float n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public void divide() {
        float div =num1/num2;
        System.out.println("Division of the two numbers is : "+div);
    }
}
