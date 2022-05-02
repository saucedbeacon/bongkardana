package o;

import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class switchIconFontToBlueTheme<T> extends onLoadMoreStateChanged<T, T> {
    final long setMax;

    public switchIconFontToBlueTheme(TitleBarRightButtonView.AnonymousClass1<T> r1, long j) {
        super(r1);
        this.setMax = j;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        setLoadMoreTipColor setloadmoretipcolor = new setLoadMoreTipColor();
        griverProgressBar.onSubscribe(setloadmoretipcolor);
        long j = this.setMax;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new length(griverProgressBar, j2, setloadmoretipcolor, this.setMin).subscribeNext();
    }

    static final class length<T> extends AtomicInteger implements GriverProgressBar<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final GriverProgressBar<? super T> downstream;
        long remaining;
        final setLoadMoreTipColor sd;
        final TitleBarRightButtonView.AnonymousClass4<? extends T> source;

        length(GriverProgressBar<? super T> griverProgressBar, long j, setLoadMoreTipColor setloadmoretipcolor, TitleBarRightButtonView.AnonymousClass4<? extends T> r5) {
            this.downstream = griverProgressBar;
            this.sd = setloadmoretipcolor;
            this.source = r5;
            this.remaining = j;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.sd.replace(updateRunnable);
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            long j = this.remaining;
            if (j != Long.MAX_VALUE) {
                this.remaining = j - 1;
            }
            if (j != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.sd.isDisposed()) {
                    this.source.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
