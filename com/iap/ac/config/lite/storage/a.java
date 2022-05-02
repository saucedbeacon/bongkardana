package com.iap.ac.config.lite.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.e;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class a {
    private static final String f = e.b("ConfigStorage");
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private ISecurityEncryptor f9826a;
    private Context b;
    private String c;
    private SharedPreferences d;
    private String e;

    public a(@NonNull Context context, @Nullable String str, @Nullable String str2) {
        String str3;
        this.b = context;
        str = TextUtils.isEmpty(str) ? "default" : str;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "_".concat(String.valueOf(str2));
        }
        this.c = String.format("aplus_config_lite_%s%s.contents", new Object[]{str, str3});
        this.e = String.format("aplus_config_lite_%s%s.cdn.contents", new Object[]{str, str3});
        this.d = this.b.getSharedPreferences(String.format("aplus_config_lite_%s%s.prefs", new Object[]{str, str3}), 0);
    }

    private static String a(InputStream inputStream) {
        Throwable th;
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
            } catch (Throwable th2) {
                th = th2;
                try {
                    ACLog.e(f, "readInputStream", th);
                    return null;
                } finally {
                    a((Closeable) inputStreamReader);
                    a((Closeable) inputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
            ACLog.e(f, "readInputStream", th);
            return null;
        }
    }

    public void b(String str) {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("lastModified", str).apply();
        }
    }

    public boolean c(@NonNull String str) {
        ISecurityEncryptor iSecurityEncryptor = this.f9826a;
        if (iSecurityEncryptor != null) {
            str = iSecurityEncryptor.encrypt(str);
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.b.openFileOutput(this.c, 0);
            if (fileOutputStream == null) {
                return false;
            }
            byte[] bytes = str != null ? str.getBytes() : new byte[0];
            fileOutputStream.write(bytes);
            ACLog.i(f, String.format("** saveConfig Success! bytes = %s.", new Object[]{String.valueOf(bytes.length)}));
            a((Closeable) fileOutputStream);
            return true;
        } catch (Throwable th) {
            ACLog.e(f, "saveConfig Error!", th);
            return false;
        } finally {
            a((Closeable) fileOutputStream);
        }
    }

    public long d() {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            return sharedPreferences.getLong("lastRefreshTime", 0);
        }
        return 0;
    }

    public String e() {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("cachedMergeFactors", (String) null);
    }

    public String f() {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("mixAttribute", "");
        }
        return "";
    }

    @Nullable
    public String g() {
        try {
            FileInputStream openFileInput = this.b.openFileInput(this.c);
            if (openFileInput == null) {
                return null;
            }
            String a2 = a((InputStream) openFileInput);
            if (this.f9826a != null) {
                a2 = this.f9826a.decrypt(a2);
            }
            int length = a2 != null ? a2.getBytes().length : 0;
            ACLog.i(f, String.format("** loadConfig Success! bytes = %s.", new Object[]{String.valueOf(length)}));
            return a2;
        } catch (Throwable th) {
            ACLog.w(f, String.format("** loadConfig Failed! Take it easy, cache file not exists. message = %s.", new Object[]{th.getMessage()}));
            return null;
        }
    }

    public String b() {
        return e.a(this.b, this.e);
    }

    public void d(String str) {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("mixAttribute", str).apply();
        }
    }

    public void e(String str) {
        if (this.d != null) {
            ACLog.i(f, "saveReMergeFactors: ".concat(String.valueOf(str)));
            this.d.edit().putString("cachedMergeFactors", str).apply();
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

    public void a(long j) {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastRefreshTime", j).apply();
        }
    }

    public void a() {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString("lastModified", "").apply();
        }
    }

    public void a(String str) {
        e.a(this.b, this.e, str);
    }

    public String c() {
        SharedPreferences sharedPreferences = this.d;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("lastModified", "");
        }
        return "";
    }
}
