package ru.itpark;

public class CashBackService {
    public int calculateCashback(int amountOrdinary, int amountIncreased, int amountSpecial) {
        int cashbackLimit = 3000;
        int cashbackPercentOrdinary = 1;
        int cashbackPercentIncreased = 5;
        int cashbackPercentSpecial = 30;

        int bonus = (amountOrdinary * cashbackPercentOrdinary + amountIncreased * cashbackPercentIncreased + amountSpecial * cashbackPercentSpecial) / 100;

        if (bonus > cashbackLimit) {
            return cashbackLimit;
        }

        return bonus;
    }

}
