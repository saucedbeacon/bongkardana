package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class shouldMeasureTwice {
    private static shouldMeasureTwice ICustomTabsCallback$Stub = null;
    private static final Object asBinder = new Object();
    public static boolean getMin = false;
    final int FastBitmap$CoordinateSystem;
    final String Grayscale$Algorithm;
    private final boolean ICustomTabsCallback;
    private SSLSocketFactory ICustomTabsCallback$Default;
    String IsOverlapping;
    private final boolean Mean$Arithmetic;
    private prepareForDrop asInterface;
    private final boolean b;
    private final boolean create;
    String equals;
    private final int extraCallback;
    private final boolean extraCallbackWithResult;
    private final boolean getCause;
    final int getMax;
    final int hashCode;
    final int invoke;
    private final boolean invokeSuspend;
    final String[] isInside;
    public final int length;
    private final boolean onMessageChannelReady;
    private final boolean onNavigationEvent;
    private final boolean onPostMessage;
    private final boolean onRelationshipValidationResult;
    final int setMax;
    final long setMin;
    public final String toDoubleRange;
    String toFloatRange;
    String toIntRange;
    public final int toString;
    final String valueOf;
    public final String values;

    public static shouldMeasureTwice getMax(Context context) {
        synchronized (asBinder) {
            if (ICustomTabsCallback$Stub == null) {
                ICustomTabsCallback$Stub = getMin(context.getApplicationContext());
            }
        }
        return ICustomTabsCallback$Stub;
    }

    private shouldMeasureTwice(Bundle bundle, Context context) {
        String str;
        SSLSocketFactory sSLSocketFactory = null;
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            sSLSocketFactory = instance.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.equals();
        }
        this.ICustomTabsCallback$Default = sSLSocketFactory;
        boolean z = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        getMin = z;
        if (z) {
            findOnePartiallyOrCompletelyInvisibleChild.setMin();
        }
        if (bundle.containsKey("com.mixpanel.android.MPConfig.DebugFlushInterval")) {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
        }
        this.getMax = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        this.setMax = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        this.Mean$Arithmetic = bundle.getBoolean("com.mixpanel.android.MPConfig.FlushOnBackground", true);
        this.length = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 20971520);
        this.values = bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        this.getCause = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableGestureBindingUI", false);
        this.onNavigationEvent = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableEmulatorBindingUI", false);
        this.create = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        this.ICustomTabsCallback = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableViewCrawler", false);
        this.onPostMessage = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableDecideChecker", false);
        this.b = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableExceptionHandler", false);
        this.toString = bundle.getInt("com.mixpanel.android.MPConfig.ImageCacheMaxMemoryFactor", 10);
        this.onRelationshipValidationResult = bundle.getBoolean("com.mixpanel.android.MPConfig.IgnoreInvisibleViewsVisualEditor", false);
        this.extraCallbackWithResult = bundle.getBoolean("com.mixpanel.android.MPConfig.AutoShowMixpanelUpdates", true);
        this.FastBitmap$CoordinateSystem = bundle.getInt("com.mixpanel.android.MPConfig.NotificationDefaults", 0);
        this.hashCode = bundle.getInt("com.mixpanel.android.MPConfig.MinimumSessionDuration", 10000);
        this.invoke = bundle.getInt("com.mixpanel.android.MPConfig.SessionTimeoutDuration", Integer.MAX_VALUE);
        this.onMessageChannelReady = bundle.getBoolean("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation", true);
        this.invokeSuspend = bundle.getBoolean("com.mixpanel.android.MPConfig.TestMode", false);
        this.extraCallback = bundle.getInt("com.mixpanel.android.MPConfig.NotificationChannelImportance", 3);
        Object obj = bundle.get("com.mixpanel.android.MPConfig.DataExpiration");
        long j = 432000000;
        if (obj != null) {
            try {
                if (obj instanceof Integer) {
                    j = (long) ((Integer) obj).intValue();
                } else if (obj instanceof Float) {
                    j = (long) ((Float) obj).floatValue();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj.toString());
                    sb.append(" is not a number.");
                    throw new NumberFormatException(sb.toString());
                }
            } catch (Exception unused2) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
        }
        this.setMin = j;
        String string = bundle.getString("com.mixpanel.android.MPConfig.NotificationChannelId");
        this.Grayscale$Algorithm = string == null ? "mp" : string;
        String string2 = bundle.getString("com.mixpanel.android.MPConfig.NotificationChannelName");
        this.valueOf = string2 == null ? findFirstCompletelyVisibleItemPosition.getMax(context).getMax : string2;
        String string3 = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        String str2 = "1";
        if (string3 != null) {
            this.equals = string3;
        } else {
            StringBuilder sb2 = new StringBuilder("https://api.mixpanel.com/track?ip=");
            if (toDoubleRange()) {
                str = str2;
            } else {
                str = "0";
            }
            sb2.append(str);
            this.equals = sb2.toString();
        }
        String string4 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        if (string4 != null) {
            this.toFloatRange = string4;
        } else {
            StringBuilder sb3 = new StringBuilder("https://api.mixpanel.com/engage?ip=");
            sb3.append(!toDoubleRange() ? "0" : str2);
            this.toFloatRange = sb3.toString();
        }
        String string5 = bundle.getString("com.mixpanel.android.MPConfig.GroupsEndpoint");
        if (string5 != null) {
            this.IsOverlapping = string5;
        } else {
            this.IsOverlapping = "https://api.mixpanel.com/groups";
        }
        String string6 = bundle.getString("com.mixpanel.android.MPConfig.DecideEndpoint");
        if (string6 != null) {
            this.toIntRange = string6;
        } else {
            this.toIntRange = "https://decide.mixpanel.com/decide";
        }
        String string7 = bundle.getString("com.mixpanel.android.MPConfig.EditorUrl");
        this.toDoubleRange = string7 == null ? "wss://switchboard.mixpanel.com/connect/" : string7;
        int i = bundle.getInt("com.mixpanel.android.MPConfig.DisableViewCrawlerForProjects", -1);
        if (i != -1) {
            this.isInside = context.getResources().getStringArray(i);
        } else {
            this.isInside = new String[0];
        }
        findOnePartiallyOrCompletelyInvisibleChild.getMax();
    }

    public final boolean length() {
        return this.Mean$Arithmetic;
    }

    public final boolean setMin() {
        return this.getCause;
    }

    public final boolean setMax() {
        return this.onNavigationEvent;
    }

    public final boolean getMax() {
        return this.create;
    }

    public final boolean getMin() {
        return this.ICustomTabsCallback;
    }

    public final boolean toIntRange() {
        return this.invokeSuspend;
    }

    public final boolean isInside() {
        return this.extraCallbackWithResult;
    }

    public final boolean equals() {
        return this.onPostMessage;
    }

    public final boolean IsOverlapping() {
        return this.onRelationshipValidationResult;
    }

    public final boolean toFloatRange() {
        return this.b;
    }

    private boolean toDoubleRange() {
        return this.onMessageChannelReady;
    }

    public final synchronized SSLSocketFactory values() {
        return this.ICustomTabsCallback$Default;
    }

    public final synchronized prepareForDrop FastBitmap$CoordinateSystem() {
        return this.asInterface;
    }

    private static shouldMeasureTwice getMin(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new shouldMeasureTwice(bundle, context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Can't configure Mixpanel with package name ".concat(String.valueOf(packageName)), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mixpanel (5.8.4) configured with:\n    AutoShowMixpanelUpdates ");
        sb.append(isInside());
        sb.append("\n    BulkUploadLimit ");
        sb.append(this.getMax);
        sb.append("\n    FlushInterval ");
        sb.append(this.setMax);
        sb.append("\n    DataExpiration ");
        sb.append(this.setMin);
        sb.append("\n    MinimumDatabaseLimit ");
        sb.append(this.length);
        sb.append("\n    DisableAppOpenEvent ");
        sb.append(getMax());
        sb.append("\n    DisableViewCrawler ");
        sb.append(getMin());
        sb.append("\n    DisableGestureBindingUI ");
        sb.append(setMin());
        sb.append("\n    DisableEmulatorBindingUI ");
        sb.append(setMax());
        sb.append("\n    EnableDebugLogging ");
        sb.append(getMin);
        sb.append("\n    TestMode ");
        sb.append(toIntRange());
        sb.append("\n    EventsEndpoint ");
        sb.append(this.equals);
        sb.append("\n    PeopleEndpoint ");
        sb.append(this.toFloatRange);
        sb.append("\n    DecideEndpoint ");
        sb.append(this.toIntRange);
        sb.append("\n    EditorUrl ");
        sb.append(this.toDoubleRange);
        sb.append("\n    ImageCacheMaxMemoryFactor ");
        sb.append(this.toString);
        sb.append("\n    DisableDecideChecker ");
        sb.append(equals());
        sb.append("\n    IgnoreInvisibleViewsEditor ");
        sb.append(IsOverlapping());
        sb.append("\n    NotificationDefaults ");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append("\n    MinimumSessionDuration: ");
        sb.append(this.hashCode);
        sb.append("\n    SessionTimeoutDuration: ");
        sb.append(this.invoke);
        sb.append("\n    DisableExceptionHandler: ");
        sb.append(toFloatRange());
        sb.append("\n    NotificationChannelId: ");
        sb.append(this.Grayscale$Algorithm);
        sb.append("\n    NotificationChannelName: ");
        sb.append(this.valueOf);
        sb.append("\n    NotificationChannelImportance: ");
        sb.append(this.extraCallback);
        sb.append("\n    FlushOnBackground: ");
        sb.append(length());
        return sb.toString();
    }
}
