package Test;

public class Vehicle {
    String vehicleType;
    String brand;
    String vehicleColor;
    String showroomName;
    long onroadPrice;

    public Vehicle(String vehicleType, String brand, String vehicleColor, String showroomName, long onroadPrice) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.vehicleColor = vehicleColor;
        this.showroomName = showroomName;
        this.onroadPrice = onroadPrice;
    }
    void show() {
        System.out.println("Vehicle Type: " +vehicleType);
        System.out.println("Brand: " +brand);
        System.out.println("Vehicle Color: " +vehicleColor);
        System.out.println("Showroom Name: " +showroomName);
        System.out.println("Vehicle onroad Price: " +onroadPrice);
    }
}
