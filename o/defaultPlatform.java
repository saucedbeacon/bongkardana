package o;

public class defaultPlatform extends setSpeed<registerWorker, stopBleScan> {
    public stopBleScan map(registerWorker registerworker) {
        if (registerworker != null) {
            return new stopBleScan(registerworker.getAmount(), registerworker.getCurrency(), registerworker.isPlaceholder());
        }
        return null;
    }
}
