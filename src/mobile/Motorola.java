package mobile;

public class Motorola implements Mobile {
    static String person;
    static String message="Hai";
    Motorola(String person){
        this.person = person;
    }
    @Override
    public void call() {
        System.out.println("Calling : "+person);

    }

    @Override
    public void message() {
        System.out.println("Messaging to "+person+":"+message+" "+"to"+" "+person);

    }

    @Override
    public void menu() {
        System.out.println("1.Call to a person");
        System.out.println("2.Message to a person");
    }
}
