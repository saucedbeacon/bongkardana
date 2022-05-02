package com.zoloz.rpccommon;

import java.util.HashMap;

public interface LogInterceptor {
    void addEvent(String str, HashMap<String, String> hashMap);
}
