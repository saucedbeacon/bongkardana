package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.by;
import com.google.android.play.core.internal.v;
import com.google.android.play.core.internal.y;
import java.util.Arrays;

final class b extends v {

    /* renamed from: a  reason: collision with root package name */
    private final af f10854a = new af("AssetPackExtractionService");
    private final Context b;
    private final AssetPackExtractionService c;
    private final bb d;

    b(Context context, AssetPackExtractionService assetPackExtractionService, bb bbVar) {
        this.b = context;
        this.c = assetPackExtractionService;
        this.d = bbVar;
    }

    public final void a(Bundle bundle, y yVar) throws RemoteException {
        String[] packagesForUid;
        this.f10854a.a("updateServiceState AIDL call", new Object[0]);
        if (!by.a(this.b) || (packagesForUid = this.b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
            yVar.a(new Bundle());
            this.c.a();
            return;
        }
        yVar.a(this.c.a(bundle), new Bundle());
    }

    public final void a(y yVar) throws RemoteException {
        this.d.f();
        yVar.b(new Bundle());
    }
}
