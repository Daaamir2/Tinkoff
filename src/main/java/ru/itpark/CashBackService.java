package ru.itpark;

public class CashBackService {
    public int calculateCashback(int amountOrdinary, int amountIncreased, int amountSpecial) {
        int cashbackLimit = 3000;
        int bonus;
        int cashbackPercentOrdinary = 1;
        int cashbackPercentIncreased = 5;
        int cashbackPercentSpecial = 30;

        bonus = (amountOrdinary * cashbackPercentOrdinary + amountIncreased * cashbackPercentIncreased + amountSpecial * cashbackPercentSpecial) / 100;

        if (bonus < cashbackLimit) {
            return bonus;
        } else {
            return cashbackLimit;
        }
    }

}
