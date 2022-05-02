package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

@Keep
public class PluginModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PluginModel> CREATOR = new Parcelable.Creator<PluginModel>() {
        public final PluginModel createFromParcel(Parcel parcel) {
            return new PluginModel(parcel);
        }

        public final PluginModel[] newArray(int i) {
            return new PluginModel[i];
        }
    };
    private static final long serialVersionUID = 5268600696037076004L;
    @JSONField
    private String appId;
    @JSONField
    private String appKey;
    @JSONField
    private String developerVersion;
    @JSONField
    private JSONObject extendInfo;
    @JSONField
    private String packageSize;
    @JSONField
    private String packageUrl;
    @JSONField
    private JSONObject permission;
    @JSONField
    private String requireVersion;
    @JSONField(name = "deployVersion")
    private String version;

    public int describeContents() {
        return 0;
    }

    public PluginModel() {
    }

    protected PluginModel(Parcel parcel) {
        this.appId = parcel.readString();
        this.appKey = parcel.readString();
        this.packageUrl = parcel.readString();
        this.packageSize = parcel.readString();
        this.developerVersion = parcel.readString();
        this.requireVersion = parcel.readString();
        this.version = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] buf = IOUtils.getBuf(readInt);
            parcel.readByteArray(buf);
            this.permission = JSONUtils.unmarshallJSONObject(buf);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            byte[] buf2 = IOUtils.getBuf(readInt2);
            parcel.readByteArray(buf2);
            this.extendInfo = JSONUtils.unmarshallJSONObject(buf2);
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String str) {
        this.appKey = str;
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

    public String getDeveloperVersion() {
        return this.developerVersion;
    }

    public void setDeveloperVersion(String str) {
        this.developerVersion = str;
    }

    public String getRequireVersion() {
        return this.requireVersion;
    }

    public void setRequireVersion(String str) {
        this.requireVersion = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public JSONObject getPermission() {
        return this.permission;
    }

    public void setPermission(JSONObject jSONObject) {
        this.permission = jSONObject;
    }

    public JSONObject getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(JSONObject jSONObject) {
        this.extendInfo = jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PluginModel{appId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(", appKey='");
        sb.append(this.appKey);
        sb.append('\'');
        sb.append(", packageUrl='");
        sb.append(this.packageUrl);
        sb.append('\'');
        sb.append(", developerVersion='");
        sb.append(this.developerVersion);
        sb.append('\'');
        sb.append(", requireVersion='");
        sb.append(this.requireVersion);
        sb.append('\'');
        sb.append(", version='");
        sb.append(this.version);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    @JSONField(deserialize = false, serialize = false)
    public AppModel toAppModel() {
        AppModel appModel = new AppModel();
        AppInfoModel appInfoModel = new AppInfoModel();
        appInfoModel.setAppId(this.appId);
        appInfoModel.setVersion(this.version);
        appInfoModel.setDeveloperVersion(this.developerVersion);
        appInfoModel.setPackageUrl(this.packageUrl);
        appInfoModel.setPackageSize(this.packageSize);
        appInfoModel.setAppKey(this.appKey);
        appModel.setAppInfoModel(appInfoModel);
        appModel.setPermissionModel(PermissionModel.generateFromJSON(this.permission));
        return appModel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.appId);
        parcel.writeString(this.appKey);
        parcel.writeString(this.packageUrl);
        parcel.writeString(this.packageSize);
        parcel.writeString(this.developerVersion);
        parcel.writeString(this.requireVersion);
        parcel.writeString(this.version);
        byte[] marshallJSONObject = JSONUtils.marshallJSONObject(this.permission);
        int i3 = 0;
        if (marshallJSONObject == null) {
            i2 = 0;
        } else {
            i2 = marshallJSONObject.length;
        }
        parcel.writeInt(i2);
        if (i2 > 0) {
            parcel.writeByteArray(marshallJSONObject);
        }
        byte[] marshallJSONObject2 = JSONUtils.marshallJSONObject(this.extendInfo);
        if (marshallJSONObject2 != null) {
            i3 = marshallJSONObject2.length;
        }
        parcel.writeInt(i3);
        if (i3 > 0) {
            parcel.writeByteArray(marshallJSONObject2);
        }
    }
}
