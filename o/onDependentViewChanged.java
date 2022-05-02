package o;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.facebook.flipper.android.EventBase;
import com.facebook.flipper.android.FlipperClientImpl;

public final class onDependentViewChanged {
    private static final String[] getMin = {"android.permission.INTERNET", "android.permission.ACCESS_WIFI_STATE"};
    private static boolean length = false;
    private static onDependentViewRemoved setMax;
    private static onDependentViewRemoved setMin;

    public static synchronized putExtraData setMin(Context context) {
        FlipperClientImpl instance;
        String str;
        String obj;
        synchronized (onDependentViewChanged.class) {
            if (!length) {
                for (String length2 : getMin) {
                    int length3 = IntRange.length(context, length2);
                }
                Context context2 = context;
                onDependentViewRemoved ondependentviewremoved = new onDependentViewRemoved("FlipperEventBaseThread");
                setMax = ondependentviewremoved;
                ondependentviewremoved.start();
                onDependentViewRemoved ondependentviewremoved2 = new onDependentViewRemoved("FlipperConnectionThread");
                setMin = ondependentviewremoved2;
                ondependentviewremoved2.start();
                Context applicationContext = context.getApplicationContext() == null ? context2 : context.getApplicationContext();
                EventBase min = setMax.setMin();
                EventBase min2 = setMin.setMin();
                int min3 = onRequestChildRectangleOnScreen.getMin();
                int max = onRequestChildRectangleOnScreen.setMax();
                if (getMax() && Build.VERSION.SDK_INT < 21) {
                    str = "10.0.2.2";
                } else if (setMax()) {
                    int ipAddress = ((WifiManager) applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
                    str = String.format("%d.%d.%d.2", new Object[]{Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255)});
                } else {
                    str = "localhost";
                }
                String str2 = str;
                if (setMax()) {
                    obj = Build.MODEL;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Build.MODEL);
                    sb.append(" - ");
                    sb.append(Build.VERSION.RELEASE);
                    sb.append(" - API ");
                    sb.append(Build.VERSION.SDK_INT);
                    obj = sb.toString();
                }
                FlipperClientImpl.init(min, min2, min3, max, str2, "Android", obj, Build.SERIAL, applicationContext.getApplicationInfo().loadLabel(applicationContext.getPackageManager()).toString(), applicationContext.getPackageName(), context.getFilesDir().getAbsolutePath());
                length = true;
            }
            instance = FlipperClientImpl.getInstance();
        }
        return instance;
    }

    private static boolean setMax() {
        return Build.FINGERPRINT.contains("vbox");
    }

    private static boolean getMax() {
        return Build.FINGERPRINT.contains("generic") && !Build.FINGERPRINT.contains("vbox");
    }
}
