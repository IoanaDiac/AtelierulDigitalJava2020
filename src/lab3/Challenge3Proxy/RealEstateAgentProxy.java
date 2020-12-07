package lab3.Challenge3Proxy;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    private ArrayList<Apartment> apartments = new ArrayList<Apartment>();

    public void represent(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public Apartment rent(Student student) {
        for (int i = 0; i < apartments.size(); i++) {
            if (student.getMoney() >= apartments.get(i).getMonthlyRentCost()) {
                if (String.valueOf(student.getName().charAt(0)).equals("P")) {
                    return null;
                }
                return apartments.get(i);
            }
        }
        return null;
    }
}
