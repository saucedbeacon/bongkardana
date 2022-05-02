package o;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.onNestedPreFling;

class saveToolbarHierarchyState {
    private static boolean getMax;
    private static boolean getMin;
    private static Field length;
    private static LayoutTransition setMax;
    private static Method setMin;

    static void getMin(@NonNull ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (setMax == null) {
            AnonymousClass2 r0 = new LayoutTransition() {
                public final boolean isChangingLayout() {
                    return true;
                }
            };
            setMax = r0;
            r0.setAnimator(2, (Animator) null);
            setMax.setAnimator(0, (Animator) null);
            setMax.setAnimator(1, (Animator) null);
            setMax.setAnimator(3, (Animator) null);
            setMax.setAnimator(4, (Animator) null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    setMax(layoutTransition);
                }
                if (layoutTransition != setMax) {
                    viewGroup.setTag(onNestedPreFling.setMin.getMax, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(setMax);
            return;
        }
        viewGroup.setLayoutTransition((LayoutTransition) null);
        if (!getMax) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                length = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            getMax = true;
        }
        Field field = length;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        length.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(onNestedPreFling.setMin.getMax);
        if (layoutTransition2 != null) {
            viewGroup.setTag(onNestedPreFling.setMin.getMax, (Object) null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }

    private static void setMax(LayoutTransition layoutTransition) {
        if (!getMin) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                setMin = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            getMin = true;
        }
        Method method = setMin;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
