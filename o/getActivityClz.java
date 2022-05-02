package o;

import id.dana.domain.profilemenu.model.SettingModel;
import java.io.Serializable;

public class getActivityClz implements Serializable {
    String action;
    String collection;
    boolean enable;
    String iconUrl;
    boolean nullObject = false;
    String redirectUrl;
    String subtitle;
    String subtitleColor;
    boolean subtitleIsBelow;
    String subtitleType;
    String title;

    private getActivityClz(boolean z) {
        this.nullObject = z;
    }

    public static getActivityClz empty() {
        return new getActivityClz(true);
    }

    public getActivityClz() {
    }

    public boolean isNullObject() {
        return this.nullObject;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public static getActivityClz from(SettingModel settingModel) {
        getActivityClz getactivityclz = new getActivityClz();
        getactivityclz.action = settingModel.getAction();
        getactivityclz.enable = settingModel.isEnable();
        getactivityclz.title = settingModel.getTitle();
        getactivityclz.collection = settingModel.getCollection();
        getactivityclz.iconUrl = settingModel.getIconUrl();
        getactivityclz.redirectUrl = settingModel.getRedirectUrl();
        getactivityclz.subtitle = settingModel.getSubtitle();
        getactivityclz.subtitleIsBelow = settingModel.getSubtitleIsBelow().booleanValue();
        getactivityclz.subtitleColor = settingModel.getSubtitleColor();
        getactivityclz.subtitleType = settingModel.getSubtitleType();
        return getactivityclz;
    }

    public boolean getSubtitleIsBelow() {
        return this.subtitleIsBelow;
    }

    public String getSubtitleType() {
        return this.subtitleType;
    }

    public void setSubtitleType(String str) {
        this.subtitleType = str;
    }

    public String getSubtitleColor() {
        return this.subtitleColor;
    }

    public void setSubtitleColor(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1431561837, oncanceled);
            onCancelLoad.getMin(1431561837, oncanceled);
        }
        this.subtitleColor = str;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public String getCollection() {
        return this.collection;
    }

    public void setCollection(String str) {
        this.collection = str;
    }

    public void setSubtitleIsBelow(Boolean bool) {
        this.subtitleIsBelow = bool.booleanValue();
    }
}
