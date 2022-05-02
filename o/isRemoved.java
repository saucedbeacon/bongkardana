package o;

import android.annotation.TargetApi;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

@TargetApi(10)
final class isRemoved {
    @Nullable
    private static Handler getMax = null;
    @Nullable
    private static HandlerThread getMin = null;
    @Nullable
    private static getMin length = null;
    /* access modifiers changed from: private */
    public static volatile boolean setMax = false;

    static void getMax(IsoDep isoDep) {
        if (!(getMin == null && getMax == null && length == null)) {
            setMin();
        }
        HandlerThread handlerThread = new HandlerThread("NFCWatchdogRefresherThread");
        getMin = handlerThread;
        try {
            handlerThread.start();
        } catch (IllegalThreadStateException unused) {
        }
        Looper looper = getMin.getLooper();
        if (looper != null) {
            getMax = new Handler(looper);
        } else {
            getMin.quit();
            getMax = new Handler();
        }
        setMax = true;
        getMin getmin = new getMin(getMax, isoDep, (byte) 0);
        length = getmin;
        getMax.post(getmin);
    }

    static void setMin() {
        setMax = false;
        Handler handler = getMax;
        if (handler != null) {
            getMin getmin = length;
            if (getmin != null) {
                handler.removeCallbacks(getmin);
            }
            getMax.removeCallbacksAndMessages((Object) null);
            getMax = null;
        }
        if (length != null) {
            length = null;
        }
        HandlerThread handlerThread = getMin;
        if (handlerThread != null) {
            handlerThread.quit();
            getMin = null;
        }
    }

    static class getMin implements Runnable {
        private int getMax;
        private final WeakReference<Handler> length;
        private final WeakReference<IsoDep> setMax;

        private getMin(@NonNull Handler handler, @NonNull IsoDep isoDep) {
            this.length = new WeakReference<>(handler);
            this.setMax = new WeakReference<>(isoDep);
            this.getMax = 0;
        }

        /* synthetic */ getMin(Handler handler, IsoDep isoDep, byte b) {
            this(handler, isoDep);
        }

        public final void run() {
            IsoDep isoDep = this.setMax.get();
            Tag tag = isoDep != null ? isoDep.getTag() : null;
            if (tag != null) {
                try {
                    Object invoke = Tag.class.getMethod("getTagService", new Class[0]).invoke(tag, new Object[0]);
                    Object invoke2 = invoke.getClass().getMethod(DataflowMonitorModel.METHOD_NAME_CONNECTION, new Class[]{Integer.TYPE, Integer.TYPE}).invoke(invoke, new Object[]{Tag.class.getMethod("getServiceHandle", new Class[0]).invoke(tag, new Object[0]), 3});
                    Handler handler = this.length.get();
                    if (invoke2 != null && invoke2.equals(0) && handler != null && isRemoved.setMax && this.getMax < 30000) {
                        handler.postDelayed(this, 5);
                        this.getMax += 5;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
        }
    }
}
