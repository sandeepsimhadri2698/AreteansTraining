package Calculator;

public class ErrorHandling extends Exception {
    String str1;
ErrorHandling(String str){
    this.str1=str;
}
    public void display(){
        System.out.println(str1);
    }
}
