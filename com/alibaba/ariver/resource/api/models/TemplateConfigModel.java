package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

@Keep
public class TemplateConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TemplateConfigModel> CREATOR = new Parcelable.Creator<TemplateConfigModel>() {
        public final TemplateConfigModel createFromParcel(Parcel parcel) {
            return new TemplateConfigModel(parcel);
        }

        public final TemplateConfigModel[] newArray(int i) {
            return new TemplateConfigModel[i];
        }
    };
    private static final long serialVersionUID = 1908013183340485762L;
    @JSONField
    private String appKey;
    @JSONField(name = "ext")
    private TemplateExtModel extModel;
    @JSONField(name = "extUrl")
    private String extUrl;
    @JSONField(name = "templateAppId")
    private String templateId;
    @JSONField
    private String templateVersion;

    public int describeContents() {
        return 0;
    }

    public TemplateConfigModel() {
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isTemplateValid() {
        if (!TextUtils.isEmpty(this.templateId)) {
            return this.extModel != null || !TextUtils.isEmpty(this.extUrl);
        }
        return false;
    }

    protected TemplateConfigModel(Parcel parcel) {
        this.extUrl = parcel.readString();
        this.extModel = (TemplateExtModel) parcel.readParcelable(TemplateConfigModel.class.getClassLoader());
        this.templateId = parcel.readString();
        this.templateVersion = parcel.readString();
        this.appKey = parcel.readString();
    }

    public String getExtUrl() {
        return this.extUrl;
    }

    public void setExtUrl(String str) {
        this.extUrl = str;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String str) {
        this.templateId = str;
    }

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public void setTemplateVersion(String str) {
        this.templateVersion = str;
    }

    public TemplateExtModel getExtModel() {
        return this.extModel;
    }

    public void setExtModel(TemplateExtModel templateExtModel) {
        this.extModel = templateExtModel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.extUrl);
        parcel.writeParcelable(this.extModel, 0);
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateVersion);
        parcel.writeString(this.appKey);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TemplateConfigModel{ext=");
        sb.append(this.extModel);
        sb.append(", extUrl=");
        sb.append(this.extUrl);
        sb.append(", templateId='");
        sb.append(this.templateId);
        sb.append('\'');
        sb.append(", templateVersion='");
        sb.append(this.templateVersion);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
