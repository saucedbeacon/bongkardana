package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.Callable;
import o.TitleBarRightButtonView;

public final class stopLoadingAnimation<T, K> extends onLoadMoreStateChanged<T, T> {
    final RedDotDrawable<? super T, K> getMin;
    final Callable<? extends Collection<? super K>> length;

    public stopLoadingAnimation(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, K> redDotDrawable, Callable<? extends Collection<? super K>> callable) {
        super(r1);
        this.getMin = redDotDrawable;
        this.length = callable;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        try {
            this.setMin.subscribe(new setMax(griverProgressBar, this.getMin, (Collection) setRefreshAnimation.getMax(this.length.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            registerNode.getMax(th);
            EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
        }
    }

    static final class setMax<T, K> extends setRefreshTipColor<T, T> {
        final RedDotDrawable<? super T, K> equals;
        final Collection<? super K> toIntRange;

        setMax(GriverProgressBar<? super T> griverProgressBar, RedDotDrawable<? super T, K> redDotDrawable, Collection<? super K> collection) {
            super(griverProgressBar);
            this.equals = redDotDrawable;
            this.toIntRange = collection;
        }

        public final void onNext(T t) {
            if (!this.setMin) {
                if (this.getMax == 0) {
                    try {
                        if (this.toIntRange.add(setRefreshAnimation.getMax(this.equals.apply(t), "The keySelector returned a null key"))) {
                            this.getMin.onNext(t);
                        }
                    } catch (Throwable th) {
                        setMax(th);
                    }
                } else {
                    this.getMin.onNext(null);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.setMin) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMin = true;
            this.toIntRange.clear();
            this.getMin.onError(th);
        }

        public final void onComplete() {
            if (!this.setMin) {
                this.setMin = true;
                this.toIntRange.clear();
                this.getMin.onComplete();
            }
        }

        public final int requestFusion(int i) {
            return setMax(i);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        @io.reactivex.annotations.Nullable
        public final T poll() throws java.lang.Exception {
            /*
                r4 = this;
            L_0x0000:
                o.setRefreshTips r0 = r4.length
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x001c
                java.util.Collection<? super K> r1 = r4.toIntRange
                o.RedDotDrawable<? super T, K> r2 = r4.equals
                java.lang.Object r2 = r2.apply(r0)
                java.lang.String r3 = "The keySelector returned a null key"
                java.lang.Object r2 = o.setRefreshAnimation.getMax(r2, (java.lang.String) r3)
                boolean r1 = r1.add(r2)
                if (r1 == 0) goto L_0x0000
            L_0x001c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.stopLoadingAnimation.setMax.poll():java.lang.Object");
        }

        public final void clear() {
            this.toIntRange.clear();
            super.clear();
        }
    }
}
