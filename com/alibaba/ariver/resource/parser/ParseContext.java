package com.alibaba.ariver.resource.parser;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import java.util.List;
import java.util.regex.Pattern;

@Keep
public class ParseContext {
    public String appId;
    public boolean fromCache = false;
    @Nullable
    public List<Pattern> ignorePatterns;
    public String mainFileName;
    public boolean needCache = false;
    public boolean needVerify = true;
    @Nullable
    public String onlineHost;
    public String packagePath;
    public String templateAppId;

    public void adaptAppModel(AppModel appModel) {
        if (appModel != null && appModel.getAppInfoModel() != null) {
            this.appId = appModel.getAppId();
            this.onlineHost = appModel.getAppInfoModel().getVhost();
            TemplateConfigModel templateConfig = appModel.getAppInfoModel().getTemplateConfig();
            if (templateConfig != null && templateConfig.isTemplateValid()) {
                StringBuilder sb = new StringBuilder();
                sb.append(templateConfig.getTemplateId());
                sb.append(".tar");
                this.mainFileName = sb.toString();
                this.templateAppId = templateConfig.getTemplateId();
                StringBuilder sb2 = new StringBuilder("change mainFile name to template file: ");
                sb2.append(this.mainFileName);
                RVLogger.d(RVConstants.RESOURCE_TAG, sb2.toString());
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParseContext{packagePath='");
        sb.append(this.packagePath);
        sb.append('\'');
        sb.append(", mainFileName='");
        sb.append(this.mainFileName);
        sb.append('\'');
        sb.append(", appId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(", onlineHost='");
        sb.append(this.onlineHost);
        sb.append('\'');
        sb.append(", templateAppId='");
        sb.append(this.templateAppId);
        sb.append('\'');
        sb.append(", ignorePatterns=");
        sb.append(this.ignorePatterns);
        sb.append('}');
        return sb.toString();
    }
}
