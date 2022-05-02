package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

public final class StyleRes {
    @NonNull
    public static Handler setMin(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return setMin.setMin(looper);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper);
    }

    @RequiresApi(28)
    static class setMin {
        public static Handler setMin(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
