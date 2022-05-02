package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.alibaba.ariver.resource.api.RVResourceUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Comparator;

public class AppModel implements Parcelable, Serializable {
    @JSONField(serialize = false)
    public static final Comparator<AppModel> COMPARATOR = new Comparator<AppModel>() {
        public final int compare(AppModel appModel, AppModel appModel2) {
            if (appModel == null) {
                return appModel2 == null ? 0 : -1;
            }
            if (appModel2 == null) {
                return 1;
            }
            return RVResourceUtils.compareVersion(appModel.getAppVersion(), appModel2.getAppVersion());
        }
    };
    public static final Parcelable.Creator<AppModel> CREATOR = new Parcelable.Creator<AppModel>() {
        public final AppModel createFromParcel(Parcel parcel) {
            return new AppModel(parcel);
        }

        public final AppModel[] newArray(int i) {
            return new AppModel[i];
        }
    };
    private static final long serialVersionUID = 435160091756780155L;
    @JSONField(serialize = false)
    private String appId;
    @JSONField(name = "appInfo")
    private AppInfoModel appInfoModel;
    @JSONField(serialize = false)
    private String appVersion;
    @JSONField(name = "container")
    private ContainerModel containerInfo;
    @JSONField(name = "extendInfo")
    private JSONObject extendInfos;
    @JSONField(name = "permission")
    private PermissionModel permissionModel;

    public int describeContents() {
        return 0;
    }

    public AppModel() {
    }

    protected AppModel(Parcel parcel) {
        Class<AppModel> cls = AppModel.class;
        this.appId = parcel.readString();
        this.appVersion = parcel.readString();
        this.appInfoModel = (AppInfoModel) parcel.readParcelable(cls.getClassLoader());
        this.containerInfo = (ContainerModel) parcel.readParcelable(cls.getClassLoader());
        this.extendInfos = (JSONObject) parcel.readSerializable();
        this.permissionModel = (PermissionModel) parcel.readParcelable(cls.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.appVersion);
        parcel.writeParcelable(this.appInfoModel, 0);
        parcel.writeParcelable(this.containerInfo, 0);
        parcel.writeSerializable(this.extendInfos);
        parcel.writeParcelable(this.permissionModel, 0);
    }

    public AppInfoModel getAppInfoModel() {
        return this.appInfoModel;
    }

    public void setAppInfoModel(AppInfoModel appInfoModel2) {
        this.appInfoModel = appInfoModel2;
        this.appId = appInfoModel2.getAppId();
        this.appVersion = appInfoModel2.getVersion();
    }

    public ContainerModel getContainerInfo() {
        return this.containerInfo;
    }

    public void setContainerInfo(ContainerModel containerModel) {
        this.containerInfo = containerModel;
    }

    public JSONObject getExtendInfos() {
        return this.extendInfos;
    }

    public void setExtendInfos(JSONObject jSONObject) {
        this.extendInfos = jSONObject;
    }

    @Nullable
    public PermissionModel getPermissionModel() {
        return this.permissionModel;
    }

    public void setPermissionModel(PermissionModel permissionModel2) {
        this.permissionModel = permissionModel2;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppModel{appId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(", appVersion='");
        sb.append(this.appVersion);
        sb.append('\'');
        sb.append(", appInfoModel=");
        sb.append(this.appInfoModel);
        sb.append(", containerInfo=");
        sb.append(this.containerInfo);
        sb.append(", extendInfos=");
        sb.append(this.extendInfos);
        sb.append('}');
        return sb.toString();
    }
}
