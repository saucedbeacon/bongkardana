package com.iap.ac.android.gol.rpc;

import com.iap.ac.android.a.a;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.gol.rpc.facade.AuthFacade;
import com.iap.ac.android.gol.rpc.request.AuthPrepareCallbackRequest;
import com.iap.ac.android.gol.rpc.request.AuthPrepareRequest;
import com.iap.ac.android.gol.rpc.result.AuthPrepareCallbackResult;
import com.iap.ac.android.gol.rpc.result.AuthPrepareResult;

public class AuthProcessor extends BaseNetwork<AuthFacade> {
    public static final String TAG = "AuthProcessor";

    public Class<AuthFacade> getFacadeClass() {
        return AuthFacade.class;
    }

    public AuthPrepareResult prepare(AuthPrepareRequest authPrepareRequest) {
        try {
            return ((AuthFacade) getFacade()).prepare(authPrepareRequest);
        } catch (Throwable th) {
            StringBuilder a2 = a.a("prepare method invoke error:");
            a2.append(th.getMessage());
            ACLog.e(TAG, a2.toString());
            return null;
        }
    }

    public AuthPrepareCallbackResult prepareCallback(AuthPrepareCallbackRequest authPrepareCallbackRequest) {
        try {
            return ((AuthFacade) getFacade()).prepareCallback(authPrepareCallbackRequest);
        } catch (Throwable th) {
            StringBuilder a2 = a.a("prepareCallback method invoke error:");
            a2.append(th.getMessage());
            ACLog.e(TAG, a2.toString());
            return null;
        }
    }
}
