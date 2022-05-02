package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzfk;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzjp;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzlh;
import id.dana.data.profilemenu.MyProfileMenuAction;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public final class zzkp extends zzke {
    zzkp(zzkn zzkn) {
        super(zzkn);
    }

    static final zzfs zzA(zzfo zzfo, String str) {
        for (zzfs next : zzfo.zza()) {
            if (next.zzb().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static final Object zzB(zzfo zzfo, String str) {
        zzfs zzA = zzA(zzfo, str);
        if (zzA == null) {
            return null;
        }
        if (zzA.zzc()) {
            return zzA.zzd();
        }
        if (zzA.zze()) {
            return Long.valueOf(zzA.zzf());
        }
        if (zzA.zzi()) {
            return Double.valueOf(zzA.zzj());
        }
        if (zzA.zzm() <= 0) {
            return null;
        }
        List<zzfs> zzk = zzA.zzk();
        ArrayList arrayList = new ArrayList();
        for (zzfs next : zzk) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (zzfs next2 : next.zzk()) {
                    if (next2.zzc()) {
                        bundle.putString(next2.zzb(), next2.zzd());
                    } else if (next2.zze()) {
                        bundle.putLong(next2.zzb(), next2.zzf());
                    } else if (next2.zzi()) {
                        bundle.putDouble(next2.zzb(), next2.zzj());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzC(StringBuilder sb, int i, List<zzfs> list) {
        if (list != null) {
            int i2 = i + 1;
            for (zzfs next : list) {
                if (next != null) {
                    zzE(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    zzH(sb, i2, "name", next.zza() ? this.zzs.zzm().zzd(next.zzb()) : null);
                    zzH(sb, i2, "string_value", next.zzc() ? next.zzd() : null);
                    zzH(sb, i2, "int_value", next.zze() ? Long.valueOf(next.zzf()) : null);
                    if (next.zzi()) {
                        d = Double.valueOf(next.zzj());
                    }
                    zzH(sb, i2, "double_value", d);
                    if (next.zzm() > 0) {
                        zzC(sb, i2, next.zzk());
                    }
                    zzE(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    private final void zzD(StringBuilder sb, int i, zzel zzel) {
        if (zzel != null) {
            zzE(sb, i);
            sb.append("filter {\n");
            if (zzel.zze()) {
                zzH(sb, i, "complement", Boolean.valueOf(zzel.zzf()));
            }
            if (zzel.zzg()) {
                zzH(sb, i, "param_name", this.zzs.zzm().zzd(zzel.zzh()));
            }
            if (zzel.zza()) {
                int i2 = i + 1;
                zzex zzb = zzel.zzb();
                if (zzb != null) {
                    zzE(sb, i2);
                    sb.append("string_filter {\n");
                    if (zzb.zza()) {
                        zzH(sb, i2, "match_type", zzb.zzb().name());
                    }
                    if (zzb.zzc()) {
                        zzH(sb, i2, "expression", zzb.zzd());
                    }
                    if (zzb.zze()) {
                        zzH(sb, i2, "case_sensitive", Boolean.valueOf(zzb.zzf()));
                    }
                    if (zzb.zzh() > 0) {
                        zzE(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : zzb.zzg()) {
                            zzE(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    zzE(sb, i2);
                    sb.append("}\n");
                }
            }
            if (zzel.zzc()) {
                zzI(sb, i + 1, "number_filter", zzel.zzd());
            }
            zzE(sb, i);
            sb.append("}\n");
        }
    }

    private static final void zzE(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static final String zzF(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzG(StringBuilder sb, int i, String str, zzgd zzgd) {
        if (zzgd != null) {
            zzE(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (zzgd.zzd() != 0) {
                zzE(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : zzgd.zzc()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (zzgd.zzb() != 0) {
                zzE(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : zzgd.zza()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (zzgd.zzf() != 0) {
                zzE(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (zzfm next3 : zzgd.zze()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.zza() ? Integer.valueOf(next3.zzb()) : null);
                    sb.append(":");
                    sb.append(next3.zzc() ? Long.valueOf(next3.zzd()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (zzgd.zzi() != 0) {
                zzE(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (zzgf next4 : zzgd.zzh()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.zza() ? Integer.valueOf(next4.zzb()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.zzc()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            zzE(sb, 3);
            sb.append("}\n");
        }
    }

    private static final void zzH(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            zzE(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private static final void zzI(StringBuilder sb, int i, String str, zzeq zzeq) {
        if (zzeq != null) {
            zzE(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (zzeq.zza()) {
                zzH(sb, i, "comparison_type", zzeq.zzb().name());
            }
            if (zzeq.zzc()) {
                zzH(sb, i, "match_as_float", Boolean.valueOf(zzeq.zzd()));
            }
            if (zzeq.zze()) {
                zzH(sb, i, "comparison_value", zzeq.zzf());
            }
            if (zzeq.zzg()) {
                zzH(sb, i, "min_comparison_value", zzeq.zzh());
            }
            if (zzeq.zzi()) {
                zzH(sb, i, "max_comparison_value", zzeq.zzj());
            }
            zzE(sb, i);
            sb.append("}\n");
        }
    }

    static boolean zzl(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean zzm(List<Long> list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    static List<Long> zzn(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    static <Builder extends zzlh> Builder zzt(Builder builder, byte[] bArr) throws zzkn {
        zzjp zzb = zzjp.zzb();
        if (zzb != null) {
            return builder.zzav(bArr, zzb);
        }
        return builder.zzaw(bArr);
    }

    static int zzu(zzfv zzfv, String str) {
        for (int i = 0; i < zzfv.zzk(); i++) {
            if (str.equals(zzfv.zzl(i).zzc())) {
                return i;
            }
        }
        return -1;
    }

    static List<zzfs> zzv(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                zzfr zzn = zzfs.zzn();
                for (String str : bundle.keySet()) {
                    zzfr zzn2 = zzfs.zzn();
                    zzn2.zza(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        zzn2.zzd(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        zzn2.zzb((String) obj);
                    } else if (obj instanceof Double) {
                        zzn2.zzf(((Double) obj).doubleValue());
                    }
                    zzn.zzi(zzn2);
                }
                if (zzn.zzh() > 0) {
                    arrayList.add((zzfs) zzn.zzaA());
                }
            }
        }
        return arrayList;
    }

    static zzas zzx(zzaa zzaa) {
        Bundle bundle = new Bundle();
        String str = "app";
        for (String next : zzaa.zzf().keySet()) {
            Object zze = zzaa.zze(next);
            if ("_o".equals(next) && zze != null) {
                str = zze.toString();
            }
            if (zze == null) {
                bundle.putString(next, (String) null);
            } else if (zze instanceof Long) {
                bundle.putLong(next, ((Long) zze).longValue());
            } else if (zze instanceof Double) {
                bundle.putDouble(next, ((Double) zze).doubleValue());
            } else {
                bundle.putString(next, zze.toString());
            }
        }
        String zzb = zzgr.zzb(zzaa.zzb());
        if (zzb == null) {
            zzb = zzaa.zzb();
        }
        return new zzas(zzb, new zzaq(bundle), str, zzaa.zza());
    }

    static final void zzy(zzfn zzfn, String str, Object obj) {
        List<zzfs> zza = zzfn.zza();
        int i = 0;
        while (true) {
            if (i >= zza.size()) {
                i = -1;
                break;
            } else if (str.equals(zza.get(i).zzb())) {
                break;
            } else {
                i++;
            }
        }
        zzfr zzn = zzfs.zzn();
        zzn.zza(str);
        if (obj instanceof Long) {
            zzn.zzd(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zzn.zzb((String) obj);
        } else if (obj instanceof Double) {
            zzn.zzf(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zzn.zzj(zzv((Bundle[]) obj));
        }
        if (i >= 0) {
            zzfn.zze(i, zzn);
        } else {
            zzfn.zzg(zzn);
        }
    }

    @WorkerThread
    static final boolean zzz(zzas zzas, zzp zzp) {
        Preconditions.checkNotNull(zzas);
        Preconditions.checkNotNull(zzp);
        return !TextUtils.isEmpty(zzp.zzb) || !TextUtils.isEmpty(zzp.zzq);
    }

    /* access modifiers changed from: protected */
    public final boolean zzaA() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzgg zzgg, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgg.zzd();
        zzgg.zzf();
        zzgg.zzh();
        if (obj instanceof String) {
            zzgg.zzc((String) obj);
        } else if (obj instanceof Long) {
            zzgg.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgg.zzg(((Double) obj).doubleValue());
        } else {
            this.zzs.zzau().zzb().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(zzfr zzfr, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfr.zzc();
        zzfr.zze();
        zzfr.zzg();
        zzfr.zzk();
        if (obj instanceof String) {
            zzfr.zzb((String) obj);
        } else if (obj instanceof Long) {
            zzfr.zzd(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfr.zzf(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            zzfr.zzj(zzv((Bundle[]) obj));
        } else {
            this.zzs.zzau().zzb().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final zzfo zzf(zzan zzan) {
        zzfn zzk = zzfo.zzk();
        zzk.zzq(zzan.zze);
        zzap zzap = new zzap(zzan.zzf);
        while (zzap.hasNext()) {
            String zza = zzap.next();
            zzfr zzn = zzfs.zzn();
            zzn.zza(zza);
            Object zza2 = zzan.zzf.zza(zza);
            Preconditions.checkNotNull(zza2);
            zzd(zzn, zza2);
            zzk.zzg(zzn);
        }
        return (zzfo) zzk.zzaA();
    }

    /* access modifiers changed from: package-private */
    public final String zzh(zzfu zzfu) {
        if (zzfu == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (zzfw next : zzfu.zza()) {
            if (next != null) {
                zzE(sb, 1);
                sb.append("bundle {\n");
                if (next.zza()) {
                    zzH(sb, 1, "protocol_version", Integer.valueOf(next.zzb()));
                }
                zzH(sb, 1, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_PLATFORM, next.zzt());
                if (next.zzC()) {
                    zzH(sb, 1, "gmp_version", Long.valueOf(next.zzD()));
                }
                if (next.zzE()) {
                    zzH(sb, 1, "uploading_gmp_version", Long.valueOf(next.zzF()));
                }
                if (next.zzae()) {
                    zzH(sb, 1, "dynamite_version", Long.valueOf(next.zzaf()));
                }
                if (next.zzW()) {
                    zzH(sb, 1, "config_version", Long.valueOf(next.zzX()));
                }
                zzH(sb, 1, "gmp_app_id", next.zzP());
                zzH(sb, 1, "admob_app_id", next.zzad());
                zzH(sb, 1, "app_id", next.zzA());
                zzH(sb, 1, MyProfileMenuAction.APP_VERSION, next.zzB());
                if (next.zzU()) {
                    zzH(sb, 1, "app_version_major", Integer.valueOf(next.zzV()));
                }
                zzH(sb, 1, "firebase_instance_id", next.zzT());
                if (next.zzK()) {
                    zzH(sb, 1, "dev_cert_hash", Long.valueOf(next.zzL()));
                }
                zzH(sb, 1, "app_store", next.zzz());
                if (next.zzi()) {
                    zzH(sb, 1, "upload_timestamp_millis", Long.valueOf(next.zzj()));
                }
                if (next.zzk()) {
                    zzH(sb, 1, "start_timestamp_millis", Long.valueOf(next.zzm()));
                }
                if (next.zzn()) {
                    zzH(sb, 1, "end_timestamp_millis", Long.valueOf(next.zzo()));
                }
                if (next.zzp()) {
                    zzH(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.zzq()));
                }
                if (next.zzr()) {
                    zzH(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.zzs()));
                }
                zzH(sb, 1, "app_instance_id", next.zzJ());
                zzH(sb, 1, "resettable_device_id", next.zzG());
                zzH(sb, 1, "ds_id", next.zzaa());
                if (next.zzH()) {
                    zzH(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.zzI()));
                }
                zzH(sb, 1, "os_version", next.zzu());
                zzH(sb, 1, "device_model", next.zzv());
                zzH(sb, 1, "user_default_language", next.zzw());
                if (next.zzx()) {
                    zzH(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.zzy()));
                }
                if (next.zzM()) {
                    zzH(sb, 1, "bundle_sequential_index", Integer.valueOf(next.zzN()));
                }
                if (next.zzQ()) {
                    zzH(sb, 1, "service_upload", Boolean.valueOf(next.zzR()));
                }
                zzH(sb, 1, "health_monitor", next.zzO());
                if (!this.zzs.zzc().zzn((String) null, zzea.zzat) && next.zzY() && next.zzZ() != 0) {
                    zzH(sb, 1, "android_id", Long.valueOf(next.zzZ()));
                }
                if (next.zzab()) {
                    zzH(sb, 1, "retry_counter", Integer.valueOf(next.zzac()));
                }
                if (next.zzah()) {
                    zzH(sb, 1, "consent_signals", next.zzai());
                }
                List<zzgh> zzf = next.zzf();
                if (zzf != null) {
                    for (zzgh next2 : zzf) {
                        if (next2 != null) {
                            zzE(sb, 2);
                            sb.append("user_property {\n");
                            zzH(sb, 2, "set_timestamp_millis", next2.zza() ? Long.valueOf(next2.zzb()) : null);
                            zzH(sb, 2, "name", this.zzs.zzm().zze(next2.zzc()));
                            zzH(sb, 2, "string_value", next2.zze());
                            zzH(sb, 2, "int_value", next2.zzf() ? Long.valueOf(next2.zzg()) : null);
                            zzH(sb, 2, "double_value", next2.zzh() ? Double.valueOf(next2.zzi()) : null);
                            zzE(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfk> zzS = next.zzS();
                if (zzS != null) {
                    for (zzfk next3 : zzS) {
                        if (next3 != null) {
                            zzE(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.zza()) {
                                zzH(sb, 2, "audience_id", Integer.valueOf(next3.zzb()));
                            }
                            if (next3.zzf()) {
                                zzH(sb, 2, "new_audience", Boolean.valueOf(next3.zzg()));
                            }
                            zzG(sb, 2, "current_data", next3.zzc());
                            if (next3.zzd()) {
                                zzG(sb, 2, "previous_data", next3.zze());
                            }
                            zzE(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<zzfo> zzc = next.zzc();
                if (zzc != null) {
                    for (zzfo next4 : zzc) {
                        if (next4 != null) {
                            zzE(sb, 2);
                            sb.append("event {\n");
                            zzH(sb, 2, "name", this.zzs.zzm().zzc(next4.zzd()));
                            if (next4.zze()) {
                                zzH(sb, 2, "timestamp_millis", Long.valueOf(next4.zzf()));
                            }
                            if (next4.zzg()) {
                                zzH(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.zzh()));
                            }
                            if (next4.zzi()) {
                                zzH(sb, 2, "count", Integer.valueOf(next4.zzj()));
                            }
                            if (next4.zzb() != 0) {
                                zzC(sb, 2, next4.zza());
                            }
                            zzE(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zzE(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzi(zzej zzej) {
        if (zzej == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzej.zza()) {
            zzH(sb, 0, "filter_id", Integer.valueOf(zzej.zzb()));
        }
        zzH(sb, 0, "event_name", this.zzs.zzm().zzc(zzej.zzc()));
        String zzF = zzF(zzej.zzi(), zzej.zzj(), zzej.zzm());
        if (!zzF.isEmpty()) {
            zzH(sb, 0, "filter_type", zzF);
        }
        if (zzej.zzg()) {
            zzI(sb, 1, "event_count_filter", zzej.zzh());
        }
        if (zzej.zze() > 0) {
            sb.append("  filters {\n");
            for (zzel zzD : zzej.zzd()) {
                zzD(sb, 2, zzD);
            }
        }
        zzE(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzj(zzes zzes) {
        if (zzes == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzes.zza()) {
            zzH(sb, 0, "filter_id", Integer.valueOf(zzes.zzb()));
        }
        zzH(sb, 0, "property_name", this.zzs.zzm().zze(zzes.zzc()));
        String zzF = zzF(zzes.zze(), zzes.zzf(), zzes.zzh());
        if (!zzF.isEmpty()) {
            zzH(sb, 0, "filter_type", zzF);
        }
        zzD(sb, 1, zzes.zzd());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.zzs.zzau().zzb().zza("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T zzk(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.zzfu r5 = r4.zzs     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzb()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.zza(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkp.zzk(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final List<Long> zzo(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                this.zzs.zzau().zze().zzb("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzau().zze().zzc("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (next.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzq(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.zzs.zzay().currentTimeMillis() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final long zzr(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzl().zzg();
        MessageDigest zzN = zzku.zzN();
        if (zzN != null) {
            return zzku.zzO(zzN.digest(bArr));
        }
        this.zzs.zzau().zzb().zza("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzs(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzs.zzau().zzb().zzb("Failed to gzip content", e);
            throw e;
        }
    }
}
