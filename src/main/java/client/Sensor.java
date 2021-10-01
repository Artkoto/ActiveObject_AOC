package client;

import Sched.ObserverOfSensor;

public interface Sensor {

    void attach (ObserverOfSensor o);
    void detach (ObserverOfSensor o);
    Integer getValue();
    void tick();
}
