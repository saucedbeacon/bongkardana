package o;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class LinearLayoutCompat implements Runnable {
    private final FitWindowsFrameLayout length;

    public interface OrientationMode {
    }

    public LinearLayoutCompat(FitWindowsFrameLayout fitWindowsFrameLayout) {
        this.length = fitWindowsFrameLayout;
    }

    public final void run() {
        ((FitWindowsFrameLayout) this.length.length).length();
    }

    public final class DividerMode<V> {
        @Nullable
        final Throwable getMax;
        @Nullable
        public final V length;

        public DividerMode(V v) {
            this.length = v;
            this.getMax = null;
        }

        public DividerMode(Throwable th) {
            this.getMax = th;
            this.length = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DividerMode)) {
                return false;
            }
            DividerMode dividerMode = (DividerMode) obj;
            V v = this.length;
            if (v != null && v.equals(dividerMode.length)) {
                return true;
            }
            Throwable th = this.getMax;
            if (th == null || dividerMode.getMax == null) {
                return false;
            }
            return th.toString().equals(this.getMax.toString());
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.length, this.getMax});
        }
    }

    public class LayoutParams {
        public boolean getMax = false;
        private final Comparator<setNegativeButton<String, Float>> length = new Comparator<setNegativeButton<String, Float>>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                float floatValue = ((Float) ((setNegativeButton) obj).getMin).floatValue();
                float floatValue2 = ((Float) ((setNegativeButton) obj2).getMin).floatValue();
                if (floatValue2 > floatValue) {
                    return 1;
                }
                return floatValue > floatValue2 ? -1 : 0;
            }
        };
        private final Set<Object> setMax = new MediaSessionCompat$Token();
        private final Map<String, getTitleMarginEnd> setMin = new HashMap();

        public final void getMin(String str, float f) {
            if (this.getMax) {
                getTitleMarginEnd gettitlemarginend = this.setMin.get(str);
                if (gettitlemarginend == null) {
                    gettitlemarginend = new getTitleMarginEnd();
                    this.setMin.put(str, gettitlemarginend);
                }
                gettitlemarginend.setMin += f;
                gettitlemarginend.length++;
                if (gettitlemarginend.length == Integer.MAX_VALUE) {
                    gettitlemarginend.setMin /= 2.0f;
                    gettitlemarginend.length /= 2;
                }
                if (str.equals("__container")) {
                    Iterator<Object> it = this.setMax.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }
}
