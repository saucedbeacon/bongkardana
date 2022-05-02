package com.alipay.alipaysecuritysdk.apdid.rpc.service;

import com.alipay.c.a.a.a.a;

public interface BugTrackMessageService {
    @a(a = "alipay.security.errorLog.collect")
    String logCollect(String str);
}
