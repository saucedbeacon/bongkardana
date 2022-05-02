package o;

import java.util.concurrent.Callable;

final class isUseForEmbed implements Callable {
    private final addRenderReadyListener setMax;

    public isUseForEmbed(addRenderReadyListener addrenderreadylistener) {
        this.setMax = addrenderreadylistener;
    }

    public final Object call() {
        return this.setMax.lambda$initSession$2();
    }
}
