package com.alipay.mobile.security.bio.thread;

import android.content.Context;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.service.BioSysBehavior;
import com.alipay.mobile.security.bio.service.BioSysBehaviorType;
import com.alipay.mobile.security.bio.utils.DateUtil;
import com.alipay.mobile.security.bio.utils.FileUtil;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class WatchLogThread extends WatchThread {
    private static final int SIZE = 30;
    private File mApiFile = null;
    private File mClickFile = null;
    private Context mContext = null;
    private File mEventFile = null;
    private File mLogDir = null;
    private File mMethodFile = null;
    private File mNetFile = null;
    private BlockingQueue<BioSysBehavior> mSysBehaviorCache = new LinkedBlockingQueue(30);

    public WatchLogThread(Context context, String str) {
        super(str);
        if (context != null) {
            this.mContext = context;
            this.mLogDir = context.getDir("BIO_LOGS", 0);
            String dateFormat = DateUtil.getDateFormat(System.currentTimeMillis());
            File file = this.mLogDir;
            StringBuilder sb = new StringBuilder("BIO_API_");
            sb.append(dateFormat);
            sb.append(".txt");
            this.mApiFile = new File(file, sb.toString());
            File file2 = this.mLogDir;
            StringBuilder sb2 = new StringBuilder("BIO_METHOD_");
            sb2.append(dateFormat);
            sb2.append(".txt");
            this.mMethodFile = new File(file2, sb2.toString());
            File file3 = this.mLogDir;
            StringBuilder sb3 = new StringBuilder("BIO_CLICK_");
            sb3.append(dateFormat);
            sb3.append(".txt");
            this.mClickFile = new File(file3, sb3.toString());
            File file4 = this.mLogDir;
            StringBuilder sb4 = new StringBuilder("BIO_NET_");
            sb4.append(dateFormat);
            sb4.append(".txt");
            this.mNetFile = new File(file4, sb4.toString());
            File file5 = this.mLogDir;
            StringBuilder sb5 = new StringBuilder("BIO_EVENT_");
            sb5.append(dateFormat);
            sb5.append(".txt");
            this.mEventFile = new File(file5, sb5.toString());
            return;
        }
        throw new BioIllegalArgumentException();
    }

    public WatchLogThread(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public void task() {
        try {
            writeContext(this.mSysBehaviorCache.poll(50, TimeUnit.SECONDS));
        } catch (InterruptedException unused) {
        }
    }

    public void addThreadItem(BioSysBehavior bioSysBehavior) {
        try {
            this.mSysBehaviorCache.add(bioSysBehavior);
        } catch (Throwable unused) {
        }
    }

    private void writeContext(BioSysBehavior bioSysBehavior) {
        if (bioSysBehavior != null) {
            HashMap<String, String> ext = bioSysBehavior.getExt();
            StringBuilder sb = new StringBuilder();
            if (!ext.isEmpty()) {
                for (String next : ext.keySet()) {
                    StringBuilder sb2 = new StringBuilder("[key:");
                    sb2.append(next);
                    sb2.append(", value:");
                    sb2.append(ext.get(next));
                    sb2.append("]");
                    sb.append(sb2.toString());
                }
            }
            BioSysBehaviorType type = bioSysBehavior.getType();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(bioSysBehavior.getMsg());
            sb3.append(sb.toString());
            writeContext(type, sb3.toString());
        }
    }

    /* renamed from: com.alipay.mobile.security.bio.thread.WatchLogThread$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alipay$mobile$security$bio$service$BioSysBehaviorType;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alipay.mobile.security.bio.service.BioSysBehaviorType[] r0 = com.alipay.mobile.security.bio.service.BioSysBehaviorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alipay$mobile$security$bio$service$BioSysBehaviorType = r0
                com.alipay.mobile.security.bio.service.BioSysBehaviorType r1 = com.alipay.mobile.security.bio.service.BioSysBehaviorType.API     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alipay$mobile$security$bio$service$BioSysBehaviorType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alipay.mobile.security.bio.service.BioSysBehaviorType r1 = com.alipay.mobile.security.bio.service.BioSysBehaviorType.CLICK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alipay$mobile$security$bio$service$BioSysBehaviorType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alipay.mobile.security.bio.service.BioSysBehaviorType r1 = com.alipay.mobile.security.bio.service.BioSysBehaviorType.NET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$alipay$mobile$security$bio$service$BioSysBehaviorType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alipay.mobile.security.bio.service.BioSysBehaviorType r1 = com.alipay.mobile.security.bio.service.BioSysBehaviorType.EVENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$alipay$mobile$security$bio$service$BioSysBehaviorType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alipay.mobile.security.bio.service.BioSysBehaviorType r1 = com.alipay.mobile.security.bio.service.BioSysBehaviorType.METHOD     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.thread.WatchLogThread.AnonymousClass1.<clinit>():void");
        }
    }

    private void writeContext(BioSysBehaviorType bioSysBehaviorType, String str) {
        int i = AnonymousClass1.$SwitchMap$com$alipay$mobile$security$bio$service$BioSysBehaviorType[bioSysBehaviorType.ordinal()];
        if (i == 1) {
            FileUtil.saveContent(this.mApiFile, str, true);
        } else if (i == 2) {
            FileUtil.saveContent(this.mClickFile, str, true);
        } else if (i == 3) {
            FileUtil.saveContent(this.mNetFile, str, true);
        } else if (i == 4) {
            FileUtil.saveContent(this.mEventFile, str, true);
        } else if (i == 5) {
            FileUtil.saveContent(this.mMethodFile, str, true);
        }
    }
}
