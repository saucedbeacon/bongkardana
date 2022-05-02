package com.google.android.play.core.install.model;

import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, String> f9569a = new HashMap();
    private static final Map<Integer, String> b = new HashMap();

    static {
        f9569a.put(-2, "An unknown error occurred.");
        f9569a.put(-3, "The API is not available on this device.");
        f9569a.put(-4, "The request that was sent by the app is malformed.");
        f9569a.put(-5, "The install is unavailable to this user or device.");
        f9569a.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        f9569a.put(-7, "The install/update has not been (fully) downloaded yet.");
        f9569a.put(-8, "The install is already in progress and there is no UI flow to resume.");
        f9569a.put(-9, "The Play Store app is either not installed or not the official version.");
        f9569a.put(-10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        f9569a.put(-100, "An internal error happened in the Play Store.");
        b.put(-2, "ERROR_UNKNOWN");
        b.put(-3, "ERROR_API_NOT_AVAILABLE");
        b.put(-4, "ERROR_INVALID_REQUEST");
        b.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        b.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        b.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        b.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        b.put(-100, "ERROR_INTERNAL_ERROR");
        b.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
        b.put(-10, "ERROR_APP_NOT_OWNED");
    }

    public static String a(@InstallErrorCode int i) {
        Map<Integer, String> map = f9569a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !b.containsKey(valueOf)) {
            return "";
        }
        String str = f9569a.get(valueOf);
        String str2 = b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 103 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
