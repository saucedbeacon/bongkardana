package o;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class NebulaTitleView<T, B> extends onLoadMoreStateChanged<T, TitleBarRightButtonView.AnonymousClass1<T>> {
    final TitleBarRightButtonView.AnonymousClass4<B> getMax;
    final int setMax;

    public NebulaTitleView(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass4<B> r2, int i) {
        super(r1);
        this.getMax = r2;
        this.setMax = i;
    }

    public final void subscribeActual(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar) {
        length length2 = new length(griverProgressBar, this.setMax);
        griverProgressBar.onSubscribe(length2);
        this.getMax.subscribe(length2.boundaryObserver);
        this.setMin.subscribe(length2);
    }

    public final class Theme<E> extends AtomicReferenceArray<E> implements getRefreshViewHeight<E> {
        private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        private static final long serialVersionUID = -1296597691183856449L;
        final AtomicLong consumerIndex = new AtomicLong();
        final int lookAheadStep;
        final int mask = (length() - 1);
        final AtomicLong producerIndex = new AtomicLong();
        long producerLookAhead;

        /* access modifiers changed from: package-private */
        public final int calcElementOffset(long j, int i) {
            return ((int) j) & i;
        }

        public final boolean offer(E e) {
            if (e != null) {
                int i = this.mask;
                long j = this.producerIndex.get();
                int calcElementOffset = calcElementOffset(j, i);
                if (j >= this.producerLookAhead) {
                    long j2 = ((long) this.lookAheadStep) + j;
                    if (lvElement(calcElementOffset(j2, i)) == null) {
                        this.producerLookAhead = j2;
                    } else if (lvElement(calcElementOffset) != null) {
                        return false;
                    }
                }
                soElement(calcElementOffset, e);
                soProducerIndex(j + 1);
                return true;
            }
            throw new NullPointerException("Null is not a valid element");
        }

        public final boolean offer(E e, E e2) {
            return offer(e) && offer(e2);
        }

        @Nullable
        public final E poll() {
            long j = this.consumerIndex.get();
            int calcElementOffset = calcElementOffset(j);
            E lvElement = lvElement(calcElementOffset);
            if (lvElement == null) {
                return null;
            }
            soConsumerIndex(j + 1);
            soElement(calcElementOffset, (Object) null);
            return lvElement;
        }

        public final boolean isEmpty() {
            return this.producerIndex.get() == this.consumerIndex.get();
        }

        /* access modifiers changed from: package-private */
        public final void soProducerIndex(long j) {
            this.producerIndex.lazySet(j);
        }

        /* access modifiers changed from: package-private */
        public final void soConsumerIndex(long j) {
            this.consumerIndex.lazySet(j);
        }

        public final void clear() {
            while (true) {
                if (poll() == null && isEmpty()) {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int calcElementOffset(long j) {
            return this.mask & ((int) j);
        }

        /* access modifiers changed from: package-private */
        public final void soElement(int i, E e) {
            lazySet(i, e);
        }

        /* access modifiers changed from: package-private */
        public final E lvElement(int i) {
            return get(i);
        }

        public Theme(int i) {
            super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
            this.lookAheadStep = Math.min(i / 4, MAX_LOOK_AHEAD_STEP.intValue());
        }
    }

    static final class length<T, B> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, Runnable {
        static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final setMax<T, B> boundaryObserver = new setMax<>(this);
        final int capacityHint;
        volatile boolean done;
        final GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> downstream;
        final InterfacePluginInfo errors = new InterfacePluginInfo();
        final initTitleSegControl<Object> queue = new initTitleSegControl<>();
        final AtomicBoolean stopWindows = new AtomicBoolean();
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();
        getDynamicDataEncryptComp<T> window;
        final AtomicInteger windows = new AtomicInteger(1);

        length(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, int i) {
            this.downstream = griverProgressBar;
            this.capacityHint = i;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this.upstream, updateRunnable)) {
                innerNext();
            }
        }

        public final void onNext(T t) {
            this.queue.offer(t);
            drain();
        }

        public final void onError(Throwable th) {
            this.boundaryObserver.dispose();
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            this.boundaryObserver.dispose();
            this.done = true;
            drain();
        }

        public final void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundaryObserver.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.upstream);
                }
            }
        }

        public final boolean isDisposed() {
            return this.stopWindows.get();
        }

        public final void run() {
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.upstream);
            }
        }

        /* access modifiers changed from: package-private */
        public final void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void innerError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        /* access modifiers changed from: package-private */
        public final void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar = this.downstream;
                initTitleSegControl<Object> inittitlesegcontrol = this.queue;
                InterfacePluginInfo interfacePluginInfo = this.errors;
                int i = 1;
                while (this.windows.get() != 0) {
                    getDynamicDataEncryptComp<T> getdynamicdataencryptcomp = this.window;
                    boolean z = this.done;
                    if (!z || interfacePluginInfo.get() == null) {
                        Object poll = inittitlesegcontrol.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable terminate = interfacePluginInfo.terminate();
                            if (terminate == null) {
                                if (getdynamicdataencryptcomp != null) {
                                    this.window = null;
                                    getdynamicdataencryptcomp.onComplete();
                                }
                                griverProgressBar.onComplete();
                                return;
                            }
                            if (getdynamicdataencryptcomp != null) {
                                this.window = null;
                                getdynamicdataencryptcomp.onError(terminate);
                            }
                            griverProgressBar.onError(terminate);
                            return;
                        } else if (z2) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else if (poll != NEXT_WINDOW) {
                            getdynamicdataencryptcomp.onNext(poll);
                        } else {
                            if (getdynamicdataencryptcomp != null) {
                                this.window = null;
                                getdynamicdataencryptcomp.onComplete();
                            }
                            if (!this.stopWindows.get()) {
                                getDynamicDataEncryptComp<T> max = getDynamicDataEncryptComp.setMax(this.capacityHint, this);
                                this.window = max;
                                this.windows.getAndIncrement();
                                griverProgressBar.onNext(max);
                            }
                        }
                    } else {
                        inittitlesegcontrol.clear();
                        Throwable terminate2 = interfacePluginInfo.terminate();
                        if (getdynamicdataencryptcomp != null) {
                            this.window = null;
                            getdynamicdataencryptcomp.onError(terminate2);
                        }
                        griverProgressBar.onError(terminate2);
                        return;
                    }
                }
                inittitlesegcontrol.clear();
                this.window = null;
            }
        }
    }

    static final class setMax<T, B> extends setGlobalUserData<B> {
        boolean getMin;
        final length<T, B> setMax;

        setMax(length<T, B> length) {
            this.setMax = length;
        }

        public final void onNext(B b) {
            if (!this.getMin) {
                this.setMax.innerNext();
            }
        }

        public final void onError(Throwable th) {
            if (this.getMin) {
                SecuritySignature.getMax(th);
                return;
            }
            this.getMin = true;
            this.setMax.innerError(th);
        }

        public final void onComplete() {
            if (!this.getMin) {
                this.getMin = true;
                this.setMax.innerComplete();
            }
        }
    }
}
