package abstractdemo;

public abstract class Vehicle {
    public abstract void startRide();

    public void stopRide() {
        System.out.println("Ride completed. Vehicle parked safely");
    }
}
