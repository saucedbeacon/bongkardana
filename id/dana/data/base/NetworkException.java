package id.dana.data.base;

import android.text.TextUtils;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.constants.ErrorCode;
import java.util.Map;
import o.IpcCallClientHelper;
import o.com_alibaba_ariver_app_api_ExtOpt$69$1;
import o.removeAnimatorListener;
import o.setIgnoreDisabledSystemAnimations;
import o.textChanged;

public class NetworkException extends Exception {
    private Map<String, String> errorActions;
    private String errorCode;
    private String errorMessage;
    private Map<String, String> extendInfo;
    private String interaction;
    private Integer leftTimes;
    private String traceId;

    public NetworkException(removeAnimatorListener removeanimatorlistener) {
        this((BaseRpcResult) removeanimatorlistener);
        if (TextUtils.isEmpty(this.errorMessage)) {
            this.errorMessage = removeanimatorlistener.getErrorMsg();
        }
    }

    public NetworkException(BaseRpcResult baseRpcResult) {
        this.errorCode = baseRpcResult.errorCode;
        this.errorMessage = baseRpcResult.errorMessage;
        this.interaction = baseRpcResult.interaction;
        this.traceId = baseRpcResult.traceId;
        this.extendInfo = baseRpcResult.extendInfo;
        this.errorActions = baseRpcResult.errorActions;
        if (baseRpcResult instanceof com_alibaba_ariver_app_api_ExtOpt$69$1) {
            handleLoginResultError((com_alibaba_ariver_app_api_ExtOpt$69$1) baseRpcResult);
        } else if (baseRpcResult instanceof textChanged) {
            handleFaceAuthWrongPin((textChanged) baseRpcResult);
        } else if (baseRpcResult instanceof setIgnoreDisabledSystemAnimations) {
            handleAutoRouteWrongPin((setIgnoreDisabledSystemAnimations) baseRpcResult);
        } else if (baseRpcResult instanceof IpcCallClientHelper) {
            handlePaymentSecurityWrongPin((IpcCallClientHelper) baseRpcResult);
        }
    }

    private void handleLoginResultError(com_alibaba_ariver_app_api_ExtOpt$69$1 com_alibaba_ariver_app_api_extopt_69_1) {
        if (this.errorCode.equals(ErrorCode.ERROR_CODE_WRONG_PIN) || this.errorCode.equals("AE15002058020033")) {
            this.leftTimes = Integer.valueOf(com_alibaba_ariver_app_api_extopt_69_1.leftTimes);
        }
    }

    private void handleFaceAuthWrongPin(textChanged textchanged) {
        int i;
        if (ErrorCode.ERROR_CODE_WRONG_PIN.equals(this.errorCode)) {
            int i2 = 0;
            if (textchanged.getIdentFailedCount() == null) {
                i = 0;
            } else {
                i = textchanged.getIdentFailedCount().intValue();
            }
            if (textchanged.getMaxFailedLimit() != null) {
                i2 = textchanged.getMaxFailedLimit().intValue();
            }
            this.leftTimes = Integer.valueOf(i2 - i);
        }
    }

    private void handleAutoRouteWrongPin(setIgnoreDisabledSystemAnimations setignoredisabledsystemanimations) {
        int i;
        if (ErrorCode.ERROR_CODE_WRONG_PIN.equals(this.errorCode) && setignoredisabledsystemanimations.getAttributes() != null) {
            int i2 = 0;
            if (setignoredisabledsystemanimations.getAttributes().getIdentFailedCount() == null) {
                i = 0;
            } else {
                i = setignoredisabledsystemanimations.getAttributes().getIdentFailedCount().intValue();
            }
            if (setignoredisabledsystemanimations.getAttributes().getMaxFailedLimit() != null) {
                i2 = setignoredisabledsystemanimations.getAttributes().getMaxFailedLimit().intValue();
            }
            this.leftTimes = Integer.valueOf(i2 - i);
        }
    }

    private void handlePaymentSecurityWrongPin(IpcCallClientHelper ipcCallClientHelper) {
        if (ErrorCode.ERROR_CODE_WRONG_PIN.equals(this.errorCode)) {
            this.leftTimes = Integer.valueOf(ipcCallClientHelper.maxFailedLimit - ipcCallClientHelper.identFailedCount);
        }
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getInteraction() {
        return this.interaction;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public Map<String, String> getErrorActions() {
        return this.errorActions;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public String getMessage() {
        return this.errorMessage;
    }

    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public synchronized Throwable getCause() {
        return new Throwable(this.errorMessage);
    }

    public Integer getLeftTimes() {
        Integer num = this.leftTimes;
        if (num == null) {
            return 0;
        }
        return num;
    }

    public void setLeftTimes(Integer num) {
        this.leftTimes = num;
    }
}
