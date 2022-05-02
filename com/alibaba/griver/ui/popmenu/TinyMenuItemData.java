package com.alibaba.griver.ui.popmenu;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.alibaba.griver.api.common.menu.OnMenuItemClickListener;

public class TinyMenuItemData {
    public String action;
    public int badgeType;
    public String callback;
    public Drawable h5MenuIcon;
    public String iconUrl;
    public long latestMsgTime = -1;
    public OnMenuItemClickListener listener;
    public String menuName;
    public int messageCount;
    public String mid;
    public String params;

    public TinyMenuItemData() {
    }

    public TinyMenuItemData(String str, String str2, String str3, String str4) {
        this.action = str;
        this.params = str2;
        this.callback = str3;
        this.mid = str4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TinyMenuItemData) {
            return TextUtils.equals(this.mid, ((TinyMenuItemData) obj).mid);
        }
        return false;
    }

    public int hashCode() {
        if (!TextUtils.isEmpty(this.mid)) {
            return this.mid.hashCode();
        }
        return 0;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getMessageCount() {
        return this.messageCount;
    }

    public String getAction() {
        return this.action;
    }

    public String getParams() {
        return this.params;
    }

    public String getCallback() {
        return this.callback;
    }

    public String getMid() {
        return this.mid;
    }
}
