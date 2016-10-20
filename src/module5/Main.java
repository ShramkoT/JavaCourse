package module5;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.requestRooms(10000, 3, "London", "Hawai" );
        controller.requestRooms(100, 12, "Kyiv", "Hajatt" );
        controller.requestRooms(800, 8, "Madrid", "Real" );

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());
    }
}
