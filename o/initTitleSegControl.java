package o;

import io.reactivex.annotations.Nullable;
import java.util.concurrent.atomic.AtomicReference;

public final class initTitleSegControl<T> implements getRefreshViewHeight<T> {
    private final AtomicReference<setMax<T>> length = new AtomicReference<>();
    private final AtomicReference<setMax<T>> setMax = new AtomicReference<>();

    public initTitleSegControl() {
        setMax setmax = new setMax();
        this.setMax.lazySet(setmax);
        this.length.getAndSet(setmax);
    }

    public final boolean offer(T t) {
        if (t != null) {
            setMax setmax = new setMax(t);
            this.length.getAndSet(setmax).soNext(setmax);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initTitleSegControl.clear():void");
    }

    static final class setMax<E> extends AtomicReference<setMax<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        setMax() {
        }

        setMax(E e) {
            spValue(e);
        }

        public final E getAndNullValue() {
            E lpValue = lpValue();
            spValue((Object) null);
            return lpValue;
        }

        public final E lpValue() {
            return this.value;
        }

        public final void spValue(E e) {
            this.value = e;
        }

        public final void soNext(setMax<E> setmax) {
            lazySet(setmax);
        }

        public final setMax<E> lvNext() {
            return (setMax) get();
        }
    }

    @Nullable
    public final T poll() {
        setMax lvNext;
        setMax setmax = this.setMax.get();
        setMax lvNext2 = setmax.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            this.setMax.lazySet(lvNext2);
            return andNullValue;
        } else if (setmax == this.length.get()) {
            return null;
        } else {
            do {
                lvNext = setmax.lvNext();
            } while (lvNext == null);
            T andNullValue2 = lvNext.getAndNullValue();
            this.setMax.lazySet(lvNext);
            return andNullValue2;
        }
    }

    public final boolean isEmpty() {
        return this.setMax.get() == this.length.get();
    }
}
