package com.iap.ac.android.q0;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.model.PayResult;
import com.iap.ac.android.biz.common.model.PayResultCode;
import com.iap.ac.android.m0.c;
import com.iap.ac.android.mpm.node.base.NodeType;

public class d extends c {
    public PayResult e;

    public boolean a() {
        PayResult payResult = this.e;
        if (payResult == null) {
            return false;
        }
        String resultCode = payResult.getResultCode();
        if (TextUtils.equals(resultCode, PayResultCode.PAY_SUCCESS) || TextUtils.equals(resultCode, PayResultCode.PAY_PENDING)) {
            return true;
        }
        return false;
    }

    public NodeType b() {
        return NodeType.Pay;
    }
}
