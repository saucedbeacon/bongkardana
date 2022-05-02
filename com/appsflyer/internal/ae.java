package com.appsflyer.internal;

import com.appsflyer.AFLogger;

public final class ae implements d {

    /* renamed from: ˎ  reason: contains not printable characters */
    private d f8662 = this;

    interface d {
        /* renamed from: ˋ  reason: contains not printable characters */
        Class<?> m1225(String str) throws ClassNotFoundException;
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    public final String m1222() {
        for (a aVar : a.values()) {
            if (m1220(aVar.f8672)) {
                return aVar.f8673;
            }
        }
        return a.DEFAULT.f8673;
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private boolean m1220(String str) {
        try {
            this.f8662.m1225(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    enum a {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native"),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "io.flutter.plugin.common.MethodChannel.MethodCallHandler");
        
        /* access modifiers changed from: private */

        /* renamed from: ʻ  reason: contains not printable characters */
        public String f8672;
        /* access modifiers changed from: private */

        /* renamed from: ᐝ  reason: contains not printable characters */
        public String f8673;

        private a(String str, String str2) {
            this.f8673 = str;
            this.f8672 = str2;
        }
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    public final Class<?> m1221(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }
}
