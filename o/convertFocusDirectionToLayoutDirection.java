package o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Message;
import com.google.firebase.messaging.Constants;
import com.mixpanel.android.mpmetrics.InAppNotification;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import o.fill;
import o.findFirstPartiallyOrCompletelyInvisibleChild;
import o.recycleChildren;
import o.setInitialPrefetchItemCount;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class convertFocusDirectionToLayoutDirection {
    private static final findFirstPartiallyOrCompletelyInvisibleChild Grayscale$Algorithm = new findFirstPartiallyOrCompletelyInvisibleChild();
    private static final findFirstVisibleItemPosition Mean$Arithmetic = new findFirstVisibleItemPosition();
    private static Future<SharedPreferences> invokeSuspend;
    private static final Map<String, Map<Context, convertFocusDirectionToLayoutDirection>> valueOf = new HashMap();
    private getChildClosestToEnd FastBitmap$CoordinateSystem;
    /* access modifiers changed from: package-private */
    public final calculateTimeForScrolling IsOverlapping;
    public final findReferenceChild equals;
    public final setInitialPrefetchItemCount getMax;
    public final String getMin;
    /* access modifiers changed from: private */
    public final recycleChildren hashCode;
    /* access modifiers changed from: private */
    public final findPartiallyOrCompletelyInvisibleChildClosestToStart invoke;
    private final toFloatRange isInside;
    /* access modifiers changed from: package-private */
    public final shouldMeasureTwice length;
    public final getMax setMax;
    final Context setMin;
    private final calculateSpeedPerPixel toDoubleRange;
    public final Map<String, String> toFloatRange;
    private final Map<String, Object> toIntRange;
    /* access modifiers changed from: private */
    public final recycleViewsFromStart toString;
    private final Map<String, Long> values;

    public interface length {
        void getMin(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection);
    }

    public interface setMax {
        void getMax(String str);

        void getMax(String str, double d);

        void getMax(JSONObject jSONObject);

        boolean getMax();

        void getMin();

        void getMin(Activity activity);

        void getMin(InAppNotification inAppNotification, Activity activity);

        void getMin(String str, Object obj);

        void getMin(String str, JSONObject jSONObject);

        setMax length(String str);

        void length();

        void length(String str, InAppNotification inAppNotification, JSONObject jSONObject);

        void setMax(String str);

        void setMax(JSONObject jSONObject);

        void setMin();

        void setMin(String str, Object obj);
    }

    interface toFloatRange extends recycleChildren.setMin {
    }

    public static void setMax(Context context, Intent intent, String str) {
        getMax(context, intent, str, new JSONObject());
    }

    public static void getMax(Context context, Intent intent, String str, JSONObject jSONObject) {
        if (!intent.hasExtra("mp") || !intent.hasExtra("mp_campaign_id") || !intent.hasExtra("mp_message_id")) {
            findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            return;
        }
        String stringExtra = intent.getStringExtra("mp_message_id");
        String stringExtra2 = intent.getStringExtra("mp_campaign_id");
        Context context2 = context;
        getMax(context2, Integer.valueOf(stringExtra2), Integer.valueOf(stringExtra), intent.getStringExtra("mp_canonical_notification_id"), intent.getStringExtra("mp"), str, jSONObject);
    }

    static void getMax(Context context, Integer num, Integer num2, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            if (jSONObject2.optString("token") == null) {
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                return;
            }
            jSONObject2.remove("token");
            if (jSONObject2.optString("distinct_id") == null) {
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                return;
            }
            jSONObject2.remove("distinct_id");
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
                jSONObject2.put(Constants.MessagePayloadKeys.MSGID_SERVER, num2);
                jSONObject2.put("campaign_id", num);
                jSONObject2.put("$android_notification_id", str);
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
            convertFocusDirectionToLayoutDirection length2 = length(context, str2);
            if (length2 == null) {
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                return;
            }
            length2.setMin(str3, jSONObject2);
            if (!length2.getMax()) {
                length2.getMax.length(new setInitialPrefetchItemCount.getMin(length2.getMin, false));
            }
        } catch (JSONException unused2) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
    }

    static convertFocusDirectionToLayoutDirection length(Context context, String str) {
        try {
            String optString = new JSONObject(str).optString("token");
            if (optString == null) {
                return null;
            }
            return setMin(context, optString);
        } catch (JSONException unused) {
            return null;
        }
    }

    private convertFocusDirectionToLayoutDirection(Context context, Future<SharedPreferences> future, String str) {
        this(context, future, str, shouldMeasureTwice.getMax(context));
    }

    private convertFocusDirectionToLayoutDirection(Context context, Future<SharedPreferences> future, String str, shouldMeasureTwice shouldmeasuretwice) {
        Context context2;
        calculateTimeForScrolling calculatetimeforscrolling;
        calculateSpeedPerPixel calculatespeedperpixel;
        toFloatRange tofloatrange;
        Context context3 = context;
        String str2 = str;
        this.setMin = context3;
        this.getMin = str2;
        this.setMax = new getMax(this, (byte) 0);
        this.toIntRange = new HashMap();
        this.length = shouldmeasuretwice;
        HashMap hashMap = new HashMap();
        hashMap.put("$android_lib_version", "5.8.4");
        hashMap.put("$android_os", "Android");
        String str3 = "UNKNOWN";
        hashMap.put("$android_os_version", Build.VERSION.RELEASE == null ? str3 : Build.VERSION.RELEASE);
        hashMap.put("$android_manufacturer", Build.MANUFACTURER == null ? str3 : Build.MANUFACTURER);
        hashMap.put("$android_brand", Build.BRAND == null ? str3 : Build.BRAND);
        hashMap.put("$android_model", Build.MODEL != null ? Build.MODEL : str3);
        try {
            PackageInfo packageInfo = this.setMin.getPackageManager().getPackageInfo(this.setMin.getPackageName(), 0);
            hashMap.put("$android_app_version", packageInfo.versionName);
            hashMap.put("$android_app_version_code", Integer.toString(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
        this.toFloatRange = Collections.unmodifiableMap(hashMap);
        this.invoke = new findPartiallyOrCompletelyInvisibleChildClosestToStart();
        if (context3 != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        if (context2 != null) {
            int length2 = str2 != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(context2, length2);
            if (length2 != min) {
                onCanceled oncanceled = new onCanceled(length2, min, 8);
                onCancelLoad.setMax(2028678171, oncanceled);
                onCancelLoad.getMin(2028678171, oncanceled);
            }
        }
        if (Build.VERSION.SDK_INT < 16) {
            findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
            calculatetimeforscrolling = new setMin(Mean$Arithmetic);
        } else if (this.length.getMin() || Arrays.asList(this.length.isInside).contains(str2)) {
            findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
            calculatetimeforscrolling = new setMin(Mean$Arithmetic);
        } else {
            calculatetimeforscrolling = new clampApplyScroll(this.setMin, this.getMin, this, Mean$Arithmetic);
        }
        this.IsOverlapping = calculatetimeforscrolling;
        if (calculatetimeforscrolling instanceof clampApplyScroll) {
            calculatespeedperpixel = (calculateSpeedPerPixel) calculatetimeforscrolling;
        } else {
            calculatespeedperpixel = null;
        }
        this.toDoubleRange = calculatespeedperpixel;
        this.getMax = setInitialPrefetchItemCount.length(this.setMin);
        findReferenceChild findreferencechild = new findReferenceChild(future, Grayscale$Algorithm.length(context3, "com.mixpanel.android.mpmetrics.MixpanelAPI_".concat(String.valueOf(str)), new findFirstPartiallyOrCompletelyInvisibleChild.setMin() {
            public final void getMax(SharedPreferences sharedPreferences) {
                String max = findReferenceChild.getMax(sharedPreferences);
                if (max != null) {
                    convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, max);
                }
            }
        }), Grayscale$Algorithm.length(context3, "com.mixpanel.android.mpmetrics.MixpanelAPI.TimeEvents_".concat(String.valueOf(str)), (findFirstPartiallyOrCompletelyInvisibleChild.setMin) null), Grayscale$Algorithm.length(context3, "com.mixpanel.android.mpmetrics.Mixpanel", (findFirstPartiallyOrCompletelyInvisibleChild.setMin) null));
        this.equals = findreferencechild;
        this.values = findreferencechild.IsOverlapping();
        if (Build.VERSION.SDK_INT < 16) {
            findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
            tofloatrange = new isInside(this, (byte) 0);
        } else {
            tofloatrange = new getMin(this, (byte) 0);
        }
        toFloatRange tofloatrange2 = tofloatrange;
        this.isInside = tofloatrange2;
        recycleChildren recyclechildren = r1;
        recycleChildren recyclechildren2 = new recycleChildren(this.setMin, str, tofloatrange2, this.IsOverlapping, this.equals.toFloatRange());
        this.hashCode = recyclechildren;
        this.toString = new recycleViewsFromStart(this, this.setMin);
        String equals2 = this.equals.equals();
        this.hashCode.getMax(equals2 == null ? this.equals.setMax() : equals2);
        boolean exists = MPDbAdapter.setMax(this.setMin).length.length.exists();
        if (Build.VERSION.SDK_INT >= 14) {
            if (this.setMin.getApplicationContext() instanceof Application) {
                getChildClosestToEnd getchildclosesttoend = new getChildClosestToEnd(this, this.length);
                this.FastBitmap$CoordinateSystem = getchildclosesttoend;
                ((Application) this.setMin.getApplicationContext()).registerActivityLifecycleCallbacks(getchildclosesttoend);
            } else {
                findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
            }
        }
        if (recycleByLayoutState.length(invokeSuspend)) {
            new fill(this.setMin, new fill.length() {
                public final void length() {
                    setInitialPrefetchItemCount min = convertFocusDirectionToLayoutDirection.this.getMax;
                    setInitialPrefetchItemCount.toFloatRange tofloatrange = new setInitialPrefetchItemCount.toFloatRange(convertFocusDirectionToLayoutDirection.this.getMin, convertFocusDirectionToLayoutDirection.this.equals.getMin());
                    Message obtain = Message.obtain();
                    obtain.what = 8;
                    obtain.obj = tofloatrange;
                    min.setMin.setMin(obtain);
                }
            }).getMin();
        }
        if (this.equals.getMin(exists, this.getMin)) {
            getMax("$ae_first_open", (JSONObject) null, true);
            this.equals.toIntRange(this.getMin);
        }
        if (!this.length.equals()) {
            setInitialPrefetchItemCount setinitialprefetchitemcount = this.getMax;
            recycleChildren recyclechildren3 = this.hashCode;
            Message obtain = Message.obtain();
            obtain.what = 12;
            obtain.obj = recyclechildren3;
            setinitialprefetchitemcount.setMin.setMin(obtain);
        }
        if (toFloatRange()) {
            setMin("$app_open", (JSONObject) null);
        }
        if (!this.equals.isInside(this.getMin)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mp_lib", "Android");
                jSONObject.put("lib", "Android");
                jSONObject.put("distinct_id", str2);
                jSONObject.put("$lib_version", "5.8.4");
                jSONObject.put("$user_id", str2);
                this.getMax.getMin(new setInitialPrefetchItemCount.getMax("Integration", jSONObject, "85053bf24bba75239b16a601d9387e17"));
                this.getMax.length(new setInitialPrefetchItemCount.getMin("85053bf24bba75239b16a601d9387e17", false));
                this.equals.equals(this.getMin);
            } catch (JSONException unused2) {
            }
        }
        if (this.equals.toFloatRange((String) hashMap.get("$android_app_version_code"))) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("$ae_updated_version", hashMap.get("$android_app_version"));
                getMax("$ae_updated", jSONObject2, true);
            } catch (JSONException unused3) {
            }
        }
        this.IsOverlapping.setMax();
        if (!this.length.toFloatRange()) {
            getChildClosestToStart.setMax();
        }
    }

    public static convertFocusDirectionToLayoutDirection getMin(Context context, String str) {
        return setMin(context, str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:31|32|33|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.convertFocusDirectionToLayoutDirection setMin(android.content.Context r12, java.lang.String r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x00f9
            if (r12 != 0) goto L_0x0007
            goto L_0x00f9
        L_0x0007:
            java.util.Map<java.lang.String, java.util.Map<android.content.Context, o.convertFocusDirectionToLayoutDirection>> r1 = valueOf
            monitor-enter(r1)
            android.content.Context r2 = r12.getApplicationContext()     // Catch:{ all -> 0x00f6 }
            java.util.concurrent.Future<android.content.SharedPreferences> r3 = invokeSuspend     // Catch:{ all -> 0x00f6 }
            if (r3 != 0) goto L_0x001c
            o.findFirstPartiallyOrCompletelyInvisibleChild r3 = Grayscale$Algorithm     // Catch:{ all -> 0x00f6 }
            java.lang.String r4 = "com.mixpanel.android.mpmetrics.ReferralInfo"
            java.util.concurrent.Future r3 = r3.length(r12, r4, r0)     // Catch:{ all -> 0x00f6 }
            invokeSuspend = r3     // Catch:{ all -> 0x00f6 }
        L_0x001c:
            java.util.Map<java.lang.String, java.util.Map<android.content.Context, o.convertFocusDirectionToLayoutDirection>> r3 = valueOf     // Catch:{ all -> 0x00f6 }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ all -> 0x00f6 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x00f6 }
            if (r3 != 0) goto L_0x0030
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00f6 }
            r3.<init>()     // Catch:{ all -> 0x00f6 }
            java.util.Map<java.lang.String, java.util.Map<android.content.Context, o.convertFocusDirectionToLayoutDirection>> r4 = valueOf     // Catch:{ all -> 0x00f6 }
            r4.put(r13, r3)     // Catch:{ all -> 0x00f6 }
        L_0x0030:
            java.lang.Object r4 = r3.get(r2)     // Catch:{ all -> 0x00f6 }
            o.convertFocusDirectionToLayoutDirection r4 = (o.convertFocusDirectionToLayoutDirection) r4     // Catch:{ all -> 0x00f6 }
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x00b3
            boolean r8 = o.recycleByLayoutState.setMin(r2)     // Catch:{ all -> 0x00f6 }
            if (r8 == 0) goto L_0x00b3
            o.convertFocusDirectionToLayoutDirection r4 = new o.convertFocusDirectionToLayoutDirection     // Catch:{ all -> 0x00f6 }
            java.util.concurrent.Future<android.content.SharedPreferences> r8 = invokeSuspend     // Catch:{ all -> 0x00f6 }
            r4.<init>(r2, r8, r13)     // Catch:{ all -> 0x00f6 }
            java.lang.String r13 = "o.restorePresenterStates"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.String r8 = "length"
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r7] = r10     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.reflect.Method r8 = r13.getMethod(r8, r9)     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.String r9 = "registerReceiver"
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.Class<android.content.BroadcastReceiver> r11 = android.content.BroadcastReceiver.class
            r10[r7] = r11     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.Class<android.content.IntentFilter> r11 = android.content.IntentFilter.class
            r10[r6] = r11     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.reflect.Method r13 = r13.getMethod(r9, r10)     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            r9[r7] = r12     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.Object r8 = r8.invoke(r0, r9)     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            o.convertFocusDirectionToLayoutDirection$4 r10 = new o.convertFocusDirectionToLayoutDirection$4     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            r10.<init>()     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            r9[r7] = r10     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            android.content.IntentFilter r10 = new android.content.IntentFilter     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            java.lang.String r11 = "com.parse.bolts.measurement_event"
            r10.<init>(r11)     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            r9[r6] = r10     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            r13.invoke(r8, r9)     // Catch:{ InvocationTargetException -> 0x00a0, ClassNotFoundException -> 0x0098, NoSuchMethodException -> 0x0090, IllegalAccessException -> 0x0088 }
            goto L_0x00a3
        L_0x0088:
            r13 = move-exception
            r13.getMessage()     // Catch:{ all -> 0x00f6 }
            o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ all -> 0x00f6 }
            goto L_0x00a3
        L_0x0090:
            r13 = move-exception
            r13.getMessage()     // Catch:{ all -> 0x00f6 }
            o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ all -> 0x00f6 }
            goto L_0x00a3
        L_0x0098:
            r13 = move-exception
            r13.getMessage()     // Catch:{ all -> 0x00f6 }
            o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ all -> 0x00f6 }
            goto L_0x00a3
        L_0x00a0:
            o.findOnePartiallyOrCompletelyInvisibleChild.getMin()     // Catch:{ all -> 0x00f6 }
        L_0x00a3:
            r3.put(r2, r4)     // Catch:{ all -> 0x00f6 }
            boolean r13 = o.recycleByLayoutState.length((android.content.Context) r2)     // Catch:{ all -> 0x00f6 }
            if (r13 == 0) goto L_0x00b3
            com.mixpanel.android.mpmetrics.MixpanelFCMMessagingService.init()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00b3
        L_0x00b0:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x00f6 }
        L_0x00b3:
            boolean r13 = r12 instanceof android.app.Activity     // Catch:{ all -> 0x00f6 }
            if (r13 == 0) goto L_0x00f1
            java.lang.String r13 = "bolts.AppLinks"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            r2 = r12
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            android.content.Intent r2 = r2.getIntent()     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            java.lang.String r3 = "getTargetUrlFromInboundIntent"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r7] = r9     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            java.lang.Class<android.content.Intent> r9 = android.content.Intent.class
            r8[r6] = r9     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            java.lang.reflect.Method r13 = r13.getMethod(r3, r8)     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            r3[r7] = r12     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            r3[r6] = r2     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            r13.invoke(r0, r3)     // Catch:{ InvocationTargetException -> 0x00ed, ClassNotFoundException -> 0x00e8, NoSuchMethodException -> 0x00e3, IllegalAccessException -> 0x00de }
            goto L_0x00f4
        L_0x00de:
            r12 = move-exception
            r12.getMessage()     // Catch:{ all -> 0x00f6 }
            goto L_0x00f1
        L_0x00e3:
            r12 = move-exception
            r12.getMessage()     // Catch:{ all -> 0x00f6 }
            goto L_0x00f1
        L_0x00e8:
            r12 = move-exception
            r12.getMessage()     // Catch:{ all -> 0x00f6 }
            goto L_0x00f1
        L_0x00ed:
            o.findOnePartiallyOrCompletelyInvisibleChild.getMin()     // Catch:{ all -> 0x00f6 }
            goto L_0x00f4
        L_0x00f1:
            o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ all -> 0x00f6 }
        L_0x00f4:
            monitor-exit(r1)     // Catch:{ all -> 0x00f6 }
            return r4
        L_0x00f6:
            r12 = move-exception
            monitor-exit(r1)
            throw r12
        L_0x00f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.setMin(android.content.Context, java.lang.String):o.convertFocusDirectionToLayoutDirection");
    }

    public final void getMin(String str, String str2) {
        if (!getMax()) {
            if (str2 == null) {
                str2 = this.equals.setMax();
            }
            if (str.equals(str2)) {
                findOnePartiallyOrCompletelyInvisibleChild.isInside();
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alias", str);
                jSONObject.put("original", str2);
                setMin("$create_alias", jSONObject);
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
            if (!getMax()) {
                this.getMax.length(new setInitialPrefetchItemCount.getMin(this.getMin));
            }
        }
    }

    public final void setMin(String str) {
        length(str, true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void length(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3.getMax()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r4 != 0) goto L_0x000d
            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()
            return
        L_0x000d:
            o.findReferenceChild r0 = r3.equals
            monitor-enter(r0)
            o.findReferenceChild r1 = r3.equals     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r1.setMax()     // Catch:{ all -> 0x0055 }
            o.findReferenceChild r2 = r3.equals     // Catch:{ all -> 0x0055 }
            r2.setMin((java.lang.String) r1)     // Catch:{ all -> 0x0055 }
            o.findReferenceChild r2 = r3.equals     // Catch:{ all -> 0x0055 }
            r2.getMax((java.lang.String) r4)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x0027
            o.findReferenceChild r5 = r3.equals     // Catch:{ all -> 0x0055 }
            r5.toIntRange()     // Catch:{ all -> 0x0055 }
        L_0x0027:
            o.findReferenceChild r5 = r3.equals     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = r5.equals()     // Catch:{ all -> 0x0055 }
            if (r5 != 0) goto L_0x0035
            o.findReferenceChild r5 = r3.equals     // Catch:{ all -> 0x0055 }
            java.lang.String r5 = r5.setMax()     // Catch:{ all -> 0x0055 }
        L_0x0035:
            o.recycleChildren r2 = r3.hashCode     // Catch:{ all -> 0x0055 }
            r2.getMax((java.lang.String) r5)     // Catch:{ all -> 0x0055 }
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0055 }
            if (r4 != 0) goto L_0x0053
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0050 }
            r4.<init>()     // Catch:{ JSONException -> 0x0050 }
            java.lang.String r5 = "$anon_distinct_id"
            r4.put(r5, r1)     // Catch:{ JSONException -> 0x0050 }
            java.lang.String r5 = "$identify"
            r3.setMin((java.lang.String) r5, (org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x0050 }
            goto L_0x0053
        L_0x0050:
            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0055:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.length(java.lang.String, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5.getMax()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.String, java.lang.Long> r2 = r5.values
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.Long> r3 = r5.values     // Catch:{ all -> 0x0035 }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0035 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0035 }
            o.findReferenceChild r3 = r5.equals     // Catch:{ all -> 0x0035 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0035 }
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r3.setMax     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
            long r3 = r0.longValue()     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
            r1.putLong(r6, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
            o.findReferenceChild.getMax((android.content.SharedPreferences.Editor) r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0033 }
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.length(java.lang.String):void");
    }

    public final void setMin(String str, JSONObject jSONObject) {
        if (!getMax()) {
            getMax(str, jSONObject, false);
        }
    }

    public final void getMin(String str) {
        if (!getMax() && !getMax()) {
            getMax(str, (JSONObject) null, false);
        }
    }

    public final void getMin() {
        if (!getMax()) {
            this.getMax.length(new setInitialPrefetchItemCount.getMin(this.getMin));
        }
    }

    public final void setMax(JSONObject jSONObject) {
        if (!getMax()) {
            this.equals.setMin(jSONObject);
        }
    }

    public final void setMax(findLastPartiallyOrCompletelyInvisibleChild findlastpartiallyorcompletelyinvisiblechild) {
        if (!getMax()) {
            findReferenceChild findreferencechild = this.equals;
            synchronized (findreferencechild.getMin) {
                JSONObject doubleRange = findreferencechild.toDoubleRange();
                JSONObject jSONObject = new JSONObject();
                try {
                    Iterator<String> keys = doubleRange.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, doubleRange.get(next));
                    }
                    JSONObject min = findlastpartiallyorcompletelyinvisiblechild.getMin(jSONObject);
                    if (min == null) {
                        findOnePartiallyOrCompletelyInvisibleChild.isInside();
                        return;
                    }
                    findreferencechild.getMax = min;
                    findreferencechild.FastBitmap$CoordinateSystem();
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }
    }

    public final void setMin() {
        this.equals.isInside();
        setInitialPrefetchItemCount length2 = setInitialPrefetchItemCount.length(this.setMin);
        setInitialPrefetchItemCount.setMax setmax = new setInitialPrefetchItemCount.setMax(this.getMin);
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.obj = setmax;
        length2.setMin.setMin(obtain);
        length(this.equals.setMax(), false);
        recycleViewsFromStart recycleviewsfromstart = this.toString;
        recycleviewsfromstart.getMax = null;
        recycleviewsfromstart.getMin = 0;
        this.IsOverlapping.getMax(new JSONArray());
        this.IsOverlapping.getMin();
        if (!getMax()) {
            this.getMax.length(new setInitialPrefetchItemCount.getMin(this.getMin));
        }
    }

    public final boolean getMax() {
        return this.equals.IsOverlapping(this.getMin);
    }

    public final boolean setMax() {
        if (Build.VERSION.SDK_INT >= 14) {
            getChildClosestToEnd getchildclosesttoend = this.FastBitmap$CoordinateSystem;
            if (getchildclosesttoend != null) {
                return getchildclosesttoend.length();
            }
            return false;
        }
        findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void toIntRange() {
        this.invoke.setMin();
    }

    public static void getMax(length length2) {
        synchronized (valueOf) {
            for (Map<Context, convertFocusDirectionToLayoutDirection> values2 : valueOf.values()) {
                for (convertFocusDirectionToLayoutDirection min : values2.values()) {
                    length2.getMin(min);
                }
            }
        }
    }

    private boolean toFloatRange() {
        return !this.length.getMax();
    }

    class getMax implements setMax {
        private getMax() {
        }

        /* synthetic */ getMax(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, byte b) {
            this();
        }

        public void setMax(String str) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                if (str == null) {
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                    return;
                }
                synchronized (convertFocusDirectionToLayoutDirection.this.equals) {
                    convertFocusDirectionToLayoutDirection.this.equals.getMin(str);
                    convertFocusDirectionToLayoutDirection.this.hashCode.getMax(str);
                }
                convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, str);
            }
        }

        public final void setMax(JSONObject jSONObject) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                try {
                    JSONObject jSONObject2 = new JSONObject(convertFocusDirectionToLayoutDirection.this.toFloatRange);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                    convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, length("$set", jSONObject2));
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }

        public final void getMin(String str, Object obj) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                try {
                    setMax(new JSONObject().put(str, obj));
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }

        public final void getMax(JSONObject jSONObject) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                try {
                    convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, length("$set_once", jSONObject));
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                }
            }
        }

        public final void getMin(String str, JSONObject jSONObject) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(str, jSONObject);
                    convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, length("$merge", jSONObject2));
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }

        public final void getMax(String str, double d) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                HashMap hashMap = new HashMap();
                hashMap.put(str, Double.valueOf(d));
                if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                    try {
                        convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, length("$add", new JSONObject(hashMap)));
                    } catch (JSONException unused) {
                        findOnePartiallyOrCompletelyInvisibleChild.values();
                    }
                }
            }
        }

        public final void setMin(String str, Object obj) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, obj);
                    convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, length("$append", jSONObject));
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }

        public final void length(InAppNotification inAppNotification) {
            if (inAppNotification != null) {
                convertFocusDirectionToLayoutDirection.this.equals.getMin(Integer.valueOf(inAppNotification.setMin()));
                if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                    length("$campaign_delivery", inAppNotification, (JSONObject) null);
                    setMax length2 = convertFocusDirectionToLayoutDirection.this.setMax.length(setMax());
                    if (length2 != null) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                        JSONObject length3 = inAppNotification.length();
                        try {
                            length3.put("$time", simpleDateFormat.format(new Date()));
                        } catch (JSONException unused) {
                            findOnePartiallyOrCompletelyInvisibleChild.values();
                        }
                        length2.setMin("$campaigns", Integer.valueOf(inAppNotification.setMin()));
                        length2.setMin("$notifications", length3);
                        return;
                    }
                    findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
                }
            }
        }

        public final void getMin(final Activity activity) {
            if (Build.VERSION.SDK_INT >= 16) {
                if (Build.VERSION.SDK_INT < 16) {
                    findOnePartiallyOrCompletelyInvisibleChild.getMax();
                } else {
                    activity.runOnUiThread(new Runnable((InAppNotification) null) {
                        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0108 */
                        @android.annotation.TargetApi(16)
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r8 = this;
                                java.util.concurrent.locks.ReentrantLock r0 = com.mixpanel.android.mpmetrics.UpdateDisplayState.length()
                                r0.lock()
                                boolean r1 = com.mixpanel.android.mpmetrics.UpdateDisplayState.setMax()     // Catch:{ all -> 0x012d }
                                if (r1 == 0) goto L_0x0014
                                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                                r0.unlock()
                                return
                            L_0x0014:
                                com.mixpanel.android.mpmetrics.InAppNotification r1 = r3     // Catch:{ all -> 0x012d }
                                if (r1 != 0) goto L_0x002e
                                o.convertFocusDirectionToLayoutDirection$getMax r1 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection r2 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                                o.recycleChildren r2 = r2.hashCode     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection r1 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                                o.shouldMeasureTwice r1 = r1.length     // Catch:{ all -> 0x012d }
                                boolean r1 = r1.toIntRange()     // Catch:{ all -> 0x012d }
                                com.mixpanel.android.mpmetrics.InAppNotification r1 = r2.getMax((boolean) r1)     // Catch:{ all -> 0x012d }
                            L_0x002e:
                                if (r1 != 0) goto L_0x0037
                                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                                r0.unlock()
                                return
                            L_0x0037:
                                com.mixpanel.android.mpmetrics.InAppNotification$Type r2 = r1.getMax()     // Catch:{ all -> 0x012d }
                                com.mixpanel.android.mpmetrics.InAppNotification$Type r3 = com.mixpanel.android.mpmetrics.InAppNotification.Type.TAKEOVER     // Catch:{ all -> 0x012d }
                                if (r2 != r3) goto L_0x0052
                                android.app.Activity r3 = r4     // Catch:{ all -> 0x012d }
                                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x012d }
                                boolean r3 = o.recycleByLayoutState.setMax(r3)     // Catch:{ all -> 0x012d }
                                if (r3 != 0) goto L_0x0052
                                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                                r0.unlock()
                                return
                            L_0x0052:
                                android.app.Activity r3 = r4     // Catch:{ all -> 0x012d }
                                r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                android.graphics.Bitmap r3 = o.findLastVisibleItemPosition.length(r3)     // Catch:{ all -> 0x012d }
                                r5 = 0
                                if (r3 == 0) goto L_0x0061
                                int r4 = r3.getPixel(r5, r5)     // Catch:{ all -> 0x012d }
                            L_0x0061:
                                r3 = 3
                                float[] r3 = new float[r3]     // Catch:{ all -> 0x012d }
                                android.graphics.Color.colorToHSV(r4, r3)     // Catch:{ all -> 0x012d }
                                r4 = 1050253722(0x3e99999a, float:0.3)
                                r6 = 2
                                r3[r6] = r4     // Catch:{ all -> 0x012d }
                                r4 = 242(0xf2, float:3.39E-43)
                                int r3 = android.graphics.Color.HSVToColor(r4, r3)     // Catch:{ all -> 0x012d }
                                com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState r4 = new com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState     // Catch:{ all -> 0x012d }
                                r4.<init>((com.mixpanel.android.mpmetrics.InAppNotification) r1, (int) r3)     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection$getMax r3 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                                java.lang.String r3 = r3.setMax()     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection$getMax r7 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection r7 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                                java.lang.String r7 = r7.getMin     // Catch:{ all -> 0x012d }
                                int r3 = com.mixpanel.android.mpmetrics.UpdateDisplayState.setMax(r4, r3, r7)     // Catch:{ all -> 0x012d }
                                if (r3 > 0) goto L_0x0093
                                o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ all -> 0x012d }
                                r0.unlock()
                                return
                            L_0x0093:
                                int[] r4 = o.convertFocusDirectionToLayoutDirection.AnonymousClass5.getMin     // Catch:{ all -> 0x012d }
                                int r2 = r2.ordinal()     // Catch:{ all -> 0x012d }
                                r2 = r4[r2]     // Catch:{ all -> 0x012d }
                                r4 = 1
                                if (r2 == r4) goto L_0x00c9
                                if (r2 == r6) goto L_0x00a4
                                o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ all -> 0x012d }
                                goto L_0x0116
                            L_0x00a4:
                                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                                android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x012d }
                                android.app.Activity r4 = r4     // Catch:{ all -> 0x012d }
                                android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x012d }
                                java.lang.Class<com.mixpanel.android.takeoverinapp.TakeoverInAppActivity> r5 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.class
                                r2.<init>(r4, r5)     // Catch:{ all -> 0x012d }
                                r4 = 268435456(0x10000000, float:2.5243549E-29)
                                r2.addFlags(r4)     // Catch:{ all -> 0x012d }
                                r4 = 131072(0x20000, float:1.83671E-40)
                                r2.addFlags(r4)     // Catch:{ all -> 0x012d }
                                java.lang.String r4 = "com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY"
                                r2.putExtra(r4, r3)     // Catch:{ all -> 0x012d }
                                android.app.Activity r3 = r4     // Catch:{ all -> 0x012d }
                                r3.startActivity(r2)     // Catch:{ all -> 0x012d }
                                goto L_0x0116
                            L_0x00c9:
                                com.mixpanel.android.mpmetrics.UpdateDisplayState r2 = com.mixpanel.android.mpmetrics.UpdateDisplayState.setMin(r3)     // Catch:{ all -> 0x012d }
                                if (r2 != 0) goto L_0x00d6
                                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                                r0.unlock()
                                return
                            L_0x00d6:
                                o.layoutChunk r6 = new o.layoutChunk     // Catch:{ all -> 0x012d }
                                r6.<init>()     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection$getMax r7 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection r7 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                                com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState r2 = r2.getMin     // Catch:{ all -> 0x012d }
                                com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState r2 = (com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState) r2     // Catch:{ all -> 0x012d }
                                r6.length = r7     // Catch:{ all -> 0x012d }
                                r6.getMin = r3     // Catch:{ all -> 0x012d }
                                r6.setMin = r2     // Catch:{ all -> 0x012d }
                                r6.setRetainInstance(r4)     // Catch:{ all -> 0x012d }
                                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                                android.app.Activity r2 = r4     // Catch:{ all -> 0x012d }
                                android.app.FragmentManager r2 = r2.getFragmentManager()     // Catch:{ all -> 0x012d }
                                android.app.FragmentTransaction r2 = r2.beginTransaction()     // Catch:{ all -> 0x012d }
                                int r3 = o.updateAnchorFromPendingData.getMin.getMin     // Catch:{ all -> 0x012d }
                                r2.setCustomAnimations(r5, r3)     // Catch:{ all -> 0x012d }
                                r3 = 16908290(0x1020002, float:2.3877235E-38)
                                r2.add(r3, r6)     // Catch:{ all -> 0x012d }
                                r2.commit()     // Catch:{ IllegalStateException -> 0x0108 }
                                goto L_0x0116
                            L_0x0108:
                                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection$getMax r2 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection r2 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                                o.recycleChildren r2 = r2.hashCode     // Catch:{ all -> 0x012d }
                                r2.setMax(r1)     // Catch:{ all -> 0x012d }
                            L_0x0116:
                                o.convertFocusDirectionToLayoutDirection$getMax r2 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                                o.convertFocusDirectionToLayoutDirection r2 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                                o.shouldMeasureTwice r2 = r2.length     // Catch:{ all -> 0x012d }
                                boolean r2 = r2.toIntRange()     // Catch:{ all -> 0x012d }
                                if (r2 != 0) goto L_0x0129
                                o.convertFocusDirectionToLayoutDirection$getMax r2 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                                r2.length((com.mixpanel.android.mpmetrics.InAppNotification) r1)     // Catch:{ all -> 0x012d }
                            L_0x0129:
                                r0.unlock()
                                return
                            L_0x012d:
                                r1 = move-exception
                                r0.unlock()
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.getMax.AnonymousClass3.run():void");
                        }
                    });
                }
            }
        }

        public final void length(String str, InAppNotification inAppNotification, JSONObject jSONObject) {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                JSONObject length2 = inAppNotification.length();
                if (jSONObject != null) {
                    try {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            length2.put(next, jSONObject.get(next));
                        }
                    } catch (JSONException unused) {
                        findOnePartiallyOrCompletelyInvisibleChild.values();
                    }
                }
                convertFocusDirectionToLayoutDirection.this.setMin(str, length2);
            }
        }

        public final void length() {
            convertFocusDirectionToLayoutDirection.this.IsOverlapping.length(convertFocusDirectionToLayoutDirection.this.hashCode.setMin());
        }

        public final void getMin() {
            try {
                convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, length("$delete", JSONObject.NULL));
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0039 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMax(java.lang.String r4) {
            /*
                r3 = this;
                o.convertFocusDirectionToLayoutDirection r0 = o.convertFocusDirectionToLayoutDirection.this
                o.findReferenceChild r0 = r0.equals
                monitor-enter(r0)
                o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ all -> 0x003e }
                o.convertFocusDirectionToLayoutDirection r1 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x003e }
                o.findReferenceChild r1 = r1.equals     // Catch:{ all -> 0x003e }
                r1.length(r4)     // Catch:{ all -> 0x003e }
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x003e }
                r1.<init>()     // Catch:{ all -> 0x003e }
                r1.put(r4)     // Catch:{ all -> 0x003e }
                java.lang.String r4 = "$android_devices"
                o.convertFocusDirectionToLayoutDirection r2 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x003e }
                boolean r2 = r2.getMax()     // Catch:{ all -> 0x003e }
                if (r2 != 0) goto L_0x003c
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0039 }
                r2.<init>()     // Catch:{ JSONException -> 0x0039 }
                r2.put(r4, r1)     // Catch:{ JSONException -> 0x0039 }
                java.lang.String r4 = "$union"
                org.json.JSONObject r4 = r3.length(r4, r2)     // Catch:{ JSONException -> 0x0039 }
                o.convertFocusDirectionToLayoutDirection r1 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ JSONException -> 0x0039 }
                o.convertFocusDirectionToLayoutDirection.setMin((o.convertFocusDirectionToLayoutDirection) r1, (org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x0039 }
                goto L_0x003c
            L_0x0039:
                o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ all -> 0x003e }
            L_0x003c:
                monitor-exit(r0)     // Catch:{ all -> 0x003e }
                return
            L_0x003e:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.getMax.getMax(java.lang.String):void");
        }

        public String setMax() {
            return convertFocusDirectionToLayoutDirection.this.equals.equals();
        }

        public final setMax length(final String str) {
            if (str == null) {
                return null;
            }
            return new getMax() {
                public final String setMax() {
                    return str;
                }

                public final void setMax(String str) {
                    throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
                }
            };
        }

        private JSONObject length(String str, Object obj) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String max = setMax();
            String max2 = convertFocusDirectionToLayoutDirection.this.equals.getMax();
            jSONObject.put(str, obj);
            jSONObject.put("$token", convertFocusDirectionToLayoutDirection.this.getMin);
            jSONObject.put("$time", System.currentTimeMillis());
            jSONObject.put("$had_persisted_distinct_id", convertFocusDirectionToLayoutDirection.this.equals.length());
            if (max2 != null) {
                jSONObject.put("$device_id", max2);
            }
            if (max != null) {
                jSONObject.put("$distinct_id", max);
                jSONObject.put("$user_id", max);
            }
            jSONObject.put("$mp_metadata", convertFocusDirectionToLayoutDirection.this.invoke.getMax(false));
            return jSONObject;
        }

        public final boolean getMax() {
            return setMax() != null;
        }

        public final void getMin(final InAppNotification inAppNotification, final Activity activity) {
            if (inAppNotification == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 16) {
                findOnePartiallyOrCompletelyInvisibleChild.getMax();
            } else {
                activity.runOnUiThread(new Runnable() {
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r8 = this;
                            java.util.concurrent.locks.ReentrantLock r0 = com.mixpanel.android.mpmetrics.UpdateDisplayState.length()
                            r0.lock()
                            boolean r1 = com.mixpanel.android.mpmetrics.UpdateDisplayState.setMax()     // Catch:{ all -> 0x012d }
                            if (r1 == 0) goto L_0x0014
                            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                            r0.unlock()
                            return
                        L_0x0014:
                            com.mixpanel.android.mpmetrics.InAppNotification r1 = r3     // Catch:{ all -> 0x012d }
                            if (r1 != 0) goto L_0x002e
                            o.convertFocusDirectionToLayoutDirection$getMax r1 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection r2 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                            o.recycleChildren r2 = r2.hashCode     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection r1 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                            o.shouldMeasureTwice r1 = r1.length     // Catch:{ all -> 0x012d }
                            boolean r1 = r1.toIntRange()     // Catch:{ all -> 0x012d }
                            com.mixpanel.android.mpmetrics.InAppNotification r1 = r2.getMax((boolean) r1)     // Catch:{ all -> 0x012d }
                        L_0x002e:
                            if (r1 != 0) goto L_0x0037
                            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                            r0.unlock()
                            return
                        L_0x0037:
                            com.mixpanel.android.mpmetrics.InAppNotification$Type r2 = r1.getMax()     // Catch:{ all -> 0x012d }
                            com.mixpanel.android.mpmetrics.InAppNotification$Type r3 = com.mixpanel.android.mpmetrics.InAppNotification.Type.TAKEOVER     // Catch:{ all -> 0x012d }
                            if (r2 != r3) goto L_0x0052
                            android.app.Activity r3 = r4     // Catch:{ all -> 0x012d }
                            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x012d }
                            boolean r3 = o.recycleByLayoutState.setMax(r3)     // Catch:{ all -> 0x012d }
                            if (r3 != 0) goto L_0x0052
                            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                            r0.unlock()
                            return
                        L_0x0052:
                            android.app.Activity r3 = r4     // Catch:{ all -> 0x012d }
                            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                            android.graphics.Bitmap r3 = o.findLastVisibleItemPosition.length(r3)     // Catch:{ all -> 0x012d }
                            r5 = 0
                            if (r3 == 0) goto L_0x0061
                            int r4 = r3.getPixel(r5, r5)     // Catch:{ all -> 0x012d }
                        L_0x0061:
                            r3 = 3
                            float[] r3 = new float[r3]     // Catch:{ all -> 0x012d }
                            android.graphics.Color.colorToHSV(r4, r3)     // Catch:{ all -> 0x012d }
                            r4 = 1050253722(0x3e99999a, float:0.3)
                            r6 = 2
                            r3[r6] = r4     // Catch:{ all -> 0x012d }
                            r4 = 242(0xf2, float:3.39E-43)
                            int r3 = android.graphics.Color.HSVToColor(r4, r3)     // Catch:{ all -> 0x012d }
                            com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState r4 = new com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState     // Catch:{ all -> 0x012d }
                            r4.<init>((com.mixpanel.android.mpmetrics.InAppNotification) r1, (int) r3)     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection$getMax r3 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                            java.lang.String r3 = r3.setMax()     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection$getMax r7 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection r7 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                            java.lang.String r7 = r7.getMin     // Catch:{ all -> 0x012d }
                            int r3 = com.mixpanel.android.mpmetrics.UpdateDisplayState.setMax(r4, r3, r7)     // Catch:{ all -> 0x012d }
                            if (r3 > 0) goto L_0x0093
                            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ all -> 0x012d }
                            r0.unlock()
                            return
                        L_0x0093:
                            int[] r4 = o.convertFocusDirectionToLayoutDirection.AnonymousClass5.getMin     // Catch:{ all -> 0x012d }
                            int r2 = r2.ordinal()     // Catch:{ all -> 0x012d }
                            r2 = r4[r2]     // Catch:{ all -> 0x012d }
                            r4 = 1
                            if (r2 == r4) goto L_0x00c9
                            if (r2 == r6) goto L_0x00a4
                            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ all -> 0x012d }
                            goto L_0x0116
                        L_0x00a4:
                            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x012d }
                            android.app.Activity r4 = r4     // Catch:{ all -> 0x012d }
                            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x012d }
                            java.lang.Class<com.mixpanel.android.takeoverinapp.TakeoverInAppActivity> r5 = com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.class
                            r2.<init>(r4, r5)     // Catch:{ all -> 0x012d }
                            r4 = 268435456(0x10000000, float:2.5243549E-29)
                            r2.addFlags(r4)     // Catch:{ all -> 0x012d }
                            r4 = 131072(0x20000, float:1.83671E-40)
                            r2.addFlags(r4)     // Catch:{ all -> 0x012d }
                            java.lang.String r4 = "com.mixpanel.android.takeoverinapp.TakeoverInAppActivity.INTENT_ID_KEY"
                            r2.putExtra(r4, r3)     // Catch:{ all -> 0x012d }
                            android.app.Activity r3 = r4     // Catch:{ all -> 0x012d }
                            r3.startActivity(r2)     // Catch:{ all -> 0x012d }
                            goto L_0x0116
                        L_0x00c9:
                            com.mixpanel.android.mpmetrics.UpdateDisplayState r2 = com.mixpanel.android.mpmetrics.UpdateDisplayState.setMin(r3)     // Catch:{ all -> 0x012d }
                            if (r2 != 0) goto L_0x00d6
                            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                            r0.unlock()
                            return
                        L_0x00d6:
                            o.layoutChunk r6 = new o.layoutChunk     // Catch:{ all -> 0x012d }
                            r6.<init>()     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection$getMax r7 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection r7 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                            com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState r2 = r2.getMin     // Catch:{ all -> 0x012d }
                            com.mixpanel.android.mpmetrics.UpdateDisplayState$DisplayState$InAppNotificationState r2 = (com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.InAppNotificationState) r2     // Catch:{ all -> 0x012d }
                            r6.length = r7     // Catch:{ all -> 0x012d }
                            r6.getMin = r3     // Catch:{ all -> 0x012d }
                            r6.setMin = r2     // Catch:{ all -> 0x012d }
                            r6.setRetainInstance(r4)     // Catch:{ all -> 0x012d }
                            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                            android.app.Activity r2 = r4     // Catch:{ all -> 0x012d }
                            android.app.FragmentManager r2 = r2.getFragmentManager()     // Catch:{ all -> 0x012d }
                            android.app.FragmentTransaction r2 = r2.beginTransaction()     // Catch:{ all -> 0x012d }
                            int r3 = o.updateAnchorFromPendingData.getMin.getMin     // Catch:{ all -> 0x012d }
                            r2.setCustomAnimations(r5, r3)     // Catch:{ all -> 0x012d }
                            r3 = 16908290(0x1020002, float:2.3877235E-38)
                            r2.add(r3, r6)     // Catch:{ all -> 0x012d }
                            r2.commit()     // Catch:{ IllegalStateException -> 0x0108 }
                            goto L_0x0116
                        L_0x0108:
                            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection$getMax r2 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection r2 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                            o.recycleChildren r2 = r2.hashCode     // Catch:{ all -> 0x012d }
                            r2.setMax(r1)     // Catch:{ all -> 0x012d }
                        L_0x0116:
                            o.convertFocusDirectionToLayoutDirection$getMax r2 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                            o.convertFocusDirectionToLayoutDirection r2 = o.convertFocusDirectionToLayoutDirection.this     // Catch:{ all -> 0x012d }
                            o.shouldMeasureTwice r2 = r2.length     // Catch:{ all -> 0x012d }
                            boolean r2 = r2.toIntRange()     // Catch:{ all -> 0x012d }
                            if (r2 != 0) goto L_0x0129
                            o.convertFocusDirectionToLayoutDirection$getMax r2 = o.convertFocusDirectionToLayoutDirection.getMax.this     // Catch:{ all -> 0x012d }
                            r2.length((com.mixpanel.android.mpmetrics.InAppNotification) r1)     // Catch:{ all -> 0x012d }
                        L_0x0129:
                            r0.unlock()
                            return
                        L_0x012d:
                            r1 = move-exception
                            r0.unlock()
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.getMax.AnonymousClass3.run():void");
                    }
                });
            }
        }

        public final void setMin() {
            if (!convertFocusDirectionToLayoutDirection.this.getMax()) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put("$transactions");
                    convertFocusDirectionToLayoutDirection.setMin(convertFocusDirectionToLayoutDirection.this, length("$unset", jSONArray));
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }
    }

    /* renamed from: o.convertFocusDirectionToLayoutDirection$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mixpanel.android.mpmetrics.InAppNotification$Type[] r0 = com.mixpanel.android.mpmetrics.InAppNotification.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                com.mixpanel.android.mpmetrics.InAppNotification$Type r1 = com.mixpanel.android.mpmetrics.InAppNotification.Type.MINI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mixpanel.android.mpmetrics.InAppNotification$Type r1 = com.mixpanel.android.mpmetrics.InAppNotification.Type.TAKEOVER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.AnonymousClass5.<clinit>():void");
        }
    }

    class isInside implements toFloatRange {
        public final void getMin() {
        }

        private isInside() {
        }

        /* synthetic */ isInside(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, byte b) {
            this();
        }
    }

    class getMin implements toFloatRange, Runnable {
        private final Set<Object> getMax;
        private final Executor setMin;

        private getMin() {
            this.getMax = Collections.newSetFromMap(new ConcurrentHashMap());
            this.setMin = Executors.newSingleThreadExecutor();
        }

        /* synthetic */ getMin(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, byte b) {
            this();
        }

        public final void getMin() {
            this.setMin.execute(this);
        }

        public final void run() {
            Iterator<Object> it = this.getMax.iterator();
            while (it.hasNext()) {
                it.next();
            }
            recycleViewsFromStart equals = convertFocusDirectionToLayoutDirection.this.toString;
            Set<String> max = convertFocusDirectionToLayoutDirection.this.hashCode.setMax();
            if (max.contains("urbanairship")) {
                equals.getMin();
            }
            if (max.contains("braze")) {
                try {
                    Object invoke = Class.forName("com.appboy.Appboy").getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{equals.setMin});
                    String str = (String) invoke.getClass().getMethod("getDeviceId", new Class[0]).invoke(invoke, new Object[0]);
                    Object invoke2 = invoke.getClass().getMethod("getCurrentUser", new Class[0]).invoke(invoke, new Object[0]);
                    if (invoke2 == null) {
                        findOnePartiallyOrCompletelyInvisibleChild.isInside();
                        return;
                    }
                    String str2 = (String) invoke2.getClass().getMethod("getUserId", new Class[0]).invoke(invoke2, new Object[0]);
                    if (str != null && !str.isEmpty()) {
                        equals.length.getMin(str, equals.length.equals.setMax());
                        equals.length.setMax.getMin("$braze_device_id", (Object) str);
                    }
                    if (str2 != null && !str2.isEmpty()) {
                        equals.length.getMin(str2, equals.length.equals.setMax());
                        equals.length.setMax.getMin("$braze_external_id", (Object) str2);
                    }
                } catch (ClassNotFoundException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.toIntRange();
                } catch (NoSuchMethodException unused2) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                } catch (InvocationTargetException unused3) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                } catch (IllegalAccessException unused4) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                } catch (Exception unused5) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
        }
    }

    class setMin implements calculateTimeForScrolling {
        private final findFirstVisibleItemPosition getMin;

        public final void getMax(JSONArray jSONArray) {
        }

        public final void getMin() {
        }

        public final void getMin(JSONArray jSONArray) {
        }

        public final void length(JSONArray jSONArray) {
        }

        public final void setMax() {
        }

        public setMin(findFirstVisibleItemPosition findfirstvisibleitemposition) {
            this.getMin = findfirstvisibleitemposition;
        }
    }

    /* access modifiers changed from: protected */
    public final void equals() {
        if (!getMax()) {
            this.getMax.length(new setInitialPrefetchItemCount.getMin(this.getMin, false));
        }
    }

    /* access modifiers changed from: protected */
    public final void getMax(String str, JSONObject jSONObject, boolean z) {
        Long l;
        if (getMax()) {
            return;
        }
        if (!z || this.hashCode.getMax()) {
            synchronized (this.values) {
                l = this.values.get(str);
                this.values.remove(str);
                this.equals.setMax(str);
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry next : this.equals.getMin().entrySet()) {
                    jSONObject2.put((String) next.getKey(), (String) next.getValue());
                }
                this.equals.getMax(jSONObject2);
                double currentTimeMillis = (double) System.currentTimeMillis();
                Double.isNaN(currentTimeMillis);
                double d = currentTimeMillis / 1000.0d;
                long j = (long) d;
                String max = this.equals.setMax();
                String max2 = this.equals.getMax();
                String min = this.equals.setMin();
                jSONObject2.put(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, j);
                jSONObject2.put("distinct_id", max);
                jSONObject2.put("$had_persisted_distinct_id", this.equals.length());
                if (max2 != null) {
                    jSONObject2.put("$device_id", max2);
                }
                if (min != null) {
                    jSONObject2.put("$user_id", min);
                }
                if (l != null) {
                    double longValue = (double) l.longValue();
                    Double.isNaN(longValue);
                    jSONObject2.put("$duration", d - (longValue / 1000.0d));
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next2 = keys.next();
                        if (!jSONObject.isNull(next2)) {
                            jSONObject2.put(next2, jSONObject.get(next2));
                        }
                    }
                }
                setInitialPrefetchItemCount.getMax getmax = new setInitialPrefetchItemCount.getMax(str, jSONObject2, this.getMin, z, this.invoke.getMax(true));
                this.getMax.getMin(getmax);
                getChildClosestToEnd getchildclosesttoend = this.FastBitmap$CoordinateSystem;
                Activity activity = null;
                if ((getchildclosesttoend.length != null ? getchildclosesttoend.length.get() : null) != null) {
                    getMax getmax2 = this.setMax;
                    InAppNotification max3 = this.hashCode.setMax(getmax, this.length.toIntRange());
                    getChildClosestToEnd getchildclosesttoend2 = this.FastBitmap$CoordinateSystem;
                    if (getchildclosesttoend2.length != null) {
                        activity = getchildclosesttoend2.length.get();
                    }
                    getmax2.getMin(max3, activity);
                }
                if (this.toDoubleRange != null) {
                    this.toDoubleRange.setMin(str);
                }
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0069 */
    public final void length() {
        /*
            r4 = this;
            android.content.Context r0 = r4.setMin
            o.setInitialPrefetchItemCount r0 = o.setInitialPrefetchItemCount.length((android.content.Context) r0)
            o.setInitialPrefetchItemCount$setMax r1 = new o.setInitialPrefetchItemCount$setMax
            java.lang.String r2 = r4.getMin
            r1.<init>(r2)
            android.os.Message r2 = android.os.Message.obtain()
            r3 = 6
            r2.what = r3
            r2.obj = r1
            o.setInitialPrefetchItemCount$isInside r0 = r0.setMin
            r0.setMin(r2)
            o.convertFocusDirectionToLayoutDirection$getMax r0 = r4.setMax
            boolean r0 = r0.getMax()
            if (r0 == 0) goto L_0x002d
            o.convertFocusDirectionToLayoutDirection$getMax r0 = r4.setMax
            r0.getMin()
            o.convertFocusDirectionToLayoutDirection$getMax r0 = r4.setMax
            r0.setMin()
        L_0x002d:
            o.findReferenceChild r0 = r4.equals
            r0.isInside()
            java.util.Map<java.lang.String, java.lang.Long> r0 = r4.values
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Long> r1 = r4.values     // Catch:{ all -> 0x0080 }
            r1.clear()     // Catch:{ all -> 0x0080 }
            o.findReferenceChild r1 = r4.equals     // Catch:{ all -> 0x0080 }
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r1.setMax     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
            r1.clear()     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
            r1.apply()     // Catch:{ InterruptedException | ExecutionException -> 0x004e }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            o.findReferenceChild r0 = r4.equals
            java.lang.Object r1 = o.findReferenceChild.length
            monitor-enter(r1)
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r0.setMin     // Catch:{ ExecutionException -> 0x006d, InterruptedException -> 0x0069 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x006d, InterruptedException -> 0x0069 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x006d, InterruptedException -> 0x0069 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ ExecutionException -> 0x006d, InterruptedException -> 0x0069 }
            r0.clear()     // Catch:{ ExecutionException -> 0x006d, InterruptedException -> 0x0069 }
            r0.apply()     // Catch:{ ExecutionException -> 0x006d, InterruptedException -> 0x0069 }
            goto L_0x0074
        L_0x0067:
            r0 = move-exception
            goto L_0x007e
        L_0x0069:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0067 }
            goto L_0x0074
        L_0x006d:
            r0 = move-exception
            r0.getCause()     // Catch:{ all -> 0x0067 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0067 }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x0067 }
            o.findReferenceChild r0 = r4.equals
            r1 = 1
            java.lang.String r2 = r4.getMin
            r0.length(r1, r2)
            return
        L_0x007e:
            monitor-exit(r1)
            throw r0
        L_0x0080:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.convertFocusDirectionToLayoutDirection.length():void");
    }

    public final void getMax(String str) {
        this.equals.length(false, this.getMin);
        if (str != null) {
            length(str, true);
        }
        if (!getMax()) {
            getMax("$opt_in", (JSONObject) null, false);
        }
    }

    static /* synthetic */ void setMin(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, String str) {
        setInitialPrefetchItemCount setinitialprefetchitemcount = convertfocusdirectiontolayoutdirection.getMax;
        setInitialPrefetchItemCount.toIntRange tointrange = new setInitialPrefetchItemCount.toIntRange(str, convertfocusdirectiontolayoutdirection.getMin);
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = tointrange;
        setinitialprefetchitemcount.setMin.setMin(obtain);
    }

    static /* synthetic */ void setMin(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, JSONObject jSONObject) {
        if (!convertfocusdirectiontolayoutdirection.getMax()) {
            setInitialPrefetchItemCount setinitialprefetchitemcount = convertfocusdirectiontolayoutdirection.getMax;
            setInitialPrefetchItemCount.IsOverlapping isOverlapping = new setInitialPrefetchItemCount.IsOverlapping(jSONObject, convertfocusdirectiontolayoutdirection.getMin);
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = isOverlapping;
            setinitialprefetchitemcount.setMin.setMin(obtain);
        }
    }
}
