package com.iap.ac.android.biz;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.translation.TranslateManager;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.callback.InitCallback;
import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.model.AcBaseResult;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.biz.common.model.QuoteCurrency;
import com.iap.ac.android.biz.common.model.gol.SignContractRequest;
import com.iap.ac.android.biz.internal.ACFactory;
import com.iap.ac.android.biz.internal.IIAPConnect;
import com.iap.ac.android.mpm.DecodeParameter;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import java.util.List;

public class IAPConnect {
    public static volatile IIAPConnect sIAPConnectImpl;

    public static void clear() {
        if (sIAPConnectImpl != null) {
            sIAPConnectImpl.clear();
        }
    }

    @Deprecated
    public static void decode(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull IDecodeCallback iDecodeCallback) {
        if (sIAPConnectImpl != null) {
            sIAPConnectImpl.decode(context, str, str2, iDecodeCallback);
        }
    }

    public static List<String> getJSApiPermissionConfig(@NonNull String str) {
        if (sIAPConnectImpl != null) {
            return sIAPConnectImpl.getJSApiPermissionConfig(str);
        }
        return null;
    }

    public static void getPaymentCode(@NonNull String str, @NonNull IPaymentCodeListener iPaymentCodeListener) {
        if (sIAPConnectImpl != null) {
            sIAPConnectImpl.getPaymentCode(str, iPaymentCodeListener);
        }
    }

    public static TranslateManager getTranslateManager(Context context) {
        if (sIAPConnectImpl != null) {
            return sIAPConnectImpl.getTranslateManager(context);
        }
        return null;
    }

    public static void init(@NonNull Application application, @NonNull InitConfig initConfig, @Nullable InitCallback initCallback) {
        if (sIAPConnectImpl == null) {
            synchronized (IAPConnect.class) {
                if (sIAPConnectImpl == null) {
                    sIAPConnectImpl = ACFactory.createIAPConnectImpl();
                }
            }
        }
        sIAPConnectImpl.init(application, initConfig, initCallback);
    }

    @Deprecated
    public static void initWithContext(@NonNull Context context, @NonNull InitConfig initConfig) {
        synchronized (IAPConnect.class) {
            if (sIAPConnectImpl == null) {
                sIAPConnectImpl = ACFactory.createIAPConnectImpl();
            }
            sIAPConnectImpl.initWithContext(context, initConfig);
        }
    }

    public static void inquireQuote(@NonNull QuoteCurrency quoteCurrency, @NonNull InquireQuoteCallback inquireQuoteCallback) {
        if (sIAPConnectImpl != null) {
            sIAPConnectImpl.inquireQuote(quoteCurrency, inquireQuoteCallback);
        }
    }

    public static void notifyAgreePaymentAuthCode(@NonNull AuthResult authResult) {
        if (sIAPConnectImpl != null) {
            sIAPConnectImpl.notifyAgreePaymentAuthCode(authResult);
        }
    }

    public static boolean openACCenter() {
        synchronized (IAPConnect.class) {
            if (sIAPConnectImpl == null) {
                return false;
            }
            boolean openACCenter = sIAPConnectImpl.openACCenter();
            return openACCenter;
        }
    }

    public static boolean shouldInterceptRequest(@NonNull String str) {
        return str != null && str.startsWith("https://render.alipay.com/p/w/ac-fe-adaptor");
    }

    public static void signContract(@NonNull SignContractRequest signContractRequest, @NonNull AcCallback<AcBaseResult> acCallback) {
        if (sIAPConnectImpl != null) {
            sIAPConnectImpl.signContract(signContractRequest, acCallback);
        }
    }

    public static void decode(@NonNull Context context, @NonNull DecodeParameter decodeParameter, @NonNull IDecodeCallback iDecodeCallback) {
        if (sIAPConnectImpl != null) {
            sIAPConnectImpl.decode(context, decodeParameter, iDecodeCallback);
        }
    }
}
