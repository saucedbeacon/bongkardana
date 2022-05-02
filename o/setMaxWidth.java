package o;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setMaxWidth {
    public static final setMaxWidth length = new setMaxWidth("COMPOSITION");
    @Nullable
    public getMaxWidth getMin;
    private final List<String> setMin;

    public setMaxWidth(String... strArr) {
        this.setMin = Arrays.asList(strArr);
    }

    public setMaxWidth(setMaxWidth setmaxwidth) {
        this.setMin = new ArrayList(setmaxwidth.setMin);
        this.getMin = setmaxwidth.getMin;
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final setMaxWidth setMax(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(2100707745, oncanceled);
            onCancelLoad.getMin(2100707745, oncanceled);
        }
        setMaxWidth setmaxwidth = new setMaxWidth(this);
        setmaxwidth.setMin.add(str);
        return setmaxwidth;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean getMax(String str, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1124397369, oncanceled);
            onCancelLoad.getMin(-1124397369, oncanceled);
        }
        if (getMin(str)) {
            return true;
        }
        if (i >= this.setMin.size()) {
            return false;
        }
        if (this.setMin.get(i).equals(str) || this.setMin.get(i).equals("**") || this.setMin.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int setMin(String str, int i) {
        if (getMin(str)) {
            return 0;
        }
        if (!this.setMin.get(i).equals("**")) {
            return 1;
        }
        if (i != this.setMin.size() - 1 && this.setMin.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean length(String str, int i) {
        if (i >= this.setMin.size()) {
            return false;
        }
        boolean z = i == this.setMin.size() - 1;
        String str2 = this.setMin.get(i);
        if (!str2.equals("**")) {
            boolean z2 = str2.equals(str) || str2.equals("*");
            if ((z || (i == this.setMin.size() - 2 && getMin())) && z2) {
                return true;
            }
            return false;
        }
        if (!z && this.setMin.get(i + 1).equals(str)) {
            if (i == this.setMin.size() - 2 || (i == this.setMin.size() - 3 && getMin())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.setMin.size() - 1) {
                return false;
            }
            return this.setMin.get(i2).equals(str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean setMax(String str, int i) {
        if (!"__container".equals(str) && i >= this.setMin.size() - 1 && !this.setMin.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    private static boolean getMin(String str) {
        return "__container".equals(str);
    }

    private boolean getMin() {
        List<String> list = this.setMin;
        return list.get(list.size() - 1).equals("**");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.setMin);
        sb.append(",resolved=");
        sb.append(this.getMin != null);
        sb.append('}');
        return sb.toString();
    }
}
