import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String state;
    private List<Observer> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }

    public void register(Observer obs) {
        observers.add(obs);
    }

    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(state, id);
        }
    }
}
