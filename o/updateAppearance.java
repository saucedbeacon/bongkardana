package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class updateAppearance {
    public static final updateAppearance length;
    private static final String setMax = setSupportBackgroundTintList.length("Data");
    public Map<String, Object> setMin;

    static {
        updateAppearance updateappearance = new updateAppearance((Map<String, ?>) new getMin().length);
        setMax(updateappearance);
        length = updateappearance;
    }

    updateAppearance() {
    }

    public updateAppearance(@NonNull updateAppearance updateappearance) {
        this.setMin = new HashMap(updateappearance.setMin);
    }

    public updateAppearance(@NonNull Map<String, ?> map) {
        this.setMin = new HashMap(map);
    }

    public final boolean getMin(@NonNull String str) {
        Object obj = this.setMin.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    @Nullable
    public final boolean[] length(@NonNull String str) {
        Object obj = this.setMin.get(str);
        if (!(obj instanceof Boolean[])) {
            return null;
        }
        Boolean[] boolArr = (Boolean[]) obj;
        boolean[] zArr = new boolean[boolArr.length];
        for (int i = 0; i < boolArr.length; i++) {
            zArr[i] = boolArr[i].booleanValue();
        }
        return zArr;
    }

    @Nullable
    public final int[] setMax(@NonNull String str) {
        Object obj = this.setMin.get(str);
        if (!(obj instanceof Integer[])) {
            return null;
        }
        Integer[] numArr = (Integer[]) obj;
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|(2:34|35)|36|37|39) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|21|24|25|(0)|29|30|31) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|(2:7|5)|8|9|10|11|13|(2:15|16)(2:17|18)) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[SYNTHETIC, Splitter:B:27:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e A[SYNTHETIC, Splitter:B:34:0x006e] */
    @androidx.room.TypeConverter
    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] setMax(@androidx.annotation.NonNull o.updateAppearance r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x005f }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.setMin     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            int r1 = r1.size()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.setMin     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
        L_0x001e:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            goto L_0x001e
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r0.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x0050
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x0058:
            r4 = move-exception
            r1 = r2
            goto L_0x006c
        L_0x005b:
            r1 = r2
            goto L_0x005f
        L_0x005d:
            r4 = move-exception
            goto L_0x006c
        L_0x005f:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r0.close()     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            return r4
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            r0.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            goto L_0x0076
        L_0x0075:
            throw r4
        L_0x0076:
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: o.updateAppearance.setMax(o.updateAppearance):byte[]");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043 A[SYNTHETIC, Splitter:B:28:0x0043] */
    @androidx.room.TypeConverter
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.updateAppearance setMin(@androidx.annotation.NonNull byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x0047
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = r2
            goto L_0x0041
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
        L_0x0041:
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0047:
            o.updateAppearance r5 = new o.updateAppearance
            r5.<init>((java.util.Map<java.lang.String, ?>) r0)
            return r5
        L_0x004d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            goto L_0x0056
        L_0x0055:
            throw r5
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: o.updateAppearance.setMin(byte[]):o.updateAppearance");
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        updateAppearance updateappearance = (updateAppearance) obj;
        Set<String> keySet = this.setMin.keySet();
        if (!keySet.equals(updateappearance.setMin.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.setMin.get(next);
            Object obj3 = updateappearance.setMin.get(next);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.setMin.hashCode() * 31;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.setMin.isEmpty()) {
            for (String next : this.setMin.keySet()) {
                sb.append(next);
                sb.append(" : ");
                Object obj = this.setMin.get(next);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @NonNull
    static Boolean[] setMax(@NonNull boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @NonNull
    static Byte[] getMax(@NonNull byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @NonNull
    static Integer[] getMax(@NonNull int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @NonNull
    static Long[] getMin(@NonNull long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @NonNull
    static Float[] getMin(@NonNull float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @NonNull
    static Double[] length(@NonNull double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static final class getMin {
        public Map<String, Object> length = new HashMap();

        @NonNull
        public final getMin setMin(@NonNull Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                getMax((String) next.getKey(), next.getValue());
            }
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final getMin getMax(@NonNull String str, @Nullable Object obj) {
            if (obj == null) {
                this.length.put(str, (Object) null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.length.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.length.put(str, updateAppearance.setMax((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.length.put(str, updateAppearance.getMax((byte[]) obj));
                } else if (cls == int[].class) {
                    this.length.put(str, updateAppearance.getMax((int[]) obj));
                } else if (cls == long[].class) {
                    this.length.put(str, updateAppearance.getMin((long[]) obj));
                } else if (cls == float[].class) {
                    this.length.put(str, updateAppearance.getMin((float[]) obj));
                } else if (cls == double[].class) {
                    this.length.put(str, updateAppearance.length((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }
    }
}
