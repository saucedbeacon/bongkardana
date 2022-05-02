package com.iap.ac.android.gradient.b;

import dalvik.system.DexClassLoader;

public class a extends DexClassLoader {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f11051a;

    public a(String str, String str2, String str3, ClassLoader classLoader) {
        super(str, str2, (String) null, classLoader.getParent());
        this.f11051a = classLoader;
    }

    public String findLibrary(String str) {
        return super.findLibrary(str);
    }

    public Class<?> loadClass(String str) {
        Class<?> findLoadedClass = findLoadedClass(str);
        if (findLoadedClass != null) {
            return findLoadedClass;
        }
        try {
            findLoadedClass = findClass(str);
        } catch (ClassNotFoundException unused) {
        }
        return findLoadedClass == null ? this.f11051a.loadClass(str) : findLoadedClass;
    }
}
