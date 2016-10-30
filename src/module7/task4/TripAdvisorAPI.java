package module7.task4;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {

    private ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(123, 10000, 3, new Date(10122016), "Hawai", "London"));
        rooms.add(new Room(1252, 100, 12, new Date(10132016), "Hajatt", "Kyiv"));
        rooms.add(new Room(512, 200, 44, new Date(10142016), "Leblu", "Paris"));
        rooms.add(new Room(1241224, 800, 8, new Date(10152016), "Real", "Madrid"));
        rooms.add(new Room(2342, 1300, 33, new Date(10162016), "Romul", "Rome"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> foundroomsTemp =new ArrayList<>();
        int count =0;
        for ( Room room : rooms){
            if ((room.getPrice() == price) && (room.getPersons()==persons)&& (room.getCityName().equals(city)&& (room.getHotelName().equals(hotel)))){
                foundroomsTemp.add(room);
            }
        }
        return foundroomsTemp;
    }

    @Override
    public ArrayList<Room> getAllRooms() {
        return rooms;
    }
}
