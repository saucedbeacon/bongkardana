package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class q extends i implements s {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    public final void a(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (Parcelable) bundle2);
        k.a(a2, (IInterface) uVar);
        a(6, a2);
    }

    public final void a(String str, Bundle bundle, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) uVar);
        a(5, a2);
    }

    public final void a(String str, List<Bundle> list, Bundle bundle, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) uVar);
        a(2, a2);
    }

    public final void b(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1723837895, oncanceled);
            onCancelLoad.getMin(1723837895, oncanceled);
        }
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (Parcelable) bundle2);
        k.a(a2, (IInterface) uVar);
        a(7, a2);
    }

    public final void b(String str, Bundle bundle, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) uVar);
        a(10, a2);
    }

    public final void b(String str, List<Bundle> list, Bundle bundle, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) uVar);
        a(14, a2);
    }

    public final void c(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (Parcelable) bundle2);
        k.a(a2, (IInterface) uVar);
        a(9, a2);
    }

    public final void c(String str, List<Bundle> list, Bundle bundle, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeTypedList(list);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) uVar);
        a(12, a2);
    }

    public final void d(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (Parcelable) bundle2);
        k.a(a2, (IInterface) uVar);
        a(11, a2);
    }

    public final void e(String str, Bundle bundle, Bundle bundle2, u uVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (Parcelable) bundle2);
        k.a(a2, (IInterface) uVar);
        a(13, a2);
    }
}
