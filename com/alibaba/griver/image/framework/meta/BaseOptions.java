package com.alibaba.griver.image.framework.meta;

public class BaseOptions {
    public boolean forceSystemDecode;
    public boolean ignoreGifAutoStart;
    public boolean ignoreNetTask;
    public boolean saveToDiskCache = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseOptions{ignoreNetTask=");
        sb.append(this.ignoreNetTask);
        sb.append(", ignoreGifAutoStart=");
        sb.append(this.ignoreGifAutoStart);
        sb.append(", forceSystemDecode=");
        sb.append(this.forceSystemDecode);
        sb.append(", saveDiskCache=");
        sb.append(this.saveToDiskCache);
        sb.append('}');
        return sb.toString();
    }
}
