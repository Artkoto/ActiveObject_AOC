package mi;

import Sched.ObserverDeCapteur;
import client.Canal;
import client.Sensor;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;


/**
 * @class Update
 * @author  k.Ougueur
 */
public class Update implements Callable {
    //todo ajout d'attribut

    private ObserverDeCapteur observerDeCapteur;
    private Sensor sensor;

    /**
     * Constructor
     */
    public Update(ObserverDeCapteur observerGenerator, Sensor sensor) {
        this.observerDeCapteur = observerGenerator;
        this.sensor = sensor;
    }

    /**
     * Notify monitor that a new value have generated
     * @return nothing
     */
    @Override
    public Object call() throws Exception {
        this.observerDeCapteur.update(this.sensor);
        ScheduledExecutorService sc;
        sc.schedule(call() -> observerDeCapteur.update(this.sensor), , 1000;)

    }
}
