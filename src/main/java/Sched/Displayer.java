package Sched;

import client.Canal;
import client.Sensor;
import mi.Update;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class Displayer  implements ObserverOfSensor {
    private static final Logger logger = Logger.getLogger(Displayer.class.getName());

    private Canal canal;
    private Sensor sensor;
    private ScheduledExecutorService scheduledExectorService;

    /**
     * Constructor
     * @param canal
     * @param sensor
     */
    public Displayer( ScheduledExecutorService scheduledExectorService,  Canal canal ,Sensor sensor ){
        this.canal = canal;
        this.sensor = sensor;
        this.scheduledExectorService = scheduledExectorService;
    }

    @Override
    public void update(Sensor s) {

        Integer value = s.getValue();
        System.out.println(toString() + " : " + value);
    }

}
