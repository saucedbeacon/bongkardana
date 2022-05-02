package com.iap.ac.android.loglite.utils;

import android.content.Context;
import android.content.pm.PackageInfo;

public class ContextInfo {

    /* renamed from: a  reason: collision with root package name */
    public Context f9742a;
    public String b;

    public ContextInfo(Context context) {
        this.f9742a = context;
        a();
    }

    public final void a() {
        if (this.b == null) {
            PackageInfo packageInfo = null;
            try {
                Context context = this.f9742a;
                if (context != null) {
                    packageInfo = context.getPackageManager().getPackageInfo(this.f9742a.getPackageName(), 0);
                }
            } catch (Throwable unused) {
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionName;
            }
        }
    }
}
