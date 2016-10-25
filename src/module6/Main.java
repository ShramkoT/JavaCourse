package module6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        User[] all = new User[4];
        all[0] = new User(1, "Peter", "Obama", 1000, 0);
        all[1]= new User(3, "Victor", "Klien", 2000, 1000);
        all[2] = new User(5, "Jimmy", "Byr", 13000, 23000);
        all[3] = new User(5, "Jimmy", "Byr", 13000, 23000);


        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(all, 1000)));
        System.out.println(Arrays.toString(UserUtils.uniqueUsers(all)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(all)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(all)));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(all)));

    }
}
