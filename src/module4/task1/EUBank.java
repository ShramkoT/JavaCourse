package module4.task1;

public class EUBank extends Bank {

    @Override

    int getLimitOfWithdrawal() {
        int limit;
        if(getCurrency()==Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if(getCurrency()==Currency.EUR) limit = 20000;
        else  limit = 10000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency()==Currency.USD) rate = 0;
        else rate = 1;
        return rate;
    }

    @Override
    int getCommission(int amount) {
        int commission;
        if (getCurrency()==Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        }
        else {
            if (amount < 1000) commission = 2;
            else commission = 4;
        }
        return commission;
    }
}
