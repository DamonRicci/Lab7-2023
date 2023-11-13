public abstract class Site {
    protected int _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public double getBaseAmount() {
        // Assuming the same base calculation for all sites for now
        return _units * _rate * 0.5;
    }

    public abstract double getTaxAmount();

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
