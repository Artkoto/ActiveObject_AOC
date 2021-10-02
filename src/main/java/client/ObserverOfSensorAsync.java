package client;

import java.util.concurrent.Future;

public interface ObserverOfSensorAsync {
    Future update (Sensor s);
    Future<Integer> getValue();
}
