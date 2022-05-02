package com.alibaba.griver.base.nebula;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class H5ResourceCORSUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Pattern> f10233a = new ArrayList();

    static {
        a();
    }

    private static void a() {
        a(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("h5_CORSWhiteList", "", new RVConfigService.OnConfigChangeListener() {
            public final void onChange(String str) {
                H5ResourceCORSUtil.a(str);
            }
        }));
    }

    /* access modifiers changed from: private */
    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray parseArray = JSONUtils.parseArray(str);
                if (parseArray != null && parseArray.size() > 0) {
                    synchronized (f10233a) {
                        f10233a.clear();
                        int size = parseArray.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                Pattern compile = H5PatternHelper.compile(parseArray.getString(i));
                                if (compile != null) {
                                    f10233a.add(compile);
                                }
                            } catch (PatternSyntaxException e) {
                                RVLogger.e("H5ResourceCORSUtil", "pattern error", e);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                RVLogger.e("H5ResourceCORSUtil", "parse config error", th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003e, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean needAddHeader(java.lang.String r4) {
        /*
            r0 = 0
            java.util.List<java.util.regex.Pattern> r1 = f10233a     // Catch:{ all -> 0x003e }
            monitor-enter(r1)     // Catch:{ all -> 0x003e }
            java.util.List<java.util.regex.Pattern> r2 = f10233a     // Catch:{ all -> 0x003b }
            int r2 = r2.size()     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            return r0
        L_0x000e:
            android.net.Uri r4 = com.alibaba.griver.base.common.utils.H5UrlHelper.parseUrl(r4)     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x0039
            java.lang.String r4 = r4.getHost()     // Catch:{ all -> 0x003b }
            if (r4 == 0) goto L_0x0039
            java.util.List<java.util.regex.Pattern> r2 = f10233a     // Catch:{ all -> 0x003b }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x003b }
        L_0x0020:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x003b }
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3     // Catch:{ all -> 0x003b }
            java.util.regex.Matcher r3 = r3.matcher(r4)     // Catch:{ all -> 0x003b }
            boolean r3 = r3.find()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0020
            r4 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            return r4
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            return r0
        L_0x003b:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003e }
            throw r4     // Catch:{ all -> 0x003e }
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.nebula.H5ResourceCORSUtil.needAddHeader(java.lang.String):boolean");
    }

    public static String getCORSUrl(String str) {
        try {
            Uri parseUrl = H5UrlHelper.parseUrl(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parseUrl.getScheme());
            sb.append("://");
            sb.append(parseUrl.getHost());
            String obj = sb.toString();
            RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
            if ((rVConfigService != null && SummaryActivity.CHECKED.equalsIgnoreCase(rVConfigService.getConfigWithProcessCache("h5_getCORSUrlWithoutPort", ""))) || parseUrl.getPort() == -1) {
                return obj;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(":");
            sb2.append(parseUrl.getPort());
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
