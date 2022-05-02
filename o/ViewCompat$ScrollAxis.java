package o;

import android.content.Context;
import com.facebook.litho.ComponentLifecycle;

public interface ViewCompat$ScrollAxis<T> {
    void getMax(T t);

    void getMin(Context context, ComponentLifecycle componentLifecycle);

    T setMax(Context context, ComponentLifecycle componentLifecycle);
}
