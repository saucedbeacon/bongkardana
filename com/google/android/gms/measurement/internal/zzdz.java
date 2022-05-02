package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzdz<V> {
    private static final Object zzf = new Object();
    private final String zza;
    private final zzdx<V> zzb;
    private final V zzc;
    private final V zzd;
    private final Object zze = new Object();
    @GuardedBy("overrideLock")
    private volatile V zzg = null;
    @GuardedBy("cachingLock")
    private volatile V zzh = null;

    /* synthetic */ zzdz(String str, Object obj, Object obj2, zzdx zzdx, zzdw zzdw) {
        this.zza = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zzb = zzdx;
    }

    public final String zza() {
        return this.zza;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0043 */
    public final V zzb(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zze
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.zzz r4 = com.google.android.gms.measurement.internal.zzdy.zza
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = zzf
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzz.zza()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x001f
            V r0 = r3.zzh     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x001b
            V r0 = r3.zzc     // Catch:{ all -> 0x0068 }
            goto L_0x001d
        L_0x001b:
            V r0 = r3.zzh     // Catch:{ all -> 0x0068 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            java.util.List r4 = com.google.android.gms.measurement.internal.zzea.zzaG     // Catch:{ SecurityException -> 0x0055 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0055 }
        L_0x0028:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0055 }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0055 }
            com.google.android.gms.measurement.internal.zzdz r0 = (com.google.android.gms.measurement.internal.zzdz) r0     // Catch:{ SecurityException -> 0x0055 }
            boolean r1 = com.google.android.gms.measurement.internal.zzz.zza()     // Catch:{ SecurityException -> 0x0055 }
            if (r1 != 0) goto L_0x004d
            r1 = 0
            com.google.android.gms.measurement.internal.zzdx<V> r2 = r0.zzb     // Catch:{ IllegalStateException -> 0x0043 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0043 }
        L_0x0043:
            java.lang.Object r2 = zzf     // Catch:{ SecurityException -> 0x0055 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0055 }
            r0.zzh = r1     // Catch:{ all -> 0x004a }
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0028
        L_0x004a:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004a }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x004d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0055 }
            throw r4     // Catch:{ SecurityException -> 0x0055 }
        L_0x0055:
        L_0x0056:
            com.google.android.gms.measurement.internal.zzdx<V> r4 = r3.zzb
            if (r4 != 0) goto L_0x005d
            V r4 = r3.zzc
            return r4
        L_0x005d:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0065, IllegalStateException -> 0x0062 }
            return r4
        L_0x0062:
            V r4 = r3.zzc
            return r4
        L_0x0065:
            V r4 = r3.zzc
            return r4
        L_0x0068:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0068 }
            throw r0
        L_0x006b:
            V r4 = r3.zzc
            return r4
        L_0x006e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x0071:
            throw r4
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdz.zzb(java.lang.Object):java.lang.Object");
    }
}
