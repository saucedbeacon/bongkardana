package com.alipay.android.phone.mobilesdk.socketcraft.integrated.ssl;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.DefaultSSLExtensions;
import com.alipay.mobile.common.transport.utils.SSLSocketUtil;
import javax.net.ssl.SSLSocket;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class MPaaSSSLExtensions extends DefaultSSLExtensions {
    public void enableTlsExtensions(SSLSocket sSLSocket, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-727867340, oncanceled);
            onCancelLoad.getMin(-727867340, oncanceled);
        }
        SSLSocketUtil.enableTlsExtensions(sSLSocket, str);
    }
}
