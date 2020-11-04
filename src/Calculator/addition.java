package Calculator;
 public class addition extends calculator {
     private static int[] array1;
     public addition(int[] array) {
         array1=array;
     }
     //private static int num1 ,num2;
    //addition(int[] array){
       // num1=n1;
       // num2=n2;


    public void add() {
         int sum=0;
        for(int i=0;i< array1.length;i++) {
           sum += array1[i];
    }
        System.out.println("Addition of the two numbers is : "+sum);
}
}