package lab3.Challenge6Builder;

public class Main {
    public static void main(String[] args) {

        Person person= new Person.Builder("Ioana")
                .job("student")
                .university("FIA")
                .drivingLicense(false)
                .build();


    }
}
