package o;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

public final class getRefresHeader<T> extends setFooterView<T, T> {
    public getRefresHeader(setBadgeData<T> setbadgedata) {
        super(setbadgedata);
    }

    public final void setMax(getbEva<? super T> getbeva) {
        this.setMin.setMin(new length(getbeva));
    }

    static final class length<T> extends AtomicLong implements switchTheme<T>, getFmt {
        private static final long serialVersionUID = -3176480756392482682L;
        boolean done;
        final getbEva<? super T> downstream;
        getFmt upstream;

        length(getbEva<? super T> getbeva) {
            this.downstream = getbeva;
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
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
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
