package o;

import android.os.Looper;
import androidx.annotation.RestrictTo;
import io.reactivex.internal.functions.Functions;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AudioAttributesImplBaseParcelizer {
    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean checkMainThread(GriverProgressBar<?> griverProgressBar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        Runnable runnable = Functions.getMin;
        setRefreshAnimation.getMax(runnable, "run is null");
        griverProgressBar.onSubscribe(new OnStateChangeListener(runnable));
        StringBuilder sb = new StringBuilder("Expected to be called on the main thread but was ");
        sb.append(Thread.currentThread().getName());
        griverProgressBar.onError(new IllegalStateException(sb.toString()));
        return false;
    }

    private AudioAttributesImplBaseParcelizer() {
        throw new AssertionError("No instances.");
    }
}
