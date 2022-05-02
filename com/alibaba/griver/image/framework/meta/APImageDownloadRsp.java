package com.alibaba.griver.image.framework.meta;

public class APImageDownloadRsp {
    public static final int FROM_DISK_CACHE = 1;
    public static final int FROM_LOCAL = 2;
    public static final int FROM_MEM = 0;
    public static final int FROM_NET = 3;
    public static final int FROM_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    private APImageRetMsg f10472a;
    private String b;
    private String c;
    private String d;
    public byte[] imageData;
    public int loadFrom = -1;
    public APImageRetMsg originalRetMsg;

    public APImageRetMsg getRetmsg() {
        return this.f10472a;
    }

    public void setRetmsg(APImageRetMsg aPImageRetMsg) {
        this.f10472a = aPImageRetMsg;
    }

    public String getSourcePath() {
        return this.b;
    }

    public void setSourcePath(String str) {
        this.b = str;
    }

    public String getCacheId() {
        return this.c;
    }

    public void setCacheId(String str) {
        this.c = str;
    }

    public String getStoreFilePath() {
        return this.d;
    }

    public void setStoreFilePath(String str) {
        this.d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("APImageDownloadRsp{retmsg=");
        sb.append(this.f10472a);
        sb.append(", sourcePath='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", cacheId='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", storeFilePath='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", originalRetMsg=");
        sb.append(this.originalRetMsg);
        sb.append(", imageData=");
        sb.append(this.imageData);
        sb.append(", loadFrom=");
        sb.append(this.loadFrom);
        sb.append('}');
        return sb.toString();
    }
}
