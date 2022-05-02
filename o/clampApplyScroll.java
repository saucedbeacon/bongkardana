package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.viewcrawler.EditProtocol;
import com.mixpanel.android.viewcrawler.EditorConnection;
import id.dana.data.toggle.tracker.ToggleEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.LinearLayoutManager;
import o.findFirstVisibleItemPosition;
import o.findPartiallyOrCompletelyInvisibleChildClosestToEnd;
import o.getVerticalSnapPreference;
import o.logChildren;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(16)
public class clampApplyScroll implements calculateTimeForScrolling, calculateSpeedPerPixel, getVerticalSnapPreference.IsOverlapping {
    /* access modifiers changed from: private */
    public final Set<Object> IsOverlapping;
    /* access modifiers changed from: private */
    public final IsOverlapping equals;
    /* access modifiers changed from: private */
    public final shouldMeasureTwice getMax;
    /* access modifiers changed from: private */
    public final convertFocusDirectionToLayoutDirection getMin;
    /* access modifiers changed from: private */
    public final float isInside;
    /* access modifiers changed from: private */
    public final supportsPredictiveItemAnimations length = new supportsPredictiveItemAnimations();
    /* access modifiers changed from: private */
    public final LinearLayoutManager.SavedState setMax;
    /* access modifiers changed from: private */
    public final Context setMin;
    /* access modifiers changed from: private */
    public final Map<String, String> toFloatRange;
    /* access modifiers changed from: private */
    public final findFirstVisibleItemPosition toIntRange;

