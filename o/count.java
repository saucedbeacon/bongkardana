package o;

import java.util.Map;

final class count implements RedDotDrawable {
    private final waitForSetup getMax;

    public count(waitForSetup waitforsetup) {
        this.getMax = waitforsetup;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$isWhitelistedDevice$0((Map) obj);
    }
}
