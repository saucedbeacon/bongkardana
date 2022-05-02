package com.alipay.plus.android.config.sdk.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.extractor.ConfigProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.extractor.ProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.extractor.SecurityProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.alipay.plus.android.config.sdk.a.e;

public class ConfigProfileUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10767a = e.a("ConfigProfileUtils");

    @NonNull
    public static ProfileExtractor createAssetFileExtractor(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return new ConfigProfileExtractor(context, str, MiscUtils.getAssetContent(context, str2));
    }

    @Nullable
    public static RpcProfile createRpcProfile(@NonNull ProfileExtractor profileExtractor, @NonNull String str, @NonNull String str2) {
        RpcProfile createAmcsRpcProfile = profileExtractor.createAmcsRpcProfile(str);
        if (createAmcsRpcProfile != null) {
            return createAmcsRpcProfile;
        }
        LoggerWrapper.e(f10767a, String.format("Cannot extract Amcs RpcProfile! environment = %s, authCode = %s.", new Object[]{str, str2}));
        LoggerWrapper.e(f10767a, "Will retrieve prod environment RpcProfile!");
        return profileExtractor.createAmcsRpcProfile("prod");
    }

    @NonNull
    public static RpcProfile createRpcProfileByMultipleEnvironment(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        String replace = str2.replace("-", "");
        RpcProfile createAmcsRpcProfile = new SecurityProfileExtractor(context, str3).createAmcsRpcProfile(str);
        if (createAmcsRpcProfile == null) {
            createAmcsRpcProfile = new RpcProfile();
            LoggerWrapper.e(f10767a, "Use mocked RpcProfile!!");
        } else {
            createAmcsRpcProfile.productId = String.format("%s_android_%s", new Object[]{createAmcsRpcProfile.appId, replace});
        }
        createAmcsRpcProfile.environment = replace;
        createAmcsRpcProfile.authCode = str3;
        return createAmcsRpcProfile;
    }

    @Nullable
    public static SyncProfile createSyncProfile(@NonNull ProfileExtractor profileExtractor, @NonNull String str, @NonNull String str2) {
        SyncProfile createSyncProfile = profileExtractor.createSyncProfile(str);
        if (createSyncProfile == null) {
            LoggerWrapper.e(f10767a, String.format("Cannot extract SyncProfile! environment = %s, authCode = %s.", new Object[]{str, str2}));
            LoggerWrapper.e(f10767a, "Will retrieve prod environment SyncProfile!");
            createSyncProfile = profileExtractor.createSyncProfile("prod");
            if (createSyncProfile == null) {
                LoggerWrapper.e(f10767a, "Cannot get prod SyncProfile!!");
            }
        }
        return createSyncProfile;
    }
}
