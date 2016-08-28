package module2;

public class Task4 {
    static int fundBalance(int balance, int fund) {

        return balance + fund ;
    }

    public static void main(String[] args) {
        int[] balances = {460, 810, 1200, 930, 1830};
        String[] ownerNames = {"Tirion", "Sansa", "Rob", "John", "Deineris"};
        int fund = 300;
        int balanceAfter = fundBalance(balances[4], fund);

        if(balanceAfter >= 0) {
            System.out.println(ownerNames[4] + " " + balanceAfter);
        }

    }
}
