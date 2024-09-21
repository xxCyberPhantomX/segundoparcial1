package proyect.segundoparcial.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class Database {
private static Database instance;
private List<Reservation> reservations;

private Database() {
reservations = new ArrayList<>();
}

    public static Database getInstance() {
    if (instance == null) {
    instance = new Database();
    }
    return instance;
    }

    public void addReservation(Reservation reservation) {
    reservations.add(reservation);
    }

    public List<Reservation> getReservations() {
    return reservations;
    }
}
