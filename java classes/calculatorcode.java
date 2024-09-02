class CalculatorSys{
    public int calculateFunc(int a , int b , char op){
        switch (op){
            case    '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                return 0;
        }
    }
}
class calculator1 extends CalculatorSys {
    public Double calculateFunc(Float a , Float b , char op){
        switch (op){
            case    '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                return 0.0F;
        }
    }
}
public class calculatorcode{
    public static    void main(String args[]){
        calculator1 c = new calculator1();
	CalculatorSys  c1 = new CalculatorSys();
       System.out.println(c1.calculateFunc(2,2,'*'));

        System.out.println(c.calculateFunc(2.5,2.5,'+'));
    }
}