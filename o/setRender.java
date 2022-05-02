package o;

import java.util.concurrent.Callable;

final class setRender implements Callable {
    private final getData length;
    private final String setMax;

    public setRender(getData getdata, String str) {
        this.length = getdata;
        this.setMax = str;
    }

    public final Object call() {
        return this.length.lambda$generateLinkEntityData$13(this.setMax);
    }
}
