package module4.task1;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission = userBank.getCommission(amount)/100;
        if (userBank.getLimitOfWithdrawal()>=amount + amount*commission){
            double newBalance = user.getBalance() - amount -amount*commission;
            user.setBalance(newBalance);
        }

    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        int limit = userBank.getLimitOfFunding();
        if (userBank.getLimitOfFunding()<=limit){
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank = fromUser.getBank();
        double commission = userBank.getCommission(amount)*0.01;
        if (fromUser.getBalance()>= amount + amount*commission){
            double newBalance = fromUser.getBalance() - amount - amount*commission;
            fromUser.setBalance(newBalance);

        }
        else System.out.println("no money");

        double newBalance2 = toUser.getBalance() + amount;
        toUser.setBalance(newBalance2);


    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        double commission = userBank.getMonthlyRate()* user.getSalary()*0.2;
        double newBalance = user.getBalance()+user.getSalary()+commission;
        user.setBalance(newBalance);

    }
}
