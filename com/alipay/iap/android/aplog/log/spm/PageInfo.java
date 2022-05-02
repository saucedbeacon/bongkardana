package com.alipay.iap.android.aplog.log.spm;

public class PageInfo {
    public String className;
    public boolean isEnd = false;
    public String lastClickSem;
    public String lastClickSpm;
    public String miniPageId;
    public boolean needRpc = true;
    public String p_pre;
    public String p_pre2;
    public String p_root;
    public boolean pageBack;
    public String pageId;
    public boolean pageRepeat;
    public long pageStartTime10;
    public String pageStartTime64;
    public long pageStayTime;
    public String refer;
    public String referClickSpm;
    public PageInfo referPageInfo;
    public String spm;
    public String spmStatus = "0";
    public String srcSpm;

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

    public static PageInfo clonePageInfo(PageInfo pageInfo) {
        PageInfo pageInfo2 = new PageInfo();
        pageInfo2.pageStartTime10 = pageInfo.pageStartTime10;
        pageInfo2.pageStartTime64 = pageInfo.pageStartTime64;
        pageInfo2.pageId = pageInfo.pageId;
        pageInfo2.pageStayTime = pageInfo.pageStayTime;
        pageInfo2.spm = pageInfo.spm;
        pageInfo2.refer = pageInfo.refer;
        pageInfo2.isEnd = pageInfo.isEnd;
        pageInfo2.spmStatus = pageInfo.spmStatus;
        pageInfo2.miniPageId = pageInfo.miniPageId;
        pageInfo2.needRpc = pageInfo.needRpc;
        pageInfo2.referClickSpm = pageInfo.referClickSpm;
        pageInfo2.className = pageInfo.className;
        pageInfo2.srcSpm = pageInfo.srcSpm;
        pageInfo2.lastClickSpm = pageInfo.lastClickSpm;
        pageInfo2.lastClickSem = pageInfo.lastClickSem;
        pageInfo2.referPageInfo = pageInfo.referPageInfo;
        pageInfo2.p_root = pageInfo.p_root;
        pageInfo2.p_pre = pageInfo.p_pre;
        pageInfo2.p_pre2 = pageInfo.p_pre2;
        pageInfo2.pageRepeat = pageInfo.pageRepeat;
        pageInfo2.pageBack = pageInfo.pageBack;
        return pageInfo2;
    }
}
