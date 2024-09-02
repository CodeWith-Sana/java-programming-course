class Calc{

    public int add(int a, int b){

        return  a+b;
    }
    public int sub(int a, int b){
        return a - b;
    }

}
class AdvanceCalc extends Calc{
    AdvanceCalc(){
        System.out.println("this is advance calculator");

    }
    public int multiply (int a, int b){

        return a * b;
    }
    public int divide (int a , int b){
        return a/b;
    }

}

public class Calculator {
    public static void main(String[] args) {
        AdvanceCalc obj = new AdvanceCalc();
        int sum = obj.add(2,3);
        System.out.println(sum);
    }
}
