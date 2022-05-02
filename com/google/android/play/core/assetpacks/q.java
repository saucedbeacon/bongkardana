package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.bq;
import com.google.android.play.core.internal.cn;

public final class q implements cn<AssetPackManager> {

    /* renamed from: a  reason: collision with root package name */
    private final cn<j> f10942a;
    private final cn<Context> b;

    public q(cn<j> cnVar, cn<Context> cnVar2) {
        this.f10942a = cnVar;
        this.b = cnVar2;
    }

    public final /* synthetic */ Object a() {
        j a2 = this.f10942a.a();
        Context b2 = ((s) this.b).a();
        j jVar = a2;
        bq.a(b2.getPackageManager(), new ComponentName(b2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.a(b2);
        bq.b(jVar);
        return jVar;
    }
}
