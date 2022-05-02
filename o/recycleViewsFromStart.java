package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.lang.reflect.InvocationTargetException;

final class recycleViewsFromStart {
    String getMax;
    int getMin;
    final convertFocusDirectionToLayoutDirection length;
    Context setMin;

    public recycleViewsFromStart(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, Context context) {
        this.length = convertfocusdirectiontolayoutdirection;
        this.setMin = context;
    }

    /* access modifiers changed from: package-private */
    public final void getMin() {
        try {
            Object invoke = Class.forName("com.urbanairship.UAirship").getMethod("shared", new Class[0]).invoke((Object) null, new Object[0]);
            Object invoke2 = invoke.getClass().getMethod("getPushManager", new Class[0]).invoke(invoke, new Object[0]);
            String str = (String) invoke2.getClass().getMethod("getChannelId", new Class[0]).invoke(invoke2, new Object[0]);
            if (str == null || str.isEmpty()) {
                int i = this.getMin + 1;
                this.getMin = i;
                if (i <= 3) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        public final void run() {
                            recycleViewsFromStart.this.getMin();
                        }
                    }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                    return;
                }
                return;
            }
            this.getMin = 0;
            if (this.getMax == null || !this.getMax.equals(str)) {
                this.length.setMax.getMin("$android_urban_airship_channel_id", (Object) str);
                this.getMax = str;
            }
        } catch (ClassNotFoundException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.toIntRange();
        } catch (NoSuchMethodException unused2) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        } catch (InvocationTargetException unused3) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        } catch (IllegalAccessException unused4) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        } catch (Exception unused5) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
    }
}
