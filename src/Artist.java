public abstract class Artist {

    private String name;
    private int instruments;
    private boolean tour;
    private Venue venue;
    private Genre genre;

    public Artist(boolean tour, int instruments, String name, Venue venue, Genre genre) {
        this.tour = tour;
        this.instruments = instruments;
        this.name = name;
        this.venue = venue;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getInstruments() {
        return instruments;
    }

    public abstract String getPrep();

    public abstract String getGreenRoom();


    public Venue getVenue() {
        return this.venue;
    }

    public Genre getGenre(){
        return this.genre;
    }
}
