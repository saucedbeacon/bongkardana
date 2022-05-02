package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class getRouter<T> extends AtomicReference<getFmt> implements switchTheme<T>, getFmt, GriverProgressBar.UpdateRunnable {
    private static final long serialVersionUID = -7251123623727029452L;
    final removeStateDidChangeHandler onComplete;
    final RedDotManager<? super Throwable> onError;
    final RedDotManager<? super T> onNext;
    final RedDotManager<? super getFmt> onSubscribe;

    public getRouter(RedDotManager<? super T> redDotManager, RedDotManager<? super Throwable> redDotManager2, removeStateDidChangeHandler removestatedidchangehandler, RedDotManager<? super getFmt> redDotManager3) {
        this.onNext = redDotManager;
        this.onError = redDotManager2;
        this.onComplete = removestatedidchangehandler;
        this.onSubscribe = redDotManager3;
    }

    public final void onSubscribe(getFmt getfmt) {
        if (SubscriptionHelper.setOnce(this, getfmt)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                registerNode.getMax(th);
                getfmt.cancel();
                onError(th);
            }
        }
    }

    public final void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.onNext.accept(t);
            } catch (Throwable th) {
                registerNode.getMax(th);
                ((getFmt) get()).cancel();
                onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                SecuritySignature.getMax((Throwable) new CompositeException(th, th2));
            }
        } else {
            SecuritySignature.getMax(th);
        }
    }

    public final void onComplete() {
        if (get() != SubscriptionHelper.CANCELLED) {
            lazySet(SubscriptionHelper.CANCELLED);
            try {
                this.onComplete.getMax();
            } catch (Throwable th) {
                registerNode.getMax(th);
                SecuritySignature.getMax(th);
            }
        }
    }

    public final void dispose() {
        cancel();
    }

    public final boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    public final void request(long j) {
        ((getFmt) get()).request(j);
    }

    public final void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public final boolean hasCustomOnError() {
        return this.onError != Functions.IsOverlapping;
    }
}
