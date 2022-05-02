package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class areNotificationsEnabled<I, O> {
    @Nullable
    public setMin<O> length(@NonNull Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @NonNull
    public abstract Intent setMax(@NonNull Context context, @SuppressLint({"UnknownNullness"}) I i);

    @SuppressLint({"UnknownNullness"})
    public abstract O setMin(int i, @Nullable Intent intent);

    public static final class setMin<T> {
        @SuppressLint({"UnknownNullness"})
        public final T getMin;

        public setMin(@SuppressLint({"UnknownNullness"}) T t) {
            this.getMin = t;
        }
    }
}
