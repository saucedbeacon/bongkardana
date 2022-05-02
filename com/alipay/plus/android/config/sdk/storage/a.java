package com.alipay.plus.android.config.sdk.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.retry.DistributionNodesConfig;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10762a = e.a("ConfigStorage");
    @Nullable
    private ISecurityEncryptor b;
    private Context c;
    private String d;
    private SharedPreferences e;

    public a(@NonNull Context context, @Nullable String str) {
        this.c = context;
        str = TextUtils.isEmpty(str) ? "default" : str;
        this.d = String.format("aplus_config_%s.contents", new Object[]{str});
        this.e = this.c.getSharedPreferences(String.format("aplus_config_%s.prefs", new Object[]{str}), 0);
    }

    private static String a(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream);
            try {
                char[] cArr = new char[1024];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        String obj = sb.toString();
                        a((Closeable) inputStreamReader);
                        a((Closeable) inputStream);
                        return obj;
                    }
                }
            } catch (Throwable th) {
                th = th;
                try {
                    LoggerWrapper.e(f10762a, "readInputStream", th);
                    return null;
                } finally {
                    a((Closeable) inputStreamReader);
                    a((Closeable) inputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader = null;
            LoggerWrapper.e(f10762a, "readInputStream", th);
            return null;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Nullable
    public String a() {
        try {
            FileInputStream openFileInput = this.c.openFileInput(this.d);
            if (openFileInput == null) {
                return null;
            }
            String a2 = a((InputStream) openFileInput);
            if (this.b != null) {
                a2 = this.b.decrypt(a2);
            }
            LoggerWrapper.i(f10762a, String.format("** loadConfig Success! bytes = %s.", new Object[]{String.valueOf(a2 != null ? a2.getBytes().length : 0)}));
            return a2;
        } catch (Throwable th) {
            LoggerWrapper.w(f10762a, String.format("** loadConfig Failed! Take it easy, cache file not exists. message = %s.", new Object[]{th.getMessage()}));
            return null;
        }
    }

    public void a(long j) {
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastRefreshTime", j).apply();
        }
    }

    public void a(@NonNull DistributionNodesConfig distributionNodesConfig) {
        if (this.e == null) {
            LoggerWrapper.e(f10762a, "mSharedPreferences is null, cannot save backupConfigs!");
            return;
        }
        this.e.edit().putString("cdnConfigs", ConfigUtils.toJSONString(distributionNodesConfig)).apply();
    }

    public boolean a(@NonNull String str) {
        ISecurityEncryptor iSecurityEncryptor = this.b;
        if (iSecurityEncryptor != null) {
            str = iSecurityEncryptor.encrypt(str);
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.c.openFileOutput(this.d, 0);
            if (fileOutputStream == null) {
                return false;
            }
            byte[] bytes = str != null ? str.getBytes() : new byte[0];
            fileOutputStream.write(bytes);
            LoggerWrapper.i(f10762a, String.format("** saveConfig Success! bytes = %s.", new Object[]{String.valueOf(bytes.length)}));
            a((Closeable) fileOutputStream);
            return true;
        } catch (Throwable th) {
            LoggerWrapper.e(f10762a, "saveConfig Error!", th);
            return false;
        } finally {
            a((Closeable) fileOutputStream);
        }
    }

    @Nullable
    public DistributionNodesConfig b() {
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences == null) {
            LoggerWrapper.e(f10762a, "mSharedPreferences is null! loaded backupConfigs is null!");
            return null;
        }
        try {
            String string = sharedPreferences.getString("cdnConfigs", (String) null);
            if (string == null) {
                return null;
            }
            try {
                return (DistributionNodesConfig) JSON.parseObject(string, DistributionNodesConfig.class);
            } catch (Throwable th) {
                String str = f10762a;
                StringBuilder sb = new StringBuilder("Cannot parse backupConfigs. error = ");
                sb.append(th.getMessage());
                LoggerWrapper.e(str, sb.toString());
                return null;
            }
        } catch (Throwable th2) {
            String str2 = f10762a;
            StringBuilder sb2 = new StringBuilder("get backupConfigs failed! error = ");
            sb2.append(th2.getMessage());
            LoggerWrapper.e(str2, sb2.toString());
            return null;
        }
    }

    public void b(@NonNull DistributionNodesConfig distributionNodesConfig) {
        if (this.e == null) {
            LoggerWrapper.e(f10762a, "mSharedPreferences is null, cannot save backupConfigs!");
            return;
        }
        this.e.edit().putString("distributionNodes", ConfigUtils.toJSONString(distributionNodesConfig)).apply();
    }

    public void b(String str) {
        if (this.e != null) {
            LoggerWrapper.i(f10762a, "saveReMergeFactors: ".concat(String.valueOf(str)));
            this.e.edit().putString("cachedMergeFactors", str).apply();
        }
    }

    @Nullable
    public DistributionNodesConfig c() {
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences == null) {
            LoggerWrapper.e(f10762a, "mSharedPreferences is null! loaded backupConfigs is null!");
            return null;
        }
        try {
            String string = sharedPreferences.getString("distributionNodes", (String) null);
            if (string == null) {
                return null;
            }
            try {
                return (DistributionNodesConfig) JSON.parseObject(string, DistributionNodesConfig.class);
            } catch (Throwable th) {
                String str = f10762a;
                StringBuilder sb = new StringBuilder("Cannot parse backupConfigs. error = ");
                sb.append(th.getMessage());
                LoggerWrapper.e(str, sb.toString());
                return null;
            }
        } catch (Throwable th2) {
            String str2 = f10762a;
            StringBuilder sb2 = new StringBuilder("get backupConfigs failed! error = ");
            sb2.append(th2.getMessage());
            LoggerWrapper.e(str2, sb2.toString());
            return null;
        }
    }

    public String d() {
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("cachedMergeFactors", (String) null);
    }

    public long e() {
        SharedPreferences sharedPreferences = this.e;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("lastRefreshTime", 0);
        }
        return 0;
    }
}
