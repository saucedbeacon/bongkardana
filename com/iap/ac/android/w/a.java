package com.iap.ac.android.w;

import com.iap.ac.android.acs.plugin.rpc.getphonenumber.PhoneNumberFacade;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.oauth.BaseAutoOAuthInterceptor;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a extends BaseAutoOAuthInterceptor {
    public static Set<String> j;
    public static Set<String> k;

    static {
        HashSet hashSet = new HashSet();
        j = hashSet;
        hashSet.add("ac.mobilepayment.instorepayment.cpm.encode");
        j.add("ac.mobilepayment.mpm.code.scan");
        j.add("ac.mobilepayment.basic.page.query");
        j.add("ac.mobilepayment.user.info.query");
        j.add(PhoneNumberFacade.OPERATION_TYPE_QUERY);
        HashSet hashSet2 = new HashSet();
        k = hashSet2;
        hashSet2.add("ac.mobilepayment.auth.holdlogin");
        k.add("ac.mobilepayment.auth.authlogin");
        k.add("ac.mobilepayment.auth.logout");
    }

    public a(String str) {
        super(str);
    }

    public Set<String> getLoginIgnoredOpSet() {
        return k;
    }

    public Set<String> getLoginRequiredOpSet() {
        HashSet hashSet = new HashSet(j);
        List<String> authList = ConfigCenter.INSTANCE.getAuthList();
        if (authList != null) {
            hashSet.addAll(authList);
        }
        ACLog.d(Constants.TAG, "ACAutoOAuthInterceptor#getLoginRequiredOpSet, ".concat(String.valueOf(hashSet)));
        return hashSet;
    }

    public String getLoginSessionKeyInCookie() {
        return "ALIPAYINTLACJSESSIONID";
    }

    public OAuthConfig getOAuthConfig() {
        return ACManager.getInstance().getOAuthConfig();
    }
}
