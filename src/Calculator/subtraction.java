package Calculator;

class subtraction extends calculator {
    public static int num1 ,num2;
    subtraction(int n1, int n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public void subtract() {
        int diff =num1-num2;
        System.out.println("Subtraction of the two numbers is : "+diff);
    }
}
