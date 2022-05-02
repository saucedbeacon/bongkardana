package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@Keep
public class AppInfoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AppInfoModel> CREATOR = new Parcelable.Creator<AppInfoModel>() {
        public final AppInfoModel createFromParcel(Parcel parcel) {
            return new AppInfoModel(parcel);
        }

        public final AppInfoModel[] newArray(int i) {
            return new AppInfoModel[i];
        }
    };
    private static final long serialVersionUID = -5050984571826320290L;
    @JSONField
    private String alias;
    @JSONField
    private String appId;
    @JSONField
    private String appKey;
    @JSONField
    private String desc;
    @JSONField
    private String developerVersion;
    @JSONField
    private String fallbackBaseUrl;
    @JSONField
    private String logo;
    @JSONField
    private String mainUrl;
    @JSONField
    private String name;
    @JSONField
    private String origin;
    @JSONField
    private String packageSize;
    @JSONField
    private String packageUrl;
    private List<PluginModel> plugins;
    @JSONField
    private String reqmode;
    @JSONField
    private String slogan;
    @JSONField
    private String status;
    @JSONField(name = "subPackageUrls")
    private JSONObject subPackages;
    @JSONField
    private int subType;
    @JSONField
    private TemplateConfigModel templateConfig;
    @JSONField(name = "deployVersion")
    private String version;
    @JSONField
    private String vhost;

    public int describeContents() {
        return 0;
    }

    public AppInfoModel() {
    }

    protected AppInfoModel(Parcel parcel) {
        this.appId = parcel.readString();
        this.name = parcel.readString();
        this.alias = parcel.readString();
        this.logo = parcel.readString();
        this.desc = parcel.readString();
        this.origin = parcel.readString();
        this.version = parcel.readString();
        this.developerVersion = parcel.readString();
        this.fallbackBaseUrl = parcel.readString();
        this.packageUrl = parcel.readString();
        this.packageSize = parcel.readString();
        this.vhost = parcel.readString();
        this.mainUrl = parcel.readString();
        this.appKey = parcel.readString();
        this.subPackages = (JSONObject) parcel.readSerializable();
        this.templateConfig = (TemplateConfigModel) parcel.readParcelable(AppInfoModel.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(PluginModel.class.getClassLoader());
            this.plugins = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                Parcelable parcelable = readParcelableArray[i];
                if (parcelable instanceof PluginModel) {
                    this.plugins.add((PluginModel) parcelable);
                }
            }
        }
        this.status = parcel.readString();
        this.slogan = parcel.readString();
        this.subType = parcel.readInt();
        this.reqmode = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.name);
        parcel.writeString(this.alias);
        parcel.writeString(this.logo);
        parcel.writeString(this.desc);
        parcel.writeString(this.origin);
        parcel.writeString(this.version);
        parcel.writeString(this.developerVersion);
        parcel.writeString(this.fallbackBaseUrl);
        parcel.writeString(this.packageUrl);
        parcel.writeString(this.packageSize);
        parcel.writeString(this.vhost);
        parcel.writeString(this.mainUrl);
        parcel.writeString(this.appKey);
        parcel.writeSerializable(this.subPackages);
        parcel.writeParcelable(this.templateConfig, 0);
        List<PluginModel> list = this.plugins;
        int size = list == null ? 0 : list.size();
        parcel.writeInt(size);
        if (size > 0) {
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                parcelableArr[i2] = this.plugins.get(i2);
            }
            parcel.writeParcelableArray(parcelableArr, 0);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.slogan);
        parcel.writeInt(this.subType);
        parcel.writeString(this.reqmode);
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1437414256, oncanceled);
            onCancelLoad.getMin(-1437414256, oncanceled);
        }
        this.appId = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getDeveloperVersion() {
        return this.developerVersion;
    }

    public void setDeveloperVersion(String str) {
        this.developerVersion = str;
    }

    public String getFallbackBaseUrl() {
        return this.fallbackBaseUrl;
    }

    public void setFallbackBaseUrl(String str) {
        this.fallbackBaseUrl = str;
    }

    public String getPackageUrl() {
        return this.packageUrl;
    }

    public void setPackageUrl(String str) {
        this.packageUrl = str;
    }

    public String getPackageSize() {
        return this.packageSize;
    }

    public void setPackageSize(String str) {
        this.packageSize = str;
    }

    public String getVhost() {
        return this.vhost;
    }

    public void setVhost(String str) {
        this.vhost = str;
    }

    public String getMainUrl() {
        return this.mainUrl;
    }

    public void setMainUrl(String str) {
        this.mainUrl = str;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public JSONObject getSubPackages() {
        return this.subPackages;
    }

    public void setSubPackages(JSONObject jSONObject) {
        this.subPackages = jSONObject;
    }

    public TemplateConfigModel getTemplateConfig() {
        return this.templateConfig;
    }

    public void setTemplateConfig(TemplateConfigModel templateConfigModel) {
        this.templateConfig = templateConfigModel;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public int getSubType() {
        return this.subType;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public List<PluginModel> getPlugins() {
        return this.plugins;
    }

    public void setPlugins(List<PluginModel> list) {
        this.plugins = list;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public void setSlogan(String str) {
        this.slogan = str;
    }

    public String getReqmode() {
        return this.reqmode;
    }

    public void setReqmode(String str) {
        this.reqmode = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppInfoModel{appId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", alias='");
        sb.append(this.alias);
        sb.append('\'');
        sb.append(", logo='");
        sb.append(this.logo);
        sb.append('\'');
        sb.append(", desc='");
        sb.append(this.desc);
        sb.append('\'');
        sb.append(", origin='");
        sb.append(this.origin);
        sb.append('\'');
        sb.append(", version='");
        sb.append(this.version);
        sb.append('\'');
        sb.append(", developerVersion='");
        sb.append(this.developerVersion);
        sb.append('\'');
        sb.append(", fallbackBaseUrl='");
        sb.append(this.fallbackBaseUrl);
        sb.append('\'');
        sb.append(", packageUrl='");
        sb.append(this.packageUrl);
        sb.append('\'');
        sb.append(", packageSize='");
        sb.append(this.packageSize);
        sb.append('\'');
        sb.append(", vhost='");
        sb.append(this.vhost);
        sb.append('\'');
        sb.append(", mainUrl='");
        sb.append(this.mainUrl);
        sb.append('\'');
        sb.append(", appKey='");
        sb.append(this.appKey);
        sb.append('\'');
        sb.append(", subPackages=");
        sb.append(this.subPackages);
        sb.append(", templateConfig=");
        sb.append(this.templateConfig);
        sb.append(", plugins=");
        sb.append(this.plugins);
        sb.append(", status='");
        sb.append(this.status);
        sb.append('\'');
        sb.append(", slogan=");
        sb.append(this.slogan);
        sb.append(", reqmode=");
        sb.append(this.reqmode);
        sb.append('}');
        return sb.toString();
    }
}
