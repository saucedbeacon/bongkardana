package com.alipay.mobile.security.faceauth.api;

import android.content.Context;
import com.alipay.mobile.security.bio.module.MicroModule;

public class AntDetectFactory {
    public static int TYPE_FACE;

    public static AntDetector create(Context context, int i, MicroModule microModule) {
        if (context == null) {
            throw new RuntimeException("context Can't be null");
        } else if (i == 0) {
            return (AntDetector) getInstance(context, "com.alipay.mobile.security.faceauth.bean.FaceAuthenticator", microModule);
        } else {
            throw new RuntimeException("Can't find Authenticator");
        }
    }

    private static Object getInstance(Context context, String str, MicroModule microModule) {
        try {
            return Class.forName(str).getConstructor(new Class[]{Context.class, MicroModule.class}).newInstance(new Object[]{context, microModule});
        } catch (Exception unused) {
            return null;
        }
    }
}
