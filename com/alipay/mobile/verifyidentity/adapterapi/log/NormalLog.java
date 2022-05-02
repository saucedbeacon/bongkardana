package com.alipay.mobile.verifyidentity.adapterapi.log;

import android.util.Log;

public class NormalLog implements ILog {
    public int v(String str, String str2) {
        return Log.v(str, str2);
    }

    public int d(String str, String str2) {
        return Log.d(str, str2);
    }

    public int i(String str, String str2) {
        return Log.i(str, str2);
    }

    public int w(String str, String str2) {
        return Log.w(str, str2);
    }

    public int e(String str, String str2) {
        return Log.e(str, str2);
    }
}
