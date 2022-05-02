package com.alipay.mobile.security.bio.workspace;

import android.content.Context;
import com.alipay.mobile.security.bio.utils.DeviceUtil;
import java.util.HashMap;

public class Env {
    private static final int APP_SECURITY_ENV_CONFIG_DEV = 4;
    private static final int APP_SECURITY_ENV_CONFIG_ONLINE = 0;
    private static final int APP_SECURITY_ENV_CONFIG_PRE = 2;
    private static final int APP_SECURITY_ENV_CONFIG_TEST = 3;
    public static final String BID_LOG_KEY_PUBLIC_KEY = "bid-log-key-public.key";
    public static final String BID_LOG_KEY_PUBLIC_T_KEY = "bid-log-key-public_t.key";
    private static final HashMap<String, Env> ENVS = new HashMap<>();
    public static final String KEY_PROTOCOL_FORMAT = "meta_serializer";
    public static final String NAME_DEV = "dev";
    public static final String NAME_ONLINE = "online";
    public static final String NAME_ONLINE_ANT_CLOUD = "ant_cloud_online";
    public static final String NAME_PRE = "pre";
    public static final String NAME_PRE_ANT_CLOUD = "ant_cloud_pre";
    public static final String NAME_TEST = "test";
    public static final Env ONLINE = new Env("online", "", "", "", 0, "bid-log-key-public.key");
    public static final int PROTOCOL_FORMAT_JSON = 1;
    public static final int PROTOCOL_FORMAT_PB = 2;
    private static final String PUBLIC_KEY_ASSETS_NAME_DEV = "bid-log-key-public_t.key";
    private static final String PUBLIC_KEY_ASSETS_NAME_ONLINE = "bid-log-key-public.key";
    private static final String PUBLIC_KEY_ASSETS_NAME_PRE = "bid-log-key-public.key";
    private static final String PUBLIC_KEY_ASSETS_NAME_TEST = "bid-log-key-public_t.key";
    public int appSecurityEnvConfig;
    public String gwUrl;
    public String loggingGatewayUrl;
    public String name;
    public String publicKeyAssetsName;
    public String zimInitializeUrl;

    public Env(String str, String str2, String str3, String str4, int i, String str5) {
        this.name = str;
        this.gwUrl = str2;
        this.zimInitializeUrl = str3;
        this.loggingGatewayUrl = str4;
        this.appSecurityEnvConfig = i;
        this.publicKeyAssetsName = str5;
    }

    public static Env getEnvByName(String str) {
        return ENVS.get(str);
    }

    public static void setProtocolFormat(Context context, int i) {
        if (DeviceUtil.isDebug(context)) {
            context.getSharedPreferences("biometric", 0).edit().putInt("meta_serializer", i).apply();
        }
    }

    public static int getProtocolFormat(Context context) {
        if (DeviceUtil.isDebug(context)) {
            return context.getSharedPreferences("biometric", 0).getInt("meta_serializer", 2);
        }
        return 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Env{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", publicKeyAssetsName='");
        sb.append(this.publicKeyAssetsName);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
