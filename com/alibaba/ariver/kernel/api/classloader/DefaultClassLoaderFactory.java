package com.alibaba.ariver.kernel.api.classloader;

import androidx.annotation.Keep;

@Keep
public class DefaultClassLoaderFactory implements RVClassLoaderFactory {
    public ClassLoader getClassLoader(String str) {
        return DefaultClassLoaderFactory.class.getClassLoader();
    }
}
