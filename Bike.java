package Test;

public class Bike extends Vehicle{
    int mileage;
    int topSpped;
    int maxGear;
    boolean hasDiskBreak;

    public Bike(String vehicleType, String brand, String vehicleColor, String showroomName,
                long onroadPrice, int mileage, int topSpped, int maxGear, boolean hasDiskBreak) {
        super(vehicleType, brand, vehicleColor, showroomName, onroadPrice);
        this.mileage = mileage;
        this.topSpped = topSpped;
        this.maxGear = maxGear;
        this.hasDiskBreak = hasDiskBreak;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Bike Avg Mileage: "+mileage);
        System.out.println("Bike Top Spped: "+topSpped);
        System.out.println("Maximum Gear: "+maxGear);
        System.out.println("Bike has disk Break: "+hasDiskBreak);
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Bike","TVS","Blue","Bhulgya",
                95000,45,118,5,true);
        b1.show();
    }
}
