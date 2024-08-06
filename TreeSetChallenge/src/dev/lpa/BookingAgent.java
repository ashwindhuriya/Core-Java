package dev.lpa;

public class BookingAgent {
    public static void main(String[] args) {
        int rows = 10;
        int totalSeats = 100;
        Theater rodgersNYC = new Theater("Richard Rodgers", rows, totalSeats);
        rodgersNYC.printSeatMap();
        bookSeat(rodgersNYC, 'A', 3);

        bookSeats(rodgersNYC, 4, 'B', 3, 10);
        bookSeats(rodgersNYC, 9, 'C', 1, 10);
    }

    public static void bookSeat(Theater theater, char row, int seatNo) {
        String seat = theater.reserveSeat(row, seatNo);
        if(seat != null) {
            System.out.println("Congratulations! Your reserved seat is " + seat);
            theater.printSeatMap();
        } else {
            System.out.println("Sorry! unable to reserve " + row + seatNo);
        }
    }

    private static void bookSeats(Theater theater, int tickets, char minRow, int minSeat, int maxSeat) {
        bookSeats(theater, tickets, minRow, minRow, minSeat, maxSeat);
    }

    public static void bookSeats(Theater theater, int tickets, char minRow, char maxRow, int minSeat, int maxSeat) {
        var seats = theater.reserveSeats(tickets, minRow, maxRow, minSeat, maxSeat);

        if(seats != null) {
            System.out.println("Congratulations! Your reserved seat is " + seats);
            theater.printSeatMap();
        } else {
            System.out.println("Sorry! No matching contigious seats in rows: " + minRow + " - " + maxRow);
        }
    }
}
