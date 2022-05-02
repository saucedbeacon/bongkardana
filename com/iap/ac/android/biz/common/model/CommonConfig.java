package com.iap.ac.android.biz.common.model;

import android.text.TextUtils;
import com.alipay.mobile.security.bio.workspace.Env;
import com.iap.ac.android.biz.BuildConfig;
import java.util.List;
import java.util.Set;

public class CommonConfig {
    public static final String SANDBOXMOCK = "SANDBOX%s_AC";
    public String acsAppId = "2102000024800001";
    public String amcsGatewayUrl = "https://imgs-ac.alipay.com/imgw.htm";
    public String appId;
    public String authCode;
    public String cdnUrl;
    public List<String> certList;
    public String clientId;
    public Set<String> crashWhiteListSet;
    public String defaultMobilePhoneRegionCode;
    public String defaultRegion;
    public String envType = "PROD";
    public String gatewayUrl = "https://imgs-ac.alipay.com/imgw.htm";
    public String golGoogleUrl = "https://open-sea.alipayplus.com/isupergw/alipaynet/site/oauth/auth/extension/prepare.htm";
    public String gpSignature = "";
    public String logGatewayUrl = BuildConfig.GATEWAY_LOG_PROD;
    public String pspId;
    public String siteName;

    public String getLogProductId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.appId);
        sb.append("_ANDROID-");
        sb.append(this.envType);
        return sb.toString();
    }

    public String getWorkspaceId() {
        return TextUtils.equals("PRE", this.envType) ? Env.NAME_PRE : "default";
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.appId) && !TextUtils.isEmpty(this.envType);
    }

    public void setEnvType(String str) {
        this.envType = str;
        if (TextUtils.isEmpty(str)) {
            this.envType = "PROD";
        }
        String str2 = this.envType;
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -1711584601) {
            if (hashCode != 67573) {
                if (hashCode != 79491) {
                    if (hashCode == 82110 && str2.equals("SIT")) {
                        c = 1;
                    }
                } else if (str2.equals("PRE")) {
                    c = 3;
                }
            } else if (str2.equals("DEV")) {
                c = 0;
            }
        } else if (str2.equals("SANDBOX")) {
            c = 2;
        }
        if (c == 0) {
            this.gatewayUrl = BuildConfig.GATEWAY_DEV;
            this.amcsGatewayUrl = "https://imgs-ac-amcs.dl.alipaydev.com/imgw.htm";
            this.golGoogleUrl = "http://googletng.dl.alipaydev.com/isupergw/alipaynet/site/oauth/auth/extension/prepare.htm";
            this.cdnUrl = "http://w.test.alipay.net/ac_cdn_data/static/";
        } else if (c == 1) {
            this.gatewayUrl = BuildConfig.GATEWAY_SIT;
            this.amcsGatewayUrl = BuildConfig.GATEWAY_SIT;
        } else if (c == 2) {
            this.gatewayUrl = "https://imgs-ac.alipay.com/imgw.htm";
            this.amcsGatewayUrl = "https://imgs-ac.alipay.com/imgw.htm";
        } else if (c != 3) {
            this.envType = "PROD";
            this.gatewayUrl = "https://imgs-ac.alipay.com/imgw.htm";
            this.amcsGatewayUrl = "https://gw.zamcs.com/mgw.htm";
            this.logGatewayUrl = BuildConfig.GATEWAY_LOG_PROD;
            this.golGoogleUrl = "https://open-sea.alipayplus.com/isupergw/alipaynet/site/oauth/auth/extension/prepare.htm";
            this.cdnUrl = "https://render.alipay.com/p/w/ac_cdn_data/static/";
        } else {
            this.gatewayUrl = BuildConfig.GATEWAY_PRE;
            this.amcsGatewayUrl = BuildConfig.GATEWAY_PRE;
        }
    }
}
