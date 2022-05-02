package com.iap.ac.android.loglite.log;

import android.content.Context;
import android.os.Build;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.DeviceHWInfo;
import com.iap.ac.android.loglite.utils.DeviceUtil;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class AntEvent extends LogEvent {
    public Map<String, String> f;
    public Map<String, String> g;

    public AntEvent(String str, Map<String, String> map) {
        super(str, map);
        h();
        i();
    }

    public String d() {
        return "antEvent";
    }

    public String e() {
        Map<String, String> map = this.b;
        if (map == null || !map.containsKey("antLogCategory")) {
            return c();
        }
        return this.b.get("antLogCategory");
    }

    public String f() {
        AnalyticsContext instance = AnalyticsContext.getInstance();
        StringBuilder sb = new StringBuilder("D-AE");
        LoggingUtil.appendParam(sb, LoggingUtil.getNowTime());
        LoggingUtil.appendParam(sb, instance.getProductId());
        LoggingUtil.appendParam(sb, instance.getContextInfo().b);
        LoggingUtil.appendParam(sb, "2");
        instance.getContextInfo();
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, instance.getSessionId());
        LoggingUtil.appendParam(sb, g());
        LoggingUtil.appendParam(sb, Result.ERROR_CODE_UNKNOWN_ERROR);
        LoggingUtil.appendParam(sb, this.f9736a);
        LoggingUtil.appendParam(sb, c());
        LoggingUtil.appendParam(sb, "2");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "android");
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, BizCodeMatchUtils.a((Context) instance.getApplication()));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, instance.getInstanceId());
        LoggingUtil.appendParam(sb, Locale.getDefault().toString());
        LoggingUtil.appendParam(sb, Build.MANUFACTURER);
        LoggingUtil.appendParam(sb, LoggingUtil.getResolution());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, this.f);
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, b());
        LoggingUtil.appendExtParam(sb, instance.getExtraParamMap());
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendParam(sb, "-");
        LoggingUtil.appendExtParam(sb, a());
        LoggingUtil.appendExtParam(sb, this.g);
        LoggingUtil.appendParam(sb, "-");
        sb.append(MasLog.Constant.GAP);
        return sb.toString();
    }

    public final void h() {
        this.f = new HashMap();
        AnalyticsContext instance = AnalyticsContext.getInstance();
        this.f.put("NumCoresOfCPU", String.valueOf(DeviceHWInfo.a()));
        this.f.put("CPUMaxFreq", String.valueOf(DeviceUtil.a()));
        this.f.put("TotalMem", String.valueOf(DeviceUtil.a(instance.getApplication())));
        Map<String, String> map = this.f;
        instance.getApplication();
        synchronized (DeviceUtil.class) {
        }
        map.put("ANDROID_ID", "-");
    }

    public final void i() {
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        hashMap.put(H5GetLogInfoBridge.RESULT_TIMEZONE, TimeZone.getDefault().getID());
        this.g.put("OS", "android");
        this.g.put("TimeStamp", String.valueOf(System.currentTimeMillis()));
    }
}
