package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class loadImageAsync<T> extends SecurityCipher<T> implements getLoadMoreTipView {
    static final getMax length = new loadImageAsync$FastBitmap$CoordinateSystem();
    final getMax<T> getMax;
    final TitleBarRightButtonView.AnonymousClass4<T> getMin;
    final TitleBarRightButtonView.AnonymousClass4<T> setMax;
    final AtomicReference<toFloatRange<T>> setMin;

    interface equals<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(length<T> length);
    }

    interface getMax<T> {
        equals<T> length();
    }

    public static <U, R> TitleBarRightButtonView.AnonymousClass1<R> getMax(Callable<? extends SecurityCipher<U>> callable, RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1<U>, ? extends TitleBarRightButtonView.AnonymousClass4<R>> redDotDrawable) {
        setMax setmax = new setMax(callable, redDotDrawable);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable2 = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable2 != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, setmax) : setmax;
    }

    public static <T> SecurityCipher<T> getMax(SecurityCipher<T> securityCipher, hasCornerMarking hascornermarking) {
        IsOverlapping isOverlapping = new IsOverlapping(securityCipher, securityCipher.observeOn(hascornermarking));
        RedDotDrawable<? super SecurityCipher, ? extends SecurityCipher> redDotDrawable = SecuritySignature.toDoubleRange;
        return redDotDrawable != null ? (SecurityCipher) SecuritySignature.getMax(redDotDrawable, isOverlapping) : isOverlapping;
    }

    public static <T> SecurityCipher<T> getMin(TitleBarRightButtonView.AnonymousClass4<? extends T> r1) {
        return getMin(r1, length);
    }

    public static <T> SecurityCipher<T> getMin(TitleBarRightButtonView.AnonymousClass4<T> r7, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking, int i) {
        return getMin(r7, new toDoubleRange(i, j, timeUnit, hascornermarking));
    }

    private static <T> SecurityCipher<T> getMin(TitleBarRightButtonView.AnonymousClass4<T> r3, getMax<T> getmax) {
        AtomicReference atomicReference = new AtomicReference();
        loadImageAsync loadimageasync = new loadImageAsync(new toString(atomicReference, getmax), r3, atomicReference, getmax);
        RedDotDrawable<? super SecurityCipher, ? extends SecurityCipher> redDotDrawable = SecuritySignature.toDoubleRange;
        return redDotDrawable != null ? (SecurityCipher) SecuritySignature.getMax(redDotDrawable, loadimageasync) : loadimageasync;
    }

    private loadImageAsync(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass4<T> r2, AtomicReference<toFloatRange<T>> atomicReference, getMax<T> getmax) {
        this.setMax = r1;
        this.getMin = r2;
        this.setMin = atomicReference;
        this.getMax = getmax;
    }

    public final void setMin(GriverProgressBar.UpdateRunnable updateRunnable) {
        this.setMin.compareAndSet((toFloatRange) updateRunnable, (Object) null);
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMax.subscribe(griverProgressBar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(o.RedDotManager<? super o.GriverProgressBar.UpdateRunnable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<o.loadImageAsync$toFloatRange<T>> r0 = r4.setMin
            java.lang.Object r0 = r0.get()
            o.loadImageAsync$toFloatRange r0 = (o.loadImageAsync.toFloatRange) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0024
        L_0x0010:
            o.loadImageAsync$getMax<T> r1 = r4.getMax
            o.loadImageAsync$equals r1 = r1.length()
            o.loadImageAsync$toFloatRange r2 = new o.loadImageAsync$toFloatRange
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<o.loadImageAsync$toFloatRange<T>> r1 = r4.setMin
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x0000
            r0 = r2
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0038
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.shouldConnect
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            r5.accept(r0)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0043
            o.TitleBarRightButtonView$4<T> r5 = r4.getMin
            r5.subscribe(r0)
        L_0x0043:
            return
        L_0x0044:
            r5 = move-exception
            if (r1 == 0) goto L_0x004c
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.shouldConnect
            r0.compareAndSet(r2, r3)
        L_0x004c:
            o.registerNode.getMax(r5)
            java.lang.RuntimeException r5 = o.utAvaiable.getMin(r5)
            goto L_0x0055
        L_0x0054:
            throw r5
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: o.loadImageAsync.setMin(o.RedDotManager):void");
    }

    static final class toFloatRange<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        static final length[] EMPTY = new length[0];
        static final length[] TERMINATED = new length[0];
        private static final long serialVersionUID = -533785617179540163L;
        final equals<T> buffer;
        boolean done;
        final AtomicReference<length[]> observers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        toFloatRange(equals<T> equals) {
            this.buffer = equals;
        }

        public final boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        public final void dispose() {
            this.observers.set(TERMINATED);
            DisposableHelper.dispose(this);
        }

        /* access modifiers changed from: package-private */
        public final boolean add(length<T> length) {
            length[] lengthArr;
            length[] lengthArr2;
            do {
                lengthArr = this.observers.get();
                if (lengthArr == TERMINATED) {
                    return false;
                }
                int length2 = lengthArr.length;
                lengthArr2 = new length[(length2 + 1)];
                System.arraycopy(lengthArr, 0, lengthArr2, 0, length2);
                lengthArr2[length2] = length;
            } while (!this.observers.compareAndSet(lengthArr, lengthArr2));
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void remove(length<T> length) {
            length[] lengthArr;
            length[] lengthArr2;
            do {
                lengthArr = this.observers.get();
                int length2 = lengthArr.length;
                if (length2 != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        } else if (lengthArr[i2].equals(length)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length2 == 1) {
                            lengthArr2 = EMPTY;
                        } else {
                            length[] lengthArr3 = new length[(length2 - 1)];
                            System.arraycopy(lengthArr, 0, lengthArr3, 0, i);
                            System.arraycopy(lengthArr, i + 1, lengthArr3, i, (length2 - i) - 1);
                            lengthArr2 = lengthArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.observers.compareAndSet(lengthArr, lengthArr2));
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable)) {
                replay();
            }
        }

        public final void onNext(T t) {
            if (!this.done) {
                this.buffer.next(t);
                replay();
            }
        }

        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th);
                replayFinal();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            if (!this.done) {
                this.done = true;
                this.buffer.complete();
                replayFinal();
            }
        }

        /* access modifiers changed from: package-private */
        public final void replay() {
            for (length replay : this.observers.get()) {
                this.buffer.replay(replay);
            }
        }

        /* access modifiers changed from: package-private */
        public final void replayFinal() {
            for (length replay : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(replay);
            }
        }
    }

    static final class length<T> extends AtomicInteger implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final GriverProgressBar<? super T> child;
        Object index;
        final toFloatRange<T> parent;

        length(toFloatRange<T> tofloatrange, GriverProgressBar<? super T> griverProgressBar) {
            this.parent = tofloatrange;
            this.child = griverProgressBar;
        }

        public final boolean isDisposed() {
            return this.cancelled;
        }

        public final void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.parent.remove(this);
                this.index = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final <U> U index() {
            return this.index;
        }
    }

    static final class invoke<T> extends ArrayList<Object> implements equals<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        invoke(int i) {
            super(i);
        }

        public final void next(T t) {
            add(NotificationLite.next(t));
            this.size++;
        }

        public final void error(Throwable th) {
            add(NotificationLite.error(th));
            this.size++;
        }

        public final void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        public final void replay(length<T> length) {
            if (length.getAndIncrement() == 0) {
                GriverProgressBar<? super T> griverProgressBar = length.child;
                int i = 1;
                while (!length.isDisposed()) {
                    int i2 = this.size;
                    Integer num = (Integer) length.index();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!NotificationLite.accept(get(intValue), griverProgressBar) && !length.isDisposed()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    length.index = Integer.valueOf(intValue);
                    i = length.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    static final class isInside extends AtomicReference<isInside> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        isInside(Object obj) {
            this.value = obj;
        }
    }

    static abstract class getMin<T> extends AtomicReference<isInside> implements equals<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        isInside tail;

        /* access modifiers changed from: package-private */
        public Object enterTransform(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public Object leaveTransform(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public abstract void truncate();

        getMin() {
            isInside isinside = new isInside((Object) null);
            this.tail = isinside;
            set(isinside);
        }

        /* access modifiers changed from: package-private */
        public final void addLast(isInside isinside) {
            this.tail.set(isinside);
            this.tail = isinside;
            this.size++;
        }

        /* access modifiers changed from: package-private */
        public final void removeFirst() {
            this.size--;
            setFirst((isInside) ((isInside) get()).get());
        }

        /* access modifiers changed from: package-private */
        public final void trimHead() {
            isInside isinside = (isInside) get();
            if (isinside.value != null) {
                isInside isinside2 = new isInside((Object) null);
                isinside2.lazySet(isinside.get());
                set(isinside2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void removeSome(int i) {
            isInside isinside = (isInside) get();
            while (i > 0) {
                isinside = (isInside) isinside.get();
                i--;
                this.size--;
            }
            setFirst(isinside);
            isInside isinside2 = (isInside) get();
            if (isinside2.get() == null) {
                this.tail = isinside2;
            }
        }

        /* access modifiers changed from: package-private */
        public final void setFirst(isInside isinside) {
            set(isinside);
        }

        public final void next(T t) {
            addLast(new isInside(enterTransform(NotificationLite.next(t))));
            truncate();
        }

        public final void error(Throwable th) {
            addLast(new isInside(enterTransform(NotificationLite.error(th))));
            truncateFinal();
        }

        public final void complete() {
            addLast(new isInside(enterTransform(NotificationLite.complete())));
            truncateFinal();
        }

        public final void replay(length<T> length) {
            if (length.getAndIncrement() == 0) {
                int i = 1;
                do {
                    isInside isinside = (isInside) length.index();
                    if (isinside == null) {
                        isinside = getHead();
                        length.index = isinside;
                    }
                    while (!length.isDisposed()) {
                        isInside isinside2 = (isInside) isinside.get();
                        if (isinside2 == null) {
                            length.index = isinside;
                            i = length.addAndGet(-i);
                        } else if (NotificationLite.accept(leaveTransform(isinside2.value), length.child)) {
                            length.index = null;
                            return;
                        } else {
                            isinside = isinside2;
                        }
                    }
                    length.index = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        public void truncateFinal() {
            trimHead();
        }

        /* access modifiers changed from: package-private */
        public final void collect(Collection<? super T> collection) {
            isInside head = getHead();
            while (true) {
                head = (isInside) head.get();
                if (head != null) {
                    Object leaveTransform = leaveTransform(head.value);
                    if (!NotificationLite.isComplete(leaveTransform) && !NotificationLite.isError(leaveTransform)) {
                        collection.add(NotificationLite.getValue(leaveTransform));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean hasError() {
            return this.tail.value != null && NotificationLite.isError(leaveTransform(this.tail.value));
        }

        /* access modifiers changed from: package-private */
        public boolean hasCompleted() {
            return this.tail.value != null && NotificationLite.isComplete(leaveTransform(this.tail.value));
        }

        /* access modifiers changed from: package-private */
        public isInside getHead() {
            return (isInside) get();
        }
    }

    static final class values<T> extends getMin<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        values(int i) {
            this.limit = i;
        }

        /* access modifiers changed from: package-private */
        public final void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    static final class hashCode<T> extends getMin<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final hasCornerMarking scheduler;
        final TimeUnit unit;

        hashCode(int i, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
            this.scheduler = hascornermarking;
            this.limit = i;
            this.maxAge = j;
            this.unit = timeUnit;
        }

        /* access modifiers changed from: package-private */
        public final Object enterTransform(Object obj) {
            return new SecException(obj, this.scheduler.now(this.unit), this.unit);
        }

        /* access modifiers changed from: package-private */
        public final Object leaveTransform(Object obj) {
            return ((SecException) obj).setMin;
        }

        /* access modifiers changed from: package-private */
        public final void truncate() {
            isInside isinside;
            long now = this.scheduler.now(this.unit) - this.maxAge;
            isInside isinside2 = (isInside) get();
            isInside isinside3 = (isInside) isinside2.get();
            int i = 0;
            while (true) {
                isInside isinside4 = isinside3;
                isinside = isinside2;
                isinside2 = isinside4;
                if (isinside2 == null) {
                    break;
                } else if (this.size <= this.limit || this.size <= 1) {
                    if (((SecException) isinside2.value).getMax > now) {
                        break;
                    }
                    i++;
                    this.size--;
                    isinside3 = (isInside) isinside2.get();
                } else {
                    i++;
                    this.size--;
                    isinside3 = (isInside) isinside2.get();
                }
            }
            if (i != 0) {
                setFirst(isinside);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void truncateFinal() {
            /*
                r10 = this;
                o.hasCornerMarking r0 = r10.scheduler
                java.util.concurrent.TimeUnit r1 = r10.unit
                long r0 = r0.now(r1)
                long r2 = r10.maxAge
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                o.loadImageAsync$isInside r2 = (o.loadImageAsync.isInside) r2
                java.lang.Object r3 = r2.get()
                o.loadImageAsync$isInside r3 = (o.loadImageAsync.isInside) r3
                r4 = 0
            L_0x0018:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L_0x003a
                int r5 = r10.size
                r6 = 1
                if (r5 <= r6) goto L_0x003a
                java.lang.Object r5 = r2.value
                o.SecException r5 = (o.SecException) r5
                long r7 = r5.getMax
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L_0x003a
                int r4 = r4 + 1
                int r3 = r10.size
                int r3 = r3 - r6
                r10.size = r3
                java.lang.Object r3 = r2.get()
                o.loadImageAsync$isInside r3 = (o.loadImageAsync.isInside) r3
                goto L_0x0018
            L_0x003a:
                if (r4 == 0) goto L_0x003f
                r10.setFirst(r3)
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.loadImageAsync.hashCode.truncateFinal():void");
        }

        /* access modifiers changed from: package-private */
        public final isInside getHead() {
            isInside isinside;
            long now = this.scheduler.now(this.unit) - this.maxAge;
            isInside isinside2 = (isInside) get();
            Object obj = isinside2.get();
            while (true) {
                isInside isinside3 = (isInside) obj;
                isinside = isinside2;
                isinside2 = isinside3;
                if (isinside2 == null) {
                    break;
                }
                SecException secException = (SecException) isinside2.value;
                if (NotificationLite.isComplete(secException.setMin) || NotificationLite.isError(secException.setMin) || secException.getMax > now) {
                    break;
                }
                obj = isinside2.get();
            }
            return isinside;
        }
    }

    static final class setMin<R> implements RedDotManager<GriverProgressBar.UpdateRunnable> {
        private final getSubTitleView<R> setMax;

        public final /* synthetic */ void accept(Object obj) throws Exception {
            this.setMax.setResource((GriverProgressBar.UpdateRunnable) obj);
        }

        setMin(getSubTitleView<R> getsubtitleview) {
            this.setMax = getsubtitleview;
        }
    }

    static final class toIntRange<T> implements getMax<T> {
        private final int length;

        toIntRange(int i) {
            this.length = i;
        }

        public final equals<T> length() {
            return new values(this.length);
        }
    }

    static final class toDoubleRange<T> implements getMax<T> {
        private final long getMax;
        private final int getMin;
        private final TimeUnit length;
        private final hasCornerMarking setMax;

        toDoubleRange(int i, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
            this.getMin = i;
            this.getMax = j;
            this.length = timeUnit;
            this.setMax = hascornermarking;
        }

        public final equals<T> length() {
            return new hashCode(this.getMin, this.getMax, this.length, this.setMax);
        }
    }

    static final class toString<T> implements TitleBarRightButtonView.AnonymousClass4<T> {
        private final getMax<T> setMax;
        private final AtomicReference<toFloatRange<T>> setMin;

        toString(AtomicReference<toFloatRange<T>> atomicReference, getMax<T> getmax) {
            this.setMin = atomicReference;
            this.setMax = getmax;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void subscribe(o.GriverProgressBar<? super T> r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<o.loadImageAsync$toFloatRange<T>> r0 = r3.setMin
                java.lang.Object r0 = r0.get()
                o.loadImageAsync$toFloatRange r0 = (o.loadImageAsync.toFloatRange) r0
                if (r0 != 0) goto L_0x001f
                o.loadImageAsync$getMax<T> r0 = r3.setMax
                o.loadImageAsync$equals r0 = r0.length()
                o.loadImageAsync$toFloatRange r1 = new o.loadImageAsync$toFloatRange
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<o.loadImageAsync$toFloatRange<T>> r0 = r3.setMin
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 == 0) goto L_0x0000
                r0 = r1
            L_0x001f:
                o.loadImageAsync$length r1 = new o.loadImageAsync$length
                r1.<init>(r0, r4)
                r4.onSubscribe(r1)
                r0.add(r1)
                boolean r4 = r1.isDisposed()
                if (r4 == 0) goto L_0x0034
                r0.remove(r1)
                return
            L_0x0034:
                o.loadImageAsync$equals<T> r4 = r0.buffer
                r4.replay(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.loadImageAsync.toString.subscribe(o.GriverProgressBar):void");
        }
    }

    static final class setMax<R, U> extends TitleBarRightButtonView.AnonymousClass1<R> {
        private final Callable<? extends SecurityCipher<U>> getMax;
        private final RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1<U>, ? extends TitleBarRightButtonView.AnonymousClass4<R>> getMin;

        setMax(Callable<? extends SecurityCipher<U>> callable, RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1<U>, ? extends TitleBarRightButtonView.AnonymousClass4<R>> redDotDrawable) {
            this.getMax = callable;
            this.getMin = redDotDrawable;
        }

        public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
            try {
                SecurityCipher securityCipher = (SecurityCipher) setRefreshAnimation.getMax(this.getMax.call(), "The connectableFactory returned a null ConnectableObservable");
                TitleBarRightButtonView.AnonymousClass4 r1 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.getMin.apply(securityCipher), "The selector returned a null ObservableSource");
                getSubTitleView getsubtitleview = new getSubTitleView(griverProgressBar);
                r1.subscribe(getsubtitleview);
                securityCipher.setMin(new setMin(getsubtitleview));
            } catch (Throwable th) {
                registerNode.getMax(th);
                EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
            }
        }
    }

    static final class IsOverlapping<T> extends SecurityCipher<T> {
        private final TitleBarRightButtonView.AnonymousClass1<T> getMin;
        private final SecurityCipher<T> setMin;

        IsOverlapping(SecurityCipher<T> securityCipher, TitleBarRightButtonView.AnonymousClass1<T> r2) {
            this.setMin = securityCipher;
            this.getMin = r2;
        }

        public final void setMin(RedDotManager<? super GriverProgressBar.UpdateRunnable> redDotManager) {
            this.setMin.setMin(redDotManager);
        }

        public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
            this.getMin.subscribe(griverProgressBar);
        }
    }

    public static <T> SecurityCipher<T> getMin(TitleBarRightButtonView.AnonymousClass4<T> r1, int i) {
        return i == Integer.MAX_VALUE ? getMin(r1, length) : getMin(r1, new toIntRange(i));
    }

    public static <T> SecurityCipher<T> length(TitleBarRightButtonView.AnonymousClass4<T> r7, long j, TimeUnit timeUnit, hasCornerMarking hascornermarking) {
        return getMin(r7, new toDoubleRange(Integer.MAX_VALUE, j, timeUnit, hascornermarking));
    }
}
