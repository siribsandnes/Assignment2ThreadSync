package threadSync;

import threadSync.booking.MovieTicketClient;
import threadSync.booking.MovieTicketServer;

public class Main {
    public static void main(String[] args) {
        MovieTicketServer movieTicketServer = new MovieTicketServer(
                "Interstellar",
                10
        );

        // Creating 4 threads
        Thread thread1 = new MovieTicketClient("Heidi", 5, movieTicketServer);
        Thread thread2 = new MovieTicketClient("Kristoffer", 4, movieTicketServer);
        Thread thread3 = new MovieTicketClient("Brigt", 2, movieTicketServer);
        Thread thread4 = new MovieTicketClient("Vetle", 2, movieTicketServer);

        // Starting all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
