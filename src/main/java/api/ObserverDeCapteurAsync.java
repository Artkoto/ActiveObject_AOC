package api;

import api.Capteur;
import api.Future;

public interface ObserverDeCapteurAsync {
    Future update (Capteur s);
}
