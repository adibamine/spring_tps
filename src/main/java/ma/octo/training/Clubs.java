package ma.octo.training;

public enum Clubs {

    MANCHESTER_UNITED("Manchester United"), REAL_MADRID("Real Madrid"), BARCELONE("Fc Barcelone"),
    LIVERPOOL("Liverpool"), CHELSEA("Chelsea"), PSG("Paris Saing-Germain"), MANCHESTER_CITY("Manchester City");
    private String label;


    Clubs(String label) {
        this.label = label;
    }

}
