package Calculator;

public class division extends calculator {

    private static int[] array3;
    division(int[] array){
        //num1=n1;
        //num2=n2;
        array3=array;
    }

    @Override
    public void divide(){
        try {
            int div = 0;
            for (int i = 0; i < array3.length; i++) {
                div = array3[0] / array3[i];
            }
            System.out.println("Division of the two numbers is : " + div);
        }catch(ArithmeticException ex){
            System.out.println("Denominator cannot be zero");
        }
    }
}

