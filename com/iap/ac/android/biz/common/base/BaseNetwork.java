package com.iap.ac.android.biz.common.base;

import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;

public abstract class BaseNetwork<T> {

    public interface a<F, S> {
        S a(F f);
    }

    public String getBizCode() {
        return "ac_biz";
    }

    public T getFacade() {
        return getFacade(getFacadeClass());
    }

    public abstract Class<T> getFacadeClass();

    public void reportRpcResult(String str, boolean z, String str2, String str3, long j, String str4) {
        if (z) {
            ACLogEvent.commonRpcSuccessEvent(MultiLanguageLogger.BIZCODE_CENTER, str, j, str4);
        } else {
            ACLogEvent.commonRpcFailEvent(MultiLanguageLogger.BIZCODE_CENTER, str, str2, str3, j, str4);
        }
    }

    public <S extends BaseRpcResult> S wrapper(a<T, S> aVar) throws Exception {
        return (BaseRpcResult) aVar.a(getFacade());
    }

    private <T> T getFacade(Class<T> cls) {
        return RPCProxyHost.getInterfaceProxy(cls, getBizCode());
    }
}
