package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzcb extends zzbn implements zzcc {
    public zzcb() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzcc) {
            return (zzcc) queryLocalInterface;
        }
        return new zzca(iBinder);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v20, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v26, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v30, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v34, types: [com.google.android.gms.internal.measurement.zzck] */
    /* JADX WARNING: type inference failed for: r3v38, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v42, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v46, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v50, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v55, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v60, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v67, types: [com.google.android.gms.internal.measurement.zzci] */
    /* JADX WARNING: type inference failed for: r3v71, types: [com.google.android.gms.internal.measurement.zzci] */
    /* JADX WARNING: type inference failed for: r3v75, types: [com.google.android.gms.internal.measurement.zzci] */
    /* JADX WARNING: type inference failed for: r3v79, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v84, types: [com.google.android.gms.internal.measurement.zzcf] */
    /* JADX WARNING: type inference failed for: r3v88 */
    /* JADX WARNING: type inference failed for: r3v89 */
    /* JADX WARNING: type inference failed for: r3v90 */
    /* JADX WARNING: type inference failed for: r3v91 */
    /* JADX WARNING: type inference failed for: r3v92 */
    /* JADX WARNING: type inference failed for: r3v93 */
    /* JADX WARNING: type inference failed for: r3v94 */
    /* JADX WARNING: type inference failed for: r3v95 */
    /* JADX WARNING: type inference failed for: r3v96 */
    /* JADX WARNING: type inference failed for: r3v97 */
    /* JADX WARNING: type inference failed for: r3v98 */
    /* JADX WARNING: type inference failed for: r3v99 */
    /* JADX WARNING: type inference failed for: r3v100 */
    /* JADX WARNING: type inference failed for: r3v101 */
    /* JADX WARNING: type inference failed for: r3v102 */
    /* JADX WARNING: type inference failed for: r3v103 */
    /* JADX WARNING: type inference failed for: r3v104 */
    /* JADX WARNING: type inference failed for: r3v105 */
    /* JADX WARNING: type inference failed for: r3v106 */
    /* JADX WARNING: type inference failed for: r3v107 */
    /* JADX WARNING: type inference failed for: r3v108 */
    /* JADX WARNING: type inference failed for: r3v109 */
    /* JADX WARNING: type inference failed for: r3v110 */
    /* JADX WARNING: type inference failed for: r3v111 */
    /* JADX WARNING: type inference failed for: r3v112 */
    /* JADX WARNING: type inference failed for: r3v113 */
    /* JADX WARNING: type inference failed for: r3v114 */
    /* JADX WARNING: type inference failed for: r3v115 */
    /* JADX WARNING: type inference failed for: r3v116 */
    /* JADX WARNING: type inference failed for: r3v117 */
    /* JADX WARNING: type inference failed for: r3v118 */
    /* JADX WARNING: type inference failed for: r3v119 */
    /* JADX WARNING: type inference failed for: r3v120 */
    /* JADX WARNING: type inference failed for: r3v121 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
        /*
            r10 = this;
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r3 = 0
            switch(r11) {
                case 1: goto L_0x040f;
                case 2: goto L_0x03ee;
                case 3: goto L_0x03b8;
                case 4: goto L_0x039a;
                case 5: goto L_0x0371;
                case 6: goto L_0x0350;
                case 7: goto L_0x0343;
                case 8: goto L_0x0332;
                case 9: goto L_0x031d;
                case 10: goto L_0x02f8;
                case 11: goto L_0x02eb;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d9;
                case 14: goto L_0x02d0;
                case 15: goto L_0x02b6;
                case 16: goto L_0x0299;
                case 17: goto L_0x027c;
                case 18: goto L_0x025d;
                case 19: goto L_0x0240;
                case 20: goto L_0x0223;
                case 21: goto L_0x0206;
                case 22: goto L_0x01e9;
                case 23: goto L_0x01dc;
                case 24: goto L_0x01cf;
                case 25: goto L_0x01be;
                case 26: goto L_0x01ad;
                case 27: goto L_0x0194;
                case 28: goto L_0x0183;
                case 29: goto L_0x0172;
                case 30: goto L_0x0161;
                case 31: goto L_0x0138;
                case 32: goto L_0x010f;
                case 33: goto L_0x00e9;
                case 34: goto L_0x00cc;
                case 35: goto L_0x00af;
                case 36: goto L_0x0092;
                case 37: goto L_0x0089;
                case 38: goto L_0x0068;
                case 39: goto L_0x005f;
                case 40: goto L_0x0042;
                case 41: goto L_0x0008;
                case 42: goto L_0x0035;
                case 43: goto L_0x002c;
                case 44: goto L_0x001b;
                case 45: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 0
            return r0
        L_0x000a:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            r10.setConsentThirdParty(r1, r2)
            goto L_0x0426
        L_0x001b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            r10.setConsent(r1, r2)
            goto L_0x0426
        L_0x002c:
            long r0 = r12.readLong()
            r10.clearMeasurementEnabled(r0)
            goto L_0x0426
        L_0x0035:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r10.setDefaultEventParameters(r0)
            goto L_0x0426
        L_0x0042:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0049
            goto L_0x005a
        L_0x0049:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r2 == 0) goto L_0x0055
            r3 = r1
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x005a
        L_0x0055:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x005a:
            r10.isDataCollectionEnabled(r3)
            goto L_0x0426
        L_0x005f:
            boolean r0 = com.google.android.gms.internal.measurement.zzbo.zza(r12)
            r10.setDataCollectionEnabled(r0)
            goto L_0x0426
        L_0x0068:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x006f
            goto L_0x0080
        L_0x006f:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r3 == 0) goto L_0x007b
            r3 = r2
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x0080
        L_0x007b:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r1)
        L_0x0080:
            int r0 = r12.readInt()
            r10.getTestFlag(r3, r0)
            goto L_0x0426
        L_0x0089:
            java.util.HashMap r0 = com.google.android.gms.internal.measurement.zzbo.zzf(r12)
            r10.initForTests(r0)
            goto L_0x0426
        L_0x0092:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0099
            goto L_0x00aa
        L_0x0099:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzci
            if (r2 == 0) goto L_0x00a5
            r3 = r1
            com.google.android.gms.internal.measurement.zzci r3 = (com.google.android.gms.internal.measurement.zzci) r3
            goto L_0x00aa
        L_0x00a5:
            com.google.android.gms.internal.measurement.zzcg r3 = new com.google.android.gms.internal.measurement.zzcg
            r3.<init>(r0)
        L_0x00aa:
            r10.unregisterOnMeasurementEventListener(r3)
            goto L_0x0426
        L_0x00af:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x00b6
            goto L_0x00c7
        L_0x00b6:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzci
            if (r2 == 0) goto L_0x00c2
            r3 = r1
            com.google.android.gms.internal.measurement.zzci r3 = (com.google.android.gms.internal.measurement.zzci) r3
            goto L_0x00c7
        L_0x00c2:
            com.google.android.gms.internal.measurement.zzcg r3 = new com.google.android.gms.internal.measurement.zzcg
            r3.<init>(r0)
        L_0x00c7:
            r10.registerOnMeasurementEventListener(r3)
            goto L_0x0426
        L_0x00cc:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzci
            if (r2 == 0) goto L_0x00df
            r3 = r1
            com.google.android.gms.internal.measurement.zzci r3 = (com.google.android.gms.internal.measurement.zzci) r3
            goto L_0x00e4
        L_0x00df:
            com.google.android.gms.internal.measurement.zzcg r3 = new com.google.android.gms.internal.measurement.zzcg
            r3.<init>(r0)
        L_0x00e4:
            r10.setEventInterceptor(r3)
            goto L_0x0426
        L_0x00e9:
            int r1 = r12.readInt()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.IBinder r4 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            r0 = r10
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L_0x0426
        L_0x010f:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L_0x011e
            goto L_0x012f
        L_0x011e:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r3 == 0) goto L_0x012a
            r3 = r2
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x012f
        L_0x012a:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r4)
        L_0x012f:
            long r4 = r12.readLong()
            r10.performAction(r1, r3, r4)
            goto L_0x0426
        L_0x0138:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L_0x0147
            goto L_0x0158
        L_0x0147:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r3 == 0) goto L_0x0153
            r3 = r2
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x0158
        L_0x0153:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r4)
        L_0x0158:
            long r4 = r12.readLong()
            r10.onActivitySaveInstanceState(r1, r3, r4)
            goto L_0x0426
        L_0x0161:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            r10.onActivityResumed(r1, r2)
            goto L_0x0426
        L_0x0172:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            r10.onActivityPaused(r1, r2)
            goto L_0x0426
        L_0x0183:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            r10.onActivityDestroyed(r1, r2)
            goto L_0x0426
        L_0x0194:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r12.readLong()
            r10.onActivityCreated(r1, r2, r3)
            goto L_0x0426
        L_0x01ad:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            r10.onActivityStopped(r1, r2)
            goto L_0x0426
        L_0x01be:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r12.readLong()
            r10.onActivityStarted(r1, r2)
            goto L_0x0426
        L_0x01cf:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            r10.endAdUnitExposure(r1, r2)
            goto L_0x0426
        L_0x01dc:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            r10.beginAdUnitExposure(r1, r2)
            goto L_0x0426
        L_0x01e9:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x01f0
            goto L_0x0201
        L_0x01f0:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r2 == 0) goto L_0x01fc
            r3 = r1
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x0201
        L_0x01fc:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x0201:
            r10.generateEventId(r3)
            goto L_0x0426
        L_0x0206:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x020d
            goto L_0x021e
        L_0x020d:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r2 == 0) goto L_0x0219
            r3 = r1
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x021e
        L_0x0219:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x021e:
            r10.getGmpAppId(r3)
            goto L_0x0426
        L_0x0223:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x022a
            goto L_0x023b
        L_0x022a:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r2 == 0) goto L_0x0236
            r3 = r1
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x023b
        L_0x0236:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x023b:
            r10.getAppInstanceId(r3)
            goto L_0x0426
        L_0x0240:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0247
            goto L_0x0258
        L_0x0247:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r2 == 0) goto L_0x0253
            r3 = r1
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x0258
        L_0x0253:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x0258:
            r10.getCachedAppInstanceId(r3)
            goto L_0x0426
        L_0x025d:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0264
            goto L_0x0277
        L_0x0264:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzck
            if (r2 == 0) goto L_0x0272
            r3 = r1
            com.google.android.gms.internal.measurement.zzck r3 = (com.google.android.gms.internal.measurement.zzck) r3
            goto L_0x0277
        L_0x0272:
            com.google.android.gms.internal.measurement.zzcj r3 = new com.google.android.gms.internal.measurement.zzcj
            r3.<init>(r0)
        L_0x0277:
            r10.setInstanceIdProvider(r3)
            goto L_0x0426
        L_0x027c:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0283
            goto L_0x0294
        L_0x0283:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r2 == 0) goto L_0x028f
            r3 = r1
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x0294
        L_0x028f:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x0294:
            r10.getCurrentScreenClass(r3)
            goto L_0x0426
        L_0x0299:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x02a0
            goto L_0x02b1
        L_0x02a0:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r2 == 0) goto L_0x02ac
            r3 = r1
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x02b1
        L_0x02ac:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x02b1:
            r10.getCurrentScreenName(r3)
            goto L_0x0426
        L_0x02b6:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            long r4 = r12.readLong()
            r0 = r10
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L_0x0426
        L_0x02d0:
            long r0 = r12.readLong()
            r10.setSessionTimeoutDuration(r0)
            goto L_0x0426
        L_0x02d9:
            long r0 = r12.readLong()
            r10.setMinimumSessionDuration(r0)
            goto L_0x0426
        L_0x02e2:
            long r0 = r12.readLong()
            r10.resetAnalyticsData(r0)
            goto L_0x0426
        L_0x02eb:
            boolean r1 = com.google.android.gms.internal.measurement.zzbo.zza(r12)
            long r2 = r12.readLong()
            r10.setMeasurementEnabled(r1, r2)
            goto L_0x0426
        L_0x02f8:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0307
            goto L_0x0318
        L_0x0307:
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r3 == 0) goto L_0x0313
            r3 = r2
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x0318
        L_0x0313:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x0318:
            r10.getConditionalUserProperties(r1, r4, r3)
            goto L_0x0426
        L_0x031d:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r10.clearConditionalUserProperty(r1, r2, r0)
            goto L_0x0426
        L_0x0332:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            r10.setConditionalUserProperty(r1, r2)
            goto L_0x0426
        L_0x0343:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            r10.setUserId(r1, r2)
            goto L_0x0426
        L_0x0350:
            java.lang.String r1 = r12.readString()
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x035b
            goto L_0x036c
        L_0x035b:
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r3 == 0) goto L_0x0367
            r3 = r2
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x036c
        L_0x0367:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x036c:
            r10.getMaxUserProperties(r1, r3)
            goto L_0x0426
        L_0x0371:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            boolean r5 = com.google.android.gms.internal.measurement.zzbo.zza(r12)
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0384
            goto L_0x0395
        L_0x0384:
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r3 == 0) goto L_0x0390
            r3 = r2
            com.google.android.gms.internal.measurement.zzcf r3 = (com.google.android.gms.internal.measurement.zzcf) r3
            goto L_0x0395
        L_0x0390:
            com.google.android.gms.internal.measurement.zzcd r3 = new com.google.android.gms.internal.measurement.zzcd
            r3.<init>(r0)
        L_0x0395:
            r10.getUserProperties(r1, r4, r5, r3)
            goto L_0x0426
        L_0x039a:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            boolean r4 = com.google.android.gms.internal.measurement.zzbo.zza(r12)
            long r5 = r12.readLong()
            r0 = r10
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L_0x0426
        L_0x03b8:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r12.readStrongBinder()
            if (r6 != 0) goto L_0x03d0
            r6 = r3
            goto L_0x03e1
        L_0x03d0:
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzcf
            if (r3 == 0) goto L_0x03db
            com.google.android.gms.internal.measurement.zzcf r2 = (com.google.android.gms.internal.measurement.zzcf) r2
            goto L_0x03e0
        L_0x03db:
            com.google.android.gms.internal.measurement.zzcd r2 = new com.google.android.gms.internal.measurement.zzcd
            r2.<init>(r6)
        L_0x03e0:
            r6 = r2
        L_0x03e1:
            long r8 = r12.readLong()
            r0 = r10
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L_0x0426
        L_0x03ee:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r4 = com.google.android.gms.internal.measurement.zzbo.zza(r12)
            boolean r5 = com.google.android.gms.internal.measurement.zzbo.zza(r12)
            long r6 = r12.readLong()
            r0 = r10
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L_0x0426
        L_0x040f:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzcl> r2 = com.google.android.gms.internal.measurement.zzcl.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzbo.zzc(r12, r2)
            com.google.android.gms.internal.measurement.zzcl r2 = (com.google.android.gms.internal.measurement.zzcl) r2
            long r3 = r12.readLong()
            r10.initialize(r1, r2, r3)
        L_0x0426:
            r13.writeNoException()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcb.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
