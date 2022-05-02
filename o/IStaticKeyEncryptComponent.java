package o;

import android.os.Handler;
import android.os.Looper;

public final class IStaticKeyEncryptComponent {
    public static boolean isCurrentThreadMain() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void runInMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
