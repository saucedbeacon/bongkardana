package com.alipay.iap.android.common.securityprofiles.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.iap.android.common.securityprofiles.provider.ProfileProvider;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class ProfileUtils {
    private static final String TAG = "ProfileUtils";

    private ProfileUtils() {
    }

    @Nullable
    private static JSONObject getProfilesInfo(@NonNull Context context, @NonNull ProfileProvider profileProvider, @NonNull String str, @NonNull String str2) {
        String profileData = profileProvider.getProfileData(context, str2);
        if (TextUtils.isEmpty(profileData)) {
            return null;
        }
        LoggerWrapper.d(TAG, String.format("getProfilesInfo: environment = %s, key = %s, extraData = %s", new Object[]{str, str2, profileData}));
        try {
            return new JSONObject(new JSONObject(profileData).optString(str));
        } catch (Exception e) {
            LoggerWrapper.e(TAG, "Cannot parse params from securityGuard extra data!", e);
            return null;
        }
    }

    @Nullable
    public static RpcProfile createRpcProfile(@NonNull Context context, @NonNull ProfileProvider profileProvider, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        JSONObject profilesInfo = getProfilesInfo(context, profileProvider, str2, str3);
        if (profilesInfo == null) {
            return null;
        }
        RpcProfile rpcProfile = new RpcProfile();
        rpcProfile.authCode = str;
        rpcProfile.environment = str2;
        rpcProfile.extras = parseExtras(profilesInfo);
        try {
            rpcProfile.appId = profilesInfo.optString("appId");
            rpcProfile.appKey = profilesInfo.optString("appKey");
            rpcProfile.productId = profilesInfo.optString("productId");
            rpcProfile.gatewayUrl = profilesInfo.optString("gatewayUrl");
        } catch (Exception e) {
            LoggerWrapper.w(TAG, "Cannot parse Rpc Profiles!", e);
        }
        return rpcProfile;
    }

    @NonNull
    private static Map<String, String> parseExtras(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("extras");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return hashMap;
    }

    @Nullable
    public static SyncProfile createSyncProfile(@NonNull Context context, @NonNull ProfileProvider profileProvider, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        JSONObject profilesInfo = getProfilesInfo(context, profileProvider, str2, str3);
        if (profilesInfo == null) {
            return null;
        }
        SyncProfile syncProfile = new SyncProfile();
        syncProfile.authCode = str;
        syncProfile.environment = str2;
        syncProfile.productVersion = MiscUtils.getVersionName(context);
        syncProfile.extras = parseExtras(profilesInfo);
        try {
            syncProfile.productId = profilesInfo.optString("productId");
            syncProfile.appId = profilesInfo.optString("appId");
            syncProfile.appKey = profilesInfo.optString("appKey");
            syncProfile.workspaceId = profilesInfo.optString(HeaderConstant.HEADER_KEY_WORKSPACE_ID);
            syncProfile.syncServerAddress = profilesInfo.optString("server");
            syncProfile.syncServerPort = profilesInfo.optString("port");
        } catch (Exception e) {
            LoggerWrapper.w(TAG, "Cannot parse Sync Profiles!", e);
        }
        return syncProfile;
    }
}
