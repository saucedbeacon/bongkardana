package o;

import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class changeToState extends AtomicReference<setShowRedPoint> implements GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = 5718521705281392066L;

    public changeToState(setShowRedPoint setshowredpoint) {
        super(setshowredpoint);
    }

    public final boolean isDisposed() {
        return get() == null;
    }

    public final void dispose() {
        setShowRedPoint setshowredpoint;
        if (get() != null && (setshowredpoint = (setShowRedPoint) getAndSet((Object) null)) != null) {
            try {
                setshowredpoint.getMin();
            } catch (Exception e) {
                registerNode.getMax(e);
                SecuritySignature.getMax((Throwable) e);
            }
        }
    }
}
