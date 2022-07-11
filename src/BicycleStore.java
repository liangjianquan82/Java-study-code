import store.Store1;

public class BicycleStore extends Store1 {
    private int NbOfBrands;
    private String sponsor;
    private boolean issponsors;

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsors(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getNbOfBrands() {
        return NbOfBrands;
    }

    public void setNbOfBrands(int nbOfBrands) {
        NbOfBrands = nbOfBrands;
    }

    public boolean getisIssponsors() {
        return issponsors;
    }

    public void setIssponsors(boolean issponsors) {
        this.issponsors = issponsors;
    }

    public BicycleStore(String name, String sponsors, int NbOfBrands) {
        super(name);
        this.sponsor = sponsors;
        this.NbOfBrands = NbOfBrands;
    }

    public void BicycleStore() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void setInfo() {
        if (this.sponsor != null && this.NbOfBrands != 0) {
            System.out.println("Bike Shop " + toString());
            System.out.println("Sponsors club: " + this.sponsor);
            System.out.println("Number of titles: " + this.NbOfBrands);
        } else System.out.println("No record to show.\nRun again.");
    }

    void getInfo() {
        System.out.println("The bike store name: " + super.getName() +
                "\nThe shop sponsor a bike club: " + getSponsor() +
                "\nThe number of bike brands: " + getNbOfBrands());
    }
}
