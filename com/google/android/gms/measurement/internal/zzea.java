package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.alibaba.griver.base.common.utils.FileCache;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.onEmbedViewParamChanged;

@VisibleForTesting
public final class zzea {
    public static final zzdz<Long> zzA = zzb("measurement.upload.retry_time", 1800000L, 1800000L, zzbm.zza);
    public static final zzdz<Integer> zzB = zzb("measurement.upload.retry_count", 6, 6, zzbn.zza);
    public static final zzdz<Long> zzC = zzb("measurement.upload.max_queue_time", 2419200000L, 2419200000L, zzbo.zza);
    public static final zzdz<Integer> zzD = zzb("measurement.lifetimevalue.max_currency_tracked", 4, 4, zzbp.zza);
    public static final zzdz<Integer> zzE = zzb("measurement.audience.filter_result_max_count", 200, 200, zzbr.zza);
    public static final zzdz<Integer> zzF = zzb("measurement.upload.max_public_user_properties", 25, 25, (zzdx) null);
    public static final zzdz<Integer> zzG = zzb("measurement.upload.max_event_name_cardinality", 500, 500, (zzdx) null);
    public static final zzdz<Integer> zzH = zzb("measurement.upload.max_public_event_params", 25, 25, (zzdx) null);
    public static final zzdz<Long> zzI = zzb("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, zzbs.zza);
    public static final zzdz<Boolean> zzJ = zzb("measurement.test.boolean_flag", false, false, zzbt.zza);
    public static final zzdz<String> zzK = zzb("measurement.test.string_flag", "---", "---", zzbu.zza);
    public static final zzdz<Long> zzL = zzb("measurement.test.long_flag", -1L, -1L, zzbv.zza);
    public static final zzdz<Integer> zzM = zzb("measurement.test.int_flag", -2, -2, zzbw.zza);
    public static final zzdz<Double> zzN;
    public static final zzdz<Integer> zzO = zzb("measurement.experiment.max_ids", 50, 50, zzby.zza);
    public static final zzdz<Integer> zzP = zzb("measurement.max_bundles_per_iteration", 100, 100, zzbz.zza);
    public static final zzdz<Long> zzQ;
    public static final zzdz<Boolean> zzR = zzb("measurement.validation.internal_limits_internal_event_params", false, false, zzcc.zza);
    public static final zzdz<Boolean> zzS = zzb("measurement.collection.firebase_global_collection_flag_enabled", true, true, zzcd.zza);
    public static final zzdz<Boolean> zzT = zzb("measurement.collection.redundant_engagement_removal_enabled", false, false, zzce.zza);
    public static final zzdz<Boolean> zzU = zzb("measurement.collection.log_event_and_bundle_v2", true, true, zzcf.zza);
    public static final zzdz<Boolean> zzV = zzb("measurement.quality.checksum", false, false, (zzdx) null);
    public static final zzdz<Boolean> zzW = zzb("measurement.sdk.collection.validate_param_names_alphabetical", true, true, zzcg.zza);
    public static final zzdz<Boolean> zzX = zzb("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, zzch.zza);
    public static final zzdz<Boolean> zzY = zzb("measurement.audience.refresh_event_count_filters_timestamp", false, false, zzci.zza);
    public static final zzdz<Boolean> zzZ = zzb("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, zzcj.zza);
    public static final zzdz<Long> zza = zzb("measurement.ad_id_cache_time", 10000L, 10000L, zzau.zza);
    public static final zzdz<Boolean> zzaA = zzb("measurement.client.reject_blank_user_id", true, true, zzdn.zza);
    public static final zzdz<Boolean> zzaB = zzb("measurement.config.persist_last_modified", true, true, zzdo.zza);
    public static final zzdz<Boolean> zzaC = zzb("measurement.client.consent.suppress_1p_in_ga4f_install", true, true, zzdp.zza);
    public static final zzdz<Boolean> zzaD = zzb("measurement.module.pixie.ees", false, false, zzdq.zza);
    public static final zzdz<Boolean> zzaE = zzb("measurement.euid.client.dev", false, false, zzdr.zza);
    public static final zzdz<Boolean> zzaF = zzb("measurement.euid.service", false, false, zzds.zza);
    /* access modifiers changed from: private */
    public static final List<zzdz<?>> zzaG = Collections.synchronizedList(new ArrayList());
    private static final Set<zzdz<?>> zzaH = Collections.synchronizedSet(new HashSet());
    public static final zzdz<Boolean> zzaa = zzb("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, zzck.zza);
    public static final zzdz<Boolean> zzab = zzb("measurement.sdk.collection.last_deep_link_referrer2", true, true, zzcl.zza);
    public static final zzdz<Boolean> zzac = zzb("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, zzcn.zza);
    public static final zzdz<Boolean> zzad = zzb("measurement.sdk.collection.last_gclid_from_referrer2", false, false, zzco.zza);
    public static final zzdz<Boolean> zzae = zzb("measurement.sdk.collection.enable_extend_user_property_size", true, true, zzcp.zza);
    public static final zzdz<Boolean> zzaf = zzb("measurement.upload.file_lock_state_check", true, true, zzcq.zza);
    public static final zzdz<Boolean> zzag = zzb("measurement.ga.ga_app_id", false, false, zzcr.zza);
    public static final zzdz<Boolean> zzah = zzb("measurement.lifecycle.app_in_background_parameter", false, false, zzcs.zza);
    public static final zzdz<Boolean> zzai = zzb("measurement.integration.disable_firebase_instance_id", false, false, zzct.zza);
    public static final zzdz<Boolean> zzaj = zzb("measurement.lifecycle.app_backgrounded_engagement", false, false, zzcu.zza);
    public static final zzdz<Boolean> zzak = zzb("measurement.collection.service.update_with_analytics_fix", false, false, zzcv.zza);
    public static final zzdz<Boolean> zzal = zzb("measurement.service.use_appinfo_modified", true, true, zzcw.zza);
    public static final zzdz<Boolean> zzam = zzb("measurement.client.firebase_feature_rollout.v1.enable", true, true, zzcy.zza);
    public static final zzdz<Boolean> zzan = zzb("measurement.client.sessions.check_on_reset_and_enable2", true, true, zzcz.zza);
    public static final zzdz<Boolean> zzao = zzb("measurement.scheduler.task_thread.cleanup_on_exit", false, false, zzda.zza);
    public static final zzdz<Boolean> zzap = zzb("measurement.upload.file_truncate_fix", false, false, zzdb.zza);
    public static final zzdz<Boolean> zzaq = zzb("measurement.sdk.screen.disabling_automatic_reporting", true, true, zzdc.zza);
    public static final zzdz<Boolean> zzar = zzb("measurement.sdk.screen.manual_screen_view_logging", true, true, zzdd.zza);
    public static final zzdz<Boolean> zzas = zzb("measurement.collection.synthetic_data_mitigation", false, false, zzde.zza);
    public static final zzdz<Boolean> zzat = zzb("measurement.androidId.delete_feature", true, true, zzdf.zza);
    public static final zzdz<Integer> zzau = zzb("measurement.service.storage_consent_support_version", 203600, 203600, zzdg.zza);
    public static final zzdz<Boolean> zzav = zzb("measurement.upload.directly_maybe_log_error_events", true, true, zzdh.zza);
    public static final zzdz<Boolean> zzaw = zzb("measurement.frontend.directly_maybe_log_error_events", false, false, zzdj.zza);
    public static final zzdz<Boolean> zzax = zzb("measurement.client.properties.non_null_origin", true, true, zzdk.zza);
    public static final zzdz<Boolean> zzay = zzb("measurement.client.click_identifier_control.dev", false, false, zzdl.zza);
    public static final zzdz<Boolean> zzaz = zzb("measurement.service.click_identifier_control", false, false, zzdm.zza);
    public static final zzdz<Long> zzb = zzb("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, zzbf.zza);
    public static final zzdz<Long> zzc;
    public static final zzdz<String> zzd = zzb("measurement.config.url_scheme", "https", "https", zzcb.zza);
    public static final zzdz<String> zze = zzb("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", zzcm.zza);
    public static final zzdz<Integer> zzf = zzb("measurement.upload.max_bundles", 100, 100, zzcx.zza);
    public static final zzdz<Integer> zzg = zzb("measurement.upload.max_batch_size", 65536, 65536, zzdi.zza);
    public static final zzdz<Integer> zzh = zzb("measurement.upload.max_bundle_size", 65536, 65536, zzdt.zza);
    public static final zzdz<Integer> zzi = zzb("measurement.upload.max_events_per_bundle", 1000, 1000, zzdu.zza);
    public static final zzdz<Integer> zzj;
    public static final zzdz<Integer> zzk = zzb("measurement.upload.max_error_events_per_day", 1000, 1000, zzav.zza);
    public static final zzdz<Integer> zzl = zzb("measurement.upload.max_public_events_per_day", 50000, 50000, zzaw.zza);
    public static final zzdz<Integer> zzm = zzb("measurement.upload.max_conversions_per_day", 10000, 10000, zzax.zza);
    public static final zzdz<Integer> zzn = zzb("measurement.upload.max_realtime_events_per_day", 10, 10, zzay.zza);
    public static final zzdz<Integer> zzo;
    public static final zzdz<String> zzp = zzb("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", zzba.zza);
    public static final zzdz<Long> zzq = zzb("measurement.upload.backoff_period", 43200000L, 43200000L, zzbb.zza);
    public static final zzdz<Long> zzr;
    public static final zzdz<Long> zzs;
    public static final zzdz<Long> zzt = zzb("measurement.upload.realtime_upload_interval", 10000L, 10000L, zzbe.zza);
    public static final zzdz<Long> zzu = zzb("measurement.upload.debug_upload_interval", 1000L, 1000L, zzbg.zza);
    public static final zzdz<Long> zzv = zzb("measurement.upload.minimum_delay", 500L, 500L, zzbh.zza);
    public static final zzdz<Long> zzw;
    public static final zzdz<Long> zzx = zzb("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, zzbj.zza);
    public static final zzdz<Long> zzy;
    public static final zzdz<Long> zzz = zzb("measurement.upload.initial_upload_delay_time", 15000L, 15000L, zzbl.zza);

    static {
        Long valueOf = Long.valueOf(onEmbedViewParamChanged.HOUR_IN_MILLIS);
        zzc = zzb("measurement.config.cache_time", 86400000L, valueOf, zzbq.zza);
        Integer valueOf2 = Integer.valueOf(DefaultOggSeeker.MATCH_BYTE_RANGE);
        zzj = zzb("measurement.upload.max_events_per_day", valueOf2, valueOf2, zzdv.zza);
        zzo = zzb("measurement.store.max_stored_events_per_app", valueOf2, valueOf2, zzaz.zza);
        zzr = zzb("measurement.upload.window_interval", valueOf, valueOf, zzbc.zza);
        zzs = zzb("measurement.upload.interval", valueOf, valueOf, zzbd.zza);
        Long valueOf3 = Long.valueOf(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        zzw = zzb("measurement.alarm_manager.minimum_interval", valueOf3, valueOf3, zzbi.zza);
        Long valueOf4 = Long.valueOf(FileCache.EXPIRE_TIME);
        zzy = zzb("measurement.upload.refresh_blacklisted_config_interval", valueOf4, valueOf4, zzbk.zza);
        Double valueOf5 = Double.valueOf(-3.0d);
        zzN = zzb("measurement.test.double_flag", valueOf5, valueOf5, zzbx.zza);
        zzQ = zzb("measurement.sdk.attribution.cache.ttl", valueOf4, valueOf4, zzca.zza);
    }

    public static Map<String, String> zza(Context context) {
        zzha zza2 = zzha.zza(context.getContentResolver(), zzhk.zza("com.google.android.gms.measurement"));
        return zza2 == null ? Collections.emptyMap() : zza2.zzb();
    }

    @VisibleForTesting
    static <V> zzdz<V> zzb(String str, V v, V v2, zzdx<V> zzdx) {
        zzdz zzdz = new zzdz(str, v, v2, zzdx, (zzdw) null);
        zzaG.add(zzdz);
        return zzdz;
    }
}
