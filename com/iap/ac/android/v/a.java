package com.iap.ac.android.v;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.storage.ACStorageProvider;
import com.iap.ac.android.common.data.ACSecurityData;
import com.iap.ac.android.common.data.IDataEncrypt;
import com.iap.ac.android.common.data.IDataStorage;

public class a implements IDataEncrypt, IDataStorage {
    public static volatile a d;

    /* renamed from: a  reason: collision with root package name */
    public com.iap.ac.android.c.a f9773a;
    public ACStorageProvider b;
    public ACSecurityData c = ACSecurityData.newInstance(this, this);

    public a(Context context) {
        this.f9773a = new com.iap.ac.android.c.a(context);
        this.b = new ACStorageProvider(context, "ACManagerSecData");
    }

    public static a a(Context context) {
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a(context);
                }
            }
        }
        return d;
    }

    public boolean clear() {
        return this.b.clear();
    }

    public String decrypt(@NonNull String str) {
        return this.f9773a.a(str);
    }

    public boolean delete(String str) {
        return this.b.delete(str);
    }

    public String encrypt(@NonNull String str) {
        return this.f9773a.b(str);
    }

    public String get(String str) {
        return this.b.fetch(str);
    }

    public boolean save(String str, String str2) {
        return this.b.save(str, str2);
    }

    public ACSecurityData a() {
        ACSecurityData aCSecurityData;
        synchronized (this) {
            aCSecurityData = this.c;
        }
        return aCSecurityData;
    }
}
