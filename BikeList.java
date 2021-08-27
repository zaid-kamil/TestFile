package Test;

import java.util.List;
import java.util.ArrayList;

public class BikeList {
    public static void main(String[] args) {
        List<Bike> listBike = new ArrayList<>();

        listBike.add(new Bike("Sport Bike","KTM","Orange","KTM LKO",
                118000,25,160,6,true));
        listBike.add(new Bike("Mountain Bike","Himalayan","Orange","Hero MOtoCOp LKO",
                100000,35,140,6,true));
        listBike.add(new Bike("Utility Bike","Hero","Black","Hero LKO",
                90000,45,120,5,false));

        for (Bike items: listBike) {
            System.out.println("========================================");
            System.out.println("Vehicle Type: " +items.vehicleType);
            System.out.println("Brand: " +items.brand);
            System.out.println("Vehicle Color: " +items.vehicleColor);
            System.out.println("Showroom Name: " +items.showroomName);
            System.out.println("Vehicle onroad Price: " +items.onroadPrice);
            System.out.println("Bike Avg Mileage: "+items.mileage);
            System.out.println("Bike Top Spped: "+items.topSpped);
            System.out.println("Maximum Gear: "+items.maxGear);
            System.out.println("Bike has disk Break: "+items.hasDiskBreak);
            System.out.println("========================================");
        }
    }
}
