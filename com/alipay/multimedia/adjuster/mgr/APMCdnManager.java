package com.alipay.multimedia.adjuster.mgr;

import android.text.TextUtils;
import com.alipay.multimedia.adjuster.adapter.APMOssAdapter;
import com.alipay.multimedia.adjuster.adapter.APMTfsAdapter;
import com.alipay.multimedia.adjuster.adapter.ICdnAdapter;
import com.alipay.multimedia.adjuster.api.data.IConfig;
import com.alipay.multimedia.adjuster.api.data.ITraceId;
import com.alipay.multimedia.adjuster.builder.UriBuilder;
import com.alipay.multimedia.adjuster.config.ConfigMgr;
import com.alipay.multimedia.adjuster.config.HostItem;
import com.alipay.multimedia.adjuster.data.APMImageInfo;
import com.alipay.multimedia.adjuster.data.UrlInfo;
import com.alipay.multimedia.adjuster.utils.AliCdnUtils;
import com.alipay.multimedia.adjuster.utils.Log;
import java.util.ArrayList;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class APMCdnManager {
    private static final Log logger = Log.getLogger("APMCdnManager");
    private static APMCdnManager mInstance;
    private APMOssAdapter mOssAdapter;
    private APMTfsAdapter mTfsAdapter;

    private APMCdnManager() {
        this.mOssAdapter = null;
        this.mTfsAdapter = null;
        this.mOssAdapter = new APMOssAdapter();
        this.mTfsAdapter = new APMTfsAdapter();
    }

    public static APMCdnManager getIns() {
        if (mInstance == null) {
            synchronized (APMCdnManager.class) {
                if (mInstance == null) {
                    mInstance = new APMCdnManager();
                }
            }
        }
        return mInstance;
    }

    public void registerConfig(IConfig iConfig) {
        ConfigMgr.getInc().registerConfig(iConfig);
    }

    public void registerITraceId(ITraceId iTraceId) {
        UriBuilder.registerITraceId(iTraceId);
    }

    private ICdnAdapter getAdapter(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(646584602, oncanceled);
            onCancelLoad.getMin(646584602, oncanceled);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.mOssAdapter.canExecAdapterForUrl(str)) {
            return this.mOssAdapter;
        }
        if (this.mTfsAdapter.canExecAdapterForUrl(str)) {
            return this.mTfsAdapter;
        }
        return null;
    }

    public boolean canExecAdapterForUrl(String str) {
        return getAdapter(str) != null;
    }

    private boolean supportCdnRuleForURL(String str, UrlInfo.Size size, APMImageInfo.CutType cutType, ICdnAdapter iCdnAdapter) {
        if (iCdnAdapter == null || iCdnAdapter.hasNotSupportCdnRule(str, size, cutType) || str.contains("%")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ca A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0158 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016e A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0192 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0193 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String parseImageUrlForAliCdn(java.lang.String r18, com.alipay.multimedia.adjuster.data.APMImageInfo.Format r19, com.alipay.multimedia.adjuster.data.UrlInfo.Size r20, com.alipay.multimedia.adjuster.data.UrlInfo.Size r21, com.alipay.multimedia.adjuster.data.APMImageInfo.CutType r22) {
        /*
            r17 = this;
            r10 = r18
            r0 = r20
            r1 = r21
            r4 = r22
            r11 = 0
            com.alipay.multimedia.adjuster.adapter.ICdnAdapter r2 = r17.getAdapter(r18)     // Catch:{ Exception -> 0x0196 }
            r12 = r17
            boolean r3 = r12.supportCdnRuleForURL(r10, r0, r4, r2)     // Catch:{ Exception -> 0x0194 }
            if (r3 != 0) goto L_0x0016
            return r10
        L_0x0016:
            android.net.Uri r3 = android.net.Uri.parse(r18)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r5 = r3.getPath()     // Catch:{ Exception -> 0x0194 }
            java.lang.String r6 = r3.getHost()     // Catch:{ Exception -> 0x0194 }
            java.lang.String r7 = "ossgw.alicdn.com"
            boolean r6 = r6.contains(r7)     // Catch:{ Exception -> 0x0194 }
            r7 = 6
            r8 = 8
            if (r6 != 0) goto L_0x005b
            java.lang.String r6 = "_sum.jpg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ Exception -> 0x0194 }
            if (r6 == 0) goto L_0x0041
            int r6 = r5.length()     // Catch:{ Exception -> 0x0194 }
            int r6 = r6 - r8
            java.lang.String r5 = r5.substring(r11, r6)     // Catch:{ Exception -> 0x0194 }
            r7 = 8
            goto L_0x005c
        L_0x0041:
            java.lang.String r6 = "_m.jpg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ Exception -> 0x0194 }
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = "_b.jpg"
            boolean r6 = r5.endsWith(r6)     // Catch:{ Exception -> 0x0194 }
            if (r6 == 0) goto L_0x005b
        L_0x0051:
            int r6 = r5.length()     // Catch:{ Exception -> 0x0194 }
            int r6 = r6 - r7
            java.lang.String r5 = r5.substring(r11, r6)     // Catch:{ Exception -> 0x0194 }
            goto L_0x005c
        L_0x005b:
            r7 = 0
        L_0x005c:
            java.lang.String r6 = "%s//%s%s%s"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0194 }
            java.lang.String r9 = r3.getScheme()     // Catch:{ Exception -> 0x0194 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0194 }
            r13 = 1
            java.lang.String r14 = ""
            if (r9 != 0) goto L_0x007d
            java.lang.String r9 = "%s:"
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0194 }
            java.lang.String r16 = r3.getScheme()     // Catch:{ Exception -> 0x0194 }
            r15[r11] = r16     // Catch:{ Exception -> 0x0194 }
            java.lang.String r9 = java.lang.String.format(r9, r15)     // Catch:{ Exception -> 0x0194 }
            goto L_0x007e
        L_0x007d:
            r9 = r14
        L_0x007e:
            r8[r11] = r9     // Catch:{ Exception -> 0x0194 }
            java.lang.String r9 = r3.getHost()     // Catch:{ Exception -> 0x0194 }
            r8[r13] = r9     // Catch:{ Exception -> 0x0194 }
            r9 = 2
            int r15 = r3.getPort()     // Catch:{ Exception -> 0x0194 }
            if (r15 <= 0) goto L_0x00a0
            java.lang.String r15 = ":%d"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0194 }
            int r3 = r3.getPort()     // Catch:{ Exception -> 0x0194 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0194 }
            r13[r11] = r3     // Catch:{ Exception -> 0x0194 }
            java.lang.String r3 = java.lang.String.format(r15, r13)     // Catch:{ Exception -> 0x0194 }
            goto L_0x00a1
        L_0x00a0:
            r3 = r14
        L_0x00a1:
            r8[r9] = r3     // Catch:{ Exception -> 0x0194 }
            r3 = 3
            r8[r3] = r5     // Catch:{ Exception -> 0x0194 }
            java.lang.String r3 = java.lang.String.format(r6, r8)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r5 = "UTF8"
            java.lang.String r5 = com.alipay.multimedia.adjuster.utils.AliCdnUtils.getUrlDecoderString(r10, r5)     // Catch:{ Exception -> 0x0194 }
            int r6 = r5.length()     // Catch:{ Exception -> 0x0194 }
            int r8 = r3.length()     // Catch:{ Exception -> 0x0194 }
            int r8 = r8 + r7
            if (r6 <= r8) goto L_0x00c8
            int r6 = r3.length()     // Catch:{ Exception -> 0x0194 }
            int r6 = r6 + r7
            int r8 = r5.length()     // Catch:{ Exception -> 0x0194 }
            java.lang.String r14 = r5.substring(r6, r8)     // Catch:{ Exception -> 0x0194 }
        L_0x00c8:
            if (r7 <= 0) goto L_0x00cc
            r5 = r3
            goto L_0x00cd
        L_0x00cc:
            r5 = r10
        L_0x00cd:
            com.alipay.multimedia.adjuster.data.UrlInfo r6 = r2.getBaseUrlAndImageSize(r3)     // Catch:{ Exception -> 0x0194 }
            r7 = 0
            if (r6 == 0) goto L_0x00e1
            java.lang.String r3 = r6.baseUrl     // Catch:{ Exception -> 0x0194 }
            boolean r8 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0194 }
            if (r8 == 0) goto L_0x00dd
            return r5
        L_0x00dd:
            com.alipay.multimedia.adjuster.data.UrlInfo$Size r6 = r6.originSize     // Catch:{ Exception -> 0x0194 }
            r13 = r3
            goto L_0x00e3
        L_0x00e1:
            r13 = r3
            r6 = r7
        L_0x00e3:
            if (r0 == 0) goto L_0x00f7
            int r3 = r0.mWidth     // Catch:{ Exception -> 0x0194 }
            if (r3 <= 0) goto L_0x00f7
            int r3 = r0.mHeight     // Catch:{ Exception -> 0x0194 }
            if (r3 <= 0) goto L_0x00f7
            com.alipay.multimedia.adjuster.data.UrlInfo$Size r1 = new com.alipay.multimedia.adjuster.data.UrlInfo$Size     // Catch:{ Exception -> 0x0194 }
            r1.<init>(r11, r11)     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.data.UrlInfo$Size r0 = r2.adjustImageSize(r5, r0, r1, r4)     // Catch:{ Exception -> 0x0194 }
            goto L_0x012e
        L_0x00f7:
            if (r6 == 0) goto L_0x0106
            int r3 = r6.mWidth     // Catch:{ Exception -> 0x0194 }
            if (r3 <= 0) goto L_0x0106
            int r3 = r6.mHeight     // Catch:{ Exception -> 0x0194 }
            if (r3 <= 0) goto L_0x0106
            com.alipay.multimedia.adjuster.data.UrlInfo$Size r0 = r2.adjustImageSize(r5, r6, r1, r4)     // Catch:{ Exception -> 0x0194 }
            goto L_0x012e
        L_0x0106:
            if (r1 == 0) goto L_0x012e
            int r3 = r1.mWidth     // Catch:{ Exception -> 0x0194 }
            if (r3 <= 0) goto L_0x012e
            int r3 = r1.mHeight     // Catch:{ Exception -> 0x0194 }
            if (r3 <= 0) goto L_0x012e
            com.alipay.multimedia.adjuster.data.UrlInfo$Size r0 = new com.alipay.multimedia.adjuster.data.UrlInfo$Size     // Catch:{ Exception -> 0x0194 }
            int r3 = r1.mWidth     // Catch:{ Exception -> 0x0194 }
            int r6 = com.alipay.multimedia.adjuster.utils.AliCdnUtils.getScreenScale()     // Catch:{ Exception -> 0x0194 }
            int r3 = r3 * r6
            int r1 = r1.mHeight     // Catch:{ Exception -> 0x0194 }
            int r6 = com.alipay.multimedia.adjuster.utils.AliCdnUtils.getScreenScale()     // Catch:{ Exception -> 0x0194 }
            int r1 = r1 * r6
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.data.UrlInfo$Size r1 = new com.alipay.multimedia.adjuster.data.UrlInfo$Size     // Catch:{ Exception -> 0x0194 }
            r1.<init>(r11, r11)     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.data.UrlInfo$Size r0 = r2.adjustImageSize(r5, r0, r1, r4)     // Catch:{ Exception -> 0x0194 }
        L_0x012e:
            com.alipay.multimedia.adjuster.config.ConfigMgr r1 = com.alipay.multimedia.adjuster.config.ConfigMgr.getInc()     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.config.CdnConfigItem r1 = r1.getCdnConfigItem()     // Catch:{ Exception -> 0x0194 }
            int r5 = r1.mQuality     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.config.ConfigMgr r1 = com.alipay.multimedia.adjuster.config.ConfigMgr.getInc()     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.config.CdnConfigItem r1 = r1.getCdnConfigItem()     // Catch:{ Exception -> 0x0194 }
            int r8 = r1.mSharpValue     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.config.ConfigMgr r1 = com.alipay.multimedia.adjuster.config.ConfigMgr.getInc()     // Catch:{ Exception -> 0x0194 }
            com.alipay.multimedia.adjuster.config.CdnConfigItem r1 = r1.getCdnConfigItem()     // Catch:{ Exception -> 0x0194 }
            boolean r1 = r1.isSupportWebp()     // Catch:{ Exception -> 0x0194 }
            if (r1 != 0) goto L_0x0158
            com.alipay.multimedia.adjuster.data.APMImageInfo$Format r1 = com.alipay.multimedia.adjuster.data.APMImageInfo.Format.FORMAT_WEBP     // Catch:{ Exception -> 0x0194 }
            r3 = r19
            if (r3 != r1) goto L_0x015a
            r3 = r7
            goto L_0x015a
        L_0x0158:
            r3 = r19
        L_0x015a:
            int r6 = r0.mWidth     // Catch:{ Exception -> 0x0194 }
            int r7 = r0.mHeight     // Catch:{ Exception -> 0x0194 }
            r9 = 0
            r1 = r2
            r2 = r18
            r4 = r22
            java.lang.String r0 = r1.adapterCdnZoomResult(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0194 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0194 }
            if (r1 != 0) goto L_0x017d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194 }
            r1.<init>()     // Catch:{ Exception -> 0x0194 }
            r1.append(r13)     // Catch:{ Exception -> 0x0194 }
            r1.append(r0)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r13 = r1.toString()     // Catch:{ Exception -> 0x0194 }
        L_0x017d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194 }
            r0.<init>()     // Catch:{ Exception -> 0x0194 }
            r0.append(r13)     // Catch:{ Exception -> 0x0194 }
            r0.append(r14)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0194 }
            boolean r1 = com.alipay.multimedia.adjuster.utils.AliCdnUtils.checkUrl(r0)     // Catch:{ Exception -> 0x0194 }
            if (r1 == 0) goto L_0x0193
            return r0
        L_0x0193:
            return r10
        L_0x0194:
            r0 = move-exception
            goto L_0x0199
        L_0x0196:
            r0 = move-exception
            r12 = r17
        L_0x0199:
            com.alipay.multimedia.adjuster.utils.Log r1 = logger
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r3 = "parseImageUrlForAliCdn exp"
            r1.e(r0, r3, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.multimedia.adjuster.mgr.APMCdnManager.parseImageUrlForAliCdn(java.lang.String, com.alipay.multimedia.adjuster.data.APMImageInfo$Format, com.alipay.multimedia.adjuster.data.UrlInfo$Size, com.alipay.multimedia.adjuster.data.UrlInfo$Size, com.alipay.multimedia.adjuster.data.APMImageInfo$CutType):java.lang.String");
    }

    public ArrayList<String> buildHighAvailabilityUrls(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            HostItem checkHighAvailability = checkHighAvailability(str, str2);
            if (checkHighAvailability == null || !checkHighAvailability.checkPercent()) {
                arrayList.add(str);
                return arrayList;
            }
            String buildAftsFilecCdnUrl = checkHighAvailability.checkGraySwitch(AliCdnUtils.generateRandom(0, 100)) ? UriBuilder.buildAftsFilecCdnUrl(str, str2, z) : str;
            String buildAftsFileMasterUrl = UriBuilder.buildAftsFileMasterUrl(str, str2, z);
            if (!TextUtils.isEmpty(buildAftsFilecCdnUrl)) {
                arrayList.add(buildAftsFilecCdnUrl);
            }
            if (!TextUtils.isEmpty(buildAftsFileMasterUrl)) {
                arrayList.add(buildAftsFileMasterUrl);
            }
            return arrayList;
        } catch (Exception e) {
            arrayList.clear();
            arrayList.add(str);
            logger.e(e, "buildHighAvailabilityUrls exp", new Object[0]);
        }
    }

    private HostItem checkHighAvailability(String str, String str2) {
        return ConfigMgr.getInc().getCdnConfigItem().checkHighAvailability(str, str2);
    }
}
