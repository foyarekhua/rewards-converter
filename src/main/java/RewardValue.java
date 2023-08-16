public class RewardValue {

    public double rewardsValue;

    public RewardValue(double cashValue) {
        rewardsValue = cashValue;
    }

    public RewardValue(int milesValue) {
        rewardsValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return rewardsValue;
    }

    public int getMilesValue() {
        return (int)(rewardsValue / 0.0035);
    }
}
