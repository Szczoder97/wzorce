package Observer;

import java.util.ArrayList;
import java.util.List;

public class MoonStation implements IObservable {

    private List<IObserver> observers = new ArrayList<IObserver>();

    private Coordinates spaceObjectCoordinates = new Coordinates(324,22,43);

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (var observer : observers) {
            observer.update();
        }
    }
    public String getSpaceObjectCoordinates() {
        return spaceObjectCoordinates.toString();
    }
}
