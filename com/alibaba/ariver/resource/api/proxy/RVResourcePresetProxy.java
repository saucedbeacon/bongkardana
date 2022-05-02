package com.alibaba.ariver.resource.api.proxy;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.resource.api.models.AppModel;
import java.io.InputStream;
import java.util.Map;

@Keep
public interface RVResourcePresetProxy extends Proxiable {

    @Keep
    public interface InputStreamGetter {
        InputStream onGetInputStream();
    }

    @Nullable
    Map<String, AppModel> getPresetAppInfos();

    @Nullable
    Map<String, PresetPackage> getPresetPackage();

    @Keep
    public static class PresetPackage {
        private String appId;
        private boolean forceUse;
        private InputStreamGetter inputStreamGetter;
        private String version;

        public PresetPackage(String str, String str2, InputStreamGetter inputStreamGetter2) {
            this.appId = str;
            this.version = str2;
            this.inputStreamGetter = inputStreamGetter2;
        }

        public boolean isForceUse() {
            return this.forceUse;
        }

        public void setForceUse(boolean z) {
            this.forceUse = z;
        }

        public String getAppId() {
            return this.appId;
        }

        public String getVersion() {
            return this.version;
        }

        public InputStream getInputStream() {
            return this.inputStreamGetter.onGetInputStream();
        }
    }
}
