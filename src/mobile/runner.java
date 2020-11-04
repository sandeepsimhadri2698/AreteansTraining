package mobile;
import java.util.*;

public class runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of user : ");
        String user = sc.next();
        System.out.println("Enter Choice of service : Moto or MI");
        String service = sc.next();

        if(service.equalsIgnoreCase("Moto")){
            Motorola moto = new Motorola(user);
            moto.menu();
            int choice =sc.nextInt();
            switch(choice) {
                case 1:
                    moto.call();
                    break;
                case 2:
                    moto.message();
                    break;
                default:
                    System.out.println("Sorry cannot find the service");

            }
        }else{
            MI mi = new MI(user);
            mi.menu();
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    mi.call();
                    break;
                case 2:
                    mi.message();
                    break;
                default:
                    System.out.println("Provide us feedback to perform better : ");
                    String feedback =sc.next();
                    System.out.println("Thanks for the feedback : "+feedback);
            }
        }

        }

    }

