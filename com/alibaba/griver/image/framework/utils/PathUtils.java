package com.alibaba.griver.image.framework.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.griver.image.framework.meta.Size;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.WheelView;
import com.alipay.multimedia.adjuster.utils.Scheme;
import com.alipay.multimedia.adjuster.utils.ZURLEncodedUtil;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.savings.activity.SavingsActivity;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

public class PathUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10486a;
    private static final int[] b = {16, 24, 32, 40, 50, 64, 72, 80, 90, 100, 110, 120, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, SavingsActivity.RV_BENEFIT_WIDTH, 150, BlobStatic.MONITOR_IMAGE_WIDTH, 170, 180, 190, 200, WheelView.DIVIDER_ALPHA, 240, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 270, 290, 300, SecExceptionCode.SEC_ERROR_STA_LOW_VERSION_DATA_FILE, 320, AUScreenAdaptTool.WIDTH_BASE, 375, 400, 430, 438, 460, 480, 500, 540, 560, 580, 600, 640, 670, 720, 760, 800, 960, 1024, 1136, APEncodeOptions.DEFAULT_MAX_LEN};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(File.separator);
        sb.append("[asset]");
        sb.append(File.separator);
        f10486a = sb.toString();
    }

    /* renamed from: com.alibaba.griver.image.framework.utils.PathUtils$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alipay.multimedia.adjuster.utils.Scheme[] r0 = com.alipay.multimedia.adjuster.utils.Scheme.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme = r0
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.FILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.HTTP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.HTTPS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.CONTENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.DRAWABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.ASSETS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.alipay.multimedia.adjuster.utils.Scheme r1 = com.alipay.multimedia.adjuster.utils.Scheme.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.utils.PathUtils.AnonymousClass1.<clinit>():void");
        }
    }

    public static String extractPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = AnonymousClass1.$SwitchMap$com$alipay$multimedia$adjuster$utils$Scheme[Scheme.ofUri(str).ordinal()];
        if (i == 1) {
            String crop = Scheme.FILE.crop(str);
            return (TextUtils.isEmpty(crop) || !crop.startsWith(f10486a)) ? crop : crop.substring(f10486a.length());
        } else if (i == 2 || i == 3) {
            return urlEncode(str);
        } else {
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File extractFile(java.lang.String r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L_0x002d
            android.net.Uri r0 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0027 }
            boolean r2 = isLocalFile(r0)     // Catch:{ Exception -> 0x0027 }
            if (r2 == 0) goto L_0x001b
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0027 }
            java.lang.String r2 = extractPath(r3)     // Catch:{ Exception -> 0x0027 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0027 }
            goto L_0x002e
        L_0x001b:
            boolean r0 = isHttp(r0)     // Catch:{ Exception -> 0x0027 }
            if (r0 != 0) goto L_0x002d
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0027 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0027 }
            goto L_0x002e
        L_0x0027:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x003d
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x003e
            boolean r3 = r0.isFile()
            if (r3 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = r0
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.utils.PathUtils.extractFile(java.lang.String):java.io.File");
    }

    public static boolean isLocalFile(Uri uri) {
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme()) && !hasHost(uri)) {
            return true;
        }
        return false;
    }

    public static boolean isHttp(Uri uri) {
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) && hasHost(uri)) {
            return true;
        }
        return false;
    }

    public static boolean hasHost(Uri uri) {
        String host = uri.getHost();
        return host != null && !"".equals(host);
    }

    public static Size getDjangoNearestImageSize(Size size) {
        int a2 = a(b, Math.max(size.getWidth(), size.getHeight()), false);
        int[] iArr = b;
        return new Size(iArr[a2], iArr[a2]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r5 = r0 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int[] r5, int r6, boolean r7) {
        /*
            int r0 = r5.length
            int r0 = r0 + -1
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 > r0) goto L_0x001a
            int r3 = r2 + r0
            int r3 = r3 / 2
            r4 = r5[r3]
            if (r6 != r4) goto L_0x0010
            return r3
        L_0x0010:
            r4 = r5[r3]
            if (r6 >= r4) goto L_0x0017
            int r0 = r3 + -1
            goto L_0x0005
        L_0x0017:
            int r2 = r3 + 1
            goto L_0x0005
        L_0x001a:
            if (r0 >= 0) goto L_0x001d
            return r1
        L_0x001d:
            if (r7 == 0) goto L_0x002c
            r7 = r5[r0]
            if (r6 <= r7) goto L_0x0035
            int r6 = r0 + 1
            int r5 = r5.length
            int r5 = r5 + -1
            if (r6 > r5) goto L_0x0035
            r0 = r6
            goto L_0x0035
        L_0x002c:
            r5 = r5[r0]
            if (r6 >= r5) goto L_0x0035
            int r5 = r0 + -1
            if (r5 < 0) goto L_0x0035
            r0 = r5
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.utils.PathUtils.a(int[], int, boolean):int");
    }

    public static String urlEncode(String str) {
        return ZURLEncodedUtil.urlEncode(str);
    }
}
