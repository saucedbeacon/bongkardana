package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

public final class bs extends i implements bu {
    bs(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    public final void a(String str, int i, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeInt(i);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) bwVar);
        a(4, a2);
    }

    public final void a(String str, int i, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeInt(i);
        k.a(a2, (IInterface) bwVar);
        a(5, a2);
    }

    public final void a(String str, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (IInterface) bwVar);
        a(6, a2);
    }

    public final void a(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) bwVar);
        a(2, a2);
    }

    public final void b(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) bwVar);
        a(7, a2);
    }

    public final void c(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) bwVar);
        a(8, a2);
    }

    public final void d(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) bwVar);
        a(13, a2);
    }

    public final void e(String str, List<Bundle> list, Bundle bundle, bw bwVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) bwVar);
        a(14, a2);
    }
}
