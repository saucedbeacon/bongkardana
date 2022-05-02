package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class LoadMoreFooter<T> implements Iterable<T> {
    final TitleBarRightButtonView.AnonymousClass4<T> length;

    public final class LoadMoreState<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<Boolean> implements getSecondFloorView<Boolean> {
        final getChildren<? super T> getMin;
        final TitleBarRightButtonView.AnonymousClass4<T> setMax;

        public LoadMoreState(TitleBarRightButtonView.AnonymousClass4<T> r1, getChildren<? super T> getchildren) {
            this.setMax = r1;
            this.getMin = getchildren;
        }

        public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> cornerMarkingUIController) {
            this.setMax.subscribe(new setMin(cornerMarkingUIController, this.getMin));
        }

        public final TitleBarRightButtonView.AnonymousClass1<Boolean> setMax() {
            setPushLoadMoreListener setpushloadmorelistener = new setPushLoadMoreListener(this.setMax, this.getMin);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setpushloadmorelistener) : setpushloadmorelistener;
        }

        static final class setMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            final getChildren<? super T> getMax;
            final TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> length;
            GriverProgressBar.UpdateRunnable setMax;
            boolean setMin;

            setMin(TitleBarRightButtonView.CornerMarkingUIController<? super Boolean> cornerMarkingUIController, getChildren<? super T> getchildren) {
                this.length = cornerMarkingUIController;
                this.getMax = getchildren;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.setMax, updateRunnable)) {
                    this.setMax = updateRunnable;
                    this.length.onSubscribe(this);
                }
            }

            public final void onNext(T t) {
                if (!this.setMin) {
                    try {
                        if (!this.getMax.test(t)) {
                            this.setMin = true;
                            this.setMax.dispose();
                            this.length.onSuccess(Boolean.FALSE);
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.setMax.dispose();
                        onError(th);
                    }
                }
            }

            public final void onError(Throwable th) {
                if (this.setMin) {
                    SecuritySignature.getMax(th);
                    return;
                }
                this.setMin = true;
                this.length.onError(th);
            }

            public final void onComplete() {
                if (!this.setMin) {
                    this.setMin = true;
                    this.length.onSuccess(Boolean.TRUE);
                }
            }

            public final void dispose() {
                this.setMax.dispose();
            }

            public final boolean isDisposed() {
                return this.setMax.isDisposed();
            }
        }
    }

    public LoadMoreFooter(TitleBarRightButtonView.AnonymousClass4<T> r1) {
        this.length = r1;
    }

    public final Iterator<T> iterator() {
        return new getMin(this.length, new setMin());
    }

    static final class getMin<T> implements Iterator<T> {
        private Throwable IsOverlapping;
        private boolean equals;
        private boolean getMax = true;
        private final TitleBarRightButtonView.AnonymousClass4<T> getMin;
        private boolean length = true;
        private T setMax;
        private final setMin<T> setMin;

        getMin(TitleBarRightButtonView.AnonymousClass4<T> r2, setMin<T> setmin) {
            this.getMin = r2;
            this.setMin = setmin;
        }

        public final boolean hasNext() {
            Throwable th = this.IsOverlapping;
            if (th != null) {
                throw utAvaiable.getMin(th);
            } else if (!this.length) {
                return false;
            } else {
                if (!this.getMax || getMin()) {
                    return true;
                }
                return false;
            }
        }

        private boolean getMin() {
            if (!this.equals) {
                this.equals = true;
                this.setMin.getMax.set(1);
                new setTitleElementsColor(this.getMin).subscribe(this.setMin);
            }
            try {
                setMin<T> setmin = this.setMin;
                setmin.getMax.set(1);
                SGPluginExtras.getMax();
                getFavorite take = setmin.getMin.take();
                T t = null;
                if (take.getMax()) {
                    this.getMax = false;
                    Object obj = take.setMax;
                    if (obj != null && !NotificationLite.isError(obj)) {
                        t = take.setMax;
                    }
                    this.setMax = t;
                    return true;
                }
                this.length = false;
                if (take.getMin()) {
                    return false;
                }
                Object obj2 = take.setMax;
                if (NotificationLite.isError(obj2)) {
                    t = NotificationLite.getError(obj2);
                }
                this.IsOverlapping = t;
                throw utAvaiable.getMin(t);
            } catch (InterruptedException e) {
                this.setMin.dispose();
                this.IsOverlapping = e;
                throw utAvaiable.getMin(e);
            }
        }

        public final T next() {
            Throwable th = this.IsOverlapping;
            if (th != null) {
                throw utAvaiable.getMin(th);
            } else if (hasNext()) {
                this.getMax = true;
                return this.setMax;
            } else {
                throw new NoSuchElementException("No more elements");
            }
        }

        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    static final class setMin<T> extends setGlobalUserData<getFavorite<T>> {
        final AtomicInteger getMax = new AtomicInteger();
        final BlockingQueue<getFavorite<T>> getMin = new ArrayBlockingQueue(1);

        public final void onComplete() {
        }

        setMin() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            getFavorite getfavorite = (getFavorite) obj;
            if (this.getMax.getAndSet(0) == 1 || !getfavorite.getMax()) {
                while (!this.getMin.offer(getfavorite)) {
                    getFavorite getfavorite2 = (getFavorite) this.getMin.poll();
                    if (getfavorite2 != null && !getfavorite2.getMax()) {
                        getfavorite = getfavorite2;
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            SecuritySignature.getMax(th);
        }
    }
}
