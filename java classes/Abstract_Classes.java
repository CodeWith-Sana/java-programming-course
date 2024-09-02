abstract class car{
    public abstract void Details();
    public abstract void turbo();
    public abstract void engineSpecification();
    public  void music(){
        System.out.println("V kamliya Meeeeeeri! nadan dil.........");
    }
}
class WagonR extends car{
    public void Details(){
        System.out.println("Name : WagonR" );
        System.out.println("Model : 2024" );
    }
   public void turbo(){
       System.out.println("380 m³/h at a turbine inlet pressure of 1 bar and an inlet air temperature of 25°C.");

    }
    public void engineSpecification(){
        System.out.println("2500 CC engine");
    }

    
}


public class Abstract_Classes {
    public static void main(String[] args) {
               car obj = new WagonR();
               obj.Details();
               obj.engineSpecification();
               obj.turbo();
               obj.music();

    }
}
