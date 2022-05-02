package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.text.Typography;
import o.findRelativeAdapterPositionIn;

public class dispatchPendingImportantForAccessibilityChanges implements SharedPreferences {
    private static int FastBitmap$CoordinateSystem = 0;
    private static int IsOverlapping = 0;
    private static short[] equals = null;
    private static int hashCode = 1;
    private static byte[] isInside;
    private static boolean length = false;
    private static final String setMax = dispatchPendingImportantForAccessibilityChanges.class.getName();
    private static int toFloatRange;
    private static int toIntRange;
    private SharedPreferences getMax;
    private String getMin;
    private findRelativeAdapterPositionIn.length setMin;

    static void setMax() {
        IsOverlapping = -1402834069;
        toFloatRange = -1987396366;
        isInside = new byte[]{-19, 68, 32, 43, 56};
        toIntRange = 24;
    }

    static /* synthetic */ SharedPreferences getMin(dispatchPendingImportantForAccessibilityChanges dispatchpendingimportantforaccessibilitychanges) {
        try {
            int i = hashCode + 111;
            FastBitmap$CoordinateSystem = i % 128;
            int i2 = i % 2;
            SharedPreferences sharedPreferences = dispatchpendingimportantforaccessibilitychanges.getMax;
            int i3 = hashCode + 123;
            FastBitmap$CoordinateSystem = i3 % 128;
            int i4 = i3 % 2;
            return sharedPreferences;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ String length(dispatchPendingImportantForAccessibilityChanges dispatchpendingimportantforaccessibilitychanges, String str) {
        String str2;
        try {
            int i = FastBitmap$CoordinateSystem + 45;
            hashCode = i % 128;
            Object[] objArr = null;
            if (!(i % 2 == 0)) {
                str2 = dispatchpendingimportantforaccessibilitychanges.getMax(str);
            } else {
                str2 = dispatchpendingimportantforaccessibilitychanges.getMax(str);
                int length2 = objArr.length;
            }
            int i2 = hashCode + 93;
            FastBitmap$CoordinateSystem = i2 % 128;
            if ((i2 % 2 != 0 ? '.' : 'I') != '.') {
                return str2;
            }
            super.hashCode();
            return str2;
        } catch (Exception e) {
            throw e;
        }
    }

    static {
        setMax();
        boolean z = false;
        int i = hashCode + 107;
        FastBitmap$CoordinateSystem = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            Object obj = null;
            super.hashCode();
        }
    }

    public dispatchPendingImportantForAccessibilityChanges(Context context, String str, String str2) {
        this(context, str, str2, (byte) 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if ((r5 != null ? true : r0) != true) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        if (r5 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        r3.setMin = o.findRelativeAdapterPositionIn.setMin(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private dispatchPendingImportantForAccessibilityChanges(android.content.Context r4, java.lang.String r5, java.lang.String r6, byte r7) {
        /*
            r3 = this;
            r3.<init>()
            android.content.SharedPreferences r7 = r3.getMax
            r0 = 0
            r1 = 0
            if (r7 != 0) goto L_0x003d
            java.lang.String r7 = r3.getMin
            r3.getMin = r7
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r2 = 94
            if (r7 == 0) goto L_0x0018
            r7 = 31
            goto L_0x001a
        L_0x0018:
            r7 = 94
        L_0x001a:
            if (r7 == r2) goto L_0x0037
            int r6 = FastBitmap$CoordinateSystem
            int r6 = r6 + 45
            int r7 = r6 % 128
            hashCode = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0032
            android.content.SharedPreferences r6 = android.preference.PreferenceManager.getDefaultSharedPreferences(r4)
            super.hashCode()     // Catch:{ all -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r4 = move-exception
            throw r4
        L_0x0032:
            android.content.SharedPreferences r6 = android.preference.PreferenceManager.getDefaultSharedPreferences(r4)     // Catch:{ Exception -> 0x011d }
            goto L_0x003b
        L_0x0037:
            android.content.SharedPreferences r6 = r4.getSharedPreferences(r6, r0)
        L_0x003b:
            r3.getMax = r6
        L_0x003d:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x011d }
            r7 = 73
            if (r6 == 0) goto L_0x00ed
            int r5 = hashCode
            int r5 = r5 + r7
            int r6 = r5 % 128
            FastBitmap$CoordinateSystem = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = r4.getPackageName()     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r4 = length((android.content.Context) r4)     // Catch:{ GeneralSecurityException -> 0x00df }
            byte[] r4 = r4.getBytes()     // Catch:{ GeneralSecurityException -> 0x00df }
            o.findRelativeAdapterPositionIn$length r4 = o.findRelativeAdapterPositionIn.length((java.lang.String) r5, (byte[]) r4)     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r4 = r4.toString()     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r4 = length((java.lang.String) r4)     // Catch:{ GeneralSecurityException -> 0x00df }
            android.content.SharedPreferences r5 = r3.getMax     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r5 = r5.getString(r4, r1)     // Catch:{ GeneralSecurityException -> 0x00df }
            int r6 = r1.length     // Catch:{ all -> 0x0077 }
            r6 = 1
            if (r5 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r0 = 1
        L_0x0074:
            if (r0 == r6) goto L_0x00b3
            goto L_0x0099
        L_0x0077:
            r4 = move-exception
            throw r4
        L_0x0079:
            java.lang.String r5 = r4.getPackageName()     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r4 = length((android.content.Context) r4)     // Catch:{ GeneralSecurityException -> 0x00df }
            byte[] r4 = r4.getBytes()     // Catch:{ GeneralSecurityException -> 0x00df }
            o.findRelativeAdapterPositionIn$length r4 = o.findRelativeAdapterPositionIn.length((java.lang.String) r5, (byte[]) r4)     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r4 = r4.toString()     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r4 = length((java.lang.String) r4)     // Catch:{ GeneralSecurityException -> 0x00df }
            android.content.SharedPreferences r5 = r3.getMax     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r5 = r5.getString(r4, r1)     // Catch:{ GeneralSecurityException -> 0x00df }
            if (r5 != 0) goto L_0x00b3
        L_0x0099:
            o.findRelativeAdapterPositionIn$length r5 = o.findRelativeAdapterPositionIn.getMin()     // Catch:{ GeneralSecurityException -> 0x00df }
            r3.setMin = r5     // Catch:{ GeneralSecurityException -> 0x00df }
            android.content.SharedPreferences r5 = r3.getMax     // Catch:{ GeneralSecurityException -> 0x00df }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ GeneralSecurityException -> 0x00df }
            o.findRelativeAdapterPositionIn$length r6 = r3.setMin     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r6 = r6.toString()     // Catch:{ GeneralSecurityException -> 0x00df }
            android.content.SharedPreferences$Editor r4 = r5.putString(r4, r6)     // Catch:{ GeneralSecurityException -> 0x00df }
            r4.commit()     // Catch:{ GeneralSecurityException -> 0x00df }
            goto L_0x00b9
        L_0x00b3:
            o.findRelativeAdapterPositionIn$length r4 = o.findRelativeAdapterPositionIn.setMin(r5)     // Catch:{ GeneralSecurityException -> 0x00df }
            r3.setMin = r4     // Catch:{ GeneralSecurityException -> 0x00df }
        L_0x00b9:
            o.findRelativeAdapterPositionIn$length r4 = r3.setMin     // Catch:{ GeneralSecurityException -> 0x00df }
            if (r4 == 0) goto L_0x00d7
            int r4 = FastBitmap$CoordinateSystem
            int r4 = r4 + 91
            int r5 = r4 % 128
            hashCode = r5
            int r4 = r4 % 2
            r5 = 98
            if (r4 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r7 = 98
        L_0x00ce:
            if (r7 == r5) goto L_0x00d6
            super.hashCode()     // Catch:{ all -> 0x00d4 }
            return
        L_0x00d4:
            r4 = move-exception
            throw r4
        L_0x00d6:
            return
        L_0x00d7:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{ GeneralSecurityException -> 0x00df }
            java.lang.String r5 = "Problem generating Key"
            r4.<init>(r5)     // Catch:{ GeneralSecurityException -> 0x00df }
            throw r4     // Catch:{ GeneralSecurityException -> 0x00df }
        L_0x00df:
            r4 = move-exception
            boolean r5 = length
            if (r5 == 0) goto L_0x00e7
            r4.getMessage()
        L_0x00e7:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        L_0x00ed:
            java.lang.String r4 = length((android.content.Context) r4)     // Catch:{ GeneralSecurityException -> 0x010f }
            byte[] r4 = r4.getBytes()     // Catch:{ GeneralSecurityException -> 0x010f }
            o.findRelativeAdapterPositionIn$length r4 = o.findRelativeAdapterPositionIn.length((java.lang.String) r5, (byte[]) r4)     // Catch:{ GeneralSecurityException -> 0x010f }
            r3.setMin = r4     // Catch:{ GeneralSecurityException -> 0x010f }
            if (r4 == 0) goto L_0x0107
            int r4 = hashCode
            int r4 = r4 + r7
            int r5 = r4 % 128
            FastBitmap$CoordinateSystem = r5
            int r4 = r4 % 2
            return
        L_0x0107:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch:{ GeneralSecurityException -> 0x010f }
            java.lang.String r5 = "Problem generating Key From Password"
            r4.<init>(r5)     // Catch:{ GeneralSecurityException -> 0x010f }
            throw r4     // Catch:{ GeneralSecurityException -> 0x010f }
        L_0x010f:
            r4 = move-exception
            boolean r5 = length
            if (r5 == 0) goto L_0x0117
            r4.getMessage()
        L_0x0117:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        L_0x011d:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dispatchPendingImportantForAccessibilityChanges.<init>(android.content.Context, java.lang.String, java.lang.String, byte):void");
    }

    private static String length(Context context) {
        try {
            int i = FastBitmap$CoordinateSystem + 91;
            hashCode = i % 128;
            int i2 = i % 2;
            try {
                String str = (String) Build.class.getField("SERIAL").get((Object) null);
                if ((TextUtils.isEmpty(str) ? '4' : '+') != '+') {
                    int i3 = FastBitmap$CoordinateSystem + 65;
                    try {
                        hashCode = i3 % 128;
                        if ((i3 % 2 == 0 ? (char) 30 : 0) == 0) {
                            return Settings.Secure.getString(context.getContentResolver(), "android_id");
                        }
                        int i4 = 79 / 0;
                        return Settings.Secure.getString(context.getContentResolver(), "android_id");
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    int i5 = FastBitmap$CoordinateSystem + 59;
                    hashCode = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str;
                    }
                    int i6 = 39 / 0;
                    return str;
                }
            } catch (Exception unused) {
                return Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String length(String str) {
        int i = hashCode + 41;
        FastBitmap$CoordinateSystem = i % 128;
        int i2 = i % 2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(getMin(-26 - MotionEvent.axisFromString(""), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 1987396366, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1402834154, (short) (-57 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern());
            instance.update(bytes, 0, bytes.length);
            String encodeToString = Base64.encodeToString(instance.digest(), 2);
            try {
                int i3 = FastBitmap$CoordinateSystem + 57;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
                return encodeToString;
            } catch (Exception e) {
                throw e;
            }
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r1 != true) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
        if ((android.text.TextUtils.isEmpty(r5) ? 'X' : '2') != '2') goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        return o.findRelativeAdapterPositionIn.setMax(r5, r4.setMin).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getMax(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = hashCode     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 + 53
            int r1 = r0 % 128
            FastBitmap$CoordinateSystem = r1     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            if (r0 == r2) goto L_0x0023
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            super.hashCode()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001e
            r1 = 1
        L_0x001e:
            if (r1 == r2) goto L_0x0032
            goto L_0x003d
        L_0x0021:
            r5 = move-exception
            throw r5
        L_0x0023:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0049 }
            r1 = 50
            if (r0 == 0) goto L_0x002e
            r0 = 88
            goto L_0x0030
        L_0x002e:
            r0 = 50
        L_0x0030:
            if (r0 == r1) goto L_0x003d
        L_0x0032:
            int r0 = FastBitmap$CoordinateSystem
            int r0 = r0 + 65
            int r1 = r0 % 128
            hashCode = r1
            int r0 = r0 % 2
            return r5
        L_0x003d:
            o.findRelativeAdapterPositionIn$length r0 = r4.setMin     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0048 }
            o.findRelativeAdapterPositionIn$getMin r5 = o.findRelativeAdapterPositionIn.setMax(r5, r0)     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0048 }
            java.lang.String r5 = r5.toString()     // Catch:{ UnsupportedEncodingException | GeneralSecurityException -> 0x0048 }
            return r5
        L_0x0048:
            return r3
        L_0x0049:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dispatchPendingImportantForAccessibilityChanges.getMax(java.lang.String):java.lang.String");
    }

    private String setMax(String str) {
        try {
            int i = hashCode + 29;
            try {
                FastBitmap$CoordinateSystem = i % 128;
                int i2 = i % 2;
                if (TextUtils.isEmpty(str)) {
                    int i3 = hashCode + 31;
                    FastBitmap$CoordinateSystem = i3 % 128;
                    int i4 = i3 % 2;
                    return str;
                }
                try {
                    String length2 = findRelativeAdapterPositionIn.length(new findRelativeAdapterPositionIn.getMin(str), this.setMin);
                    int i5 = hashCode + 19;
                    FastBitmap$CoordinateSystem = i5 % 128;
                    int i6 = i5 % 2;
                    return length2;
                } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                    return null;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Map<String, String> getAll() {
        Map<String, ?> all = this.getMax.getAll();
        HashMap hashMap = new HashMap(all.size());
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            try {
                if ((it.hasNext() ? '0' : 'E') != '0') {
                    return hashMap;
                }
                Map.Entry next = it.next();
                try {
                    Object value = next.getValue();
                    if (value != null) {
                        int i = hashCode + 67;
                        FastBitmap$CoordinateSystem = i % 128;
                        int i2 = i % 2;
                        if (!value.equals(this.setMin.toString())) {
                            int i3 = FastBitmap$CoordinateSystem + 9;
                            hashCode = i3 % 128;
                            int i4 = i3 % 2;
                            hashMap.put(next.getKey(), setMax(value.toString()));
                        }
                    }
                } catch (Exception unused) {
                    hashMap.put(next.getKey(), next.getValue().toString());
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public String getString(String str, String str2) {
        int i = hashCode + 25;
        FastBitmap$CoordinateSystem = i % 128;
        int i2 = i % 2;
        String string = this.getMax.getString(length(str), (String) null);
        if (!(string == null)) {
            return setMax(string);
        }
        int i3 = FastBitmap$CoordinateSystem + 35;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    @TargetApi(11)
    public Set<String> getStringSet(String str, Set<String> set) {
        Set set2 = null;
        Set<String> stringSet = this.getMax.getStringSet(length(str), set2);
        if (!(stringSet == null)) {
            HashSet hashSet = new HashSet(stringSet.size());
            Iterator<String> it = stringSet.iterator();
            try {
                int i = FastBitmap$CoordinateSystem + 43;
                hashCode = i % 128;
                int i2 = i % 2;
                while (true) {
                    if (!it.hasNext()) {
                        return hashSet;
                    }
                    int i3 = FastBitmap$CoordinateSystem + 5;
                    hashCode = i3 % 128;
                    if (i3 % 2 == 0) {
                        hashSet.add(setMax(it.next()));
                        super.hashCode();
                    } else {
                        hashSet.add(setMax(it.next()));
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i4 = hashCode + 51;
            FastBitmap$CoordinateSystem = i4 % 128;
            int i5 = i4 % 2;
            return set;
        }
    }

    public int getInt(String str, int i) {
        int i2 = FastBitmap$CoordinateSystem + 35;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        String string = this.getMax.getString(length(str), (String) null);
        if ((string == null ? 'R' : '/') != 'R') {
            try {
                return Integer.parseInt(setMax(string));
            } catch (NumberFormatException e) {
                throw new ClassCastException(e.getMessage());
            }
        } else {
            int i4 = hashCode + 11;
            FastBitmap$CoordinateSystem = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            return i;
        }
    }

    public long getLong(String str, long j) {
        int i = FastBitmap$CoordinateSystem + 71;
        hashCode = i % 128;
        int i2 = i % 2;
        String string = this.getMax.getString(length(str), (String) null);
        if ((string == null ? '\\' : 'C') != '\\') {
            try {
                return Long.parseLong(setMax(string));
            } catch (NumberFormatException e) {
                throw new ClassCastException(e.getMessage());
            }
        } else {
            int i3 = hashCode + 41;
            FastBitmap$CoordinateSystem = i3 % 128;
            if ((i3 % 2 != 0 ? '`' : 6) == 6) {
                return j;
            }
            int i4 = 3 / 0;
            return j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r1 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r5 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5 = java.lang.Float.parseFloat(setMax(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r6 = FastBitmap$CoordinateSystem + 45;
        hashCode = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw new java.lang.ClassCastException(r5.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getFloat(java.lang.String r5, float r6) {
        /*
            r4 = this;
            int r0 = FastBitmap$CoordinateSystem
            int r0 = r0 + 121
            int r1 = r0 % 128
            hashCode = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == 0) goto L_0x002a
            android.content.SharedPreferences r0 = r4.getMax
            java.lang.String r5 = length((java.lang.String) r5)
            java.lang.String r5 = r0.getString(r5, r3)
            super.hashCode()     // Catch:{ all -> 0x0028 }
            if (r5 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x0037
            goto L_0x0036
        L_0x0028:
            r5 = move-exception
            throw r5
        L_0x002a:
            android.content.SharedPreferences r0 = r4.getMax
            java.lang.String r5 = length((java.lang.String) r5)
            java.lang.String r5 = r0.getString(r5, r3)
            if (r5 != 0) goto L_0x0037
        L_0x0036:
            return r6
        L_0x0037:
            java.lang.String r5 = r4.setMax(r5)     // Catch:{ NumberFormatException -> 0x004a }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x004a }
            int r6 = FastBitmap$CoordinateSystem
            int r6 = r6 + 45
            int r0 = r6 % 128
            hashCode = r0
            int r6 = r6 % 2
            return r5
        L_0x004a:
            r5 = move-exception
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dispatchPendingImportantForAccessibilityChanges.getFloat(java.lang.String, float):float");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String] */
    public boolean getBoolean(String str, boolean z) {
        ? r1 = 0;
        String string = this.getMax.getString(length(str), r1);
        char c = 'T';
        if ((string == null ? 'T' : '7') != '7') {
            int i = FastBitmap$CoordinateSystem + 111;
            hashCode = i % 128;
            if ((i % 2 == 0 ? 19 : 'T') == 'T') {
                return z;
            }
            int length2 = r1.length;
            return z;
        }
        try {
            boolean parseBoolean = Boolean.parseBoolean(setMax(string));
            try {
                int i2 = FastBitmap$CoordinateSystem + 67;
                hashCode = i2 % 128;
                if (i2 % 2 != 0) {
                    c = 'P';
                }
                if (c == 'P') {
                    return parseBoolean;
                }
                int i3 = 85 / 0;
                return parseBoolean;
            } catch (Exception e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    public boolean contains(String str) {
        boolean z;
        try {
            int i = FastBitmap$CoordinateSystem + 119;
            try {
                hashCode = i % 128;
                if ((i % 2 == 0 ? 7 : 'S') != 'S') {
                    z = this.getMax.contains(length(str));
                    int i2 = 58 / 0;
                } else {
                    z = this.getMax.contains(length(str));
                }
                int i3 = hashCode + 39;
                FastBitmap$CoordinateSystem = i3 % 128;
                if ((i3 % 2 != 0 ? Typography.amp : ')') == ')') {
                    return z;
                }
                Object obj = null;
                super.hashCode();
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public class getMax implements SharedPreferences.Editor {
        private SharedPreferences.Editor setMin;

        /* synthetic */ getMax(dispatchPendingImportantForAccessibilityChanges dispatchpendingimportantforaccessibilitychanges, byte b) {
            this();
        }

        private getMax() {
            this.setMin = dispatchPendingImportantForAccessibilityChanges.getMin(dispatchPendingImportantForAccessibilityChanges.this).edit();
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            this.setMin.putString(dispatchPendingImportantForAccessibilityChanges.length(str), dispatchPendingImportantForAccessibilityChanges.length(dispatchPendingImportantForAccessibilityChanges.this, str2));
            return this;
        }

        @TargetApi(11)
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet(set.size());
            for (String length2 : set) {
                hashSet.add(dispatchPendingImportantForAccessibilityChanges.length(dispatchPendingImportantForAccessibilityChanges.this, length2));
            }
            this.setMin.putStringSet(dispatchPendingImportantForAccessibilityChanges.length(str), hashSet);
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            this.setMin.putString(dispatchPendingImportantForAccessibilityChanges.length(str), dispatchPendingImportantForAccessibilityChanges.length(dispatchPendingImportantForAccessibilityChanges.this, Integer.toString(i)));
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j) {
            this.setMin.putString(dispatchPendingImportantForAccessibilityChanges.length(str), dispatchPendingImportantForAccessibilityChanges.length(dispatchPendingImportantForAccessibilityChanges.this, Long.toString(j)));
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f) {
            this.setMin.putString(dispatchPendingImportantForAccessibilityChanges.length(str), dispatchPendingImportantForAccessibilityChanges.length(dispatchPendingImportantForAccessibilityChanges.this, Float.toString(f)));
            return this;
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.setMin.putString(dispatchPendingImportantForAccessibilityChanges.length(str), dispatchPendingImportantForAccessibilityChanges.length(dispatchPendingImportantForAccessibilityChanges.this, Boolean.toString(z)));
            return this;
        }

        public final SharedPreferences.Editor remove(String str) {
            this.setMin.remove(dispatchPendingImportantForAccessibilityChanges.length(str));
            return this;
        }

        public final SharedPreferences.Editor clear() {
            this.setMin.clear();
            return this;
        }

        public final boolean commit() {
            return this.setMin.commit();
        }

        @TargetApi(9)
        public final void apply() {
            if (Build.VERSION.SDK_INT >= 9) {
                this.setMin.apply();
            } else {
                commit();
            }
        }
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        int i = hashCode + 13;
        FastBitmap$CoordinateSystem = i % 128;
        int i2 = i % 2;
        this.getMax.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        try {
            int i3 = FastBitmap$CoordinateSystem + 41;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            int i = hashCode + 63;
            FastBitmap$CoordinateSystem = i % 128;
            Object obj = null;
            if (!(i % 2 != 0)) {
                this.getMax.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            } else {
                this.getMax.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                super.hashCode();
            }
            int i2 = FastBitmap$CoordinateSystem + 49;
            hashCode = i2 % 128;
            if ((i2 % 2 == 0 ? ';' : Typography.less) == ';') {
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public /* synthetic */ SharedPreferences.Editor edit() {
        boolean z = false;
        getMax getmax = new getMax(this, (byte) 0);
        try {
            int i = hashCode + 51;
            FastBitmap$CoordinateSystem = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (z) {
                return getmax;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return getmax;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r4 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if ((isInside == null) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r5 = r8 - 1;
        r8 = (byte) (isInside[r8] + r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(int r6, byte r7, int r8, int r9, short r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = toIntRange
            int r6 = r6 + r1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r6 != r1) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0037
            byte[] r6 = isInside
            if (r6 == 0) goto L_0x002c
            int r6 = FastBitmap$CoordinateSystem
            int r6 = r6 + 11
            int r4 = r6 % 128
            hashCode = r4
            int r6 = r6 % 2
            byte[] r6 = isInside
            int r4 = toFloatRange
            int r4 = r4 + r8
            byte r6 = r6[r4]
            int r4 = toIntRange
            int r6 = r6 + r4
            byte r6 = (byte) r6
            goto L_0x0037
        L_0x002c:
            short[] r6 = equals
            int r4 = toFloatRange
            int r4 = r4 + r8
            short r6 = r6[r4]
            int r4 = toIntRange
            int r6 = r6 + r4
            short r6 = (short) r6
        L_0x0037:
            if (r6 <= 0) goto L_0x0099
            int r8 = r8 + r6
            int r8 = r8 + -2
            int r4 = toFloatRange
            int r8 = r8 + r4
            if (r1 == 0) goto L_0x0043
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 == r3) goto L_0x0048
            r1 = 0
            goto L_0x0053
        L_0x0048:
            int r1 = FastBitmap$CoordinateSystem
            int r1 = r1 + 121
            int r4 = r1 % 128
            hashCode = r4
            int r1 = r1 % 2
            r1 = 1
        L_0x0053:
            int r8 = r8 + r1
            int r1 = IsOverlapping
            int r9 = r9 + r1
            char r9 = (char) r9
            r0.append(r9)
            r1 = 1
        L_0x005c:
            if (r1 >= r6) goto L_0x0099
            int r4 = FastBitmap$CoordinateSystem
            int r4 = r4 + 65
            int r5 = r4 % 128
            hashCode = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0073
            byte[] r4 = isInside
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x007c
            goto L_0x008a
        L_0x0071:
            r6 = move-exception
            throw r6
        L_0x0073:
            byte[] r4 = isInside
            if (r4 == 0) goto L_0x0079
            r4 = 0
            goto L_0x007a
        L_0x0079:
            r4 = 1
        L_0x007a:
            if (r4 == 0) goto L_0x008a
        L_0x007c:
            short[] r4 = equals
            int r5 = r8 + -1
            short r8 = r4[r8]
            int r8 = r8 + r10
            short r8 = (short) r8
        L_0x0084:
            r8 = r8 ^ r7
            int r9 = r9 + r8
            char r8 = (char) r9
            r9 = r8
            r8 = r5
            goto L_0x0093
        L_0x008a:
            byte[] r4 = isInside
            int r5 = r8 + -1
            byte r8 = r4[r8]
            int r8 = r8 + r10
            byte r8 = (byte) r8
            goto L_0x0084
        L_0x0093:
            r0.append(r9)
            int r1 = r1 + 1
            goto L_0x005c
        L_0x0099:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dispatchPendingImportantForAccessibilityChanges.getMin(int, byte, int, int, short):java.lang.String");
    }
}
