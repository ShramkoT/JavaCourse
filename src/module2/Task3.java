package module2;

public class Task3 {

    static double[] balances = {460, 810, 1200, 930, 1830};
    static String[] ownerNames = {"Tirion", "Sansa", "Rob", "John", "Deineris"};
    static double commition = 0.05;

    static void withdrawBalance(String name, double fund) {
        int n = 0;
        for (int i = 0; i<ownerNames.length; i++) {
            if (name == ownerNames[i]){
                n =i;
                break;
            }
        }
        double d = balances[n] - fund*commition - fund;
        if (d >= 0){
            balances[n] = d;
            System.out.println(ownerNames[n] + " " + fund*commition + " " + balances[n]);
        }
        else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        withdrawBalance("John", 600);
    }
}
