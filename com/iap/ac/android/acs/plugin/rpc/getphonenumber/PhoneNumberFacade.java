package com.iap.ac.android.acs.plugin.rpc.getphonenumber;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.request.UserPhoneRequest;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.request.UserPhoneValidateCodeVerifyRequest;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.result.UserPhoneQueryResult;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.result.UserPhoneValidateCodeSendResult;
import com.iap.ac.android.biz.common.rpc.annotation.ACRpcRequest;
import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;

public interface PhoneNumberFacade {
    public static final String OPERATION_TYPE_DELETE = "ac.mobilepayment.user.phone.delete";
    public static final String OPERATION_TYPE_QUERY = "ac.mobilepayment.user.phone.query";
    public static final String OPERATION_TYPE_REFRESH_USAGE = "ac.mobilepayment.user.phone.usage.refresh";
    public static final String OPERATION_TYPE_SEND_VALIDATE_CODE = "ac.mobilepayment.user.phone.validatecode.send";
    public static final String OPERATION_TYPE_VERIFY_VALIDATE_CODE = "ac.mobilepayment.user.phone.validatecode.verify";

    @OperationType("ac.mobilepayment.user.phone.delete")
    @ACRpcRequest
    @SignCheck
    BaseRpcResult delete(UserPhoneRequest userPhoneRequest);

    @OperationType("ac.mobilepayment.user.phone.query")
    @ACRpcRequest
    @SignCheck
    UserPhoneQueryResult query(BaseRpcRequest baseRpcRequest);

    @OperationType("ac.mobilepayment.user.phone.usage.refresh")
    @ACRpcRequest
    @SignCheck
    BaseRpcResult refreshUsage(UserPhoneRequest userPhoneRequest);

    @OperationType("ac.mobilepayment.user.phone.validatecode.send")
    @ACRpcRequest
    @SignCheck
    UserPhoneValidateCodeSendResult sendUserPhoneValidateCode(UserPhoneRequest userPhoneRequest);

    @OperationType("ac.mobilepayment.user.phone.validatecode.verify")
    @ACRpcRequest
    @SignCheck
    BaseRpcResult verifyUserPhoneValidateCode(UserPhoneValidateCodeVerifyRequest userPhoneValidateCodeVerifyRequest);
}
