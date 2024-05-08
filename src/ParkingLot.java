import java.util.List;
import java.util.ArrayList;

public class ParkingLot {
    String parkingLotId;
//    int nfloors;
//    int noOfSlotsPerFlr;
    List<List<Slot>> slots;

    // parking lot constructor
    public ParkingLot(String parkingLotId, int nfloors, int noOfSlotsPerFlr) {
        this.parkingLotId = parkingLotId;
        slots = new ArrayList<>();

        for(int i = 0; i < nfloors; i++) {
            slots.add(new ArrayList<>());
            List<Slot> floorSlots = slots.get(i);
            floorSlots.add(new Slot("truck"));
            floorSlots.add(new Slot("bike"));
            floorSlots.add(new Slot("bike"));

            for(int j = 3; j < noOfSlotsPerFlr; j++) {
                slots.get(i).add(new Slot("car"));
            }
        }
    }

    private String generateTicketId(int flr, int slno) {
        return parkingLotId + "_" + flr + "_" +slno;
    }

    public String parkVehicle(String type, String regNo, String color) {
        Vehicle vehicle = new Vehicle(type, regNo, color);

        try {
            for (int i = 0; i < slots.size(); i++) {
                for (int j = 0; j < slots.get(i).size(); j++) {
                    Slot slot = slots.get(i).get(j);

                    if (slot.type == type && slot.vehicle == null) {

                        slot.vehicle = vehicle;
                        slot.ticketId = generateTicketId(i + 1, j + 1);
                        return slot.ticketId;
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("There was an error!");
            return null;
        }
        System.out.println("No slot available for given type");
        return null;
    }

    public void unPark(String ticketId) {

    }
    // getter for parking lot id
//    public String getId() {
//        return parkingLotId;
//    }
//
//    //getter for number of parking stalls per floor
//    public int getNoOfSlotsPerFlr() {
//        return noOfSlotsPerFlr;
//
//    }
//
//    // getter for number of floors
//    public int getNfloors() {
//        return nfloors;
//    }

//    slots = new ArrayList<>();
//        for (int i = 0; i < nfloors; i++) {
//        slots.add(new ArrayList<>());
//        List<Slot> floorSlots = slots.get(i);
//        floorSlots.add(new Slot("truck"));
//        floorSlots.add(new Slot("bike"));
//        floorSlots.add(new Slot("bike"));
//
//        for (int j = 3; j < noOfSlotsPerFlr; j++) {
//            slots.get(i).add(new Slot("car"));
//        }
//    }
}
