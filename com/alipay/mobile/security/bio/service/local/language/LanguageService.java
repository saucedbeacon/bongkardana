package com.alipay.mobile.security.bio.service.local.language;

import com.alipay.mobile.security.bio.service.local.LocalService;
import java.lang.reflect.Method;

public class LanguageService extends LocalService {
    public int getCurrentLanguage() {
        int i = Language.UNKNOWN.value;
        try {
            Class<?> cls = Class.forName("com.alipay.mobile.framework.locale.LocaleHelper");
            Method method = cls.getMethod("getInstance", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(cls, new Object[0]);
            Method method2 = cls.getMethod("getCurrentLanguage", new Class[0]);
            method2.setAccessible(true);
            return ((Integer) method2.invoke(invoke, new Object[0])).intValue();
        } catch (Exception e) {
            e.getMessage();
            return i;
        }
    }
}
