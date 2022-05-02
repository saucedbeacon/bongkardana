package com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;

public class SSLExtensionsFactory {
    private static final String MPAAS_SSL_EXTENSIONS_IMPL = "com.alipay.android.phone.mobilesdk.socketcraft.integrated.ssl.MPaaSSSLExtensions";
    private static final String TAG = "SSLExtensionsFactory";
    private static SSLExtensions sslExtensions;

    public static final SSLExtensions getInstance() {
        SSLExtensions sSLExtensions = sslExtensions;
        if (sSLExtensions != null) {
            return sSLExtensions;
        }
        synchronized (SSLExtensions.class) {
            if (PlatformUtil.isAndroidMPaaSPlatform()) {
                try {
                    sslExtensions = (SSLExtensions) Class.forName(MPAAS_SSL_EXTENSIONS_IMPL).newInstance();
                    SCLogCatUtil.info(TAG, String.format("New instance ok, class: %s", new Object[]{MPAAS_SSL_EXTENSIONS_IMPL}));
                } catch (Throwable th) {
                    SCLogCatUtil.warn(TAG, String.format("New instance error, class: %s", new Object[]{MPAAS_SSL_EXTENSIONS_IMPL}), th);
                }
            }
            if (sslExtensions == null) {
                sslExtensions = new DefaultSSLExtensions();
            }
        }
        return sslExtensions;
    }
}
