package com.alibaba.ariver.resource.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DynamicPluginInfo implements Parcelable {
    public static final Parcelable.Creator<DynamicPluginInfo> CREATOR = new Parcelable.Creator<DynamicPluginInfo>() {
        public final DynamicPluginInfo createFromParcel(Parcel parcel) {
            return new DynamicPluginInfo(parcel);
        }

        public final DynamicPluginInfo[] newArray(int i) {
            return new DynamicPluginInfo[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private List<PluginModel> f10175a = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public DynamicPluginInfo() {
    }

    protected DynamicPluginInfo(Parcel parcel) {
        this.f10175a = parcel.createTypedArrayList(PluginModel.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f10175a);
    }

    public boolean addPlugin(PluginModel pluginModel) {
        if (pluginModel == null) {
            return false;
        }
        PluginModel pluginModel2 = null;
        Iterator<PluginModel> it = this.f10175a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PluginModel next = it.next();
            if (TextUtils.equals(pluginModel.getAppId(), next.getAppId()) && TextUtils.equals(pluginModel.getVersion(), next.getVersion())) {
                pluginModel2 = next;
                break;
            }
        }
        if (pluginModel2 != null) {
            this.f10175a.remove(pluginModel2);
        }
        return this.f10175a.add(pluginModel);
    }

    public List<PluginModel> getPluginModels() {
        return this.f10175a;
    }
}
