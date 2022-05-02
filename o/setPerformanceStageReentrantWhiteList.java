package o;

import android.content.Context;
import com.alipay.iap.android.f2fpay.extension.impl.DefaultPaymentCodeGeneratorImpl;
import com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo;
import com.iap.ac.config.lite.ConfigCenter;

public final class setPerformanceStageReentrantWhiteList extends DefaultPaymentCodeGeneratorImpl {
    public final String generateCode(Context context, F2FPayOtpInfo f2FPayOtpInfo, long j, Object obj) {
        String generateCode = super.generateCode(context, f2FPayOtpInfo, j, obj);
        if (ConfigCenter.getInstance().getIntConfig("payment_code_digit", 24) != 20) {
            return generateCode;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(generateCode.substring(0, 2));
        sb.append(generateCode.substring(6));
        return sb.toString();
    }
}
