package com.alipay.iap.android.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DefaultConfigService implements IConfigProvider {
    private HashMap<String, ICommonConfigChangeListener> configChangeListenerHashMap = new HashMap<>(1);
    private HashMap<String, String> configMap = new HashMap<>(5);
    private HashMap<String, ISectionConfigChangeListener> sectionConfigChangeListenerHashMap = new HashMap<>(1);

    public void addConfig(@NonNull String str, @NonNull String str2) {
        this.configMap.put(str, str2);
        ICommonConfigChangeListener iCommonConfigChangeListener = this.configChangeListenerHashMap.get(str);
        if (iCommonConfigChangeListener != null) {
            iCommonConfigChangeListener.onConfigChanged(str, str2);
            return;
        }
        ISectionConfigChangeListener iSectionConfigChangeListener = this.sectionConfigChangeListenerHashMap.get(str);
        if (iSectionConfigChangeListener != null) {
            iSectionConfigChangeListener.onSectionConfigChange(str, str2);
        }
    }

    @Nullable
    public String getConfig(@NonNull String str) {
        return this.configMap.get(str);
    }

    @Nullable
    public String getSectionConfig(@NonNull String str) {
        return this.configMap.get(str);
    }

    public void addCommonConfigChangeListener(@NonNull String str, @NonNull ICommonConfigChangeListener iCommonConfigChangeListener) {
        if (!this.configChangeListenerHashMap.containsKey(str)) {
            this.configChangeListenerHashMap.put(str, iCommonConfigChangeListener);
        }
    }

    public void removeCommonConfigChangeListener(@NonNull ICommonConfigChangeListener iCommonConfigChangeListener) {
        Iterator<Map.Entry<String, ICommonConfigChangeListener>> it = this.configChangeListenerHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (iCommonConfigChangeListener == it.next().getValue()) {
                it.remove();
            }
        }
    }

    public void addSectionConfigChangeListener(@NonNull String str, @NonNull ISectionConfigChangeListener iSectionConfigChangeListener) {
        if (!this.sectionConfigChangeListenerHashMap.containsKey(str)) {
            this.sectionConfigChangeListenerHashMap.put(str, iSectionConfigChangeListener);
        }
    }

    public void removeSectionConfigChangeListener(@NonNull ISectionConfigChangeListener iSectionConfigChangeListener) {
        Iterator<Map.Entry<String, ISectionConfigChangeListener>> it = this.sectionConfigChangeListenerHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (iSectionConfigChangeListener == it.next().getValue()) {
                it.remove();
            }
        }
    }
}
