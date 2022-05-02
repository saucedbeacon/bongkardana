package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zze;

public final class zzf extends zza implements zze {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IMapFragmentDelegate zzc(com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            com.google.android.gms.internal.maps.zzc.zza((android.os.Parcel) r0, (android.os.IInterface) r4)
            r4 = 2
            android.os.Parcel r4 = r3.zza(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.IMapFragmentDelegate
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.maps.internal.IMapFragmentDelegate r0 = (com.google.android.gms.maps.internal.IMapFragmentDelegate) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.maps.internal.zzj r1 = new com.google.android.gms.maps.internal.zzj
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.zzc(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IMapViewDelegate zza(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.maps.GoogleMapOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            com.google.android.gms.internal.maps.zzc.zza((android.os.Parcel) r0, (android.os.IInterface) r3)
            com.google.android.gms.internal.maps.zzc.zza((android.os.Parcel) r0, (android.os.Parcelable) r4)
            r3 = 3
            android.os.Parcel r3 = r2.zza(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.IMapViewDelegate
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.IMapViewDelegate r4 = (com.google.android.gms.maps.internal.IMapViewDelegate) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.zzk r0 = new com.google.android.gms.maps.internal.zzk
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.maps.GoogleMapOptions):com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zze() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 4
            android.os.Parcel r0 = r4.zza(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r1 = (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.zzb r2 = new com.google.android.gms.maps.internal.zzb
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.zze():com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final zze zzf() throws RemoteException {
        Parcel zza = zza(5, zza());
        zze zzb = com.google.android.gms.internal.maps.zzf.zzb(zza.readStrongBinder());
        zza.recycle();
        return zzb;
    }

    public final void zza(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (IInterface) iObjectWrapper);
        zza.writeInt(i);
        zzb(6, zza);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zza(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.maps.StreetViewPanoramaOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            com.google.android.gms.internal.maps.zzc.zza((android.os.Parcel) r0, (android.os.IInterface) r3)
            com.google.android.gms.internal.maps.zzc.zza((android.os.Parcel) r0, (android.os.Parcelable) r4)
            r3 = 7
            android.os.Parcel r3 = r2.zza(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate r4 = (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.zzbw r0 = new com.google.android.gms.maps.internal.zzbw
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions):com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzd(com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            com.google.android.gms.internal.maps.zzc.zza((android.os.Parcel) r0, (android.os.IInterface) r4)
            r4 = 8
            android.os.Parcel r4 = r3.zza(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            if (r2 == 0) goto L_0x0023
            r0 = r1
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate r0 = (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) r0
            goto L_0x0029
        L_0x0023:
            com.google.android.gms.maps.internal.zzbv r1 = new com.google.android.gms.maps.internal.zzbv
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.zzd(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }
}
