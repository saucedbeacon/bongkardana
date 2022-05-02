package o;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

public final class putStringDDpEx {
    private static final String TLS_VERSION = "TLSv1.2";

    public static boolean couldBeOld() {
        return Build.VERSION.SDK_INT < 22;
    }

    public static void update(Context context) {
        if (context != null) {
            try {
                SSLContext.getInstance(TLS_VERSION);
            } catch (NoSuchAlgorithmException unused) {
                try {
                    createLoadingDialog.i("TLS v1.2 is not available, installing...");
                    ProviderInstaller.installIfNeeded(context.getApplicationContext());
                } catch (GooglePlayServicesRepairableException unused2) {
                    createLoadingDialog.e("Couldn't install TLS v1.2 Google Play Services version is very old.");
                } catch (GooglePlayServicesNotAvailableException unused3) {
                    createLoadingDialog.e("Couldn't update TLS version. Google Play Services is not available.");
                }
            }
        }
    }
}
