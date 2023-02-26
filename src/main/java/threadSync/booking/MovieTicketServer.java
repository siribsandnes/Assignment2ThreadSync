package threadSync.booking;

public class MovieTicketServer {

    private int availableSeats;
    private String movieName;


    public MovieTicketServer(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    synchronized void bookTicket(String customerName, int numberOfSeats) {
        System.out.println("Hi," + customerName + " : " + this.availableSeats + " : Seats available for " + this.movieName);

        if ((this.availableSeats - numberOfSeats) < 0) {
            System.out.println("Hi," + customerName + " : Seats not available for " + this.movieName);
        } else {
            this.availableSeats = this.availableSeats - numberOfSeats;
            System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for" + this.movieName);
        }
    }
}
