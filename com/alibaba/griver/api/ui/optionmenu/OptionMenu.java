package com.alibaba.griver.api.ui.optionmenu;

import com.alibaba.fastjson.JSONArray;
import java.io.Serializable;

public class OptionMenu implements Serializable {
    private String bizType;
    private String color;
    private String icon;
    private String icontype;
    private JSONArray menus;
    private boolean override;
    private String redDot;
    private boolean reset;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
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
        this.redDot = str;
    }

    public boolean isReset() {
        return this.reset;
    }

    public void setReset(boolean z) {
        this.reset = z;
    }

    public boolean isOverride() {
        return this.override;
    }

    public void setOverride(boolean z) {
        this.override = z;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public JSONArray getMenus() {
        return this.menus;
    }

    public void setMenus(JSONArray jSONArray) {
        this.menus = jSONArray;
    }

    public String getIcontype() {
        return this.icontype;
    }

    public void setIcontype(String str) {
        this.icontype = str;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }
}
