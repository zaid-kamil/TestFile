package Test;

public class Car extends Vehicle {
    int totalSeats;
    boolean isElectric;

    public Car(String vehicleType, String brand, String vehicleColor, String showroomName, long onroadPrice, int totalSeats, boolean isElectric) {
        super(vehicleType, brand, vehicleColor, showroomName, onroadPrice);
        this.totalSeats = totalSeats;
        this.isElectric = isElectric;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Total Seater: "+totalSeats);
        System.out.println("Electric Car: "+isElectric);
    }

    public static void main(String[] args) {
        Car car = new Car("SUV","TATA","Silver","Myshowroom",1500000,5,true);
        car.show();
    }
}
