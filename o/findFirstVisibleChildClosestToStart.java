package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.mixpanel.android.mpmetrics.MixpanelNotificationData;
import com.mixpanel.android.mpmetrics.MixpanelNotificationRouteActivity;
import com.mixpanel.android.util.ImageStore;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import o.findPartiallyOrCompletelyInvisibleChildClosestToEnd;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class findFirstVisibleChildClosestToStart {
    private findFirstVisibleChildClosestToEnd IsOverlapping;
    private long equals;
    public MixpanelNotificationData getMax;
    public int getMin;
    protected final int length;
    private final String setMax;
    private Context setMin;
    private Notification.Builder toFloatRange;
    private boolean toIntRange;

    public findFirstVisibleChildClosestToStart(Context context) {
        this(context, new Notification.Builder(context), System.currentTimeMillis());
    }

    private findFirstVisibleChildClosestToStart(Context context, Notification.Builder builder, long j) {
        this.setMax = "MixpanelAPI.MixpanelPushNotification";
        this.toIntRange = false;
        this.setMin = context;
        this.toFloatRange = builder;
        String str = shouldMeasureTwice.getMax(context).values;
        this.IsOverlapping = new findPartiallyOrCompletelyInvisibleChildClosestToEnd.getMin(str == null ? context.getPackageName() : str, context);
        this.equals = j;
        int i = (int) j;
        this.length = i;
        this.getMin = i;
    }

    private void getMin(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1780087921, oncanceled);
            onCancelLoad.getMin(-1780087921, oncanceled);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.toFloatRange.setStyle(new Notification.BigTextStyle().bigText(str));
        }
    }

    private void setMax() {
        if (Build.VERSION.SDK_INT >= 20) {
            int i = 0;
            while (i < this.getMax.equals.size()) {
                MixpanelNotificationData.setMax setmax = this.getMax.equals.get(i);
                Notification.Builder builder = this.toFloatRange;
                String str = setmax.getMax;
                MixpanelNotificationData.getMin getmin = setmax.setMin;
                String str2 = setmax.length;
                i++;
                Bundle max = getMax(getmin);
                max.putCharSequence("mp_tap_target", ApiDowngradeConstant.JsonKeys.BUTTON);
                max.putCharSequence("mp_button_id", str2);
                max.putCharSequence("mp_button_label", str);
                builder.addAction(new Notification.Action.Builder(-1, str, PendingIntent.getActivity(this.setMin, this.length + i, new Intent().setClass(this.setMin, MixpanelNotificationRouteActivity.class).putExtras(max).setFlags(1073741824), 268435456)).build());
            }
        }
    }

    private List<MixpanelNotificationData.setMax> setMax(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("lbl");
                    MixpanelNotificationData.getMin min = setMin(jSONObject.getString("ontap"));
                    String string2 = jSONObject.getString("id");
                    if (!(min == null || string == null)) {
                        if (string2 != null) {
                            arrayList.add(new MixpanelNotificationData.setMax(string, min, string2));
                        }
                    }
                    findOnePartiallyOrCompletelyInvisibleChild.length();
                }
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
        }
        return arrayList;
    }

    private MixpanelNotificationData.getMin setMin(String str) {
        MixpanelNotificationData.getMin getmin;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            if (!string.equals(MixpanelNotificationData.PushTapActionType.HOMESCREEN.toString())) {
                getmin = new MixpanelNotificationData.getMin(MixpanelNotificationData.PushTapActionType.fromString(string), jSONObject.getString("uri"));
            } else {
                getmin = new MixpanelNotificationData.getMin(MixpanelNotificationData.PushTapActionType.fromString(string));
            }
            if (!getmin.length.toString().equals(MixpanelNotificationData.PushTapActionType.ERROR.toString())) {
                return getmin;
            }
            this.toIntRange = true;
            return new MixpanelNotificationData.getMin(MixpanelNotificationData.PushTapActionType.HOMESCREEN);
        } catch (JSONException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.length();
            return null;
        }
    }

    private Bundle getMax(MixpanelNotificationData.getMin getmin) {
        String str;
        Bundle bundle = new Bundle();
        bundle.putCharSequence("mp_tap_target", "notification");
        bundle.putCharSequence("mp_tap_action_type", getmin.length.toString());
        bundle.putCharSequence("mp_tap_action_uri", getmin.getMax);
        bundle.putCharSequence("mp_message_id", this.getMax.b);
        bundle.putCharSequence("mp_campaign_id", this.getMax.Grayscale$Algorithm);
        bundle.putInt("mp_notification_id", this.getMin);
        bundle.putBoolean("mp_is_sticky", this.getMax.getMin());
        bundle.putCharSequence("mp_tag", this.getMax.hashCode);
        if (this.getMax.hashCode != null) {
            str = this.getMax.hashCode;
        } else {
            str = Integer.toString(this.getMin);
        }
        bundle.putCharSequence("mp_canonical_notification_id", str);
        bundle.putCharSequence("mp", this.getMax.ICustomTabsCallback);
        return bundle;
    }

    private ApplicationInfo getMin() {
        try {
            return this.setMin.getPackageManager().getApplicationInfo(this.setMin.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean setMin() {
        return this.getMax != null && !this.toIntRange;
    }

    private static Date setMin(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
            if (str.equals("yyyy-MM-dd'T'HH:mm:ss'Z'")) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            }
            return simpleDateFormat.parse(str2);
        } catch (ParseException unused) {
            return null;
        }
    }

    private Bitmap getMax(String str) {
        try {
            return new ImageStore(this.setMin, "MixpanelPushNotification").setMax(str);
        } catch (ImageStore.CantGetImageException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00e8, code lost:
        if (r4 < 0) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0279 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013f A[SYNTHETIC, Splitter:B:35:0x013f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0226  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification setMin(android.content.Intent r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r2 = "mp_message"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r3 = "mp_icnm"
            java.lang.String r3 = r1.getStringExtra(r3)
            java.lang.String r4 = "mp_icnm_l"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r5 = "mp_icnm_w"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r6 = "mp_img"
            java.lang.String r6 = r1.getStringExtra(r6)
            java.lang.String r7 = "mp_cta"
            java.lang.String r7 = r1.getStringExtra(r7)
            java.lang.String r8 = "mp_ontap"
            java.lang.String r8 = r1.getStringExtra(r8)
            java.lang.String r9 = "mp_title"
            java.lang.String r9 = r1.getStringExtra(r9)
            java.lang.String r10 = "mp_subtxt"
            java.lang.String r10 = r1.getStringExtra(r10)
            java.lang.String r11 = "mp_color"
            java.lang.String r11 = r1.getStringExtra(r11)
            java.lang.String r12 = "mp_buttons"
            java.lang.String r12 = r1.getStringExtra(r12)
            java.lang.String r13 = "mp_campaign_id"
            java.lang.String r14 = r1.getStringExtra(r13)
            java.lang.String r15 = "mp_message_id"
            r16 = r13
            java.lang.String r13 = r1.getStringExtra(r15)
            r17 = r15
            java.lang.String r15 = "mp"
            r18 = r7
            java.lang.String r7 = r1.getStringExtra(r15)
            r19 = r15
            java.lang.String r15 = "mp_bdgcnt"
            java.lang.String r15 = r1.getStringExtra(r15)
            r20 = r8
            java.lang.String r8 = "mp_channel_id"
            java.lang.String r8 = r1.getStringExtra(r8)
            r21 = r9
            java.lang.String r9 = "mp_tag"
            java.lang.String r9 = r1.getStringExtra(r9)
            r22 = r5
            java.lang.String r5 = "mp_groupkey"
            java.lang.String r5 = r1.getStringExtra(r5)
            r23 = r3
            java.lang.String r3 = "mp_ticker"
            java.lang.String r3 = r1.getStringExtra(r3)
            r24 = r10
            java.lang.String r10 = "mp_sticky"
            java.lang.String r10 = r1.getStringExtra(r10)
            r25 = r10
            java.lang.String r10 = "mp_time"
            java.lang.String r10 = r1.getStringExtra(r10)
            r26 = r11
            java.lang.String r11 = "mp_visibility"
            java.lang.String r11 = r1.getStringExtra(r11)
            r27 = r8
            java.lang.String r8 = "mp_silent"
            java.lang.String r1 = r1.getStringExtra(r8)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r8 = new com.mixpanel.android.mpmetrics.MixpanelNotificationData
            r8.<init>()
            r0.getMax = r8
            r8.toFloatRange = r2
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.valueOf = r4
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.getMax = r6
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.hashCode = r9
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.values = r5
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.toString = r3
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.toDoubleRange = r10
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.Grayscale$Algorithm = r14
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.b = r13
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            java.util.List r3 = r0.setMax(r12)
            r2.equals = r3
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            r2.ICustomTabsCallback = r7
            r2 = 0
            r3 = -1
            if (r15 == 0) goto L_0x00ec
            int r4 = java.lang.Integer.parseInt(r15)     // Catch:{ NumberFormatException -> 0x00ea }
            if (r4 >= 0) goto L_0x00ed
        L_0x00ea:
            r4 = 0
            goto L_0x00ed
        L_0x00ec:
            r4 = -1
        L_0x00ed:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r5 = r0.getMax
            r5.setMin = r4
            r4 = 1
            if (r11 == 0) goto L_0x0130
            int r5 = r11.hashCode()
            r6 = 541947190(0x204d7536, float:1.7402957E-19)
            if (r5 == r6) goto L_0x011c
            r6 = 1959697462(0x74ce9c36, float:1.3095477E32)
            if (r5 == r6) goto L_0x0112
            r6 = 2030844029(0x790c387d, float:4.5504205E34)
            if (r5 == r6) goto L_0x0108
            goto L_0x0126
        L_0x0108:
            java.lang.String r5 = "VISIBILITY_SECRET"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0126
            r5 = 0
            goto L_0x0127
        L_0x0112:
            java.lang.String r5 = "VISIBILITY_PUBLIC"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0126
            r5 = 1
            goto L_0x0127
        L_0x011c:
            java.lang.String r5 = "VISIBILITY_PRIVATE"
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0126
            r5 = 2
            goto L_0x0127
        L_0x0126:
            r5 = -1
        L_0x0127:
            if (r5 == 0) goto L_0x012e
            if (r5 == r4) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            r5 = 1
            goto L_0x0131
        L_0x012e:
            r5 = -1
            goto L_0x0131
        L_0x0130:
            r5 = 0
        L_0x0131:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            r6.Mean$Arithmetic = r5
            if (r27 == 0) goto L_0x013d
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r5 = r0.getMax
            r6 = r27
            r5.IsOverlapping = r6
        L_0x013d:
            if (r26 == 0) goto L_0x0144
            int r5 = android.graphics.Color.parseColor(r26)     // Catch:{ IllegalArgumentException -> 0x0144 }
            goto L_0x0145
        L_0x0144:
            r5 = -1
        L_0x0145:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            r6.getMin = r5
            r5 = 0
            if (r24 == 0) goto L_0x0154
            int r6 = r24.length()
            if (r6 != 0) goto L_0x0154
            r10 = r5
            goto L_0x0156
        L_0x0154:
            r10 = r24
        L_0x0156:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            r6.isInside = r10
            java.lang.String r6 = "true"
            if (r1 == 0) goto L_0x0167
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0167
            r1 = 1
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            r7.invokeSuspend = r1
            if (r25 == 0) goto L_0x0178
            r1 = r25
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0178
            r1 = 1
            goto L_0x0179
        L_0x0178:
            r1 = 0
        L_0x0179:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            r6.FastBitmap$CoordinateSystem = r1
            if (r23 == 0) goto L_0x0190
            o.findFirstVisibleChildClosestToEnd r1 = r0.IsOverlapping
            r6 = r23
            boolean r1 = r1.length(r6)
            if (r1 == 0) goto L_0x0190
            o.findFirstVisibleChildClosestToEnd r1 = r0.IsOverlapping
            int r1 = r1.getMax(r6)
            goto L_0x0191
        L_0x0190:
            r1 = -1
        L_0x0191:
            if (r1 != r3) goto L_0x019f
            android.content.pm.ApplicationInfo r1 = r28.getMin()
            if (r1 == 0) goto L_0x019c
            int r1 = r1.icon
            goto L_0x019f
        L_0x019c:
            r1 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x019f:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            r6.length = r1
            if (r22 == 0) goto L_0x01b6
            o.findFirstVisibleChildClosestToEnd r1 = r0.IsOverlapping
            r6 = r22
            boolean r1 = r1.length(r6)
            if (r1 == 0) goto L_0x01b6
            o.findFirstVisibleChildClosestToEnd r1 = r0.IsOverlapping
            int r1 = r1.getMax(r6)
            goto L_0x01b7
        L_0x01b6:
            r1 = -1
        L_0x01b7:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            r6.setMax = r1
            if (r21 == 0) goto L_0x01c7
            int r1 = r21.length()
            if (r1 != 0) goto L_0x01c4
            goto L_0x01c7
        L_0x01c4:
            r9 = r21
            goto L_0x01db
        L_0x01c7:
            android.content.pm.ApplicationInfo r1 = r28.getMin()
            if (r1 == 0) goto L_0x01d8
            android.content.Context r6 = r0.setMin
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.CharSequence r1 = r6.getApplicationLabel(r1)
            goto L_0x01da
        L_0x01d8:
            java.lang.String r1 = "A message for you"
        L_0x01da:
            r9 = r1
        L_0x01db:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            r1.toIntRange = r9
            r1 = r20
            com.mixpanel.android.mpmetrics.MixpanelNotificationData$getMin r1 = r0.setMin((java.lang.String) r1)
            if (r1 != 0) goto L_0x01f4
            if (r18 == 0) goto L_0x01f3
            com.mixpanel.android.mpmetrics.MixpanelNotificationData$getMin r1 = new com.mixpanel.android.mpmetrics.MixpanelNotificationData$getMin
            com.mixpanel.android.mpmetrics.MixpanelNotificationData$PushTapActionType r6 = com.mixpanel.android.mpmetrics.MixpanelNotificationData.PushTapActionType.URL_IN_BROWSER
            r7 = r18
            r1.<init>(r6, r7)
            goto L_0x01f4
        L_0x01f3:
            r1 = r5
        L_0x01f4:
            if (r1 != 0) goto L_0x01fd
            com.mixpanel.android.mpmetrics.MixpanelNotificationData$getMin r1 = new com.mixpanel.android.mpmetrics.MixpanelNotificationData$getMin
            com.mixpanel.android.mpmetrics.MixpanelNotificationData$PushTapActionType r6 = com.mixpanel.android.mpmetrics.MixpanelNotificationData.PushTapActionType.HOMESCREEN
            r1.<init>(r6)
        L_0x01fd:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            r6.invoke = r1
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.Grayscale$Algorithm
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            java.lang.String r6 = r6.b
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            java.lang.String r7 = r7.ICustomTabsCallback
            if (r1 == 0) goto L_0x0275
            if (r6 == 0) goto L_0x0275
            android.content.Context r8 = r0.setMin
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r11 = r0.getMax
            java.lang.String r11 = r11.hashCode
            if (r11 == 0) goto L_0x0226
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r11 = r0.getMax
            java.lang.String r11 = r11.hashCode
            goto L_0x022c
        L_0x0226:
            int r11 = r0.getMin
            java.lang.String r11 = java.lang.Integer.toString(r11)
        L_0x022c:
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r13 = "$push_notification_received"
            r12 = r7
            o.convertFocusDirectionToLayoutDirection.getMax(r8, r9, r10, r11, r12, r13, r14)
            android.content.Context r8 = r0.setMin
            o.convertFocusDirectionToLayoutDirection r8 = o.convertFocusDirectionToLayoutDirection.length((android.content.Context) r8, (java.lang.String) r7)
            if (r8 == 0) goto L_0x0275
            boolean r8 = r8.setMax()
            if (r8 == 0) goto L_0x0275
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r8 = "message_type"
            java.lang.String r9 = "push"
            r14.put(r8, r9)     // Catch:{ JSONException -> 0x0252 }
            goto L_0x0253
        L_0x0252:
        L_0x0253:
            android.content.Context r8 = r0.setMin
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.hashCode
            if (r1 == 0) goto L_0x0268
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.hashCode
            goto L_0x026e
        L_0x0268:
            int r1 = r0.getMin
            java.lang.String r1 = java.lang.Integer.toString(r1)
        L_0x026e:
            r11 = r1
            java.lang.String r13 = "$campaign_received"
            r12 = r7
            o.convertFocusDirectionToLayoutDirection.getMax(r8, r9, r10, r11, r12, r13, r14)
        L_0x0275:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            if (r1 != 0) goto L_0x027a
            return r5
        L_0x027a:
            boolean r1 = r1.setMin()
            if (r1 == 0) goto L_0x0284
            o.findOnePartiallyOrCompletelyInvisibleChild.length()
            return r5
        L_0x0284:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.toFloatRange
            if (r1 != 0) goto L_0x028e
            o.findOnePartiallyOrCompletelyInvisibleChild.length()
            return r5
        L_0x028e:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.toFloatRange
            java.lang.String r6 = ""
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x029e
            o.findOnePartiallyOrCompletelyInvisibleChild.length()
            return r5
        L_0x029e:
            android.content.Context r1 = r0.setMin
            int r5 = r0.length
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            com.mixpanel.android.mpmetrics.MixpanelNotificationData$getMin r6 = r6.invoke
            android.os.Bundle r6 = r0.getMax((com.mixpanel.android.mpmetrics.MixpanelNotificationData.getMin) r6)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "com.mixpanel.push_notification_tap"
            android.content.Intent r7 = r7.setAction(r8)
            android.content.Context r8 = r0.setMin
            java.lang.Class<com.mixpanel.android.mpmetrics.MixpanelNotificationRouteActivity> r9 = com.mixpanel.android.mpmetrics.MixpanelNotificationRouteActivity.class
            android.content.Intent r7 = r7.setClass(r8, r9)
            android.content.Intent r6 = r7.putExtras(r6)
            r7 = 1073741824(0x40000000, float:2.0)
            android.content.Intent r6 = r6.setFlags(r7)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r1, r5, r6, r7)
            android.content.Context r5 = r0.setMin
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            java.lang.String r7 = r7.b
            r8 = r17
            r6.putCharSequence(r8, r7)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            java.lang.String r7 = r7.Grayscale$Algorithm
            r8 = r16
            r6.putCharSequence(r8, r7)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            java.lang.String r7 = r7.hashCode
            if (r7 == 0) goto L_0x02f1
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            java.lang.String r7 = r7.hashCode
            goto L_0x02f7
        L_0x02f1:
            int r7 = r0.getMin
            java.lang.String r7 = java.lang.Integer.toString(r7)
        L_0x02f7:
            java.lang.String r8 = "mp_canonical_notification_id"
            r6.putCharSequence(r8, r7)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            java.lang.String r7 = r7.ICustomTabsCallback
            r8 = r19
            r6.putCharSequence(r8, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "com.mixpanel.push_notification_dismissed"
            android.content.Intent r7 = r7.setAction(r8)
            android.content.Context r8 = r0.setMin
            java.lang.Class<com.mixpanel.android.mpmetrics.MixpanelPushNotificationDismissedReceiver> r9 = com.mixpanel.android.mpmetrics.MixpanelPushNotificationDismissedReceiver.class
            android.content.Intent r7 = r7.setClass(r8, r9)
            android.content.Intent r6 = r7.putExtras(r6)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r5, r2, r6, r2)
            android.app.Notification$Builder r5 = r0.toFloatRange
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            java.lang.CharSequence r6 = r6.toIntRange
            android.app.Notification$Builder r5 = r5.setContentTitle(r6)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            java.lang.String r6 = r6.toFloatRange
            android.app.Notification$Builder r5 = r5.setContentText(r6)
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            java.lang.String r6 = r6.toString
            if (r6 != 0) goto L_0x033d
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            java.lang.String r6 = r6.toFloatRange
            goto L_0x0341
        L_0x033d:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            java.lang.String r6 = r6.toString
        L_0x0341:
            android.app.Notification$Builder r5 = r5.setTicker(r6)
            android.app.Notification$Builder r1 = r5.setContentIntent(r1)
            r1.setDeleteIntent(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0362
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            int r1 = r1.setMax
            if (r1 == r3) goto L_0x0362
            android.app.Notification$Builder r1 = r0.toFloatRange
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r5 = r0.getMax
            int r5 = r5.setMax
            r1.setSmallIcon(r5)
            goto L_0x036b
        L_0x0362:
            android.app.Notification$Builder r1 = r0.toFloatRange
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r5 = r0.getMax
            int r5 = r5.length
            r1.setSmallIcon(r5)
        L_0x036b:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.valueOf
            java.lang.String r5 = "http"
            if (r1 == 0) goto L_0x03b6
            o.findFirstVisibleChildClosestToEnd r1 = r0.IsOverlapping
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r6 = r0.getMax
            java.lang.String r6 = r6.valueOf
            boolean r1 = r1.length(r6)
            if (r1 == 0) goto L_0x0399
            android.app.Notification$Builder r1 = r0.toFloatRange
            o.findFirstVisibleChildClosestToEnd r6 = r0.IsOverlapping
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r7 = r0.getMax
            java.lang.String r7 = r7.valueOf
            int r6 = r6.getMax(r7)
            android.content.Context r7 = r0.setMin
            android.content.res.Resources r7 = r7.getResources()
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r7, r6)
            r1.setLargeIcon(r6)
            goto L_0x03b6
        L_0x0399:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.valueOf
            boolean r1 = r1.startsWith(r5)
            if (r1 == 0) goto L_0x03b3
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.valueOf
            android.graphics.Bitmap r1 = r0.getMax((java.lang.String) r1)
            if (r1 == 0) goto L_0x03b6
            android.app.Notification$Builder r6 = r0.toFloatRange
            r6.setLargeIcon(r1)
            goto L_0x03b6
        L_0x03b3:
            o.findOnePartiallyOrCompletelyInvisibleChild.length()
        L_0x03b6:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 16
            if (r1 < r6) goto L_0x03f8
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.getMax
            if (r1 == 0) goto L_0x03f1
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.getMax
            boolean r1 = r1.startsWith(r5)
            if (r1 == 0) goto L_0x03f1
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax     // Catch:{ Exception -> 0x03f1 }
            java.lang.String r1 = r1.getMax     // Catch:{ Exception -> 0x03f1 }
            android.graphics.Bitmap r1 = r0.getMax((java.lang.String) r1)     // Catch:{ Exception -> 0x03f1 }
            if (r1 != 0) goto L_0x03de
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax     // Catch:{ Exception -> 0x03f1 }
            java.lang.String r1 = r1.toFloatRange     // Catch:{ Exception -> 0x03f1 }
            r0.getMin(r1)     // Catch:{ Exception -> 0x03f1 }
            goto L_0x03f8
        L_0x03de:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x03f1 }
            if (r5 < r6) goto L_0x03f8
            android.app.Notification$Builder r5 = r0.toFloatRange     // Catch:{ Exception -> 0x03f1 }
            android.app.Notification$BigPictureStyle r7 = new android.app.Notification$BigPictureStyle     // Catch:{ Exception -> 0x03f1 }
            r7.<init>()     // Catch:{ Exception -> 0x03f1 }
            android.app.Notification$BigPictureStyle r1 = r7.bigPicture(r1)     // Catch:{ Exception -> 0x03f1 }
            r5.setStyle(r1)     // Catch:{ Exception -> 0x03f1 }
            goto L_0x03f8
        L_0x03f1:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.toFloatRange
            r0.getMin(r1)
        L_0x03f8:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L_0x040b
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            int r1 = r1.getMin
            if (r1 == r3) goto L_0x040b
            android.app.Notification$Builder r1 = r0.toFloatRange
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r3 = r0.getMax
            int r3 = r3.getMin
            r1.setColor(r3)
        L_0x040b:
            r28.setMax()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0448
            android.content.Context r1 = r0.setMin
            java.lang.String r3 = "notification"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r3 = r0.getMax
            java.lang.String r3 = r3.IsOverlapping
            if (r3 != 0) goto L_0x042d
            android.content.Context r3 = r0.setMin
            o.shouldMeasureTwice r3 = o.shouldMeasureTwice.getMax(r3)
            java.lang.String r3 = r3.Grayscale$Algorithm
            goto L_0x0431
        L_0x042d:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r3 = r0.getMax
            java.lang.String r3 = r3.IsOverlapping
        L_0x0431:
            android.content.Context r5 = r0.setMin
            o.shouldMeasureTwice r5 = o.shouldMeasureTwice.getMax(r5)
            java.lang.String r5 = r5.valueOf
            android.app.NotificationChannel r7 = new android.app.NotificationChannel
            r8 = 3
            r7.<init>(r3, r5, r8)
            r1.createNotificationChannel(r7)
            android.app.Notification$Builder r1 = r0.toFloatRange
            r1.setChannelId(r3)
            goto L_0x0455
        L_0x0448:
            android.app.Notification$Builder r1 = r0.toFloatRange
            android.content.Context r3 = r0.setMin
            o.shouldMeasureTwice r3 = o.shouldMeasureTwice.getMax(r3)
            int r3 = r3.FastBitmap$CoordinateSystem
            r1.setDefaults(r3)
        L_0x0455:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            int r1 = r1.setMin
            if (r1 <= 0) goto L_0x0464
            android.app.Notification$Builder r1 = r0.toFloatRange
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r3 = r0.getMax
            int r3 = r3.setMin
            r1.setNumber(r3)
        L_0x0464:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r1 < r3) goto L_0x046f
            android.app.Notification$Builder r1 = r0.toFloatRange
            r1.setShowWhen(r4)
        L_0x046f:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.toDoubleRange
            if (r1 != 0) goto L_0x047d
            android.app.Notification$Builder r1 = r0.toFloatRange
            long r3 = r0.equals
            r1.setWhen(r3)
            goto L_0x04b1
        L_0x047d:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.toDoubleRange
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssz"
            java.util.Date r1 = setMin(r3, r1)
            if (r1 != 0) goto L_0x0495
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.toDoubleRange
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss'Z'"
            java.util.Date r1 = setMin(r3, r1)
        L_0x0495:
            if (r1 != 0) goto L_0x04a2
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.String r1 = r1.toDoubleRange
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss"
            java.util.Date r1 = setMin(r3, r1)
        L_0x04a2:
            if (r1 != 0) goto L_0x04a8
            o.findOnePartiallyOrCompletelyInvisibleChild.length()
            goto L_0x04b1
        L_0x04a8:
            android.app.Notification$Builder r3 = r0.toFloatRange
            long r4 = r1.getTime()
            r3.setWhen(r4)
        L_0x04b1:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L_0x04be
            android.app.Notification$Builder r1 = r0.toFloatRange
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            int r2 = r2.Mean$Arithmetic
            r1.setVisibility(r2)
        L_0x04be:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r6) goto L_0x04d1
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r1 = r0.getMax
            java.lang.CharSequence r1 = r1.isInside
            if (r1 == 0) goto L_0x04d1
            android.app.Notification$Builder r1 = r0.toFloatRange
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            java.lang.CharSequence r2 = r2.isInside
            r1.setSubText(r2)
        L_0x04d1:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r6) goto L_0x04dc
            android.app.Notification$Builder r1 = r0.toFloatRange
            android.app.Notification r1 = r1.build()
            goto L_0x04e2
        L_0x04dc:
            android.app.Notification$Builder r1 = r0.toFloatRange
            android.app.Notification r1 = r1.getNotification()
        L_0x04e2:
            com.mixpanel.android.mpmetrics.MixpanelNotificationData r2 = r0.getMax
            boolean r2 = r2.getMin()
            if (r2 != 0) goto L_0x04ef
            int r2 = r1.flags
            r2 = r2 | r6
            r1.flags = r2
        L_0x04ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findFirstVisibleChildClosestToStart.setMin(android.content.Intent):android.app.Notification");
    }
}
