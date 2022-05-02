package o;

import io.reactivex.annotations.Nullable;
import o.TitleBarRightButtonView;

public final class SplashLoadingView<T, K> extends onLoadMoreStateChanged<T, T> {
    final RedDotDrawable<? super T, K> getMin;
    final setBounds<? super K, ? super K> length;

    public SplashLoadingView(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, K> redDotDrawable, setBounds<? super K, ? super K> setbounds) {
        super(r1);
        this.getMin = redDotDrawable;
        this.length = setbounds;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new setMin(griverProgressBar, this.getMin, this.length));
    }

    static final class setMin<T, K> extends setRefreshTipColor<T, T> {
        K IsOverlapping;
        final setBounds<? super K, ? super K> equals;
        boolean isInside;
        final RedDotDrawable<? super T, K> toIntRange;

        setMin(GriverProgressBar<? super T> griverProgressBar, RedDotDrawable<? super T, K> redDotDrawable, setBounds<? super K, ? super K> setbounds) {
            super(griverProgressBar);
            this.toIntRange = redDotDrawable;
            this.equals = setbounds;
        }

        public final void onNext(T t) {
            if (!this.setMin) {
                if (this.getMax != 0) {
                    this.getMin.onNext(t);
                    return;
                }
                try {
                    K apply = this.toIntRange.apply(t);
                    if (this.isInside) {
                        boolean min = this.equals.getMin(this.IsOverlapping, apply);
                        this.IsOverlapping = apply;
                        if (min) {
                            return;
                        }
                    } else {
                        this.isInside = true;
                        this.IsOverlapping = apply;
                    }
                    this.getMin.onNext(t);
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
            while (true) {
                T poll = this.length.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.toIntRange.apply(poll);
                if (!this.isInside) {
                    this.isInside = true;
                    this.IsOverlapping = apply;
                    return poll;
                } else if (!this.equals.getMin(this.IsOverlapping, apply)) {
                    this.IsOverlapping = apply;
                    return poll;
                } else {
                    this.IsOverlapping = apply;
                }
            }
        }
    }
}
