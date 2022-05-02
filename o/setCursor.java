package o;

import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

public final class setCursor {
    private static Field getMin;
    private static boolean length;

    private static void setMax(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!length) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                getMin = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            length = true;
        }
        Field field = getMin;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void setMin(@NonNull LayoutInflater layoutInflater, @NonNull LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                setMax(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                setMax(layoutInflater, factory2);
            }
        }
    }
}
