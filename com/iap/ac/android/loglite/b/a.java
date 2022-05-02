package com.iap.ac.android.loglite.b;

import android.app.Application;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.iap.ac.android.loglite.config.ConfigurationManager;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.utils.FileUtil;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class a extends c {
    public Map<String, Integer> i = new HashMap();
    public Map<String, File> j = new HashMap();

    /* renamed from: com.iap.ac.android.loglite.b.a$a  reason: collision with other inner class name */
    public class C0100a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11055a;

        public C0100a(String str) {
            this.f11055a = str;
        }

        public void run() {
            a aVar = a.this;
            aVar.f = this.f11055a;
            aVar.d();
        }
    }

    public a(Application application, String str) {
        super(application, (String) null);
    }

    public void a(String str, String str2) {
        File a2 = a(str2);
        if (!this.i.containsKey(this.f)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9737a.getFilesDir());
            sb.append(File.separator);
            sb.append("loglite");
            File[] listFiles = new File(sb.toString(), this.f).listFiles();
            int i2 = 0;
            if (listFiles != null && listFiles.length > 0) {
                int length = listFiles.length;
                int i3 = 0;
                while (i2 < length) {
                    String readFile = FileUtil.readFile(listFiles[i2]);
                    if (!TextUtils.isEmpty(readFile)) {
                        i3 += readFile.split(LoggerFactory.LOG_SPLITER).length;
                    }
                    i2++;
                }
                i2 = i3;
            }
            this.i.put(this.f, Integer.valueOf(i2));
        }
        try {
            FileUtil.writeFile(str, a2);
            this.i.put(this.f, Integer.valueOf(this.i.get(this.f).intValue() + 1));
        } catch (Exception e) {
            LoggerWrapper.w("AntEventFileStorage", (Throwable) e);
        }
        ConfigurationManager configurationManager = AnalyticsContext.getInstance().getConfigurationManager();
        String str3 = this.f;
        if (configurationManager.a(str3, this.i.get(str3).intValue(), str2)) {
            d();
        }
    }

    public void b() {
        this.i.put(this.f, 0);
    }

    public void a() {
        for (String aVar : this.i.keySet()) {
            this.h.execute(new C0100a(aVar));
        }
    }

    public File a(String str) {
        String productId = AnalyticsContext.getInstance().getProductId();
        StringBuilder sb = new StringBuilder();
        sb.append(productId);
        sb.append(this.f);
        sb.append(str);
        String obj = sb.toString();
        File file = this.j.get(obj);
        if (file != null) {
            return file;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9737a.getFilesDir());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("loglite");
        sb2.append(str2);
        sb2.append(productId);
        File file2 = new File(sb2.toString(), this.f);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f.replace("_", "$=$"));
        sb3.append("_");
        sb3.append(str);
        File file3 = new File(file2, sb3.toString());
        this.j.put(obj, file3);
        return file3;
    }
}
