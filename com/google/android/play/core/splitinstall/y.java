package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.File;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11004a;

    y(Context context) {
        this.f11004a = context;
    }

    @Nullable
    static File a(Context context) {
        String string;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                return null;
            }
            return new File(context.getExternalFilesDir((String) null), string);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final t a() {
        return t.a(this.f11004a);
    }

    /* access modifiers changed from: package-private */
    public final Context b() {
        return this.f11004a;
    }
}
