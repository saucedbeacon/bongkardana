package com.alipay.mobile.security.bio.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.utils.FileUtil;
import java.util.List;

public class FrameworkDesc {
    public static final String ASSETS_NAME_ZOLOZ_FRAMEWORK = "zoloz_framework.json";
    public static final String BUNDLE_NAME_BIOMETRIC = "android-phone-securitycommon-biometric";
    @JSONField(name = "configs")
    public List<ConfigDesc> configs;
    @JSONField(name = "framework_version")
    public String frameworkVersion;

    public static class ConfigDesc {
        @JSONField(name = "bundle_name")
        public String bundleName;
        @JSONField(name = "config_file_name")
        public String configFileName;
        @JSONField(name = "dev")
        public boolean dev = false;
        @JSONField(name = "dynamic")
        public boolean dynamic = false;

        public String toString() {
            StringBuilder sb = new StringBuilder("ConfigDesc{bundleName='");
            sb.append(this.bundleName);
            sb.append('\'');
            sb.append(", configFileName='");
            sb.append(this.configFileName);
            sb.append('\'');
            sb.append(", dynamic='");
            sb.append(this.dynamic);
            sb.append('\'');
            sb.append(", dev='");
            sb.append(this.dev);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public static FrameworkDesc create(Context context) {
        String str = new String(FileUtil.getAssetsData(context.getResources(), ASSETS_NAME_ZOLOZ_FRAMEWORK));
        if (TextUtils.isEmpty(str) && Runtime.isRunningOnQuinox(context)) {
            str = new String(FileUtil.getAssetsData(Runtime.getResourcesByBundleName(BUNDLE_NAME_BIOMETRIC), ASSETS_NAME_ZOLOZ_FRAMEWORK));
        }
        if (!TextUtils.isEmpty(str)) {
            return (FrameworkDesc) JSON.parseObject(str, FrameworkDesc.class);
        }
        throw new BioIllegalArgumentException("Failed to read 'zoloz_bio_framework.json', bio module can't work.");
    }
}
