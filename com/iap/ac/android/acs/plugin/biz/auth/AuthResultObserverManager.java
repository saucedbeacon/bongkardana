package com.iap.ac.android.acs.plugin.biz.auth;

import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AuthResultObserverManager {
    private static final String TAG = "IAPConnectPlugin";
    public static final int TYPE_PAY_SIGN_CENTER = 2;
    public static final int TYPE_SIGN_CONTRACT = 1;
    private static List<AuthResultObserver> paySignCenterObservers = new CopyOnWriteArrayList();
    private static List<AuthResultObserver> signContractObservers = new CopyOnWriteArrayList();

    public static void notifyAuthResult(@Nullable AuthResult authResult) {
        if (!signContractObservers.isEmpty()) {
            StringBuilder sb = new StringBuilder("AuthCodeObserverManager#notifyAuthResult, signContract observers size: ");
            sb.append(signContractObservers.size());
            ACLog.d("IAPConnectPlugin", sb.toString());
            for (AuthResultObserver onGetAuthResult : signContractObservers) {
                onGetAuthResult.onGetAuthResult(authResult);
            }
        }
        if (!paySignCenterObservers.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("AuthCodeObserverManager#notifyAuthResult, paySignCenter observers size: ");
            sb2.append(paySignCenterObservers.size());
            ACLog.d("IAPConnectPlugin", sb2.toString());
            for (AuthResultObserver onGetAuthResult2 : paySignCenterObservers) {
                onGetAuthResult2.onGetAuthResult(authResult);
            }
        }
    }

    public static void registerObserver(int i, AuthResultObserver authResultObserver) {
        if (authResultObserver == null) {
            return;
        }
        if (i == 1) {
            ACLog.d("IAPConnectPlugin", "AuthCodeObserverManager#registerObserver for signContract: ".concat(String.valueOf(authResultObserver)));
            signContractObservers.add(authResultObserver);
        } else if (i == 2) {
            ACLog.d("IAPConnectPlugin", "AuthCodeObserverManager#registerObserver for paySignCenter: ".concat(String.valueOf(authResultObserver)));
            paySignCenterObservers.add(authResultObserver);
        }
    }

    public static void unregisterObserver(int i, AuthResultObserver authResultObserver) {
        if (authResultObserver == null) {
            return;
        }
        if (i == 1) {
            ACLog.d("IAPConnectPlugin", "AuthCodeObserverManager#unregisterObserver for signContract: ".concat(String.valueOf(authResultObserver)));
            signContractObservers.remove(authResultObserver);
        } else if (i == 2) {
            ACLog.d("IAPConnectPlugin", "AuthCodeObserverManager#unregisterObserver for paySignCenter: ".concat(String.valueOf(authResultObserver)));
            paySignCenterObservers.remove(authResultObserver);
        }
    }
}
