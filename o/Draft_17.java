package o;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.IncompleteHandshakeException;

public final class Draft_17 {
    static final /* synthetic */ boolean getMax = (!Draft_17.class.desiredAssertionStatus());
    private int IsOverlapping = 5;
    final Deque<IncompleteHandshakeException.setMax> getMin = new ArrayDeque();
    @Nullable
    private Runnable isInside;
    final Deque<IncompleteHandshakeException.setMax> length = new ArrayDeque();
    final Deque<IncompleteHandshakeException> setMax = new ArrayDeque();
    private int setMin = 64;
    @Nullable
    private ExecutorService toFloatRange;

    private synchronized ExecutorService setMin() {
        if (this.toFloatRange == null) {
            this.toFloatRange = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), initCloseCode.getMax("OkHttp Dispatcher", false));
        }
        return this.toFloatRange;
    }

    public final synchronized void setMax() {
        for (IncompleteHandshakeException.setMax setmax : this.length) {
            HandshakeBuilder handshakeBuilder = IncompleteHandshakeException.this.setMax;
            handshakeBuilder.getMax = true;
            isFin isfin = handshakeBuilder.getMin;
            if (isfin != null) {
                isfin.setMax();
            }
        }
        for (IncompleteHandshakeException.setMax setmax2 : this.getMin) {
            HandshakeBuilder handshakeBuilder2 = IncompleteHandshakeException.this.setMax;
            handshakeBuilder2.getMax = true;
            isFin isfin2 = handshakeBuilder2.getMin;
            if (isfin2 != null) {
                isfin2.setMax();
            }
        }
        for (IncompleteHandshakeException incompleteHandshakeException : this.setMax) {
            HandshakeBuilder handshakeBuilder3 = incompleteHandshakeException.setMax;
            handshakeBuilder3.getMax = true;
            isFin isfin3 = handshakeBuilder3.getMin;
            if (isfin3 != null) {
                isfin3.setMax();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        int i;
        boolean z;
        if (getMax || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<IncompleteHandshakeException.setMax> it = this.length.iterator();
                while (it.hasNext()) {
                    IncompleteHandshakeException.setMax next = it.next();
                    if (this.getMin.size() >= this.setMin) {
                        break;
                    } else if (setMin(next) < this.IsOverlapping) {
                        it.remove();
                        arrayList.add(next);
                        this.getMin.add(next);
                    }
                }
                i = 0;
                z = length() > 0;
            }
            int size = arrayList.size();
            while (i < size) {
                IncompleteHandshakeException.setMax setmax = (IncompleteHandshakeException.setMax) arrayList.get(i);
                ExecutorService min = setMin();
                if (IncompleteHandshakeException.setMax.setMin || !Thread.holdsLock(IncompleteHandshakeException.this.setMin.setMin)) {
                    try {
                        min.execute(setmax);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        IncompleteHandshakeException.this.isInside.callFailed(IncompleteHandshakeException.this, interruptedIOException);
                        setmax.setMax.onFailure(IncompleteHandshakeException.this, interruptedIOException);
                        Draft_17 draft_17 = IncompleteHandshakeException.this.setMin.setMin;
                        draft_17.getMax(draft_17.getMin, setmax);
                    } catch (Throwable th) {
                        Draft_17 draft_172 = IncompleteHandshakeException.this.setMin.setMin;
                        draft_172.getMax(draft_172.getMin, setmax);
                        throw th;
                    }
                    i++;
                } else {
                    throw new AssertionError();
                }
            }
            return z;
        }
        throw new AssertionError();
    }

    private int setMin(IncompleteHandshakeException.setMax setmax) {
        int i = 0;
        for (IncompleteHandshakeException.setMax next : this.getMin) {
            if (!IncompleteHandshakeException.this.getMax && IncompleteHandshakeException.this.getMin.setMin.getMin.equals(IncompleteHandshakeException.this.getMin.setMin.getMin)) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void getMin(IncompleteHandshakeException incompleteHandshakeException) {
        this.setMax.add(incompleteHandshakeException);
    }

    /* access modifiers changed from: package-private */
    public final <T> void getMax(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.isInside;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!getMax() && runnable != null) {
            runnable.run();
        }
    }

    private synchronized int length() {
        return this.getMin.size() + this.setMax.size();
    }
}
