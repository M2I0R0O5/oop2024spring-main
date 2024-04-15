package quizes.q3.mirian_charaia_1;

import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private final Map<String, Room> guests;

    public HotelManager() {
        guests = new HashMap<>();
    }

    public void checkIn(Person person, Room room) {
        guests.put(person.getId(), room);
    }

    public void checkOut(Person person) {
        guests.remove(person.getId());
    }

    public void displayInfo() {
        for (Map.Entry<String, Room> entry : guests.entrySet()) {
            String id = entry.getKey();
            Room room = entry.getValue();
            System.out.println("Guest ID: " + id + ", Room Number: " + room.getRoomNumber());
        }
    }
}
