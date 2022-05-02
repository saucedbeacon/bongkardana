package com.alibaba.griver.api.ui.share;

public interface ShareResultListener {
    void cancel();

    void fail(String str, String str2, String str3);

    void success(String str);
}
