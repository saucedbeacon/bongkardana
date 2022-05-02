package o;

import io.reactivex.annotations.Nullable;
import o.TitleBarRightButtonView;

public final class setStatusBarColor<T> extends onLoadMoreStateChanged<T, T> {
    final RedDotManager<? super T> getMax;

    public setStatusBarColor(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotManager<? super T> redDotManager) {
        super(r1);
        this.getMax = redDotManager;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.getMax));
    }

    static final class getMin<T> extends setRefreshTipColor<T, T> {
        final RedDotManager<? super T> IsOverlapping;

        getMin(GriverProgressBar<? super T> griverProgressBar, RedDotManager<? super T> redDotManager) {
            super(griverProgressBar);
            this.IsOverlapping = redDotManager;
        }

        public final void onNext(T t) {
            this.getMin.onNext(t);
            if (this.getMax == 0) {
                try {
                    this.IsOverlapping.accept(t);
                } catch (Throwable th) {
                    setMax(th);
                }
            }
        }

        public final int requestFusion(int i) {
            return setMax(i);
        }

        @Nullable
        public final T poll() throws Exception {
            T poll = this.length.poll();
            if (poll != null) {
                this.IsOverlapping.accept(poll);
            }
            return poll;
        }
    }
}
