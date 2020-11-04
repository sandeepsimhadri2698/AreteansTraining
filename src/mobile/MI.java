package mobile;

public class MI  implements Mobile{
    static String person;
    static String message ="Hello";
    MI(String user){
        person = user;
    }
    public void call(){
        System.out.println("Calling to : "+person);
        System.out.println("Thanks for choosing MI");
    }

    @Override
    public void message(){
        System.out.println("Messaging to"+" "+person +":"+message+" "+person);
        System.out.println("Thanks for choosing MI");
    }

    @Override
    public void menu() {
        System.out.println("1.Call to a person");
        System.out.println("2.Message to a person");
        System.out.println("3.feedback");


    }
}
