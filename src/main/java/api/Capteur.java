package api;

public interface Capteur {
    void attach (ObserverDeCapteur o);
    Integer getValue();
    void tick();
}
