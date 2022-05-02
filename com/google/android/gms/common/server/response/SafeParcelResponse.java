package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
@VisibleForTesting
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zap();
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getParcel", id = 2)
    private final Parcel zab;
    private final int zac;
    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final zal zad;
    @Nullable
    private final String zae;
    private int zaf;
    private int zag;

    public SafeParcelResponse(zal zal, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zal) Preconditions.checkNotNull(zal);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zal zal, String str) {
        this.zaa = 1;
        Parcel obtain = Parcel.obtain();
        this.zab = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.zac = 1;
        this.zad = (zal) Preconditions.checkNotNull(zal);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t) {
        zal zal = new zal(t.getClass());
        zaa(zal, t);
        zal.zab();
        zal.zaa();
        return new SafeParcelResponse((SafeParcelable) t, zal, (String) Preconditions.checkNotNull(t.getClass().getCanonicalName()));
    }

    private static void zaa(zal zal, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (!zal.zaa((Class<? extends FastJsonResponse>) cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
            zal.zaa(cls, fieldMappings);
            for (String str : fieldMappings.keySet()) {
                FastJsonResponse.Field field = fieldMappings.get(str);
                Class<? extends FastJsonResponse> cls2 = field.zag;
                if (cls2 != null) {
                    try {
                        zaa(zal, (FastJsonResponse) cls2.newInstance());
                    } catch (InstantiationException e) {
                        String valueOf = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                        throw new IllegalStateException(valueOf.length() != 0 ? "Could not instantiate an object of type ".concat(valueOf) : new String("Could not instantiate an object of type "), e);
                    } catch (IllegalAccessException e2) {
                        String valueOf2 = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                        throw new IllegalStateException(valueOf2.length() != 0 ? "Could not access object of type ".concat(valueOf2) : new String("Could not access object of type "), e2);
                    }
                }
            }
        }
    }

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zal zal) {
        this.zaa = i;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zal;
        if (zal == null) {
            this.zae = null;
        } else {
            this.zae = zal.zac();
        }
        this.zaf = 2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zal zal;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcel(parcel, 2, zaa(), false);
        int i2 = this.zac;
        if (i2 == 0) {
            zal = null;
        } else if (i2 == 1) {
            zal = this.zad;
        } else if (i2 == 2) {
            zal = this.zad;
        } else {
            int i3 = this.zac;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        SafeParcelWriter.writeParcelable(parcel, 3, zal, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Parcel zaa() {
        /*
            r2 = this;
            int r0 = r2.zaf
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.zab
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r0)
            r2.zag = r0
        L_0x0010:
            android.os.Parcel r0 = r2.zab
            int r1 = r2.zag
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r0, r1)
            r0 = 2
            r2.zaf = r0
        L_0x001a:
            android.os.Parcel r0 = r2.zab
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.zaa():android.os.Parcel");
    }

    @Nullable
    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zal zal = this.zad;
        if (zal == null) {
            return null;
        }
        return zal.zaa((String) Preconditions.checkNotNull(this.zae));
    }

    public Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    private final void zaa(FastJsonResponse.Field<?, ?> field) {
        if (field.zaf != -1) {
            Parcel parcel = this.zab;
            if (parcel != null) {
                int i = this.zaf;
                if (i == 0) {
                    this.zag = SafeParcelWriter.beginObjectHeader(parcel);
                    this.zaf = 1;
                } else if (i == 1) {
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
                    }
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    /* access modifiers changed from: protected */
    public void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i) {
        zaa(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i);
    }

    /* access modifiers changed from: protected */
    public final void zaa(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<Integer> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = arrayList.get(i).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaa(FastJsonResponse.Field<?, ?> field, String str, @Nullable BigInteger bigInteger) {
        zaa(field);
        SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    /* access modifiers changed from: protected */
    public final void zab(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<BigInteger> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    /* access modifiers changed from: protected */
    public void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j) {
        zaa(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j);
    }

    /* access modifiers changed from: protected */
    public final void zac(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<Long> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = arrayList.get(i).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaa(FastJsonResponse.Field<?, ?> field, String str, float f) {
        zaa(field);
        SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f);
    }

    /* access modifiers changed from: protected */
    public final void zad(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<Float> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList.get(i).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaa(FastJsonResponse.Field<?, ?> field, String str, double d) {
        zaa(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d);
    }

    /* access modifiers changed from: protected */
    public final void zae(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<Double> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaa(FastJsonResponse.Field<?, ?> field, String str, @Nullable BigDecimal bigDecimal) {
        zaa(field);
        SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    public final void zaf(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<BigDecimal> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    /* access modifiers changed from: protected */
    public void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z) {
        zaa(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z);
    }

    /* access modifiers changed from: protected */
    public final void zag(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<Boolean> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = arrayList.get(i).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    /* access modifiers changed from: protected */
    public void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, @Nullable String str2) {
        zaa(field);
        SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    /* access modifiers changed from: protected */
    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<String> arrayList) {
        zaa(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    /* access modifiers changed from: protected */
    public void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, @Nullable byte[] bArr) {
        zaa(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    /* access modifiers changed from: protected */
    public void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, @Nullable Map<String, String> map) {
        zaa(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t) {
        zaa(field);
        SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t).zaa(), true);
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> field, String str, @Nullable ArrayList<T> arrayList) {
        zaa(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) obj)).zaa());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    public String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel zaa2 = zaa();
        zaa2.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zaa(sb, (Map<String, FastJsonResponse.Field<?, ?>>) (Map) Preconditions.checkNotNull(this.zad.zaa((String) Preconditions.checkNotNull(this.zae))), zaa2);
        return sb.toString();
    }

    private final void zaa(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).getSafeParcelableFieldId(), next);
        }
        sb.append('{');
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(readHeader));
            if (entry != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.zab()) {
                    switch (field.zac) {
                        case 0:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) Integer.valueOf(SafeParcelReader.readInt(parcel, readHeader))));
                            break;
                        case 1:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) SafeParcelReader.createBigInteger(parcel, readHeader)));
                            break;
                        case 2:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) Long.valueOf(SafeParcelReader.readLong(parcel, readHeader))));
                            break;
                        case 3:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) Float.valueOf(SafeParcelReader.readFloat(parcel, readHeader))));
                            break;
                        case 4:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) Double.valueOf(SafeParcelReader.readDouble(parcel, readHeader))));
                            break;
                        case 5:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) SafeParcelReader.createBigDecimal(parcel, readHeader)));
                            break;
                        case 6:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) Boolean.valueOf(SafeParcelReader.readBoolean(parcel, readHeader))));
                            break;
                        case 7:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) SafeParcelReader.createString(parcel, readHeader)));
                            break;
                        case 8:
                        case 9:
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) SafeParcelReader.createByteArray(parcel, readHeader)));
                            break;
                        case 10:
                            Bundle createBundle = SafeParcelReader.createBundle(parcel, readHeader);
                            HashMap hashMap = new HashMap();
                            for (String str : createBundle.keySet()) {
                                hashMap.put(str, (String) Preconditions.checkNotNull(createBundle.getString(str)));
                            }
                            zaa(sb, (FastJsonResponse.Field<?, ?>) field, zaa(field, (Object) hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.zac;
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.zad) {
                    sb.append("[");
                    switch (field.zac) {
                        case 0:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createIntArray(parcel, readHeader));
                            break;
                        case 1:
                            ArrayUtils.writeArray(sb, (T[]) SafeParcelReader.createBigIntegerArray(parcel, readHeader));
                            break;
                        case 2:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createLongArray(parcel, readHeader));
                            break;
                        case 3:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createFloatArray(parcel, readHeader));
                            break;
                        case 4:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createDoubleArray(parcel, readHeader));
                            break;
                        case 5:
                            ArrayUtils.writeArray(sb, (T[]) SafeParcelReader.createBigDecimalArray(parcel, readHeader));
                            break;
                        case 6:
                            ArrayUtils.writeArray(sb, SafeParcelReader.createBooleanArray(parcel, readHeader));
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb, SafeParcelReader.createStringArray(parcel, readHeader));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] createParcelArray = SafeParcelReader.createParcelArray(parcel, readHeader);
                            int length = createParcelArray.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                createParcelArray[i2].setDataPosition(0);
                                zaa(sb, field.zad(), createParcelArray[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.zac) {
                        case 0:
                            sb.append(SafeParcelReader.readInt(parcel, readHeader));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.createBigInteger(parcel, readHeader));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.readLong(parcel, readHeader));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.readFloat(parcel, readHeader));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.readDouble(parcel, readHeader));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.createBigDecimal(parcel, readHeader));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.readBoolean(parcel, readHeader));
                            break;
                        case 7:
                            String createString = SafeParcelReader.createString(parcel, readHeader);
                            sb.append("\"");
                            sb.append(JsonUtils.escapeString(createString));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] createByteArray = SafeParcelReader.createByteArray(parcel, readHeader);
                            sb.append("\"");
                            sb.append(Base64Utils.encode(createByteArray));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] createByteArray2 = SafeParcelReader.createByteArray(parcel, readHeader);
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe(createByteArray2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle createBundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                            Set<String> keySet = createBundle2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(JsonUtils.escapeString(createBundle2.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel createParcel = SafeParcelReader.createParcel(parcel, readHeader);
                            createParcel.setDataPosition(0);
                            zaa(sb, field.zad(), createParcel);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(validateObjectHeader);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    private final void zaa(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.zab) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                zaa(sb, field.zaa, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        zaa(sb, field.zaa, obj);
    }

    private static void zaa(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }
}
