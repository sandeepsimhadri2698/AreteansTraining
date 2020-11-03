package Calculator;

class substraction extends calculator {
    public static int num1 ,num2;
    substraction(int n1, int n2){
        num1=n1;
        num2=n2;
    }

    @Override
    public void subtract() {
        int diff =num1-num2;
        System.out.println("Substraction of the two numbers is : "+diff);
    }
}
