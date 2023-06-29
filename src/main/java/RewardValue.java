public class RewardValue {
    private Double cashValue;
    private int milesValue;

    public RewardValue(Double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public Double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private int cashToMiles(double cash) {
        return (int) (cash / 0.0035);
    }

    private double milesToCash(int miles) {
        return miles * 0.0035;
    }
}
