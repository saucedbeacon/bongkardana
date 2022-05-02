package o;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class checkOnClickListener extends Editable.Factory {
    private static final Object getMax = new Object();
    @Nullable
    private static Class<?> getMin;
    @GuardedBy("sInstanceLock")
    private static volatile Editable.Factory length;

    @SuppressLint({"PrivateApi"})
    private checkOnClickListener() {
        try {
            getMin = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory setMin() {
        if (length == null) {
            synchronized (getMax) {
                if (length == null) {
                    length = new checkOnClickListener();
                }
            }
        }
        return length;
    }

    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = getMin;
        return cls != null ? new onBoundsChange(cls, charSequence) : super.newEditable(charSequence);
    }
}
