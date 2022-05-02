package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzkr implements Parcelable.Creator<zzkq> {
    static void zza(zzkq zzkq, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, zzkq.zza);
        SafeParcelWriter.writeString(parcel, 2, zzkq.zzb, false);
        SafeParcelWriter.writeLong(parcel, 3, zzkq.zzc);
        SafeParcelWriter.writeLongObject(parcel, 4, zzkq.zzd, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, (Float) null, false);
        SafeParcelWriter.writeString(parcel, 6, zzkq.zze, false);
        SafeParcelWriter.writeString(parcel, 7, zzkq.zzf, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, zzkq.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 3:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 4:
                    l = SafeParcelReader.readLongObject(parcel2, readHeader);
                    break;
                case 5:
                    f = SafeParcelReader.readFloatObject(parcel2, readHeader);
                    break;
                case 6:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 7:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 8:
                    d = SafeParcelReader.readDoubleObject(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzkq(i, str, j, l, f, str2, str3, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzkq[i];
    }
}
