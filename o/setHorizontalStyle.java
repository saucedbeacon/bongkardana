package o;

import android.content.Context;
import android.provider.Settings;
import android.webkit.WebView;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;

public final class setHorizontalStyle {
    public static String length(Context context, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        String str2;
        int length;
        int min;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (length = str.length()) == (min = dispatchOnCancelled.setMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1448039858, oncanceled);
            onCancelLoad.getMin(1448039858, oncanceled);
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (bool.booleanValue()) {
            try {
                str2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Exception unused) {
                str2 = "null";
            }
            stringBuffer.append(str2);
            stringBuffer.append(str);
            setPaddingTop.getMax();
        }
        if (bool3.booleanValue()) {
            stringBuffer.append(setMin(context));
            stringBuffer.append(str);
            setPaddingTop.getMax();
        }
        if (bool2.booleanValue()) {
            stringBuffer.append(length());
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public static String setMin(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Exception unused) {
            return "null";
        }
    }

    private static String length() {
        try {
            for (T inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                Iterator<T> it = Collections.list(inetAddresses.getInetAddresses()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it.next();
                        if (!inetAddress.isLoopbackAddress()) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                return hostAddress;
                            }
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }
}
