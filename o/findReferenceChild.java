package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONObject;

@SuppressLint({"CommitPrefEdits"})
public final class findReferenceChild {
    /* access modifiers changed from: private */
    public static boolean Grayscale$Algorithm = true;
    private static Integer Mean$Arithmetic;
    /* access modifiers changed from: package-private */
    public static final Object length = new Object();
    private static Boolean valueOf;
    private boolean FastBitmap$CoordinateSystem;
    private final SharedPreferences.OnSharedPreferenceChangeListener IsOverlapping;
    private Map<String, String> equals;
    JSONObject getMax;
    Object getMin = new Object();
    private String hashCode;
    private Boolean invoke;
    private final Future<SharedPreferences> isInside;
    final Future<SharedPreferences> setMax;
    final Future<SharedPreferences> setMin;
    private String toDoubleRange;
    private final Future<SharedPreferences> toFloatRange;
    private boolean toIntRange;
    private String toString;
    private boolean values;

    public static String getMax(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("people_distinct_id", (String) null);
    }

    public static void getMax(Context context, String str, Map<String, String> map) {
        synchronized (length) {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.clear();
            for (Map.Entry next : map.entrySet()) {
                edit.putString((String) next.getKey(), (String) next.getValue());
            }
            edit.apply();
            Grayscale$Algorithm = true;
        }
    }

