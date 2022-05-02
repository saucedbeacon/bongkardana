package o;

import java.util.concurrent.Callable;
import o.addAnimatorUpdateListener;

final class setMinAndMaxProgress implements Callable {
    private final addAnimatorUpdateListener.getMax getMax;
    private final addAnimatorUpdateListener length;

    public setMinAndMaxProgress(addAnimatorUpdateListener addanimatorupdatelistener, addAnimatorUpdateListener.getMax getmax) {
        this.length = addanimatorupdatelistener;
        this.getMax = getmax;
    }

    public final Object call() {
        return this.length.lambda$wrapper$0(this.getMax);
    }
}
