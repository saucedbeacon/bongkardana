package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;

public final class uncheckAllItems {
    public static void transform(initWithSecurityGuard initwithsecurityguard, BaseRpcResult baseRpcResult) {
        if (initwithsecurityguard != null) {
            initwithsecurityguard.setSuccess(baseRpcResult.success);
            initwithsecurityguard.setErrorCode(baseRpcResult.errorCode);
            initwithsecurityguard.setErrorMessage(baseRpcResult.errorMessage);
        }
    }
}
