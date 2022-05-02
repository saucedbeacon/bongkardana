package com.google.android.gms.internal.measurement;

import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.mobile.rome.longlinkservice.LongLinkMsgConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzae implements Iterable<zzap>, zzap, zzal {
    final SortedMap<Integer, zzap> zza;
    final Map<String, zzap> zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzae = (zzae) obj;
        if (zzh() != zzae.zzh()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzae.zza.isEmpty();
        }
        for (int intValue = this.zza.firstKey().intValue(); intValue <= this.zza.lastKey().intValue(); intValue++) {
            if (!zzl(intValue).equals(zzae.zzl(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    public final Iterator<zzap> iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzs(",");
    }

    public final List<zzap> zzb() {
        ArrayList arrayList = new ArrayList(zzh());
        for (int i = 0; i < zzh(); i++) {
            arrayList.add(zzl(i));
        }
        return arrayList;
    }

    public final zzap zzbK(String str, zzg zzg, List<zzap> list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || RVStartParams.BACK_BEHAVIOR_POP.equals(str) || LongLinkMsgConstants.MSG_PACKET_CHANNEL_PUSH.equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return zzbb.zza(str, this, zzg, list);
        }
        return zzaj.zza(this, new zzat(str), zzg, list);
    }

    public final String zzc() {
        return zzs(",");
    }

    public final Double zzd() {
        if (this.zza.size() == 1) {
            return zzl(0).zzd();
        }
        if (this.zza.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final Boolean zze() {
        return true;
    }

    public final Iterator<zzap> zzf() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final Iterator<Integer> zzg() {
        return this.zza.keySet().iterator();
    }

    public final int zzh() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return this.zza.lastKey().intValue() + 1;
    }

    public final int zzi() {
        return this.zza.size();
    }

    public final boolean zzj(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = r2.zzb.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap zzk(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.zzah r3 = new com.google.android.gms.internal.measurement.zzah
            int r0 = r2.zzh()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.zzj(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzap> r0 = r2.zzb
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.zzap r3 = zzf
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.zzk(java.lang.String):com.google.android.gms.internal.measurement.zzap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.zzap) r1.zza.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap zzl(int r2) {
        /*
            r1 = this;
            int r0 = r1.zzh()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.zzo(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.zzap> r0 = r1.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.zzap r2 = zzf
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.zzl(int):com.google.android.gms.internal.measurement.zzap");
    }

    public final void zzm(String str, zzap zzap) {
        if (zzap == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzap);
        }
    }

    public final boolean zzo(int i) {
        if (i >= 0 && i <= this.zza.lastKey().intValue()) {
            return this.zza.containsKey(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void zzp() {
        this.zza.clear();
    }

    public final void zzr(int i) {
        int intValue = this.zza.lastKey().intValue();
        if (i <= intValue && i >= 0) {
            this.zza.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap<Integer, zzap> sortedMap = this.zza;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.zza.put(valueOf, zzap.zzf);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= this.zza.lastKey().intValue()) {
                    SortedMap<Integer, zzap> sortedMap2 = this.zza;
                    Integer valueOf2 = Integer.valueOf(i);
                    zzap zzap = (zzap) sortedMap2.get(valueOf2);
                    if (zzap != null) {
                        this.zza.put(Integer.valueOf(i - 1), zzap);
                        this.zza.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String zzs(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            for (int i = 0; i < zzh(); i++) {
                zzap zzl = zzl(i);
                sb.append(str);
                if (!(zzl instanceof zzau) && !(zzl instanceof zzan)) {
                    sb.append(zzl.zzc());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final zzap zzt() {
        zzae zzae = new zzae();
        for (Map.Entry next : this.zza.entrySet()) {
            if (next.getValue() instanceof zzal) {
                zzae.zza.put((Integer) next.getKey(), (zzap) next.getValue());
            } else {
                zzae.zza.put((Integer) next.getKey(), ((zzap) next.getValue()).zzt());
            }
        }
        return zzae;
    }

    @RequiresNonNull({"elements"})
    public final void zzn(int i, zzap zzap) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (zzap == null) {
            this.zza.remove(Integer.valueOf(i));
        } else {
            this.zza.put(Integer.valueOf(i), zzap);
        }
    }

    public final void zzq(int i, zzap zzap) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= zzh()) {
            zzn(i, zzap);
        } else {
            for (int intValue = this.zza.lastKey().intValue(); intValue >= i; intValue--) {
                SortedMap<Integer, zzap> sortedMap = this.zza;
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzap2 = (zzap) sortedMap.get(valueOf);
                if (zzap2 != null) {
                    zzn(intValue + 1, zzap2);
                    this.zza.remove(valueOf);
                }
            }
            zzn(i, zzap);
        }
    }

    public zzae(List<zzap> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzn(i, list.get(i));
            }
        }
    }
}
