package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

@SafeParcelable.Class(creator = "SafeBrowsingDataCreator")
@SafeParcelable.Reserved({1})
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();
    private static final String TAG = SafeBrowsingData.class.getSimpleName();
    @SafeParcelable.Field(getter = "getMetadata", id = 2)
    private String zzm;
    @SafeParcelable.Field(getter = "getBlacklistsDataHolder", id = 3)
    private DataHolder zzn;
    @SafeParcelable.Field(getter = "getFileDescriptor", id = 4)
    private ParcelFileDescriptor zzo;
    @SafeParcelable.Field(getter = "getLastUpdateTimeMs", id = 5)
    private long zzp;
    @SafeParcelable.Field(getter = "getState", id = 6)
    private byte[] zzq;
    private byte[] zzr;
    private File zzs;

    public SafeBrowsingData() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    public SafeBrowsingData(long j, byte[] bArr) {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, j, bArr);
    }

    public SafeBrowsingData(String str) {
        this(str, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder) {
        this(str, dataHolder, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) DataHolder dataHolder, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) byte[] bArr) {
        this.zzm = str;
        this.zzn = dataHolder;
        this.zzo = parcelFileDescriptor;
        this.zzp = j;
        this.zzq = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.io.FileOutputStream zza() {
        /*
            r5 = this;
            java.io.File r0 = r5.zzs
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch:{ IOException -> 0x002f, all -> 0x0025 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r5.zzo = r3     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            if (r0 == 0) goto L_0x0020
            r0.delete()
        L_0x0020:
            return r2
        L_0x0021:
            r1 = move-exception
            goto L_0x0029
        L_0x0023:
            goto L_0x0030
        L_0x0025:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.delete()
        L_0x002e:
            throw r1
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.delete()
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.zza():java.io.FileOutputStream");
    }

    private static void zza(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public byte[] getBlacklists() {
        if (this.zzo == null) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzo));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr);
            return bArr;
        } catch (IOException unused) {
            return null;
        } finally {
            zza(dataInputStream);
            this.zzo = null;
        }
    }

    public DataHolder getBlacklistsDataHolder() {
        return this.zzn;
    }

    public ParcelFileDescriptor getFileDescriptor() {
        return this.zzo;
    }

    public long getLastUpdateTimeMs() {
        return this.zzp;
    }

    public String getMetadata() {
        return this.zzm;
    }

    public byte[] getState() {
        return this.zzq;
    }

    public void setBlacklists(byte[] bArr) {
        this.zzr = bArr;
    }

    public void setTempDir(File file) {
        if (file != null) {
            this.zzs = file;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.zzo
            r1 = 1
            if (r0 != 0) goto L_0x0031
            byte[] r0 = r3.zzr
            if (r0 == 0) goto L_0x0031
            java.io.FileOutputStream r0 = r3.zza()
            if (r0 == 0) goto L_0x0031
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.zzr     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            int r2 = r2.length     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.writeInt(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            byte[] r2 = r3.zzr     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.write(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            zza(r0)
            r0 = 1
            goto L_0x0032
        L_0x0029:
            r4 = move-exception
            zza(r0)
            throw r4
        L_0x002e:
            zza(r0)
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r5 | r1
        L_0x0036:
            com.google.android.gms.safetynet.zzj.zza(r3, r4, r5)
            r4 = 0
            r3.zzo = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }
}
