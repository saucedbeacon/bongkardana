package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zau;

@SafeParcelable.Class(creator = "SignInResponseCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zal();
    @SafeParcelable.VersionField(id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    private final ConnectionResult zab;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    @Nullable
    private final zau zac;

    @SafeParcelable.Constructor
    zam(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(id = 3) @Nullable zau zau) {
        this.zaa = i;
        this.zab = connectionResult;
        this.zac = zau;
    }

    public zam(int i) {
        this(new ConnectionResult(8, (PendingIntent) null), (zau) null);
    }

    private zam(ConnectionResult connectionResult, @Nullable zau zau) {
        this(1, connectionResult, (zau) null);
    }

    public final ConnectionResult zaa() {
        return this.zab;
    }

    @Nullable
    public final zau zab() {
        return this.zac;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zab, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
