package o;

import java.util.concurrent.Callable;

final class enqueueBuffer implements Callable {
    private final String getMin;
    private final setConsumerReady length;

    public enqueueBuffer(setConsumerReady setconsumerready, String str) {
        this.length = setconsumerready;
        this.getMin = str;
    }

    public final Object call() {
        return this.length.lambda$getReferralConfig$0(this.getMin);
    }
}
