package o;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.facebook.litho.ComponentLifecycle;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public final class update extends getBottomFadingEdgeStrength implements ViewCompat$ScrollAxis {
    private final AtomicInteger getMin = new AtomicInteger(0);
    private final int length;

    public final class core {
        private core() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.alibaba.fastjson.JSONObject getResult(java.lang.String r3) {
            /*
                int r0 = r3.hashCode()
                r1 = 2
                r2 = 1
                switch(r0) {
                    case -1489822799: goto L_0x0028;
                    case -1149187101: goto L_0x001e;
                    case -687460845: goto L_0x0014;
                    case 29646139: goto L_0x000a;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x0032
            L_0x000a:
                java.lang.String r0 = "NO_APP_SUPPORTED_ERROR"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0032
                r3 = 1
                goto L_0x0033
            L_0x0014:
                java.lang.String r0 = "STORAGE_RUNNING_OUT_ERROR"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0032
                r3 = 2
                goto L_0x0033
            L_0x001e:
                java.lang.String r0 = "SUCCESS"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0032
                r3 = 0
                goto L_0x0033
            L_0x0028:
                java.lang.String r0 = "GENERAL_ERROR"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0032
                r3 = 3
                goto L_0x0033
            L_0x0032:
                r3 = -1
            L_0x0033:
                if (r3 == 0) goto L_0x0048
                if (r3 == r2) goto L_0x0043
                if (r3 == r1) goto L_0x003e
                com.alibaba.fastjson.JSONObject r3 = getFailedShareResult()
                return r3
            L_0x003e:
                com.alibaba.fastjson.JSONObject r3 = getStorageRunningOutResult()
                return r3
            L_0x0043:
                com.alibaba.fastjson.JSONObject r3 = getNoAppSupportedResult()
                return r3
            L_0x0048:
                com.alibaba.fastjson.JSONObject r3 = getSuccessShareResult()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.update.core.getResult(java.lang.String):com.alibaba.fastjson.JSONObject");
        }

        private static JSONObject getSuccessShareResult() {
            return getJSONResult(true, (String) null);
        }

        private static JSONObject getNoAppSupportedResult() {
            return getJSONResult(false, "002");
        }

        private static JSONObject getStorageRunningOutResult() {
            return getJSONResult(false, "003");
        }

        private static JSONObject getFailedShareResult() {
            return getJSONResult(false, "001");
        }

        private static JSONObject getJSONResult(boolean z, @Nullable String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.valueOf(z));
            if (str != null) {
                jSONObject.put("error", (Object) str);
            }
            return jSONObject;
        }
    }

    public update(String str, int i) {
        super(str, i, true);
        this.length = i;
    }

    public final Object setMax(Context context, ComponentLifecycle componentLifecycle) {
        Object max = super.getMax();
        if (max != null) {
            return max;
        }
        this.getMin.incrementAndGet();
        return componentLifecycle.setMin(context);
    }

    public final Object getMax() {
        throw new UnsupportedOperationException("Call acquire(ComponentContext, ComponentLifecycle)");
    }

    public final void getMin(Context context, ComponentLifecycle componentLifecycle) {
        if (!setMin() && this.getMin.getAndIncrement() < this.length) {
            getMax(componentLifecycle.setMin(context));
        }
    }
}
