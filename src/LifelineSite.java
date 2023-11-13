public class LifelineSite extends Site {

    public double getBaseAmount() {
        return _units * _rate;
    }

    public double getTaxAmount() {
        double base = getBaseAmount();
        return base * Site.TAX_RATE;
    }

    @Override
    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
