public class Prince extends Artist {

    public Prince() {
        super(false, 8, "Prince", Venue.STADIUM, Genre.RNB);
    }

    @Override
    public String getPrep(){
        return "Must have purp";
    };

    @Override
    public String getGreenRoom(){
        return "Pancakes";
    }

}
