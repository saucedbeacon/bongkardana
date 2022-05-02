package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceHelper {
    public static final String KEY_FACEDETECT_SERVER_CONFIGS = "facedetect_server_configs";
    public static final String KEY_FACEDETECT_SERVER_CONFIGS_VERSION = "facedetect_server_configs_version";
    public static final String KEY_FACEDETECT_SOUND_ENABLE = "facedetect_sound_enable";
    private static SharedPreferences.Editor mEditor;
    private static SharedPreferences mdPreferences;

    protected static SharedPreferences.Editor getEditor(Context context) {
        if (mEditor == null) {
            mEditor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        }
        return mEditor;
    }

    protected static SharedPreferences getSharedPreferences(Context context) {
        if (mdPreferences == null) {
            mdPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        }
        return mdPreferences;
    }

    public static String getValue(Context context, String str) {
        return getSharedPreferences(context).getString(SignHelper.SHA1(str), "");
    }

    public static void setValue(Context context, String str, String str2) {
        getEditor(context).putString(SignHelper.SHA1(str), str2).commit();
    }

    public static String getServerConfig(Context context) {
        return getSharedPreferences(context).getString(SignHelper.SHA1(KEY_FACEDETECT_SERVER_CONFIGS), "");
    }

    public static void setServerConfig(Context context, String str) {
        getEditor(context).putString(SignHelper.SHA1(KEY_FACEDETECT_SERVER_CONFIGS), str).commit();
    }

    public static boolean getSoundEnable(Context context) {
        return getSharedPreferences(context).getBoolean(SignHelper.SHA1(KEY_FACEDETECT_SOUND_ENABLE), true);
    }

    public static void setSoundEnable(Context context, boolean z) {
        getEditor(context).putBoolean(SignHelper.SHA1(KEY_FACEDETECT_SOUND_ENABLE), z);
    }

    public static String getServerConfigVersion(Context context) {
        return getSharedPreferences(context).getString(SignHelper.SHA1(KEY_FACEDETECT_SERVER_CONFIGS_VERSION), "");
    }

    public static void setServerConfigVersion(Context context, String str) {
        getEditor(context).putString(SignHelper.SHA1(KEY_FACEDETECT_SERVER_CONFIGS_VERSION), str).commit();
    }
}
