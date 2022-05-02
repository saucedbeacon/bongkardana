package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

public final class supportNavigateUpTo {
    private static boolean getMax;
    private static Field length;

    public static void setMin(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof getResources) {
            ((getResources) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    @Nullable
    public static ColorStateList setMin(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof getResources) {
            return ((getResources) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    public static void getMax(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof getResources) {
            ((getResources) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    @Nullable
    public static Drawable setMax(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!getMax) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                length = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            getMax = true;
        }
        Field field = length;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                length = null;
            }
        }
        return null;
    }
}
