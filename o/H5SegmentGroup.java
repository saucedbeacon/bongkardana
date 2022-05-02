package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class H5SegmentGroup<T> extends onLoadMoreStateChanged<T, T> {
    public H5SegmentGroup(TitleBarRightButtonView.AnonymousClass1<T> r1) {
        super(r1);
    }

    public final class OnItemCheckedChangeListener<T> extends onLoadMoreStateChanged<T, T> {
        final getChildren<? super T> getMax;

        public OnItemCheckedChangeListener(TitleBarRightButtonView.AnonymousClass4<T> r1, getChildren<? super T> getchildren) {
            super(r1);
            this.getMax = getchildren;
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            this.setMin.subscribe(new setMin(griverProgressBar, this.getMax));
        }

        static final class setMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            final getChildren<? super T> getMax;
            boolean getMin;
            final GriverProgressBar<? super T> length;
            GriverProgressBar.UpdateRunnable setMin;

            setMin(GriverProgressBar<? super T> griverProgressBar, getChildren<? super T> getchildren) {
                this.length = griverProgressBar;
                this.getMax = getchildren;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.setMin, updateRunnable)) {
                    this.setMin = updateRunnable;
                    this.length.onSubscribe(this);
                }
            }

            public final void dispose() {
                this.setMin.dispose();
            }

            public final boolean isDisposed() {
                return this.setMin.isDisposed();
            }

            public final void onNext(T t) {
                if (this.getMin) {
                    this.length.onNext(t);
                    return;
                }
                try {
                    if (!this.getMax.test(t)) {
                        this.getMin = true;
                        this.length.onNext(t);
                    }
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    this.setMin.dispose();
                    this.length.onError(th);
                }
            }

            public final void onError(Throwable th) {
                this.length.onError(th);
            }

            public final void onComplete() {
                this.length.onComplete();
            }
        }
    }

    public final class LayoutSelector<T> extends onLoadMoreStateChanged<T, T> {
        final int getMax;

        public LayoutSelector(TitleBarRightButtonView.AnonymousClass4<T> r1, int i) {
            super(r1);
            this.getMax = i;
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            this.setMin.subscribe(new setMax(griverProgressBar, this.getMax));
        }

        static final class setMax<T> extends ArrayDeque<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
            private static final long serialVersionUID = -3807491841935125653L;
            final GriverProgressBar<? super T> downstream;
            final int skip;
            GriverProgressBar.UpdateRunnable upstream;

            setMax(GriverProgressBar<? super T> griverProgressBar, int i) {
                super(i);
                this.downstream = griverProgressBar;
                this.skip = i;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                    this.upstream = updateRunnable;
                    this.downstream.onSubscribe(this);
                }
            }

            public final void dispose() {
                this.upstream.dispose();
            }

            public final boolean isDisposed() {
                return this.upstream.isDisposed();
            }

            public final void onNext(T t) {
                if (this.skip == size()) {
                    this.downstream.onNext(poll());
                }
                offer(t);
            }

            public final void onError(Throwable th) {
                this.downstream.onError(th);
            }

            public final void onComplete() {
                this.downstream.onComplete();
            }
        }
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new SecurityStorage(griverProgressBar));
    }
}
