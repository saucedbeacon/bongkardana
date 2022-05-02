package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class onHandleMessage<T> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<T> getMax;

    public onHandleMessage(TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<T> r1) {
        this.getMax = r1;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        getMin getmin = new getMin(griverProgressBar);
        griverProgressBar.onSubscribe(getmin);
        try {
            this.getMax.subscribe(getmin);
        } catch (Throwable th) {
            registerNode.getMax(th);
            getmin.onError(th);
        }
    }

    static final class getMin<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.AnonymousClass2<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -3434801548987643227L;
        final GriverProgressBar<? super T> observer;

        getMin(GriverProgressBar<? super T> griverProgressBar) {
            this.observer = griverProgressBar;
        }

        public final void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.observer.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                SecuritySignature.getMax(th);
            }
        }

        /* JADX INFO: finally extract failed */
        public final boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        public final void onComplete() {
            if (!isDisposed()) {
                try {
                    this.observer.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public final void setDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.set(this, updateRunnable);
        }

        public final void setCancellable(setShowRedPoint setshowredpoint) {
            setDisposable(new changeToState(setshowredpoint));
        }

        public final TitleBarRightButtonView.AnonymousClass2<T> serialize() {
            return new getMax(this);
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    static final class getMax<T> extends AtomicInteger implements TitleBarRightButtonView.AnonymousClass2<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final TitleBarRightButtonView.AnonymousClass2<T> emitter;
        final InterfacePluginInfo error = new InterfacePluginInfo();
        final setTitleBackgroundImage<T> queue = new setTitleBackgroundImage<>(16);

        public final TitleBarRightButtonView.AnonymousClass2<T> serialize() {
            return this;
        }

        getMax(TitleBarRightButtonView.AnonymousClass2<T> r2) {
            this.emitter = r2;
        }

        public final void onNext(T t) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    setTitleBackgroundImage<T> settitlebackgroundimage = this.queue;
                    synchronized (settitlebackgroundimage) {
                        settitlebackgroundimage.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.emitter.onNext(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                drainLoop();
            }
        }

        public final void onError(Throwable th) {
            if (!tryOnError(th)) {
                SecuritySignature.getMax(th);
            }
        }

        public final boolean tryOnError(Throwable th) {
            if (!this.emitter.isDisposed() && !this.done) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }

        public final void onComplete() {
            if (!this.emitter.isDisposed() && !this.done) {
                this.done = true;
                drain();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            TitleBarRightButtonView.AnonymousClass2<T> r0 = this.emitter;
            setTitleBackgroundImage<T> settitlebackgroundimage = this.queue;
            InterfacePluginInfo interfacePluginInfo = this.error;
            int i = 1;
            while (!r0.isDisposed()) {
                if (interfacePluginInfo.get() != null) {
                    settitlebackgroundimage.clear();
                    r0.onError(interfacePluginInfo.terminate());
                    return;
                }
                boolean z = this.done;
                T poll = settitlebackgroundimage.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    r0.onComplete();
                    return;
                } else if (!z2) {
                    r0.onNext(poll);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            settitlebackgroundimage.clear();
        }

        public final void setDisposable(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.emitter.setDisposable(updateRunnable);
        }

        public final void setCancellable(setShowRedPoint setshowredpoint) {
            this.emitter.setCancellable(setshowredpoint);
        }

        public final boolean isDisposed() {
            return this.emitter.isDisposed();
        }

        public final String toString() {
            return this.emitter.toString();
        }
    }
}
