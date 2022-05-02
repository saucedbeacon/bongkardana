package o;

import java.util.concurrent.Callable;

final class offer implements Callable {
    private final poll setMin;

    public offer(poll poll) {
        this.setMin = poll;
    }

    public final Object call() {
        return this.setMin.lambda$getReferralWidgets$0();
    }
}
