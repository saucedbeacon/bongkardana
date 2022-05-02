package o;

import java.util.concurrent.Callable;

final class setPageURI implements Callable {
    private final addRenderReadyListener getMax;
    private final String length;
    private final String setMax;

    public setPageURI(addRenderReadyListener addrenderreadylistener, String str, String str2) {
        this.getMax = addrenderreadylistener;
        this.setMax = str;
        this.length = str2;
    }

    public final Object call() {
        return this.getMax.lambda$completeRegistration$4(this.setMax, this.length);
    }
}
