package com.google.android.gms.internal.measurement;

import com.alibaba.griver.base.common.utils.FileCache;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import o.onEmbedViewParamChanged;

public final class zznq implements zznp {
    public static final zzht<Long> zzA;
    public static final zzht<Long> zzB;
    public static final zzht<Long> zzC;
    public static final zzht<Long> zzD;
    public static final zzht<Long> zzE;
    public static final zzht<Long> zzF;
    public static final zzht<Long> zzG;
    public static final zzht<Long> zzH;
    public static final zzht<Long> zzI;
    public static final zzht<Long> zzJ;
    public static final zzht<String> zzK;
    public static final zzht<Long> zzL;
    public static final zzht<Long> zza;
    public static final zzht<Long> zzb;
    public static final zzht<Long> zzc;
    public static final zzht<String> zzd;
    public static final zzht<String> zze;
    public static final zzht<String> zzf;
    public static final zzht<Long> zzg;
    public static final zzht<Long> zzh;
    public static final zzht<Long> zzi;
    public static final zzht<Long> zzj;
    public static final zzht<Long> zzk;
    public static final zzht<Long> zzl;
    public static final zzht<Long> zzm;
    public static final zzht<Long> zzn;
    public static final zzht<Long> zzo;
    public static final zzht<Long> zzp;
    public static final zzht<Long> zzq;
    public static final zzht<Long> zzr;
    public static final zzht<String> zzs;
    public static final zzht<Long> zzt;
    public static final zzht<Long> zzu;
    public static final zzht<Long> zzv;
    public static final zzht<Long> zzw;
    public static final zzht<Long> zzx;
    public static final zzht<Long> zzy;
    public static final zzht<Long> zzz;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zza("measurement.ad_id_cache_time", 10000);
        zzb = zzhr.zza("measurement.max_bundles_per_iteration", 100);
        zzc = zzhr.zza("measurement.config.cache_time", 86400000);
        zzd = zzhr.zzd("measurement.log_tag", "FA");
        zze = zzhr.zzd("measurement.config.url_authority", "app-measurement.com");
        zzf = zzhr.zzd("measurement.config.url_scheme", "https");
        zzg = zzhr.zza("measurement.upload.debug_upload_interval", 1000);
        zzh = zzhr.zza("measurement.lifetimevalue.max_currency_tracked", 4);
        zzi = zzhr.zza("measurement.store.max_stored_events_per_app", 100000);
        zzj = zzhr.zza("measurement.experiment.max_ids", 50);
        zzk = zzhr.zza("measurement.audience.filter_result_max_count", 200);
        zzl = zzhr.zza("measurement.alarm_manager.minimum_interval", DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        zzm = zzhr.zza("measurement.upload.minimum_delay", 500);
        zzn = zzhr.zza("measurement.monitoring.sample_period_millis", 86400000);
        zzo = zzhr.zza("measurement.upload.realtime_upload_interval", 10000);
        zzp = zzhr.zza("measurement.upload.refresh_blacklisted_config_interval", FileCache.EXPIRE_TIME);
        zzq = zzhr.zza("measurement.config.cache_time.service", onEmbedViewParamChanged.HOUR_IN_MILLIS);
        zzr = zzhr.zza("measurement.service_client.idle_disconnect_millis", 5000);
        zzs = zzhr.zzd("measurement.log_tag.service", "FA-SVC");
        zzt = zzhr.zza("measurement.upload.stale_data_deletion_interval", 86400000);
        zzu = zzhr.zza("measurement.sdk.attribution.cache.ttl", FileCache.EXPIRE_TIME);
        zzv = zzhr.zza("measurement.upload.backoff_period", 43200000);
        zzw = zzhr.zza("measurement.upload.initial_upload_delay_time", 15000);
        zzx = zzhr.zza("measurement.upload.interval", onEmbedViewParamChanged.HOUR_IN_MILLIS);
        zzy = zzhr.zza("measurement.upload.max_bundle_size", 65536);
        zzz = zzhr.zza("measurement.upload.max_bundles", 100);
        zzA = zzhr.zza("measurement.upload.max_conversions_per_day", 500);
        zzB = zzhr.zza("measurement.upload.max_error_events_per_day", 1000);
        zzC = zzhr.zza("measurement.upload.max_events_per_bundle", 1000);
        zzD = zzhr.zza("measurement.upload.max_events_per_day", 100000);
        zzE = zzhr.zza("measurement.upload.max_public_events_per_day", 50000);
        zzF = zzhr.zza("measurement.upload.max_queue_time", 2419200000L);
        zzG = zzhr.zza("measurement.upload.max_realtime_events_per_day", 10);
        zzH = zzhr.zza("measurement.upload.max_batch_size", 65536);
        zzI = zzhr.zza("measurement.upload.retry_count", 6);
        zzJ = zzhr.zza("measurement.upload.retry_time", 1800000);
        zzK = zzhr.zzd("measurement.upload.url", "https://app-measurement.com/a");
        zzL = zzhr.zza("measurement.upload.window_interval", onEmbedViewParamChanged.HOUR_IN_MILLIS);
    }

    public final long zzA() {
        return zzD.zze().longValue();
    }

    public final long zzB() {
        return zzE.zze().longValue();
    }

    public final long zzC() {
        return zzF.zze().longValue();
    }

    public final long zzD() {
        return zzG.zze().longValue();
    }

    public final long zzE() {
        return zzH.zze().longValue();
    }

    public final long zzF() {
        return zzI.zze().longValue();
    }

    public final long zzG() {
        return zzJ.zze().longValue();
    }

    public final String zzH() {
        return zzK.zze();
    }

    public final long zzI() {
        return zzL.zze().longValue();
    }

    public final long zza() {
        return zza.zze().longValue();
    }

    public final long zzb() {
        return zzb.zze().longValue();
    }

    public final long zzc() {
        return zzc.zze().longValue();
    }

    public final String zzd() {
        return zze.zze();
    }

    public final String zze() {
        return zzf.zze();
    }

    public final long zzf() {
        return zzg.zze().longValue();
    }

    public final long zzg() {
        return zzh.zze().longValue();
    }

    public final long zzh() {
        return zzi.zze().longValue();
    }

    public final long zzi() {
        return zzj.zze().longValue();
    }

    public final long zzj() {
        return zzk.zze().longValue();
    }

    public final long zzk() {
        return zzl.zze().longValue();
    }

    public final long zzl() {
        return zzm.zze().longValue();
    }

    public final long zzm() {
        return zzn.zze().longValue();
    }

    public final long zzn() {
        return zzo.zze().longValue();
    }

    public final long zzo() {
        return zzp.zze().longValue();
    }

    public final long zzp() {
        return zzr.zze().longValue();
    }

    public final long zzq() {
        return zzt.zze().longValue();
    }

    public final long zzr() {
        return zzu.zze().longValue();
    }

    public final long zzs() {
        return zzv.zze().longValue();
    }

    public final long zzt() {
        return zzw.zze().longValue();
    }

    public final long zzu() {
        return zzx.zze().longValue();
    }

    public final long zzv() {
        return zzy.zze().longValue();
    }

    public final long zzw() {
        return zzz.zze().longValue();
    }

    public final long zzx() {
        return zzA.zze().longValue();
    }

    public final long zzy() {
        return zzB.zze().longValue();
    }

    public final long zzz() {
        return zzC.zze().longValue();
    }
}
