package o;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.CameraLogger;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public class ensureTopGlow {
    private static final CameraLogger getMin = CameraLogger.setMin(ensureTopGlow.class.getSimpleName());
    private static final ConcurrentHashMap<String, WeakReference<ensureTopGlow>> setMin = new ConcurrentHashMap<>(4);
    private static ensureTopGlow toFloatRange;
    private String IsOverlapping;
    public HandlerThread getMax;
    public Handler length = new Handler(this.getMax.getLooper());
    public Executor setMax = new Executor() {
        public final void execute(@NonNull Runnable runnable) {
            ensureTopGlow ensuretopglow = ensureTopGlow.this;
            if (Thread.currentThread() == ensuretopglow.getMax) {
                runnable.run();
            } else {
                ensuretopglow.length.post(runnable);
            }
        }
    };

    @NonNull
    public static ensureTopGlow getMax(@NonNull String str) {
        if (setMin.containsKey(str)) {
            ensureTopGlow ensuretopglow = (ensureTopGlow) setMin.get(str).get();
            if (ensuretopglow == null) {
                getMin.getMax(2, "get:", "Thread reference died. Removing.", str);
                setMin.remove(str);
            } else if (!ensuretopglow.getMax.isAlive() || ensuretopglow.getMax.isInterrupted()) {
                ensuretopglow.setMax();
                getMin.getMax(2, "get:", "Thread reference found, but not alive or interrupted.", "Removing.", str);
                setMin.remove(str);
            } else {
                getMin.getMax(2, "get:", "Reusing cached worker handler.", str);
                return ensuretopglow;
            }
        }
        getMin.getMax(1, "get:", "Creating new handler.", str);
        ensureTopGlow ensuretopglow2 = new ensureTopGlow(str);
        setMin.put(str, new WeakReference(ensuretopglow2));
        return ensuretopglow2;
    }

    @NonNull
    public static ensureTopGlow length() {
        ensureTopGlow max = getMax("FallbackCameraThread");
        toFloatRange = max;
        return max;
    }

    private ensureTopGlow(@NonNull String str) {
        this.IsOverlapping = str;
        AnonymousClass3 r0 = new HandlerThread(str) {
            @NonNull
            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("[");
                sb.append(getThreadId());
                sb.append("]");
                return sb.toString();
            }
        };
        this.getMax = r0;
        r0.setDaemon(true);
        this.getMax.start();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.length.post(new Runnable() {
            public final void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public static void setMax(@NonNull Runnable runnable) {
        ensureTopGlow max = getMax("FallbackCameraThread");
        toFloatRange = max;
        max.length.post(runnable);
    }

    public final void setMax() {
        HandlerThread handlerThread = this.getMax;
        if (handlerThread.isAlive()) {
            handlerThread.interrupt();
            handlerThread.quit();
        }
        setMin.remove(this.IsOverlapping);
    }
}
