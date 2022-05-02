package o;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class getMainPluginName<T> extends AtomicInteger implements switchTheme<T>, getFmt {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final getbEva<? super T> downstream;
    final InterfacePluginInfo error = new InterfacePluginInfo();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<getFmt> upstream = new AtomicReference<>();

    public getMainPluginName(getbEva<? super T> getbeva) {
        this.downstream = getbeva;
    }

    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was ".concat(String.valueOf(j))));
            return;
        }
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    public final void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    public final void onSubscribe(getFmt getfmt) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, getfmt);
            return;
        }
        getfmt.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void onNext(T t) {
        getbEva<? super T> getbeva = this.downstream;
        InterfacePluginInfo interfacePluginInfo = this.error;
        if (get() == 0 && compareAndSet(0, 1)) {
            getbeva.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable terminate = interfacePluginInfo.terminate();
                if (terminate != null) {
                    getbeva.onError(terminate);
                } else {
                    getbeva.onComplete();
                }
            }
        }
    }

    public final void onError(Throwable th) {
        this.done = true;
        getbEva<? super T> getbeva = this.downstream;
        InterfacePluginInfo interfacePluginInfo = this.error;
        if (!interfacePluginInfo.addThrowable(th)) {
            SecuritySignature.getMax(th);
        } else if (getAndIncrement() == 0) {
            getbeva.onError(interfacePluginInfo.terminate());
        }
    }

    public final void onComplete() {
        this.done = true;
        getbEva<? super T> getbeva = this.downstream;
        InterfacePluginInfo interfacePluginInfo = this.error;
        if (getAndIncrement() == 0) {
            Throwable terminate = interfacePluginInfo.terminate();
            if (terminate != null) {
                getbeva.onError(terminate);
            } else {
                getbeva.onComplete();
            }
        }
    }
}
