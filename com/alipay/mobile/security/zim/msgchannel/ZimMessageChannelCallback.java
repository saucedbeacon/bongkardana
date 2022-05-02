package com.alipay.mobile.security.zim.msgchannel;

import android.os.Bundle;

public interface ZimMessageChannelCallback {
    public static final int RPC_FAIL = 2006;
    public static final int RPC_RETRY = 3000;
    public static final int RPC_SUCCESS = 1000;

    void onResult(Bundle bundle);
}
