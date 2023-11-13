public class ResidentialSite extends Site {

    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    public double getTaxAmount() {
        double base = getBaseAmount();
        return base * Site.TAX_RATE * 0.2;
    }

    @Override
    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
}
