package module2;

public class Task3 {
    static double withdrawBalance(double balance, double withdrawal, double commitionFinal) {

        return balance - withdrawal - commitionFinal;
    }

    public static void main(String[] args) {
        int[] balances = {460, 810, 1200, 930, 1830};
        String[] ownerNames = {"Tirion", "Sansa", "Rob", "John", "Deineris"};
        double withdraw = 500;
        double commition = 0.05;
        double commitionFinal = commition * withdraw;
        double balanceAfter1 = withdrawBalance(balances[1], withdraw, commitionFinal);
        double balanceAfter2 = withdrawBalance(balances[0], withdraw, commitionFinal);


            if(balanceAfter1 >= 0) {
                System.out.println(ownerNames[1] + " " + withdraw + " " + balanceAfter1);
            }

            else {
                System.out.println(ownerNames[1] + " " + "NO");
            }

             if(balanceAfter2 >= 0) {
                System.out.println(ownerNames[0] + " " + withdraw + " " + balanceAfter2);
            }

             else {
                System.out.println(ownerNames[0] + " " + "NO");
            }

    }
}
