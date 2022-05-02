package com.alibaba.griver.core.bridge;

import com.alibaba.ariver.kernel.api.classloader.RVClassLoaderFactory;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

class ClassLoaderUtils {
    ClassLoaderUtils() {
    }

    static Class<? extends Extension> loadClass(String str, String str2) {
        try {
            return ((RVClassLoaderFactory) RVProxy.get(RVClassLoaderFactory.class)).getClassLoader(str).loadClass(str2);
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:ClassLoaderUtils", "failed to load class", th);
            return null;
        }
    }
}
