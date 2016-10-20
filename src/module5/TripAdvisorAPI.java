package module5;

import java.util.Date;

public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room room1 = new Room(123, 10000, 3, new Date(10122016), "Hawai", "London");
        rooms[0] = room1;
        Room room2 = new Room(1252, 100, 12, new Date(10132016), "Hajatt", "Kyiv");
        rooms[1] = room2;
        Room room3 = new Room(512, 200, 44, new Date(10142016), "Leblu", "Paris");
        rooms[2] = room3;
        Room room4 = new Room(1241224, 800, 8, new Date(10152016), "Real", "Madrid");
        rooms[3] = room4;
        Room room5 = new Room(2342, 1300, 33, new Date(10162016), "Romul", "Rome");
        rooms[4] = room5;
        rooms = new Room[] {room1, room2, room3, room4, room5};
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] foundroomsTemp =new Room[100];
        int count =0;
        for ( Room room : rooms){
            if ((room.getPrice() == price) && (room.getPersons()==persons)&& (room.getCityName().equals(city)&& (room.getHotelName().equals(hotel)))){
                foundroomsTemp[count]=room;
                count++;
            }
        }
        Room[] foundroomsarray = new Room[count];
        for (int i=0; i<count; i++){
            foundroomsarray[i]=foundroomsTemp[i];
        }

        return foundroomsarray;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
