package o;

import androidx.annotation.GuardedBy;
import java.util.Map;
import javax.annotation.Nullable;

public class IconCompat<E> {
    @Nullable
    public final Object[] getMax;
    public BuildCompat$PrereleaseSdkCheck getMin;
    public final int setMax;

    protected IconCompat() {
        this((BuildCompat$PrereleaseSdkCheck) null, -1, (Object[]) null);
    }

    public IconCompat(BuildCompat$PrereleaseSdkCheck buildCompat$PrereleaseSdkCheck, int i, @Nullable Object[] objArr) {
        this.getMin = buildCompat$PrereleaseSdkCheck;
        this.setMax = i;
        this.getMax = objArr;
    }

    public void setMax(E e) {
        this.getMin.IsOverlapping().length(this, e);
    }

    public boolean setMax(@Nullable IconCompat iconCompat) {
        if (this == iconCompat) {
            return true;
        }
        if (iconCompat == null || iconCompat.getClass() != getClass() || this.setMax != iconCompat.setMax) {
            return false;
        }
        Object[] objArr = this.getMax;
        Object[] objArr2 = iconCompat.getMax;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int i = 1;
        while (true) {
            Object[] objArr3 = this.getMax;
            if (i >= objArr3.length) {
                return true;
            }
            Object obj = objArr3[i];
            Object obj2 = iconCompat.getMax[i];
            if (obj == null) {
                if (obj2 != null) {
                    break;
                }
                i++;
            } else if (!obj.equals(obj2)) {
                break;
            } else {
                i++;
            }
        }
        return false;
    }

    public final class IconType {
        @GuardedBy("this")
        @androidx.annotation.Nullable
        private Map<String, Object> setMax;

        public final synchronized void getMin() {
            if (this.setMax != null) {
                this.setMax.clear();
            }
        }
    }
}
