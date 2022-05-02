package com.alibaba.griver.api.ui.optionmenu;

import android.content.Context;
import com.alibaba.griver.api.common.GriverEvent;

public interface GriverOptionMenuEvent extends GriverEvent {
    ToolbarMenuOption defaultToolbarMenus(String str);

    boolean interceptH5OptionMenuClick(Context context, String str, ToolbarMenuClickListener toolbarMenuClickListener);

    void optionMenuClicked(String str, String str2, int i);

    OptionMenu showOptionMenu(String str, String str2);

    void toolbarMenuClicked(String str, ToolbarMenu toolbarMenu);

    void toolbarMenusUpdated(String str, ToolbarMenuOption toolbarMenuOption);
}
