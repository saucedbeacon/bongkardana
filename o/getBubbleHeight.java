package o;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/tracker/firebase/FirebasePerformanceMonitor;", "", "()V", "traces", "", "", "Lcom/google/firebase/perf/metrics/Trace;", "startTrace", "", "name", "stopTrace", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBubbleHeight {
    @NotNull
    public static final setMin getMax = new setMin((byte) 0);
    /* access modifiers changed from: private */
    public static getBubbleHeight setMin;
    public Map<String, Trace> getMin = new LinkedHashMap();

    @JvmStatic
    @NotNull
    public static final getBubbleHeight setMax() {
        return getMax.getMin();
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Map<String, Trace> map = this.getMin;
        Trace newTrace = FirebasePerformance.getInstance().newTrace(str);
        Intrinsics.checkNotNullExpressionValue(newTrace, "FirebasePerformance.getInstance().newTrace(name)");
        map.put(str, newTrace);
        Trace trace = this.getMin.get(str);
        if (trace != null) {
            trace.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/tracker/firebase/FirebasePerformanceMonitor$Companion;", "", "()V", "BINDING_GN", "", "DEEPLINK_PAYMENT_WITHOUT_OTT_TRACE", "DEEPLINK_PAYMENT_WITH_OTT_TRACE", "instance", "Lid/dana/tracker/firebase/FirebasePerformanceMonitor;", "getInstance", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public final getBubbleHeight getMin() {
            getBubbleHeight min;
            getBubbleHeight min2 = getBubbleHeight.setMin;
            if (min2 != null) {
                return min2;
            }
            synchronized (this) {
                min = getBubbleHeight.setMin;
                if (min == null) {
                    getBubbleHeight.setMin = new getBubbleHeight();
                    min = getBubbleHeight.setMin;
                    Intrinsics.checkNotNull(min);
                }
            }
            return min;
        }
    }
}
