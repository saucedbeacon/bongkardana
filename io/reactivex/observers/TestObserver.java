package io.reactivex.observers;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;
import o.printStackTrace;
import o.setOptionMenuIcon;
import o.setRefreshTips;
import o.switchFavoriteIconFont;

public class TestObserver<T> extends printStackTrace<T, TestObserver<T>> implements GriverProgressBar<T>, setOptionMenuIcon<T>, TitleBarRightButtonView.CornerMarkingUIController<T>, switchFavoriteIconFont {
    private setRefreshTips<T> FastBitmap$CoordinateSystem;
    private final GriverProgressBar<? super T> IsOverlapping;
    private final AtomicReference<GriverProgressBar.UpdateRunnable> toIntRange;

    enum EmptyObserver implements GriverProgressBar<Object> {
        INSTANCE;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
        }

        public final void onNext(Object obj) {
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    private TestObserver(GriverProgressBar<? super T> griverProgressBar) {
        this.toIntRange = new AtomicReference<>();
        this.IsOverlapping = griverProgressBar;
    }

    public void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        this.getMax = Thread.currentThread();
        if (updateRunnable == null) {
            this.setMax.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.toIntRange.compareAndSet((Object) null, updateRunnable)) {
            updateRunnable.dispose();
            if (this.toIntRange.get() != DisposableHelper.DISPOSED) {
                this.setMax.add(new IllegalStateException("onSubscribe received multiple subscriptions: ".concat(String.valueOf(updateRunnable))));
            }
        } else {
            if (this.toFloatRange != 0 && (updateRunnable instanceof setRefreshTips)) {
                setRefreshTips<T> setrefreshtips = (setRefreshTips) updateRunnable;
                this.FastBitmap$CoordinateSystem = setrefreshtips;
                int requestFusion = setrefreshtips.requestFusion(this.toFloatRange);
                this.equals = requestFusion;
                if (requestFusion == 1) {
                    this.isInside = true;
                    this.getMax = Thread.currentThread();
                    while (true) {
                        try {
                            T poll = this.FastBitmap$CoordinateSystem.poll();
                            if (poll != null) {
                                this.getMin.add(poll);
                            } else {
                                this.setMin++;
                                this.toIntRange.lazySet(DisposableHelper.DISPOSED);
                                return;
                            }
                        } catch (Throwable th) {
                            this.setMax.add(th);
                            return;
                        }
                    }
                }
            }
            this.IsOverlapping.onSubscribe(updateRunnable);
        }
    }

    public void onNext(T t) {
        if (!this.isInside) {
            this.isInside = true;
            if (this.toIntRange.get() == null) {
                this.setMax.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.getMax = Thread.currentThread();
        if (this.equals == 2) {
            while (true) {
                try {
                    T poll = this.FastBitmap$CoordinateSystem.poll();
                    if (poll != null) {
                        this.getMin.add(poll);
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    this.setMax.add(th);
                    this.FastBitmap$CoordinateSystem.dispose();
                    return;
                }
            }
        } else {
            this.getMin.add(t);
            if (t == null) {
                this.setMax.add(new NullPointerException("onNext received a null value"));
            }
            this.IsOverlapping.onNext(t);
        }
    }

    public void onError(Throwable th) {
        if (!this.isInside) {
            this.isInside = true;
            if (this.toIntRange.get() == null) {
                this.setMax.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.getMax = Thread.currentThread();
            if (th == null) {
                this.setMax.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.setMax.add(th);
            }
            this.IsOverlapping.onError(th);
        } finally {
            this.length.countDown();
        }
    }

    public void onComplete() {
        if (!this.isInside) {
            this.isInside = true;
            if (this.toIntRange.get() == null) {
                this.setMax.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.getMax = Thread.currentThread();
            this.setMin++;
            this.IsOverlapping.onComplete();
        } finally {
            this.length.countDown();
        }
    }

    public final void dispose() {
        DisposableHelper.dispose(this.toIntRange);
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.toIntRange.get());
    }

    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }
}
