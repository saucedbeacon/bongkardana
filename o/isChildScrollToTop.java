package o;

import io.reactivex.annotations.Nullable;
import o.GriverPullRefreshService;

public class isChildScrollToTop<T> extends GriverPullRefreshService.IGriverRefreshState<T> {
    static final int DISPOSED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    protected final GriverProgressBar<? super T> downstream;
    protected T value;

    public isChildScrollToTop(GriverProgressBar<? super T> griverProgressBar) {
        this.downstream = griverProgressBar;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) == 0) {
            GriverProgressBar<? super T> griverProgressBar = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                griverProgressBar.onNext(null);
            } else {
                lazySet(2);
                griverProgressBar.onNext(t);
            }
            if (get() != 4) {
                griverProgressBar.onComplete();
            }
        }
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            SecuritySignature.getMax(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }

    public final void complete() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.downstream.onComplete();
        }
    }

    @Nullable
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public void dispose() {
        set(4);
        this.value = null;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }
}
