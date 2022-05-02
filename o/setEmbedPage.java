package o;

import java.util.concurrent.Callable;

final class setEmbedPage implements Callable {
    private final addRenderReadyListener length;
    private final String setMax;

    public setEmbedPage(addRenderReadyListener addrenderreadylistener, String str) {
        this.length = addrenderreadylistener;
        this.setMax = str;
    }

    public final Object call() {
        return this.length.lambda$login$7(this.setMax);
    }
}
