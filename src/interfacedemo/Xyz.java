package interfacedemo;

public class Xyz implements Abc {

    public void pay(double amount) {
        System.out.println("₹" + amount + " paid successfully");
    }

    public void generateReceipt() {
        System.out.println("Receipt generated and sent to customer");
    }
}
