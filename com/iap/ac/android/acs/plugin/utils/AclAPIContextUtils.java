package com.iap.ac.android.acs.plugin.utils;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginContext;
import com.iap.ac.android.biz.common.model.acl.AclAPIContext;
import com.iap.ac.android.biz.common.model.acl.AclMiniProgramMetaData;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;

public class AclAPIContextUtils {
    public static final String AC_MERCHANT_ID = "merchantId";

    public static AclAPIContext createAclAPIContext(@NonNull IAPConnectPluginContext iAPConnectPluginContext) {
        String str = iAPConnectPluginContext.miniProgramAppID;
        String optString = iAPConnectPluginContext.acParams != null ? iAPConnectPluginContext.acParams.optString("merchantId") : null;
        StringBuilder sb = new StringBuilder("ApiContextUtils#createAclApiContext, appId: ");
        sb.append(str);
        sb.append(", merchantId: ");
        sb.append(optString);
        ACLog.d(Constants.TAG, sb.toString());
        return new AclAPIContext(AclAPIContext.API_SOURCE_AC, new AclMiniProgramMetaData(str, optString), new HashMap());
    }
}
