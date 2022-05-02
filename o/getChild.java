package o;

import java.util.concurrent.Callable;

final class getChild implements Callable {
    private final peekChild getMax;
    private final boolean setMin;

    public getChild(peekChild peekchild, boolean z) {
        this.getMax = peekchild;
        this.setMin = z;
    }

    public final Object call() {
        return this.getMax.lambda$getDeepLinkPayload$0(this.setMin);
    }
}
