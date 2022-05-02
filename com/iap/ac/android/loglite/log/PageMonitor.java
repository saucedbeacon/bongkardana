package com.iap.ac.android.loglite.log;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.log.spm.SpmTrackIntegrator;
import com.iap.ac.android.loglite.a.a;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import com.iap.ac.android.loglite.utils.PageUtil;
import java.util.HashMap;
import java.util.Map;

public class PageMonitor {
    public static PageMonitor c;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, PageInfo> f11057a = new HashMap();
    public PageInfo b;

    public static PageMonitor a() {
        if (c == null) {
            c = new PageMonitor();
        }
        return c;
    }

    public void a(Object obj) {
        if (obj != null) {
            String a2 = PageUtil.a(obj);
            if (this.f11057a.get(a2) != null) {
                this.f11057a.remove(a2);
            }
        }
    }

    public void a(Object obj, String str) {
        if (obj == null || TextUtils.isEmpty(str)) {
            LoggerWrapper.i("PageMonitor", "Start_view is null or spm is null");
            return;
        }
        String a2 = PageUtil.a(obj);
        PageInfo pageInfo = this.f11057a.get(a2);
        if (pageInfo == null || pageInfo.isEnd) {
            PageInfo pageInfo2 = this.f11057a.get(a2);
            if (pageInfo2 == null) {
                pageInfo2 = new PageInfo();
                PageInfo pageInfo3 = this.b;
                if (pageInfo3 != null) {
                    pageInfo2.referPageInfo = PageInfo.clonePageInfo(pageInfo3);
                }
            }
            PageInfo pageInfo4 = pageInfo2;
            pageInfo4.isEnd = false;
            long serverTime = LoggingUtil.getServerTime();
            pageInfo4.pageStartTime10 = serverTime;
            int pow = (int) Math.pow(2.0d, 6.0d);
            char[] cArr = new char[pow];
            int i = pow;
            do {
                i--;
                cArr[i] = PageUtil.f11059a[(int) (63 & serverTime)];
                serverTime >>>= 6;
            } while (serverTime != 0);
            pageInfo4.pageStartTime64 = new String(cArr, i, pow - i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(SpmTrackIntegrator.SEPARATOR_CHAR);
            sb.append(AnalyticsContext.getInstance().getInstanceId());
            sb.append(SpmTrackIntegrator.SEPARATOR_CHAR);
            sb.append(pageInfo4.pageStartTime64);
            sb.append("_");
            pageInfo4.pageId = sb.toString();
            pageInfo4.spm = str;
            this.f11057a.put(a2, pageInfo4);
            this.b = pageInfo4;
            return;
        }
        LoggerWrapper.i("PageMonitor", "Start_not call end,and start twice,update spm");
        if (TextUtils.isEmpty(str)) {
            LoggerWrapper.i("PageMonitor", "updateLastInfoSpm spm or lastInfo is null");
        } else {
            pageInfo.spm = str;
        }
    }

    public final void a(Object obj, String str, String str2, String str3, Map<String, String> map) {
        if (obj == null || TextUtils.isEmpty(str)) {
            LoggerWrapper.i("PageMonitor", "End_View is null or spm is null");
            return;
        }
        PageInfo pageInfo = this.f11057a.get(PageUtil.a(obj));
        if (pageInfo == null) {
            LoggerWrapper.i("PageMonitor", "End_pageInfo is null");
        } else if (pageInfo.isEnd) {
            LoggerWrapper.i("PageMonitor", "is already call pageEnd");
        } else {
            pageInfo.isEnd = true;
            a aVar = new a(str, map);
            aVar.i = pageInfo.getRefer();
            aVar.h = LoggingUtil.getServerTime() - pageInfo.pageStartTime10;
            aVar.j = pageInfo.pageId;
            aVar.k = pageInfo.pageStartTime64;
            if (!TextUtils.isEmpty(str3)) {
                aVar.e = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                aVar.c = str2;
            }
            AnalyticsContext.getInstance().getStorageManager().a((LogEvent) aVar);
        }
    }
}
