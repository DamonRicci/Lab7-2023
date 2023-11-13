public class Main {
    public static void main(String[] args) {
        // Create an instance of ResidentialSite
        ResidentialSite residentialSite = new ResidentialSite();
        residentialSite._units = 5;
        residentialSite._rate = 10.0;

        // Create an instance of LifelineSite
        LifelineSite lifelineSite = new LifelineSite();
        lifelineSite._units = 5;
        lifelineSite._rate = 10.0;

        // Calculate and print the billable amount for a residential site
        double residentialBillable = residentialSite.getBillableAmount();
        System.out.println("Residential Site Billable Amount: " + residentialBillable);

        // Calculate and print the billable amount for a lifeline site
        double lifelineBillable = lifelineSite.getBillableAmount();
        System.out.println("Lifeline Site Billable Amount: " + lifelineBillable);
    }
}
