package Test;

import java.util.List;
import java.util.ArrayList;

public class CarList {
    public static void main(String[] args) {
        List<Car> listCar = new ArrayList<>();

        listCar.add(new Car("SUV", "KIA", "Silver", "KIA LKO",
                1188000, 5, true));
        listCar.add(new Car("Sedan", "Jaguar", "White", "jaguar LKO",
                7000000, 4, false));
        listCar.add(new Car("Compact SUV", "Land Rover", "Blue", "Landrover LKO",
                6400000, 5,false));

        for (Car items : listCar) {
            System.out.println("========================================");
            System.out.println("Vehicle Type: " + items.vehicleType);
            System.out.println("Brand: " + items.brand);
            System.out.println("Vehicle Color: " + items.vehicleColor);
            System.out.println("Showroom Name: " + items.showroomName);
            System.out.println("Vehicle onroad Price: " + items.onroadPrice);
            System.out.println("Total Seats: " + items.totalSeats);
            System.out.println("Electric Car: " + items.isElectric);
            System.out.println("========================================");
        }
    }
}
