

public class Main {
    public static void main(String[] args) {
        int nFloors = 4;
        int slotsPerFlr = 6;
        ParkingLot first = new ParkingLot("R7303", nFloors, slotsPerFlr);

        int noOfSpots = first.getNoOfOpenSlots("car");
        int noOfSpotstruck = first.getNoOfOpenSlots("truck");
        System.out.println(noOfSpots);
        System.out.println(noOfSpotstruck);

        String ticket1 = first.parkVehicle("car", "78", "blue");
        String ticket2 = first.parkVehicle("truck", "1009", "red");
        String ticket3 = first.parkVehicle("car", "22", "green");

        int noOfSpots1 = first.getNoOfOpenSlots("car");
        int noOfSpotstruck1 = first.getNoOfOpenSlots("truck");


        first.displayOccupiedSlots("car");
        first.displayOccupiedSlots("truck");

        System.out.println("The amount of spaces available for a car is " + noOfSpots1);
        System.out.println("The amount of spaces available for a truck is " + noOfSpotstruck1);

        first.displayOpenSlots("car");
    }
}