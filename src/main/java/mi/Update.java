package mi;

import Sched.ObserverOfSensor;
import client.Sensor;
import client.SensorImpl;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

import static java.util.concurrent.TimeUnit.*;


/**
 * @class Update
 * @author  k.Ougueur
 */
public class Update implements Callable {
    private static final Logger logger = Logger.getLogger(Update.class.getName());


    private ObserverOfSensor observerDeSensor;
    private Sensor sensor;

    /**
     * Constructor
     */
    public Update(ObserverOfSensor observerGenerator, Sensor sensor) {
        this.observerDeSensor = observerGenerator;
        this.sensor = sensor;
    }

    /**
     * Notify monitor that a new value have generated
     * @return nothing
     */
    @Override
    public Future call() throws Exception {

        ScheduledExecutorService scheduledExectorService = null;
        return scheduledExectorService.schedule(() -> observerDeSensor.update(sensor), 1000, MILLISECONDS);

    }
}
