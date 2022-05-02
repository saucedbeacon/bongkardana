package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.io.IOException;

final class zzqd extends zzjl {
    private final /* synthetic */ FirebaseApp zzbha;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzqd(zzqb zzqb, String str, FirebaseApp firebaseApp) {
        super(str);
        this.zzbha = firebaseApp;
    }

    /* access modifiers changed from: protected */
    public final void zza(zzjm<?> zzjm) throws IOException {
        super.zza(zzjm);
        Context applicationContext = this.zzbha.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        zzjm.zzey().put("X-Android-Package", packageName);
        zzjm.zzey().put("X-Android-Cert", zzqb.zzc(applicationContext, packageName));
    }
}
