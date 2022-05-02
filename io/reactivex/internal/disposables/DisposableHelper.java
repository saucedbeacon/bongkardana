package io.reactivex.internal.disposables;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.SecuritySignature;
import o.setRefreshAnimation;

public enum DisposableHelper implements GriverProgressBar.UpdateRunnable {
    DISPOSED;

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    public static boolean isDisposed(GriverProgressBar.UpdateRunnable updateRunnable) {
        return updateRunnable == DISPOSED;
    }

    public static boolean set(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference, GriverProgressBar.UpdateRunnable updateRunnable) {
        GriverProgressBar.UpdateRunnable updateRunnable2;
        do {
            updateRunnable2 = atomicReference.get();
            if (updateRunnable2 == DISPOSED) {
                if (updateRunnable == null) {
                    return false;
                }
                updateRunnable.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(updateRunnable2, updateRunnable));
        if (updateRunnable2 == null) {
            return true;
        }
        updateRunnable2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference, GriverProgressBar.UpdateRunnable updateRunnable) {
        setRefreshAnimation.getMax(updateRunnable, "d is null");
        if (atomicReference.compareAndSet((Object) null, updateRunnable)) {
            return true;
        }
        updateRunnable.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean replace(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference, GriverProgressBar.UpdateRunnable updateRunnable) {
        GriverProgressBar.UpdateRunnable updateRunnable2;
        do {
            updateRunnable2 = atomicReference.get();
            if (updateRunnable2 == DISPOSED) {
                if (updateRunnable == null) {
                    return false;
                }
                updateRunnable.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(updateRunnable2, updateRunnable));
        return true;
    }

    public static boolean dispose(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference) {
        GriverProgressBar.UpdateRunnable andSet;
        GriverProgressBar.UpdateRunnable updateRunnable = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (updateRunnable == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean validate(GriverProgressBar.UpdateRunnable updateRunnable, GriverProgressBar.UpdateRunnable updateRunnable2) {
        if (updateRunnable2 == null) {
            SecuritySignature.getMax((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (updateRunnable == null) {
            return true;
        } else {
            updateRunnable2.dispose();
            reportDisposableSet();
            return false;
        }
    }

    public static void reportDisposableSet() {
        SecuritySignature.getMax((Throwable) new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean trySet(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference, GriverProgressBar.UpdateRunnable updateRunnable) {
        if (atomicReference.compareAndSet((Object) null, updateRunnable)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        updateRunnable.dispose();
        return false;
    }
}
