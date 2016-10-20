package module5;

public class Controller {

    private API apis[] = new API[3];

    public Controller(){
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){
        Room[] foundRooms = new Room[100];
        int count = 0;
        for (int i = 0; i < 3; i++){
            for (Room item : apis[i].findRooms(price, persons, city, hotel)){
                foundRooms[count] = item;
                count++;
            }
        }

        Room[] foundRoomsArray = new Room[count];
        for (int i = 0; i < count; i++){
            foundRoomsArray[i]=foundRooms[i];
        }

        DAOImpl daoImpl = new DAOImpl();
        for (Room room : foundRoomsArray){
            daoImpl.save(room);
        }
        return foundRoomsArray;
    }

     Room[] check(API api1, API api2) {

        Room[] roomsFromApi1 = api1.getAll();
        Room[] roomsFromApi2 = api2.getAll();

         Room[] room = new Room[100];
         int count = 0;
         for (int i = 0; i < roomsFromApi1.length; i++) {
            for (int k = i; k < roomsFromApi1.length; k++) {
                if (roomsFromApi1[i].equals(roomsFromApi2[k])) {
                    room[count] = roomsFromApi1[k];
                    count++;
                }
            }
        }
        return room;
    }
}
