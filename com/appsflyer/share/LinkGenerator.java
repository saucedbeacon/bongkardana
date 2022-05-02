package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

public class LinkGenerator {

    /* renamed from: ʻ  reason: contains not printable characters */
    private String f8927;

    /* renamed from: ʼ  reason: contains not printable characters */
    private String f8928;

    /* renamed from: ʽ  reason: contains not printable characters */
    private String f8929;

    /* renamed from: ˊ  reason: contains not printable characters */
    String f8930;

    /* renamed from: ˋ  reason: contains not printable characters */
    private String f8931;

    /* renamed from: ˎ  reason: contains not printable characters */
    String f8932;

    /* renamed from: ˏ  reason: contains not printable characters */
    private String f8933;

    /* renamed from: ˏॱ  reason: contains not printable characters */
    private Map<String, String> f8934 = new HashMap();

    /* renamed from: ͺ  reason: contains not printable characters */
    private Map<String, String> f8935 = new HashMap();

    /* renamed from: ॱ  reason: contains not printable characters */
    private String f8936;

    /* renamed from: ॱˊ  reason: contains not printable characters */
    private String f8937;

    /* renamed from: ॱॱ  reason: contains not printable characters */
    private String f8938;

    /* renamed from: ᐝ  reason: contains not printable characters */
    private String f8939;

    public LinkGenerator(String str) {
        this.f8936 = str;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f8939 = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.f8937 = str;
        return this;
    }

    public String getChannel() {
        return this.f8931;
    }

    public LinkGenerator setChannel(String str) {
        this.f8931 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f8927 = str;
        return this;
    }

    public String getMediaSource() {
        return this.f8936;
    }

    public Map<String, String> getParameters() {
        return this.f8935;
    }

    public String getCampaign() {
        return this.f8933;
    }

    public LinkGenerator setCampaign(String str) {
        this.f8933 = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f8935.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f8935.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.f8928 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f8938 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f8929 = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.f8930 = String.format(Constants.AF_BASE_URL_FORMAT, new Object[]{ServerConfigHandler.getUrl(Constants.APPSFLYER_DEFAULT_APP_DOMAIN), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = Constants.ONELINK_DEFAULT_DOMAIN;
            }
            this.f8930 = String.format(Constants.AF_BASE_URL_FORMAT, new Object[]{str2, str});
        }
        return this;
    }

    /* renamed from: ˏ  reason: contains not printable characters */
    private StringBuilder m1351() {
        StringBuilder sb = new StringBuilder();
        String str = this.f8930;
        if (str == null || !str.startsWith("http")) {
            sb.append(ServerConfigHandler.getUrl(Constants.BASE_URL_APP_APPSFLYER_COM));
        } else {
            sb.append(this.f8930);
        }
        if (this.f8932 != null) {
            sb.append('/');
            sb.append(this.f8932);
        }
        this.f8934.put(Constants.URL_MEDIA_SOURCE, this.f8936);
        sb.append('?');
        sb.append("pid=");
        sb.append(m1350(this.f8936, "media source"));
        String str2 = this.f8928;
        if (str2 != null) {
            this.f8934.put(Constants.URL_REFERRER_UID, str2);
            sb.append(Typography.amp);
            sb.append("af_referrer_uid=");
            sb.append(m1350(this.f8928, "referrerUID"));
        }
        String str3 = this.f8931;
        if (str3 != null) {
            this.f8934.put("af_channel", str3);
            sb.append(Typography.amp);
            sb.append("af_channel=");
            sb.append(m1350(this.f8931, "channel"));
        }
        String str4 = this.f8927;
        if (str4 != null) {
            this.f8934.put(Constants.URL_REFERRER_CUSTOMER_ID, str4);
            sb.append(Typography.amp);
            sb.append("af_referrer_customer_id=");
            sb.append(m1350(this.f8927, "referrerCustomerId"));
        }
        String str5 = this.f8933;
        if (str5 != null) {
            this.f8934.put("c", str5);
            sb.append(Typography.amp);
            sb.append("c=");
            sb.append(m1350(this.f8933, "campaign"));
        }
        String str6 = this.f8938;
        if (str6 != null) {
            this.f8934.put(Constants.URL_REFERRER_NAME, str6);
            sb.append(Typography.amp);
            sb.append("af_referrer_name=");
            sb.append(m1350(this.f8938, "referrerName"));
        }
        String str7 = this.f8929;
        if (str7 != null) {
            this.f8934.put(Constants.URL_REFERRER_IMAGE_URL, str7);
            sb.append(Typography.amp);
            sb.append("af_referrer_image_url=");
            sb.append(m1350(this.f8929, "referrerImageURL"));
        }
        if (this.f8937 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f8937);
            String str8 = "";
            sb2.append(this.f8937.endsWith("/") ? str8 : "/");
            String str9 = this.f8939;
            if (str9 != null) {
                sb2.append(str9);
            }
            this.f8934.put(Constants.URL_BASE_DEEPLINK, sb2.toString());
            sb.append(Typography.amp);
            sb.append("af_dp=");
            sb.append(m1350(this.f8937, "baseDeeplink"));
            if (this.f8939 != null) {
                if (!this.f8937.endsWith("/")) {
                    str8 = "%2F";
                }
                sb.append(str8);
                sb.append(m1350(this.f8939, "deeplinkPath"));
            }
        }
        for (String next : this.f8935.keySet()) {
            String obj = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(next);
            sb3.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb3.append(m1350(this.f8935.get(next), next));
            if (!obj.contains(sb3.toString())) {
                sb.append(Typography.amp);
                sb.append(next);
                sb.append('=');
                sb.append(m1350(this.f8935.get(next), next));
            }
        }
        return sb;
    }

    /* renamed from: ˎ  reason: contains not printable characters */
    private static String m1350(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException unused) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.afInfoLog(sb.toString());
            return "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String generateLink() {
        return m1351().toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.f8935.isEmpty()) {
            for (Map.Entry next : this.f8935.entrySet()) {
                this.f8934.put(next.getKey(), next.getValue());
            }
        }
        m1351();
        ShareInviteHelper.generateUserInviteLink(context, string, this.f8934, responseListener);
    }
}
