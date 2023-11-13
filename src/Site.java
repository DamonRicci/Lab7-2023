public class Site {
    protected int _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public double getBillableAmount() {
        // This method will be overridden in subclasses.
        return 0.0;
    }
}
