package quizes.q3.mirian_charaia_1;

public class Room {
        private int roomNumber;
        private Person guest;

        public Room(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public Person getGuest() {
            return guest;
        }

        public void setGuest(Person guest) {
            this.guest = guest;
        }
}
