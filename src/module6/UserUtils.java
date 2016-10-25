package module6;

public class UserUtils {

    public static User[] uniqueUsers(User[] users){
        for (int i =0; i< users.length; i++){
            for (int j = i+1; j<users.length; j++){
                if (users[i]!=null & users[i].equals(users[j]))
                users[j]=null;
            }
        }
        User[] unique = deleteEmptyUsers(users);
        return unique;
    }
    //users are equal when all their field are equal
    public static User[] usersWithContitionalBalance(User[] users, int balance){
        int count =0;
        for (User user : users){
            if (user.getBalance()==balance)count++;
        }
        User[] uwcb = new User[count];
        count = 0;
        for (User user:users){
            if (user.getBalance()==balance){
                uwcb[count]=user;
                count++;
            }
        }
        return uwcb;
    }
    //user’s balance == balance
    public static User[] paySalaryToUsers(User[] users){
        int userbalance;
        for (User user : users){
            if (user !=null){
                userbalance = user.getBalance() + user.getSalary();
                user.setBalance(userbalance);
            }
        }
        return users;
    }
    public static long[] getUsersId(User[] users){
        long[] userId = new long[users.length];
        for (int i =0;i<users.length; i++){
            if (users[i]!=null){
                userId[i]=users[i].getId();
            }
        }
        return userId;
    }
    public static User[] deleteEmptyUsers(User[] users){
        int count = 0;
        for (User user : users){
            if (user!= null)count++;
        }
        User[] next = new User[count];
        count = 0;
        for (User user : users){
            if (user!=null){
                next[count]=user;
                count++;
            }
        }
        return next;
    }
}
