package implementation;

import api.MethodInvocation;
import api.ObserverDeCapteur;

public class Update implements MethodInvocation<Void> {
    //callable<void>
    //todo ajout d'attribut
    private ObserverDeCapteur obs ;
    private CapteurImpl subObject;

    public Void call(){
        obs.update(subObject);
        return null;
    };
}
