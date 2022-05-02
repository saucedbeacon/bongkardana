package com.iap.ac.android.biz.internal;

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
import com.iap.ac.android.mpm.DecodeParameter;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import java.util.List;

public interface IIAPConnect {
    void clear();

    void decode(@NonNull Context context, @NonNull DecodeParameter decodeParameter, @NonNull IDecodeCallback iDecodeCallback);

    void decode(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull IDecodeCallback iDecodeCallback);

    List<String> getJSApiPermissionConfig(@NonNull String str);

    void getPaymentCode(@NonNull String str, @NonNull IPaymentCodeListener iPaymentCodeListener);

    TranslateManager getTranslateManager(Context context);

    void init(@NonNull Application application, @NonNull InitConfig initConfig, @Nullable InitCallback initCallback);

    void initWithContext(@NonNull Context context, @NonNull InitConfig initConfig);

    void inquireQuote(@NonNull QuoteCurrency quoteCurrency, @NonNull InquireQuoteCallback inquireQuoteCallback);

    void notifyAgreePaymentAuthCode(@NonNull AuthResult authResult);

    boolean openACCenter();

    void signContract(@NonNull SignContractRequest signContractRequest, @NonNull AcCallback<AcBaseResult> acCallback);
}
