package com.alibaba.ariver.kernel.common.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import o.onActivityPostResumed;

public class JSONUtils {
    private static int getMax = 0;
    private static int getMin = 1;
    private static int[] setMax = {1013540830, -995418828, 1614108370, -199832876, -321756342, -451982155, -1752098205, -1905154998, -661757202, 902260444, 226270490, -753815529, -609958541, -275875139, -599710999, -1830642388, 1119998991, -519514908};

    public static boolean contains(JSONObject jSONObject, String str) {
        if ((jSONObject != null) && !jSONObject.isEmpty()) {
            int i = getMax + 95;
            getMin = i % 128;
            int i2 = i % 2;
            if ((jSONObject.containsKey(str) ? 7 : 'G') == 7) {
                int i3 = getMin + 123;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        return false;
    }

    public static JSONObject parseObject(String str) {
        JSONObject jSONObject = null;
        if ((TextUtils.isEmpty(str) ? 5 : '?') != 5) {
            try {
                jSONObject = JSON.parseObject(str);
                try {
                    int i = getMax + 115;
                    try {
                        getMin = i % 128;
                        int i2 = i % 2;
                        return jSONObject;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                RVLogger.e("parseObject error!", (Throwable) e3);
            }
        } else {
            int i3 = getMin + 79;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.alibaba.fastjson.JSONObject] */
    public static JSONObject parseObject(byte[] bArr) {
        boolean z = true;
        ? r4 = 0;
        if ((bArr == null ? '\'' : ' ') != '\'') {
            try {
                return JSON.parseObject(new String(bArr, getMin(5 - View.getDefaultSize(0, 0), new int[]{1044002336, 1661667662, 196289067, -1108517547}).intern()));
            } catch (Exception e) {
                RVLogger.e("parseObject error!", (Throwable) e);
                return r4;
            }
        } else {
            int i = getMin + 41;
            getMax = i % 128;
            if (i % 2 != 0) {
                z = false;
            }
            if (!z) {
                int length = r4.length;
            }
            int i2 = getMin + 91;
            getMax = i2 % 128;
            if (i2 % 2 == 0) {
                return r4;
            }
            int i3 = 82 / 0;
            return r4;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [T] */
    public static <T> T parseObject(byte[] bArr, Class<T> cls) {
        T t;
        int i = getMin + 121;
        getMax = i % 128;
        int i2 = i % 2;
        char c = 15;
        ? r3 = 0;
        if ((bArr != null ? 15 : Typography.amp) != '&') {
            if (!(bArr.length == 0)) {
                try {
                    t = JSON.parseObject(bArr, (Type) cls, new Feature[0]);
                } catch (Exception e) {
                    RVLogger.e("parseObject error!", (Throwable) e);
                    t = r3;
                }
                try {
                    int i3 = getMin + 71;
                    try {
                        getMax = i3 % 128;
                        if (i3 % 2 == 0) {
                            c = 'S';
                        }
                        if (c == 'S') {
                            return t;
                        }
                        int length = r3.length;
                        return t;
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            }
        }
        return r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: T} */
    /* JADX WARNING: type inference failed for: r4v0, types: [T] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if ((r8 == null) != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r8 != null) goto L_0x0022;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T parseObject(byte[] r8, java.lang.Class<T> r9, com.alibaba.fastjson.parser.deserializer.ParseProcess r10) {
        /*
            int r0 = getMin
            int r0 = r0 + 41
            int r1 = r0 % 128
            getMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r4 = 0
            if (r0 == r2) goto L_0x001a
            int r0 = r4.length     // Catch:{ all -> 0x0018 }
            if (r8 == 0) goto L_0x0025
            goto L_0x0022
        L_0x0018:
            r8 = move-exception
            throw r8
        L_0x001a:
            if (r8 == 0) goto L_0x001e
            r0 = 0
            goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            int r0 = r8.length
            if (r0 != 0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x0061 }
            int r5 = android.graphics.Color.alpha(r3)     // Catch:{ Exception -> 0x0061 }
            int r5 = 5 - r5
            r6 = 4
            int[] r6 = new int[r6]     // Catch:{ Exception -> 0x0061 }
            r7 = 1044002336(0x3e3a3620, float:0.1818471)
            r6[r3] = r7     // Catch:{ Exception -> 0x0061 }
            r7 = 1661667662(0x630b094e, float:2.564768E21)
            r6[r2] = r7     // Catch:{ Exception -> 0x0061 }
            r2 = 196289067(0xbb3222b, float:6.89997E-32)
            r6[r1] = r2     // Catch:{ Exception -> 0x0061 }
            r2 = 3
            r7 = -1108517547(0xffffffffbded5d55, float:-0.11590067)
            r6[r2] = r7     // Catch:{ Exception -> 0x0061 }
            java.lang.String r2 = getMin(r5, r6)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r2 = r2.intern()     // Catch:{ Exception -> 0x0061 }
            r0.<init>(r8, r2)     // Catch:{ Exception -> 0x0061 }
            com.alibaba.fastjson.parser.Feature[] r8 = new com.alibaba.fastjson.parser.Feature[r3]     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r0, r9, (com.alibaba.fastjson.parser.deserializer.ParseProcess) r10, (com.alibaba.fastjson.parser.Feature[]) r8)     // Catch:{ Exception -> 0x0061 }
            int r8 = getMax
            int r8 = r8 + 103
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % r1
            goto L_0x0067
        L_0x0061:
            r8 = move-exception
            java.lang.String r9 = "parseObject error!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r9, (java.lang.Throwable) r8)
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject(byte[], java.lang.Class, com.alibaba.fastjson.parser.deserializer.ParseProcess):java.lang.Object");
    }

    public static JSONArray parseArray(String str) {
        JSONArray jSONArray = null;
        if ((TextUtils.isEmpty(str) ? (char) 5 : 18) != 5) {
            try {
                jSONArray = JSON.parseArray(str);
                int i = getMin + 43;
                getMax = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                RVLogger.e("parseArray error!", (Throwable) e);
            }
            return jSONArray;
        }
        try {
            int i3 = getMin + 75;
            try {
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return null;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Nullable
    public static List<String> toStringArray(JSONArray jSONArray) {
        int i = getMax + 115;
        getMin = i % 128;
        int i2 = i % 2;
        if (jSONArray == null) {
            return null;
        }
        try {
            int size = jSONArray.size();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (true) {
                if ((i3 < size ? 9 : 'P') != 9) {
                    return arrayList;
                }
                arrayList.add(jSONArray.getString(i3));
                i3++;
                int i4 = getMax + 1;
                getMin = i4 % 128;
                int i5 = i4 % 2;
            }
        } catch (Throwable th) {
            RVLogger.e("toStringArray error!", th);
            return null;
        }
    }

    public static Bundle toBundle(JSONObject jSONObject) {
        try {
            int i = getMin + 85;
            getMax = i % 128;
            char c = 2;
            int i2 = i % 2;
            Bundle bundle = toBundle((Bundle) null, jSONObject);
            int i3 = getMax + 39;
            getMin = i3 % 128;
            if (i3 % 2 != 0) {
                c = '.';
            }
            if (c == '.') {
                return bundle;
            }
            int i4 = 3 / 0;
            return bundle;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0022, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if ((r2 instanceof java.lang.Integer) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        if (r6 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        if ((r2 instanceof java.lang.Boolean) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        r7.putBoolean(r1, ((java.lang.Boolean) r2).booleanValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if ((r2 instanceof java.lang.String) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007c, code lost:
        r7.putString(r1, (java.lang.String) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r2 instanceof java.lang.Long) == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r5 = 'L';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
        r5 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r5 == 'L') goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        if ((r2 instanceof java.lang.Double) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0095, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0096, code lost:
        if (r5 == true) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0098, code lost:
        r3 = getMin + 123;
        getMax = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r7.putDouble(r1, ((java.lang.Double) r2).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00af, code lost:
        if ((r2 instanceof java.lang.Float) == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b1, code lost:
        r7.putDouble(r1, new java.math.BigDecimal(java.lang.Float.toString(((java.lang.Float) r2).floatValue())).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        if ((r2 instanceof com.alibaba.fastjson.JSON) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cd, code lost:
        r3 = getMin + 105;
        getMax = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r7.putString(r1, ((com.alibaba.fastjson.JSON) r2).toJSONString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        r1 = getMin + 47;
        getMax = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        if ((r2 instanceof java.math.BigDecimal) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f0, code lost:
        r3 = getMin + 59;
        getMax = r3 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fa, code lost:
        if ((r3 % 2) == 0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r7.putDouble(r1, ((java.math.BigDecimal) r2).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1 = 53 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r7.putDouble(r1, ((java.math.BigDecimal) r2).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r3 = getMin + 17;
        getMax = r3 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0121, code lost:
        if ((r3 % 2) == 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r7.putLong(r1, ((java.lang.Long) r2).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r1 = 92 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r7.putLong(r1, ((java.lang.Long) r2).longValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle toBundle(android.os.Bundle r7, com.alibaba.fastjson.JSONObject r8) {
        /*
            if (r7 != 0) goto L_0x0007
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L_0x0007:
            if (r8 == 0) goto L_0x015b
            boolean r0 = r8.isEmpty()
            r1 = 65
            if (r0 == 0) goto L_0x0014
            r0 = 51
            goto L_0x0016
        L_0x0014:
            r0 = 65
        L_0x0016:
            if (r0 == r1) goto L_0x001a
            goto L_0x015b
        L_0x001a:
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0149
            int r1 = getMin
            int r1 = r1 + 117
            int r3 = r1 % 128
            getMax = r3
            int r1 = r1 % 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0039
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x004b }
            java.lang.Object r2 = r8.get(r1)     // Catch:{ Exception -> 0x0141 }
            boolean r5 = r2 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0141 }
            if (r5 == 0) goto L_0x006a
            goto L_0x0060
        L_0x004b:
            r7 = move-exception
            goto L_0x013e
        L_0x004e:
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r8.get(r1)     // Catch:{ Exception -> 0x0141 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0141 }
            super.hashCode()     // Catch:{ all -> 0x013f }
            r2 = r5
            if (r6 == 0) goto L_0x006a
        L_0x0060:
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0141 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0141 }
            r7.putInt(r1, r2)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0022
        L_0x006a:
            boolean r5 = r2 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x0141 }
            if (r5 == 0) goto L_0x0078
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0141 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0141 }
            r7.putBoolean(r1, r2)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0022
        L_0x0078:
            boolean r5 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x0141 }
            if (r5 == 0) goto L_0x0082
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0141 }
            r7.putString(r1, r2)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0022
        L_0x0082:
            boolean r5 = r2 instanceof java.lang.Long     // Catch:{ Exception -> 0x0141 }
            r6 = 76
            if (r5 == 0) goto L_0x008b
            r5 = 76
            goto L_0x008d
        L_0x008b:
            r5 = 14
        L_0x008d:
            if (r5 == r6) goto L_0x0117
            boolean r5 = r2 instanceof java.lang.Double     // Catch:{ Exception -> 0x0141 }
            if (r5 == 0) goto L_0x0095
            r5 = 0
            goto L_0x0096
        L_0x0095:
            r5 = 1
        L_0x0096:
            if (r5 == r3) goto L_0x00ad
            int r3 = getMin
            int r3 = r3 + 123
            int r4 = r3 % 128
            getMax = r4
            int r3 = r3 % 2
            java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ Exception -> 0x0141 }
            double r2 = r2.doubleValue()     // Catch:{ Exception -> 0x0141 }
            r7.putDouble(r1, r2)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0022
        L_0x00ad:
            boolean r3 = r2 instanceof java.lang.Float     // Catch:{ Exception -> 0x0141 }
            if (r3 == 0) goto L_0x00c9
            java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ Exception -> 0x0141 }
            float r2 = r2.floatValue()     // Catch:{ Exception -> 0x0141 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0141 }
            java.lang.String r2 = java.lang.Float.toString(r2)     // Catch:{ Exception -> 0x0141 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0141 }
            double r2 = r3.doubleValue()     // Catch:{ Exception -> 0x0141 }
            r7.putDouble(r1, r2)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0022
        L_0x00c9:
            boolean r3 = r2 instanceof com.alibaba.fastjson.JSON     // Catch:{ Exception -> 0x0141 }
            if (r3 == 0) goto L_0x00ec
            int r3 = getMin
            int r3 = r3 + 105
            int r4 = r3 % 128
            getMax = r4
            int r3 = r3 % 2
            com.alibaba.fastjson.JSON r2 = (com.alibaba.fastjson.JSON) r2     // Catch:{ Exception -> 0x0141 }
            java.lang.String r2 = r2.toJSONString()     // Catch:{ Exception -> 0x0141 }
            r7.putString(r1, r2)     // Catch:{ Exception -> 0x0141 }
            int r1 = getMin
            int r1 = r1 + 47
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            goto L_0x0022
        L_0x00ec:
            boolean r3 = r2 instanceof java.math.BigDecimal     // Catch:{ Exception -> 0x0141 }
            if (r3 == 0) goto L_0x0022
            int r3 = getMin
            int r3 = r3 + 59
            int r5 = r3 % 128
            getMax = r5
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x010c
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2     // Catch:{ Exception -> 0x0141 }
            double r2 = r2.doubleValue()     // Catch:{ Exception -> 0x0141 }
            r7.putDouble(r1, r2)     // Catch:{ Exception -> 0x0141 }
            r1 = 53
            int r1 = r1 / r4
            goto L_0x0022
        L_0x010a:
            r7 = move-exception
            throw r7
        L_0x010c:
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2     // Catch:{ Exception -> 0x0141 }
            double r2 = r2.doubleValue()     // Catch:{ Exception -> 0x0141 }
            r7.putDouble(r1, r2)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0022
        L_0x0117:
            int r3 = getMin     // Catch:{ Exception -> 0x004b }
            int r3 = r3 + 17
            int r5 = r3 % 128
            getMax = r5     // Catch:{ Exception -> 0x004b }
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0133
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x0141 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x0141 }
            r7.putLong(r1, r2)     // Catch:{ Exception -> 0x0141 }
            r1 = 92
            int r1 = r1 / r4
            goto L_0x0022
        L_0x0131:
            r7 = move-exception
            throw r7
        L_0x0133:
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x0141 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x0141 }
            r7.putLong(r1, r2)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0022
        L_0x013e:
            throw r7
        L_0x013f:
            r7 = move-exception
            throw r7
        L_0x0141:
            r1 = move-exception
            java.lang.String r2 = "toBundle exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.Throwable) r1)
            goto L_0x0022
        L_0x0149:
            int r8 = getMin
            int r8 = r8 + 111
            int r0 = r8 % 128
            getMax = r0
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x015b
            super.hashCode()     // Catch:{ all -> 0x0159 }
            return r7
        L_0x0159:
            r7 = move-exception
            throw r7
        L_0x015b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.toBundle(android.os.Bundle, com.alibaba.fastjson.JSONObject):android.os.Bundle");
    }

    public static String getString(JSONObject jSONObject, String str) {
        int i = getMax + 99;
        getMin = i % 128;
        int i2 = i % 2;
        String string = getString(jSONObject, str, "");
        int i3 = getMax + 1;
        getMin = i3 % 128;
        if ((i3 % 2 == 0 ? '%' : 16) == 16) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        return string;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r5 != null) != true) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r5.isEmpty() != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r0 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if ((r5 != null ? 'X' : 0) != 'X') goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getString(com.alibaba.fastjson.JSONObject r5, java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = getMax
            int r0 = r0 + 19
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001e
            r0 = 78
            int r0 = r0 / r2
            r0 = 88
            if (r5 == 0) goto L_0x0018
            r3 = 88
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 == r0) goto L_0x0026
            goto L_0x004c
        L_0x001c:
            r5 = move-exception
            throw r5
        L_0x001e:
            if (r5 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == r1) goto L_0x0026
            goto L_0x004c
        L_0x0026:
            int r0 = getMax     // Catch:{ Exception -> 0x008e }
            int r0 = r0 + 23
            int r3 = r0 % 128
            getMin = r3     // Catch:{ Exception -> 0x008e }
            int r0 = r0 % 2
            r3 = 35
            if (r0 != 0) goto L_0x0037
            r0 = 35
            goto L_0x0039
        L_0x0037:
            r0 = 58
        L_0x0039:
            r4 = 0
            if (r0 == r3) goto L_0x0043
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x008e }
            if (r0 == 0) goto L_0x004d
            goto L_0x004c
        L_0x0043:
            boolean r0 = r5.isEmpty()
            super.hashCode()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            return r7
        L_0x004d:
            boolean r0 = r5.containsKey(r6)
            if (r0 != 0) goto L_0x0064
            int r5 = getMin
            int r5 = r5 + 99
            int r6 = r5 % 128
            getMax = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0063
            int r5 = r4.length     // Catch:{ all -> 0x0061 }
            return r7
        L_0x0061:
            r5 = move-exception
            throw r5
        L_0x0063:
            return r7
        L_0x0064:
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x0074
            r7 = r5
            goto L_0x0074
        L_0x006c:
            r5 = move-exception
            java.lang.String r6 = "Ariver"
            java.lang.String r0 = "getString exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r6, r0, r5)
        L_0x0074:
            int r5 = getMax
            int r5 = r5 + 63
            int r6 = r5 % 128
            getMin = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0082
            r5 = 0
            goto L_0x0083
        L_0x0082:
            r5 = 1
        L_0x0083:
            if (r5 == r1) goto L_0x008b
            r5 = 84
            int r5 = r5 / r2
            return r7
        L_0x0089:
            r5 = move-exception
            throw r5
        L_0x008b:
            return r7
        L_0x008c:
            r5 = move-exception
            throw r5
        L_0x008e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.getString(com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z) {
        int i = getMax + 67;
        getMin = i % 128;
        int i2 = i % 2;
        if ((jSONObject != null ? '9' : '*') == '9') {
            if ((jSONObject.isEmpty() ? '+' : 'K') != '+') {
                try {
                    if (!jSONObject.containsKey(str)) {
                        int i3 = getMax + 121;
                        getMin = i3 % 128;
                        int i4 = i3 % 2;
                        return z;
                    }
                    try {
                        return jSONObject.getBooleanValue(str);
                    } catch (Throwable unused) {
                        return z;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        return z;
    }

    public static int getInt(JSONObject jSONObject, String str) {
        try {
            int i = getMax + 75;
            getMin = i % 128;
            int i2 = i % 2;
            int i3 = getInt(jSONObject, str, 0);
            int i4 = getMin + 45;
            getMax = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r0 != true) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if ((r4.isEmpty() ? 9 : 'c') != 'c') goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getInt(com.alibaba.fastjson.JSONObject r4, java.lang.String r5, int r6) {
        /*
            int r0 = getMin
            int r0 = r0 + 15
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0010
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            if (r2 == r1) goto L_0x005d
            int r2 = getMax
            int r2 = r2 + 73
            int r3 = r2 % 128
            getMin = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L_0x002e
            boolean r2 = r4.isEmpty()
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x002c }
            if (r2 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == r1) goto L_0x003e
            goto L_0x005d
        L_0x002c:
            r4 = move-exception
            throw r4
        L_0x002e:
            boolean r0 = r4.isEmpty()
            r1 = 99
            if (r0 == 0) goto L_0x0039
            r0 = 9
            goto L_0x003b
        L_0x0039:
            r0 = 99
        L_0x003b:
            if (r0 == r1) goto L_0x003e
            goto L_0x005d
        L_0x003e:
            boolean r0 = r4.containsKey(r5)
            r1 = 89
            if (r0 != 0) goto L_0x0049
            r0 = 89
            goto L_0x004b
        L_0x0049:
            r0 = 83
        L_0x004b:
            if (r0 == r1) goto L_0x0053
            int r4 = r4.getIntValue(r5)     // Catch:{ all -> 0x0052 }
            return r4
        L_0x0052:
            return r6
        L_0x0053:
            int r4 = getMax
            int r4 = r4 + 51
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % 2
        L_0x005d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.getInt(com.alibaba.fastjson.JSONObject, java.lang.String, int):int");
    }

    public static long getLong(JSONObject jSONObject, String str) {
        try {
            int i = getMax + 11;
            getMin = i % 128;
            int i2 = i % 2;
            try {
                long j = getLong(jSONObject, str, 0);
                int i3 = getMax + 75;
                getMin = i3 % 128;
                if ((i3 % 2 == 0 ? 22 : ':') == ':') {
                    return j;
                }
                Object obj = null;
                super.hashCode();
                return j;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static long getLong(JSONObject jSONObject, String str, long j) {
        if ((jSONObject != null ? 'M' : Typography.less) != 'M' || jSONObject.isEmpty()) {
            return j;
        }
        if (!jSONObject.containsKey(str)) {
            int i = getMin + 37;
            getMax = i % 128;
            char c = 9;
            if ((i % 2 != 0 ? (char) 12 : 9) == 12) {
                Object obj = null;
                super.hashCode();
            }
            try {
                int i2 = getMin + 47;
                getMax = i2 % 128;
                if (i2 % 2 == 0) {
                    c = 'N';
                }
                if (c == 'N') {
                    return j;
                }
                int i3 = 52 / 0;
                return j;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                return jSONObject.getLongValue(str);
            } catch (Throwable unused) {
                return j;
            }
        }
    }

    public static float getFloat(JSONObject jSONObject, String str) {
        int i = getMin + 109;
        getMax = i % 128;
        int i2 = i % 2;
        try {
            float f = getFloat(jSONObject, str, 0.0f);
            int i3 = getMax + 33;
            getMin = i3 % 128;
            if (i3 % 2 != 0) {
                return f;
            }
            int i4 = 94 / 0;
            return f;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r2 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if ((r2 != null ? '[' : 'B') != '[') goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float getFloat(com.alibaba.fastjson.JSONObject r2, java.lang.String r3, float r4) {
        /*
            int r0 = getMin
            int r0 = r0 + 3
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x001c
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x001a }
            r0 = 91
            if (r2 == 0) goto L_0x0015
            r1 = 91
            goto L_0x0017
        L_0x0015:
            r1 = 66
        L_0x0017:
            if (r1 == r0) goto L_0x001e
            goto L_0x0050
        L_0x001a:
            r2 = move-exception
            throw r2
        L_0x001c:
            if (r2 == 0) goto L_0x0050
        L_0x001e:
            boolean r0 = r2.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0027
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 == r1) goto L_0x002b
            goto L_0x0050
        L_0x002b:
            boolean r0 = r2.containsKey(r3)     // Catch:{ Exception -> 0x004e }
            if (r0 != 0) goto L_0x0048
            int r2 = getMax     // Catch:{ Exception -> 0x0046 }
            int r2 = r2 + 101
            int r3 = r2 % 128
            getMin = r3     // Catch:{ Exception -> 0x004e }
            int r2 = r2 % 2
            int r2 = getMin
            int r2 = r2 + 5
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % 2
            return r4
        L_0x0046:
            r2 = move-exception
            throw r2
        L_0x0048:
            float r2 = r2.getFloatValue(r3)     // Catch:{ all -> 0x004d }
            return r2
        L_0x004d:
            return r4
        L_0x004e:
            r2 = move-exception
            throw r2
        L_0x0050:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.getFloat(com.alibaba.fastjson.JSONObject, java.lang.String, float):float");
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        int i = getMin + 125;
        getMax = i % 128;
        int i2 = i % 2;
        boolean z = false;
        if (jSONObject != null) {
            try {
                if (!jSONObject.isEmpty()) {
                    if (!jSONObject.containsKey(str)) {
                        z = true;
                    }
                    if (z) {
                        return jSONObject2;
                    }
                    try {
                        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                        int i3 = getMax + 35;
                        getMin = i3 % 128;
                        if ((i3 % 2 == 0 ? '\'' : '*') == '*') {
                            return jSONObject3;
                        }
                        Object[] objArr = null;
                        int length = objArr.length;
                        return jSONObject3;
                    } catch (Throwable unused) {
                        return jSONObject2;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i4 = getMax + 17;
            getMin = i4 % 128;
            if ((i4 % 2 == 0 ? 'Q' : ',') == ',') {
                return jSONObject2;
            }
            int i5 = 10 / 0;
            return jSONObject2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r1 != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r2 != true) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.fastjson.JSONArray getJSONArray(com.alibaba.fastjson.JSONObject r3, java.lang.String r4, com.alibaba.fastjson.JSONArray r5) {
        /*
            int r0 = getMin
            int r0 = r0 + 115
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0 = 12
            int r0 = r0 / r2
            if (r3 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            if (r2 == r1) goto L_0x0026
            goto L_0x0020
        L_0x0018:
            r3 = move-exception
            throw r3
        L_0x001a:
            if (r3 == 0) goto L_0x001d
            r1 = 0
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            goto L_0x0026
        L_0x0020:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x003e
        L_0x0026:
            int r3 = getMax     // Catch:{ Exception -> 0x003c }
            int r3 = r3 + 119
            int r4 = r3 % 128
            getMin = r4     // Catch:{ Exception -> 0x003a }
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0039
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x0037 }
            return r5
        L_0x0037:
            r3 = move-exception
            throw r3
        L_0x0039:
            return r5
        L_0x003a:
            r3 = move-exception
            throw r3
        L_0x003c:
            r3 = move-exception
            goto L_0x004b
        L_0x003e:
            boolean r0 = r3.containsKey(r4)
            if (r0 != 0) goto L_0x0045
            return r5
        L_0x0045:
            com.alibaba.fastjson.JSONArray r3 = r3.getJSONArray(r4)     // Catch:{ all -> 0x004a }
            return r3
        L_0x004a:
            return r5
        L_0x004b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.getJSONArray(com.alibaba.fastjson.JSONObject, java.lang.String, com.alibaba.fastjson.JSONArray):com.alibaba.fastjson.JSONArray");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if ((r0 ? 'H' : ']') != ']') goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if ((r3.isEmpty() ? (char) 28 : 23) != 23) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T getValue(com.alibaba.fastjson.JSONObject r3, java.lang.String r4, T r5) {
        /*
            if (r3 == 0) goto L_0x0059
            int r0 = getMin     // Catch:{ Exception -> 0x0057 }
            int r0 = r0 + 47
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x0057 }
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0024
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x0057 }
            super.hashCode()     // Catch:{ all -> 0x0022 }
            r2 = 93
            if (r0 == 0) goto L_0x001d
            r0 = 72
            goto L_0x001f
        L_0x001d:
            r0 = 93
        L_0x001f:
            if (r0 == r2) goto L_0x0034
            goto L_0x0059
        L_0x0022:
            r3 = move-exception
            throw r3
        L_0x0024:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x0057 }
            r2 = 23
            if (r0 == 0) goto L_0x002f
            r0 = 28
            goto L_0x0031
        L_0x002f:
            r0 = 23
        L_0x0031:
            if (r0 == r2) goto L_0x0034
            goto L_0x0059
        L_0x0034:
            boolean r0 = r3.containsKey(r4)
            if (r0 != 0) goto L_0x0052
            int r3 = getMax
            int r3 = r3 + 9
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0048
            r3 = 0
            goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            if (r3 == 0) goto L_0x004c
            return r5
        L_0x004c:
            super.hashCode()     // Catch:{ all -> 0x0050 }
            return r5
        L_0x0050:
            r3 = move-exception
            throw r3
        L_0x0052:
            java.lang.Object r3 = r3.get(r4)
            return r3
        L_0x0057:
            r3 = move-exception
            throw r3
        L_0x0059:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.getValue(com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.alibaba.fastjson.JSONObject] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r7 != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        if ((r6 instanceof com.alibaba.fastjson.JSONArray ? 8 : com.alibaba.fastjson.parser.JSONLexer.EOI) != 26) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if ((r6 instanceof com.alibaba.fastjson.JSONObject) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        if (r7 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        r7 = getMin + 57;
        getMax = r7 % 128;
        r7 = r7 % 2;
        r2.put(r5, (java.lang.Object) deepCopy((com.alibaba.fastjson.JSONObject) r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.put(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        r5 = getMax + 45;
        getMin = r5 % 128;
        r5 = r5 % 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.fastjson.JSONObject deepCopy(com.alibaba.fastjson.JSONObject r9) {
        /*
            int r0 = getMin
            int r0 = r0 + 11
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0010
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            r3 = 0
            if (r2 == 0) goto L_0x00a0
            com.alibaba.fastjson.JSONObject r2 = new com.alibaba.fastjson.JSONObject
            r2.<init>()
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0021:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x009f
            int r5 = getMax     // Catch:{ Exception -> 0x009d }
            int r5 = r5 + 77
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x009b }
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x0045
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.get(r5)
            boolean r7 = r6 instanceof com.alibaba.fastjson.JSONArray
            int r8 = r3.length     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x0070
            goto L_0x005c
        L_0x0043:
            r9 = move-exception
            throw r9
        L_0x0045:
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r9.get(r5)
            boolean r7 = r6 instanceof com.alibaba.fastjson.JSONArray
            r8 = 26
            if (r7 == 0) goto L_0x0058
            r7 = 8
            goto L_0x005a
        L_0x0058:
            r7 = 26
        L_0x005a:
            if (r7 == r8) goto L_0x0070
        L_0x005c:
            com.alibaba.fastjson.JSONArray r6 = (com.alibaba.fastjson.JSONArray) r6
            com.alibaba.fastjson.JSONArray r6 = deepCopy((com.alibaba.fastjson.JSONArray) r6)
            r2.put((java.lang.String) r5, (java.lang.Object) r6)
            int r5 = getMax     // Catch:{ Exception -> 0x009b }
            int r5 = r5 + 65
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x009b }
            int r5 = r5 % 2
            goto L_0x0021
        L_0x0070:
            boolean r7 = r6 instanceof com.alibaba.fastjson.JSONObject
            if (r7 == 0) goto L_0x0076
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            if (r7 == 0) goto L_0x008d
            int r7 = getMin
            int r7 = r7 + 57
            int r8 = r7 % 128
            getMax = r8
            int r7 = r7 % 2
            com.alibaba.fastjson.JSONObject r6 = (com.alibaba.fastjson.JSONObject) r6
            com.alibaba.fastjson.JSONObject r6 = deepCopy((com.alibaba.fastjson.JSONObject) r6)
            r2.put((java.lang.String) r5, (java.lang.Object) r6)
            goto L_0x0021
        L_0x008d:
            r2.put((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ Exception -> 0x009d }
            int r5 = getMax
            int r5 = r5 + 45
            int r6 = r5 % 128
            getMin = r6
            int r5 = r5 % 2
            goto L_0x0021
        L_0x009b:
            r9 = move-exception
            throw r9
        L_0x009d:
            r9 = move-exception
            throw r9
        L_0x009f:
            return r2
        L_0x00a0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.deepCopy(com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.alibaba.fastjson.JSONArray] */
    public static JSONArray deepCopy(JSONArray jSONArray) {
        int i = getMin + 91;
        getMax = i % 128;
        int i2 = i % 2;
        ? r0 = 0;
        if (jSONArray == null) {
            return r0;
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator<Object> it = jSONArray.iterator();
        while (true) {
            if ((it.hasNext() ? '9' : '/') != '9') {
                return jSONArray2;
            }
            int i3 = getMax + 105;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            Object next = it.next();
            if ((next instanceof JSONArray ? ';' : 31) != 31) {
                int i5 = getMin + 25;
                getMax = i5 % 128;
                int i6 = i5 % 2;
                try {
                    jSONArray2.add(deepCopy((JSONArray) next));
                } catch (Exception e) {
                    throw e;
                }
            } else {
                if (!(!(next instanceof JSONObject))) {
                    int i7 = getMin + 19;
                    getMax = i7 % 128;
                    if (i7 % 2 != 0) {
                        jSONArray2.add(deepCopy((JSONObject) next));
                        int length = r0.length;
                    } else {
                        try {
                            jSONArray2.add(deepCopy((JSONObject) next));
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                } else {
                    jSONArray2.add(next);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if ((r5 != null ? ',' : kotlin.text.Typography.amp) != '&') goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if ((r5 != null ? 'M' : '0') != 'M') goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.util.Map<java.lang.String, T> jsonToMap(com.alibaba.fastjson.JSONObject r5, java.util.Map<java.lang.String, T> r6) {
        /*
            int r0 = getMin
            int r0 = r0 + 49
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x001c
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x001a }
            r0 = 77
            if (r5 == 0) goto L_0x0015
            r1 = 77
            goto L_0x0017
        L_0x0015:
            r1 = 48
        L_0x0017:
            if (r1 == r0) goto L_0x0027
            goto L_0x007c
        L_0x001a:
            r5 = move-exception
            throw r5
        L_0x001c:
            r0 = 38
            if (r5 == 0) goto L_0x0023
            r1 = 44
            goto L_0x0025
        L_0x0023:
            r1 = 38
        L_0x0025:
            if (r1 == r0) goto L_0x007c
        L_0x0027:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x002e
            goto L_0x007c
        L_0x002e:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0076 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0045
            r1 = 0
            goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            goto L_0x007c
        L_0x0049:
            int r1 = getMin
            int r1 = r1 + 39
            int r4 = r1 % 128
            getMax = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0056
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0076 }
            java.lang.Object r2 = r5.get(r1)     // Catch:{ all -> 0x0076 }
            r6.put(r1, r2)     // Catch:{ all -> 0x0076 }
            goto L_0x003b
        L_0x0066:
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0076 }
            java.lang.Object r2 = r5.get(r1)     // Catch:{ all -> 0x0076 }
            r6.put(r1, r2)     // Catch:{ all -> 0x0076 }
            r1 = 6
            int r1 = r1 / r3
            goto L_0x003b
        L_0x0076:
            r5 = move-exception
            java.lang.String r0 = "Ariver"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.Throwable) r5)
        L_0x007c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.JSONUtils.jsonToMap(com.alibaba.fastjson.JSONObject, java.util.Map):java.util.Map");
    }

    public static Integer getColorInt(JSONObject jSONObject, String str) {
        if ((jSONObject == null ? 9 : 'P') != 'P') {
            return null;
        }
        try {
            Object obj = jSONObject.get(str);
            if ((obj == null ? Typography.quote : ';') != ';') {
                try {
                    int i = getMin + 57;
                    getMax = i % 128;
                    int i2 = i % 2;
                    int i3 = getMin + 123;
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                    return null;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                Integer parseColorInt = TypeUtils.parseColorInt(obj);
                int i5 = getMin + 63;
                getMax = i5 % 128;
                int i6 = i5 % 2;
                return parseColorInt;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Long] */
    public static Long getColorLong(JSONObject jSONObject, String str) {
        int i = getMax + 13;
        getMin = i % 128;
        int i2 = i % 2;
        ? r2 = 0;
        if ((jSONObject == null ? (char) 29 : 8) != 8) {
            int i3 = getMin + 121;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return r2;
        }
        Object obj = jSONObject.get(str);
        if (obj == null) {
            int i5 = getMax + 83;
            getMin = i5 % 128;
            if (i5 % 2 != 0) {
                return r2;
            }
            int length = r2.length;
            return r2;
        }
        try {
            return TypeUtils.parseColorLong(obj);
        } catch (Exception e) {
            throw e;
        }
    }

    public static byte[] marshallJSONObject(JSONObject jSONObject) {
        if (!(jSONObject == null)) {
            try {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeSerializable(jSONObject);
                    byte[] marshall = obtain.marshall();
                    try {
                        int i = getMin + 83;
                        getMax = i % 128;
                        int i2 = i % 2;
                        return marshall;
                    } catch (Exception e) {
                        throw e;
                    }
                } finally {
                    obtain.recycle();
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i3 = getMax + 85;
            getMin = i3 % 128;
            if (i3 % 2 == 0) {
            }
            return new byte[0];
        }
    }

    public static JSONObject unmarshallJSONObject(byte[] bArr) {
        int i = getMax + 87;
        getMin = i % 128;
        int i2 = i % 2;
        if (!(bArr == null)) {
            try {
                int i3 = getMax + 63;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                if (bArr.length != 0) {
                    Parcel obtain = Parcel.obtain();
                    JSONObject jSONObject = null;
                    try {
                        obtain.unmarshall(bArr, 0, bArr.length);
                        obtain.setDataPosition(0);
                        JSONObject jSONObject2 = (JSONObject) obtain.readSerializable();
                        obtain.recycle();
                        jSONObject = jSONObject2;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                    int i5 = getMax + 85;
                    getMin = i5 % 128;
                    int i6 = i5 % 2;
                    return jSONObject;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return new JSONObject();
    }

    public static byte[] marshallJSONArray(JSONArray jSONArray) {
        int i = getMax + 21;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            Parcel obtain = Parcel.obtain();
            byte[] bArr = null;
            try {
                obtain.writeSerializable(jSONArray);
                bArr = obtain.marshall();
                int i3 = getMax + 9;
                getMin = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                RVLogger.e("AriverKernel", "marshallJSONArray", th);
            } finally {
                obtain.recycle();
            }
            return bArr;
        } catch (Exception e) {
            throw e;
        }
    }

    public static JSONArray unmarshallJSONArray(byte[] bArr) {
        int i = getMax + 33;
        getMin = i % 128;
        int i2 = i % 2;
        if (bArr != null) {
            int i3 = getMin + 47;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            if (bArr.length != 0) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    JSONArray jSONArray = (JSONArray) obtain.readSerializable();
                    obtain.recycle();
                    return jSONArray;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        try {
            int i5 = getMax + 7;
            try {
                getMin = i5 % 128;
                int i6 = i5 % 2;
                return jSONArray2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String toString(JSONObject jSONObject) {
        try {
            int i = getMax + 93;
            try {
                getMin = i % 128;
                int i2 = i % 2;
                boolean z = false;
                if (jSONObject != null) {
                    return jSONObject.toString();
                }
                int i3 = getMin + 85;
                getMax = i3 % 128;
                if (i3 % 2 != 0) {
                    z = true;
                }
                if (!z) {
                    return "";
                }
                Object[] objArr = null;
                int length = objArr.length;
                return "";
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String getMin(int i, int[] iArr) {
        int i2;
        int[] iArr2;
        char[] cArr;
        char[] cArr2;
        int i3 = getMax + 93;
        getMin = i3 % 128;
        if ((i3 % 2 == 0 ? 17 : Typography.greater) != '>') {
            cArr2 = new char[3];
            cArr = new char[(iArr.length % 0)];
            iArr2 = (int[]) setMax.clone();
            i2 = 1;
        } else {
            cArr2 = new char[4];
            cArr = new char[(iArr.length << 1)];
            iArr2 = (int[]) setMax.clone();
            i2 = 0;
        }
        while (true) {
            if (!(i2 < iArr.length)) {
                return new String(cArr, 0, i);
            }
            int i4 = getMin + 21;
            getMax = i4 % 128;
            int i5 = i4 % 2;
            cArr2[0] = (char) (iArr[i2] >> 16);
            cArr2[1] = (char) iArr[i2];
            int i6 = i2 + 1;
            cArr2[2] = (char) (iArr[i6] >> 16);
            cArr2[3] = (char) iArr[i6];
            onActivityPostResumed.getMin(cArr2, iArr2, false);
            int i7 = i2 << 1;
            cArr[i7] = cArr2[0];
            cArr[i7 + 1] = cArr2[1];
            cArr[i7 + 2] = cArr2[2];
            cArr[i7 + 3] = cArr2[3];
            i2 += 2;
        }
    }
}
