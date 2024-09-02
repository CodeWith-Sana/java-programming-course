 interface Vehicle{
    public abstract void start();
    public abstract void stop();
}
interface MotorizedVehicle extends Vehicle{
    public abstract void refuel();
}
class Car implements MotorizedVehicle{
    @Override
    public void start() {
            System.out.println("Car is being started.");
            refuel();
            stop();
    }

    @Override
    public void stop() {
    System.out.println("press brake to stop the car.");
    }

    @Override
    public void refuel() {
        System.out.println("fuel is low. need to refuel the car.");
    }
}
class Bike implements MotorizedVehicle{
    public void start() {
        System.out.println("Bike is being started.");
        refuel();
        stop();
    }

    @Override
    public void stop() {
        System.out.println("press brake to stop the Bike.");
    }

    @Override
    public void refuel() {
        System.out.println("fuel is low. need to refuel the bike.");
    }
}


public class Vehiclemanagement {
    public static  void main(String args[]){
        Car c= new Car();
        c.start();
        Bike b = new Bike();
        b.start();
    }
}
