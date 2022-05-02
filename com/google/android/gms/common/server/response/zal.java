package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zam();
    @SafeParcelable.VersionField(id = 1)
    private final int zaa;
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> zab;
    @SafeParcelable.Field(getter = "getSerializedDictionary", id = 2)
    @Nullable
    private final ArrayList<zak> zac;
    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String zad;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zak> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.zaa = i;
        this.zac = null;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zak zak = arrayList.get(i2);
            String str2 = zak.zaa;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zak.zab)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zan zan = zak.zab.get(i3);
                hashMap2.put(zan.zaa, zan.zab);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zab = hashMap;
        this.zad = (String) Preconditions.checkNotNull(str);
        zaa();
    }

    public final void zaa() {
        for (String str : this.zab.keySet()) {
            Map map = this.zab.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).zaa(this);
            }
        }
    }

    public final void zab() {
        for (String next : this.zab.keySet()) {
            Map map = this.zab.get(next);
            HashMap hashMap = new HashMap();
            for (String str : map.keySet()) {
                hashMap.put(str, ((FastJsonResponse.Field) map.get(str)).zaa());
            }
            this.zab.put(next, hashMap);
        }
    }

    public zal(Class<? extends FastJsonResponse> cls) {
        this.zaa = 1;
        this.zac = null;
        this.zab = new HashMap<>();
        this.zad = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }

    public final void zaa(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        this.zab.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> zaa(String str) {
        return this.zab.get(str);
    }

    public final boolean zaa(Class<? extends FastJsonResponse> cls) {
        return this.zab.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public final String zac() {
        return this.zad;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.zab.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.zab.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        ArrayList arrayList = new ArrayList();
        for (String next : this.zab.keySet()) {
            arrayList.add(new zak(next, this.zab.get(next)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.zad, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
