package com.alibaba.ariver.kernel.api.extension.registry;

public class EmbedViewMetaInfo {
    public String bundleName;
    public String clazzName;

    public EmbedViewMetaInfo(String str, String str2) {
        this.bundleName = str;
        this.clazzName = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmbedViewMetaInfo{bundleName='");
        sb.append(this.bundleName);
        sb.append('\'');
        sb.append(", clazzName='");
        sb.append(this.clazzName);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
