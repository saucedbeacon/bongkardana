package o;

import java.util.concurrent.Callable;

final class restart implements Callable {
    private final handleMessage setMax;

    public restart(handleMessage handlemessage) {
        this.setMax = handlemessage;
    }

    public final Object call() {
        return this.setMax.lambda$getReferralPageConfig$15();
    }
}
