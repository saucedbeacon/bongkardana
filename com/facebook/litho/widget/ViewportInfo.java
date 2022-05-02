package com.facebook.litho.widget;

public interface ViewportInfo {

    public @interface State {
        public static final int DATA_CHANGES = 1;
        public static final int SCROLLING = 0;
    }
}
