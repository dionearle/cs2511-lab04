package unsw.movies;

public class Movie {

    private String title;
    
    private State childrensState;
    private State classicState;
    private State newReleaseState;
    private State regularState;
    
    private State state;

    public Movie(String title) {

        this.title = title;
        this.childrensState = new ChildrensState();
        this.classicState = new ClassicState();
        this.newReleaseState = new NewReleaseState();
        this.regularState = new RegularState();
        
        this.state = newReleaseState;
    }

    public void setState(State arg) {
        state = arg;
    }
    
    public State getChildrensState() {
    	// return a New Release state
    	return childrensState;
	}
    
    public State getNewReleaseState() {
    	// return a New Release state
    	return newReleaseState;
	}
    
    public State getRegularState() {
    	// return a Regular state
    	return regularState;
    }
    
    public State getClassicState() {
    	// return a Classic state
    	return classicState;
	}

    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        return state.getCharge(daysRented);
    }

}