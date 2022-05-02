package o;

import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class setCompoundDrawables<T> implements Runnable {
    public final setAttachListener<T> length = setAttachListener.length();

    /* access modifiers changed from: package-private */
    @WorkerThread
    public abstract T length();

    public void run() {
        try {
            this.length.getMax(length());
        } catch (Throwable th) {
            this.length.getMin(th);
        }
    }
}
