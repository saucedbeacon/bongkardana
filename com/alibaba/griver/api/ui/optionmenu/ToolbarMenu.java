package com.alibaba.griver.api.ui.optionmenu;

import java.io.Serializable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ToolbarMenu implements Serializable {
    private String icon;
    private String name;
    private String redDot;
    private String tag;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getRedDot() {
        return this.redDot;
    }

    public void setRedDot(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1458051982, oncanceled);
            onCancelLoad.getMin(-1458051982, oncanceled);
        }
        this.redDot = str;
    }
}
