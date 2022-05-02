package o;

import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

class getSpeedPerPixel<T> {
    Set<T> setMax = new HashSet();

    public void setMin(T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.setMax.add(t);
            return;
        }
        throw new RuntimeException("Can't add an activity when not on the UI thread");
    }

    public void getMax(T t) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.setMax.remove(t);
            return;
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }
}
