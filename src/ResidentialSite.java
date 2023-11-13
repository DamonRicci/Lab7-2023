public class ResidentialSite extends Site {

    @Override
    public double getTaxAmount() {
        double base = getBaseAmount();
        return base * Site.TAX_RATE * 0.2;
    }
}
