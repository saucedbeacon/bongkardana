package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

@Keep
public class TemplateExtModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TemplateExtModel> CREATOR = new Parcelable.Creator<TemplateExtModel>() {
        public final TemplateExtModel createFromParcel(Parcel parcel) {
            return new TemplateExtModel(parcel);
        }

        public final TemplateExtModel[] newArray(int i) {
            return new TemplateExtModel[i];
        }
    };
    private static final long serialVersionUID = 3025278248169103192L;
    @JSONField(name = "extEnable")
    private boolean extEnable;
    @JSONField(name = "ext")
    private JSONObject extObj;
    @JSONField(name = "extPages")
    private JSONObject extPages;
    @JSONField(name = "tabBar")
    private JSONObject tabBarObject;
    @JSONField(name = "window")
    private JSONObject window;

    public int describeContents() {
        return 0;
    }

    public TemplateExtModel() {
    }

    protected TemplateExtModel(Parcel parcel) {
        this.extObj = (JSONObject) parcel.readSerializable();
        this.window = (JSONObject) parcel.readSerializable();
        this.tabBarObject = (JSONObject) parcel.readSerializable();
        this.extPages = (JSONObject) parcel.readSerializable();
        this.extEnable = parcel.readByte() != 1 ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.extObj);
        parcel.writeSerializable(this.window);
        parcel.writeSerializable(this.tabBarObject);
        parcel.writeSerializable(this.extPages);
        parcel.writeByte(this.extEnable ? (byte) 1 : 0);
    }

    public JSONObject getExtObj() {
        return this.extObj;
    }

    public void setExtObj(JSONObject jSONObject) {
        this.extObj = jSONObject;
    }

    public boolean isExtEnable() {
        return this.extEnable;
    }

    public void setExtEnable(boolean z) {
        this.extEnable = z;
    }

    public JSONObject getWindow() {
        return this.window;
    }

    public void setWindow(JSONObject jSONObject) {
        this.window = jSONObject;
    }

    public JSONObject getTabBarObject() {
        return this.tabBarObject;
    }

    public void setTabBarObject(JSONObject jSONObject) {
        this.tabBarObject = jSONObject;
    }

    public JSONObject getExtPages() {
        return this.extPages;
    }

    public void setExtPages(JSONObject jSONObject) {
        this.extPages = jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TemplateExtModel{extObj=");
        sb.append(this.extObj);
        sb.append(", extEnable=");
        sb.append(this.extEnable);
        sb.append(", window=");
        sb.append(this.window);
        sb.append('}');
        return sb.toString();
    }
}
