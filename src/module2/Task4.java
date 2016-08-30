package module2;

public class Task4 {
    static int[] balances = {460, 810, 1200, 930, 1830};
    static String[] ownerNames = {"Tirion", "Sansa", "Rob", "John", "Deineris"};

    static int fundBalance(String name, int fund) {
        int n = 0;
        for (int i = 0; i<ownerNames.length; i++) {
            if (name == ownerNames[i]){
                n =i;
                break;
            }
        }
        balances[n]=balances[n] + fund;
        return n;
    }

    public static void main(String[] args) {
        int n = fundBalance("Rob", 400);
        System.out.println(ownerNames[n] + " " + balances[n]);
        }
}
