package com.ta.audid.g;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;

public class i {
    public static String get(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class}).invoke(cls.newInstance(), new Object[]{str});
        } catch (Exception e) {
            m.e("", "get() ERROR!!! Exception!", e);
            return "";
        }
    }

    public static String get(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class, String.class}).invoke(cls.newInstance(), new Object[]{str, str2});
        } catch (Exception e) {
            m.e("", "get() ERROR!!! Exception!", e);
            return "";
        }
    }
}
