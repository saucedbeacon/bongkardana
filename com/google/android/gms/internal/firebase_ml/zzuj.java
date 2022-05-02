package com.google.android.gms.internal.firebase_ml;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.android.gms.internal.firebase_ml.zzux;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class zzuj implements zzyn {
    private final zzuh zzbvy;

    public static zzuj zza(zzuh zzuh) {
        if (zzuh.zzbwh != null) {
            return zzuh.zzbwh;
        }
        return new zzuj(zzuh);
    }

    private zzuj(zzuh zzuh) {
        zzuh zzuh2 = (zzuh) zzva.zza(zzuh, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT);
        this.zzbvy = zzuh2;
        zzuh2.zzbwh = this;
    }

    public final int zzsm() {
        return zzux.zzf.zzcaj;
    }

    public final void zzs(int i, int i2) throws IOException {
        this.zzbvy.zzl(i, i2);
    }

    public final void zzi(int i, long j) throws IOException {
        this.zzbvy.zza(i, j);
    }

    public final void zzj(int i, long j) throws IOException {
        this.zzbvy.zzc(i, j);
    }

    public final void zza(int i, float f) throws IOException {
        this.zzbvy.zza(i, f);
    }

    public final void zza(int i, double d) throws IOException {
        this.zzbvy.zza(i, d);
    }

    public final void zzt(int i, int i2) throws IOException {
        this.zzbvy.zzi(i, i2);
    }

    public final void zza(int i, long j) throws IOException {
        this.zzbvy.zza(i, j);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zzbvy.zzi(i, i2);
    }

    public final void zzc(int i, long j) throws IOException {
        this.zzbvy.zzc(i, j);
    }

    public final void zzl(int i, int i2) throws IOException {
        this.zzbvy.zzl(i, i2);
    }

    public final void zza(int i, boolean z) throws IOException {
        this.zzbvy.zza(i, z);
    }

    public final void zzb(int i, String str) throws IOException {
        this.zzbvy.zzb(i, str);
    }

    public final void zza(int i, zztq zztq) throws IOException {
        this.zzbvy.zza(i, zztq);
    }

    public final void zzj(int i, int i2) throws IOException {
        this.zzbvy.zzj(i, i2);
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zzbvy.zzk(i, i2);
    }

    public final void zzb(int i, long j) throws IOException {
        this.zzbvy.zzb(i, j);
    }

    public final void zza(int i, Object obj, zzxc zzxc) throws IOException {
        this.zzbvy.zza(i, (zzwi) obj, zzxc);
    }

    public final void zzb(int i, Object obj, zzxc zzxc) throws IOException {
        zzuh zzuh = this.zzbvy;
        zzuh.zzh(i, 3);
        zzxc.zza((zzwi) obj, zzuh.zzbwh);
        zzuh.zzh(i, 4);
    }

    public final void zzdj(int i) throws IOException {
        this.zzbvy.zzh(i, 3);
    }

    public final void zzdk(int i) throws IOException {
        this.zzbvy.zzh(i, 4);
    }

    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zztq) {
            this.zzbvy.zzb(i, (zztq) obj);
        } else {
            this.zzbvy.zza(i, (zzwi) obj);
        }
    }

    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzda(list.get(i4).intValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzcv(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzi(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1006533835, oncanceled);
            onCancelLoad.getMin(-1006533835, oncanceled);
        }
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzdd(list.get(i4).intValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzcy(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzl(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzz(list.get(i4).longValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzw(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzaa(list.get(i4).longValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzw(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzac(list.get(i4).longValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzy(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzr(list.get(i4).floatValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzq(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzd(list.get(i4).doubleValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzc(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzdf(list.get(i4).intValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzcv(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzi(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzbc(list.get(i4).booleanValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzbb(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zza(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzvp) {
            zzvp zzvp = (zzvp) list;
            while (i2 < list.size()) {
                Object raw = zzvp.getRaw(i2);
                if (raw instanceof String) {
                    this.zzbvy.zzb(i, (String) raw);
                } else {
                    this.zzbvy.zza(i, (zztq) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzb(i, list.get(i2));
            i2++;
        }
    }

    public final void zzb(int i, List<zztq> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzbvy.zza(i, list.get(i2));
        }
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzdb(list.get(i4).intValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzcw(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzj(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzde(list.get(i4).intValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzcy(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzl(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzad(list.get(i4).longValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzy(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzdc(list.get(i4).intValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzcx(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzk(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbvy.zzh(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuh.zzab(list.get(i4).longValue());
            }
            this.zzbvy.zzcw(i3);
            while (i2 < list.size()) {
                this.zzbvy.zzx(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbvy.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zza(int i, List<?> list, zzxc zzxc) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, (Object) list.get(i2), zzxc);
        }
    }

    public final void zzb(int i, List<?> list, zzxc zzxc) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, (Object) list.get(i2), zzxc);
        }
    }

    public final <K, V> void zza(int i, zzvz<K, V> zzvz, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.zzbvy.zzh(i, 2);
            this.zzbvy.zzcw(zzwa.zza(zzvz, next.getKey(), next.getValue()));
            zzwa.zza(this.zzbvy, zzvz, next.getKey(), next.getValue());
        }
    }
}
