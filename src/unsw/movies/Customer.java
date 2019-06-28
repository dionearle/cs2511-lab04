package unsw.movies;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        double totalAmount = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental r : rentals) {
            // show figures for this rental
            result += "\t" + r.getMovie().getTitle() + "\t" + r.getCharge() + "\n";
            totalAmount += r.getCharge();

        }

        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        return result;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Mary Jane Watson");
        
        // Example where someone rents a new release 
        // (initial state)
        Movie m = new Movie("Gone with the wind");
        Rental r = new Rental(m, 3);
        c1.addRental(r);
        
        // Example where they rent a regular movie 
        // (might transition after a month)
        Movie m2 = new Movie("Inception");
        m2.setState(m2.getRegularState());
        Rental r2 = new Rental(m2, 3);
        c1.addRental(r2);
        
        
        // Example where they rent a children's movie
        // (transitions in similar way to regular yet is
        // categorised for children)
        Movie m3 = new Movie("Finding Nemo");
        m3.setState(m3.getChildrensState());
        Rental r3 = new Rental(m3, 3);
        c1.addRental(r3);
        
        // Example where they rent a classic movie
        // (transitions after 10 years and given average
        // rating is above 8)
        Movie m4 = new Movie("Kill Bill");
        m4.setState(m4.getClassicState());
        Rental r4 = new Rental(m4, 3);
        c1.addRental(r4);

        System.out.println(c1.statement());

    }
}
