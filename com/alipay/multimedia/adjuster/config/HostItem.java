package com.alipay.multimedia.adjuster.config;

import com.alibaba.fastjson.annotation.JSONField;

public class HostItem {
    @JSONField(name = "gp")
    public int grayPercent = 0;
    @JSONField(name = "hs")
    public String host = "";

    public HostItem() {
    }

    public HostItem(String str, int i) {
        this.host = str;
        this.grayPercent = i;
    }

    public boolean checkPercent() {
        int i = this.grayPercent;
        return i > 0 && i <= 100;
    }

    public boolean checkGraySwitch(int i) {
        return i > 0 && i <= this.grayPercent;
    }
}
