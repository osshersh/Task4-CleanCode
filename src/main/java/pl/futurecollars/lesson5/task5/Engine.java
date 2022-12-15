package pl.futurecollars.lesson5.task5;

public class Engine {
    private boolean started;

    public void start() {
        if (!started) {
            started = true;
        }
    }

    public void stop() {
        if (started) {
            started = false;
        }
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean engineStarted) {
        this.started = engineStarted;
    }
}
