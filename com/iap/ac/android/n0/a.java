package com.iap.ac.android.n0;

import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.m0.c;

public class a extends com.iap.ac.android.m0.a<b, c> {
    public final void a(c cVar, String str, String str2) {
        Result result = new Result();
        result.resultCode = ResultCode.INVALID_NETWORK;
        result.resultMessage = "Oops! System busy. Try again later!";
        cVar.f9748a = result;
        cVar.b = str;
        cVar.c = str2;
        cVar.d = "scan";
    }
}
