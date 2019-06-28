package unsw.movies;

public class NewReleaseState implements State {

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

}
