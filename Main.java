package proyect.segundoparcial.hotelmanagement;

public class Main {
    public static void main(String[] args) {
        ReservationManager manager = new ReservationManager();
        ReservationView view = new ReservationView();

        manager.addObserver(view);

        Reservation reservation = new Reservation();
        manager.addReservation(reservation);
    }
}
