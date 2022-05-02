package com.alipay.iap.android.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.config.IConfigProvider;

public class ConfigProxy implements IConfigProvider {
    private static final ConfigProxy INSTANCE = new ConfigProxy();
    private static final String TAG = "ConfigProxy";
    @NonNull
    private IConfigProvider configProvider = new IConfigProvider.MockProvider();

    public static ConfigProxy getInstance() {
        return INSTANCE;
    }

    private ConfigProxy() {
    }

    public void setConfigProvider(@NonNull IConfigProvider iConfigProvider) {
        this.configProvider = iConfigProvider;
    }

    @NonNull
    public IConfigProvider getConfigProvider() {
        return this.configProvider;
    }

    @Nullable
    public String getConfig(@NonNull String str) {
        return this.configProvider.getConfig(str);
    }

    @Nullable
    public String getSectionConfig(@NonNull String str) {
        return this.configProvider.getSectionConfig(str);
    }

    public void addCommonConfigChangeListener(@NonNull String str, @NonNull ICommonConfigChangeListener iCommonConfigChangeListener) {
        this.configProvider.addCommonConfigChangeListener(str, iCommonConfigChangeListener);
    }

    public void removeCommonConfigChangeListener(@NonNull ICommonConfigChangeListener iCommonConfigChangeListener) {
        this.configProvider.removeCommonConfigChangeListener(iCommonConfigChangeListener);
    }

    public void addSectionConfigChangeListener(@NonNull String str, @NonNull ISectionConfigChangeListener iSectionConfigChangeListener) {
        this.configProvider.addSectionConfigChangeListener(str, iSectionConfigChangeListener);
    }

    public void removeSectionConfigChangeListener(@NonNull ISectionConfigChangeListener iSectionConfigChangeListener) {
        this.configProvider.removeSectionConfigChangeListener(iSectionConfigChangeListener);
    }
}
