package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

public final class setCurrentTargetOffsetTop<T> extends setFooterView<T, T> implements RedDotManager<T> {
    final RedDotManager<? super T> setMax = this;

    public final void accept(T t) {
    }

    public setCurrentTargetOffsetTop(setBadgeData<T> setbadgedata) {
        super(setbadgedata);
    }

    public final void setMax(getbEva<? super T> getbeva) {
        this.setMin.setMin(new setMin(getbeva, this.setMax));
    }

    static final class setMin<T> extends AtomicLong implements switchTheme<T>, getFmt {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean done;
        final getbEva<? super T> downstream;
        final RedDotManager<? super T> onDrop;
        getFmt upstream;

        setMin(getbEva<? super T> getbeva, RedDotManager<? super T> redDotManager) {
            this.downstream = getbeva;
            this.onDrop = redDotManager;
        }

        public final void onSubscribe(getFmt getfmt) {
            if (SubscriptionHelper.validate(this.upstream, getfmt)) {
                this.upstream = getfmt;
                this.downstream.onSubscribe(this);
                getfmt.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.downstream.onNext(t);
                    getPluginInfo.setMax(this, 1);
                    return;
                }
                try {
                    this.onDrop.accept(t);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    cancel();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.done) {
                SecuritySignature.getMax(th);
                return;
            }
            this.done = true;
            this.downstream.onError(th);
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                getPluginInfo.getMax(this, j);
            }
        }

        public final void cancel() {
            this.upstream.cancel();
        }
    }
}
