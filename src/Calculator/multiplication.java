package Calculator;

public class multiplication extends calculator {

    private static int [] array3;
    multiplication(int[] array){
       // num1=n1;
       // num2=n2;
        array3=array;
    }

    @Override
    public void multiply() {
       //double mul =num1*num2;
        int mul=1;
        for(int i=0;i< array3.length;i++) {
            mul *=array3[i];
    }
        System.out.println("Multiplication of the numbers is : "+mul);
}}
