package com.alipay.iap.android.aplog.core.appender;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.api.LogEncryptClient;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;

public abstract class EncryptAppender extends Appender {
    EncryptAppender(LogContext logContext, String str) {
        super(logContext, str);
    }

    /* access modifiers changed from: protected */
    public boolean onAppend(String str, boolean z) {
        if (!z) {
            return writeFile(str);
        }
        LogEncryptClient logEncryptClient = LoggerFactory.getLogContext().getLogEncryptClient();
        if (logEncryptClient == null) {
            return writeFile(str);
        }
        String[] split = str.split(LoggerFactory.LOG_SPLITER);
        int length = split.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            String encrypt = logEncryptClient.encrypt(split[i]);
            if (!TextUtils.isEmpty(encrypt)) {
                stringBuffer.append(MdapFileLogAppender.ENCRYPT_SIGN);
                stringBuffer.append(encrypt);
                stringBuffer.append(MasLog.Constant.GAP);
            } else {
                stringBuffer.append(split[i]);
                stringBuffer.append(MasLog.Constant.GAP);
            }
        }
        return writeFile(stringBuffer.toString());
    }
}
