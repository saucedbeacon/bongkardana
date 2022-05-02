package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.mixpanel.android.mpmetrics.MixpanelNotificationData;
import java.util.Random;
import o.convertFocusDirectionToLayoutDirection;
import o.dispatchOnCancelled;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.json.JSONException;
import org.json.JSONObject;

public class MixpanelNotificationRouteActivity extends Activity {
    public static final int getMax = 100;
    public static final byte[] getMin = {Framer.STDERR_FRAME_PREFIX, -32, Framer.STDIN_FRAME_PREFIX, 46, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    protected final String LOGTAG = "MixpanelAPI.MixpanelNotificationRouteActivity";

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 165
            int r7 = 176 - r7
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r0 = getMin
            int r6 = r6 * 175
            int r6 = 179 - r6
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            goto L_0x0031
        L_0x001b:
            r3 = 0
        L_0x001c:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L_0x0029
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0029:
            byte r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0031:
            int r6 = r6 + 1
            int r0 = r0 + r7
            int r7 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MixpanelNotificationRouteActivity.getMax(int, short, short):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = getMin;
        String max2 = getMax((byte) bArr[85], (byte) bArr[8], (byte) bArr[85]);
        byte[] bArr2 = getMin;
        String max3 = getMax((byte) bArr2[8], (byte) bArr2[85], (byte) bArr2[8]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(1712589184, oncanceled);
            onCancelLoad.getMin(1712589184, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1712589184 == (max = dispatchOnCancelled.getMax(applicationContext2, 1712589184)))) {
            onCanceled oncanceled2 = new onCanceled(1712589184, max, 512);
            onCancelLoad.setMax(1712589184, oncanceled2);
            onCancelLoad.getMin(1712589184, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1712589184, oncanceled3);
            onCancelLoad.getMin(1712589184, oncanceled3);
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (intent == null) {
            findOnePartiallyOrCompletelyInvisibleChild.length();
            return;
        }
        trackTapAction(intent);
        Intent handleRouteIntent = handleRouteIntent(intent);
        if (!extras.getBoolean("mp_is_sticky")) {
            MixpanelFCMMessagingService mixpanelFCMMessagingService = new MixpanelFCMMessagingService();
            Context applicationContext3 = getApplicationContext();
            getApplicationContext();
            mixpanelFCMMessagingService.cancelNotification(extras, (NotificationManager) applicationContext3.getSystemService("notification"));
        }
        finish();
        startActivity(handleRouteIntent);
    }

    /* access modifiers changed from: protected */
    public Intent handleRouteIntent(Intent intent) {
        MixpanelNotificationData.PushTapActionType pushTapActionType;
        CharSequence charSequence = intent.getExtras().getCharSequence("mp_tap_action_type");
        if (charSequence == null) {
            findOnePartiallyOrCompletelyInvisibleChild.length();
            pushTapActionType = MixpanelNotificationData.PushTapActionType.HOMESCREEN;
        } else {
            pushTapActionType = MixpanelNotificationData.PushTapActionType.fromString(charSequence.toString());
        }
        CharSequence charSequence2 = intent.getExtras().getCharSequence("mp_tap_action_uri");
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        int i = AnonymousClass1.setMax[pushTapActionType.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return launchIntentForPackage;
            }
            return new Intent("android.intent.action.VIEW", Uri.parse(charSequence2.toString()));
        } else if (URLUtil.isValidUrl(charSequence2.toString())) {
            return new Intent("android.intent.action.VIEW", Uri.parse(charSequence2.toString())).addCategory("android.intent.category.BROWSABLE");
        } else {
            findOnePartiallyOrCompletelyInvisibleChild.length();
            return launchIntentForPackage;
        }
    }

    /* renamed from: com.mixpanel.android.mpmetrics.MixpanelNotificationRouteActivity$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.mixpanel.android.mpmetrics.MixpanelNotificationData$PushTapActionType[] r0 = com.mixpanel.android.mpmetrics.MixpanelNotificationData.PushTapActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                com.mixpanel.android.mpmetrics.MixpanelNotificationData$PushTapActionType r1 = com.mixpanel.android.mpmetrics.MixpanelNotificationData.PushTapActionType.HOMESCREEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mixpanel.android.mpmetrics.MixpanelNotificationData$PushTapActionType r1 = com.mixpanel.android.mpmetrics.MixpanelNotificationData.PushTapActionType.URL_IN_BROWSER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mixpanel.android.mpmetrics.MixpanelNotificationData$PushTapActionType r1 = com.mixpanel.android.mpmetrics.MixpanelNotificationData.PushTapActionType.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MixpanelNotificationRouteActivity.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void trackTapAction(Intent intent) {
        String str;
        String stringExtra = intent.getStringExtra("mp_tap_target");
        String stringExtra2 = intent.getStringExtra("mp_tap_action_type");
        String stringExtra3 = intent.getStringExtra("mp_tap_action_uri");
        Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("mp_is_sticky", false));
        String str2 = null;
        if (stringExtra == null || !stringExtra.equals(ApiDowngradeConstant.JsonKeys.BUTTON)) {
            str = null;
        } else {
            str2 = intent.getStringExtra("mp_button_id");
            str = intent.getStringExtra("mp_button_label");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("$tap_target", stringExtra);
            jSONObject.putOpt("$tap_action_type", stringExtra2);
            jSONObject.putOpt("$tap_action_uri", stringExtra3);
            jSONObject.putOpt("$is_sticky", valueOf);
            jSONObject.putOpt("$button_id", str2);
            jSONObject.putOpt("$button_label", str);
        } catch (JSONException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
        convertFocusDirectionToLayoutDirection.getMax(getApplicationContext(), intent, "$push_notification_tap", jSONObject);
    }
}
