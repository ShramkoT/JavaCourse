package module4.task1;

public class ChinaBank extends Bank {

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if(getCurrency()==Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if(getCurrency()==Currency.EUR) limit = 5000;
        else  limit = 10000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency()==Currency.USD) rate = 1;
        else rate = 0;
        return rate;
    }

    @Override
    int getCommission(int amount) {
        int commission;
        if (getCurrency()==Currency.USD) {
            if (amount < 1000) commission = 3;
            else commission = 5;
        }
        else {
            if (amount < 1000) commission = 10;
            else commission = 11;
        }
        return commission;
    }
}
