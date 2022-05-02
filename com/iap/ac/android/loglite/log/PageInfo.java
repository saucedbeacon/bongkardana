package com.iap.ac.android.loglite.log;

public class PageInfo {
    public boolean isEnd = false;
    public String pageId;
    public long pageStartTime10;
    public String pageStartTime64;
    public long pageStayTime;
    public String refer;
    public PageInfo referPageInfo;
    public String spm;

    public static PageInfo clonePageInfo(PageInfo pageInfo) {
        PageInfo pageInfo2 = new PageInfo();
        pageInfo2.pageStartTime10 = pageInfo.pageStartTime10;
        pageInfo2.pageStartTime64 = pageInfo.pageStartTime64;
        pageInfo2.pageId = pageInfo.pageId;
        pageInfo2.pageStayTime = pageInfo.pageStayTime;
        pageInfo2.spm = pageInfo.spm;
        pageInfo2.refer = pageInfo.refer;
        pageInfo2.isEnd = pageInfo.isEnd;
        pageInfo2.referPageInfo = pageInfo.referPageInfo;
        return pageInfo2;
    }

    public String getRefer() {
        if (this.referPageInfo == null) {
            return "first";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.referPageInfo.spm);
        sb.append("|");
        sb.append(this.referPageInfo.pageId);
        return sb.toString();
    }
}
