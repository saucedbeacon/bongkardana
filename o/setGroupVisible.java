package o;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PageResult;
import java.util.List;
import java.util.concurrent.Executor;
import o.removeItemAtInt;

public abstract class setGroupVisible<Key, Value> extends removeGroup<Key, Value> {
    @GuardedBy("mKeyLock")
    @Nullable
    Key getMax = null;
    @GuardedBy("mKeyLock")
    @Nullable
    Key length = null;
    final Object setMax = new Object();

    public static abstract class length<Key, Value> {
        public abstract void setMin(@NonNull List<Value> list, @Nullable Key key, @Nullable Key key2);
    }

    public static abstract class setMax<Key, Value> {
        public abstract void setMax(@NonNull List<Value> list, @Nullable Key key);
    }

    public abstract void getMax(@NonNull getMin<Key> getmin, @NonNull length<Key, Value> length2);

    /* access modifiers changed from: package-private */
    @Nullable
    public final Key getMin(int i) {
        return null;
    }

    public abstract void setMax(@NonNull toIntRange<Key> tointrange, @NonNull setMax<Key, Value> setmax);

    /* access modifiers changed from: package-private */
    public final boolean setMax() {
        return false;
    }

    @Nullable
    private Key length() {
        Key key;
        synchronized (this.setMax) {
            key = this.getMax;
        }
        return key;
    }

    @Nullable
    private Key getMax() {
        Key key;
        synchronized (this.setMax) {
            key = this.length;
        }
        return key;
    }

    public static class getMin<Key> {
        public final boolean length;
        public final int setMin;

        public getMin(int i, boolean z) {
            this.setMin = i;
            this.length = z;
        }
    }

    public static class toIntRange<Key> {
        @NonNull
        public final Key getMin;
        public final int setMax;

        public toIntRange(@NonNull Key key, int i) {
            this.getMin = key;
            this.setMax = i;
        }
    }

    static class getMax<Key, Value> extends length<Key, Value> {
        final removeItemAtInt.setMax<Value> getMax;
        private final setGroupVisible<Key, Value> getMin;
        private final boolean setMax;

        getMax(@NonNull setGroupVisible<Key, Value> setgroupvisible, boolean z, @NonNull PageResult.setMin<Value> setmin) {
            this.getMax = new removeItemAtInt.setMax<>(setgroupvisible, 0, (Executor) null, setmin);
            this.getMin = setgroupvisible;
            this.setMax = z;
        }

        public final void setMin(@NonNull List<Value> list, @Nullable Key key, @Nullable Key key2) {
            if (!this.getMax.getMax()) {
                setGroupVisible<Key, Value> setgroupvisible = this.getMin;
                synchronized (setgroupvisible.setMax) {
                    setgroupvisible.getMax = key;
                    setgroupvisible.length = key2;
                }
                this.getMax.length(new PageResult(list, 0));
            }
        }
    }

    static class setMin<Key, Value> extends setMax<Key, Value> {
        final removeItemAtInt.setMax<Value> length;
        private final setGroupVisible<Key, Value> setMin;

        setMin(@NonNull setGroupVisible<Key, Value> setgroupvisible, int i, @Nullable Executor executor, @NonNull PageResult.setMin<Value> setmin) {
            this.length = new removeItemAtInt.setMax<>(setgroupvisible, i, executor, setmin);
            this.setMin = setgroupvisible;
        }

        public final void setMax(@NonNull List<Value> list, @Nullable Key key) {
            if (!this.length.getMax()) {
                if (this.length.getMax == 1) {
                    setGroupVisible<Key, Value> setgroupvisible = this.setMin;
                    synchronized (setgroupvisible.setMax) {
                        setgroupvisible.length = key;
                    }
                } else {
                    setGroupVisible<Key, Value> setgroupvisible2 = this.setMin;
                    synchronized (setgroupvisible2.setMax) {
                        setgroupvisible2.getMax = key;
                    }
                }
                this.length.length(new PageResult(list, 0));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void length(int i, int i2, boolean z, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin) {
        getMax getmax = new getMax(this, z, setmin);
        getMax(new getMin(i, z), getmax);
        removeItemAtInt.setMax<Value> setmax = getmax.getMax;
        synchronized (setmax.getMin) {
            setmax.setMin = executor;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMin(int i, int i2, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin) {
        Object max = getMax();
        if (max != null) {
            setMax(new toIntRange(max, i2), new setMin(this, 1, executor, setmin));
        } else {
            setmin.setMin(1, PageResult.getMin());
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax(int i, int i2, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin) {
        Object length2 = length();
        if (length2 != null) {
            new toIntRange(length2, i2);
            new setMin(this, 2, executor, setmin);
            return;
        }
        setmin.setMin(2, PageResult.getMin());
    }
}
