package o;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class removeTabBadge<T, S> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final removeNode<S, getOptionMenuBlinkAnimator<T>, S> getMax;
    final Callable<S> getMin;
    final RedDotManager<? super S> setMax;

    public removeTabBadge(Callable<S> callable, removeNode<S, getOptionMenuBlinkAnimator<T>, S> removenode, RedDotManager<? super S> redDotManager) {
        this.getMin = callable;
        this.getMax = removenode;
        this.setMax = redDotManager;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        try {
            setMin setmin = new setMin(griverProgressBar, this.getMax, this.setMax, this.getMin.call());
            griverProgressBar.onSubscribe(setmin);
            S s = setmin.setMin;
            if (setmin.setMax) {
                setmin.setMin = null;
                try {
                    setmin.length.accept(s);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    SecuritySignature.getMax(th);
                }
            } else {
                removeNode<S, ? super getOptionMenuBlinkAnimator<T>, S> removenode = setmin.getMax;
                while (!setmin.setMax) {
                    setmin.IsOverlapping = false;
                    try {
                        s = removenode.setMax(s, setmin);
                        if (setmin.isInside) {
                            setmin.setMax = true;
                            setmin.setMin = null;
                            try {
                                setmin.length.accept(s);
                                return;
                            } catch (Throwable th2) {
                                registerNode.getMax(th2);
                                SecuritySignature.getMax(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        registerNode.getMax(th3);
                        SecuritySignature.getMax(th3);
                        return;
                    }
                }
                setmin.setMin = null;
                try {
                    setmin.length.accept(s);
                } catch (Throwable th4) {
                    registerNode.getMax(th4);
                    SecuritySignature.getMax(th4);
                }
            }
        } catch (Throwable th5) {
            registerNode.getMax(th5);
            EmptyDisposable.error(th5, (GriverProgressBar<?>) griverProgressBar);
        }
    }

    static final class setMin<T, S> implements getOptionMenuBlinkAnimator<T>, GriverProgressBar.UpdateRunnable {
        boolean IsOverlapping;
        final removeNode<S, ? super getOptionMenuBlinkAnimator<T>, S> getMax;
        final GriverProgressBar<? super T> getMin;
        boolean isInside;
        final RedDotManager<? super S> length;
        volatile boolean setMax;
        S setMin;

        setMin(GriverProgressBar<? super T> griverProgressBar, removeNode<S, ? super getOptionMenuBlinkAnimator<T>, S> removenode, RedDotManager<? super S> redDotManager, S s) {
            this.getMin = griverProgressBar;
            this.getMax = removenode;
            this.length = redDotManager;
            this.setMin = s;
        }

        public final void dispose() {
            this.setMax = true;
        }

        public final boolean isDisposed() {
            return this.setMax;
        }

        public final void onNext(T t) {
            if (this.isInside) {
                return;
            }
            if (this.IsOverlapping) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.IsOverlapping = true;
                this.getMin.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (this.isInside) {
                SecuritySignature.getMax(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.isInside = true;
            this.getMin.onError(th);
        }

        public final void onComplete() {
            if (!this.isInside) {
                this.isInside = true;
                this.getMin.onComplete();
            }
        }
    }
}
