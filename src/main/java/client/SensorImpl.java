package client;

import Sched.ObserverOfSensor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class SensorImpl implements Sensor {
    private static final Logger logger = Logger.getLogger(SensorImpl.class.getName());

    //    TODO ajout d'attributs

    private Integer value;
    private List<ObserverOfSensor> observers = new ArrayList<>();
    /**
     * Construtor
     */
    public SensorImpl(){

    }

    /**
     * Constructor
     * @param v
     * @param observers
     */
    public SensorImpl(Integer v, List<ObserverOfSensor> observers ){
        this.value=v;
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
        return value;
    }

    /**
     *
     */
    @Override
    public void tick() {
        notifyObservers();
        this.value++;
    }

    public void notifyObservers(){
        for( ObserverOfSensor ob : this.observers){
            ob.update(this);
        }
    }
}
