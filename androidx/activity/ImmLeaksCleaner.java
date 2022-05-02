package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import o.setPopupCallback;

@RequiresApi(19)
final class ImmLeaksCleaner implements setPopupCallback {
    private static Field getMax;
    private static int getMin;
    private static Field length;
    private static Field setMax;
    private Activity setMin;

    ImmLeaksCleaner(Activity activity) {
        this.setMin = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x004a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0044=Splitter:B:28:0x0044, B:35:0x004a=Splitter:B:35:0x004a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax(@androidx.annotation.NonNull o.setChecked r3, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.Event r4) {
        /*
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = getMin
            if (r3 != 0) goto L_0x000c
            getMax()
        L_0x000c:
            int r3 = getMin
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.setMin
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = getMax     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = setMax     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = length     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.setMax(o.setChecked, androidx.lifecycle.Lifecycle$Event):void");
    }

    @MainThread
    private static void getMax() {
        try {
            getMin = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            setMax = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            length = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            getMax = declaredField3;
            declaredField3.setAccessible(true);
            getMin = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}
