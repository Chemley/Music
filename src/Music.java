public abstract class Music {

    private int albums;

    public Music(int albums) {
        this.albums = albums;

    }

    public abstract String getArtist();

    public abstract String getInstruments();

    public int getAlbums(){
        return this.albums;
    }
}
