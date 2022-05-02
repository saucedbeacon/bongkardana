package o;

import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import o.GriverProgressBar;

public final class SecurityInit<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
    GriverProgressBar.UpdateRunnable getMax;
    final GriverProgressBar<? super T> getMin;
    boolean length;

    public SecurityInit(@NonNull GriverProgressBar<? super T> griverProgressBar) {
        this.getMin = griverProgressBar;
    }

    public final void onSubscribe(@NonNull GriverProgressBar.UpdateRunnable updateRunnable) {
        if (DisposableHelper.validate(this.getMax, updateRunnable)) {
            this.getMax = updateRunnable;
            try {
                this.getMin.onSubscribe(this);
            } catch (Throwable th) {
                registerNode.getMax(th);
                SecuritySignature.getMax((Throwable) new CompositeException(th, th));
            }
        }
    }

    public final void dispose() {
        this.getMax.dispose();
    }

    public final boolean isDisposed() {
        return this.getMax.isDisposed();
    }

    public final void onNext(@NonNull T t) {
        if (!this.length) {
            if (this.getMax == null) {
                this.length = true;
                NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
                try {
                    this.getMin.onSubscribe(EmptyDisposable.INSTANCE);
                    try {
                        this.getMin.onError(nullPointerException);
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        SecuritySignature.getMax((Throwable) new CompositeException(nullPointerException, th));
                    }
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    SecuritySignature.getMax((Throwable) new CompositeException(nullPointerException, th2));
                }
            } else if (t == null) {
                NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                try {
                    this.getMax.dispose();
                    onError(nullPointerException2);
                } catch (Throwable th3) {
                    registerNode.getMax(th3);
                    onError(new CompositeException(nullPointerException2, th3));
                }
            } else {
                try {
                    this.getMin.onNext(t);
                } catch (Throwable th4) {
                    registerNode.getMax(th4);
                    onError(new CompositeException(th, th4));
                }
            }
        }
    }

    public final void onError(@NonNull Throwable th) {
        if (this.length) {
            SecuritySignature.getMax(th);
            return;
        }
        this.length = true;
        if (this.getMax == null) {
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                this.getMin.onSubscribe(EmptyDisposable.INSTANCE);
                try {
                    this.getMin.onError(new CompositeException(th, nullPointerException));
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    SecuritySignature.getMax((Throwable) new CompositeException(th, nullPointerException, th2));
                }
            } catch (Throwable th3) {
                registerNode.getMax(th3);
                SecuritySignature.getMax((Throwable) new CompositeException(th, nullPointerException, th3));
            }
        } else {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.getMin.onError(th);
            } catch (Throwable th4) {
                registerNode.getMax(th4);
                SecuritySignature.getMax((Throwable) new CompositeException(th, th4));
            }
        }
    }

    public final void onComplete() {
        if (!this.length) {
            this.length = true;
            if (this.getMax == null) {
                NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
                try {
                    this.getMin.onSubscribe(EmptyDisposable.INSTANCE);
                    try {
                        this.getMin.onError(nullPointerException);
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        SecuritySignature.getMax((Throwable) new CompositeException(nullPointerException, th));
                    }
                } catch (Throwable th2) {
                    registerNode.getMax(th2);
                    SecuritySignature.getMax((Throwable) new CompositeException(nullPointerException, th2));
                }
            } else {
                try {
                    this.getMin.onComplete();
                } catch (Throwable th3) {
                    registerNode.getMax(th3);
                    SecuritySignature.getMax(th3);
                }
            }
        }
    }
}
