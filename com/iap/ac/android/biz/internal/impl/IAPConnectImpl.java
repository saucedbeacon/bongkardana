package com.iap.ac.android.biz.internal.impl;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.ac.pa.foundation.PSAadpterAC;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.acs.plugin.core.IAPConnectPluginManager;
import com.iap.ac.android.acs.translation.TranslateManager;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.IConfigCallback;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.callback.InitCallback;
import com.iap.ac.android.biz.common.callback.InquireQuoteCallback;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.AcBaseResult;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.biz.common.model.QuoteCurrency;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.gol.SignContractRequest;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.CPMConfig;
import com.iap.ac.android.biz.common.risk.RiskControlManager;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.biz.core.ACCoreManager;
import com.iap.ac.android.biz.internal.IIAPConnect;
import com.iap.ac.android.common.container.WebContainer;
import com.iap.ac.android.common.container.model.ContainerParams;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.cpm.online.manager.OnlinePaymentCodeManager;
import com.iap.ac.android.gol.SignContractManager;
import com.iap.ac.android.mpm.DecodeChecker;
import com.iap.ac.android.mpm.DecodeParameter;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import java.util.List;

public class IAPConnectImpl implements IIAPConnect {
    public static OnlinePaymentCodeManager mOnlinePaymentCodeManager = new OnlinePaymentCodeManager();

    private void handleForOpenACCenterError(String str) {
        ACLog.e(Constants.TAG, str);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_open_ac_center_fail", str);
    }

    public void clear() {
        ACManager.getInstance().clear();
        if (Utils.checkClassExist(Constants.PACKAGE_NAME_AC_CORE_MANAGER)) {
            ACCoreManager.getInstance().clear();
        }
        if (Utils.checkClassExist(Constants.PACKAGE_NAME_PA_CORE_MANAGER)) {
            PSAadpterAC.getInstance().logout();
        }
    }

    public synchronized void decode(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull IDecodeCallback iDecodeCallback) {
        DecodeParameter decodeParameter = new DecodeParameter();
        decodeParameter.codeValue = str;
        decodeParameter.acDecodeConfigFromServer = str2;
        decode(context, decodeParameter, iDecodeCallback);
    }

    public List<String> getJSApiPermissionConfig(@NonNull String str) {
        return ConfigCenter.INSTANCE.getDomains(str);
    }

    public void getPaymentCode(@NonNull String str, @NonNull IPaymentCodeListener iPaymentCodeListener) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ConfigCenter.INSTANCE.refreshConfigs();
        ACManager.getInstance().fetchConfigAsync((IConfigCallback) null);
        String codeType = ACManager.getInstance().getCodeType(str);
        CPMConfig cpmConfig = ACManager.getInstance().getCpmConfig(codeType);
        if (cpmConfig != null) {
            if (cpmConfig.onlineCode) {
                mOnlinePaymentCodeManager.getPaymentCode(codeType, cpmConfig, iPaymentCodeListener);
            } else {
                if (iPaymentCodeListener != null) {
                    iPaymentCodeListener.onPaymentCodeUpdateFailed(ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!");
                }
                ACLogEvent.commonFailEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_cpm_paymentcode_enter", ResultCode.PARAM_ILLEGAL, "Offline code not supported", SystemClock.elapsedRealtime() - elapsedRealtime);
            }
            ACLogEvent.commonSuccessEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_cpm_paymentcode_enter", SystemClock.elapsedRealtime() - elapsedRealtime);
            return;
        }
        if (iPaymentCodeListener != null) {
            iPaymentCodeListener.onPaymentCodeUpdateFailed(ResultCode.PARAM_ILLEGAL, "Oops! System busy. Try again later!");
        }
        StringBuilder sb = new StringBuilder("Cannot get CPM configurations, region: ");
        sb.append(str);
        sb.append(", codeType: ");
        sb.append(codeType);
        sb.append(", config: ");
        sb.append(cpmConfig);
        String obj = sb.toString();
        ACLogEvent.commonFailEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_cpm_paymentcode_enter", ResultCode.PARAM_ILLEGAL, obj, SystemClock.elapsedRealtime() - elapsedRealtime);
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_cpm_paymentcode_fail", obj);
    }

    public TranslateManager getTranslateManager(Context context) {
        return TranslateManager.getInstance(context);
    }

    public void init(@NonNull Application application, @NonNull InitConfig initConfig, @Nullable InitCallback initCallback) {
        ACInitManager.init(application, initConfig, initCallback);
    }

    public void initWithContext(@NonNull Context context, @NonNull InitConfig initConfig) {
        ACInitManager.initWithContext(context, initConfig);
    }

    public void inquireQuote(@NonNull QuoteCurrency quoteCurrency, @NonNull InquireQuoteCallback inquireQuoteCallback) {
        ACManager.getInstance().inquireQuote(quoteCurrency, inquireQuoteCallback);
    }

    public void notifyAgreePaymentAuthCode(@NonNull AuthResult authResult) {
        IAPConnectPluginManager.getInstance().notifyAuthResult(authResult);
    }

    public boolean openACCenter() {
        if (ACManager.getInstance().getContext() == null) {
            handleForOpenACCenterError("openACCenter error, null context");
            return false;
        }
        ACManager.getInstance().fetchConfigAsync((IConfigCallback) null);
        ConfigCenter.INSTANCE.refreshConfigs();
        CommonConfig commonConfig = ACManager.getInstance().getCommonConfig();
        if (commonConfig == null || TextUtils.isEmpty(commonConfig.acsAppId)) {
            handleForOpenACCenterError("openACCenter error, fetch acsAppId error");
            return false;
        }
        RiskControlManager.getInstance().reportApdidToken();
        StringBuilder sb = new StringBuilder("begin to open ACS with appId: ");
        sb.append(commonConfig.acsAppId);
        ACLog.i(Constants.TAG, sb.toString());
        WebContainer.getInstance("ac_biz").startContainer(ACManager.getInstance().getContext(), ContainerParams.createForMniProgram(commonConfig.acsAppId));
        return true;
    }

    public void signContract(@NonNull SignContractRequest signContractRequest, @NonNull AcCallback<AcBaseResult> acCallback) {
        SignContractManager.getInstance().signContract(false, signContractRequest, acCallback);
    }

    public synchronized void decode(@NonNull Context context, @NonNull DecodeParameter decodeParameter, @NonNull IDecodeCallback iDecodeCallback) {
        DecodeChecker.decode(context, decodeParameter, iDecodeCallback);
    }
}
