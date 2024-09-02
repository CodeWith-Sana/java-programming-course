abstract class Order{
    public abstract void processOrder();
    public   void validateOrder(){
        System.out.println("confirmation messages is sent to your email address.");
    }
}
abstract  class PhysicalOrder extends Order{
    public abstract void shipOrder();
}
class PhysicalProdoucts extends PhysicalOrder{
    @Override
    public void processOrder() {
        System.out.println("Processing physical order");
        validateOrder();
        shipOrder();
    }

    @Override
    public void shipOrder() {
        System.out.println("your order is shipped..can track via ......");
    }

}


public class EcommerceSys {
    public  static  void main(String args[]){
        PhysicalProdoucts p  =new PhysicalProdoucts();
        p.processOrder();

    }
}
