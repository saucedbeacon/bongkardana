package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class NebulaPopMenu<T> extends onLoadMoreStateChanged<T, T> {
    final int getMin;

    public NebulaPopMenu(TitleBarRightButtonView.AnonymousClass4<T> r1, int i) {
        super(r1);
        this.getMin = i;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new getMin(griverProgressBar, this.getMin));
    }

    static final class getMin<T> extends ArrayDeque<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        final GriverProgressBar<? super T> downstream;
        GriverProgressBar.UpdateRunnable upstream;

        getMin(GriverProgressBar<? super T> griverProgressBar, int i) {
            this.downstream = griverProgressBar;
            this.count = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.count == size()) {
                poll();
            }
            offer(t);
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public final void onComplete() {
            GriverProgressBar<? super T> griverProgressBar = this.downstream;
            while (!this.cancelled) {
                Object poll = poll();
                if (poll != null) {
                    griverProgressBar.onNext(poll);
                } else if (!this.cancelled) {
                    griverProgressBar.onComplete();
                    return;
                } else {
                    return;
                }
            }
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }
    }
}
