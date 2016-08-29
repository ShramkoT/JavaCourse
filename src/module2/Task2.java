package module2;

public class Task2 {

    public static void main(String[] args) {
        double balance = 278;
        double withdrawal = 200;
        double commition = withdrawal*0.05;
        double balanceAfter = withdrawBalance(balance, withdrawal, commition);
        if (balanceAfter >= 0){
            System.out.println("OK " + commition + " " + balanceAfter);
        }
        if (balanceAfter < 0) {
            System.out.println("NO");
        }
    }

    static double withdrawBalance(double balance, double withdrawal, double commition){

        return balance - withdrawal - commition;
    }
}
