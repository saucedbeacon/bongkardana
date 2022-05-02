package o;

import java.util.concurrent.Callable;

final class getStartParams implements Callable {
    private final handleMessage setMax;

    public getStartParams(handleMessage handlemessage) {
        this.setMax = handlemessage;
    }

    public final Object call() {
        return this.setMax.lambda$getWhitelistedDevices$23();
    }
}
