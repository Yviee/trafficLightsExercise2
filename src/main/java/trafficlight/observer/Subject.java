package trafficlight.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    // Define an traffic light.observer set to store all traffic light.observer objects
    private List <Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    };

    public void removeObserver(Observer observer){
        observers.remove(observer);
    };

    public void notifyObserver(){
        for (Observer obs:observers) {
            obs.update();
        }
    };
}