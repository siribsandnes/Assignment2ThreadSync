package threadSync.booking;

public class MovieTicketClient extends Thread{
    private String customerName;

    private int numberOfTickets;
    private MovieTicketServer movieTicketServer;




    public MovieTicketClient(String customerName, int numberOfTickets, MovieTicketServer movieTicketServer) {
        this.customerName = customerName;
        this.numberOfTickets= numberOfTickets;
        this.movieTicketServer = movieTicketServer;
    }

    public void run() {
        movieTicketServer.bookTicket(customerName, numberOfTickets);
    }
}
