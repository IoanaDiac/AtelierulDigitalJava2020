package lab2.ch2;

public class Studio {
    public String nume;
    public Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public int nrFilme(){
        return filme.length;
    }
}
