package com.alipay.plus.android.config.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.config.ICommonConfigChangeListener;
import com.alipay.iap.android.common.config.IConfigProvider;
import com.alipay.iap.android.common.config.ISectionConfigChangeListener;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;
import com.alipay.plus.android.config.sdk.listener.commonconfig.ICommonConfigListener;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ISectionConfigListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AmcsConfigProvider implements IConfigProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10742a = e.a("ConfigProvider");
    private Map<ICommonConfigChangeListener, List<ICommonConfigListener>> b = new HashMap();
    private Map<ISectionConfigChangeListener, List<ISectionConfigListener>> c = new HashMap();

    public AmcsConfigProvider() {
        LoggerWrapper.d(f10742a, "** new AmcsConfigProvider");
    }

    public synchronized void addCommonConfigChangeListener(@NonNull String str, @NonNull final ICommonConfigChangeListener iCommonConfigChangeListener) {
        AnonymousClass1 r0 = new ICommonConfigListener() {
            public void onCommonConfigChanged(@NonNull String str, @Nullable Object obj, @NonNull ConfigChangeType configChangeType) {
                iCommonConfigChangeListener.onConfigChanged(str, obj != null ? String.valueOf(obj) : null);
            }
        };
        List list = this.b.get(iCommonConfigChangeListener);
        if (list == null) {
            list = new ArrayList();
            this.b.put(iCommonConfigChangeListener, list);
        }
        list.add(r0);
        ConfigCenter.getInstance().addCommonConfigListener(str, r0);
    }

    public synchronized void addSectionConfigChangeListener(@NonNull String str, @NonNull final ISectionConfigChangeListener iSectionConfigChangeListener) {
        AnonymousClass2 r0 = new ISectionConfigListener() {
            public void onConfigChanged(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
                iSectionConfigChangeListener.onSectionConfigChange(str, jSONObject != null ? jSONObject.toJSONString() : null);
            }
        };
        List list = this.c.get(iSectionConfigChangeListener);
        if (list == null) {
            list = new ArrayList();
            this.c.put(iSectionConfigChangeListener, list);
        }
        list.add(r0);
        ConfigCenter.getInstance().addSectionConfigListener(str, r0);
    }

    @Nullable
    public String getConfig(@NonNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1066838775, oncanceled);
            onCancelLoad.getMin(1066838775, oncanceled);
        }
        return ConfigCenter.getInstance().getStringConfig(str);
    }

    @Nullable
    public String getSectionConfig(@NonNull String str) {
        JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig(str);
        if (sectionConfig != null) {
            return sectionConfig.toJSONString();
        }
        return null;
    }

    public synchronized void removeCommonConfigChangeListener(@NonNull ICommonConfigChangeListener iCommonConfigChangeListener) {
        List<ICommonConfigListener> list = this.b.get(iCommonConfigChangeListener);
        if (list != null) {
            ConfigCenter instance = ConfigCenter.getInstance();
            for (ICommonConfigListener removeCommonConfigListener : list) {
                instance.removeCommonConfigListener(removeCommonConfigListener);
            }
            list.clear();
        }
    }

    public synchronized void removeSectionConfigChangeListener(@NonNull ISectionConfigChangeListener iSectionConfigChangeListener) {
        List<ISectionConfigListener> list = this.c.get(iSectionConfigChangeListener);
        if (list != null) {
            ConfigCenter instance = ConfigCenter.getInstance();
            for (ISectionConfigListener removeSectionConfigListener : list) {
                instance.removeSectionConfigListener(removeSectionConfigListener);
            }
            list.clear();
        }
    }
}
