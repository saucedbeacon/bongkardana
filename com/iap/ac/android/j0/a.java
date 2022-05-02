package com.iap.ac.android.j0;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.mpm.base.model.hook.HookConstants;
import com.iap.ac.android.mpm.base.model.hook.PreCreateOrderConfig;
import com.iap.ac.android.mpm.base.model.hook.request.CommonHookRequest;
import com.iap.ac.android.mpm.base.model.hook.request.TradePayParams;
import com.iap.ac.android.mpm.base.model.hook.result.CommonHookResult;
import com.iap.ac.android.mpm.hook.source.CommonHookFacade;
import com.iap.ac.android.rpccommon.model.facade.MobileEnvInfo;

public class a extends BaseNetwork<CommonHookFacade> {
    public final CommonHookResult a(CommonHookRequest commonHookRequest) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LogResult logResult = new LogResult();
        CommonHookResult commonHookResult = null;
        try {
            commonHookResult = ((CommonHookFacade) getFacade()).commonHook(commonHookRequest);
            if (commonHookResult != null) {
                logResult.resultCode = commonHookResult.success ? "SUCCESS" : commonHookResult.errorCode;
                logResult.resultMessage = commonHookResult.errorMessage;
                logResult.traceId = commonHookResult.traceId;
            } else {
                logResult.resultMessage = "hook result is null";
                logResult.resultCode = ResultCode.UNKNOWN_EXCEPTION;
                logResult.traceId = "";
            }
            if (commonHookResult == null || !commonHookResult.success) {
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_payment_hook_error").addParams("resultMessage", logResult.resultMessage).addParams("resultCode", logResult.resultCode).addParams("traceId", logResult.traceId).setEventType(LogEventType.CRUCIAL_LOG).event();
            }
        } catch (Exception e) {
            ACLog.e(Constants.TAG, "commonHook error:".concat(String.valueOf(e)));
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_payment_hook_error", Utils.e(e));
        } catch (Throwable th) {
            ACLogEvent.commonEvent("ac_mpm_payment_hook", elapsedRealtime, logResult);
            throw th;
        }
        ACLogEvent.commonEvent("ac_mpm_payment_hook", elapsedRealtime, logResult);
        return commonHookResult;
    }

    public Class<CommonHookFacade> getFacadeClass() {
        return CommonHookFacade.class;
    }

    public CommonHookResult a(String str) {
        CommonHookRequest commonHookRequest = new CommonHookRequest();
        commonHookRequest.hookCategory = "URL";
        commonHookRequest.hookUrl = str;
        return a(commonHookRequest);
    }

    public CommonHookResult a(@NonNull PreCreateOrderConfig preCreateOrderConfig) {
        CommonHookRequest commonHookRequest = new CommonHookRequest();
        if (preCreateOrderConfig.isOrderStrFromMiniProgram) {
            commonHookRequest.envInfo = new MobileEnvInfo();
            commonHookRequest.envInfo.orderTerminalType = "MINI_APP";
        }
        commonHookRequest.hookCategory = HookConstants.HookCategory.HOOK_CATEGORY_TRADEPAY;
        commonHookRequest.acquirerId = preCreateOrderConfig.acquirerId;
        commonHookRequest.tradePayParams = new TradePayParams();
        TradePayParams tradePayParams = commonHookRequest.tradePayParams;
        tradePayParams.orderStr = preCreateOrderConfig.orderStr;
        tradePayParams.tradeNo = preCreateOrderConfig.tradeNo;
        return a(commonHookRequest);
    }
}
