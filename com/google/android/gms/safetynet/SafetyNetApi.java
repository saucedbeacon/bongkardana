package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import java.util.List;

@KeepForSdkWithMembers
public interface SafetyNetApi {

    public static class AttestationResponse extends Response<zza> {
        public String getJwsResult() {
            return ((zza) getResult()).getJwsResult();
        }
    }

    public static class HarmfulAppsResponse extends Response<zzb> {
        public List<HarmfulAppsData> getHarmfulAppsList() {
            return ((zzb) getResult()).getHarmfulAppsList();
        }

        public int getHoursSinceLastScanWithHarmfulApp() {
            return ((zzb) getResult()).getHoursSinceLastScanWithHarmfulApp();
        }

        public long getLastScanTimeMs() {
            return ((zzb) getResult()).getLastScanTimeMs();
        }
    }

    public static class RecaptchaTokenResponse extends Response<RecaptchaTokenResult> {
        public String getTokenResult() {
            return ((RecaptchaTokenResult) getResult()).getTokenResult();
        }
    }

    @Deprecated
    public interface RecaptchaTokenResult extends Result {
        String getTokenResult();
    }

    @KeepForSdkWithMembers
    public static class SafeBrowsingResponse extends Response<SafeBrowsingResult> {
        public List<SafeBrowsingThreat> getDetectedThreats() {
            return ((SafeBrowsingResult) getResult()).getDetectedThreats();
        }

        public long getLastUpdateTimeMs() {
            return ((SafeBrowsingResult) getResult()).getLastUpdateTimeMs();
        }

        public String getMetadata() {
            return ((SafeBrowsingResult) getResult()).getMetadata();
        }

        public byte[] getState() {
            return ((SafeBrowsingResult) getResult()).getState();
        }
    }

    @KeepForSdkWithMembers
    @Deprecated
    public interface SafeBrowsingResult extends Result {
        List<SafeBrowsingThreat> getDetectedThreats();

        long getLastUpdateTimeMs();

        String getMetadata();

        byte[] getState();
    }

    public static class VerifyAppsUserResponse extends Response<zzc> {
        public boolean isVerifyAppsEnabled() {
            return ((zzc) getResult()).isVerifyAppsEnabled();
        }
    }

    @Deprecated
    public interface zza extends Result {
        String getJwsResult();
    }

    @Deprecated
    public interface zzb extends Result {
        List<HarmfulAppsData> getHarmfulAppsList();

        int getHoursSinceLastScanWithHarmfulApp();

        long getLastScanTimeMs();
    }

    @Deprecated
    public interface zzc extends Result {
        boolean isVerifyAppsEnabled();
    }

    @Deprecated
    PendingResult<zza> attest(GoogleApiClient googleApiClient, byte[] bArr);

    @Deprecated
    PendingResult<zzc> enableVerifyApps(GoogleApiClient googleApiClient);

    @Deprecated
    PendingResult<zzc> isVerifyAppsEnabled(GoogleApiClient googleApiClient);

    @Deprecated
    boolean isVerifyAppsEnabled(Context context);

    @Deprecated
    PendingResult<zzb> listHarmfulApps(GoogleApiClient googleApiClient);

    @Deprecated
    PendingResult<SafeBrowsingResult> lookupUri(GoogleApiClient googleApiClient, String str, String str2, int... iArr);

    PendingResult<SafeBrowsingResult> lookupUri(GoogleApiClient googleApiClient, List<Integer> list, String str);

    @Deprecated
    PendingResult<RecaptchaTokenResult> verifyWithRecaptcha(GoogleApiClient googleApiClient, String str);
}
