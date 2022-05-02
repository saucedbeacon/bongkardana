package com.iap.ac.android.loglite.a;

import com.alipay.iap.android.aplog.api.LogCategory;
import com.iap.ac.android.loglite.log.BehaviorLog;
import java.util.Map;

public class a extends BehaviorLog {
    public long h;
    public String i;
    public String j;
    public String k;

    public a(String str, Map<String, String> map) {
        super(str, map);
    }

    public String i() {
        return LogCategory.LOG_SPM;
    }

    public String j() {
        return this.j;
    }

    public String k() {
        return String.valueOf(this.h);
    }

    public String l() {
        return this.k;
    }

    public String m() {
        return this.i;
    }

    public String n() {
        return String.valueOf(this.h);
    }
}
