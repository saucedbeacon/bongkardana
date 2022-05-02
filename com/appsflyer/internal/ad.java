package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import com.alibaba.ariver.kernel.RVParams;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ad {

    /* renamed from: ˏ  reason: contains not printable characters */
    final Context f8660;

    public ad(Context context) {
        this.f8660 = context;
    }

    /* renamed from: ˋ  reason: contains not printable characters */
    public final String m1219() {
        String str;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            str = (String) newSingleThreadExecutor.submit(new Callable<String>() {
                public final /* synthetic */ Object call() throws Exception {
                    ProviderInfo resolveContentProvider = ad.this.f8660.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 128);
                    String str = null;
                    if (resolveContentProvider != null) {
                        Signature[] signatureArr = ad.this.f8660.getPackageManager().getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                        MessageDigest instance = MessageDigest.getInstance("SHA1");
                        instance.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
                        if (Base64.encodeToString(instance.digest(), 2).equals("ijxLJi1yGs1JpL+X1SExmchvork=")) {
                            Cursor query = ad.this.f8660.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{RVParams.AID}, (String) null, (String[]) null, (String) null);
                            if (query != null && query.moveToFirst()) {
                                str = query.getString(query.getColumnIndex(RVParams.AID));
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    }
                    return str;
                }
            }).get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            str = null;
        }
        newSingleThreadExecutor.shutdown();
        return str;
    }
}
