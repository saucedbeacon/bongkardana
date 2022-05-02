package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class unregisterOnLoadCanceledListener implements isReset {
    private static int equals = 0;
    private static Thread getMax = null;
    private static Map<onStopLoading, Long> getMin = new HashMap();
    private static boolean length = false;
    private static takeContentChanged setMax;
    private static BlockingQueue<commitContentChanged> setMin;
    private static boolean toIntRange;

    public final void setMin(int i, int i2) {
        getMin(onStopLoading.DEX_ENV_HOOK, i, i2);
    }

    public final void length(int i, int i2) {
        getMin(onStopLoading.DEX_ENV_ROOT, i, i2);
    }

    public final void setMax(int i, int i2) {
        getMin(onStopLoading.DEX_ENV_DEBUGGER, i, i2);
    }

    public final void getMin(int i, int i2) {
        getMin(onStopLoading.DEX_ENV_EMULATOR, i, i2);
    }

    public final void getMax(int i, int i2) {
        getMin(onStopLoading.DEX_APP_TAMPER, i, i2);
    }

    public final void toFloatRange(int i, int i2) {
        getMin(onStopLoading.DEX_APP_FILE, i, i2);
    }

    public final void equals(int i, int i2) {
        getMin(onStopLoading.DEX_APP_CERTIFICATE, i, i2);
    }

    public final void IsOverlapping(int i, int i2) {
        getMin(onStopLoading.DEX_ENV_VIRTUAL_ENV, i, i2);
    }

    private static void getMin(onStopLoading onstoploading, int i, int i2) {
        if (length) {
            commitContentChanged commitcontentchanged = new commitContentChanged(onstoploading, i, i2);
            if (setMin.size() >= equals) {
                getMax.interrupt();
            }
            Long l = getMin.get(onstoploading);
            if (l == null) {
                l = 0L;
            }
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            boolean z = true;
            boolean z2 = valueOf.longValue() - l.longValue() > 86400000;
            if (i == i2) {
                z = false;
            }
            if (z2 && z) {
                setMin.add(commitcontentchanged);
                getMin.put(onstoploading, valueOf);
            }
        }
    }

    public final void getMax(Context context, String str, String str2) {
        String str3 = "unknown";
        if (!length) {
            try {
                String str4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str4 != null) {
                    str3 = str4;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            isAbandoned isabandoned = new isAbandoned(context);
            String string = isabandoned.length.getString(HeaderConstant.HEADER_KEY_UUID, (String) null);
            if (string == null) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = isabandoned.length.edit();
                edit.putString(HeaderConstant.HEADER_KEY_UUID, string);
                edit.apply();
            }
            takeContentChanged min = takeContentChanged.setMin(str);
            setMax = min;
            abandon abandon = new abandon(min.getMax, str2, str3, string);
            equals = 100;
            if (setMax.length) {
                new Thread(new onAbandon(new onReset(context.getApplicationContext(), setMax.setMin), abandon, isabandoned)).start();
            }
            toIntRange = false;
            setMin = new LinkedBlockingQueue();
            Thread thread = new Thread(new onStartLoading(new onReset(context.getApplicationContext(), setMax.setMin), abandon, setMin));
            getMax = thread;
            thread.start();
            length = true;
        }
    }
}
