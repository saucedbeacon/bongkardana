package com.alibaba.ariver.permission.openauth.model.result;

import androidx.annotation.Keep;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Keep
public final class AuthSkipResultModel {
    private AuthContentResultModel authContentResult;
    private AuthExecuteResultModel authExecuteResult;
    private Boolean canSkipAuth;
    private byte[] data;
    private String errorCode;
    private String errorMsg;
    private H5AuthParamsModel h5AuthParams;
    private Boolean isSuccess;
    private String showType;

    public final Boolean getSuccess() {
        return this.isSuccess;
    }

    public final void setSuccess(Boolean bool) {
        this.isSuccess = bool;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final Boolean getCanSkipAuth() {
        return this.canSkipAuth;
    }

    public final void setCanSkipAuth(Boolean bool) {
        this.canSkipAuth = bool;
    }

    public final AuthExecuteResultModel getAuthExecuteResult() {
        return this.authExecuteResult;
    }

    public final void setAuthExecuteResult(AuthExecuteResultModel authExecuteResultModel) {
        this.authExecuteResult = authExecuteResultModel;
    }

    public final AuthContentResultModel getAuthContentResult() {
        return this.authContentResult;
    }

    public final void setAuthContentResult(AuthContentResultModel authContentResultModel) {
        this.authContentResult = authContentResultModel;
    }

    public final String getShowType() {
        return this.showType;
    }

    public final void setShowType(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(402214834, oncanceled);
            onCancelLoad.getMin(402214834, oncanceled);
        }
        this.showType = str;
    }

    public final H5AuthParamsModel getH5AuthParams() {
        return this.h5AuthParams;
    }

    public final void setH5AuthParams(H5AuthParamsModel h5AuthParamsModel) {
        this.h5AuthParams = h5AuthParamsModel;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final void setData(byte[] bArr) {
        this.data = bArr;
    }
}
