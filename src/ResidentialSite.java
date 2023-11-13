public class ResidentialSite extends Site {

    @Override
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax = base * TAX_RATE * 0.2;
        return base + tax;
    }
}
