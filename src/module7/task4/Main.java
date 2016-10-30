package module7.task4;

import Test.Array;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        ArrayList<Room> request1 = controller.requestRooms(10000, 3, "London", "Hawai" );
        ArrayList<Room> request2 = controller.requestRooms(100, 12, "Kyiv", "Hajatt" );
        ArrayList<Room> request3 = controller.requestRooms(800, 8, "Madrid", "Real" );

        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());
        controller.check(new BookingComAPI(), new GoogleAPI());

        System.out.println(request1 + "\n" + request2 + "\n" + request3);

        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new BookingComAPI();

        ArrayList<Room> check1 = controller.check(api1, api2);
        ArrayList<Room> check2 = controller.check(api2, api3);
        ArrayList<Room> check3 = controller.check(api3, api1);

        System.out.println(check1 + "\n" + check2 + "\n" + check3);


    }
}
