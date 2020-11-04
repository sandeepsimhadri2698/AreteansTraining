package Calculator;

import java.util.Arrays;

class subtraction extends calculator {
    private static int[] array2;
    subtraction(int[] array){
       // num1=n1;
       // num2=n2;
        array2 = array;
    }

    @Override
    public void subtract() {
        //int diff =num1-num2;
        int diff=array2[0];
        for(int i=1;i< array2.length;i++) {
            diff -=array2[i];
        }
       System.out.println("Subtraction of the numbers is : "+ diff);
}
}
