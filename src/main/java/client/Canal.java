package client;

import Sched.ObserverOfSensor;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class Canal implements ObserverOfSensorAsync {
    // todo ajout d'attribut

    private ObserverOfSensor observerOfSensor;
    public Canal(ObserverOfSensor observerOfSensor){
        this.observerOfSensor=observerOfSensor;
    }

    @Override
    public Future update(Sensor s) {
        ScheduledExecutorService scheduledExectorService = null;
        return scheduledExectorService.schedule(() -> this.observerOfSensor.update(s), 1000, MILLISECONDS);
    }
}
