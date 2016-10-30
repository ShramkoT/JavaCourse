package module7.task4;

public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println(room.getHotelName() + "saved");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.getHotelName() + "deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.getHotelName() + "updated");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Room ID - " + id);
        return null;
    }

}
