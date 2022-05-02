package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

public final class onGenericMotionEvent implements isSpanStillValid {
    private static ThreadPoolExecutor getMin;

    public onGenericMotionEvent(getBoundsInParent getboundsinparent) {
        if (getMin == null) {
            getMin = new performClickableSpanAction(getboundsinparent.setMin(), getboundsinparent.length(), getboundsinparent.getMin());
        }
    }

    public final boolean post(Runnable runnable) {
        try {
            getMin.execute(runnable);
            return true;
        } catch (RejectedExecutionException e) {
            throw new RuntimeException("Cannot execute layout calculation task; ".concat(String.valueOf(e)));
        }
    }

    public final void removeCallbacks(Runnable runnable) {
        getMin.remove(runnable);
    }
}
