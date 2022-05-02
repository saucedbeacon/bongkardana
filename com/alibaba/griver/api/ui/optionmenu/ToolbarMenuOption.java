package com.alibaba.griver.api.ui.optionmenu;

import java.io.Serializable;
import java.util.List;

public class ToolbarMenuOption implements Serializable {
    private boolean override;
    private boolean reset;
    private List<ToolbarMenu> toolbarMenus;

    public List<ToolbarMenu> getToolbarMenus() {
        return this.toolbarMenus;
    }

    public void setToolbarMenus(List<ToolbarMenu> list) {
        this.toolbarMenus = list;
    }

    public boolean isOverride() {
        return this.override;
    }

    public void setOverride(boolean z) {
        this.override = z;
    }

    public boolean isReset() {
        return this.reset;
    }

    public void setReset(boolean z) {
        this.reset = z;
    }
}
