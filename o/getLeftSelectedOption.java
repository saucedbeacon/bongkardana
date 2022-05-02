package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import o.TwoWheelOptionPickerDialog;

public final class getLeftSelectedOption {
    public static final Set<String> setMax = new HashSet();
    public final Set<String> getMax;
    public final TwoWheelOptionPickerDialog.AnonymousClass3 getMin;
    public final getMin length;
    public final int setMin;
    public Set<setMin> toFloatRange;

    public interface getMin {
        void setMin(Set<setMin> set);
    }

    public /* synthetic */ getLeftSelectedOption(setMax setmax, byte b) {
        this(setmax);
    }

    private getLeftSelectedOption(setMax setmax) {
        this.getMin = setmax.getMax;
        this.length = setmax.getMin;
        this.getMax = setmax.setMax;
        this.setMin = setmax.setMin;
    }

    public static boolean getMax(Context context, String str) {
        return Build.VERSION.SDK_INT < 23 || FontRes.length(context, str) == 0;
    }

    public static class setMax {
        TwoWheelOptionPickerDialog.AnonymousClass3 getMax;
        public getMin getMin;
        public final Set<String> setMax = new HashSet();
        int setMin = setRightSelectedIndex.getMax();

        public setMax(@NonNull Activity activity) {
            if (activity != null) {
                this.getMax = new TwoWheelOptionPickerDialog.AnonymousClass3(activity) {
                    private final Activity getMin;

                    {
                        this.getMin = r1;
                    }

                    public final void getMax(String[] strArr, int i) {
                        FontRes.getMin(this.getMin, strArr, i);
                    }

                    public final Activity setMin() {
                        return this.getMin;
                    }
                };
                return;
            }
            throw new IllegalArgumentException("Activity cannot be null");
        }
    }

    public static class setMin {
        public final String getMin;
        private final int setMin;

        public setMin(String str, int i) {
            this.getMin = str;
            this.setMin = i;
        }

        public final boolean setMin() {
            return this.setMin == 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r0 = r1.getMin;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0017
                boolean r0 = r2 instanceof o.getLeftSelectedOption.setMin
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r1.getMin
                if (r0 == 0) goto L_0x0015
                o.getLeftSelectedOption$setMin r2 = (o.getLeftSelectedOption.setMin) r2
                java.lang.String r2 = r2.getMin
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L_0x0015
                goto L_0x0017
            L_0x0015:
                r2 = 0
                return r2
            L_0x0017:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getLeftSelectedOption.setMin.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return (this.getMin.hashCode() * 31) + this.setMin;
        }
    }
}
