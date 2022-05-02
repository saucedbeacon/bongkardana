package com.iap.ac.android.g;

import com.iap.ac.android.a.a;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.RegionCodeTypeMapConfig;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public List<RegionCodeTypeMapConfig> f9712a = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "getFirstCodeType error, invalid input, regionCode: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = r0.concat(r5)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "IAPConnect"
            com.iap.ac.android.common.log.ACLog.e(r0, r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r4)
            return r1
        L_0x0019:
            java.util.List<com.iap.ac.android.biz.common.model.remoteconfig.cpm.RegionCodeTypeMapConfig> r0 = r4.f9712a     // Catch:{ all -> 0x005c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005c }
        L_0x001f:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x005c }
            com.iap.ac.android.biz.common.model.remoteconfig.cpm.RegionCodeTypeMapConfig r2 = (com.iap.ac.android.biz.common.model.remoteconfig.cpm.RegionCodeTypeMapConfig) r2     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x001f
            java.lang.String r3 = r2.region     // Catch:{ all -> 0x005c }
            boolean r3 = android.text.TextUtils.equals(r5, r3)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x001f
            java.util.List<java.lang.String> r5 = r2.codeTypes     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0049
            int r5 = r5.size()     // Catch:{ all -> 0x005c }
            if (r5 <= 0) goto L_0x0049
            java.util.List<java.lang.String> r5 = r2.codeTypes     // Catch:{ all -> 0x005c }
            r0 = 0
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x005c }
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x005c }
        L_0x0049:
            monitor-exit(r4)
            return r1
        L_0x004b:
            java.lang.String r0 = "getFirstCodeType error with regionCode: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = r0.concat(r5)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "IAPConnect"
            com.iap.ac.android.common.log.ACLog.e(r0, r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r4)
            return r1
        L_0x005c:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0060
        L_0x005f:
            throw r5
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.g.b.a(java.lang.String):java.lang.String");
    }

    public synchronized boolean b(String str) {
        List<RegionCodeTypeMapConfig> list;
        try {
            list = Arrays.asList((RegionCodeTypeMapConfig[]) JsonUtils.fromJson(str, RegionCodeTypeMapConfig[].class));
        } catch (Throwable th) {
            a.a("parseRegionCodeTypeMapList exception: ", th, Constants.TAG);
            list = null;
        }
        if (list == null || list.size() <= 0) {
            ACLog.e(Constants.TAG, "RegionCodeTypeMapConfigModel parse error, invalid input");
            return false;
        }
        this.f9712a = list;
        StringBuilder a2 = a.a("RegionCodeTypeMapConfigModel parse finish, size: ");
        a2.append(this.f9712a.size());
        ACLog.i(Constants.TAG, a2.toString());
        if (this.f9712a.size() > 0) {
            return true;
        }
        return false;
    }

    public synchronized boolean a() {
        return this.f9712a.size() > 0;
    }
}
