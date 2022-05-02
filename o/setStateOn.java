package o;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import o.CornerMarkingDataProvider;

@Deprecated
public class setStateOn {
    private static List<String> setMin = new ArrayList();
    private final getMax equals;
    private final int getMax;
    private final length getMin;
    private final List<String> length;
    private final registerStateListener setMax;
    private List<setMin> toFloatRange;

    public interface getMax {
        void setMax(List<setMin> list);
    }

    public interface length {
        void getMin(setMin setmin);

        void setMin(setMin setmin);
    }

    public /* synthetic */ setStateOn(getMin getmin, byte b) {
        this(getmin);
    }

    private setStateOn(getMin getmin) {
        this.getMax = CornerMarkingDataProvider.AnonymousClass2.setMax();
        this.setMax = getmin.setMin;
        this.length = getmin.length;
        this.getMin = getmin.getMax;
        this.equals = getmin.getMin;
    }

    private static boolean getMax(String str) {
        for (String equals2 : setMin) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean getMax(List<String> list) {
        for (String max : list) {
            if (getMax(max)) {
                return true;
            }
        }
        return false;
    }

    private static void setMax(List<String> list) {
        for (String next : list) {
            if (!getMax(next)) {
                setMin.add(next);
            }
        }
    }

    public final void setMin() {
        if (this.setMax != null) {
            ArrayList arrayList = new ArrayList();
            List<setMin> list = this.toFloatRange;
            if (list != null) {
                list.clear();
                this.toFloatRange = null;
            }
            for (String next : this.length) {
                Context length2 = this.setMax.length();
                setMin setmin = new setMin(next, length2 == null ? -1 : FontRes.length(length2, next), (byte) 0);
                if (setmin.setMax()) {
                    if (this.toFloatRange == null) {
                        this.toFloatRange = new ArrayList();
                    }
                    this.toFloatRange.add(setmin);
                } else {
                    arrayList.add(next);
                    if (getMax(next)) {
                        setMin.remove(next);
                    }
                }
            }
            if (arrayList.isEmpty() || getMax(this.length)) {
                setMin(this.toFloatRange);
                return;
            }
            setMax(this.length);
            this.setMax.getMin((String[]) arrayList.toArray(new String[0]), this.getMax);
            return;
        }
        throw new IllegalStateException("A non-null PermissionCheckFacade must be provided");
    }

    private void setMin(List<setMin> list) {
        getMax getmax;
        if (list != null && !list.isEmpty()) {
            for (setMin min : list) {
                getMin(min);
            }
            if (list != null && !list.isEmpty() && (getmax = this.equals) != null) {
                getmax.setMax(list);
            }
        }
    }

    private void getMin(setMin setmin) {
        if (setmin != null && this.getMin != null) {
            if (setmin.setMax()) {
                this.getMin.getMin(setmin);
            } else {
                this.getMin.setMin(setmin);
            }
        }
    }

    public final void length() {
        if (this.setMax != null) {
            List<setMin> list = this.toFloatRange;
            if (list != null) {
                list.clear();
                this.toFloatRange = null;
            }
            for (String next : this.length) {
                Context length2 = this.setMax.length();
                setMin setmin = new setMin(next, length2 == null ? -1 : FontRes.length(length2, next), (byte) 0);
                if (this.toFloatRange == null) {
                    this.toFloatRange = new ArrayList();
                }
                this.toFloatRange.add(setmin);
            }
            setMin(this.toFloatRange);
            return;
        }
        throw new IllegalStateException("A non-null PermissionCheckFacade must be provided");
    }

    public final boolean getMin(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        getMax getmax;
        if (this.getMax != i) {
            return false;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            for (String equalsIgnoreCase : this.length) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    if (getMax(str)) {
                        setMin.remove(str);
                    }
                    setMin setmin = new setMin(str, iArr[i2], (byte) 0);
                    if (this.toFloatRange == null) {
                        this.toFloatRange = new ArrayList();
                    }
                    this.toFloatRange.add(setmin);
                    getMin(setmin);
                }
            }
        }
        List<setMin> list = this.toFloatRange;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<setMin> list2 = this.toFloatRange;
        if (!(list2 == null || list2.isEmpty() || (getmax = this.equals) == null)) {
            getmax.setMax(list2);
        }
        if (i != this.getMax) {
            return true;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            if (-1 == i4) {
                i3++;
            }
        }
        if (i3 != iArr.length || iArr.length <= 0) {
            return true;
        }
        TinyAppActionStateManager.getMax(this.setMax.setMin(), strArr[0]);
        return true;
    }

    public static class getMin {
        public length getMax;
        public getMax getMin;
        public final List<String> length = new ArrayList();
        final registerStateListener setMin;

        public getMin(Activity activity) {
            this.setMin = new removeAction(activity);
        }

        public getMin(Fragment fragment) {
            this.setMin = new getTips(fragment);
        }
    }

    public static class setMin {
        private final int getMax;
        public final String getMin;

        /* synthetic */ setMin(String str, int i, byte b) {
            this(str, i);
        }

        private setMin(String str, int i) {
            this.getMin = str;
            this.getMax = i;
        }

        public final boolean setMax() {
            return this.getMax == 0;
        }
    }

    public static boolean getMin(Context context, String str) {
        return new setMin(str, context == null ? -1 : FontRes.length(context, str), (byte) 0).setMax();
    }
}
