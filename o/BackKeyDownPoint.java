package o;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.securesignature.SecureSignatureDefine;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.CreateDialogParam;

@Singleton
public class BackKeyDownPoint {
    private static final String TAG = BackKeyDownPoint.class.getSimpleName();
    private final String appKey = "23936057";
    private final String authCode;
    private final Context context;

    @Inject
    public BackKeyDownPoint(Context context2) {
        this.context = context2;
        if (CreateDialogParam.Agreement.isGooglePlaySignature(context2)) {
            this.authCode = "0ce8";
        } else {
            this.authCode = "0ce8_1";
        }
        init();
    }

    @WorkerThread
    public void init() {
        try {
            SecurityGuardManager.getInitializer().initialize(this.context);
        } catch (SecException e) {
            LocationBridgeExtension.setMin(TAG, "Error SecurityGuardFacade.init()", (Throwable) e);
        }
    }

    public String signRequest(String str) throws SecException {
        return signRequest(this.appKey, this.authCode, 7, str);
    }

    private String signRequest(String str, String str2, int i, String str3) throws SecException {
        HashMap hashMap = new HashMap();
        hashMap.put(SecureSignatureDefine.OPEN_KEY_SIGN_INPUT, str3);
        if (i == 7) {
            hashMap.put(SecureSignatureDefine.OPEN_KEY_SIGN_ATLAS, "c");
        }
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.appKey = str;
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = i;
        return getManager().getSecureSignatureComp().signRequest(securityGuardParamContext, str2);
    }

    private SecurityGuardManager getManager() throws SecException {
        try {
            return SecurityGuardManager.getInstance(this.context);
        } catch (SecException e) {
            LocationBridgeExtension.setMin(TAG, "SecurityGuard error on SecurityGuardFacade.getManager()", (Throwable) e);
            throw e;
        }
    }

    public void putString(String str, String str2) throws SecException {
        getManager().getDynamicDataStoreComp().putStringDDpEx(str, str2, 0);
    }

    public String getString(String str) throws SecException {
        return getManager().getDynamicDataStoreComp().getStringDDpEx(str, 0);
    }

    public void removeString(String str) throws SecException {
        getManager().getDynamicDataStoreComp().removeStringDDpEx(str, 0);
    }

    public String encryptString(String str) throws SecException {
        return getManager().getDynamicDataEncryptComp().dynamicEncryptDDp(str);
    }

    public String decryptString(String str) throws SecException {
        return getManager().getDynamicDataEncryptComp().dynamicDecryptDDp(str);
    }

    public String getAppKey() {
        return this.appKey;
    }
}
