package com.alibaba.griver.base.common.utils;

import android.text.TextUtils;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.lang.reflect.Field;

public class ReflectUtils {
    public static boolean classExist(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            GriverLogger.w("ReflectUtils", "check class, just print", e);
            return false;
        }
    }

    public static <T> T getFieldValue(Field field, Object obj) {
        if (field != null) {
            try {
                field.setAccessible(true);
                return field.get(obj);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static <T> T getFieldValue(Class cls, String str, Object obj) {
        Field field;
        if (!TextUtils.isEmpty(str) && (field = getField(cls, str)) != null) {
            try {
                field.setAccessible(true);
                return field.get(obj);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Field getField(Class cls, String str) {
        if (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
