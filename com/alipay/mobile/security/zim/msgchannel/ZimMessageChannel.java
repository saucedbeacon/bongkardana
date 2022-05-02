package com.alipay.mobile.security.zim.msgchannel;

import android.os.Bundle;

public interface ZimMessageChannel {
    public static final String K_RPC_REQ = "requestData";
    public static final String K_RPC_RES = "responseData";
    public static final String K_RPC_RES_CODE = "responseCode";

    void onAction(Bundle bundle, ZimMessageChannelCallback zimMessageChannelCallback);
}
