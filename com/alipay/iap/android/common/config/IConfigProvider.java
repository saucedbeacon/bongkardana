package com.alipay.iap.android.common.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;

public interface IConfigProvider {
    void addCommonConfigChangeListener(@NonNull String str, @NonNull ICommonConfigChangeListener iCommonConfigChangeListener);

    void addSectionConfigChangeListener(@NonNull String str, @NonNull ISectionConfigChangeListener iSectionConfigChangeListener);

    @Nullable
    String getConfig(@NonNull String str);

    @Nullable
    String getSectionConfig(@NonNull String str);

    void removeCommonConfigChangeListener(@NonNull ICommonConfigChangeListener iCommonConfigChangeListener);

    void removeSectionConfigChangeListener(@NonNull ISectionConfigChangeListener iSectionConfigChangeListener);

    public static class MockProvider implements IConfigProvider {
        private static final String TAG = "MockProvider";

        @Nullable
        public String getConfig(@NonNull String str) {
            logMockProviderWarning();
            return null;
        }

        @Nullable
        public String getSectionConfig(@NonNull String str) {
            logMockProviderWarning();
            return null;
        }

        public void addCommonConfigChangeListener(@NonNull String str, @NonNull ICommonConfigChangeListener iCommonConfigChangeListener) {
            logMockProviderWarning();
        }

        public void removeCommonConfigChangeListener(@NonNull ICommonConfigChangeListener iCommonConfigChangeListener) {
            logMockProviderWarning();
        }

        public void addSectionConfigChangeListener(@NonNull String str, @NonNull ISectionConfigChangeListener iSectionConfigChangeListener) {
            logMockProviderWarning();
        }

        public void removeSectionConfigChangeListener(@NonNull ISectionConfigChangeListener iSectionConfigChangeListener) {
            logMockProviderWarning();
        }

        private static void logMockProviderWarning() {
            LoggerWrapper.w(TAG, "**WARNING** ConfigProxy configProvider is mocked! you need invoke ConfigProxy.getInstance().setConfigProvider(...) before use it!");
        }
    }
}
