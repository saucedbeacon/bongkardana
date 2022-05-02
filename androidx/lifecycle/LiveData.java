package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.Map;
import o.onMeasure;
import o.setChecked;
import o.setPopupCallback;
import o.skipToQueueItem;
import o.stop;

public abstract class LiveData<T> {
    public static final Object setMax = new Object();
    private boolean IsOverlapping;
    public int equals;
    final Object getMax;
    public stop<onMeasure<? super T>, LiveData<T>.setMin> getMin;
    private boolean isInside;
    int length;
    public volatile Object setMin;
    private final Runnable toDoubleRange;
    volatile Object toFloatRange;
    private boolean toIntRange;

    public void getMax() {
    }

    public void length() {
    }

    public LiveData(T t) {
        this.getMax = new Object();
        this.getMin = new stop<>();
        this.length = 0;
        this.toFloatRange = setMax;
        this.toDoubleRange = new Runnable() {
            public final void run() {
                Object obj;
                synchronized (LiveData.this.getMax) {
                    obj = LiveData.this.toFloatRange;
                    LiveData.this.toFloatRange = LiveData.setMax;
                }
                LiveData.this.getMax(obj);
            }
        };
        this.setMin = t;
        this.equals = 0;
    }

    public LiveData() {
        this.getMax = new Object();
        this.getMin = new stop<>();
        this.length = 0;
        this.toFloatRange = setMax;
        this.toDoubleRange = new Runnable() {
            public final void run() {
                Object obj;
                synchronized (LiveData.this.getMax) {
                    obj = LiveData.this.toFloatRange;
                    LiveData.this.toFloatRange = LiveData.setMax;
                }
                LiveData.this.getMax(obj);
            }
        };
        this.setMin = setMax;
        this.equals = -1;
    }

    private void getMax(LiveData<T>.setMin setmin) {
        if (setmin.getMax) {
            if (!setmin.setMin()) {
                setmin.getMax(false);
                return;
            }
            int i = setmin.toFloatRange;
            int i2 = this.equals;
            if (i < i2) {
                setmin.toFloatRange = i2;
                setmin.setMax.onChanged(this.setMin);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@Nullable LiveData<T>.setMin setmin) {
        if (this.toIntRange) {
            this.IsOverlapping = true;
            return;
        }
        this.toIntRange = true;
        do {
            this.IsOverlapping = false;
            if (setmin == null) {
                stop<onMeasure<? super T>, LiveData<T>.setMin> stop = this.getMin;
                stop.setMin setmin2 = new stop.setMin();
                stop.getMin.put(setmin2, Boolean.FALSE);
                while (setmin2.hasNext()) {
                    getMax((LiveData<T>.setMin) (setMin) ((Map.Entry) setmin2.next()).getValue());
                    if (this.IsOverlapping) {
                        break;
                    }
                }
            } else {
                getMax(setmin);
                setmin = null;
            }
        } while (this.IsOverlapping);
        this.toIntRange = false;
    }

    @MainThread
    public final void getMax(@NonNull setChecked setchecked, @NonNull onMeasure<? super T> onmeasure) {
        getMin("observe");
        if (setchecked.getLifecycle().length() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(setchecked, onmeasure);
            setMin length2 = this.getMin.length(onmeasure, lifecycleBoundObserver);
            if (length2 != null && !length2.getMin(setchecked)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (length2 == null) {
                setchecked.getLifecycle().setMax(lifecycleBoundObserver);
            }
        }
    }

    @MainThread
    public final void setMin(@NonNull onMeasure<? super T> onmeasure) {
        getMin("observeForever");
        getMax getmax = new getMax(onmeasure);
        setMin length2 = this.getMin.length(onmeasure, getmax);
        if (length2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (length2 == null) {
            getmax.getMax(true);
        }
    }

    @MainThread
    public void length(@NonNull onMeasure<? super T> onmeasure) {
        getMin("removeObserver");
        setMin length2 = this.getMin.length(onmeasure);
        if (length2 != null) {
            length2.setMax();
            length2.getMax(false);
        }
    }

    public void setMax(T t) {
        boolean z;
        synchronized (this.getMax) {
            z = this.toFloatRange == setMax;
            this.toFloatRange = t;
        }
        if (z) {
            skipToQueueItem.length().setMax.setMax(this.toDoubleRange);
        }
    }

    @MainThread
    public void getMax(T t) {
        getMin("setValue");
        this.equals++;
        this.setMin = t;
        getMin((LiveData<T>.setMin) null);
    }

    public final boolean setMax() {
        return this.getMin.getMax > 0;
    }

    public final boolean setMin() {
        return this.length > 0;
    }

    /* access modifiers changed from: package-private */
    @MainThread
    public final void length(int i) {
        int i2 = this.length;
        this.length = i + i2;
        if (!this.isInside) {
            this.isInside = true;
            while (i2 != this.length) {
                try {
                    boolean z = i2 == 0 && this.length > 0;
                    boolean z2 = i2 > 0 && this.length == 0;
                    int i3 = this.length;
                    if (z) {
                        getMax();
                    } else if (z2) {
                        length();
                    }
                    i2 = i3;
                } finally {
                    this.isInside = false;
                }
            }
        }
    }

    class LifecycleBoundObserver extends LiveData<T>.setMin implements setPopupCallback {
        @NonNull
        final setChecked length;

        LifecycleBoundObserver(@NonNull setChecked setchecked, onMeasure<? super T> onmeasure) {
            super(onmeasure);
            this.length = setchecked;
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin() {
            return this.length.getLifecycle().length().isAtLeast(Lifecycle.State.STARTED);
        }

        public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
            Lifecycle.State length2 = this.length.getLifecycle().length();
            if (length2 == Lifecycle.State.DESTROYED) {
                LiveData.this.length(this.setMax);
                return;
            }
            Lifecycle.State state = null;
            while (state != length2) {
                getMax(setMin());
                state = length2;
                length2 = this.length.getLifecycle().length();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean getMin(setChecked setchecked) {
            return this.length == setchecked;
        }

        /* access modifiers changed from: package-private */
        public final void setMax() {
            this.length.getLifecycle().length(this);
        }
    }

    public abstract class setMin {
        boolean getMax;
        final onMeasure<? super T> setMax;
        int toFloatRange = -1;

        public boolean getMin(setChecked setchecked) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void setMax() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean setMin();

        setMin(onMeasure<? super T> onmeasure) {
            this.setMax = onmeasure;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(boolean z) {
            if (z != this.getMax) {
                this.getMax = z;
                LiveData.this.length(z ? 1 : -1);
                if (this.getMax) {
                    LiveData.this.getMin((LiveData<T>.setMin) this);
                }
            }
        }
    }

    class getMax extends LiveData<T>.setMin {
        /* access modifiers changed from: package-private */
        public final boolean setMin() {
            return true;
        }

        getMax(onMeasure<? super T> onmeasure) {
            super(onmeasure);
        }
    }

    public static void getMin(String str) {
        if (!skipToQueueItem.length().getMin()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
