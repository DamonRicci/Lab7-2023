public class LifelineSite extends Site {

    @Override
    public double getBaseAmount() {
        return _units * _rate; // If different from the Site's getBaseAmount
    }

    @Override
    public double getTaxAmount() {
        double base = getBaseAmount();
        return base * Site.TAX_RATE;
    }
}
