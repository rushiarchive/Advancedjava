package mainapp;

/* Importing packages */
import exceptiondemo.Vehicle;
import exceptiondemo.NoFuelExc;
import interfacedemo.Xyz;
import abstractdemo.Bike;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("----- Smart Vehicle Rental System -----");

        // Customer selects a bike
        Bike bike = new Bike();
        bike.startRide();

        // Check fuel
        Vehicle service = new Vehicle();

        try {
            service.checkFuelAndStart(5);   // change to 0 to test exception
        } catch (NoFuelExc e) {
            System.out.println(e.getMessage());
            return;
        }

        // Payment
        Xyz payment = new Xyz();
        payment.pay(250);
        payment.generateReceipt();

        // Ride ends
        bike.stopRide();

        System.out.println("Thank you for using our rental service!");
    }
}
