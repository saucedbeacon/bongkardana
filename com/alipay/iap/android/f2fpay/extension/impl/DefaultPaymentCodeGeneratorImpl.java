package com.alipay.iap.android.f2fpay.extension.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.extension.IF2FPayPaymentCodeGenerator;
import com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo;
import com.alipay.iap.android.f2fpay.util.CGCPUtils;
import com.alipay.secotp.SecOtpException;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import id.dana.ocr.constant.ErrorUploadReceipt;

public class DefaultPaymentCodeGeneratorImpl implements IF2FPayPaymentCodeGenerator {

    /* renamed from: a  reason: collision with root package name */
    private Parameters f9322a;

    public static class Parameters {
        public String businessType = TransferUserInfoResult.KycLevel.KYC_2;
        public String institutionCode = ErrorUploadReceipt.DATA_NOT_FOUND;
        public int version = 1;

        public Parameters() {
        }

        public Parameters(String str) {
            this.institutionCode = str;
        }

        public Parameters(String str, String str2) {
            this.institutionCode = str;
            this.businessType = str2;
        }
    }

    public DefaultPaymentCodeGeneratorImpl() {
        this(new Parameters());
    }

    public DefaultPaymentCodeGeneratorImpl(Parameters parameters) {
        this.f9322a = parameters;
    }

    public void clear() {
        SecOtpGeneratorManager.getInstance().getGenerator().checkConfigure("f2fpay");
    }

    @SuppressLint({"DefaultLocale"})
    public String generateCode(Context context, F2FPayOtpInfo f2FPayOtpInfo, long j, Object obj) {
        SecOtpGeneratorManager.getInstance().initialize(context);
        if (f2FPayOtpInfo == null) {
            return null;
        }
        String obj2 = obj != null ? obj.toString() : "";
        try {
            String generatePayCode = SecOtpGeneratorManager.getInstance().getGenerator().generatePayCode("f2fpay", obj2, j);
            LoggerWrapper.i(F2FPayConstants.TAG, String.format("generateCode: otpInfo = %s, timestamp = %d, payCode = %s, extra=%s", new Object[]{f2FPayOtpInfo.toString(), Long.valueOf(j), generatePayCode, obj2}));
            if (TextUtils.isEmpty(generatePayCode) || !TextUtils.isDigitsOnly(generatePayCode)) {
                return null;
            }
            String generateCGCP = CGCPUtils.generateCGCP(this.f9322a.version, this.f9322a.institutionCode, this.f9322a.businessType, generatePayCode);
            LoggerWrapper.i(F2FPayConstants.TAG, "CGCP code:".concat(String.valueOf(generateCGCP)));
            return generateCGCP;
        } catch (SecOtpException unused) {
            LoggerWrapper.e(F2FPayConstants.TAG, "secure otp generator generates failed");
            return null;
        }
    }
}
