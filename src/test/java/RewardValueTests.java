import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 50;
        var rewardValue = new RewardValue(cashValue);

        int MilesValue = rewardValue.getMilesValue();
        int expectedMilesValue = 14285;
        assertEquals(MilesValue, expectedMilesValue);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);

        double cashValue = rewardValue.getCashValue();
        double expectedCashValue = 3.5;
        assertEquals(cashValue, expectedCashValue);
    }
}