    public findReferenceChild(Future<SharedPreferences> future, Future<SharedPreferences> future2, Future<SharedPreferences> future3, Future<SharedPreferences> future4) {
        this.setMin = future;
        this.toFloatRange = future2;
        this.setMax = future3;
        this.isInside = future4;
        this.getMax = null;
        this.equals = null;
        this.toIntRange = false;
        this.IsOverlapping = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                synchronized (findReferenceChild.length) {
                    findReferenceChild.this.Mean$Arithmetic();
                    boolean unused = findReferenceChild.Grayscale$Algorithm = false;
                }
            }
        };
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|19|16|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.getMin
            monitor-enter(r0)
            org.json.JSONObject r1 = r5.toDoubleRange()     // Catch:{ all -> 0x0025 }
            java.util.Iterator r2 = r1.keys()     // Catch:{ all -> 0x0025 }
        L_0x000b:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0025 }
            java.lang.Object r4 = r1.get(r3)     // Catch:{ JSONException -> 0x001f }
            r6.put(r3, r4)     // Catch:{ JSONException -> 0x001f }
            goto L_0x000b
        L_0x001f:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0025 }
            goto L_0x000b
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x0029
        L_0x0028:
            throw r6
        L_0x0029:
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.getMax(org.json.JSONObject):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|20|17|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMin(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.getMin
            monitor-enter(r0)
            org.json.JSONObject r1 = r5.toDoubleRange()     // Catch:{ all -> 0x0028 }
            java.util.Iterator r2 = r6.keys()     // Catch:{ all -> 0x0028 }
        L_0x000b:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0028 }
            java.lang.Object r4 = r6.get(r3)     // Catch:{ JSONException -> 0x001f }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x001f }
            goto L_0x000b
        L_0x001f:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0028 }
            goto L_0x000b
        L_0x0023:
            r5.FastBitmap$CoordinateSystem()     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x002c
        L_0x002b:
            throw r6
        L_0x002c:
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.setMin(org.json.JSONObject):void");
    }

    public final Map<String, String> getMin() {
        synchronized (length) {
            if (Grayscale$Algorithm || this.equals == null) {
                Mean$Arithmetic();
                Grayscale$Algorithm = false;
            }
        }
        return this.equals;
    }

    public final synchronized String getMax() {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        return this.toDoubleRange;
    }

    public final synchronized boolean length() {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        return this.values;
    }

    public final synchronized String setMax() {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        return this.hashCode;
    }

    public final synchronized String setMin() {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        if (!this.FastBitmap$CoordinateSystem) {
            return null;
        }
        return this.hashCode;
    }

    public final synchronized void setMin(String str) {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        if (this.toDoubleRange == null) {
            this.toDoubleRange = str;
            this.values = true;
            valueOf();
        }
    }

    public final synchronized void getMax(String str) {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        this.hashCode = str;
        valueOf();
    }

    public final synchronized void toIntRange() {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        this.FastBitmap$CoordinateSystem = true;
        valueOf();
    }

    public final synchronized String equals() {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        return this.toString;
    }

    public final synchronized void getMin(String str) {
        if (!this.toIntRange) {
            Grayscale$Algorithm();
        }
        this.toString = str;
        valueOf();
    }

    public final synchronized void isInside() {
        try {
            SharedPreferences.Editor edit = this.toFloatRange.get().edit();
            edit.clear();
            edit.apply();
            invoke();
            Grayscale$Algorithm();
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void length(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r2.toFloatRange     // Catch:{ ExecutionException -> 0x001e, InterruptedException -> 0x0019 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x001e, InterruptedException -> 0x0019 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x001e, InterruptedException -> 0x0019 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ ExecutionException -> 0x001e, InterruptedException -> 0x0019 }
            java.lang.String r1 = "push_id"
            r0.putString(r1, r3)     // Catch:{ ExecutionException -> 0x001e, InterruptedException -> 0x0019 }
            r0.apply()     // Catch:{ ExecutionException -> 0x001e, InterruptedException -> 0x0019 }
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            goto L_0x0027
        L_0x0019:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x001e:
            r3 = move-exception
            r3.getCause()     // Catch:{ all -> 0x0017 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0027:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.length(java.lang.String):void");
    }

    public final Map<String, Long> IsOverlapping() {
        HashMap hashMap = new HashMap();
        try {
            for (Map.Entry next : this.setMax.get().getAll().entrySet()) {
                hashMap.put(next.getKey(), Long.valueOf(next.getValue().toString()));
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return hashMap;
    }

    public final void setMax(String str) {
        try {
            SharedPreferences.Editor edit = this.setMax.get().edit();
            edit.remove(str);
            edit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean isInside(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r2.isInside     // Catch:{ ExecutionException -> 0x0015, InterruptedException -> 0x0011 }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x0015, InterruptedException -> 0x0011 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ ExecutionException -> 0x0015, InterruptedException -> 0x0011 }
            boolean r0 = r1.getBoolean(r3, r0)     // Catch:{ ExecutionException -> 0x0015, InterruptedException -> 0x0011 }
            goto L_0x001c
        L_0x000f:
            r3 = move-exception
            goto L_0x001e
        L_0x0011:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x000f }
            goto L_0x001c
        L_0x0015:
            r3 = move-exception
            r3.getCause()     // Catch:{ all -> 0x000f }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x000f }
        L_0x001c:
            monitor-exit(r2)
            return r0
        L_0x001e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.isInside(java.lang.String):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void equals(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r2.isInside     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0018 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0018 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0018 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0018 }
            r1 = 1
            r0.putBoolean(r3, r1)     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0018 }
            r0.apply()     // Catch:{ ExecutionException -> 0x001d, InterruptedException -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            r3 = move-exception
            goto L_0x0026
        L_0x0018:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return
        L_0x001d:
            r3 = move-exception
            r3.getCause()     // Catch:{ all -> 0x0016 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return
        L_0x0026:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.equals(java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean toFloatRange(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L_0x0006
            monitor-exit(r4)
            return r0
        L_0x0006:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0077 }
            java.lang.Integer r1 = Mean$Arithmetic     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            if (r1 != 0) goto L_0x0043
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r4.isInside     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.lang.String r2 = "latest_version_code"
            r3 = -1
            int r1 = r1.getInt(r2, r3)     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            Mean$Arithmetic = r1     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            int r1 = r1.intValue()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            if (r1 != r3) goto L_0x0043
            Mean$Arithmetic = r5     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r4.isInside     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.lang.String r2 = "latest_version_code"
            int r3 = r5.intValue()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            r1.putInt(r2, r3)     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            r1.apply()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
        L_0x0043:
            java.lang.Integer r1 = Mean$Arithmetic     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            int r1 = r1.intValue()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            int r2 = r5.intValue()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            if (r1 >= r2) goto L_0x0075
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r4.isInside     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            java.lang.String r2 = "latest_version_code"
            int r5 = r5.intValue()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            r1.putInt(r2, r5)     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            r1.apply()     // Catch:{ ExecutionException -> 0x006e, InterruptedException -> 0x006a }
            r5 = 1
            monitor-exit(r4)
            return r5
        L_0x006a:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0077 }
            goto L_0x0075
        L_0x006e:
            r5 = move-exception
            r5.getCause()     // Catch:{ all -> 0x0077 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r4)
            return r0
        L_0x0077:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.toFloatRange(java.lang.String):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean getMin(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Boolean r0 = valueOf     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x003f
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r3.isInside     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            java.lang.String r1 = "has_launched_"
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            if (r0 == 0) goto L_0x0023
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            valueOf = r4     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            goto L_0x003f
        L_0x0023:
            if (r4 != 0) goto L_0x0026
            r2 = 1
        L_0x0026:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            valueOf = r4     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            boolean r4 = r4.booleanValue()     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            if (r4 != 0) goto L_0x003f
            r3.toIntRange(r5)     // Catch:{ ExecutionException -> 0x003b, InterruptedException -> 0x0036 }
            goto L_0x003f
        L_0x0036:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0047 }
            valueOf = r4     // Catch:{ all -> 0x0047 }
            goto L_0x003f
        L_0x003b:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0047 }
            valueOf = r4     // Catch:{ all -> 0x0047 }
        L_0x003f:
            java.lang.Boolean r4 = valueOf     // Catch:{ all -> 0x0047 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return r4
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.getMin(boolean, java.lang.String):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void toIntRange(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r2.isInside     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            java.lang.String r1 = "has_launched_"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            java.lang.String r3 = r1.concat(r3)     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            r1 = 1
            r0.putBoolean(r3, r1)     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            r0.apply()     // Catch:{ ExecutionException -> 0x0027, InterruptedException -> 0x0022 }
            monitor-exit(r2)
            return
        L_0x0020:
            r3 = move-exception
            goto L_0x0030
        L_0x0022:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            r3.getCause()     // Catch:{ all -> 0x0020 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return
        L_0x0030:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.toIntRange(java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.HashSet<java.lang.Integer> toFloatRange() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r4.toFloatRange     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            java.lang.String r2 = "seen_campaign_ids"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            java.util.StringTokenizer r2 = new java.util.StringTokenizer     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            java.lang.String r3 = ","
            r2.<init>(r1, r3)     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
        L_0x001d:
            boolean r1 = r2.hasMoreTokens()     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r2.nextToken()     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            r0.add(r1)     // Catch:{ ExecutionException -> 0x0033, InterruptedException -> 0x002f }
            goto L_0x001d
        L_0x002f:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x003c }
            goto L_0x003a
        L_0x0033:
            r1 = move-exception
            r1.getCause()     // Catch:{ all -> 0x003c }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r4)
            return r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x0040
        L_0x003f:
            throw r0
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.toFloatRange():java.util.HashSet");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void getMin(java.lang.Integer r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r4.toFloatRange     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            java.lang.String r2 = "seen_campaign_ids"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            java.lang.String r2 = "seen_campaign_ids"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            r3.<init>()     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            r3.append(r0)     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            r3.append(r5)     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            java.lang.String r5 = ","
            r3.append(r5)     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            java.lang.String r5 = r3.toString()     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            r1.putString(r2, r5)     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            r1.apply()     // Catch:{ ExecutionException -> 0x003a, InterruptedException -> 0x0035 }
            monitor-exit(r4)
            return
        L_0x0033:
            r5 = move-exception
            goto L_0x0043
        L_0x0035:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0033 }
            monitor-exit(r4)
            return
        L_0x003a:
            r5 = move-exception
            r5.getCause()     // Catch:{ all -> 0x0033 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0033 }
            monitor-exit(r4)
            return
        L_0x0043:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.getMin(java.lang.Integer):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void length(boolean r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0039 }
            r1.invoke = r2     // Catch:{ all -> 0x0039 }
            java.util.concurrent.Future<android.content.SharedPreferences> r2 = r1.isInside     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            java.lang.String r0 = "opt_out_"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            java.lang.Boolean r0 = r1.invoke     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            r2.putBoolean(r3, r0)     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            r2.apply()     // Catch:{ ExecutionException -> 0x0030, InterruptedException -> 0x002b }
            monitor-exit(r1)
            return
        L_0x002b:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            return
        L_0x0030:
            r2 = move-exception
            r2.getCause()     // Catch:{ all -> 0x0039 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            return
        L_0x0039:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.length(boolean, java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean IsOverlapping(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Boolean r0 = r2.invoke     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0032
            r0 = 0
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r2.isInside     // Catch:{ ExecutionException -> 0x0014, InterruptedException -> 0x0010 }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x0014, InterruptedException -> 0x0010 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ ExecutionException -> 0x0014, InterruptedException -> 0x0010 }
            r0 = r1
            goto L_0x001b
        L_0x0010:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x003a }
            goto L_0x001b
        L_0x0014:
            r1 = move-exception
            r1.getCause()     // Catch:{ all -> 0x003a }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x003a }
        L_0x001b:
            if (r0 == 0) goto L_0x0032
            java.lang.String r1 = "opt_out_"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r1.concat(r3)     // Catch:{ all -> 0x003a }
            r1 = 0
            boolean r3 = r0.getBoolean(r3, r1)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x003a }
            r2.invoke = r3     // Catch:{ all -> 0x003a }
        L_0x0032:
            java.lang.Boolean r3 = r2.invoke     // Catch:{ all -> 0x003a }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return r3
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.IsOverlapping(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final JSONObject toDoubleRange() {
        if (this.getMax == null) {
            invoke();
        }
        return this.getMax;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:7:0x0028=Splitter:B:7:0x0028, B:12:0x0038=Splitter:B:12:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void invoke() {
        /*
            r3 = this;
            java.util.concurrent.Future<android.content.SharedPreferences> r0 = r3.toFloatRange     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            java.lang.String r1 = "super_properties"
            java.lang.String r2 = "{}"
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            r1.<init>(r0)     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            r3.getMax = r1     // Catch:{ ExecutionException -> 0x0045, InterruptedException -> 0x0038, JSONException -> 0x0028 }
            if (r1 != 0) goto L_0x0056
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0023:
            r3.getMax = r0
            return
        L_0x0026:
            r0 = move-exception
            goto L_0x0057
        L_0x0028:
            o.findOnePartiallyOrCompletelyInvisibleChild.toFloatRange()     // Catch:{ all -> 0x0026 }
            r3.FastBitmap$CoordinateSystem()     // Catch:{ all -> 0x0026 }
            org.json.JSONObject r0 = r3.getMax
            if (r0 != 0) goto L_0x0056
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0023
        L_0x0038:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0026 }
            org.json.JSONObject r0 = r3.getMax
            if (r0 != 0) goto L_0x0056
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0023
        L_0x0045:
            r0 = move-exception
            r0.getCause()     // Catch:{ all -> 0x0026 }
            o.findOnePartiallyOrCompletelyInvisibleChild.values()     // Catch:{ all -> 0x0026 }
            org.json.JSONObject r0 = r3.getMax
            if (r0 != 0) goto L_0x0056
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L_0x0023
        L_0x0056:
            return
        L_0x0057:
            org.json.JSONObject r1 = r3.getMax
            if (r1 != 0) goto L_0x0062
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r3.getMax = r1
        L_0x0062:
            goto L_0x0064
        L_0x0063:
            throw r0
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.invoke():void");
    }

    /* access modifiers changed from: private */
    public void Mean$Arithmetic() {
        this.equals = new HashMap();
        try {
            SharedPreferences sharedPreferences = this.setMin.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.IsOverlapping);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.IsOverlapping);
            for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                Object value = next.getValue();
                this.equals.put((String) next.getKey(), value.toString());
            }
        } catch (ExecutionException e) {
            e.getCause();
            findOnePartiallyOrCompletelyInvisibleChild.values();
        } catch (InterruptedException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
    }

    /* access modifiers changed from: package-private */
    public final void FastBitmap$CoordinateSystem() {
        JSONObject jSONObject = this.getMax;
        if (jSONObject == null) {
            findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            return;
        }
        String jSONObject2 = jSONObject.toString();
        findOnePartiallyOrCompletelyInvisibleChild.getMax();
        try {
            SharedPreferences.Editor edit = this.toFloatRange.get().edit();
            edit.putString("super_properties", jSONObject2);
            edit.apply();
        } catch (ExecutionException e) {
            e.getCause();
            findOnePartiallyOrCompletelyInvisibleChild.values();
        } catch (InterruptedException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Grayscale$Algorithm() {
        /*
            r4 = this;
            r0 = 0
            java.util.concurrent.Future<android.content.SharedPreferences> r1 = r4.toFloatRange     // Catch:{ ExecutionException -> 0x000e, InterruptedException -> 0x000a }
            java.lang.Object r1 = r1.get()     // Catch:{ ExecutionException -> 0x000e, InterruptedException -> 0x000a }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ ExecutionException -> 0x000e, InterruptedException -> 0x000a }
            goto L_0x0016
        L_0x000a:
            o.findOnePartiallyOrCompletelyInvisibleChild.values()
            goto L_0x0015
        L_0x000e:
            r1 = move-exception
            r1.getCause()
            o.findOnePartiallyOrCompletelyInvisibleChild.values()
        L_0x0015:
            r1 = r0
        L_0x0016:
            if (r1 != 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.String r2 = "events_distinct_id"
            java.lang.String r2 = r1.getString(r2, r0)
            r4.hashCode = r2
            r2 = 0
            java.lang.String r3 = "events_user_id_present"
            boolean r3 = r1.getBoolean(r3, r2)
            r4.FastBitmap$CoordinateSystem = r3
            java.lang.String r3 = "people_distinct_id"
            java.lang.String r3 = r1.getString(r3, r0)
            r4.toString = r3
            java.lang.String r3 = "anonymous_id"
            java.lang.String r0 = r1.getString(r3, r0)
            r4.toDoubleRange = r0
            java.lang.String r0 = "had_persisted_distinct_id"
            boolean r0 = r1.getBoolean(r0, r2)
            r4.values = r0
            java.lang.String r0 = r4.hashCode
            if (r0 != 0) goto L_0x0057
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.toDoubleRange = r0
            r4.hashCode = r0
            r4.FastBitmap$CoordinateSystem = r2
            r4.valueOf()
        L_0x0057:
            r0 = 1
            r4.toIntRange = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findReferenceChild.Grayscale$Algorithm():void");
    }

    private void valueOf() {
        try {
            SharedPreferences.Editor edit = this.toFloatRange.get().edit();
            edit.putString("events_distinct_id", this.hashCode);
            edit.putBoolean("events_user_id_present", this.FastBitmap$CoordinateSystem);
            edit.putString("people_distinct_id", this.toString);
            edit.putString("anonymous_id", this.toDoubleRange);
            edit.putBoolean("had_persisted_distinct_id", this.values);
            edit.apply();
        } catch (ExecutionException e) {
            e.getCause();
            findOnePartiallyOrCompletelyInvisibleChild.values();
        } catch (InterruptedException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.values();
        }
    }

    static void getMax(SharedPreferences.Editor editor) {
        editor.apply();
    }
}