    public clampApplyScroll(Context context, String str, convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, findFirstVisibleItemPosition findfirstvisibleitemposition) {
        this.getMax = shouldMeasureTwice.getMax(context);
        this.setMin = context;
        this.toIntRange = findfirstvisibleitemposition;
        this.toFloatRange = convertfocusdirectiontolayoutdirection.toFloatRange;
        this.isInside = Resources.getSystem().getDisplayMetrics().scaledDensity;
        this.IsOverlapping = Collections.newSetFromMap(new ConcurrentHashMap());
        HandlerThread handlerThread = new HandlerThread(clampApplyScroll.class.getCanonicalName());
        handlerThread.setPriority(10);
        handlerThread.start();
        this.equals = new IsOverlapping(context, str, handlerThread.getLooper(), this);
        this.setMax = new LinearLayoutManager.SavedState(convertfocusdirectiontolayoutdirection, this.equals);
        this.getMin = convertfocusdirectiontolayoutdirection;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new setMax());
        this.toIntRange.getMin(new findFirstVisibleItemPosition.getMin() {
        });
    }

    public final void setMax() {
        this.equals.getMax.unlock();
        IsOverlapping isOverlapping = this.equals;
        isOverlapping.sendMessage(isOverlapping.obtainMessage(0));
    }

    public final void getMin() {
        IsOverlapping isOverlapping = this.equals;
        isOverlapping.sendMessage(isOverlapping.obtainMessage(0));
    }

    public final void getMax(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.equals.obtainMessage(13);
            obtainMessage.obj = jSONArray;
            this.equals.sendMessage(obtainMessage);
        }
    }

    public final void getMin(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.equals.obtainMessage(5);
            obtainMessage.obj = jSONArray;
            this.equals.sendMessage(obtainMessage);
        }
    }

    public final void length(JSONArray jSONArray) {
        if (jSONArray != null) {
            Message obtainMessage = this.equals.obtainMessage(9);
            obtainMessage.obj = jSONArray;
            this.equals.sendMessage(obtainMessage);
        }
    }

    public final void setMin(String str) {
        Message obtainMessage = this.equals.obtainMessage();
        obtainMessage.what = 7;
        obtainMessage.obj = str;
        this.equals.sendMessage(obtainMessage);
    }

    public final void getMax(getVerticalSnapPreference.setMax setmax) {
        Message obtainMessage = this.equals.obtainMessage();
        obtainMessage.what = 12;
        obtainMessage.obj = setmax;
        this.equals.sendMessage(obtainMessage);
    }

    class getMax implements Runnable {
        volatile boolean setMax = true;

        public getMax() {
        }

        public final void run() {
            if (!this.setMax) {
                clampApplyScroll.this.equals.sendMessage(clampApplyScroll.this.equals.obtainMessage(1));
            }
            clampApplyScroll.this.equals.postDelayed(this, 30000);
        }
    }

    class setMax implements Application.ActivityLifecycleCallbacks, logChildren.setMax {
        private final logChildren getMax = new logChildren(this);
        private final getMax length;

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public setMax() {
            this.length = new getMax();
        }

        public final void setMin() {
            clampApplyScroll.this.getMin.getMin("$ab_gesture3");
            clampApplyScroll.this.equals.sendMessage(clampApplyScroll.this.equals.obtainMessage(1));
        }

        public final void onActivityPaused(Activity activity) {
            clampApplyScroll.this.length.getMax(activity);
            if (length() && !clampApplyScroll.this.getMax.setMax()) {
                getMax getmax = this.length;
                getmax.setMax = true;
                clampApplyScroll.this.equals.removeCallbacks(getmax);
            } else if (!clampApplyScroll.this.getMax.setMin()) {
                ((SensorManager) activity.getSystemService("sensor")).unregisterListener(this.getMax);
            }
        }

        private static boolean length() {
            if (!Build.HARDWARE.toLowerCase().equals("goldfish") && !Build.HARDWARE.toLowerCase().equals("ranchu")) {
                return false;
            }
            if ((Build.BRAND.toLowerCase().startsWith("generic") || Build.BRAND.toLowerCase().equals("android") || Build.BRAND.toLowerCase().equals("google")) && Build.DEVICE.toLowerCase().startsWith("generic") && Build.PRODUCT.toLowerCase().contains("sdk") && Build.MODEL.toLowerCase(Locale.US).contains("sdk")) {
                return true;
            }
            return false;
        }

        public final void onActivityResumed(Activity activity) {
            if (length() && !clampApplyScroll.this.getMax.setMax()) {
                getMax getmax = this.length;
                getmax.setMax = false;
                clampApplyScroll.this.equals.post(getmax);
            } else if (!clampApplyScroll.this.getMax.setMin()) {
                SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
                sensorManager.registerListener(this.getMax, sensorManager.getDefaultSensor(1), 3);
            }
            clampApplyScroll.this.length.setMax(activity);
        }
    }

    class IsOverlapping extends Handler {
        private final Set<setMin> FastBitmap$CoordinateSystem;
        private final Map<String, findOneVisibleChild<String, Object>> IsOverlapping;
        private final Set<findOneVisibleChild<String, JSONObject>> Mean$Arithmetic;
        private final Map<String, findOneVisibleChild<String, JSONObject>> equals;
        final Lock getMax;
        private getHorizontalSnapPreference getMin = null;
        private final Set<findOneVisibleChild<Integer, Integer>> hashCode;
        private final Set<findOneVisibleChild<Integer, Integer>> invoke;
        private final ImageStore isInside;
        private final String length;
        private EditorConnection setMax;
        private final Set<getMin> toDoubleRange;
        private final List<String> toFloatRange;
        private final EditProtocol toIntRange;
        private final Set<findOneVisibleChild<String, JSONObject>> toString;
        private final Map<String, findOneVisibleChild<String, JSONObject>> values;

        public IsOverlapping(Context context, String str, Looper looper, getVerticalSnapPreference.IsOverlapping isOverlapping) {
            super(looper);
            this.length = str;
            String str2 = clampApplyScroll.this.getMax.values;
            findPartiallyOrCompletelyInvisibleChildClosestToEnd.setMin setmin = new findPartiallyOrCompletelyInvisibleChildClosestToEnd.setMin(str2 == null ? context.getPackageName() : str2, context);
            this.isInside = new ImageStore(context, "ViewCrawler");
            this.toIntRange = new EditProtocol(context, setmin, this.isInside, isOverlapping);
            this.Mean$Arithmetic = new HashSet();
            this.equals = new HashMap();
            this.IsOverlapping = new HashMap();
            this.toFloatRange = new ArrayList();
            this.values = new HashMap();
            this.toDoubleRange = new HashSet();
            this.FastBitmap$CoordinateSystem = new HashSet();
            this.hashCode = new HashSet();
            this.toString = new HashSet();
            this.invoke = new HashSet();
            ReentrantLock reentrantLock = new ReentrantLock();
            this.getMax = reentrantLock;
            reentrantLock.lock();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|24|25) */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:50|51|52|53) */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:81|82|83|84) */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:21|26|27|28|29|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:49|54|55|56|57|58) */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:80|85|86|87|88|89) */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:14|15|16|17|18|19|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:42|43|44|45|46|47|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:72|73|74|75|76|77|78|79) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x028a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0136 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0203 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x020a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0216 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:78:0x0203=Splitter:B:78:0x0203, B:68:0x01a5=Splitter:B:68:0x01a5, B:47:0x0136=Splitter:B:47:0x0136, B:87:0x0216=Splitter:B:87:0x0216, B:56:0x0149=Splitter:B:56:0x0149, B:105:0x028a=Splitter:B:105:0x028a, B:19:0x008b=Splitter:B:19:0x008b, B:28:0x009e=Splitter:B:28:0x009e} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                java.lang.String r0 = "}"
                java.util.concurrent.locks.Lock r1 = r7.getMax
                r1.lock()
                int r1 = r8.what     // Catch:{ all -> 0x02c6 }
                java.lang.String r2 = "type"
                java.lang.String r3 = "payload"
                java.lang.String r4 = "mixpanel.viewcrawler.bindings"
                java.lang.String r5 = "mixpanel.viewcrawler.changes"
                r6 = 0
                switch(r1) {
                    case 0: goto L_0x0296;
                    case 1: goto L_0x0231;
                    case 2: goto L_0x0186;
                    case 3: goto L_0x017d;
                    case 4: goto L_0x0178;
                    case 5: goto L_0x0156;
                    case 6: goto L_0x014d;
                    case 7: goto L_0x00dc;
                    case 8: goto L_0x00d7;
                    case 9: goto L_0x00b4;
                    case 10: goto L_0x00ab;
                    case 11: goto L_0x00a2;
                    case 12: goto L_0x0031;
                    case 13: goto L_0x0019;
                    default: goto L_0x0017;
                }
            L_0x0017:
                goto L_0x02c0
            L_0x0019:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONArray r8 = (org.json.JSONArray) r8     // Catch:{ all -> 0x02c6 }
                android.content.SharedPreferences r0 = r7.getMax()     // Catch:{ all -> 0x02c6 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x02c6 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x02c6 }
                r0.putString(r5, r8)     // Catch:{ all -> 0x02c6 }
                r0.apply()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0031:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                o.getVerticalSnapPreference$setMax r8 = (o.getVerticalSnapPreference.setMax) r8     // Catch:{ all -> 0x02c6 }
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                if (r0 == 0) goto L_0x02c0
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                boolean r0 = r0.length()     // Catch:{ all -> 0x02c6 }
                if (r0 == 0) goto L_0x02c0
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                boolean r0 = r0.getMax()     // Catch:{ all -> 0x02c6 }
                if (r0 != 0) goto L_0x004b
                goto L_0x02c0
            L_0x004b:
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x02c6 }
                com.mixpanel.android.viewcrawler.EditorConnection$setMax r3 = new com.mixpanel.android.viewcrawler.EditorConnection$setMax     // Catch:{ all -> 0x02c6 }
                r3.<init>(r0, r6)     // Catch:{ all -> 0x02c6 }
                r1.<init>(r3)     // Catch:{ all -> 0x02c6 }
                java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x02c6 }
                r0.<init>(r1)     // Catch:{ all -> 0x02c6 }
                android.util.JsonWriter r1 = new android.util.JsonWriter     // Catch:{ all -> 0x02c6 }
                r1.<init>(r0)     // Catch:{ all -> 0x02c6 }
                r1.beginObject()     // Catch:{ IOException -> 0x0092 }
                android.util.JsonWriter r0 = r1.name(r2)     // Catch:{ IOException -> 0x0092 }
                java.lang.String r2 = "layout_error"
                r0.value(r2)     // Catch:{ IOException -> 0x0092 }
                java.lang.String r0 = "exception_type"
                android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ IOException -> 0x0092 }
                java.lang.String r2 = r8.getMin     // Catch:{ IOException -> 0x0092 }
                r0.value(r2)     // Catch:{ IOException -> 0x0092 }
                java.lang.String r0 = "cid"
                android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ IOException -> 0x0092 }
                java.lang.String r8 = r8.getMax     // Catch:{ IOException -> 0x0092 }
                r0.value(r8)     // Catch:{ IOException -> 0x0092 }
                r1.endObject()     // Catch:{ IOException -> 0x0092 }
                r1.close()     // Catch:{ IOException -> 0x008b }
                goto L_0x02c0
            L_0x008b:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0090:
                r8 = move-exception
                goto L_0x009a
            L_0x0092:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0090 }
                r1.close()     // Catch:{ IOException -> 0x008b }
                goto L_0x02c0
            L_0x009a:
                r1.close()     // Catch:{ IOException -> 0x009e }
                goto L_0x00a1
            L_0x009e:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
            L_0x00a1:
                throw r8     // Catch:{ all -> 0x02c6 }
            L_0x00a2:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ all -> 0x02c6 }
                r7.setMin((org.json.JSONObject) r8)     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x00ab:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ all -> 0x02c6 }
                r7.getMax((org.json.JSONObject) r8)     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x00b4:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONArray r8 = (org.json.JSONArray) r8     // Catch:{ all -> 0x02c6 }
                android.content.SharedPreferences r0 = r7.getMax()     // Catch:{ all -> 0x02c6 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x02c6 }
                java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x02c6 }
                r0.putString(r5, r1)     // Catch:{ all -> 0x02c6 }
                r0.apply()     // Catch:{ all -> 0x02c6 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x02c6 }
                r0 = 1
                r7.getMin(r8, r0)     // Catch:{ all -> 0x02c6 }
                r7.length()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x00d7:
                r7.setMin()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x00dc:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x02c6 }
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                if (r0 == 0) goto L_0x02c0
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                boolean r0 = r0.length()     // Catch:{ all -> 0x02c6 }
                if (r0 == 0) goto L_0x02c0
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                boolean r0 = r0.getMax()     // Catch:{ all -> 0x02c6 }
                if (r0 != 0) goto L_0x00f6
                goto L_0x02c0
            L_0x00f6:
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r7.setMax     // Catch:{ all -> 0x02c6 }
                java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x02c6 }
                com.mixpanel.android.viewcrawler.EditorConnection$setMax r4 = new com.mixpanel.android.viewcrawler.EditorConnection$setMax     // Catch:{ all -> 0x02c6 }
                r4.<init>(r0, r6)     // Catch:{ all -> 0x02c6 }
                r1.<init>(r4)     // Catch:{ all -> 0x02c6 }
                java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x02c6 }
                r0.<init>(r1)     // Catch:{ all -> 0x02c6 }
                android.util.JsonWriter r1 = new android.util.JsonWriter     // Catch:{ all -> 0x02c6 }
                r1.<init>(r0)     // Catch:{ all -> 0x02c6 }
                r1.beginObject()     // Catch:{ IOException -> 0x013d }
                android.util.JsonWriter r0 = r1.name(r2)     // Catch:{ IOException -> 0x013d }
                java.lang.String r2 = "track_message"
                r0.value(r2)     // Catch:{ IOException -> 0x013d }
                r1.name(r3)     // Catch:{ IOException -> 0x013d }
                r1.beginObject()     // Catch:{ IOException -> 0x013d }
                java.lang.String r0 = "event_name"
                android.util.JsonWriter r0 = r1.name(r0)     // Catch:{ IOException -> 0x013d }
                r0.value(r8)     // Catch:{ IOException -> 0x013d }
                r1.endObject()     // Catch:{ IOException -> 0x013d }
                r1.endObject()     // Catch:{ IOException -> 0x013d }
                r1.flush()     // Catch:{ IOException -> 0x013d }
                r1.close()     // Catch:{ IOException -> 0x0136 }
                goto L_0x02c0
            L_0x0136:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x013b:
                r8 = move-exception
                goto L_0x0145
            L_0x013d:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x013b }
                r1.close()     // Catch:{ IOException -> 0x0136 }
                goto L_0x02c0
            L_0x0145:
                r1.close()     // Catch:{ IOException -> 0x0149 }
                goto L_0x014c
            L_0x0149:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
            L_0x014c:
                throw r8     // Catch:{ all -> 0x02c6 }
            L_0x014d:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ all -> 0x02c6 }
                r7.getMin((org.json.JSONObject) r8)     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0156:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONArray r8 = (org.json.JSONArray) r8     // Catch:{ all -> 0x02c6 }
                android.content.SharedPreferences r0 = r7.getMax()     // Catch:{ all -> 0x02c6 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x02c6 }
                java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x02c6 }
                r0.putString(r4, r1)     // Catch:{ all -> 0x02c6 }
                r0.apply()     // Catch:{ all -> 0x02c6 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x02c6 }
                r7.setMin((java.lang.String) r8)     // Catch:{ all -> 0x02c6 }
                r7.length()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0178:
                r7.getMin()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x017d:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ all -> 0x02c6 }
                r7.length(r8)     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0186:
                java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x02c6 }
                org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch:{ all -> 0x02c6 }
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02c6 }
                org.json.JSONObject r8 = r8.getJSONObject(r3)     // Catch:{ JSONException -> 0x0227, BadInstructionsException -> 0x021a }
                java.lang.String r3 = "config"
                boolean r3 = r8.has(r3)     // Catch:{ JSONException -> 0x0227, BadInstructionsException -> 0x021a }
                if (r3 == 0) goto L_0x01a5
                com.mixpanel.android.viewcrawler.EditProtocol r3 = r7.toIntRange     // Catch:{ JSONException -> 0x0227, BadInstructionsException -> 0x021a }
                o.getHorizontalSnapPreference r8 = r3.getMin(r8)     // Catch:{ JSONException -> 0x0227, BadInstructionsException -> 0x021a }
                r7.getMin = r8     // Catch:{ JSONException -> 0x0227, BadInstructionsException -> 0x021a }
                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ JSONException -> 0x0227, BadInstructionsException -> 0x021a }
            L_0x01a5:
                o.getHorizontalSnapPreference r8 = r7.getMin     // Catch:{ all -> 0x02c6 }
                if (r8 != 0) goto L_0x01b3
                java.lang.String r8 = "No snapshot configuration (or a malformed snapshot configuration) was sent."
                r7.getMax((java.lang.String) r8)     // Catch:{ all -> 0x02c6 }
                o.findOnePartiallyOrCompletelyInvisibleChild.isInside()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x01b3:
                com.mixpanel.android.viewcrawler.EditorConnection r8 = r7.setMax     // Catch:{ all -> 0x02c6 }
                java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x02c6 }
                com.mixpanel.android.viewcrawler.EditorConnection$setMax r4 = new com.mixpanel.android.viewcrawler.EditorConnection$setMax     // Catch:{ all -> 0x02c6 }
                r4.<init>(r8, r6)     // Catch:{ all -> 0x02c6 }
                r3.<init>(r4)     // Catch:{ all -> 0x02c6 }
                java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x02c6 }
                r8.<init>(r3)     // Catch:{ all -> 0x02c6 }
                java.lang.String r4 = "{"
                r8.write(r4)     // Catch:{ IOException -> 0x020a }
                java.lang.String r4 = "\"type\": \"snapshot_response\","
                r8.write(r4)     // Catch:{ IOException -> 0x020a }
                java.lang.String r4 = "\"payload\": {"
                r8.write(r4)     // Catch:{ IOException -> 0x020a }
                java.lang.String r4 = "\"activities\":"
                r8.write(r4)     // Catch:{ IOException -> 0x020a }
                r8.flush()     // Catch:{ IOException -> 0x020a }
                o.getHorizontalSnapPreference r4 = r7.getMin     // Catch:{ IOException -> 0x020a }
                o.clampApplyScroll r5 = o.clampApplyScroll.this     // Catch:{ IOException -> 0x020a }
                o.supportsPredictiveItemAnimations r5 = r5.length     // Catch:{ IOException -> 0x020a }
                r4.setMax(r5, r3)     // Catch:{ IOException -> 0x020a }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x020a }
                long r3 = r3 - r1
                java.lang.String r1 = ",\"snapshot_time_millis\": "
                r8.write(r1)     // Catch:{ IOException -> 0x020a }
                java.lang.String r1 = java.lang.Long.toString(r3)     // Catch:{ IOException -> 0x020a }
                r8.write(r1)     // Catch:{ IOException -> 0x020a }
                r8.write(r0)     // Catch:{ IOException -> 0x020a }
                r8.write(r0)     // Catch:{ IOException -> 0x020a }
                r8.close()     // Catch:{ IOException -> 0x0203 }
                goto L_0x02c0
            L_0x0203:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0208:
                r0 = move-exception
                goto L_0x0212
            L_0x020a:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0208 }
                r8.close()     // Catch:{ IOException -> 0x0203 }
                goto L_0x02c0
            L_0x0212:
                r8.close()     // Catch:{ IOException -> 0x0216 }
                goto L_0x0219
            L_0x0216:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
            L_0x0219:
                throw r0     // Catch:{ all -> 0x02c6 }
            L_0x021a:
                r8 = move-exception
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x02c6 }
                r7.getMax((java.lang.String) r8)     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0227:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
                java.lang.String r8 = "Payload with snapshot config required with snapshot request"
                r7.getMax((java.lang.String) r8)     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0231:
                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x02c6 }
                com.mixpanel.android.viewcrawler.EditorConnection r8 = r7.setMax     // Catch:{ all -> 0x02c6 }
                if (r8 == 0) goto L_0x0245
                com.mixpanel.android.viewcrawler.EditorConnection r8 = r7.setMax     // Catch:{ all -> 0x02c6 }
                boolean r8 = r8.length()     // Catch:{ all -> 0x02c6 }
                if (r8 == 0) goto L_0x0245
                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0245:
                o.clampApplyScroll r8 = o.clampApplyScroll.this     // Catch:{ all -> 0x02c6 }
                o.shouldMeasureTwice r8 = r8.getMax     // Catch:{ all -> 0x02c6 }
                javax.net.ssl.SSLSocketFactory r8 = r8.values()     // Catch:{ all -> 0x02c6 }
                if (r8 != 0) goto L_0x0255
                o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0255:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c6 }
                r0.<init>()     // Catch:{ all -> 0x02c6 }
                o.clampApplyScroll r1 = o.clampApplyScroll.this     // Catch:{ all -> 0x02c6 }
                android.content.Context r1 = r1.setMin     // Catch:{ all -> 0x02c6 }
                o.shouldMeasureTwice r1 = o.shouldMeasureTwice.getMax(r1)     // Catch:{ all -> 0x02c6 }
                java.lang.String r1 = r1.toDoubleRange     // Catch:{ all -> 0x02c6 }
                r0.append(r1)     // Catch:{ all -> 0x02c6 }
                java.lang.String r1 = r7.length     // Catch:{ all -> 0x02c6 }
                r0.append(r1)     // Catch:{ all -> 0x02c6 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02c6 }
                java.net.Socket r8 = r8.createSocket()     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                com.mixpanel.android.viewcrawler.EditorConnection r1 = new com.mixpanel.android.viewcrawler.EditorConnection     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                r2.<init>(r0)     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                o.clampApplyScroll$length r0 = new o.clampApplyScroll$length     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                o.clampApplyScroll r3 = o.clampApplyScroll.this     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                r0.<init>(r3, r6)     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                r1.<init>(r2, r0, r8)     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                r7.setMax = r1     // Catch:{ URISyntaxException -> 0x0292, EditorConnectionException -> 0x028e, IOException -> 0x028a }
                goto L_0x02c0
            L_0x028a:
                o.findOnePartiallyOrCompletelyInvisibleChild.equals()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x028e:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0292:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02c6 }
                goto L_0x02c0
            L_0x0296:
                android.content.SharedPreferences r8 = r7.getMax()     // Catch:{ all -> 0x02c6 }
                r0 = 0
                java.lang.String r1 = r8.getString(r5, r0)     // Catch:{ all -> 0x02c6 }
                java.lang.String r8 = r8.getString(r4, r0)     // Catch:{ all -> 0x02c6 }
                java.util.Set<o.clampApplyScroll$getMin> r0 = r7.toDoubleRange     // Catch:{ all -> 0x02c6 }
                r0.clear()     // Catch:{ all -> 0x02c6 }
                java.util.Set<o.clampApplyScroll$setMin> r0 = r7.FastBitmap$CoordinateSystem     // Catch:{ all -> 0x02c6 }
                r0.clear()     // Catch:{ all -> 0x02c6 }
                java.util.Set<o.findOneVisibleChild<java.lang.Integer, java.lang.Integer>> r0 = r7.invoke     // Catch:{ all -> 0x02c6 }
                r0.clear()     // Catch:{ all -> 0x02c6 }
                r7.getMin(r1, r6)     // Catch:{ all -> 0x02c6 }
                java.util.Set<o.findOneVisibleChild<java.lang.String, org.json.JSONObject>> r0 = r7.toString     // Catch:{ all -> 0x02c6 }
                r0.clear()     // Catch:{ all -> 0x02c6 }
                r7.setMin((java.lang.String) r8)     // Catch:{ all -> 0x02c6 }
                r7.length()     // Catch:{ all -> 0x02c6 }
            L_0x02c0:
                java.util.concurrent.locks.Lock r8 = r7.getMax
                r8.unlock()
                return
            L_0x02c6:
                r8 = move-exception
                java.util.concurrent.locks.Lock r0 = r7.getMax
                r0.unlock()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o.clampApplyScroll.IsOverlapping.handleMessage(android.os.Message):void");
        }

        private void getMin(String str, boolean z) {
            String str2;
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    int length2 = jSONArray.length();
                    for (int i = 0; i < length2; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        findOneVisibleChild findonevisiblechild = new findOneVisibleChild(Integer.valueOf(jSONObject.getInt("experiment_id")), Integer.valueOf(jSONObject.getInt("id")));
                        JSONArray jSONArray2 = jSONObject.getJSONArray("actions");
                        int length3 = jSONArray2.length();
                        for (int i2 = 0; i2 < length3; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            if (!jSONObject2.has("target_activity") || jSONObject2.isNull("target_activity")) {
                                str2 = null;
                            } else {
                                str2 = jSONObject2.getString("target_activity");
                            }
                            this.toDoubleRange.add(new getMin(jSONObject2.getString("name"), str2, jSONObject2, findonevisiblechild));
                        }
                        JSONArray jSONArray3 = jSONObject.getJSONArray("tweaks");
                        int length4 = jSONArray3.length();
                        for (int i3 = 0; i3 < length4; i3++) {
                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i3);
                            this.FastBitmap$CoordinateSystem.add(new setMin(jSONObject3.getString("name"), jSONObject3, findonevisiblechild));
                        }
                        if (!z) {
                            this.invoke.add(findonevisiblechild);
                        }
                        if (length4 == 0 && length3 == 0) {
                            this.hashCode.add(findonevisiblechild);
                        }
                    }
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.equals();
                    SharedPreferences.Editor edit = getMax().edit();
                    edit.remove("mixpanel.viewcrawler.changes");
                    edit.apply();
                }
            }
        }

        private void setMin(String str) {
            String str2;
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    this.toString.clear();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (!jSONObject.has("target_activity") || jSONObject.isNull("target_activity")) {
                            str2 = null;
                        } else {
                            str2 = jSONObject.getString("target_activity");
                        }
                        this.toString.add(new findOneVisibleChild(str2, jSONObject));
                    }
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.equals();
                    SharedPreferences.Editor edit = getMax().edit();
                    edit.remove("mixpanel.viewcrawler.bindings");
                    edit.apply();
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|(3:23|24|25)) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0055 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void getMax(java.lang.String r6) {
            /*
                r5 = this;
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r5.setMax
                if (r0 == 0) goto L_0x0068
                boolean r0 = r0.length()
                if (r0 == 0) goto L_0x0068
                com.mixpanel.android.viewcrawler.EditorConnection r0 = r5.setMax
                boolean r0 = r0.getMax()
                if (r0 != 0) goto L_0x0013
                goto L_0x0068
            L_0x0013:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "error_message"
                r0.put(r1, r6)     // Catch:{ JSONException -> 0x001e }
                goto L_0x0021
            L_0x001e:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
            L_0x0021:
                java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter
                com.mixpanel.android.viewcrawler.EditorConnection r1 = r5.setMax
                java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
                com.mixpanel.android.viewcrawler.EditorConnection$setMax r3 = new com.mixpanel.android.viewcrawler.EditorConnection$setMax
                r4 = 0
                r3.<init>(r1, r4)
                r2.<init>(r3)
                r6.<init>(r2)
                java.lang.String r1 = "{\"type\": \"error\", "
                r6.write(r1)     // Catch:{ IOException -> 0x0055 }
                java.lang.String r1 = "\"payload\": "
                r6.write(r1)     // Catch:{ IOException -> 0x0055 }
                java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0055 }
                r6.write(r0)     // Catch:{ IOException -> 0x0055 }
                java.lang.String r0 = "}"
                r6.write(r0)     // Catch:{ IOException -> 0x0055 }
                r6.close()     // Catch:{ IOException -> 0x004f }
                return
            L_0x004f:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
                return
            L_0x0053:
                r0 = move-exception
                goto L_0x0060
            L_0x0055:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0053 }
                r6.close()     // Catch:{ IOException -> 0x005c }
                return
            L_0x005c:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
                return
            L_0x0060:
                r6.close()     // Catch:{ IOException -> 0x0064 }
                goto L_0x0067
            L_0x0064:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
            L_0x0067:
                throw r0
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.clampApplyScroll.IsOverlapping.getMax(java.lang.String):void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|(3:41|42|43)) */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x01dc, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x01e4, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e5, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e8, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ed, code lost:
            o.findOnePartiallyOrCompletelyInvisibleChild.values();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01f0, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x01de */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void getMin() {
            /*
                r10 = this;
                java.lang.String r0 = "type"
                com.mixpanel.android.viewcrawler.EditorConnection r1 = r10.setMax
                if (r1 == 0) goto L_0x01f1
                boolean r1 = r1.length()
                if (r1 == 0) goto L_0x01f1
                com.mixpanel.android.viewcrawler.EditorConnection r1 = r10.setMax
                boolean r1 = r1.getMax()
                if (r1 != 0) goto L_0x0017
                goto L_0x01f1
            L_0x0017:
                com.mixpanel.android.viewcrawler.EditorConnection r1 = r10.setMax
                java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
                com.mixpanel.android.viewcrawler.EditorConnection$setMax r3 = new com.mixpanel.android.viewcrawler.EditorConnection$setMax
                r4 = 0
                r3.<init>(r1, r4)
                r2.<init>(r3)
                android.util.JsonWriter r1 = new android.util.JsonWriter
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
                r3.<init>(r2)
                r1.<init>(r3)
                r1.beginObject()     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r2 = r1.name(r0)     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = "device_info_response"
                r2.value(r3)     // Catch:{ IOException -> 0x01de }
                java.lang.String r2 = "payload"
                android.util.JsonWriter r2 = r1.name(r2)     // Catch:{ IOException -> 0x01de }
                r2.beginObject()     // Catch:{ IOException -> 0x01de }
                java.lang.String r2 = "device_type"
                android.util.JsonWriter r2 = r1.name(r2)     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = "Android"
                r2.value(r3)     // Catch:{ IOException -> 0x01de }
                java.lang.String r2 = "device_name"
                android.util.JsonWriter r2 = r1.name(r2)     // Catch:{ IOException -> 0x01de }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01de }
                r3.<init>()     // Catch:{ IOException -> 0x01de }
                java.lang.String r4 = android.os.Build.BRAND     // Catch:{ IOException -> 0x01de }
                r3.append(r4)     // Catch:{ IOException -> 0x01de }
                java.lang.String r4 = "/"
                r3.append(r4)     // Catch:{ IOException -> 0x01de }
                java.lang.String r4 = android.os.Build.MODEL     // Catch:{ IOException -> 0x01de }
                r3.append(r4)     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x01de }
                r2.value(r3)     // Catch:{ IOException -> 0x01de }
                java.lang.String r2 = "scaled_density"
                android.util.JsonWriter r2 = r1.name(r2)     // Catch:{ IOException -> 0x01de }
                o.clampApplyScroll r3 = o.clampApplyScroll.this     // Catch:{ IOException -> 0x01de }
                float r3 = r3.isInside     // Catch:{ IOException -> 0x01de }
                double r3 = (double) r3     // Catch:{ IOException -> 0x01de }
                r2.value(r3)     // Catch:{ IOException -> 0x01de }
                o.clampApplyScroll r2 = o.clampApplyScroll.this     // Catch:{ IOException -> 0x01de }
                java.util.Map r2 = r2.toFloatRange     // Catch:{ IOException -> 0x01de }
                java.util.Set r2 = r2.entrySet()     // Catch:{ IOException -> 0x01de }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x01de }
            L_0x008d:
                boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x01de }
                if (r3 == 0) goto L_0x00ad
                java.lang.Object r3 = r2.next()     // Catch:{ IOException -> 0x01de }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ IOException -> 0x01de }
                java.lang.Object r4 = r3.getKey()     // Catch:{ IOException -> 0x01de }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r4 = r1.name(r4)     // Catch:{ IOException -> 0x01de }
                java.lang.Object r3 = r3.getValue()     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x01de }
                r4.value(r3)     // Catch:{ IOException -> 0x01de }
                goto L_0x008d
            L_0x00ad:
                o.clampApplyScroll r2 = o.clampApplyScroll.this     // Catch:{ IOException -> 0x01de }
                o.findFirstVisibleItemPosition r2 = r2.toIntRange     // Catch:{ IOException -> 0x01de }
                java.util.Map r2 = r2.getMin()     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = "tweaks"
                android.util.JsonWriter r3 = r1.name(r3)     // Catch:{ IOException -> 0x01de }
                r3.beginArray()     // Catch:{ IOException -> 0x01de }
                java.util.Set r2 = r2.entrySet()     // Catch:{ IOException -> 0x01de }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x01de }
            L_0x00c9:
                boolean r3 = r2.hasNext()     // Catch:{ IOException -> 0x01de }
                if (r3 == 0) goto L_0x01cb
                java.lang.Object r3 = r2.next()     // Catch:{ IOException -> 0x01de }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ IOException -> 0x01de }
                java.lang.Object r4 = r3.getValue()     // Catch:{ IOException -> 0x01de }
                o.findFirstVisibleItemPosition$length r4 = (o.findFirstVisibleItemPosition.length) r4     // Catch:{ IOException -> 0x01de }
                java.lang.Object r3 = r3.getKey()     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x01de }
                r1.beginObject()     // Catch:{ IOException -> 0x01de }
                java.lang.String r5 = "name"
                android.util.JsonWriter r5 = r1.name(r5)     // Catch:{ IOException -> 0x01de }
                r5.value(r3)     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = "minimum"
                android.util.JsonWriter r3 = r1.name(r3)     // Catch:{ IOException -> 0x01de }
                java.lang.Number r5 = r4.setMax     // Catch:{ IOException -> 0x01de }
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                java.lang.String r3 = "maximum"
                android.util.JsonWriter r3 = r1.name(r3)     // Catch:{ IOException -> 0x01de }
                java.lang.Number r5 = r4.getMin     // Catch:{ IOException -> 0x01de }
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                int r3 = r4.getMax     // Catch:{ IOException -> 0x01de }
                r5 = 1
                java.lang.String r6 = "default"
                java.lang.String r7 = "value"
                if (r3 == r5) goto L_0x019f
                r5 = 2
                java.lang.String r8 = "encoding"
                java.lang.String r9 = "number"
                if (r3 == r5) goto L_0x0170
                r5 = 3
                if (r3 == r5) goto L_0x0141
                r5 = 4
                if (r3 == r5) goto L_0x011f
                o.findOnePartiallyOrCompletelyInvisibleChild.FastBitmap$CoordinateSystem()     // Catch:{ IOException -> 0x01de }
                goto L_0x01c6
            L_0x011f:
                android.util.JsonWriter r3 = r1.name(r0)     // Catch:{ IOException -> 0x01de }
                java.lang.String r5 = "string"
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r7)     // Catch:{ IOException -> 0x01de }
                java.lang.String r5 = r4.getMin()     // Catch:{ IOException -> 0x01de }
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r6)     // Catch:{ IOException -> 0x01de }
                java.lang.Object r4 = r4.length     // Catch:{ IOException -> 0x01de }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x01de }
                r3.value(r4)     // Catch:{ IOException -> 0x01de }
                goto L_0x01c6
            L_0x0141:
                android.util.JsonWriter r3 = r1.name(r0)     // Catch:{ IOException -> 0x01de }
                r3.value(r9)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r8)     // Catch:{ IOException -> 0x01de }
                java.lang.String r5 = "l"
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r7)     // Catch:{ IOException -> 0x01de }
                java.lang.Number r5 = r4.getMax()     // Catch:{ IOException -> 0x01de }
                long r7 = r5.longValue()     // Catch:{ IOException -> 0x01de }
                r3.value(r7)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r6)     // Catch:{ IOException -> 0x01de }
                java.lang.Object r4 = r4.length     // Catch:{ IOException -> 0x01de }
                java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ IOException -> 0x01de }
                long r4 = r4.longValue()     // Catch:{ IOException -> 0x01de }
                r3.value(r4)     // Catch:{ IOException -> 0x01de }
                goto L_0x01c6
            L_0x0170:
                android.util.JsonWriter r3 = r1.name(r0)     // Catch:{ IOException -> 0x01de }
                r3.value(r9)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r8)     // Catch:{ IOException -> 0x01de }
                java.lang.String r5 = "d"
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r7)     // Catch:{ IOException -> 0x01de }
                java.lang.Number r5 = r4.getMax()     // Catch:{ IOException -> 0x01de }
                double r7 = r5.doubleValue()     // Catch:{ IOException -> 0x01de }
                r3.value(r7)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r6)     // Catch:{ IOException -> 0x01de }
                java.lang.Object r4 = r4.length     // Catch:{ IOException -> 0x01de }
                java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ IOException -> 0x01de }
                double r4 = r4.doubleValue()     // Catch:{ IOException -> 0x01de }
                r3.value(r4)     // Catch:{ IOException -> 0x01de }
                goto L_0x01c6
            L_0x019f:
                android.util.JsonWriter r3 = r1.name(r0)     // Catch:{ IOException -> 0x01de }
                java.lang.String r5 = "boolean"
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r7)     // Catch:{ IOException -> 0x01de }
                java.lang.Boolean r5 = r4.length()     // Catch:{ IOException -> 0x01de }
                boolean r5 = r5.booleanValue()     // Catch:{ IOException -> 0x01de }
                r3.value(r5)     // Catch:{ IOException -> 0x01de }
                android.util.JsonWriter r3 = r1.name(r6)     // Catch:{ IOException -> 0x01de }
                java.lang.Object r4 = r4.length     // Catch:{ IOException -> 0x01de }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x01de }
                boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x01de }
                r3.value(r4)     // Catch:{ IOException -> 0x01de }
            L_0x01c6:
                r1.endObject()     // Catch:{ IOException -> 0x01de }
                goto L_0x00c9
            L_0x01cb:
                r1.endArray()     // Catch:{ IOException -> 0x01de }
                r1.endObject()     // Catch:{ IOException -> 0x01de }
                r1.endObject()     // Catch:{ IOException -> 0x01de }
                r1.close()     // Catch:{ IOException -> 0x01d8 }
                return
            L_0x01d8:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
                return
            L_0x01dc:
                r0 = move-exception
                goto L_0x01e9
            L_0x01de:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x01dc }
                r1.close()     // Catch:{ IOException -> 0x01e5 }
                return
            L_0x01e5:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
                return
            L_0x01e9:
                r1.close()     // Catch:{ IOException -> 0x01ed }
                goto L_0x01f0
            L_0x01ed:
                o.findOnePartiallyOrCompletelyInvisibleChild.values()
            L_0x01f0:
                throw r0
            L_0x01f1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.clampApplyScroll.IsOverlapping.getMin():void");
        }

        private void length(JSONObject jSONObject) {
            String str;
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("actions");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (!jSONObject2.has("target_activity") || jSONObject2.isNull("target_activity")) {
                        str = null;
                    } else {
                        str = jSONObject2.getString("target_activity");
                    }
                    this.equals.put(jSONObject2.getString("name"), new findOneVisibleChild(str, jSONObject2));
                }
                length();
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
        }

        private void getMax(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("actions");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.equals.remove(jSONArray.getString(i));
                }
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
            length();
        }

        private void setMin(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("tweaks");
                int length2 = jSONArray.length();
                for (int i = 0; i < length2; i++) {
                    findOneVisibleChild<String, Object> max = EditProtocol.setMax(jSONArray.getJSONObject(i));
                    this.IsOverlapping.put(max.first, max);
                }
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            } catch (EditProtocol.BadInstructionsException unused2) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
            length();
        }

        private void getMin(JSONObject jSONObject) {
            String str;
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("payload").getJSONArray("events");
                int length2 = jSONArray.length();
                this.values.clear();
                if (!this.toString.isEmpty() && this.Mean$Arithmetic.isEmpty()) {
                    this.Mean$Arithmetic.addAll(this.toString);
                    for (findOneVisibleChild next : this.toString) {
                        try {
                            this.values.put(((JSONObject) next.second).get("path").toString(), next);
                        } catch (JSONException unused) {
                        }
                    }
                    this.toString.clear();
                }
                for (int i = 0; i < length2; i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (!jSONObject2.has("target_activity") || jSONObject2.isNull("target_activity")) {
                            str = null;
                        } else {
                            str = jSONObject2.getString("target_activity");
                        }
                        this.values.put(jSONObject2.get("path").toString(), new findOneVisibleChild(str, jSONObject2));
                    } catch (JSONException unused2) {
                        findOnePartiallyOrCompletelyInvisibleChild.values();
                    }
                }
                length();
            } catch (JSONException unused3) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
        }

        private void setMin() {
            this.equals.clear();
            this.values.clear();
            this.IsOverlapping.clear();
            this.toString.addAll(this.Mean$Arithmetic);
            this.Mean$Arithmetic.clear();
            this.getMin = null;
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            length();
            for (String next : this.toFloatRange) {
                File max = this.isInside.getMax(next);
                if (max != null) {
                    max.delete();
                    synchronized (ImageStore.length) {
                        ImageStore.length.remove(next);
                    }
                }
            }
        }

        private void length() {
            List list;
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (getMin next : this.toDoubleRange) {
                try {
                    arrayList.add(new findOneVisibleChild(next.setMin, this.toIntRange.getMax(next.setMax).setMax));
                    if (!this.invoke.contains(next.getMax)) {
                        hashSet.add(next.getMax);
                    }
                } catch (EditProtocol.CantGetEditAssetsException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.setMax();
                } catch (EditProtocol.InapplicableInstructionsException e) {
                    e.getMessage();
                    findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                } catch (EditProtocol.BadInstructionsException unused2) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
            for (setMin next2 : this.FastBitmap$CoordinateSystem) {
                try {
                    findOneVisibleChild<String, Object> max = EditProtocol.setMax(next2.getMax);
                    if (!this.invoke.contains(next2.setMax)) {
                        hashSet.add(next2.setMax);
                        hashSet2.add(max.first);
                    } else if (clampApplyScroll.this.toIntRange.length((String) max.first, max.second)) {
                        hashSet2.add(max.first);
                    }
                    if (!clampApplyScroll.this.toIntRange.getMin().containsKey(max.first)) {
                        findFirstVisibleItemPosition.length max2 = findFirstVisibleItemPosition.length.setMax(next2.getMax);
                        findFirstVisibleItemPosition isInside2 = clampApplyScroll.this.toIntRange;
                        String str = (String) max.first;
                        if (str != null) {
                            if (max2 != null) {
                                isInside2.getMax.put(str, max2);
                            }
                        }
                    } else {
                        clampApplyScroll.this.toIntRange.getMin((String) max.first, max.second);
                    }
                } catch (EditProtocol.BadInstructionsException unused3) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
            if (this.FastBitmap$CoordinateSystem.size() == 0) {
                for (Map.Entry next3 : clampApplyScroll.this.toIntRange.setMax().entrySet()) {
                    findFirstVisibleItemPosition.length length2 = (findFirstVisibleItemPosition.length) next3.getValue();
                    String str2 = (String) next3.getKey();
                    if (clampApplyScroll.this.toIntRange.length(str2, length2.setMin)) {
                        clampApplyScroll.this.toIntRange.getMin(str2, length2.setMin);
                        hashSet2.add(str2);
                    }
                }
            }
            for (findOneVisibleChild next4 : this.equals.values()) {
                try {
                    EditProtocol.length max3 = this.toIntRange.getMax((JSONObject) next4.second);
                    arrayList.add(new findOneVisibleChild(next4.first, max3.setMax));
                    this.toFloatRange.addAll(max3.getMax);
                } catch (EditProtocol.CantGetEditAssetsException unused4) {
                    findOnePartiallyOrCompletelyInvisibleChild.setMax();
                } catch (EditProtocol.InapplicableInstructionsException e2) {
                    e2.getMessage();
                    findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                } catch (EditProtocol.BadInstructionsException unused5) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
            for (findOneVisibleChild next5 : this.IsOverlapping.values()) {
                if (clampApplyScroll.this.toIntRange.length((String) next5.first, next5.second)) {
                    hashSet2.add(next5.first);
                }
                clampApplyScroll.this.toIntRange.getMin((String) next5.first, next5.second);
            }
            if (this.values.size() == 0 && this.Mean$Arithmetic.size() == 0) {
                for (findOneVisibleChild next6 : this.toString) {
                    try {
                        arrayList.add(new findOneVisibleChild(next6.first, this.toIntRange.setMax((JSONObject) next6.second, (getVerticalSnapPreference.isInside) clampApplyScroll.this.setMax)));
                    } catch (EditProtocol.InapplicableInstructionsException e3) {
                        e3.getMessage();
                        findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                    } catch (EditProtocol.BadInstructionsException unused6) {
                        findOnePartiallyOrCompletelyInvisibleChild.values();
                    }
                }
            }
            for (findOneVisibleChild next7 : this.values.values()) {
                try {
                    arrayList.add(new findOneVisibleChild(next7.first, this.toIntRange.setMax((JSONObject) next7.second, (getVerticalSnapPreference.isInside) clampApplyScroll.this.setMax)));
                } catch (EditProtocol.InapplicableInstructionsException e4) {
                    e4.getMessage();
                    findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                } catch (EditProtocol.BadInstructionsException unused7) {
                    findOnePartiallyOrCompletelyInvisibleChild.values();
                }
            }
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                findOneVisibleChild findonevisiblechild = (findOneVisibleChild) arrayList.get(i);
                if (hashMap.containsKey(findonevisiblechild.first)) {
                    list = (List) hashMap.get(findonevisiblechild.first);
                } else {
                    list = new ArrayList();
                    hashMap.put(findonevisiblechild.first, list);
                }
                list.add(findonevisiblechild.second);
            }
            clampApplyScroll.this.length.length(hashMap);
            for (findOneVisibleChild next8 : this.hashCode) {
                if (!this.invoke.contains(next8)) {
                    hashSet.add(next8);
                }
            }
            this.invoke.addAll(hashSet);
            getMin((Set<findOneVisibleChild<Integer, Integer>>) hashSet);
            this.hashCode.clear();
            if (hashSet2.size() > 0) {
                Iterator it = clampApplyScroll.this.IsOverlapping.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        private void getMin(Set<findOneVisibleChild<Integer, Integer>> set) {
            if (set.size() > 0) {
                final JSONObject jSONObject = new JSONObject();
                try {
                    for (findOneVisibleChild next : set) {
                        int intValue = ((Integer) next.first).intValue();
                        int intValue2 = ((Integer) next.second).intValue();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("$experiment_id", intValue);
                        jSONObject2.put("$variant_id", intValue2);
                        jSONObject.put(Integer.toString(intValue), intValue2);
                        clampApplyScroll.this.getMin.setMax.getMin("$experiments", jSONObject);
                        clampApplyScroll.this.getMin.setMax((findLastPartiallyOrCompletelyInvisibleChild) new findLastPartiallyOrCompletelyInvisibleChild() {
                            public final JSONObject getMin(JSONObject jSONObject) {
                                try {
                                    jSONObject.put("$experiments", jSONObject);
                                } catch (JSONException unused) {
                                    findOnePartiallyOrCompletelyInvisibleChild.toDoubleRange();
                                }
                                return jSONObject;
                            }
                        });
                        clampApplyScroll.this.getMin.setMin(ToggleEvent.EventName.GET_TOGGLE_CONFIG, jSONObject2);
                    }
                } catch (JSONException unused) {
                    findOnePartiallyOrCompletelyInvisibleChild.toDoubleRange();
                }
            }
        }

        private SharedPreferences getMax() {
            StringBuilder sb = new StringBuilder("mixpanel.viewcrawler.changes");
            sb.append(this.length);
            return clampApplyScroll.this.setMin.getSharedPreferences(sb.toString(), 0);
        }
    }

    class length implements EditorConnection.length {
        private length() {
        }

        /* synthetic */ length(clampApplyScroll clampapplyscroll, byte b) {
            this();
        }

        public final void setMin(JSONObject jSONObject) {
            Message obtainMessage = clampApplyScroll.this.equals.obtainMessage(2);
            obtainMessage.obj = jSONObject;
            clampApplyScroll.this.equals.sendMessage(obtainMessage);
        }

        public final void length(JSONObject jSONObject) {
            Message obtainMessage = clampApplyScroll.this.equals.obtainMessage(3);
            obtainMessage.obj = jSONObject;
            clampApplyScroll.this.equals.sendMessage(obtainMessage);
        }

        public final void setMax(JSONObject jSONObject) {
            Message obtainMessage = clampApplyScroll.this.equals.obtainMessage(10);
            obtainMessage.obj = jSONObject;
            clampApplyScroll.this.equals.sendMessage(obtainMessage);
        }

        public final void getMin(JSONObject jSONObject) {
            Message obtainMessage = clampApplyScroll.this.equals.obtainMessage(11);
            obtainMessage.obj = jSONObject;
            clampApplyScroll.this.equals.sendMessage(obtainMessage);
        }

        public final void getMax(JSONObject jSONObject) {
            Message obtainMessage = clampApplyScroll.this.equals.obtainMessage(6);
            obtainMessage.obj = jSONObject;
            clampApplyScroll.this.equals.sendMessage(obtainMessage);
        }

        public final void setMax() {
            clampApplyScroll.this.equals.sendMessage(clampApplyScroll.this.equals.obtainMessage(4));
        }

        public final void length() {
            clampApplyScroll.this.equals.sendMessage(clampApplyScroll.this.equals.obtainMessage(8));
        }
    }

    static class getMin {
        public final findOneVisibleChild<Integer, Integer> getMax;
        public final String getMin;
        public final JSONObject setMax;
        public final String setMin;

        public getMin(String str, String str2, JSONObject jSONObject, findOneVisibleChild<Integer, Integer> findonevisiblechild) {
            this.getMin = str;
            this.setMin = str2;
            this.setMax = jSONObject;
            this.getMax = findonevisiblechild;
        }

        public final int hashCode() {
            return this.getMin.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof getMin) || obj.hashCode() != hashCode()) {
                return false;
            }
            return true;
        }
    }

    static class setMin {
        public final JSONObject getMax;
        public final findOneVisibleChild<Integer, Integer> setMax;
        public final String setMin;

        public setMin(String str, JSONObject jSONObject, findOneVisibleChild<Integer, Integer> findonevisiblechild) {
            this.setMin = str;
            this.getMax = jSONObject;
            this.setMax = findonevisiblechild;
        }

        public final int hashCode() {
            return this.setMin.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof setMin) || obj.hashCode() != hashCode()) {
                return false;
            }
            return true;
        }
    }
}
