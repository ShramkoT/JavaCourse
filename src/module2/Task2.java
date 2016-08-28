package module2;

public class Task2 {


        static double withdrawBalance(double balance, double withdrawal, double commitionFinal) {

            return balance - withdrawal - commitionFinal;
        }
            public static void main(String[] args) {
                double balance = 278;
                double withdrawal1 = 200;
                double withdrawal2 = 300;
                double commition = 0.05;
                double balanceAfter1 = withdrawBalance(balance, withdrawal1, commition);
                double commitionFinal1 = commition * withdrawal1;
                double balanceAfter2 = withdrawBalance(balance, withdrawal2, commition);
                double commitionFinal2 = commition * withdrawal2;

                if (balanceAfter1 >=0){
                    System.out.println("OK " + commitionFinal1 + " " + balanceAfter1);
                }
                else {
                    System.out.println("NO");
                }
                if (balanceAfter2 >=0){
                    System.out.println("OK " + commitionFinal2 + " " + balanceAfter2);
                }
                else {
                    System.out.println("NO");
                }


    }

}
