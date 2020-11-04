package Calculator;
import java.util.*;

public class runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers do you want to enter: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the number : ");
        for (int i = 0; i < array.length; i++) {
            int num1 = sc.nextInt();
            array[i] = num1;
        }
        System.out.println("Enter the Operation to perform: ");
        String opr = sc.next();
        switch (opr) {
            case "+":
                addition add = new addition(array);
                add.add();
                break;
            case "-":
                subtraction diff = new subtraction(array);
                diff.subtract();
                break;
            case "*":
                multiplication mul = new multiplication(array);
                mul.multiply();
                break;
            case "/":
                 try {
                     division div = new division(array);
                     div.divide();
                 }catch(ErrorHandling ex){
                     ex.display();
                 }
                 break;
            default:
                System.out.println("Operation not found");
        }
    }
        /*try {
            division div = new division(array);
            div.divide();
        } catch (ErrorHandling ex) {
            ex.display();
        }*/
    }





