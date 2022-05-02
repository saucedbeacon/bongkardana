package o;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import o.PackageDownloadRequest;
import o.RVResourceUtils;
import o.b;

public final class setAutoInstall implements getAdapterPosition<PackageDownloadRequest.AnonymousClass1> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setAutoInstall(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final PackageDownloadRequest.AnonymousClass1 get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static setAutoInstall create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setAutoInstall(bVar, bVar2);
    }

    public static PackageDownloadRequest.AnonymousClass1 newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new Object(context, pluginInstallCallback) {
            private static final String GENERAL_PREFERENCES;
            private final onSingleFailed preferenceFacade;
            private final PluginInstallCallback serializer;

            static {
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass1.class.getSimpleName());
                sb.append("production");
                GENERAL_PREFERENCES = sb.toString();
            }

            {
                this.serializer = r3;
                this.preferenceFacade = new RVResourceUtils(new RVResourceUtils.getMax(r2).setPreferenceGroup(GENERAL_PREFERENCES).setUseDrutherPreference(true).setSerializerFacade(r3)).createData("local");
            }

            public Boolean getNotificationRegistrationToken() {
                return this.preferenceFacade.getBoolean("notif_regist_token");
            }

            public Boolean saveNotificationRegistrationToken(Boolean bool) {
                this.preferenceFacade.saveData("notif_regist_token", bool);
                return Boolean.TRUE;
            }

            public Boolean isLocationPermissionDenied() {
                return this.preferenceFacade.getBoolean("location_permission_denied_and_never_ask_again");
            }

            public Boolean setLocationPermissionDenied(Boolean bool) {
                this.preferenceFacade.saveData("location_permission_denied_and_never_ask_again", bool);
                return Boolean.TRUE;
            }

            public boolean isAppFirstLaunch() {
                boolean z = !this.preferenceFacade.getBoolean("is_app_launched").booleanValue();
                if (z) {
                    this.preferenceFacade.saveData("is_app_launched", Boolean.TRUE);
                }
                return z;
            }

            public String addInterstitialBannerReadList(String str) {
                List<String> interstitialBannerReadList = getInterstitialBannerReadList();
                interstitialBannerReadList.add(str);
                this.preferenceFacade.saveData("interstitial_banner_list", interstitialBannerReadList);
                return str;
            }

            private List<String> getInterstitialBannerReadList() {
                String string = this.preferenceFacade.getString("interstitial_banner_list");
                if (TextUtils.isEmpty(string)) {
                    return new ArrayList();
                }
                return this.serializer.deserializeList(string);
            }

            private void resetInterstitialBannerReadList() {
                this.preferenceFacade.clearData("interstitial_banner_reset_time");
                this.preferenceFacade.clearData("interstitial_banner_list");
            }

            public Boolean checkResetInterstitialBannerReadList(Long l) {
                if (isResetTimeValueLower(l).booleanValue() && l.longValue() > 0) {
                    resetInterstitialBannerReadList();
                }
                return Boolean.TRUE;
            }

            private Boolean isResetTimeValueLower(Long l) {
                if (this.preferenceFacade.getLong("interstitial_banner_reset_time") == null) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(System.currentTimeMillis() >= this.preferenceFacade.getLong("interstitial_banner_reset_time").longValue() + l.longValue());
            }

            public Boolean saveResetInterstitialBannerTime(Long l) {
                if (isCheckShouldSaveResetTime().booleanValue()) {
                    this.preferenceFacade.saveData("interstitial_banner_reset_time", l);
                }
                return Boolean.TRUE;
            }

            private Boolean isCheckShouldSaveResetTime() {
                return Boolean.valueOf(this.preferenceFacade.getLong("interstitial_banner_reset_time") == null || this.preferenceFacade.getLong("interstitial_banner_reset_time").longValue() < 0);
            }

            public Boolean checkBannerReadList(String str) {
                if (TextUtils.isEmpty(str)) {
                    return Boolean.FALSE;
                }
                List<String> interstitialBannerReadList = getInterstitialBannerReadList();
                if (interstitialBannerReadList == null || interstitialBannerReadList.isEmpty()) {
                    return Boolean.FALSE;
                }
                for (String equals : interstitialBannerReadList) {
                    if (str.equals(equals)) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }

            public Boolean checkShouldShowInterstitialBanner(Long l) {
                if (this.preferenceFacade.getLong("interstitial_banner_gap_time") == null || this.preferenceFacade.getLong("interstitial_banner_gap_time").longValue() < 0) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(System.currentTimeMillis() >= this.preferenceFacade.getLong("interstitial_banner_gap_time").longValue() + l.longValue());
            }

            public Boolean saveInterstitialBannerNextGapTime(Long l) {
                this.preferenceFacade.saveData("interstitial_banner_gap_time", l);
                return Boolean.TRUE;
            }

            public boolean getBalanceVisibility() {
                return this.preferenceFacade.getBoolean("hide_balance_amount", true).booleanValue();
            }

            public Boolean setBalanceVisibility(Boolean bool) {
                this.preferenceFacade.saveData("hide_balance_amount", bool);
                return Boolean.TRUE;
            }

            public boolean getSavingBalanceVisibility() {
                return this.preferenceFacade.getBoolean("saving_balance_visibility", true).booleanValue();
            }

            public Boolean saveSavingBalanceVisibility(Boolean bool) {
                this.preferenceFacade.saveData("saving_balance_visibility", bool);
                return Boolean.TRUE;
            }

            public Boolean saveMigrateRoomToUserConfig(boolean z) {
                this.preferenceFacade.saveData("migrate_room_to_user_config", Boolean.valueOf(z));
                return Boolean.TRUE;
            }

            public boolean needMigrateRoomToUserConfig() {
                return this.preferenceFacade.getBoolean("migrate_room_to_user_config", false).booleanValue();
            }

            public Boolean saveLatestSeenReferralCampaign(String str) {
                this.preferenceFacade.saveData("last_seen_referral_campaign_id", str);
                return Boolean.TRUE;
            }

            public String getLatestSeenReferralCampaignId() {
                return this.preferenceFacade.getString("last_seen_referral_campaign_id");
            }

            public Boolean setGeofenceRetryInterval(int i) {
                this.preferenceFacade.saveData("geofence_retry_interval", Integer.valueOf(i));
                return Boolean.TRUE;
            }

            public int getGeofenceRetryInterval() {
                return this.preferenceFacade.getInteger("geofence_retry_interval").intValue();
            }

            public boolean getHomeRevampEnabledFlag() {
                return this.preferenceFacade.getBoolean("home_v2_revamp_enabled", true).booleanValue();
            }

            public boolean setHomeRevampEnabledFlag(boolean z) {
                this.preferenceFacade.saveData("home_v2_revamp_enabled", Boolean.valueOf(z));
                return true;
            }

            public boolean getAppShortcutEnabledFlag() {
                return this.preferenceFacade.getBoolean("dana_app_shortcut_enabled", false).booleanValue();
            }

            public boolean setAppShortcutEnabledFlag(boolean z) {
                this.preferenceFacade.saveData("dana_app_shortcut_enabled", Boolean.valueOf(z));
                return true;
            }

            public <T> boolean saveData(String str, T t) {
                try {
                    this.preferenceFacade.saveData(str, t);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }

            @Nullable
            public <T> T getObject(String str, Class<T> cls) {
                try {
                    return this.preferenceFacade.getObject(str, cls);
                } catch (Exception unused) {
                    return null;
                }
            }

            public void clearAll() {
                this.preferenceFacade.clearAllData();
            }
        };
    }
}
