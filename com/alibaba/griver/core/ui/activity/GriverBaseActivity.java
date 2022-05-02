package com.alibaba.griver.core.ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.activity.ActivityHelper;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.api.monitor.RVPerformanceTracker;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.griver.api.activity.GriverActivityRestoreExtension;
import com.alibaba.griver.api.common.activity.ActivityHelperExtension;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.api.GriverPerformanceStages;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import com.alibaba.griver.base.common.utils.H5SplitCompatUtils;
import com.alibaba.griver.base.common.utils.UCUtils;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.kernel.ipc.server.IpcMsgServerService;
import com.alibaba.griver.core.ui.NebulaAppContext;
import com.alibaba.griver.core.utils.b;
import com.alibaba.griver.core.utils.k;
import com.google.common.base.Ascii;
import com.iap.ac.android.common.log.ACLog;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

@SuppressLint({"Registered"})
public class GriverBaseActivity extends FragmentActivity {
    public static Class[] ACTIVITY_CLASSES = {Lite1.class, Lite2.class, Lite3.class};
    public static final int getMin = 33;
    public static final byte[] setMax = {69, -3, -20, 90, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    protected ActivityHelper mActivityHelper;
    protected ActivityHelperExtension mActivityHelperExtension;

    public static class Lite1 extends Lite {
    }

    public static class Lite2 extends Lite {
    }

    public static class Lite3 extends Lite {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(short r8, int r9, byte r10) {
        /*
            int r9 = r9 * 45
            int r9 = 101 - r9
            int r10 = r10 * 165
            int r10 = r10 + 11
            byte[] r0 = setMax
            int r8 = r8 * 175
            int r8 = 178 - r8
            byte[] r1 = new byte[r10]
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r9 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            goto L_0x0033
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r10) goto L_0x0029
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r2)
            return r8
        L_0x0029:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r0
            r0 = r10
            r10 = r3
            r3 = r1
            r1 = r7
        L_0x0033:
            int r10 = -r10
            int r8 = r8 + r10
            int r8 = r8 + -2
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverBaseActivity.getMin(short, int, byte):java.lang.String");
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = setMax;
        String min2 = getMin((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = setMax;
        String min3 = getMin((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(227262562, oncanceled);
            onCancelLoad.getMin(227262562, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 227262562 == (max = dispatchOnCancelled.getMax(applicationContext2, 227262562)))) {
            onCanceled oncanceled2 = new onCanceled(227262562, max, 512);
            onCancelLoad.setMax(227262562, oncanceled2);
            onCancelLoad.getMin(227262562, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(227262562, oncanceled3);
            onCancelLoad.getMin(227262562, oncanceled3);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(227262562, oncanceled4);
            onCancelLoad.getMin(227262562, oncanceled4);
        }
        super.onCreate(bundle);
        StartClientBundle startClientBundle = (StartClientBundle) BundleUtils.getParcelable(getIntent().getExtras(), RVConstants.EXTRA_ARIVER_START_BUNDLE);
        if (bundle != null && bundle.size() > 0) {
            String string = bundle.getString("RESTORE_APPID");
            Bundle bundle2 = bundle.getBundle("RESTORE_STARTUP_PARAMS");
            if (RVProxy.sHasSetupProxy) {
                MonitorMap.Builder builder = new MonitorMap.Builder();
                builder.message("Open the app by restore");
                GriverMonitor.error(GriverMonitorConstants.ERROR_OPEN_APP_EXCEPTION, "GriverAppContainer", builder.build());
                ((GriverActivityRestoreExtension) RVProxy.get(GriverActivityRestoreExtension.class)).restore(this, string, bundle2);
            }
            finish();
            overridePendingTransition(R.anim.griver_core_fade_in, R.anim.griver_core_fade_out);
        } else if (startClientBundle == null || startClientBundle.startParams == null) {
            ACLog.e("GriverBaseActivity", "Please use Griver correctly with openApp or openUrl API.");
            if (RVProxy.sHasSetupProxy) {
                MonitorMap.Builder builder2 = new MonitorMap.Builder();
                builder2.message("Open the app without using the correct interface");
                GriverMonitor.error(GriverMonitorConstants.ERROR_OPEN_APP_EXCEPTION, "GriverAppContainer", builder2.build());
            }
            finish();
        } else if (!RVProxy.sHasSetupProxy) {
            ACLog.e("GriverBaseActivity", "Please ensure that Griver has been initialized successful.");
            String string2 = BundleUtils.getString(startClientBundle.startParams, "appId");
            String string3 = BundleUtils.getString(startClientBundle.startParams, "appVersion");
            String string4 = BundleUtils.getString(startClientBundle.startParams, "u");
            if (!TextUtils.isEmpty(string2)) {
                StringBuilder sb = new StringBuilder("openStack: open appId == ");
                sb.append(string2);
                sb.append(", appVersion == ");
                sb.append(string3);
                ACLog.e("GriverBaseActivity", sb.toString());
            }
            if (!TextUtils.isEmpty(string4)) {
                ACLog.e("GriverBaseActivity", "openStack: open url == ".concat(String.valueOf(string4)));
            }
            finish();
        } else {
            AnonymousClass1 r1 = new ActivityHelper(this) {
                public AppContext createAppContext(App app, FragmentActivity fragmentActivity) {
                    return new NebulaAppContext(getApp(), GriverBaseActivity.this);
                }
            };
            this.mActivityHelper = r1;
            r1.setupParams(getIntent());
            setContentView(R.layout.griver_layout_base_activity);
            this.mActivityHelper.onCreate();
            if (!UCUtils.isDynamicDelivery()) {
                overridePendingTransition(R.anim.griver_core_app_enter_up_in, R.anim.griver_core_app_enter_scale);
            }
            Bundle extras = getIntent().getExtras();
            boolean z = BundleUtils.getBoolean(extras, "isTransparent", false);
            if (z) {
                a();
            }
            try {
                k.a(this, extras, z);
            } catch (Exception e) {
                GriverLogger.e("GriverBaseActivity", "setWindowSoftInputMode failed", e);
            }
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(this.mActivityHelper.getApp(), getCurrentUri(), PerfId.attachContext, GriverPerformanceStages.attachContext);
            GriverPerformanceStages.activityCreated = SystemClock.elapsedRealtime();
            ((RVPerformanceTracker) RVProxy.get(RVPerformanceTracker.class)).track(this.mActivityHelper.getApp(), getCurrentUri(), PerfId.activityCreated, GriverPerformanceStages.activityCreated);
            ActivityHelperExtension activityHelperExtension = (ActivityHelperExtension) RVProxy.get(ActivityHelperExtension.class);
            this.mActivityHelperExtension = activityHelperExtension;
            activityHelperExtension.bindActivity(this);
            this.mActivityHelperExtension.onCreate(bundle);
            b.a((Activity) this, this.mActivityHelper);
        }
    }

    private void a() {
        ((RelativeLayout) findViewById(R.id.fragment_container)).setBackgroundColor(-1);
    }

    public String getCurrentUri() {
        App app;
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper == null || (app = activityHelper.getApp()) == null || app.getActivePage() == null) {
            return null;
        }
        return app.getActivePage().getPageURI();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int length;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-1458306022, oncanceled);
            onCancelLoad.getMin(-1458306022, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(i);
        if (i != max2) {
            onCanceled oncanceled2 = new onCanceled(i, max2, 16);
            onCancelLoad.setMax(-1458306022, oncanceled2);
            onCancelLoad.getMin(-1458306022, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1458306022, oncanceled3);
            onCancelLoad.getMin(-1458306022, oncanceled3);
        }
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            return activityHelper.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ActivityHelperExtension activityHelperExtension = this.mActivityHelperExtension;
        if (activityHelperExtension != null) {
            activityHelperExtension.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onNewIntent(intent);
            this.mActivityHelperExtension.onNewIntent(intent);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(546427963, oncanceled);
            onCancelLoad.getMin(546427963, oncanceled);
        }
        super.onSaveInstanceState(bundle);
        ActivityHelper activityHelper = this.mActivityHelper;
        if (!(activityHelper == null || activityHelper.getApp() == null)) {
            App app = this.mActivityHelper.getApp();
            bundle.putString("RESTORE_APPID", app.getAppId());
            bundle.putBundle("RESTORE_STARTUP_PARAMS", app.getStartParams());
            bundle.putBundle("RESTORE_SCENE_PARAMS", app.getSceneParams());
        }
        GriverLogger.d("GriverBaseActivity", "onSaveInstanceState");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        int length;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1935561540 == (max = dispatchOnCancelled.getMax(applicationContext, -1935561540)))) {
            onCanceled oncanceled = new onCanceled(-1935561540, max, 512);
            onCancelLoad.setMax(-1935561540, oncanceled);
            onCancelLoad.getMin(-1935561540, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1935561540, oncanceled2);
            onCancelLoad.getMin(-1935561540, oncanceled2);
        }
        GriverLogger.d("GriverBaseActivity", "onSaveInstanceState");
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onRequestPermissionResult(i, strArr, iArr);
            this.mActivityHelperExtension.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int min;
        int length;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(77036855, oncanceled);
            onCancelLoad.getMin(77036855, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(77036855, oncanceled2);
            onCancelLoad.getMin(77036855, oncanceled2);
        }
        super.onActivityResult(i, i2, intent);
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onActivityResult(i, i2, intent);
            this.mActivityHelperExtension.onActivityResult(i, i2, intent);
        }
    }

    public void finish() {
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.finish();
            this.mActivityHelperExtension.finish();
        }
        super.finish();
        if (!UCUtils.isDynamicDelivery()) {
            overridePendingTransition(R.anim.griver_core_app_exit_scale, R.anim.griver_core_app_exit_down_out);
        }
    }

    public void finishAndRemoveTask() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-418709728, oncanceled);
            onCancelLoad.getMin(-418709728, oncanceled);
        }
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.finishAndRemoveTask();
        }
        super.finishAndRemoveTask();
        if (!UCUtils.isDynamicDelivery()) {
            overridePendingTransition(R.anim.griver_core_app_exit_scale, R.anim.griver_core_app_exit_down_out);
        }
    }

    public void onDestroy() {
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onDestroy();
            this.mActivityHelperExtension.onDestroy();
        }
        super.onDestroy();
    }

    public void onStop() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1143007580 == (max = dispatchOnCancelled.getMax(applicationContext, -1143007580)))) {
            onCanceled oncanceled = new onCanceled(-1143007580, max, 512);
            onCancelLoad.setMax(-1143007580, oncanceled);
            onCancelLoad.getMin(-1143007580, oncanceled);
        }
        super.onStop();
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onStop();
            this.mActivityHelperExtension.onStop();
        }
    }

    public void onPause() {
        super.onPause();
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onPause();
            this.mActivityHelperExtension.onPause();
        }
    }

    public void onResume() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-168804719, oncanceled);
            onCancelLoad.getMin(-168804719, oncanceled);
        }
        super.onResume();
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onResume();
            this.mActivityHelperExtension.onResume();
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onUserLeaveHint();
        }
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onUserInteraction();
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-1710079146, oncanceled);
            onCancelLoad.getMin(-1710079146, oncanceled);
        }
        super.attachBaseContext(context);
        H5SplitCompatUtils.doInstall(this);
        GriverPerformanceStages.attachContext = SystemClock.elapsedRealtime();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H5SplitCompatUtils.doInstall(this);
        ActivityHelper activityHelper = this.mActivityHelper;
        if (activityHelper != null) {
            activityHelper.onConfigurationChanged(configuration);
        }
    }

    public static class Main extends GriverBaseActivity {
        public static final byte[] length = {59, -110, -84, -123, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
        public static final int setMin = 6;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getMin(int r6, int r7, short r8) {
            /*
                int r8 = r8 * 165
                int r8 = 176 - r8
                int r7 = r7 * 175
                int r7 = r7 + 4
                int r6 = r6 * 45
                int r6 = 101 - r6
                byte[] r0 = length
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L_0x0019
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r8
                r8 = r7
                goto L_0x0033
            L_0x0019:
                r3 = 0
                r5 = r7
                r7 = r6
                r6 = r5
            L_0x001d:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L_0x002a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L_0x002a:
                byte r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L_0x0033:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r8 + 1
                int r7 = r7 + -2
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L_0x001d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverBaseActivity.Main.getMin(int, int, short):java.lang.String");
        }

        public void onCreate(@Nullable Bundle bundle) {
            int length2;
            int min;
            int max;
            byte b = (byte) length[8];
            byte b2 = (byte) b;
            String min2 = getMin(b, b2, (byte) b2);
            byte b3 = (byte) length[96];
            byte b4 = (byte) b3;
            String min3 = getMin(b3, b4, (byte) b4);
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
            if (applicationContext != null) {
                registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
            }
            int nextInt = new Random().nextInt(Integer.MAX_VALUE);
            int length3 = dispatchOnCancelled.length(nextInt);
            if (nextInt != length3) {
                onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
                onCancelLoad.setMax(-1480032157, oncanceled);
                onCancelLoad.getMin(-1480032157, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || -1480032157 == (max = dispatchOnCancelled.getMax(applicationContext2, -1480032157)))) {
                onCanceled oncanceled2 = new onCanceled(-1480032157, max, 512);
                onCancelLoad.setMax(-1480032157, oncanceled2);
                onCancelLoad.getMin(-1480032157, oncanceled2);
            }
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
                onCanceled oncanceled3 = new onCanceled(length2, min, 8);
                onCancelLoad.setMax(-1480032157, oncanceled3);
                onCancelLoad.getMin(-1480032157, oncanceled3);
            }
            GriverBaseActivity.super.onCreate(bundle);
        }
    }

    public static class Lite extends GriverBaseActivity {
        public static final int getMax = 68;
        public static final byte[] length = {56, -108, -67, 9, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};

        /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getMin(int r6, byte r7, byte r8) {
            /*
                byte[] r0 = length
                int r6 = r6 + 4
                int r7 = r7 * 165
                int r7 = r7 + 11
                int r8 = r8 * 45
                int r8 = 101 - r8
                byte[] r1 = new byte[r7]
                int r7 = r7 + -1
                r2 = 0
                if (r0 != 0) goto L_0x0019
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r7
                r7 = r6
                goto L_0x0034
            L_0x0019:
                r3 = 0
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L_0x001e:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L_0x002d
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L_0x002d:
                byte r3 = r0[r7]
                r5 = r0
                r0 = r8
                r8 = r3
                r3 = r1
                r1 = r5
            L_0x0034:
                int r8 = -r8
                int r6 = r6 + r8
                int r6 = r6 + -2
                r8 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L_0x001e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverBaseActivity.Lite.getMin(int, byte, byte):java.lang.String");
        }

        public void onCreate(@Nullable Bundle bundle) {
            int length2;
            int min;
            int length3;
            byte[] bArr = length;
            String min2 = getMin((short) bArr[85], (byte) bArr[96], (byte) bArr[8]);
            byte[] bArr2 = length;
            String min3 = getMin(174, (byte) bArr2[8], (byte) bArr2[96]);
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
            if (applicationContext != null) {
                registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
            }
            int nextInt = new Random().nextInt(Integer.MAX_VALUE);
            int length4 = dispatchOnCancelled.length(nextInt);
            if (nextInt != length4) {
                onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
                onCancelLoad.setMax(2013313974, oncanceled);
                onCancelLoad.getMin(2013313974, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length3, 4);
                onCancelLoad.setMax(2013313974, oncanceled2);
                onCancelLoad.getMin(2013313974, oncanceled2);
            }
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
                onCanceled oncanceled3 = new onCanceled(length2, min, 8);
                onCancelLoad.setMax(2013313974, oncanceled3);
                onCancelLoad.getMin(2013313974, oncanceled3);
            }
            GriverBaseActivity.super.onCreate(bundle);
            if (IpcChannelManager.getInstance().getServerChannel() == null) {
                Intent intent = new Intent();
                intent.setClass(this, IpcMsgServerService.class);
                startService(intent);
                bindService(intent, new ServiceConnection() {
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        RVLogger.d("GriverBaseActivity", "onServiceConnected ".concat(String.valueOf(componentName)));
                        IpcChannelManager.getInstance().registerServerChannel(IIpcChannel.Stub.asInterface(iBinder));
                    }

                    public void onServiceDisconnected(ComponentName componentName) {
                        IpcChannelManager.getInstance().unRegisterServerChannel();
                    }
                }, 0);
            }
        }
    }
}
