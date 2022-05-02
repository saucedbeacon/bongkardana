package com.alibaba.griver.ui.ant.model;

import java.util.HashMap;

public class MessagePopItem {
    public String content;
    public HashMap<String, Object> externParam;
    public IconInfo icon;
    public String title;

    public MessagePopItem() {
    }

    public MessagePopItem(String str) {
        this.title = str;
    }
}
