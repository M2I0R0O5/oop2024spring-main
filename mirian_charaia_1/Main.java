package quizes.q3.mirian_charaia_1;

import java.util.List;

public class  Main {
    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();

        // Create a Person object for yourself
        Person myself = new Person();
        myself.setId("19431115643");
        myself.setName("Mirian");
        myself.setSurname("Tcharaia");

        // Get a list of persons from PersonManager and check-in with one of them
        List<Person> persons = PersonManager.getPersons();
        if (!persons.isEmpty()) {
            Person randomPerson = persons.get(0); // Assuming the first person from the list
            Room room = new Room(101); // Assuming room number is 101
            hotelManager.checkIn(myself, room);
            hotelManager.checkIn(randomPerson, room);
        }

        // Print hotel guests and room information
        hotelManager.displayInfo();
    }
}