// roomService.java
package Mess_Services;

import java.util.List;
import Mess_Model.roomModel;
import Mess_Repository.roomRepository;

public class roomService {
    private roomRepository rrepo;

    public roomService(roomRepository rrepo) {
        this.rrepo = rrepo;
    }

    public List<roomModel> getAllRooms() {
        return rrepo.getAllRooms();
    }

    public roomModel getRoomByRoomNo(int roomNo) {
        return rrepo.getRoomByRoomNo(roomNo);
    }
    

    public void displayAvailableRooms() {
        List<roomModel> availableRooms = rrepo.getAllRooms();
        System.out.println("Available Rooms:");
        System.out.println("RoomNo\tType\t\tprice\tAvailable\tRegister_Id");
        for (roomModel room : availableRooms) {
            if (room.isAvailable()) {
                System.out.println(room.getRoomNo() + "\t" + room.getType() + "\t" + room.getPrice() + "\t" + room.isAvailable() + "\t\t\t" + room.getRid());
            }
        }
    }


    public double reserveRoom(String roomCustomerName, int roomNumber) {
        // Check if the customer is registered
        boolean isCustomerRegistered = customerService.isCustomerRegistered(roomCustomerName);
        if (!isCustomerRegistered) {
            System.out.println("Customer '" + roomCustomerName + "' is not registered. Please register first.");
            return 0; // Return 0 indicating no room reservation
        }

        roomModel room = rrepo.getRoomByRoomNo(roomNumber);
        if (room == null) {
            System.out.println("Invalid room number. Please enter a valid room number.");
            return 0; // Return 0 indicating no room reservation
        }

        if (!room.isAvailable()) {
            System.out.println("Room " + roomNumber + " is already reserved.");
            return 0; // Return 0 indicating no room reservation
        }

        // Assuming room rent is based on the room type
        double roomRent = room.getPrice();
        room.setAvailable(false);
        room.setReservedBy(roomCustomerName);
        return roomRent;
    }



}
