package o;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.util.DisplayMetrics;

final class findFirstCompletelyVisibleItemPosition {
    private static final Object equals = new Object();
    private static findFirstCompletelyVisibleItemPosition isInside;
    final String getMax;
    final Context getMin;
    final Integer length;
    final String setMax;
    final DisplayMetrics setMin;
    private final Boolean toFloatRange;
    private final Boolean toIntRange;

    static findFirstCompletelyVisibleItemPosition getMax(Context context) {
        synchronized (equals) {
            if (isInside == null) {
                isInside = new findFirstCompletelyVisibleItemPosition(context.getApplicationContext());
            }
        }
        return isInside;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[SYNTHETIC, Splitter:B:22:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private findFirstCompletelyVisibleItemPosition(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.getMin = r8
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            r1 = 0
            r2 = 0
            android.content.Context r3 = r7.getMin     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x001e }
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x001e }
            java.lang.String r4 = r3.versionName     // Catch:{ NameNotFoundException -> 0x001e }
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x001f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NameNotFoundException -> 0x001f }
            goto L_0x0023
        L_0x001e:
            r4 = r2
        L_0x001f:
            o.findOnePartiallyOrCompletelyInvisibleChild.isInside()
            r3 = r2
        L_0x0023:
            android.content.pm.ApplicationInfo r5 = r8.getApplicationInfo()
            int r6 = r5.labelRes
            r7.setMax = r4
            r7.length = r3
            if (r6 != 0) goto L_0x003d
            java.lang.CharSequence r8 = r5.nonLocalizedLabel
            if (r8 != 0) goto L_0x0036
            java.lang.String r8 = "Misc"
            goto L_0x0041
        L_0x0036:
            java.lang.CharSequence r8 = r5.nonLocalizedLabel
            java.lang.String r8 = r8.toString()
            goto L_0x0041
        L_0x003d:
            java.lang.String r8 = r8.getString(r6)
        L_0x0041:
            r7.getMax = r8
            java.lang.Class r8 = r0.getClass()
            r3 = 1
            java.lang.String r4 = "hasSystemFeature"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0055 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x0055 }
            java.lang.reflect.Method r8 = r8.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r8 = r2
        L_0x0056:
            if (r8 == 0) goto L_0x007d
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x0076, IllegalAccessException -> 0x0071 }
            java.lang.String r5 = "android.hardware.nfc"
            r4[r1] = r5     // Catch:{ InvocationTargetException -> 0x0076, IllegalAccessException -> 0x0071 }
            java.lang.Object r4 = r8.invoke(r0, r4)     // Catch:{ InvocationTargetException -> 0x0076, IllegalAccessException -> 0x0071 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ InvocationTargetException -> 0x0076, IllegalAccessException -> 0x0071 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x0077, IllegalAccessException -> 0x0072 }
            java.lang.String r5 = "android.hardware.telephony"
            r3[r1] = r5     // Catch:{ InvocationTargetException -> 0x0077, IllegalAccessException -> 0x0072 }
            java.lang.Object r8 = r8.invoke(r0, r3)     // Catch:{ InvocationTargetException -> 0x0077, IllegalAccessException -> 0x0072 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ InvocationTargetException -> 0x0077, IllegalAccessException -> 0x0072 }
            goto L_0x007b
        L_0x0071:
            r4 = r2
        L_0x0072:
            o.findOnePartiallyOrCompletelyInvisibleChild.isInside()
            goto L_0x007a
        L_0x0076:
            r4 = r2
        L_0x0077:
            o.findOnePartiallyOrCompletelyInvisibleChild.isInside()
        L_0x007a:
            r8 = r2
        L_0x007b:
            r2 = r4
            goto L_0x007e
        L_0x007d:
            r8 = r2
        L_0x007e:
            r7.toFloatRange = r2
            r7.toIntRange = r8
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics
            r8.<init>()
            r7.setMin = r8
            android.content.Context r8 = r7.getMin
            java.lang.String r0 = "window"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.Display r8 = r8.getDefaultDisplay()
            android.util.DisplayMetrics r0 = r7.setMin
            r8.getMetrics(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findFirstCompletelyVisibleItemPosition.<init>(android.content.Context):void");
    }

    public final boolean getMax() {
        return this.toFloatRange.booleanValue();
    }

    public final boolean getMin() {
        return this.toIntRange.booleanValue();
    }

    @SuppressLint({"MissingPermission"})
    public final Boolean setMin() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.getMin.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.getMin.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (NoClassDefFoundError | SecurityException unused) {
            return null;
        }
    }
}
