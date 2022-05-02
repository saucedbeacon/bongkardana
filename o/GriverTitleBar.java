package o;

import io.reactivex.annotations.Nullable;
import o.TitleBarRightButtonView;

public final class GriverTitleBar<T, U> extends onLoadMoreStateChanged<T, U> {
    final RedDotDrawable<? super T, ? extends U> length;

    public GriverTitleBar(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends U> redDotDrawable) {
        super(r1);
        this.length = redDotDrawable;
    }

    public final void subscribeActual(GriverProgressBar<? super U> griverProgressBar) {
        this.setMin.subscribe(new setMax(griverProgressBar, this.length));
    }

    static final class setMax<T, U> extends setRefreshTipColor<T, U> {
        final RedDotDrawable<? super T, ? extends U> toFloatRange;

        setMax(GriverProgressBar<? super U> griverProgressBar, RedDotDrawable<? super T, ? extends U> redDotDrawable) {
            super(griverProgressBar);
            this.toFloatRange = redDotDrawable;
        }

        public final void onNext(T t) {
            if (!this.setMin) {
                if (this.getMax != 0) {
                    this.getMin.onNext(null);
                    return;
                }
                try {
                    this.getMin.onNext(setRefreshAnimation.getMax(this.toFloatRange.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    setMax(th);
                }
            }
        }

        public final int requestFusion(int i) {
            return setMax(i);
        }

        @Nullable
        public final U poll() throws Exception {
            Object poll = this.length.poll();
            if (poll != null) {
                return setRefreshAnimation.getMax(this.toFloatRange.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
