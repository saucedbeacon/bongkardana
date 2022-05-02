package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setButtonIcon<T> extends onLoadMoreStateChanged<T, TitleBarRightButtonView.AnonymousClass1<T>> {
    final long getMin;
    final long length;
    final int setMax;

    public setButtonIcon(TitleBarRightButtonView.AnonymousClass4<T> r1, long j, long j2, int i) {
        super(r1);
        this.getMin = j;
        this.length = j2;
        this.setMax = i;
    }

    public final void subscribeActual(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar) {
        if (this.getMin == this.length) {
            this.setMin.subscribe(new getMin(griverProgressBar, this.getMin, this.setMax));
            return;
        }
        this.setMin.subscribe(new setMin(griverProgressBar, this.getMin, this.length, this.setMax));
    }

    static final class getMin<T> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> downstream;
        long size;
        GriverProgressBar.UpdateRunnable upstream;
        getDynamicDataEncryptComp<T> window;

        getMin(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, long j, int i) {
            this.downstream = griverProgressBar;
            this.count = j;
            this.capacityHint = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.window;
            if (getdynamicdataencryptcomp == null && !this.cancelled) {
                getdynamicdataencryptcomp = getDynamicDataEncryptComp.setMax(this.capacityHint, this);
                this.window = getdynamicdataencryptcomp;
                this.downstream.onNext(getdynamicdataencryptcomp);
            }
            if (getdynamicdataencryptcomp != null) {
                getdynamicdataencryptcomp.onNext(t);
                long j = this.size + 1;
                this.size = j;
                if (j >= this.count) {
                    this.size = 0;
                    this.window = null;
                    getdynamicdataencryptcomp.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.window;
            if (getdynamicdataencryptcomp != null) {
                this.window = null;
                getdynamicdataencryptcomp.onError(th);
            }
            this.downstream.onError(th);
        }

        public final void onComplete() {
            getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.window;
            if (getdynamicdataencryptcomp != null) {
                this.window = null;
                getdynamicdataencryptcomp.onComplete();
            }
            this.downstream.onComplete();
        }

        public final void dispose() {
            this.cancelled = true;
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        public final void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    static final class setMin<T> extends AtomicBoolean implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> downstream;
        long firstEmission;
        long index;
        final long skip;
        GriverProgressBar.UpdateRunnable upstream;
        final ArrayDeque<getDynamicDataEncryptComp<T>> windows;
        final AtomicInteger wip = new AtomicInteger();

        setMin(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, long j, long j2, int i) {
            this.downstream = griverProgressBar;
            this.count = j;
            this.skip = j2;
            this.capacityHint = i;
            this.windows = new ArrayDeque<>();
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            ArrayDeque<getDynamicDataEncryptComp<T>> arrayDeque = this.windows;
            long j = this.index;
            long j2 = this.skip;
            if (j % j2 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                getDynamicDataEncryptComp max = getDynamicDataEncryptComp.setMax(this.capacityHint, this);
                arrayDeque.offer(max);
                this.downstream.onNext(max);
            }
            long j3 = this.firstEmission + 1;
            Iterator<getDynamicDataEncryptComp<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.count) {
                arrayDeque.poll().onComplete();
                if (!arrayDeque.isEmpty() || !this.cancelled) {
                    this.firstEmission = j3 - j2;
                } else {
                    this.upstream.dispose();
                    return;
                }
            } else {
                this.firstEmission = j3;
            }
            this.index = j + 1;
        }

        public final void onError(Throwable th) {
            ArrayDeque<getDynamicDataEncryptComp<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.downstream.onError(th);
        }

        public final void onComplete() {
            ArrayDeque<getDynamicDataEncryptComp<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        public final void dispose() {
            this.cancelled = true;
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        public final void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }
    }
}
