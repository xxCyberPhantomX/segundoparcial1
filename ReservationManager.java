package proyect.segundoparcial.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
private List<Observer> observers = new ArrayList<>();

public void addObserver(observer observer) {
observers.add(observer);
    }

public void removeObserver(Observer observer) {
observers.remove(observer);
    }

public void notifyObservers() {
for (Observer observer : observers) {
observer.update();
        }
    }

public void addReservation(Reservation reservation) {
Database.getInstance().addReservation(reservation);
notifyObservers();
    }
}
