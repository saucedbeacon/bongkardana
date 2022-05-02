package o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.setMaxCardElevation;

public final class setRadius {
    private final Deque<setMaxCardElevation.length> IsOverlapping = new ArrayDeque();
    final Deque<setMaxCardElevation> getMax = new ArrayDeque();
    private Runnable getMin;
    private int length = 64;
    final Deque<setMaxCardElevation.length> setMax = new ArrayDeque();
    private int setMin = 5;
    private ExecutorService toIntRange;

    private synchronized ExecutorService setMax() {
        if (this.toIntRange == null) {
            this.toIntRange = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), CustomTabsIntent$ShareState.getMin("OkHttp Dispatcher", false));
        }
        return this.toIntRange;
    }

    private void getMax() {
        if (this.setMax.size() < this.length && !this.IsOverlapping.isEmpty()) {
            Iterator<setMaxCardElevation.length> it = this.IsOverlapping.iterator();
            while (it.hasNext()) {
                setMaxCardElevation.length next = it.next();
                int i = 0;
                for (setMaxCardElevation.length length2 : this.setMax) {
                    if (length2.setMin.getMax.length.setMax.equals(next.setMin.getMax.length.setMax)) {
                        i++;
                    }
                }
                if (i < this.setMin) {
                    it.remove();
                    this.setMax.add(next);
                    setMax().execute(next);
                }
                if (this.setMax.size() >= this.length) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void getMin(setMaxCardElevation setmaxcardelevation) {
        this.getMax.add(setmaxcardelevation);
    }

    /* access modifiers changed from: package-private */
    public final <T> void setMin(Deque<T> deque, T t, boolean z) {
        int length2;
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    getMax();
                }
                length2 = length();
                runnable = this.getMin;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (length2 == 0 && runnable != null) {
            runnable.run();
        }
    }

    private synchronized int length() {
        return this.setMax.size() + this.getMax.size();
    }
}
