package exceptiondemo;

public class Vehicle {

    public void checkFuelAndStart(int fuel) throws NoFuelExc {
        if (fuel <= 0) {
            throw new NoFuelExc("Booking Failed: Vehicle has no fuel");
        } else {
            System.out.println("Vehicle ready for service. Fuel = " + fuel + " litres");
        }
    }
}
