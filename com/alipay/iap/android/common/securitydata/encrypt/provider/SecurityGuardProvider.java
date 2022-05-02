package com.alipay.iap.android.common.securitydata.encrypt.provider;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alipay.iap.android.common.log.LoggerWrapper;

public class SecurityGuardProvider implements IDataEncryptProvider {
    private static final String TAG = "SecurityGuardProvider";
    private static volatile SecurityGuardProvider instance;
    private IDynamicDataEncryptComponent dynamicDataEncryptComponent;

    public static SecurityGuardProvider getInstance(Context context) {
        if (instance == null) {
            synchronized (SecurityGuardManager.class) {
                if (instance == null) {
                    instance = new SecurityGuardProvider(context);
                }
            }
        }
        return instance;
    }

    private SecurityGuardProvider(Context context) {
        try {
            this.dynamicDataEncryptComponent = SecurityGuardManager.getInstance(context).getDynamicDataEncryptComp();
        } catch (SecException unused) {
            LoggerWrapper.e(TAG, "SecurityGuard is not ready");
        }
    }

    public synchronized String encrypt(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            LoggerWrapper.w(TAG, "encrypt data is empty, return empty data");
            return "";
        } else if (this.dynamicDataEncryptComponent == null) {
            LoggerWrapper.w(TAG, "SecurityGuard not ready, return original data");
            return str;
        } else {
            try {
                return this.dynamicDataEncryptComponent.dynamicEncryptDDp(str);
            } catch (SecException e) {
                LoggerWrapper.e(TAG, LoggerWrapper.buildMessage("encrypt data failed: %s, return original data", e));
                return str;
            }
        }
    }

    public synchronized String decrypt(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            LoggerWrapper.w(TAG, "decrypt data is empty, return empty data");
            return "";
        } else if (this.dynamicDataEncryptComponent == null) {
            LoggerWrapper.w(TAG, "SecurityGuard not ready, return original data");
            return str;
        } else {
            try {
                return this.dynamicDataEncryptComponent.dynamicDecryptDDp(str);
            } catch (SecException e) {
                LoggerWrapper.e(TAG, LoggerWrapper.buildMessage("decrypt data failed: %s, return original data", e));
                return str;
            }
        }
    }

    public static void unInit() {
        instance = null;
    }
}
