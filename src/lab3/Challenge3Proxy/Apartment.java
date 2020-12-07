package lab3.Challenge3Proxy;

public class Apartment {
    private String location;
    private int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment in "+location+ ", with cost/month "+monthlyRentCost;
    }
}
