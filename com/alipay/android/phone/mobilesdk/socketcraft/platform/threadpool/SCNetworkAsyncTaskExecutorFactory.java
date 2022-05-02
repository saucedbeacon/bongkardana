package com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;

public class SCNetworkAsyncTaskExecutorFactory {
    private static final String MPAAS_THREAD_POOL_IMPL = "com.alipay.android.phone.mobilesdk.socketcraft.integrated.threadpool.MPaaSNetworkAsyncTaskExecutor";
    private static SCNetworkAsyncTaskExecutor scNetworkAsyncTaskExecutor;

    public static final SCNetworkAsyncTaskExecutor getInstance() {
        SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor = scNetworkAsyncTaskExecutor;
        if (sCNetworkAsyncTaskExecutor != null) {
            return sCNetworkAsyncTaskExecutor;
        }
        synchronized (SCNetworkAsyncTaskExecutorFactory.class) {
            if (scNetworkAsyncTaskExecutor != null) {
                SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor2 = scNetworkAsyncTaskExecutor;
                return sCNetworkAsyncTaskExecutor2;
            }
            if (PlatformUtil.isAndroidMPaaSPlatform()) {
                try {
                    SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor3 = (SCNetworkAsyncTaskExecutor) Class.forName(MPAAS_THREAD_POOL_IMPL).newInstance();
                    scNetworkAsyncTaskExecutor = sCNetworkAsyncTaskExecutor3;
                    return sCNetworkAsyncTaskExecutor3;
                } catch (Throwable th) {
                    SCLogCatUtil.error("SCNetworkAsyncTaskExecutorFactory", String.format("Instance class: %s error", new Object[]{MPAAS_THREAD_POOL_IMPL}), th);
                }
            }
            if (scNetworkAsyncTaskExecutor == null) {
                scNetworkAsyncTaskExecutor = new DefaultSCNetworkAsyncTaskExecutor();
            }
            SCNetworkAsyncTaskExecutor sCNetworkAsyncTaskExecutor4 = scNetworkAsyncTaskExecutor;
            return sCNetworkAsyncTaskExecutor4;
        }
    }
}
