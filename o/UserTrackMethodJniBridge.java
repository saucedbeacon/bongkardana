package o;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class UserTrackMethodJniBridge {
    public static boolean setMax(GriverProgressBar.UpdateRunnable updateRunnable, GriverProgressBar.UpdateRunnable updateRunnable2, Class<?> cls) {
        setRefreshAnimation.getMax(updateRunnable2, "next is null");
        if (updateRunnable == null) {
            return true;
        }
        updateRunnable2.dispose();
        if (updateRunnable == DisposableHelper.DISPOSED) {
            return false;
        }
        String name = cls.getName();
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(name);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(name);
        sb.append(" and subscribe that to the target source instead.");
        SecuritySignature.getMax((Throwable) new ProtocolViolationException(sb.toString()));
        return false;
    }

    public static boolean setMin(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference, GriverProgressBar.UpdateRunnable updateRunnable, Class<?> cls) {
        setRefreshAnimation.getMax(updateRunnable, "next is null");
        if (atomicReference.compareAndSet((Object) null, updateRunnable)) {
            return true;
        }
        updateRunnable.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        String name = cls.getName();
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(name);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(name);
        sb.append(" and subscribe that to the target source instead.");
        SecuritySignature.getMax((Throwable) new ProtocolViolationException(sb.toString()));
        return false;
    }
}
