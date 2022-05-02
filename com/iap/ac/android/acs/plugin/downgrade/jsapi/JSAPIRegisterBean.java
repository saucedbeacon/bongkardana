package com.iap.ac.android.acs.plugin.downgrade.jsapi;

import androidx.annotation.NonNull;
import java.util.List;

public class JSAPIRegisterBean {
    public static final String BLACK_LIST = "BLACK_LIST";
    public static final String NOT_CONFIG = "NOT_CONFIG";
    public static final String WHITE_LIST = "WHITE_LIST";
    @NonNull
    public List<String> registerList;
    @NonNull
    public String tag;

    public JSAPIRegisterBean(@NonNull String str, @NonNull List<String> list) {
        this.tag = str;
        this.registerList = list;
    }
}
