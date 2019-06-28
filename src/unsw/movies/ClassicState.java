package unsw.movies;

public class ClassicState implements State {

    @Override
    public double getCharge(int daysRented) {
    	
    	int charge = 2;
    	if (charge > 5) {
    		
    		charge += daysRented - 5; 
    	}

    	return charge;
    }

}
