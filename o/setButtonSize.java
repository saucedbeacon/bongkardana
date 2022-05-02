package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setButtonSize<T, B, V> extends onLoadMoreStateChanged<T, TitleBarRightButtonView.AnonymousClass1<T>> {
    final RedDotDrawable<? super B, ? extends TitleBarRightButtonView.AnonymousClass4<V>> getMax;
    final int getMin;
    final TitleBarRightButtonView.AnonymousClass4<B> length;

    public setButtonSize(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass4<B> r2, RedDotDrawable<? super B, ? extends TitleBarRightButtonView.AnonymousClass4<V>> redDotDrawable, int i) {
        super(r1);
        this.length = r2;
        this.getMax = redDotDrawable;
        this.getMin = i;
    }

    public final void subscribeActual(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar) {
        this.setMin.subscribe(new length(new SecurityStorage(griverProgressBar), this.length, this.getMax, this.getMin));
    }

    static final class length<T, B, V> extends setTargetScrollWithLayout<T, Object, TitleBarRightButtonView.AnonymousClass1<T>> implements GriverProgressBar.UpdateRunnable {
        final AtomicLong FastBitmap$CoordinateSystem = new AtomicLong();
        final int IsOverlapping;
        final RedDotDrawable<? super B, ? extends TitleBarRightButtonView.AnonymousClass4<V>> equals;
        final AtomicBoolean hashCode = new AtomicBoolean();
        final AtomicReference<GriverProgressBar.UpdateRunnable> toDoubleRange = new AtomicReference<>();
        final TitleBarRightButtonView.AnonymousClass4<B> toFloatRange;
        final IRedDotManager toIntRange;
        GriverProgressBar.UpdateRunnable toString;
        final List<getDynamicDataEncryptComp<T>> values;

        public final void setMin(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, Object obj) {
        }

        length(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass1<T>> griverProgressBar, TitleBarRightButtonView.AnonymousClass4<B> r3, RedDotDrawable<? super B, ? extends TitleBarRightButtonView.AnonymousClass4<V>> redDotDrawable, int i) {
            super(griverProgressBar, new initTitleSegControl());
            this.toFloatRange = r3;
            this.equals = redDotDrawable;
            this.IsOverlapping = i;
            this.toIntRange = new IRedDotManager();
            this.values = new ArrayList();
            this.FastBitmap$CoordinateSystem.lazySet(1);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.toString, updateRunnable)) {
                this.toString = updateRunnable;
                this.length.onSubscribe(this);
                if (!this.hashCode.get()) {
                    getMax getmax = new getMax(this);
                    if (this.toDoubleRange.compareAndSet((Object) null, getmax)) {
                        this.toFloatRange.subscribe(getmax);
                    }
                }
            }
        }

        public final void onNext(T t) {
            if (setMax()) {
                for (getDynamicDataEncryptComp<T> onNext : this.values) {
                    onNext.onNext(t);
                }
                if (this.isInside.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                this.setMin.offer(NotificationLite.next(t));
                if (!length()) {
                    return;
                }
            }
            isInside();
        }

        public final void onError(Throwable th) {
            if (this.setMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.getMax = th;
            this.setMax = true;
            if (length()) {
                isInside();
            }
            if (this.FastBitmap$CoordinateSystem.decrementAndGet() == 0) {
                this.toIntRange.dispose();
            }
            this.length.onError(th);
        }

        public final void onComplete() {
            if (!this.setMax) {
                this.setMax = true;
                if (length()) {
                    isInside();
                }
                if (this.FastBitmap$CoordinateSystem.decrementAndGet() == 0) {
                    this.toIntRange.dispose();
                }
                this.length.onComplete();
            }
        }

        public final void dispose() {
            if (this.hashCode.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.toDoubleRange);
                if (this.FastBitmap$CoordinateSystem.decrementAndGet() == 0) {
                    this.toString.dispose();
                }
            }
        }

        public final boolean isDisposed() {
            return this.hashCode.get();
        }

        /* access modifiers changed from: package-private */
        public final void isInside() {
            initTitleSegControl inittitlesegcontrol = (initTitleSegControl) this.setMin;
            GriverProgressBar griverProgressBar = this.length;
            List<getDynamicDataEncryptComp<T>> list = this.values;
            int i = 1;
            while (true) {
                boolean z = this.setMax;
                Object poll = inittitlesegcontrol.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    this.toIntRange.dispose();
                    DisposableHelper.dispose(this.toDoubleRange);
                    Throwable th = this.getMax;
                    if (th != null) {
                        for (getDynamicDataEncryptComp<T> onError : list) {
                            onError.onError(th);
                        }
                    } else {
                        for (getDynamicDataEncryptComp<T> onComplete : list) {
                            onComplete.onComplete();
                        }
                    }
                    list.clear();
                    return;
                } else if (z2) {
                    i = this.isInside.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll instanceof getMin) {
                    getMin getmin = (getMin) poll;
                    if (getmin.getMax != null) {
                        if (list.remove(getmin.getMax)) {
                            getmin.getMax.onComplete();
                            if (this.FastBitmap$CoordinateSystem.decrementAndGet() == 0) {
                                this.toIntRange.dispose();
                                DisposableHelper.dispose(this.toDoubleRange);
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.hashCode.get()) {
                        getDynamicDataEncryptComp min = getDynamicDataEncryptComp.setMin(this.IsOverlapping);
                        list.add(min);
                        griverProgressBar.onNext(min);
                        try {
                            TitleBarRightButtonView.AnonymousClass4 r6 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.equals.apply(getmin.setMax), "The ObservableSource supplied is null");
                            setMax setmax = new setMax(this, min);
                            if (this.toIntRange.getMin(setmax)) {
                                this.FastBitmap$CoordinateSystem.getAndIncrement();
                                r6.subscribe(setmax);
                            }
                        } catch (Throwable th2) {
                            registerNode.getMax(th2);
                            this.hashCode.set(true);
                            griverProgressBar.onError(th2);
                        }
                    }
                } else {
                    for (getDynamicDataEncryptComp<T> onNext : list) {
                        onNext.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }
    }

    static final class getMin<T, B> {
        final getDynamicDataEncryptComp<T> getMax;
        final B setMax;

        getMin(getDynamicDataEncryptComp<T> getdynamicdataencryptcomp, B b) {
            this.getMax = getdynamicdataencryptcomp;
            this.setMax = b;
        }
    }

    static final class getMax<T, B> extends setGlobalUserData<B> {
        final length<T, B, ?> getMin;

        getMax(length<T, B, ?> length) {
            this.getMin = length;
        }

        public final void onNext(B b) {
            length<T, B, ?> length = this.getMin;
            length.setMin.offer(new getMin((getDynamicDataEncryptComp) null, b));
            if (length.length()) {
                length.isInside();
            }
        }

        public final void onError(Throwable th) {
            length<T, B, ?> length = this.getMin;
            length.toString.dispose();
            length.toIntRange.dispose();
            length.onError(th);
        }

        public final void onComplete() {
            this.getMin.onComplete();
        }
    }

    static final class setMax<T, V> extends setGlobalUserData<V> {
        final getDynamicDataEncryptComp<T> length;
        final length<T, ?, V> setMax;
        boolean setMin;

        setMax(length<T, ?, V> length2, getDynamicDataEncryptComp<T> getdynamicdataencryptcomp) {
            this.setMax = length2;
            this.length = getdynamicdataencryptcomp;
        }

        public final void onNext(V v) {
            dispose();
            onComplete();
        }

        public final void onError(Throwable th) {
            if (this.setMin) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMin = true;
            length<T, ?, V> length2 = this.setMax;
            length2.toString.dispose();
            length2.toIntRange.dispose();
            length2.onError(th);
        }

        public final void onComplete() {
            if (!this.setMin) {
                this.setMin = true;
                length<T, ?, V> length2 = this.setMax;
                length2.toIntRange.setMax(this);
                length2.setMin.offer(new getMin(this.length, null));
                if (length2.length()) {
                    length2.isInside();
                }
            }
        }
    }
}
