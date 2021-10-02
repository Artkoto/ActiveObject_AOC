package client;

import Sched.ObserverOfSensor;

import java.util.concurrent.Future;

public interface Sensor {

    void attach (ObserverOfSensor o);
    void detach (ObserverOfSensor o);
    Integer getValue();
    void tick();
}
