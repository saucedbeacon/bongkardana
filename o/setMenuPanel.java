package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsService;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.branch.referral.Defines;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import o.TinyMenuPopupWindow;

public final class setMenuPanel {
    private static int getMin = 750;
    private static setMenuPanel length;
    private Class<?> IsOverlapping;
    /* access modifiers changed from: private */
    public boolean equals = false;
    private boolean getMax = true;
    /* access modifiers changed from: private */
    public Class<?> isInside;
    private final Handler setMax;
    /* access modifiers changed from: private */
    public Object setMin = null;
    private Class<?> toFloatRange;
    /* access modifiers changed from: private */
    public Class<?> toIntRange;

    public interface getMax {
        void setMin();
    }

    private setMenuPanel() {
        try {
            this.toIntRange = Class.forName("o.rewind");
            this.IsOverlapping = Class.forName("o.setCaptioningEnabled");
            this.toFloatRange = Class.forName("androidx.browser.customtabs.CustomTabsSession");
            this.isInside = Class.forName("android.support.customtabs.ICustomTabsService");
        } catch (Throwable unused) {
            this.getMax = false;
        }
        this.setMax = new Handler();
    }

    public static setMenuPanel setMin() {
        if (length == null) {
            length = new setMenuPanel();
        }
        return length;
    }

