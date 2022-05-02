package o;

import android.text.TextUtils;

public class setValidDomains {
    private String bizType;
    private String content;
    private long lastUpdatedTime;

    public setValidDomains() {
        this.lastUpdatedTime = -1;
        this.bizType = "";
        this.content = "";
    }

    public setValidDomains(String str, String str2, long j) {
        this.bizType = str;
        this.content = str2;
        this.lastUpdatedTime = j;
    }

    public static setValidDomains fromPreference(onSingleFailed onsinglefailed, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(setLaunchParams.CONTENT);
        String string = onsinglefailed.getString(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(setLaunchParams.LAST_UPDATED_TIME);
        return new setValidDomains(str, string, onsinglefailed.getLong(sb2.toString()).longValue());
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getContent()) && getLastUpdatedTime() == -1;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public void setLastUpdatedTime(long j) {
        this.lastUpdatedTime = j;
    }
}
