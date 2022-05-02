package o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.onNestedPreFling;

class getPopupTheme {
    private static Method getMax;
    private static boolean getMin;
    private static Field setMax;
    private static boolean setMin;

    getPopupTheme() {
    }

    public void length(@NonNull View view, float f) {
        Float f2 = (Float) view.getTag(onNestedPreFling.setMin.getMin);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public float getMax(@NonNull View view) {
        Float f = (Float) view.getTag(onNestedPreFling.setMin.getMin);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    public void length(@NonNull View view) {
        if (view.getTag(onNestedPreFling.setMin.getMin) == null) {
            view.setTag(onNestedPreFling.setMin.getMin, Float.valueOf(view.getAlpha()));
        }
    }

    public void setMin(@NonNull View view) {
        if (view.getVisibility() == 0) {
            view.setTag(onNestedPreFling.setMin.getMin, (Object) null);
        }
    }

    public void getMax(@NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            getMax(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void setMax(@NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            setMax(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void setMax(@NonNull View view, int i, int i2, int i3, int i4) {
        length();
        Method method = getMax;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void setMin(@NonNull View view, int i) {
        if (!setMin) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                setMax = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            setMin = true;
        }
        Field field = setMax;
        if (field != null) {
            try {
                setMax.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    private void length() {
        if (!getMin) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                getMax = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            getMin = true;
        }
    }
}