    public final void getMax(Context context, String str, getMid getmid, startTinyAppAndCloseCurrent starttinyappandclosecurrent, getMax getmax) {
        String str2 = str;
        getMid getmid2 = getmid;
        final getMax getmax2 = getmax;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length2 = str2 != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length2);
            if (length2 != min) {
                onCanceled oncanceled = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(-1474035694, oncanceled);
                onCancelLoad.getMin(-1474035694, oncanceled);
            }
        }
        this.equals = false;
        if (System.currentTimeMillis() - startTinyAppAndCloseCurrent.setMax("bnc_branch_strong_match_time") < 2592000000L) {
            length(getmax2, this.equals);
        } else if (!this.getMax) {
            length(getmax2, this.equals);
        } else {
            try {
                new TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMin(getmid2.setMax, getMid.setMin());
                final Uri min2 = getMin(str, getmid2, context);
                if (min2 != null) {
                    this.setMax.postDelayed(new Runnable() {
                        public final void run() {
                            setMenuPanel setmenupanel = setMenuPanel.this;
                            setmenupanel.length(getmax2, setmenupanel.equals);
                        }
                    }, 500);
                    Method method = this.toIntRange.getMethod("warmup", new Class[]{Long.TYPE});
                    Method method2 = this.toIntRange.getMethod("newSession", new Class[]{this.IsOverlapping});
                    Method method3 = this.toFloatRange.getMethod("mayLaunchUrl", new Class[]{Uri.class, Bundle.class, List.class});
                    Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                    intent.setPackage("com.android.chrome");
                    final Method method4 = method;
                    final Method method5 = method2;
                    final Method method6 = method3;
                    final startTinyAppAndCloseCurrent starttinyappandclosecurrent2 = starttinyappandclosecurrent;
                    final getMax getmax3 = getmax;
                    context.bindService(intent, new getMin() {
                        public final void length(Object obj) {
                            setMenuPanel setmenupanel = setMenuPanel.this;
                            Object unused = setmenupanel.setMin = setmenupanel.toIntRange.cast(obj);
                            if (setMenuPanel.this.setMin != null) {
                                try {
                                    method4.invoke(setMenuPanel.this.setMin, new Object[]{0});
                                    Object invoke = method5.invoke(setMenuPanel.this.setMin, new Object[]{null});
                                    if (invoke != null) {
                                        StringBuilder sb = new StringBuilder("Strong match request ");
                                        sb.append(min2);
                                        startTinyAppAndCloseCurrent.toFloatRange(sb.toString());
                                        method6.invoke(invoke, new Object[]{min2, null, null});
                                        startTinyAppAndCloseCurrent.getMin("bnc_branch_strong_match_time", System.currentTimeMillis());
                                        boolean unused2 = setMenuPanel.this.equals = true;
                                    }
                                } catch (Throwable unused3) {
                                    Object unused4 = setMenuPanel.this.setMin = null;
                                    setMenuPanel setmenupanel2 = setMenuPanel.this;
                                    setmenupanel2.length(getmax3, setmenupanel2.equals);
                                }
                            }
                        }

                        public final void onServiceDisconnected(ComponentName componentName) {
                            Object unused = setMenuPanel.this.setMin = null;
                            setMenuPanel setmenupanel = setMenuPanel.this;
                            setmenupanel.length(getmax3, setmenupanel.equals);
                        }
                    }, 33);
                    return;
                }
                length(getmax2, this.equals);
            } catch (Throwable unused) {
                length(getmax2, this.equals);
            }
        }
    }

    /* access modifiers changed from: private */
    public void length(final getMax getmax, boolean z) {
        if (getmax == null) {
            return;
        }
        if (z) {
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    getmax.setMin();
                }
            }, (long) getMin);
        } else {
            getmax.setMin();
        }
    }

    private static Uri getMin(String str, getMid getmid, Context context) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        sb.append("/_strong_match?os=Android");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("&");
        sb2.append(Defines.Jsonkey.HardwareID.getKey());
        sb2.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb2.append(new TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMin(getmid.setMax, getMid.setMin()));
        String obj2 = sb2.toString();
        String key = (new TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMin(getmid.setMax, getMid.setMin()).getMax() ? Defines.Jsonkey.HardwareIDTypeVendor : Defines.Jsonkey.HardwareIDTypeRandom).getKey();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("&");
        sb3.append(Defines.Jsonkey.HardwareIDType.getKey());
        sb3.append(SimpleComparison.EQUAL_TO_OPERATION);
        sb3.append(key);
        String obj3 = sb3.toString();
        String str2 = getmid.length.length;
        if (str2 != null && !getMenuName.setMin(context)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append("&");
            sb4.append(Defines.Jsonkey.GoogleAdvertisingID.getKey());
            sb4.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb4.append(str2);
            obj3 = sb4.toString();
        }
        if (!startTinyAppAndCloseCurrent.setMin("bnc_device_fingerprint_id").equals("bnc_no_value")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(obj3);
            sb5.append("&");
            sb5.append(Defines.Jsonkey.DeviceFingerprintID.getKey());
            sb5.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb5.append(startTinyAppAndCloseCurrent.setMin("bnc_device_fingerprint_id"));
            obj3 = sb5.toString();
        }
        if (!TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.setMin(getmid.setMax).equals("bnc_no_value")) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(obj3);
            sb6.append("&");
            sb6.append(Defines.Jsonkey.AppVersion.getKey());
            sb6.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb6.append(TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.setMin(getmid.setMax));
            obj3 = sb6.toString();
        }
        if (startTinyAppAndCloseCurrent.getMax == null) {
            startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
        }
        if (!startTinyAppAndCloseCurrent.getMax.equals("bnc_no_value")) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(obj3);
            sb7.append("&");
            sb7.append(Defines.Jsonkey.BranchKey.getKey());
            sb7.append(SimpleComparison.EQUAL_TO_OPERATION);
            if (startTinyAppAndCloseCurrent.getMax == null) {
                startTinyAppAndCloseCurrent.getMax = startTinyAppAndCloseCurrent.setMin("bnc_branch_key");
            }
            sb7.append(startTinyAppAndCloseCurrent.getMax);
            obj3 = sb7.toString();
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append(obj3);
        sb8.append("&sdk=android4.1.0");
        return Uri.parse(sb8.toString());
    }

    abstract class getMin implements ServiceConnection {
        public abstract void length(Object obj);

        getMin() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Constructor declaredConstructor = setMenuPanel.this.toIntRange.getDeclaredConstructor(new Class[]{setMenuPanel.this.isInside, ComponentName.class});
                declaredConstructor.setAccessible(true);
                length(declaredConstructor.newInstance(new Object[]{Class.forName("android.support.customtabs.ICustomTabsService$Stub").getMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{iBinder}), componentName}));
            } catch (Throwable unused) {
                length((Object) null);
            }
        }
    }
}
