package com.alibaba.griver.core.jsapi.actionsheet;

import java.io.Serializable;

public class ActionSheetItem implements Serializable {
    public BadgeInfo badgeInfo;
    public String content;

    public static class BadgeInfo implements Serializable {
        public static final String TYPE_MORE = "more";
        public static final String TYPE_NONE = "none";
        public static final String TYPE_NUM = "num";
        public static final String TYPE_POINT = "point";
        public static final String TYPE_TEXT = "text";
        public String text;
        public String type;
    }
}
