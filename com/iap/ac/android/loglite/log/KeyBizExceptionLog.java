package com.iap.ac.android.loglite.log;

import com.alipay.iap.android.aplog.api.LogCategory;
import java.util.Map;

public class KeyBizExceptionLog extends PerformanceLog {
    public KeyBizExceptionLog(String str, Map<String, String> map) {
        super(str, map);
    }

    public String e() {
        return LogCategory.LOG_CATEGORY_HIGHAVAIL;
    }

    public String h() {
        return "keybiztrace";
    }
}
