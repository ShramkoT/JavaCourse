package module7.task4;

import java.util.ArrayList;

public class Controller {

    private ArrayList<API> apiArrayList = new ArrayList<>();

    public Controller(){
        apiArrayList.add(new BookingComAPI());
        apiArrayList.add(new GoogleAPI());
        apiArrayList.add(new TripAdvisorAPI());
    }

    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel){
        ArrayList<Room> foundRooms = new ArrayList<>();
        for (API item : apiArrayList){
            foundRooms.addAll(item.findRooms(price, persons, city, hotel));
        }


        DAOImpl daoImpl = new DAOImpl();
        for (Room room : foundRooms){
            daoImpl.save(room);
        }
        return foundRooms;
    }

     public ArrayList<Room> check(API api1, API api2) {

         ArrayList<Room> roomsFromApi1 = api1.getAllRooms();
         ArrayList<Room> roomsFromApi2 = api2.getAllRooms();
         roomsFromApi1.retainAll(roomsFromApi2);

         return roomsFromApi1;
    }
}
