package com.iap.ac.android.o0;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.m0.c;
import com.iap.ac.android.mpm.base.interfaces.INodeCallback;
import com.iap.ac.android.mpm.base.model.hook.HookConstants;
import com.iap.ac.android.mpm.base.model.hook.result.CommonHookResult;
import com.iap.ac.android.mpm.base.model.hook.result.DecodeParams;

public class a extends com.iap.ac.android.m0.a<b, c> {
    public com.iap.ac.android.i0.a a() {
        return new com.iap.ac.android.i0.a();
    }

    public final void a(CommonHookResult commonHookResult, boolean z, INodeCallback<c> iNodeCallback) {
        c cVar = new c();
        Result result = new Result();
        if (commonHookResult == null) {
            ACLog.w(Constants.TAG, "HookCommonUrl error, result invalid");
            result.resultCode = ResultCode.UNKNOWN_EXCEPTION;
            result.resultMessage = "Oops! System busy. Try again later!";
            a(cVar, result, ResultCode.UNKNOWN_EXCEPTION, "HookCommonUrl error, result invalid");
            iNodeCallback.onResult(cVar);
        } else if (!commonHookResult.success) {
            ACLog.w(Constants.TAG, "HookCommonUrl fail");
            String str = commonHookResult.errorCode;
            result.resultCode = str;
            String str2 = commonHookResult.errorMessage;
            result.resultMessage = str2;
            a(cVar, result, str, str2);
            iNodeCallback.onResult(cVar);
        } else if (!HookConstants.HookAction.HOOK_ACTION_DECODE.equals(commonHookResult.action)) {
            StringBuilder a2 = com.iap.ac.android.a.a.a("HookCommonUrl error, action unknown: ");
            a2.append(commonHookResult.action);
            String obj = a2.toString();
            ACLog.w(Constants.TAG, obj);
            result.resultCode = ResultCode.PARAM_ILLEGAL;
            result.resultMessage = "Oops! System busy. Try again later!";
            a(cVar, result, ResultCode.PARAM_ILLEGAL, obj);
            iNodeCallback.onResult(cVar);
        } else {
            DecodeParams decodeParams = commonHookResult.decodeParams;
            if (decodeParams == null || TextUtils.isEmpty(decodeParams.codeValue)) {
                DecodeParams decodeParams2 = commonHookResult.decodeParams;
                String str3 = decodeParams2 == null ? null : decodeParams2.codeValue;
                StringBuilder a3 = com.iap.ac.android.a.a.a("HookCommonUrl error, action is DECODE, but decodeParams is: ");
                a3.append(commonHookResult.decodeParams);
                a3.append(", payScheme is:");
                a3.append(str3);
                String obj2 = a3.toString();
                ACLog.w(Constants.TAG, obj2);
                result.resultCode = ResultCode.PARAM_ILLEGAL;
                result.resultMessage = "Oops! System busy. Try again later!";
                a(cVar, result, ResultCode.PARAM_ILLEGAL, obj2);
                iNodeCallback.onResult(cVar);
                return;
            }
            ACLog.i(Constants.TAG, "begin to decode order code");
            cVar.e = true;
            cVar.f = commonHookResult.decodeParams.codeValue;
            cVar.g = z;
            iNodeCallback.onResult(cVar);
        }
    }

    public final void a(c cVar, Result result, String str, String str2) {
        cVar.f9748a = result;
        if (str == null) {
            str = ResultCode.INVALID_NETWORK;
        }
        cVar.b = str;
        if (str2 == null) {
            str2 = "Oops! System busy. Try again later!";
        }
        cVar.c = str2;
        cVar.d = "hook";
    }
}
