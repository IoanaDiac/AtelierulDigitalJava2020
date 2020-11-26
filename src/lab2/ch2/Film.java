package lab2.ch2;

public class Film {
    public Integer anAparitie;
    public String nume;
    public Actor[] actor;

    public Film(Integer anAparitie, String nume, Actor[] actor) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actor = actor;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActor() {
        return actor;
    }
}
