package Calculator;

public class division extends calculator {

    public static float num1 ,num2;
    division(float n1, float n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public void divide() {
        if(num2==0){
            System.out.println("dividing by zero is not possible");
        }
        else{
        float div =num1/num2;
        System.out.println("Division of the two numbers is : "+div);
    }
}
}
