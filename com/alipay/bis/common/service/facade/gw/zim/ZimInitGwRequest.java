package com.alipay.bis.common.service.facade.gw.zim;

public class ZimInitGwRequest {
    public String bizData;
    public String channel;
    public String merchant;
    public String metaInfo;
    public String produceNode;
    public String productName;
    public String zimId;

    public String toString() {
        StringBuilder sb = new StringBuilder("ZimInitGwRequest{zimId='");
        sb.append(this.zimId);
        sb.append('\'');
        sb.append(", channel='");
        sb.append(this.channel);
        sb.append('\'');
        sb.append(", merchant='");
        sb.append(this.merchant);
        sb.append('\'');
        sb.append(", productName='");
        sb.append(this.productName);
        sb.append('\'');
        sb.append(", produceNode='");
        sb.append(this.produceNode);
        sb.append('\'');
        sb.append(", bizData='");
        sb.append(this.bizData);
        sb.append('\'');
        sb.append(", metaInfo='");
        sb.append(this.metaInfo);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
