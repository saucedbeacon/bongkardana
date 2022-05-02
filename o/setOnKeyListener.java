package o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class setOnKeyListener {
    private static Method getMax = null;
    private static Field getMin = null;
    private static boolean length = false;
    private static boolean setMax = false;

    public interface length {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    public static boolean getMin(@NonNull View view, @NonNull KeyEvent keyEvent) {
        return ViewCompat.length(view, keyEvent);
    }

    public static boolean setMin(@NonNull length length2, @Nullable View view, @Nullable Window.Callback callback, @NonNull KeyEvent keyEvent) {
        if (length2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return length2.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return length((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return getMin((Dialog) callback, keyEvent);
        }
        if ((view == null || !ViewCompat.setMin(view, keyEvent)) && !length2.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    private static boolean getMax(ActionBar actionBar, KeyEvent keyEvent) {
        if (!setMax) {
            try {
                getMax = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            setMax = true;
        }
        Method method = getMax;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean length(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && getMax(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.setMin(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static DialogInterface.OnKeyListener length(Dialog dialog) {
        if (!length) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                getMin = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            length = true;
        }
        Field field = getMin;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    private static boolean getMin(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener length2 = length(dialog);
        if (length2 != null && length2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.setMin(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }
}
