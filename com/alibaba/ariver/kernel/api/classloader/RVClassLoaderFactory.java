package com.alibaba.ariver.kernel.api.classloader;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.kernel.api.classloader.DefaultClassLoaderFactory")
public interface RVClassLoaderFactory extends Proxiable {
    ClassLoader getClassLoader(String str);
}
