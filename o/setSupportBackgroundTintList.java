package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class setSupportBackgroundTintList {
    private static final int getMin = 20;
    private static setSupportBackgroundTintList setMax;

    public static synchronized void setMax(setSupportBackgroundTintList setsupportbackgroundtintlist) {
        synchronized (setSupportBackgroundTintList.class) {
            setMax = setsupportbackgroundtintlist;
        }
    }

    public static String length(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = getMin;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized setSupportBackgroundTintList getMax() {
        setSupportBackgroundTintList setsupportbackgroundtintlist;
        synchronized (setSupportBackgroundTintList.class) {
            if (setMax == null) {
                setMax = new setMax(3);
            }
            setsupportbackgroundtintlist = setMax;
        }
        return setsupportbackgroundtintlist;
    }

    public static class setMax extends setSupportBackgroundTintList {
        private int getMin;

        public setMax(int i) {
            this.getMin = i;
        }
    }
}
