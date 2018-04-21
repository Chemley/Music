public abstract class Artist {


    private String name;
    private int instruments;
    private boolean tour;

    public Artist(boolean tour, int instruments, String name) {
        this.tour = tour;
        this.instruments = instruments;
        this.name = name;
    }

}
