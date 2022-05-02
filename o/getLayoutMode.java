package o;

import java.util.concurrent.Callable;

final class getLayoutMode implements Callable {
    private final getFrameMarginVertical$core getMax;
    private final long length;

    public getLayoutMode(getFrameMarginVertical$core getframemarginvertical_core, long j) {
        this.getMax = getframemarginvertical_core;
        this.length = j;
    }

    public final Object call() {
        return this.getMax.lambda$saveLastUpdatedTimeUserPan$11(this.length);
    }
}
