package o;

import java.io.Serializable;

public class calculateLayoutSize implements Serializable {
    private String action;
    private String icon;
    private String key;
    private boolean promoActive;
    private String promoDesc;
    private String promoTitle;
    private String redirectUrl;
    private String subTitle;
    private String title;

    public calculateLayoutSize() {
    }

    public calculateLayoutSize(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8) {
        this.key = str;
        this.title = str3;
        this.subTitle = str2;
        this.action = str4;
        this.redirectUrl = str5;
        this.promoActive = z;
        this.icon = str6;
        this.promoTitle = str7;
        this.promoDesc = str8;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public boolean isPromoActive() {
        return this.promoActive;
    }

    public void setPromoActive(boolean z) {
        this.promoActive = z;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getPromoTitle() {
        return this.promoTitle;
    }

    public void setPromoTitle(String str) {
        this.promoTitle = str;
    }

    public String getPromoDesc() {
        return this.promoDesc;
    }

    public void setPromoDesc(String str) {
        this.promoDesc = str;
    }
}
