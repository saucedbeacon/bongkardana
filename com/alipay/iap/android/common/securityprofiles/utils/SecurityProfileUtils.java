package com.alipay.iap.android.common.securityprofiles.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.extractor.ProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.iap.android.common.securityprofiles.provider.SecurityGuardProfileProvider;

public class SecurityProfileUtils {
    private static final String TAG = "SecurityProfileUtils";

    @Nullable
    public static String getSecurityExtraData(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        try {
            IStaticDataStoreComponent staticDataStoreComp = SecurityGuardManager.getInstance(context).getStaticDataStoreComp();
            if (staticDataStoreComp != null) {
                return staticDataStoreComp.getExtraData(str2, str);
            }
            return null;
        } catch (Exception e) {
            LoggerWrapper.e(TAG, "Cannot getSecurityExtraData!", e);
            return null;
        }
    }

    @Nullable
    public static RpcProfile createRpcProfile(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        return ProfileUtils.createRpcProfile(context, new SecurityGuardProfileProvider(str), str, str2, str3);
    }

    @Nullable
    public static SyncProfile createSyncProfile(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return ProfileUtils.createSyncProfile(context, new SecurityGuardProfileProvider(str), str, str2, ProfileExtractor.KEY_SYNC_PROFILES);
    }
}
