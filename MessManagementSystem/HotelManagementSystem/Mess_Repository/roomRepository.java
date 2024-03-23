// roomRepository.java
package Mess_Repository;

import java.util.ArrayList;
import java.util.List;
import Mess_Model.roomModel;

public class roomRepository {
    private ArrayList<roomModel> rooms;

    public roomRepository() {
        rooms = new ArrayList<>();
        // Add sample rooms
        rooms.add(new roomModel(101, "single Ac", 100.0, "", true));
        rooms.add(new roomModel(102, "double Ac", 150.0, "", true));
        rooms.add(new roomModel(103, "single   ", 75.0, "", true));
        rooms.add(new roomModel(104, "double   ", 100.0, "", true));
        rooms.add(new roomModel(105, "TrippleAc", 200.0, "", true));
        rooms.add(new roomModel(106, "Tripple ", 150.0, "", true));
        rooms.add(new roomModel(107, "Hall    ", 300.0, "", true));
    }

    public List<roomModel> getAllRooms() {
        return rooms;
    }


    public roomModel getRoomByRoomNo(int roomNo) {
        for (roomModel room : rooms) {
            if (room.getRoomNo() == roomNo) {
                return room;
            }
        }
        return null; // If room with given room number is not found
    }

    public void addRoom(roomModel room) {
        rooms.add(room);
    }



    // Method to reserve a room by a customer
    public void reserveRoom(String customerName, int roomNumber) {
        roomModel room = getRoomByRoomNo(roomNumber);
        if (room != null) {
            room.setReservedBy(customerName);
        }
    }
}
