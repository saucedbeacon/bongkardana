package com.alibaba.griver.base.common.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.constants.SecurityConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.alipay.iap.android.common.securityprofiles.extractor.ProfileExtractor;

public class SecurityGuardUtils {
    public static String getExtraData(String str, String str2) {
        JSONObject parseObject = JSON.parseObject(getSecurityExtraData(GriverEnv.getApplicationContext(), str, ProfileExtractor.KEY_DEFAULT_RPC_PROFILES));
        return (!JSONUtils.contains(parseObject, "prod") || !JSONUtils.contains(parseObject.getJSONObject("prod"), "extras")) ? "" : parseObject.getJSONObject("prod").getJSONObject("extras").getString(str2);
    }

    @Nullable
    public static String getSecurityExtraData(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        IStaticDataStoreComponent staticDataStoreComp;
        if (!ReflectUtils.classExist(SecurityConstants.SG_CLASS) || (staticDataStoreComp = SecurityGuardManager.getInstance(context).getStaticDataStoreComp()) == null) {
            return null;
        }
        return staticDataStoreComp.getExtraData(str2, str);
    }
}
