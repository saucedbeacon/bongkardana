package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import com.mixpanel.android.util.RemoteService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class setInitialPrefetchItemCount {
    private static final Map<Context, setInitialPrefetchItemCount> setMax = new HashMap();
    protected final shouldMeasureTwice getMin;
    protected final Context length;
    final isInside setMin = new isInside();

    private setInitialPrefetchItemCount(Context context) {
        this.length = context;
        this.getMin = shouldMeasureTwice.getMax(context);
        new onFocusSearchFailed().getMin();
    }

    public static setInitialPrefetchItemCount length(Context context) {
        setInitialPrefetchItemCount setinitialprefetchitemcount;
        synchronized (setMax) {
            Context applicationContext = context.getApplicationContext();
            if (!setMax.containsKey(applicationContext)) {
                setinitialprefetchitemcount = new setInitialPrefetchItemCount(applicationContext);
                setMax.put(applicationContext, setinitialprefetchitemcount);
            } else {
                setinitialprefetchitemcount = setMax.get(applicationContext);
            }
        }
        return setinitialprefetchitemcount;
    }

    public final void getMin(getMax getmax) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = getmax;
        this.setMin.setMin(obtain);
    }

    public final void length(getMin getmin) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = getmin.setMax;
        obtain.arg1 = getmin.length() ? 1 : 0;
        this.setMin.setMin(obtain);
    }

    protected static MPDbAdapter setMax(Context context) {
        return MPDbAdapter.setMax(context);
    }

    protected static RemoteService getMin() {
        return new onFocusSearchFailed();
    }

    public static class getMax extends setMin {
        public final String getMax;
        final JSONObject getMin;
        private final boolean setMin;

        public getMax(String str, JSONObject jSONObject, String str2) {
            this(str, jSONObject, str2, false, new JSONObject());
        }

        public getMax(String str, JSONObject jSONObject, String str2, boolean z, JSONObject jSONObject2) {
            super(str2, jSONObject);
            this.getMax = str;
            this.setMin = z;
            this.getMin = jSONObject2;
        }

        public final boolean getMin() {
            return this.setMin;
        }
    }

    static class IsOverlapping extends setMin {
        public IsOverlapping(JSONObject jSONObject, String str) {
            super(str, jSONObject);
        }

        public final String toString() {
            return this.length.toString();
        }

        public final boolean getMax() {
            return !this.length.has("$distinct_id");
        }
    }

    static class toIntRange extends setMax {
        final String length;

        public toIntRange(String str, String str2) {
            super(str2);
            this.length = str;
        }

        public final String toString() {
            return this.length;
        }
    }

    public static class getMin extends setMax {
        private final boolean getMin;

        public getMin(String str) {
            this(str, true);
        }

        protected getMin(String str, boolean z) {
            super(str);
            this.getMin = z;
        }

        public final boolean length() {
            return this.getMin;
        }
    }

    public static class setMin extends setMax {
        public final JSONObject length;

        public setMin(String str, JSONObject jSONObject) {
            super(str);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.get(next);
                    } catch (AssertionError unused) {
                        jSONObject.remove(next);
                        findOnePartiallyOrCompletelyInvisibleChild.values();
                    } catch (JSONException unused2) {
                    }
                }
            }
            this.length = jSONObject;
        }
    }

    static class toFloatRange extends setMax {
        Map<String, String> setMin;

        public toFloatRange(String str, Map<String, String> map) {
            super(str);
            this.setMin = map;
        }
    }

    static class setMax {
        final String setMax;

        public setMax(String str) {
            this.setMax = str;
        }
    }

    class isInside {
        findFirstCompletelyVisibleItemPosition getMax;
        Handler getMin;
        private long isInside = -1;
        final Object length = new Object();
        private long setMin = 0;
        private long toIntRange = 0;

        public isInside() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            this.getMin = new getMax(handlerThread.getLooper());
        }

        public final void setMin(Message message) {
            synchronized (this.length) {
                if (this.getMin == null) {
                    int i = message.what;
                    setInitialPrefetchItemCount.length();
                } else {
                    this.getMin.sendMessage(message);
                }
            }
        }

        class getMax extends Handler {
            private static int IsOverlapping = 1;
            private static int isInside;
            private static char[] toIntRange = {28, '2', '9', 'M', 'T'};
            private int equals;
            private final recycleViewsFromEnd getMax;
            private final long getMin;
            private long length;
            private MPDbAdapter setMax = null;
            private long toFloatRange;

            public getMax(Looper looper) {
                super(looper);
                isInside.this.getMax = findFirstCompletelyVisibleItemPosition.getMax(setInitialPrefetchItemCount.this.length);
                this.getMax = new recycleViewsFromEnd(setInitialPrefetchItemCount.this.length, setInitialPrefetchItemCount.this.getMin);
                this.getMin = (long) setInitialPrefetchItemCount.this.getMin.setMax;
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(8:120|121|122|123|124|125|126|127) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:124:0x029d */
            /* JADX WARNING: Removed duplicated region for block: B:104:0x0249 A[SYNTHETIC, Splitter:B:104:0x0249] */
            /* JADX WARNING: Removed duplicated region for block: B:114:0x026b A[Catch:{ RuntimeException -> 0x0286 }] */
            /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r11) {
                /*
                    r10 = this;
                    com.mixpanel.android.mpmetrics.MPDbAdapter r0 = r10.setMax
                    if (r0 != 0) goto L_0x0036
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.setInitialPrefetchItemCount r0 = o.setInitialPrefetchItemCount.this
                    android.content.Context r0 = r0.length
                    com.mixpanel.android.mpmetrics.MPDbAdapter r0 = o.setInitialPrefetchItemCount.setMax(r0)
                    r10.setMax = r0
                    long r1 = java.lang.System.currentTimeMillis()
                    o.setInitialPrefetchItemCount$isInside r3 = o.setInitialPrefetchItemCount.isInside.this
                    o.setInitialPrefetchItemCount r3 = o.setInitialPrefetchItemCount.this
                    o.shouldMeasureTwice r3 = r3.getMin
                    long r3 = r3.setMin
                    long r1 = r1 - r3
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r3 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.EVENTS
                    r0.getMax((long) r1, (com.mixpanel.android.mpmetrics.MPDbAdapter.Table) r3)
                    com.mixpanel.android.mpmetrics.MPDbAdapter r0 = r10.setMax
                    long r1 = java.lang.System.currentTimeMillis()
                    o.setInitialPrefetchItemCount$isInside r3 = o.setInitialPrefetchItemCount.isInside.this
                    o.setInitialPrefetchItemCount r3 = o.setInitialPrefetchItemCount.this
                    o.shouldMeasureTwice r3 = r3.getMin
                    long r3 = r3.setMin
                    long r1 = r1 - r3
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r3 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.PEOPLE
                    r0.getMax((long) r1, (com.mixpanel.android.mpmetrics.MPDbAdapter.Table) r3)
                L_0x0036:
                    r0 = -3
                    r1 = 0
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    if (r2 != 0) goto L_0x0067
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$IsOverlapping r11 = (o.setInitialPrefetchItemCount.IsOverlapping) r11     // Catch:{ RuntimeException -> 0x0286 }
                    boolean r0 = r11.getMax()     // Catch:{ RuntimeException -> 0x0286 }
                    if (r0 == 0) goto L_0x004c
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r0 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.ANONYMOUS_PEOPLE     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x004e
                L_0x004c:
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r0 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.PEOPLE     // Catch:{ RuntimeException -> 0x0286 }
                L_0x004e:
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r2 = r11.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r6 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    org.json.JSONObject r7 = r11.length     // Catch:{ RuntimeException -> 0x0286 }
                    int r0 = r6.setMin(r7, r2, r0, r4)     // Catch:{ RuntimeException -> 0x0286 }
                    boolean r11 = r11.getMax()     // Catch:{ RuntimeException -> 0x0286 }
                    if (r11 == 0) goto L_0x021f
                    r0 = 0
                    goto L_0x021f
                L_0x0067:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r6 = 3
                    if (r2 != r6) goto L_0x0084
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$length r11 = (o.setInitialPrefetchItemCount.length) r11     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r2 = r11.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r0 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    org.json.JSONObject r11 = r11.length     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r6 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.GROUPS     // Catch:{ RuntimeException -> 0x0286 }
                    int r0 = r0.setMin(r11, r2, r6, r4)     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021f
                L_0x0084:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    if (r2 != r5) goto L_0x0104
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$getMax r11 = (o.setInitialPrefetchItemCount.getMax) r11     // Catch:{ RuntimeException -> 0x0286 }
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
                    r2.<init>()     // Catch:{ JSONException -> 0x00fe }
                    org.json.JSONObject r4 = r11.length     // Catch:{ JSONException -> 0x00fe }
                    org.json.JSONObject r6 = r10.setMax()     // Catch:{ JSONException -> 0x00fe }
                    java.lang.String r7 = "token"
                    java.lang.String r8 = r11.setMax     // Catch:{ JSONException -> 0x00fe }
                    r6.put(r7, r8)     // Catch:{ JSONException -> 0x00fe }
                    if (r4 == 0) goto L_0x00b9
                    java.util.Iterator r7 = r4.keys()     // Catch:{ JSONException -> 0x00fe }
                L_0x00a5:
                    boolean r8 = r7.hasNext()     // Catch:{ JSONException -> 0x00fe }
                    if (r8 == 0) goto L_0x00b9
                    java.lang.Object r8 = r7.next()     // Catch:{ JSONException -> 0x00fe }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x00fe }
                    java.lang.Object r9 = r4.get(r8)     // Catch:{ JSONException -> 0x00fe }
                    r6.put(r8, r9)     // Catch:{ JSONException -> 0x00fe }
                    goto L_0x00a5
                L_0x00b9:
                    java.lang.String r4 = "event"
                    java.lang.String r7 = r11.getMax     // Catch:{ JSONException -> 0x00fe }
                    r2.put(r4, r7)     // Catch:{ JSONException -> 0x00fe }
                    java.lang.String r4 = "properties"
                    r2.put(r4, r6)     // Catch:{ JSONException -> 0x00fe }
                    java.lang.String r4 = "$mp_metadata"
                    org.json.JSONObject r6 = r11.getMin     // Catch:{ JSONException -> 0x00fe }
                    r2.put(r4, r6)     // Catch:{ JSONException -> 0x00fe }
                    o.setInitialPrefetchItemCount.length()     // Catch:{ JSONException -> 0x00fe }
                    o.setInitialPrefetchItemCount.length()     // Catch:{ JSONException -> 0x00fe }
                    java.lang.String r4 = r11.setMax     // Catch:{ JSONException -> 0x00fe }
                    o.recycleViewsFromEnd r6 = r10.getMax     // Catch:{ JSONException -> 0x00fc }
                    java.util.Map<java.lang.String, o.recycleChildren> r6 = r6.length     // Catch:{ JSONException -> 0x00fc }
                    java.lang.Object r6 = r6.get(r4)     // Catch:{ JSONException -> 0x00fc }
                    o.recycleChildren r6 = (o.recycleChildren) r6     // Catch:{ JSONException -> 0x00fc }
                    if (r6 == 0) goto L_0x00ed
                    boolean r7 = r11.getMin()     // Catch:{ JSONException -> 0x00fc }
                    if (r7 == 0) goto L_0x00ed
                    boolean r6 = r6.getMax()     // Catch:{ JSONException -> 0x00fc }
                    if (r6 != 0) goto L_0x00ed
                    return
                L_0x00ed:
                    com.mixpanel.android.mpmetrics.MPDbAdapter r6 = r10.setMax     // Catch:{ JSONException -> 0x00fc }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r7 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.EVENTS     // Catch:{ JSONException -> 0x00fc }
                    boolean r11 = r11.getMin()     // Catch:{ JSONException -> 0x00fc }
                    int r0 = r6.setMin(r2, r4, r7, r11)     // Catch:{ JSONException -> 0x00fc }
                    r2 = r4
                    goto L_0x021f
                L_0x00fc:
                    r2 = r4
                    goto L_0x00ff
                L_0x00fe:
                    r2 = r1
                L_0x00ff:
                    o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021f
                L_0x0104:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r6 = 4
                    if (r2 != r6) goto L_0x0119
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$toIntRange r11 = (o.setInitialPrefetchItemCount.toIntRange) r11     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r0 = r11.length     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r2 = r11.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    int r0 = r11.length((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021f
                L_0x0119:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r6 = 7
                    if (r2 != r6) goto L_0x012d
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$setMax r11 = (o.setInitialPrefetchItemCount.setMax) r11     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r2 = r11.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r4 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.ANONYMOUS_PEOPLE     // Catch:{ RuntimeException -> 0x0286 }
                    r11.length((com.mixpanel.android.mpmetrics.MPDbAdapter.Table) r4, (java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021f
                L_0x012d:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r6 = 8
                    if (r2 != r6) goto L_0x0145
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$toFloatRange r11 = (o.setInitialPrefetchItemCount.toFloatRange) r11     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r2 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    java.util.Map<java.lang.String, java.lang.String> r4 = r11.setMin     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r11 = r11.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    r2.getMax((java.util.Map<java.lang.String, java.lang.String>) r4, (java.lang.String) r11)     // Catch:{ RuntimeException -> 0x0286 }
                    o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021e
                L_0x0145:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    if (r2 != r3) goto L_0x0187
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$isInside r2 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount.isInside.getMax(r2)     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.Object r2 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r2 = (java.lang.String) r2     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11.arg1     // Catch:{ RuntimeException -> 0x0286 }
                    if (r11 != r5) goto L_0x015a
                    r4 = 1
                L_0x015a:
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    r10.getMin(r11, r2)     // Catch:{ RuntimeException -> 0x0286 }
                    if (r4 == 0) goto L_0x021f
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0286 }
                    long r8 = r10.length     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r11 < 0) goto L_0x021f
                    o.recycleViewsFromEnd r11 = r10.getMax     // Catch:{ ServiceUnavailableException -> 0x0176 }
                    com.mixpanel.android.util.RemoteService r4 = o.setInitialPrefetchItemCount.getMin()     // Catch:{ ServiceUnavailableException -> 0x0176 }
                    r11.length(r2, r4)     // Catch:{ ServiceUnavailableException -> 0x0176 }
                    goto L_0x021f
                L_0x0176:
                    r11 = move-exception
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11.getRetryAfter()     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11 * 1000
                    long r8 = (long) r11     // Catch:{ RuntimeException -> 0x0286 }
                    long r6 = r6 + r8
                    r10.length = r6     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021f
                L_0x0187:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r4 = 12
                    if (r2 != r4) goto L_0x01c3
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.recycleChildren r11 = (o.recycleChildren) r11     // Catch:{ RuntimeException -> 0x0286 }
                    o.recycleViewsFromEnd r2 = r10.getMax     // Catch:{ RuntimeException -> 0x0286 }
                    java.util.Map<java.lang.String, o.recycleChildren> r2 = r2.length     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r4 = r11.getMin     // Catch:{ RuntimeException -> 0x0286 }
                    r2.put(r4, r11)     // Catch:{ RuntimeException -> 0x0286 }
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0286 }
                    long r8 = r10.length     // Catch:{ RuntimeException -> 0x0286 }
                    int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r2 < 0) goto L_0x021e
                    o.recycleViewsFromEnd r2 = r10.getMax     // Catch:{ ServiceUnavailableException -> 0x01b3 }
                    java.lang.String r11 = r11.getMin     // Catch:{ ServiceUnavailableException -> 0x01b3 }
                    com.mixpanel.android.util.RemoteService r4 = o.setInitialPrefetchItemCount.getMin()     // Catch:{ ServiceUnavailableException -> 0x01b3 }
                    r2.length(r11, r4)     // Catch:{ ServiceUnavailableException -> 0x01b3 }
                    goto L_0x021e
                L_0x01b3:
                    r11 = move-exception
                    long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11.getRetryAfter()     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11 * 1000
                    long r8 = (long) r11     // Catch:{ RuntimeException -> 0x0286 }
                    long r6 = r6 + r8
                    r10.length = r6     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021e
                L_0x01c3:
                    int r2 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r4 = 6
                    if (r2 != r4) goto L_0x01eb
                    java.lang.Object r11 = r11.obj     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$setMax r11 = (o.setInitialPrefetchItemCount.setMax) r11     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.String r2 = r11.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r4 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.EVENTS     // Catch:{ RuntimeException -> 0x0286 }
                    r11.length((com.mixpanel.android.mpmetrics.MPDbAdapter.Table) r4, (java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r4 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.PEOPLE     // Catch:{ RuntimeException -> 0x0286 }
                    r11.length((com.mixpanel.android.mpmetrics.MPDbAdapter.Table) r4, (java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r4 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.GROUPS     // Catch:{ RuntimeException -> 0x0286 }
                    r11.length((com.mixpanel.android.mpmetrics.MPDbAdapter.Table) r4, (java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$Table r4 = com.mixpanel.android.mpmetrics.MPDbAdapter.Table.ANONYMOUS_PEOPLE     // Catch:{ RuntimeException -> 0x0286 }
                    r11.length((com.mixpanel.android.mpmetrics.MPDbAdapter.Table) r4, (java.lang.String) r2)     // Catch:{ RuntimeException -> 0x0286 }
                    goto L_0x021f
                L_0x01eb:
                    int r11 = r11.what     // Catch:{ RuntimeException -> 0x0286 }
                    r2 = 5
                    if (r11 != r2) goto L_0x021b
                    java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch:{ RuntimeException -> 0x0286 }
                    r11.getId()     // Catch:{ RuntimeException -> 0x0286 }
                    o.findOnePartiallyOrCompletelyInvisibleChild.isInside()     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$isInside r11 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ RuntimeException -> 0x0286 }
                    java.lang.Object r11 = r11.length     // Catch:{ RuntimeException -> 0x0286 }
                    monitor-enter(r11)     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r2 = r10.setMax     // Catch:{ all -> 0x0218 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter$length r2 = r2.length     // Catch:{ all -> 0x0218 }
                    r2.close()     // Catch:{ all -> 0x0218 }
                    java.io.File r2 = r2.length     // Catch:{ all -> 0x0218 }
                    r2.delete()     // Catch:{ all -> 0x0218 }
                    o.setInitialPrefetchItemCount$isInside r2 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ all -> 0x0218 }
                    r2.getMin = r1     // Catch:{ all -> 0x0218 }
                    android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0218 }
                    r2.quit()     // Catch:{ all -> 0x0218 }
                    monitor-exit(r11)     // Catch:{ all -> 0x0218 }
                    goto L_0x021e
                L_0x0218:
                    r0 = move-exception
                    monitor-exit(r11)     // Catch:{ RuntimeException -> 0x0286 }
                    throw r0     // Catch:{ RuntimeException -> 0x0286 }
                L_0x021b:
                    o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ RuntimeException -> 0x0286 }
                L_0x021e:
                    r2 = r1
                L_0x021f:
                    o.setInitialPrefetchItemCount$isInside r11 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount r11 = o.setInitialPrefetchItemCount.this     // Catch:{ RuntimeException -> 0x0286 }
                    o.shouldMeasureTwice r11 = r11.getMin     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11.getMax     // Catch:{ RuntimeException -> 0x0286 }
                    if (r0 >= r11) goto L_0x022c
                    r11 = -2
                    if (r0 != r11) goto L_0x0263
                L_0x022c:
                    int r11 = r10.equals     // Catch:{ RuntimeException -> 0x0286 }
                    if (r11 > 0) goto L_0x0263
                    if (r2 == 0) goto L_0x0263
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount$isInside r11 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ RuntimeException -> 0x0286 }
                    o.setInitialPrefetchItemCount.isInside.getMax(r11)     // Catch:{ RuntimeException -> 0x0286 }
                    com.mixpanel.android.mpmetrics.MPDbAdapter r11 = r10.setMax     // Catch:{ RuntimeException -> 0x0286 }
                    r10.getMin(r11, r2)     // Catch:{ RuntimeException -> 0x0286 }
                    long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0286 }
                    long r5 = r10.length     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r11 < 0) goto L_0x0285
                    o.recycleViewsFromEnd r11 = r10.getMax     // Catch:{ ServiceUnavailableException -> 0x0253 }
                    com.mixpanel.android.util.RemoteService r0 = o.setInitialPrefetchItemCount.getMin()     // Catch:{ ServiceUnavailableException -> 0x0253 }
                    r11.length(r2, r0)     // Catch:{ ServiceUnavailableException -> 0x0253 }
                    return
                L_0x0253:
                    r11 = move-exception
                    long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11.getRetryAfter()     // Catch:{ RuntimeException -> 0x0286 }
                    int r11 = r11 * 1000
                    long r4 = (long) r11     // Catch:{ RuntimeException -> 0x0286 }
                    long r2 = r2 + r4
                    r10.length = r2     // Catch:{ RuntimeException -> 0x0286 }
                    return
                L_0x0263:
                    if (r0 <= 0) goto L_0x0285
                    boolean r11 = r10.hasMessages(r3, r2)     // Catch:{ RuntimeException -> 0x0286 }
                    if (r11 != 0) goto L_0x0285
                    o.setInitialPrefetchItemCount.length()     // Catch:{ RuntimeException -> 0x0286 }
                    long r6 = r10.getMin     // Catch:{ RuntimeException -> 0x0286 }
                    r8 = 0
                    int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r11 < 0) goto L_0x0285
                    android.os.Message r11 = android.os.Message.obtain()     // Catch:{ RuntimeException -> 0x0286 }
                    r11.what = r3     // Catch:{ RuntimeException -> 0x0286 }
                    r11.obj = r2     // Catch:{ RuntimeException -> 0x0286 }
                    r11.arg1 = r5     // Catch:{ RuntimeException -> 0x0286 }
                    long r2 = r10.getMin     // Catch:{ RuntimeException -> 0x0286 }
                    r10.sendMessageDelayed(r11, r2)     // Catch:{ RuntimeException -> 0x0286 }
                L_0x0285:
                    return
                L_0x0286:
                    o.findOnePartiallyOrCompletelyInvisibleChild.values()
                    o.setInitialPrefetchItemCount$isInside r11 = o.setInitialPrefetchItemCount.isInside.this
                    java.lang.Object r11 = r11.length
                    monitor-enter(r11)
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ all -> 0x02a2 }
                    r0.getMin = r1     // Catch:{ all -> 0x02a2 }
                    android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x029d }
                    r0.quit()     // Catch:{ Exception -> 0x029d }
                    o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ Exception -> 0x029d }
                    goto L_0x02a0
                L_0x029d:
                    o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x02a2 }
                L_0x02a0:
                    monitor-exit(r11)     // Catch:{ all -> 0x02a2 }
                    return
                L_0x02a2:
                    r0 = move-exception
                    monitor-exit(r11)
                    goto L_0x02a6
                L_0x02a5:
                    throw r0
                L_0x02a6:
                    goto L_0x02a5
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setInitialPrefetchItemCount.isInside.getMax.handleMessage(android.os.Message):void");
            }

            private void getMin(MPDbAdapter mPDbAdapter, String str) {
                int i;
                boolean z = false;
                if (!(str != null)) {
                    try {
                        int i2 = isInside + 125;
                        IsOverlapping = i2 % 128;
                        int i3 = i2 % 2;
                        i = 0;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    try {
                        i = str.length();
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(-2105591243, oncanceled);
                    onCancelLoad.getMin(-2105591243, oncanceled);
                }
                if (!setInitialPrefetchItemCount.getMin().setMin(setInitialPrefetchItemCount.this.length, setInitialPrefetchItemCount.this.getMin.FastBitmap$CoordinateSystem())) {
                    z = true;
                }
                if (!z) {
                    getMin(mPDbAdapter, str, MPDbAdapter.Table.EVENTS, setInitialPrefetchItemCount.this.getMin.equals);
                    getMin(mPDbAdapter, str, MPDbAdapter.Table.PEOPLE, setInitialPrefetchItemCount.this.getMin.toFloatRange);
                    getMin(mPDbAdapter, str, MPDbAdapter.Table.GROUPS, setInitialPrefetchItemCount.this.getMin.IsOverlapping);
                    return;
                }
                int i4 = IsOverlapping + 25;
                isInside = i4 % 128;
                int i5 = i4 % 2;
                setInitialPrefetchItemCount.length();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
                r4 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
                throw new java.lang.RuntimeException("UTF not supported on this platform?", r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
                o.setInitialPrefetchItemCount.getMax();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
                o.setInitialPrefetchItemCount.getMax();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
                r4 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
                o.setInitialPrefetchItemCount.getMax();
                r11.toFloatRange = (long) (r4.getRetryAfter() * 1000);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
                r4 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e1, code lost:
                r4 = true;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Removed duplicated region for block: B:43:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:15:0x0051] */
            /* JADX WARNING: Removed duplicated region for block: B:45:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:15:0x0051] */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd A[ExcHandler: ServiceUnavailableException (r4v15 'e' com.mixpanel.android.util.RemoteService$ServiceUnavailableException A[CUSTOM_DECLARE]), Splitter:B:15:0x0051] */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
            /* JADX WARNING: Removed duplicated region for block: B:57:0x00e9  */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0125  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x00ec A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void getMin(com.mixpanel.android.mpmetrics.MPDbAdapter r12, java.lang.String r13, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r14, java.lang.String r15) {
                /*
                    r11 = this;
                    com.mixpanel.android.util.RemoteService r0 = o.setInitialPrefetchItemCount.getMin()
                    o.recycleViewsFromEnd r1 = r11.getMax
                    java.util.Map<java.lang.String, o.recycleChildren> r1 = r1.length
                    java.lang.Object r1 = r1.get(r13)
                    o.recycleChildren r1 = (o.recycleChildren) r1
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L_0x0019
                    java.lang.Boolean r1 = r1.length
                    if (r1 != 0) goto L_0x0017
                    goto L_0x0019
                L_0x0017:
                    r1 = 1
                    goto L_0x001a
                L_0x0019:
                    r1 = 0
                L_0x001a:
                    java.lang.String[] r4 = r12.length(r14, r13, r1)
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                    r6 = 2
                    if (r4 == 0) goto L_0x002b
                    r5 = r4[r6]
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                L_0x002b:
                    if (r4 == 0) goto L_0x014b
                    int r7 = r5.intValue()
                    if (r7 <= 0) goto L_0x014b
                    r7 = r4[r3]
                    r4 = r4[r2]
                    java.lang.String r4 = o.findLastCompletelyVisibleItemPosition.setMax(r4)
                    java.util.HashMap r8 = new java.util.HashMap
                    r8.<init>()
                    java.lang.String r9 = "data"
                    r8.put(r9, r4)
                    boolean r4 = o.shouldMeasureTwice.getMin
                    if (r4 == 0) goto L_0x0051
                    java.lang.String r4 = "verbose"
                    java.lang.String r9 = "1"
                    r8.put(r4, r9)
                L_0x0051:
                    o.setInitialPrefetchItemCount$isInside r4 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    o.setInitialPrefetchItemCount r4 = o.setInitialPrefetchItemCount.this     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    o.shouldMeasureTwice r4 = r4.getMin     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    javax.net.ssl.SSLSocketFactory r4 = r4.values()     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    byte[] r4 = r0.getMax(r15, r8, r4)     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    if (r4 != 0) goto L_0x0073
                    o.setInitialPrefetchItemCount.length()     // Catch:{ OutOfMemoryError -> 0x0070, MalformedURLException -> 0x006e, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    int r4 = isInside
                    int r4 = r4 + 105
                    int r8 = r4 % 128
                    IsOverlapping = r8
                    int r4 = r4 % r6
                    goto L_0x00da
                L_0x006e:
                    r4 = 0
                    goto L_0x00dd
                L_0x0070:
                    r4 = 0
                    goto L_0x00e2
                L_0x0073:
                    r4 = 4
                    int[] r8 = new int[r4]     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r8[r3] = r3     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r9 = 5
                    r8[r2] = r9     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r8[r6] = r3     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r10 = 3
                    r8[r10] = r9     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    byte[] r9 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r9[r3] = r3     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r9[r2] = r2     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r9[r6] = r2     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r9[r10] = r3     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r9[r4] = r2     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    boolean r4 = android.view.KeyEvent.isModifierKey(r3)     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r4 = r4 ^ r2
                    java.lang.String r4 = getMin(r8, r9, r4)     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    r4.intern()     // Catch:{ UnsupportedEncodingException -> 0x00bc }
                    int r4 = r11.equals     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    r8 = 21
                    if (r4 <= 0) goto L_0x00a1
                    r4 = 21
                    goto L_0x00a3
                L_0x00a1:
                    r4 = 62
                L_0x00a3:
                    if (r4 == r8) goto L_0x00a6
                    goto L_0x00b4
                L_0x00a6:
                    int r4 = IsOverlapping
                    int r4 = r4 + 53
                    int r8 = r4 % 128
                    isInside = r8
                    int r4 = r4 % r6
                    r11.equals = r3     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    r11.removeMessages(r6, r13)     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                L_0x00b4:
                    o.setInitialPrefetchItemCount.length()     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    o.setInitialPrefetchItemCount.length()     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    r4 = 1
                    goto L_0x00e5
                L_0x00bc:
                    r4 = move-exception
                    java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    java.lang.String r9 = "UTF not supported on this platform?"
                    r8.<init>(r9, r4)     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                    throw r8     // Catch:{ OutOfMemoryError -> 0x00e1, MalformedURLException -> 0x00dc, ServiceUnavailableException -> 0x00cd, SocketTimeoutException -> 0x00c9, IOException -> 0x00c5 }
                L_0x00c5:
                    o.setInitialPrefetchItemCount.getMax()
                    goto L_0x00da
                L_0x00c9:
                    o.setInitialPrefetchItemCount.getMax()
                    goto L_0x00da
                L_0x00cd:
                    r4 = move-exception
                    o.setInitialPrefetchItemCount.getMax()
                    int r4 = r4.getRetryAfter()
                    int r4 = r4 * 1000
                    long r8 = (long) r4
                    r11.toFloatRange = r8
                L_0x00da:
                    r4 = 0
                    goto L_0x00e5
                L_0x00dc:
                    r4 = 1
                L_0x00dd:
                    o.findOnePartiallyOrCompletelyInvisibleChild.values()
                    goto L_0x00e5
                L_0x00e1:
                    r4 = 1
                L_0x00e2:
                    o.findOnePartiallyOrCompletelyInvisibleChild.values()
                L_0x00e5:
                    if (r4 == 0) goto L_0x00e9
                    r4 = 1
                    goto L_0x00ea
                L_0x00e9:
                    r4 = 0
                L_0x00ea:
                    if (r4 == r2) goto L_0x0125
                    r11.removeMessages(r6, r13)
                    r14 = 4611686018427387904(0x4000000000000000, double:2.0)
                    int r12 = r11.equals
                    double r0 = (double) r12
                    double r14 = java.lang.Math.pow(r14, r0)
                    long r14 = (long) r14
                    r0 = 60000(0xea60, double:2.9644E-319)
                    long r14 = r14 * r0
                    long r0 = r11.toFloatRange
                    long r14 = java.lang.Math.max(r14, r0)
                    r11.toFloatRange = r14
                    r0 = 600000(0x927c0, double:2.964394E-318)
                    long r14 = java.lang.Math.min(r14, r0)
                    r11.toFloatRange = r14
                    android.os.Message r12 = android.os.Message.obtain()
                    r12.what = r6
                    r12.obj = r13
                    long r13 = r11.toFloatRange
                    r11.sendMessageDelayed(r12, r13)
                    int r12 = r11.equals
                    int r12 = r12 + r2
                    r11.equals = r12
                    o.setInitialPrefetchItemCount.length()
                    return
                L_0x0125:
                    o.setInitialPrefetchItemCount.length()
                    r12.getMax(r7, r14, r13, r1)
                    java.lang.String[] r4 = r12.length(r14, r13, r1)
                    r7 = 96
                    if (r4 == 0) goto L_0x0136
                    r8 = 47
                    goto L_0x0138
                L_0x0136:
                    r8 = 96
                L_0x0138:
                    if (r8 == r7) goto L_0x0140
                    r5 = r4[r6]
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                L_0x0140:
                    int r7 = IsOverlapping
                    int r7 = r7 + 65
                    int r8 = r7 % 128
                    isInside = r8
                    int r7 = r7 % r6
                    goto L_0x002b
                L_0x014b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setInitialPrefetchItemCount.isInside.getMax.getMin(com.mixpanel.android.mpmetrics.MPDbAdapter, java.lang.String, com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String):void");
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Boolean} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Boolean} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.Boolean} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: java.lang.String} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v50, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Code restructure failed: missing block: B:102:0x01aa, code lost:
                if (r0 != false) goto L_0x01bd;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bb, code lost:
                if ((r0.isConnected() ? (char) 4 : 20) != 20) goto L_0x01bd;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private org.json.JSONObject setMax() throws org.json.JSONException {
                /*
                    r10 = this;
                    java.lang.String r0 = "$google_play_services"
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    java.lang.String r2 = "mp_lib"
                    java.lang.String r3 = "android"
                    r1.put(r2, r3)
                    java.lang.String r2 = "$lib_version"
                    java.lang.String r3 = "5.8.4"
                    r1.put(r2, r3)
                    java.lang.String r2 = "$os"
                    java.lang.String r3 = "Android"
                    r1.put(r2, r3)
                    java.lang.String r2 = android.os.Build.VERSION.RELEASE
                    r3 = 1
                    r4 = 0
                    if (r2 != 0) goto L_0x0024
                    r2 = 1
                    goto L_0x0025
                L_0x0024:
                    r2 = 0
                L_0x0025:
                    java.lang.String r5 = "UNKNOWN"
                    if (r2 == 0) goto L_0x002b
                    r2 = r5
                    goto L_0x002d
                L_0x002b:
                    java.lang.String r2 = android.os.Build.VERSION.RELEASE
                L_0x002d:
                    java.lang.String r6 = "$os_version"
                    r1.put(r6, r2)
                    java.lang.String r2 = android.os.Build.MANUFACTURER
                    r6 = 98
                    if (r2 != 0) goto L_0x003b
                    r2 = 98
                    goto L_0x003d
                L_0x003b:
                    r2 = 76
                L_0x003d:
                    if (r2 == r6) goto L_0x0042
                    java.lang.String r2 = android.os.Build.MANUFACTURER
                    goto L_0x0043
                L_0x0042:
                    r2 = r5
                L_0x0043:
                    java.lang.String r6 = "$manufacturer"
                    r1.put(r6, r2)
                    java.lang.String r2 = android.os.Build.BRAND
                    if (r2 != 0) goto L_0x004e
                    r2 = 0
                    goto L_0x004f
                L_0x004e:
                    r2 = 1
                L_0x004f:
                    if (r2 == 0) goto L_0x0054
                    java.lang.String r2 = android.os.Build.BRAND
                    goto L_0x0055
                L_0x0054:
                    r2 = r5
                L_0x0055:
                    java.lang.String r6 = "$brand"
                    r1.put(r6, r2)
                    java.lang.String r2 = "$model"
                    java.lang.String r6 = android.os.Build.MODEL
                    r7 = 2
                    if (r6 != 0) goto L_0x0072
                    int r6 = isInside
                    int r6 = r6 + 77
                    int r8 = r6 % 128
                    IsOverlapping = r8
                    int r6 = r6 % r7
                    if (r6 != 0) goto L_0x0074
                    r6 = 20
                    int r6 = r6 / r4
                    goto L_0x0074
                L_0x0070:
                    r0 = move-exception
                    throw r0
                L_0x0072:
                    java.lang.String r5 = android.os.Build.MODEL
                L_0x0074:
                    r1.put(r2, r5)     // Catch:{ Exception -> 0x02e2 }
                    com.google.android.gms.common.GoogleApiAvailability r2 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ RuntimeException -> 0x00b1 }
                    o.setInitialPrefetchItemCount$isInside r5 = o.setInitialPrefetchItemCount.isInside.this     // Catch:{ RuntimeException -> 0x00b1 }
                    o.setInitialPrefetchItemCount r5 = o.setInitialPrefetchItemCount.this     // Catch:{ RuntimeException -> 0x00b1 }
                    android.content.Context r5 = r5.length     // Catch:{ RuntimeException -> 0x00b1 }
                    int r2 = r2.isGooglePlayServicesAvailable(r5)     // Catch:{ RuntimeException -> 0x00b1 }
                    if (r2 == 0) goto L_0x00ab
                    if (r2 == r3) goto L_0x00a5
                    if (r2 == r7) goto L_0x009f
                    r5 = 3
                    if (r2 == r5) goto L_0x0099
                    r5 = 9
                    if (r2 == r5) goto L_0x0093
                    goto L_0x00bc
                L_0x0093:
                    java.lang.String r2 = "invalid"
                    r1.put(r0, r2)     // Catch:{  }
                    goto L_0x00bc
                L_0x0099:
                    java.lang.String r2 = "disabled"
                    r1.put(r0, r2)     // Catch:{  }
                    goto L_0x00bc
                L_0x009f:
                    java.lang.String r2 = "out of date"
                    r1.put(r0, r2)     // Catch:{  }
                    goto L_0x00bc
                L_0x00a5:
                    java.lang.String r2 = "missing"
                    r1.put(r0, r2)     // Catch:{  }
                    goto L_0x00bc
                L_0x00ab:
                    java.lang.String r2 = "available"
                    r1.put(r0, r2)     // Catch:{  }
                    goto L_0x00bc
                L_0x00b1:
                    java.lang.String r2 = "not configured"
                    r1.put(r0, r2)     // Catch:{ NoClassDefFoundError -> 0x00b7 }
                    goto L_0x00bc
                L_0x00b7:
                    java.lang.String r2 = "not included"
                    r1.put(r0, r2)
                L_0x00bc:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    android.util.DisplayMetrics r0 = r0.setMin
                    int r2 = r0.densityDpi
                    java.lang.String r5 = "$screen_dpi"
                    r1.put(r5, r2)
                    int r2 = r0.heightPixels
                    java.lang.String r5 = "$screen_height"
                    r1.put(r5, r2)
                    int r0 = r0.widthPixels
                    java.lang.String r2 = "$screen_width"
                    r1.put(r2, r0)
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    java.lang.String r0 = r0.setMax
                    r2 = 94
                    if (r0 == 0) goto L_0x00e4
                    r5 = 91
                    goto L_0x00e6
                L_0x00e4:
                    r5 = 94
                L_0x00e6:
                    if (r5 == r2) goto L_0x00f2
                    java.lang.String r2 = "$app_version"
                    r1.put(r2, r0)
                    java.lang.String r2 = "$app_version_string"
                    r1.put(r2, r0)
                L_0x00f2:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    java.lang.Integer r0 = r0.length
                    if (r0 == 0) goto L_0x0104
                    java.lang.String r2 = "$app_release"
                    r1.put(r2, r0)
                    java.lang.String r2 = "$app_build_number"
                    r1.put(r2, r0)
                L_0x0104:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    boolean r0 = r0.getMax()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    if (r0 == 0) goto L_0x011f
                    java.lang.String r2 = "$has_nfc"
                    boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x011c }
                    r1.put(r2, r0)     // Catch:{ Exception -> 0x011c }
                    goto L_0x011f
                L_0x011c:
                    r0 = move-exception
                    goto L_0x0267
                L_0x011f:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    boolean r0 = r0.getMin()
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    if (r0 == 0) goto L_0x0136
                    boolean r0 = r0.booleanValue()
                    java.lang.String r2 = "$has_telephone"
                    r1.put(r2, r0)
                L_0x0136:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    android.content.Context r0 = r0.getMin
                    java.lang.String r2 = "phone"
                    java.lang.Object r0 = r0.getSystemService(r2)
                    android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
                    r5 = 0
                    if (r0 == 0) goto L_0x015c
                    int r6 = IsOverlapping
                    int r6 = r6 + 35
                    int r8 = r6 % 128
                    isInside = r8
                    int r6 = r6 % r7
                    java.lang.String r0 = r0.getNetworkOperatorName()
                    if (r6 == 0) goto L_0x015d
                    r6 = 51
                    int r6 = r6 / r4
                    goto L_0x015d
                L_0x015a:
                    r0 = move-exception
                    throw r0
                L_0x015c:
                    r0 = r5
                L_0x015d:
                    if (r0 == 0) goto L_0x016e
                    java.lang.String r6 = r0.trim()
                    boolean r6 = r6.isEmpty()
                    if (r6 != 0) goto L_0x016e
                    java.lang.String r6 = "$carrier"
                    r1.put(r6, r0)
                L_0x016e:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    android.content.Context r6 = r0.getMin
                    java.lang.String r8 = "android.permission.ACCESS_NETWORK_STATE"
                    int r6 = r6.checkCallingOrSelfPermission(r8)
                    if (r6 != 0) goto L_0x01c5
                    android.content.Context r0 = r0.getMin
                    java.lang.String r6 = "connectivity"
                    java.lang.Object r0 = r0.getSystemService(r6)
                    android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
                    android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
                    if (r0 == 0) goto L_0x01bf
                    int r6 = r0.getType()
                    if (r6 != r3) goto L_0x0194
                    r6 = 0
                    goto L_0x0195
                L_0x0194:
                    r6 = 1
                L_0x0195:
                    if (r6 == 0) goto L_0x0198
                    goto L_0x01bf
                L_0x0198:
                    int r6 = isInside
                    int r6 = r6 + 99
                    int r8 = r6 % 128
                    IsOverlapping = r8
                    int r6 = r6 % r7
                    if (r6 != 0) goto L_0x01af
                    boolean r0 = r0.isConnected()
                    super.hashCode()     // Catch:{ all -> 0x01ad }
                    if (r0 == 0) goto L_0x01bf
                    goto L_0x01bd
                L_0x01ad:
                    r0 = move-exception
                    throw r0
                L_0x01af:
                    boolean r0 = r0.isConnected()
                    r6 = 20
                    if (r0 == 0) goto L_0x01b9
                    r0 = 4
                    goto L_0x01bb
                L_0x01b9:
                    r0 = 20
                L_0x01bb:
                    if (r0 == r6) goto L_0x01bf
                L_0x01bd:
                    r0 = 1
                    goto L_0x01c0
                L_0x01bf:
                    r0 = 0
                L_0x01c0:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    goto L_0x01c6
                L_0x01c5:
                    r0 = r5
                L_0x01c6:
                    if (r0 == 0) goto L_0x01e7
                    int r6 = IsOverlapping
                    int r6 = r6 + 7
                    int r8 = r6 % 128
                    isInside = r8
                    int r6 = r6 % r7
                    java.lang.String r8 = "$wifi"
                    if (r6 == 0) goto L_0x01e0
                    boolean r0 = r0.booleanValue()
                    r1.put(r8, r0)
                    int r0 = r5.length     // Catch:{ all -> 0x01de }
                    goto L_0x01e7
                L_0x01de:
                    r0 = move-exception
                    throw r0
                L_0x01e0:
                    boolean r0 = r0.booleanValue()
                    r1.put(r8, r0)
                L_0x01e7:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    o.setInitialPrefetchItemCount$isInside r6 = o.setInitialPrefetchItemCount.isInside.this
                    o.setInitialPrefetchItemCount r6 = o.setInitialPrefetchItemCount.this
                    android.content.Context r6 = r6.length
                    android.content.pm.PackageManager r8 = r6.getPackageManager()
                    java.lang.String r6 = r6.getPackageName()
                    if (r8 == 0) goto L_0x01fd
                    r9 = 0
                    goto L_0x01fe
                L_0x01fd:
                    r9 = 1
                L_0x01fe:
                    if (r9 == 0) goto L_0x0202
                    goto L_0x027f
                L_0x0202:
                    if (r6 != 0) goto L_0x0206
                    goto L_0x027f
                L_0x0206:
                    java.lang.String r9 = "android.permission.READ_PHONE_STATE"
                    int r6 = r8.checkPermission(r9, r6)
                    if (r6 == 0) goto L_0x020f
                    goto L_0x0210
                L_0x020f:
                    r3 = 0
                L_0x0210:
                    if (r3 == 0) goto L_0x0220
                    int r0 = isInside
                    int r0 = r0 + 33
                    int r2 = r0 % 128
                    IsOverlapping = r2
                    int r0 = r0 % r7
                    o.findOnePartiallyOrCompletelyInvisibleChild.isInside()
                    goto L_0x027f
                L_0x0220:
                    android.content.Context r0 = r0.getMin
                    java.lang.Object r0 = r0.getSystemService(r2)
                    android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
                    if (r0 == 0) goto L_0x027f
                    int r2 = IsOverlapping
                    int r2 = r2 + 109
                    int r3 = r2 % 128
                    isInside = r3
                    int r2 = r2 % r7
                    if (r2 == 0) goto L_0x023c
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r3 = 13
                    if (r2 < r3) goto L_0x0247
                    goto L_0x0242
                L_0x023c:
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r3 = 24
                    if (r2 < r3) goto L_0x0247
                L_0x0242:
                    int r0 = r0.getDataNetworkType()
                    goto L_0x024b
                L_0x0247:
                    int r0 = r0.getNetworkType()
                L_0x024b:
                    switch(r0) {
                        case 0: goto L_0x027d;
                        case 1: goto L_0x027a;
                        case 2: goto L_0x0277;
                        case 3: goto L_0x0274;
                        case 4: goto L_0x0271;
                        case 5: goto L_0x026e;
                        case 6: goto L_0x026b;
                        case 7: goto L_0x0268;
                        case 8: goto L_0x0264;
                        case 9: goto L_0x0261;
                        case 10: goto L_0x025e;
                        case 11: goto L_0x025b;
                        case 12: goto L_0x0258;
                        case 13: goto L_0x0255;
                        case 14: goto L_0x0252;
                        case 15: goto L_0x024f;
                        default: goto L_0x024e;
                    }
                L_0x024e:
                    goto L_0x027f
                L_0x024f:
                    java.lang.String r5 = "HSPA+"
                    goto L_0x027f
                L_0x0252:
                    java.lang.String r5 = "eHRPD"
                    goto L_0x027f
                L_0x0255:
                    java.lang.String r5 = "LTE"
                    goto L_0x027f
                L_0x0258:
                    java.lang.String r5 = "EVDO rev. B"
                    goto L_0x027f
                L_0x025b:
                    java.lang.String r5 = "iDen"
                    goto L_0x027f
                L_0x025e:
                    java.lang.String r5 = "HSPA"
                    goto L_0x027f
                L_0x0261:
                    java.lang.String r5 = "HSUPA"
                    goto L_0x027f
                L_0x0264:
                    java.lang.String r5 = "HSDPA"
                    goto L_0x027f
                L_0x0267:
                    throw r0
                L_0x0268:
                    java.lang.String r5 = "1xRTT"
                    goto L_0x027f
                L_0x026b:
                    java.lang.String r5 = "EVDO rev. A"
                    goto L_0x027f
                L_0x026e:
                    java.lang.String r5 = "EVDO rev. 0"
                    goto L_0x027f
                L_0x0271:
                    java.lang.String r5 = "CDMA"
                    goto L_0x027f
                L_0x0274:
                    java.lang.String r5 = "UMTS"
                    goto L_0x027f
                L_0x0277:
                    java.lang.String r5 = "EDGE"
                    goto L_0x027f
                L_0x027a:
                    java.lang.String r5 = "GPRS"
                    goto L_0x027f
                L_0x027d:
                    java.lang.String r5 = "Unknown"
                L_0x027f:
                    if (r5 == 0) goto L_0x028f
                    int r0 = IsOverlapping
                    int r0 = r0 + 75
                    int r2 = r0 % 128
                    isInside = r2
                    int r0 = r0 % r7
                    java.lang.String r0 = "$radio"
                    r1.put(r0, r5)
                L_0x028f:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    java.lang.Boolean r0 = r0.setMin()
                    if (r0 == 0) goto L_0x029e
                    java.lang.String r2 = "$bluetooth_enabled"
                    r1.put(r2, r0)
                L_0x029e:
                    o.setInitialPrefetchItemCount$isInside r0 = o.setInitialPrefetchItemCount.isInside.this
                    o.findFirstCompletelyVisibleItemPosition r0 = r0.getMax
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r3 = 18
                    java.lang.String r5 = "ble"
                    if (r2 < r3) goto L_0x02c9
                    android.content.Context r2 = r0.getMin
                    android.content.pm.PackageManager r2 = r2.getPackageManager()
                    java.lang.String r3 = "android.hardware.bluetooth_le"
                    boolean r2 = r2.hasSystemFeature(r3)
                    if (r2 == 0) goto L_0x02c9
                    int r0 = IsOverlapping
                    int r0 = r0 + 31
                    int r2 = r0 % 128
                    isInside = r2
                    int r0 = r0 % r7
                    if (r0 == 0) goto L_0x02dc
                    r0 = 46
                    int r0 = r0 / r4
                    goto L_0x02dc
                L_0x02c7:
                    r0 = move-exception
                    throw r0
                L_0x02c9:
                    android.content.Context r0 = r0.getMin
                    android.content.pm.PackageManager r0 = r0.getPackageManager()
                    java.lang.String r2 = "android.hardware.bluetooth"
                    boolean r0 = r0.hasSystemFeature(r2)
                    if (r0 == 0) goto L_0x02da
                    java.lang.String r5 = "classic"
                    goto L_0x02dc
                L_0x02da:
                    java.lang.String r5 = "none"
                L_0x02dc:
                    java.lang.String r0 = "$bluetooth_version"
                    r1.put(r0, r5)
                    return r1
                L_0x02e2:
                    r0 = move-exception
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setInitialPrefetchItemCount.isInside.getMax.setMax():org.json.JSONObject");
            }

            private static String getMin(int[] iArr, byte[] bArr, boolean z) {
                int i = iArr[0];
                boolean z2 = true;
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(toIntRange, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    char c = 0;
                    for (int i5 = 0; i5 < i2; i5++) {
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    int i6 = isInside + 5;
                    IsOverlapping = i6 % 128;
                    if ((i6 % 2 == 0 ? '9' : 'U') != '9') {
                        char[] cArr3 = new char[i2];
                        System.arraycopy(cArr, 0, cArr3, 0, i2);
                        int i7 = i2 - i4;
                        System.arraycopy(cArr3, 0, cArr, i7, i4);
                        System.arraycopy(cArr3, i4, cArr, 0, i7);
                    } else {
                        char[] cArr4 = new char[i2];
                        System.arraycopy(cArr, 0, cArr4, 1, i2);
                        System.arraycopy(cArr4, 1, cArr, i2 + i4, i4);
                        System.arraycopy(cArr4, i4, cArr, 0, i2 >> i4);
                    }
                    try {
                        int i8 = IsOverlapping + 125;
                        isInside = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (z) {
                    char[] cArr5 = new char[i2];
                    for (int i10 = 0; i10 < i2; i10++) {
                        cArr5[i10] = cArr[(i2 - i10) - 1];
                    }
                    int i11 = IsOverlapping + 79;
                    isInside = i11 % 128;
                    int i12 = i11 % 2;
                    cArr = cArr5;
                }
                if (i3 > 0) {
                    z2 = false;
                }
                if (!z2) {
                    int i13 = IsOverlapping + 117;
                    isInside = i13 % 128;
                    int i14 = i13 % 2;
                    for (int i15 = 0; i15 < i2; i15++) {
                        cArr[i15] = (char) (cArr[i15] - iArr[2]);
                    }
                }
                return new String(cArr);
            }
        }

        static /* synthetic */ void getMax(isInside isinside) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = isinside.setMin;
            long j2 = 1 + j;
            long j3 = isinside.isInside;
            if (j3 > 0) {
                isinside.toIntRange = ((currentTimeMillis - j3) + (isinside.toIntRange * j)) / j2;
                setInitialPrefetchItemCount.length();
            }
            isinside.isInside = currentTimeMillis;
            isinside.setMin = j2;
        }
    }

    static class length extends setMin {
        public final String toString() {
            return this.length.toString();
        }
    }

    static /* synthetic */ void length() {
        Thread.currentThread().getId();
        findOnePartiallyOrCompletelyInvisibleChild.getMax();
    }

    static /* synthetic */ void getMax() {
        Thread.currentThread().getId();
        findOnePartiallyOrCompletelyInvisibleChild.setMax();
    }
}
