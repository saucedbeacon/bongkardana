package o;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.litho.ThreadUtils;
import com.facebook.yoga.YogaNode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorCompletionService;
import javax.annotation.Nullable;

@ThreadSafe
public final class onOverScrolled {
    @GuardedBy("SplitLayoutResolver.class")
    private static final Map<String, onOverScrolled> setMax = new HashMap();
    private final Set<String> getMax;
    @Nullable
    private ExecutorCompletionService getMin;
    @Nullable
    private ExecutorCompletionService setMin;

    static boolean getMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped) {
        onOverScrolled min = setMin(ensureprocessorrunninglocked);
        return min != null && min.getMax.contains(isstopped.getClass().getSimpleName());
    }

    static boolean getMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, List<isStopped> list, final sendAccessibilityEvent sendaccessibilityevent) {
        sendAccessibilityEvent sendaccessibilityevent2;
        onOverScrolled min = setMin(ensureprocessorrunninglocked);
        if (min == null || !min.setMax()) {
            return false;
        }
        ExecutorCompletionService executorCompletionService = ThreadUtils.setMax() ? min.getMin : min.setMin;
        int size = list.size();
        final sendAccessibilityEvent[] sendaccessibilityeventArr = new sendAccessibilityEvent[size];
        int size2 = list.size();
        for (final int i = 1; i < size2; i++) {
            final isStopped isstopped = list.get(i);
            executorCompletionService.submit(new Runnable() {
                public final void run() {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    sendaccessibilityeventArr[i] = onOverScrolled.getMax(sendaccessibilityevent.getMax, isstopped);
                }
            }, Integer.valueOf(i - 1));
        }
        ensureProcessorRunningLocked ensureprocessorrunninglocked2 = sendaccessibilityevent.getMax;
        isStopped isstopped2 = list.get(0);
        if (isstopped2 == null || isstopped2 == null) {
            sendaccessibilityevent2 = ensureProcessorRunningLocked.length;
        } else {
            sendaccessibilityevent2 = ensureprocessorrunninglocked2.length(isstopped2);
        }
        sendaccessibilityeventArr[0] = sendaccessibilityevent2;
        int i2 = 0;
        while (i2 < size2 - 1) {
            try {
                executorCompletionService.take();
                i2++;
            } catch (InterruptedException e) {
                throw new RuntimeException("Could not execute split layout task", e);
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            sendAccessibilityEvent sendaccessibilityevent3 = sendaccessibilityeventArr[i3];
            if (!(sendaccessibilityevent3 == null || sendaccessibilityevent3 == ensureProcessorRunningLocked.length)) {
                YogaNode yogaNode = sendaccessibilityevent.length;
                sendaccessibilityevent.length.length(sendaccessibilityevent3.length, yogaNode.setMax == null ? 0 : yogaNode.setMax.size());
            }
        }
        return true;
    }

    private boolean setMax() {
        return ThreadUtils.setMax() ? this.getMin != null : this.setMin != null;
    }

    @Nullable
    private static onOverScrolled setMin(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        String str;
        onOverScrolled onoverscrolled;
        if (ensureprocessorrunninglocked.toString == null) {
            str = null;
        } else {
            str = ensureprocessorrunninglocked.toString.getMin;
        }
        if (str == null) {
            return null;
        }
        synchronized ("SplitLayoutResolver.class") {
            onoverscrolled = setMax.get(str);
        }
        return onoverscrolled;
    }

    static /* synthetic */ sendAccessibilityEvent getMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped) {
        if (isstopped == null || isstopped == null) {
            return ensureProcessorRunningLocked.length;
        }
        return ensureprocessorrunninglocked.length(isstopped);
    }
}
