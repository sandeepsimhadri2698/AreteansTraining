package Calculator;
import java.util.*;

public class runner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Operator : ");
        String opr = sc.next();
        switch(opr){
            case "+":
                addition add = new addition(num1,num2);
                add.add();
                break;
            case "-":
                subtraction diff = new subtraction(num1,num2);
                diff.subtract();
                break;
            case "*":
                multiplication mul = new multiplication(num1,num2);
                mul.multiply();
                break;
            case "/":
                division div = new division(num1,num2);
                div.divide();
                break;
            default:System.out.println("Operation not found");
        }
    }
}
