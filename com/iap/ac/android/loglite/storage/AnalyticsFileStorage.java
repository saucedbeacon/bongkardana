package com.iap.ac.android.loglite.storage;

import android.app.Application;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.appender.MdapFileLogAppender;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.iap.ac.android.loglite.config.LogStrategyInfo;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.FileUtil;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import com.iap.ac.android.loglite.utils.LoggingUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class AnalyticsFileStorage implements AnalyticsStorage {
    public static final String g;

    /* renamed from: a  reason: collision with root package name */
    public Application f9737a;
    public Map<String, File> b;
    public Map<String, File> c;
    public final Map<String, Integer> d;
    public boolean e = true;
    public String f;

    static {
        StringBuilder sb = new StringBuilder("loglite");
        sb.append(File.separatorChar);
        sb.append("upload");
        g = sb.toString();
    }

    public AnalyticsFileStorage(Application application, String str) {
        this.f9737a = application;
        this.f = str;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public abstract File a(String str);

    public void a(String str, String str2) {
        File a2 = a(str2);
        String str3 = "defaultWriteCountBizType";
        if (this.e) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9737a.getFilesDir());
            sb.append(File.separator);
            sb.append("loglite");
            File[] listFiles = new File(sb.toString(), this.f).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File readFile : listFiles) {
                    String readFile2 = FileUtil.readFile(readFile);
                    if (!TextUtils.isEmpty(readFile2)) {
                        int length = readFile2.split(LoggerFactory.LOG_SPLITER).length;
                        String str4 = TextUtils.isEmpty(str2) ? str3 : str2;
                        this.d.put(str4, Integer.valueOf(b(str4) + length));
                    }
                }
            }
            this.e = false;
        }
        AnalyticsContext instance = AnalyticsContext.getInstance();
        try {
            LogStrategyInfo a3 = instance.getConfigurationManager().a(this.f, str2);
            if (!(a3 != null && a3.maxLogCount == 1) && instance.isNeedEncryptLog()) {
                String encrypt = instance.getLogEncryptClient().encrypt(str);
                if (!TextUtils.isEmpty(encrypt)) {
                    StringBuilder sb2 = new StringBuilder(MdapFileLogAppender.ENCRYPT_SIGN);
                    sb2.append(encrypt);
                    sb2.append(MasLog.Constant.GAP);
                    str = sb2.toString();
                }
            }
            FileUtil.writeFile(str, a2);
            if (!TextUtils.isEmpty(str2)) {
                str3 = str2;
            }
            this.d.put(str3, Integer.valueOf(b(str3) + 1));
        } catch (Exception e2) {
            LoggerWrapper.w("AnalyticsFileStorage", (Throwable) e2);
        }
        if (instance.getConfigurationManager().a(this.f, b(str2), str2)) {
            AnalyticsContext instance2 = AnalyticsContext.getInstance();
            File a4 = a(str2);
            if (a4 != null && a4.exists()) {
                try {
                    String name = a4.getName();
                    File c2 = c();
                    if (!c2.exists()) {
                        c2.mkdirs();
                    }
                    FileUtil.moveFile(a4, new File(c2, LoggingUtil.getMdapStyleName(name)));
                } catch (IOException unused) {
                }
            }
            instance2.uploadLog(c());
            this.d.put(str2, 0);
        }
    }

    public void b() {
        this.d.clear();
    }

    public final File c() {
        return new File(this.f9737a.getFilesDir(), g);
    }

    public void d() {
        AnalyticsContext instance = AnalyticsContext.getInstance();
        String productId = AnalyticsContext.getInstance().getProductId();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9737a.getFilesDir());
        String str = File.separator;
        sb.append(str);
        sb.append("loglite");
        sb.append(str);
        sb.append(productId);
        File[] listFiles = new File(sb.toString(), this.f).listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                try {
                    String name = file.getName();
                    File c2 = c();
                    if (!c2.exists()) {
                        c2.mkdirs();
                    }
                    FileUtil.moveFile(file, new File(c2, LoggingUtil.getMdapStyleName(name)));
                } catch (IOException e2) {
                    LoggerWrapper.w("AnalyticsFileStorage", (Throwable) e2);
                }
            }
        }
        instance.uploadLog(c());
        b();
    }

    public final int b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "defaultWriteCountBizType";
        }
        if (this.d.get(str) == null) {
            return 0;
        }
        return this.d.get(str).intValue();
    }
}
