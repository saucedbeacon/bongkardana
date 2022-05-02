package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.WalletServiceManager;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;

public class a {
    public boolean a() {
        return Utils.checkClassExist("com.alipay.iap.android.wallet.acl.WalletServiceManager");
    }

    public void a(String str, String str2) {
        StringBuilder sb = new StringBuilder("AclHandleError, method: ");
        sb.append(str);
        sb.append(", msg: ");
        sb.append(str2);
        ACLog.e(Constants.TAG, sb.toString());
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_acl_call_fail").addParams("resultMessage", str2).addParams(FirebaseAnalytics.Param.METHOD, str).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public <T extends BaseService> T a(Class<? extends T> cls) {
        try {
            return WalletServiceManager.getInstance().getService(cls);
        } catch (WalletServiceManager.ServiceNotFoundException e) {
            ACLog.e(Constants.TAG, "getAclService exception: ".concat(String.valueOf(e)));
            return null;
        }
    }
}
