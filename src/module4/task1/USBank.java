package module4.task1;

public class USBank extends Bank {

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency()==Currency.USD) rate = 1;
        else rate = 2;
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
            if (amount < 1000) commission = 6;
            else commission = 8;
        }
        return commission;
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if(getCurrency()==Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if(getCurrency()==Currency.EUR) limit = 10000;
        else  limit = 999999999;
        return limit;
    }
}
