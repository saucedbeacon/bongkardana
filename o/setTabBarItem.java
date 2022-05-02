package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setTabBarItem<TLeft, TRight, TLeftEnd, TRightEnd, R> extends onLoadMoreStateChanged<TLeft, R> {
    final RedDotDrawable<? super TLeft, ? extends TitleBarRightButtonView.AnonymousClass4<TLeftEnd>> getMax;
    final TitleBarRightButtonView.AnonymousClass4<? extends TRight> getMin;
    final RedDotDrawable<? super TRight, ? extends TitleBarRightButtonView.AnonymousClass4<TRightEnd>> length;
    final removeNode<? super TLeft, ? super TitleBarRightButtonView.AnonymousClass1<TRight>, ? extends R> setMax;

    interface setMin {
        void innerClose(boolean z, setMax setmax);

        void innerCloseError(Throwable th);

        void innerComplete(getMin getmin);

        void innerError(Throwable th);

        void innerValue(boolean z, Object obj);
    }

    public setTabBarItem(TitleBarRightButtonView.AnonymousClass4<TLeft> r1, TitleBarRightButtonView.AnonymousClass4<? extends TRight> r2, RedDotDrawable<? super TLeft, ? extends TitleBarRightButtonView.AnonymousClass4<TLeftEnd>> redDotDrawable, RedDotDrawable<? super TRight, ? extends TitleBarRightButtonView.AnonymousClass4<TRightEnd>> redDotDrawable2, removeNode<? super TLeft, ? super TitleBarRightButtonView.AnonymousClass1<TRight>, ? extends R> removenode) {
        super(r1);
        this.getMin = r2;
        this.getMax = redDotDrawable;
        this.length = redDotDrawable2;
        this.setMax = removenode;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        getMax getmax = new getMax(griverProgressBar, this.getMax, this.length, this.setMax);
        griverProgressBar.onSubscribe(getmax);
        getMin getmin = new getMin(getmax, true);
        getmax.disposables.getMin(getmin);
        getMin getmin2 = new getMin(getmax, false);
        getmax.disposables.getMin(getmin2);
        this.setMin.subscribe(getmin);
        this.getMin.subscribe(getmin2);
    }

    static final class getMax<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements GriverProgressBar.UpdateRunnable, setMin {
        static final Integer LEFT_CLOSE = 3;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_CLOSE = 4;
        static final Integer RIGHT_VALUE = 2;
        private static final long serialVersionUID = -6071216598687999801L;
        final AtomicInteger active;
        volatile boolean cancelled;
        final IRedDotManager disposables = new IRedDotManager();
        final GriverProgressBar<? super R> downstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final RedDotDrawable<? super TLeft, ? extends TitleBarRightButtonView.AnonymousClass4<TLeftEnd>> leftEnd;
        int leftIndex;
        final Map<Integer, getDynamicDataEncryptComp<TRight>> lefts = new LinkedHashMap();
        final setTitleBackgroundImage<Object> queue = new setTitleBackgroundImage<>(TitleBarRightButtonView.AnonymousClass1.bufferSize());
        final removeNode<? super TLeft, ? super TitleBarRightButtonView.AnonymousClass1<TRight>, ? extends R> resultSelector;
        final RedDotDrawable<? super TRight, ? extends TitleBarRightButtonView.AnonymousClass4<TRightEnd>> rightEnd;
        int rightIndex;
        final Map<Integer, TRight> rights = new LinkedHashMap();

        getMax(GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super TLeft, ? extends TitleBarRightButtonView.AnonymousClass4<TLeftEnd>> redDotDrawable, RedDotDrawable<? super TRight, ? extends TitleBarRightButtonView.AnonymousClass4<TRightEnd>> redDotDrawable2, removeNode<? super TLeft, ? super TitleBarRightButtonView.AnonymousClass1<TRight>, ? extends R> removenode) {
            this.downstream = griverProgressBar;
            this.leftEnd = redDotDrawable;
            this.rightEnd = redDotDrawable2;
            this.resultSelector = removenode;
            this.active = new AtomicInteger(2);
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public final void cancelAll() {
            this.disposables.dispose();
        }

        /* access modifiers changed from: package-private */
        public final void errorAll(GriverProgressBar<?> griverProgressBar) {
            Throwable min = utAvaiable.setMin(this.error);
            for (getDynamicDataEncryptComp<TRight> onError : this.lefts.values()) {
                onError.onError(min);
            }
            this.lefts.clear();
            this.rights.clear();
            griverProgressBar.onError(min);
        }

        /* access modifiers changed from: package-private */
        public final void fail(Throwable th, GriverProgressBar<?> griverProgressBar, setTitleBackgroundImage<?> settitlebackgroundimage) {
            registerNode.getMax(th);
            utAvaiable.length(this.error, th);
            settitlebackgroundimage.clear();
            cancelAll();
            errorAll(griverProgressBar);
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                setTitleBackgroundImage<Object> settitlebackgroundimage = this.queue;
                GriverProgressBar<? super R> griverProgressBar = this.downstream;
                int i = 1;
                while (!this.cancelled) {
                    if (this.error.get() != null) {
                        settitlebackgroundimage.clear();
                        cancelAll();
                        errorAll(griverProgressBar);
                        return;
                    }
                    boolean z = this.active.get() == 0;
                    Integer num = (Integer) settitlebackgroundimage.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        for (getDynamicDataEncryptComp<TRight> onComplete : this.lefts.values()) {
                            onComplete.onComplete();
                        }
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        griverProgressBar.onComplete();
                        return;
                    } else if (!z2) {
                        Object poll = settitlebackgroundimage.poll();
                        if (num == LEFT_VALUE) {
                            getDynamicDataEncryptComp length = getDynamicDataEncryptComp.length();
                            int i2 = this.leftIndex;
                            this.leftIndex = i2 + 1;
                            this.lefts.put(Integer.valueOf(i2), length);
                            try {
                                TitleBarRightButtonView.AnonymousClass4 r7 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.leftEnd.apply(poll), "The leftEnd returned a null ObservableSource");
                                setMax setmax = new setMax(this, true, i2);
                                this.disposables.getMin(setmax);
                                r7.subscribe(setmax);
                                if (this.error.get() != null) {
                                    settitlebackgroundimage.clear();
                                    cancelAll();
                                    errorAll(griverProgressBar);
                                    return;
                                }
                                try {
                                    griverProgressBar.onNext(setRefreshAnimation.getMax(this.resultSelector.setMax(poll, length), "The resultSelector returned a null value"));
                                    for (TRight onNext : this.rights.values()) {
                                        length.onNext(onNext);
                                    }
                                } catch (Throwable th) {
                                    fail(th, griverProgressBar, settitlebackgroundimage);
                                    return;
                                }
                            } catch (Throwable th2) {
                                fail(th2, griverProgressBar, settitlebackgroundimage);
                                return;
                            }
                        } else if (num == RIGHT_VALUE) {
                            int i3 = this.rightIndex;
                            this.rightIndex = i3 + 1;
                            this.rights.put(Integer.valueOf(i3), poll);
                            try {
                                TitleBarRightButtonView.AnonymousClass4 r72 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.rightEnd.apply(poll), "The rightEnd returned a null ObservableSource");
                                setMax setmax2 = new setMax(this, false, i3);
                                this.disposables.getMin(setmax2);
                                r72.subscribe(setmax2);
                                if (this.error.get() != null) {
                                    settitlebackgroundimage.clear();
                                    cancelAll();
                                    errorAll(griverProgressBar);
                                    return;
                                }
                                for (getDynamicDataEncryptComp<TRight> onNext2 : this.lefts.values()) {
                                    onNext2.onNext(poll);
                                }
                            } catch (Throwable th3) {
                                fail(th3, griverProgressBar, settitlebackgroundimage);
                                return;
                            }
                        } else if (num == LEFT_CLOSE) {
                            setMax setmax3 = (setMax) poll;
                            getDynamicDataEncryptComp remove = this.lefts.remove(Integer.valueOf(setmax3.index));
                            this.disposables.setMin((GriverProgressBar.UpdateRunnable) setmax3);
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == RIGHT_CLOSE) {
                            setMax setmax4 = (setMax) poll;
                            this.rights.remove(Integer.valueOf(setmax4.index));
                            this.disposables.setMin((GriverProgressBar.UpdateRunnable) setmax4);
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                settitlebackgroundimage.clear();
            }
        }

        public final void innerError(Throwable th) {
            if (utAvaiable.length(this.error, th)) {
                this.active.decrementAndGet();
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void innerComplete(getMin getmin) {
            this.disposables.setMax(getmin);
            this.active.decrementAndGet();
            drain();
        }

        public final void innerValue(boolean z, Object obj) {
            synchronized (this) {
                this.queue.setMax(z ? LEFT_VALUE : RIGHT_VALUE, obj);
            }
            drain();
        }

        public final void innerClose(boolean z, setMax setmax) {
            synchronized (this) {
                this.queue.setMax(z ? LEFT_CLOSE : RIGHT_CLOSE, setmax);
            }
            drain();
        }

        public final void innerCloseError(Throwable th) {
            if (utAvaiable.length(this.error, th)) {
                drain();
            } else {
                SecuritySignature.getMax(th);
            }
        }
    }

    static final class getMin extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<Object>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final setMin parent;

        getMin(setMin setmin, boolean z) {
            this.parent = setmin;
            this.isLeft = z;
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        public final void onError(Throwable th) {
            this.parent.innerError(th);
        }

        public final void onComplete() {
            this.parent.innerComplete(this);
        }
    }

    static final class setMax extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<Object>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final setMin parent;

        setMax(setMin setmin, boolean z, int i) {
            this.parent = setmin;
            this.isLeft = z;
            this.index = i;
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onNext(Object obj) {
            if (DisposableHelper.dispose(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        public final void onError(Throwable th) {
            this.parent.innerCloseError(th);
        }

        public final void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }
    }
}
