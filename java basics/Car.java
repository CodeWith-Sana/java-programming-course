import java.util.Scanner;

public class Car {
    private String make;
    private int model, year, price;

    public Car() {
        make = null;
        model = year = price = 0;
    }

    public void setValues() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your car information:");

        System.out.println("Enter car make:");
        make = s.nextLine();

        System.out.println("Enter car model year:");
        model = s.nextInt();

        System.out.println("Enter car year:");
        year = s.nextInt();

        System.out.println("Enter car price:");
        price = s.nextInt();

        s.close();
    }

    public void getValues() {
        System.out.println("Car info:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
     public Car(String make, int model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    public Car(Car obj){
       this.make = obj.make;
       this.model = obj.model;
       this.price  =obj.price;
    }

    public static void main(String[] args) {
        Car obj1 = new Car();
        // obj1.setValues();
        obj1 = new Car("toyoata", 20 , 2012 , 2300000);
        obj1.getValues();
        Car obj3 =new Car();
        obj3 = new Car(obj1);
        System.out.println("car 3 info:"+ obj3.make + "  "+ obj3.model+ obj3.price + obj3.year);
       
    }
}
