package client;

import Sched.ObserverDeCapteur;

public interface Sensor {

    void attach (ObserverDeCapteur o);
    Integer getValue();
    void tick();
}
