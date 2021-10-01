package client;

import Sched.ObserverOfSensor;

import java.util.ArrayList;
import java.util.List;

public class SensorImpl implements Sensor {
//    TODO ajout d'attributs

    private int increment;
    private Integer value;
    private List<ObserverOfSensor> observers = new ArrayList<>();

    /**
     * Construtor
     */
    public SensorImpl(){

    }

    /**
     * Constructor
     * @param increment
     * @param v
     * @param observers
     */
    public SensorImpl(int increment, Integer v, List<ObserverOfSensor> observers ){
        this.value=v;
        this.increment=increment;
        this.observers=observers;
    }
    /**
     *
     */
    @Override
    public void attach(ObserverOfSensor o) {
        this.observers.add(o);

    }

    @Override
    public void detach(ObserverOfSensor o) {
        this.observers.remove(o);
    }

    /**
     * @return
     */
    @Override
    public Integer getValue() {
        return this.value;
    }

    /**
     *
     */
    @Override
    public void tick() {
        this.increment += 1;
    }
}
