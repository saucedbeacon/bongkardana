package com.alipay.plus.android.ab.sdk.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.extractor.ProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.plus.android.config.sdk.a.e;

public class AbTestingUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10734a = e.a("AbTestingUtils");

    @Nullable
    public static SyncProfile createSyncProfile(@NonNull ProfileExtractor profileExtractor, @NonNull String str, @NonNull String str2) {
        SyncProfile createSyncProfile = profileExtractor.createSyncProfile(str);
        if (createSyncProfile == null) {
            LoggerWrapper.e(f10734a, String.format("Cannot extract SyncProfile! environment = %s, authCode = %s.", new Object[]{str, str2}));
            LoggerWrapper.e(f10734a, "Will retrieve prod environment SyncProfile!");
            createSyncProfile = profileExtractor.createSyncProfile("prod");
            if (createSyncProfile == null) {
                LoggerWrapper.e(f10734a, "Cannot get prod SyncProfile!!");
            }
        }
        return createSyncProfile;
    }

    @Nullable
    public static String toJSONString(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return JSONObject.toJSONString(obj);
        } catch (Throwable th) {
            String str = f10734a;
            StringBuilder sb = new StringBuilder("toJSONString failed. error = ");
            sb.append(th.getMessage());
            LoggerWrapper.e(str, sb.toString());
            return null;
        }
    }
}
