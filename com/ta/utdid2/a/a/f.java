package com.ta.utdid2.a.a;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;

public class f {
    public static String get(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class, String.class}).invoke(cls.newInstance(), new Object[]{str, str2});
        } catch (Exception unused) {
            return "";
        }
    }
}
