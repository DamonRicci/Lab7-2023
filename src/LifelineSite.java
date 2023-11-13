public class LifelineSite extends Site {

    @Override
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
