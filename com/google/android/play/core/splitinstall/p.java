package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.af;
import com.iap.ac.android.common.BuildConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final af f9623a = new af("SplitInstallInfoProvider");
    private final Context b;
    private final String c;

    public p(Context context) {
        this.b = context;
        this.c = context.getPackageName();
    }

    public p(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public static boolean a(String str) {
        return str.startsWith("config.");
    }

    public static boolean b(String str) {
        return a(str) || str.contains(".config.");
    }

    private final Set<String> d() {
        HashSet hashSet = new HashSet();
        Bundle e = e();
        if (e != null) {
            String string = e.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f9623a.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove(BuildConfig.FLAVOR);
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = null;
            try {
                PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.c, 0);
                if (packageInfo != null) {
                    strArr = packageInfo.splitNames;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f9623a.d("App is not found in PackageManager", new Object[0]);
            }
            if (strArr != null) {
                f9623a.a("Adding splits from package manager: %s", Arrays.toString(strArr));
                Collections.addAll(hashSet, strArr);
            } else {
                f9623a.a("No splits are found or app cannot be found in package manager.", new Object[0]);
            }
            n a2 = o.a();
            if (a2 != null) {
                hashSet.addAll(a2.a());
            }
        }
        return hashSet;
    }

    @Nullable
    private final Bundle e() {
        try {
            ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.c, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f9623a.a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f9623a.d("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        for (String next : d()) {
            if (!b(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Set<String> b() {
        h c2 = c();
        if (c2 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> d = d();
        d.add("");
        Set<String> a2 = a();
        a2.add("");
        for (Map.Entry next : c2.a(a2).entrySet()) {
            if (d.containsAll((Collection) next.getValue())) {
                hashSet.add((String) next.getKey());
            }
        }
        return hashSet;
    }

    @Nullable
    public final h c() {
        Bundle e = e();
        if (e == null) {
            f9623a.d("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = e.getInt("com.android.vending.splits");
        if (i == 0) {
            f9623a.d("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            h a2 = new az(this.b.getResources().getXml(i)).a();
            if (a2 == null) {
                f9623a.d("Can't parse languages metadata.", new Object[0]);
            }
            return a2;
        } catch (Resources.NotFoundException unused) {
            f9623a.d("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
