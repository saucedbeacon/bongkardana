package com.alipay.iap.android.common.securityprofiles.extractor;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.iap.android.common.securityprofiles.provider.ProfileProvider;
import com.alipay.iap.android.common.securityprofiles.utils.ProfileUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class ProfileExtractor {
    public static final String KEY_AMCS_RPC_PROFILES = "amcsRpcProfiles";
    public static final String KEY_DEFAULT_RPC_PROFILES = "defaultRpcProfiles";
    public static final String KEY_SYNC_PROFILES = "syncProfiles";
    @NonNull
    protected String mAuthCode;
    @NonNull
    protected Context mContext;
    @Nullable
    protected ProfileProvider mProfileProvider;

    /* access modifiers changed from: protected */
    @NonNull
    public abstract ProfileProvider createProfileProvider();

    public ProfileExtractor(@NonNull Context context, @NonNull String str) {
        this.mContext = context;
        this.mAuthCode = str;
    }

    @NonNull
    public ProfileProvider getProfileProvider() {
        if (this.mProfileProvider == null) {
            this.mProfileProvider = createProfileProvider();
        }
        return this.mProfileProvider;
    }

    @Nullable
    public String getProfileData(@NonNull String str) {
        return getProfileProvider().getProfileData(this.mContext, str);
    }

    @Nullable
    public RpcProfile createDefaultRpcProfile(@NonNull String str) {
        return createRpcProfile(str, KEY_DEFAULT_RPC_PROFILES);
    }

    @Nullable
    public RpcProfile createAmcsRpcProfile(@NonNull String str) {
        return createRpcProfile(str, KEY_AMCS_RPC_PROFILES);
    }

    @Nullable
    public RpcProfile createRpcProfile(@NonNull String str, @NonNull String str2) {
        return ProfileUtils.createRpcProfile(this.mContext, getProfileProvider(), this.mAuthCode, str, str2);
    }

    @Nullable
    public SyncProfile createSyncProfile(@NonNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1301092643, oncanceled);
            onCancelLoad.getMin(1301092643, oncanceled);
        }
        return ProfileUtils.createSyncProfile(this.mContext, getProfileProvider(), this.mAuthCode, str, KEY_SYNC_PROFILES);
    }
}
