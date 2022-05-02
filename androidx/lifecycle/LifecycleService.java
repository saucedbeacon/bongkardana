package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import o.onDetachedFromWindow;
import o.setChecked;

public class LifecycleService extends Service implements setChecked {
    private final onDetachedFromWindow length = new onDetachedFromWindow(this);

    @CallSuper
    public void onCreate() {
        this.length.getMax(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @CallSuper
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        this.length.getMax(Lifecycle.Event.ON_START);
        return null;
    }

    @CallSuper
    public void onStart(@Nullable Intent intent, int i) {
        this.length.getMax(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }

    @CallSuper
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @CallSuper
    public void onDestroy() {
        onDetachedFromWindow ondetachedfromwindow = this.length;
        ondetachedfromwindow.getMax(Lifecycle.Event.ON_STOP);
        ondetachedfromwindow.getMax(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.length.length;
    }
}
