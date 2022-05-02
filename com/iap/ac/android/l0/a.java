package com.iap.ac.android.l0;

import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.container.provider.JsApiPermissionProvider;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;

public class a implements JsApiPermissionProvider {
    public boolean hasDomainPermission(String str, String str2) {
        List<String> domains = ConfigCenter.INSTANCE.getDomains(str);
        if (domains == null) {
            return true;
        }
        for (String isDomainMatch : domains) {
            if (Utils.isDomainMatch(isDomainMatch, str2)) {
            }
        }
        ACLog.d("ACJsApiPermissionProvider", String.format("JSAPI call rejected domains = %s, url = %s:", new Object[]{domains, str2}));
        return false;
        return true;
    }
}
