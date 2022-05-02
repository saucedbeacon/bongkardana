package com.alibaba.ariver.ipc.uniform;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class CustomCLObjectInputStream extends ObjectInputStream {

    /* renamed from: a  reason: collision with root package name */
    private ClassLoader f9001a;

    protected CustomCLObjectInputStream() {
    }

    public CustomCLObjectInputStream(InputStream inputStream, ClassLoader classLoader) {
        super(inputStream);
        this.f9001a = classLoader;
    }

    /* access modifiers changed from: protected */
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        try {
            return super.resolveClass(objectStreamClass);
        } catch (Exception e) {
            RVLogger.e("MyObjectInputStream", "", e);
            return Class.forName(objectStreamClass.getName(), true, this.f9001a);
        }
    }
}
