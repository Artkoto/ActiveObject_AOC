package client;

import Sched.ObserverOfSensor;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class Canal implements ObserverOfSensorAsync {
    private static final Logger logger = Logger.getLogger(Canal.class.getName());


    private ObserverOfSensor observerOfSensor;
    private ScheduledExecutorService scheduledExectorService;

    public Canal(ScheduledExecutorService scheduledExectorService, ObserverOfSensor observerOfSensor){
        this.scheduledExectorService= scheduledExectorService;
        this.observerOfSensor = observerOfSensor;
    }

    @Override
    public Future update(Sensor s) {
        return this.scheduledExectorService.schedule(() -> this.observerOfSensor.update(s), 1000, MILLISECONDS);
    }

    @Override
    public Future<Integer> getValue(){
        return  this.scheduledExectorService.schedule(()-> getValue().get(), 1000, MILLISECONDS);
    }

}
