package o;

import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.ThreadSafe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.IResultReceiver;

@ThreadSafe
public final class BlendModeCompat {
    private final Map<String, getMin> setMin = new HashMap();

    @VisibleForTesting
    public static class getMin {
        boolean getMax;
        final IResultReceiver.Stub<IconCompat> setMin = new IResultReceiver.Stub<>();
    }

    public final synchronized void setMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, BuildCompat$PrereleaseSdkCheck buildCompat$PrereleaseSdkCheck, String str) {
        if (str != null) {
            getMin getmin = this.setMin.get(str);
            if (getmin != null) {
                getmin.getMax = true;
                int min = getmin.setMin.getMin();
                for (int i = 0; i < min; i++) {
                    IconCompat IsOverlapping = getmin.setMin.IsOverlapping(i);
                    IsOverlapping.getMin = buildCompat$PrereleaseSdkCheck;
                    if (IsOverlapping.getMax != null) {
                        IsOverlapping.getMax[0] = ensureprocessorrunninglocked;
                    }
                }
            }
        }
    }

    public final synchronized void setMax() {
        Iterator<String> it = this.setMin.keySet().iterator();
        while (it.hasNext()) {
            getMin getmin = this.setMin.get(it.next());
            if (getmin != null) {
                if (getmin.getMax) {
                    getmin.getMax = false;
                }
            }
            it.remove();
        }
    }
}
