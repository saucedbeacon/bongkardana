package o;

import android.util.TypedValue;
import android.view.View;
import androidx.annotation.IdRes;
import java.lang.reflect.Array;
import java.util.List;

public final class drawDividersHorizontal {
    private static final TypedValue length = new TypedValue();

    @SafeVarargs
    private static <T> T[] setMax(T... tArr) {
        int i = 0;
        for (T t : tArr) {
            if (t != null) {
                tArr[i] = t;
                i++;
            }
        }
        if (i == r0) {
            return tArr;
        }
        T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
        System.arraycopy(tArr, 0, tArr2, 0, i);
        return tArr2;
    }

    @SafeVarargs
    public static <T> List<T> setMin(T... tArr) {
        return new drawVerticalDivider(setMax(tArr));
    }

    public static <T> T length(View view, @IdRes int i, String str, Class<T> cls) {
        return getMin(view.findViewById(i), i, str, cls);
    }

    public static View getMax(View view, @IdRes int i, String str) {
        String str2;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        if (view.isInEditMode()) {
            str2 = "<unavailable while editing>";
        } else {
            str2 = view.getContext().getResources().getResourceEntryName(i);
        }
        StringBuilder sb = new StringBuilder("Required view '");
        sb.append(str2);
        sb.append("' with ID ");
        sb.append(i);
        sb.append(" for ");
        sb.append(str);
        sb.append(" was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
        throw new IllegalStateException(sb.toString());
    }

    public static <T> T setMin(View view, @IdRes int i, String str, Class<T> cls) {
        return getMin(getMax(view, i, str), i, str, cls);
    }

    public static <T> T getMin(View view, @IdRes int i, String str, Class<T> cls) {
        String str2;
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            if (view.isInEditMode()) {
                str2 = "<unavailable while editing>";
            } else {
                str2 = view.getContext().getResources().getResourceEntryName(i);
            }
            StringBuilder sb = new StringBuilder("View '");
            sb.append(str2);
            sb.append("' with ID ");
            sb.append(i);
            sb.append(" for ");
            sb.append(str);
            sb.append(" was of the wrong type. See cause for more info.");
            throw new IllegalStateException(sb.toString(), e);
        }
    }
}
