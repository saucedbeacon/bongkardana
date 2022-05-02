package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@KeepName
@KeepForSdk
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();
    private static final Builder zak = new zab(new String[0], (String) null);
    @SafeParcelable.VersionField(id = 1000)
    private final int zaa;
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zab;
    private Bundle zac;
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zad;
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zae;
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    @Nullable
    private final Bundle zaf;
    private int[] zag;
    private int zah;
    private boolean zai;
    private boolean zaj;

    public static class zaa extends RuntimeException {
        public zaa(String str) {
            super(str);
        }
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) @Nullable Bundle bundle) {
        this.zai = false;
        this.zaj = true;
        this.zaa = i;
        this.zab = strArr;
        this.zad = cursorWindowArr;
        this.zae = i2;
        this.zaf = bundle;
    }

    @KeepForSdk
    public static class Builder {
        /* access modifiers changed from: private */
        public final String[] zaa;
        /* access modifiers changed from: private */
        public final ArrayList<HashMap<String, Object>> zab;
        @Nullable
        private final String zac;
        private final HashMap<Object, Integer> zad;
        private boolean zae;
        @Nullable
        private String zaf;

        private Builder(String[] strArr, @Nullable String str) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
            this.zab = new ArrayList<>();
            this.zac = str;
            this.zad = new HashMap<>();
            this.zae = false;
            this.zaf = null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            /*
                r4 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r5)
                java.lang.String r0 = r4.zac
                r1 = -1
                if (r0 != 0) goto L_0x000a
            L_0x0008:
                r0 = -1
                goto L_0x002f
            L_0x000a:
                java.lang.Object r0 = r5.get(r0)
                if (r0 != 0) goto L_0x0011
                goto L_0x0008
            L_0x0011:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.zad
                java.lang.Object r2 = r2.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto L_0x002b
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.zad
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r4.zab
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r0, r3)
                goto L_0x0008
            L_0x002b:
                int r0 = r2.intValue()
            L_0x002f:
                if (r0 != r1) goto L_0x0037
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r4.zab
                r0.add(r5)
                goto L_0x0041
            L_0x0037:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.zab
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.zab
                r1.add(r0, r5)
            L_0x0041:
                r5 = 0
                r4.zae = r5
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.Builder.zaa(java.util.HashMap):com.google.android.gms.common.data.DataHolder$Builder");
        }

        @KeepForSdk
        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry next : contentValues.valueSet()) {
                hashMap.put((String) next.getKey(), next.getValue());
            }
            return zaa((HashMap<String, Object>) hashMap);
        }

        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null, (zab) null);
        }

        @KeepForSdk
        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1, (zab) null);
        }

        /* synthetic */ Builder(String[] strArr, String str, zab zab2) {
            this(strArr, (String) null);
        }
    }

    @KeepForSdk
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.zai = false;
        this.zaj = true;
        this.zaa = 1;
        this.zab = (String[]) Preconditions.checkNotNull(strArr);
        this.zad = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zae = i;
        this.zaf = bundle;
        zaa();
    }

    private DataHolder(CursorWrapper cursorWrapper, int i, Bundle bundle) {
        this(cursorWrapper.getColumnNames(), zaa(cursorWrapper), i, bundle);
    }

    @KeepForSdk
    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new CursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder, int i, @Nullable Bundle bundle) {
        this(builder.zaa, zaa(builder, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, Bundle bundle, int i2) {
        this(builder.zaa, zaa(builder, -1), i, bundle);
    }

    public final void zaa() {
        this.zac = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zab;
            if (i2 >= strArr.length) {
                break;
            }
            this.zac.putInt(strArr[i2], i2);
            i2++;
        }
        this.zag = new int[this.zad.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zad;
            if (i < cursorWindowArr.length) {
                this.zag[i] = i3;
                i3 += this.zad[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.zah = i3;
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zab, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zad, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    @KeepForSdk
    public final int getStatusCode() {
        return this.zae;
    }

    @KeepForSdk
    @Nullable
    public final Bundle getMetadata() {
        return this.zaf;
    }

    /* JADX INFO: finally extract failed */
    private static CursorWindow[] zaa(CursorWrapper cursorWrapper) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow((CursorWindow) null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            while (i < count && cursorWrapper.moveToPosition(i)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow((CursorWindow) null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i);
                    cursorWrapper.fillWindow(i, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private static CursorWindow[] zaa(Builder builder, int i) {
        List list;
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        if (i < 0 || i >= builder.zab.size()) {
            list = builder.zab;
        } else {
            list = builder.zab.subList(0, i);
        }
        int size = list.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) list.get(i2);
                boolean z2 = true;
                for (int i3 = 0; i3 < builder.zaa.length && z2; i3++) {
                    String str = builder.zaa[i3];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z2 = cursorWindow.putNull(i2, i3);
                    } else if (obj instanceof String) {
                        z2 = cursorWindow.putString((String) obj, i2, i3);
                    } else if (obj instanceof Long) {
                        z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                    } else if (obj instanceof Integer) {
                        z2 = cursorWindow.putLong((long) ((Integer) obj).intValue(), i2, i3);
                    } else if (obj instanceof Boolean) {
                        z2 = cursorWindow.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i2, i3);
                    } else if (obj instanceof byte[]) {
                        z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                    } else if (obj instanceof Double) {
                        z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                    } else if (obj instanceof Float) {
                        z2 = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                    } else {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                        sb.append("Unsupported object for column ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append(valueOf);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (z2) {
                    z = false;
                } else if (!z) {
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList.add(cursorWindow);
                    i2--;
                    z = true;
                } else {
                    throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                i2++;
            } catch (RuntimeException e) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    private final void zaa(String str, int i) {
        Bundle bundle = this.zac;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.zah) {
            throw new CursorIndexOutOfBoundsException(i, this.zah);
        }
    }

    @KeepForSdk
    public final boolean hasColumn(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(2011288261, oncanceled);
            onCancelLoad.getMin(2011288261, oncanceled);
        }
        return this.zac.containsKey(str);
    }

    @KeepForSdk
    public final long getLong(String str, int i, int i2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-884088837, oncanceled);
            onCancelLoad.getMin(-884088837, oncanceled);
        }
        zaa(str, i);
        return this.zad[i2].getLong(i, this.zac.getInt(str));
    }

    @KeepForSdk
    public final int getInteger(String str, int i, int i2) {
        zaa(str, i);
        return this.zad[i2].getInt(i, this.zac.getInt(str));
    }

    @KeepForSdk
    public final String getString(String str, int i, int i2) {
        zaa(str, i);
        return this.zad[i2].getString(i, this.zac.getInt(str));
    }

    @KeepForSdk
    public final boolean getBoolean(String str, int i, int i2) {
        zaa(str, i);
        return this.zad[i2].getLong(i, this.zac.getInt(str)) == 1;
    }

    public final float zaa(String str, int i, int i2) {
        zaa(str, i);
        return this.zad[i2].getFloat(i, this.zac.getInt(str));
    }

    public final double zab(String str, int i, int i2) {
        zaa(str, i);
        return this.zad[i2].getDouble(i, this.zac.getInt(str));
    }

    @KeepForSdk
    public final byte[] getByteArray(String str, int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1089757605, oncanceled);
            onCancelLoad.getMin(-1089757605, oncanceled);
        }
        zaa(str, i);
        return this.zad[i2].getBlob(i, this.zac.getInt(str));
    }

    public final void zaa(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zaa(str, i);
        this.zad[i2].copyStringToBuffer(i, this.zac.getInt(str), charArrayBuffer);
    }

    @KeepForSdk
    public final boolean hasNull(String str, int i, int i2) {
        zaa(str, i);
        return this.zad[i2].isNull(i, this.zac.getInt(str));
    }

    @KeepForSdk
    public final int getCount() {
        return this.zah;
    }

    @KeepForSdk
    public final int getWindowIndex(int i) {
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.zah);
        while (true) {
            int[] iArr = this.zag;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.zag.length ? i2 - 1 : i2;
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zai;
        }
        return z;
    }

    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.zai) {
                this.zai = true;
                for (CursorWindow close : this.zad) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.zaj && this.zad.length > 0 && !isClosed()) {
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null, (zab) null);
    }

    @KeepForSdk
    public static DataHolder empty(int i) {
        return new DataHolder(zak, i, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, zab zab2) {
        this(builder, i, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, int i2, zab zab2) {
        this(builder, i, bundle, -1);
    }
}
