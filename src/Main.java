

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

        first.displayOccupiedSlots("car");
        first.displayOccupiedSlots("truck");
    }
}