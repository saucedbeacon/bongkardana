package o;

import java.util.concurrent.Callable;

final class getSceneParams implements Callable {
    private final handleMessage getMin;

    public getSceneParams(handleMessage handlemessage) {
        this.getMin = handlemessage;
    }

    public final Object call() {
        return this.getMin.lambda$getPromoCenterConfig$26();
    }
}
