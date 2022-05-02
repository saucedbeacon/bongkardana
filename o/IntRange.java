package o;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.alibaba.griver.ui.popmenu.TinyAppActionState;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import java.io.File;
import java.util.HashMap;

public class IntRange {
    private static final Object getMax = new Object();
    private static TypedValue length;
    private static final Object setMax = new Object();

    public static boolean getMax(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            getMin.setMin(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void setMin(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            getMin.getMin(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    @NonNull
    public static File[] length(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return length.length(context);
        }
        return new File[]{context.getObbDir()};
    }

    @NonNull
    public static File[] getMin(@NonNull Context context, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return length.setMin(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    @NonNull
    public static File[] getMax(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return length.setMin(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    @Nullable
    public static Drawable length(@NonNull Context context, @DrawableRes int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return getMax.setMax(context, i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (getMax) {
            if (length == null) {
                length = new TypedValue();
            }
            context.getResources().getValue(i, length, true);
            i2 = length.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    @Nullable
    public static ColorStateList getMin(@NonNull Context context, @ColorRes int i) {
        return OptIn.setMax(context.getResources(), i, context.getTheme());
    }

    @ColorInt
    public static int setMax(@NonNull Context context, @ColorRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setMax.getMax(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int length(@NonNull Context context, @NonNull String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    @Nullable
    public static File getMin(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return getMax.getMax(context);
        }
        return setMin(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File setMin(java.io.File r2) {
        /*
            java.lang.Object r0 = setMax
            monitor-enter(r0)
            boolean r1 = r2.exists()     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0014
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0011:
            r2.getPath()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IntRange.setMin(java.io.File):java.io.File");
    }

    @Nullable
    public static Context setMin(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return setMin.getMin(context);
        }
        return null;
    }

    public static void length(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            toIntRange.getMin(context, intent);
        } else {
            context.startService(intent);
        }
    }

    @Nullable
    public static <T> T getMax(@NonNull Context context, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setMax.length(context, cls);
        }
        String length2 = length(context, (Class<?>) cls);
        if (length2 != null) {
            return context.getSystemService(length2);
        }
        return null;
    }

    @Nullable
    public static String length(@NonNull Context context, @NonNull Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setMax.getMax(context, cls);
        }
        return isInside.setMin.get(cls);
    }

    static final class isInside {
        static final HashMap<Class<?>, String> setMin = new HashMap<>();

        static {
            if (Build.VERSION.SDK_INT >= 22) {
                setMin.put(SubscriptionManager.class, "telephony_subscription_service");
                setMin.put(UsageStatsManager.class, "usagestats");
            }
            if (Build.VERSION.SDK_INT >= 21) {
                setMin.put(AppWidgetManager.class, "appwidget");
                setMin.put(BatteryManager.class, "batterymanager");
                setMin.put(CameraManager.class, ImagePickerEvent.CAMERA);
                setMin.put(JobScheduler.class, "jobscheduler");
                setMin.put(LauncherApps.class, "launcherapps");
                setMin.put(MediaProjectionManager.class, "media_projection");
                setMin.put(MediaSessionManager.class, "media_session");
                setMin.put(RestrictionsManager.class, "restrictions");
                setMin.put(TelecomManager.class, "telecom");
                setMin.put(TvInputManager.class, "tv_input");
            }
            if (Build.VERSION.SDK_INT >= 19) {
                setMin.put(AppOpsManager.class, "appops");
                setMin.put(CaptioningManager.class, "captioning");
                setMin.put(ConsumerIrManager.class, "consumer_ir");
                setMin.put(PrintManager.class, "print");
            }
            if (Build.VERSION.SDK_INT >= 18) {
                setMin.put(BluetoothManager.class, TinyAppActionState.ACTION_BLUE_TOOTH);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                setMin.put(DisplayManager.class, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                setMin.put(UserManager.class, "user");
            }
            if (Build.VERSION.SDK_INT >= 16) {
                setMin.put(InputManager.class, "input");
                setMin.put(MediaRouter.class, "media_router");
                setMin.put(NsdManager.class, "servicediscovery");
            }
            setMin.put(AccessibilityManager.class, "accessibility");
            setMin.put(AccountManager.class, "account");
            setMin.put(ActivityManager.class, AkuEventParamsKey.KEY_ACTIVITY);
            setMin.put(AlarmManager.class, "alarm");
            setMin.put(AudioManager.class, "audio");
            setMin.put(ClipboardManager.class, "clipboard");
            setMin.put(ConnectivityManager.class, "connectivity");
            setMin.put(DevicePolicyManager.class, "device_policy");
            setMin.put(DownloadManager.class, H5ActionJSApi.DOWNLOAD);
            setMin.put(DropBoxManager.class, "dropbox");
            setMin.put(InputMethodManager.class, "input_method");
            setMin.put(KeyguardManager.class, "keyguard");
            setMin.put(LayoutInflater.class, "layout_inflater");
            setMin.put(LocationManager.class, "location");
            setMin.put(NfcManager.class, "nfc");
            setMin.put(NotificationManager.class, "notification");
            setMin.put(PowerManager.class, "power");
            setMin.put(SearchManager.class, FirebaseAnalytics.Event.SEARCH);
            setMin.put(SensorManager.class, "sensor");
            setMin.put(StorageManager.class, "storage");
            setMin.put(TelephonyManager.class, "phone");
            setMin.put(TextServicesManager.class, "textservices");
            setMin.put(UiModeManager.class, "uimode");
            setMin.put(UsbManager.class, "usb");
            setMin.put(Vibrator.class, "vibrator");
            setMin.put(WallpaperManager.class, "wallpaper");
            setMin.put(WifiP2pManager.class, "wifip2p");
            setMin.put(WifiManager.class, "wifi");
            setMin.put(WindowManager.class, "window");
        }
    }

    @RequiresApi(16)
    static class getMin {
        @DoNotInline
        static void setMin(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @DoNotInline
        static void getMin(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @RequiresApi(19)
    static class length {
        @DoNotInline
        static File[] setMin(Context context) {
            return context.getExternalCacheDirs();
        }

        @DoNotInline
        static File[] setMin(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @DoNotInline
        static File[] length(Context context) {
            return context.getObbDirs();
        }
    }

    @RequiresApi(21)
    static class getMax {
        @DoNotInline
        static Drawable setMax(Context context, int i) {
            return context.getDrawable(i);
        }

        @DoNotInline
        static File getMax(Context context) {
            return context.getNoBackupFilesDir();
        }

        @DoNotInline
        static File getMin(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @RequiresApi(23)
    static class setMax {
        @DoNotInline
        static ColorStateList setMin(Context context, int i) {
            return context.getColorStateList(i);
        }

        @DoNotInline
        static int getMax(Context context, int i) {
            return context.getColor(i);
        }

        @DoNotInline
        static <T> T length(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        @DoNotInline
        static String getMax(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @RequiresApi(24)
    static class setMin {
        @DoNotInline
        static File setMin(Context context) {
            return context.getDataDir();
        }

        @DoNotInline
        static Context getMin(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @DoNotInline
        static boolean length(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RequiresApi(26)
    static class toIntRange {
        @DoNotInline
        static ComponentName getMin(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }
}
