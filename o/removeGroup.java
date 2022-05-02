package o;

import androidx.annotation.NonNull;
import androidx.paging.PageResult;
import java.util.concurrent.Executor;

public abstract class removeGroup<Key, Value> extends removeItemAtInt<Key, Value> {
    public abstract void getMax(int i, int i2, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin);

    public abstract Key getMin(int i);

    /* access modifiers changed from: package-private */
    public final boolean getMin() {
        return true;
    }

    public abstract void length(int i, int i2, boolean z, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin);

    public boolean setMax() {
        return true;
    }

    public abstract void setMin(int i, int i2, @NonNull Executor executor, @NonNull PageResult.setMin<Value> setmin);

    removeGroup() {
    }
}
