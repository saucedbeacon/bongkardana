package com.alipay.imobile.network.sslpinning.b;

import android.os.AsyncTask;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.sslpinning.api.OnAddRemoteCertificatesListener;
import com.alipay.imobile.network.sslpinning.api.RemoteCertificateDownloadException;
import com.alipay.imobile.network.sslpinning.db.a;
import com.alipay.imobile.network.sslpinning.db.c;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b extends AsyncTask<String, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    private static String f10719a = "SSLPinning";
    private OnAddRemoteCertificatesListener b;
    private final a c;

    public b(OnAddRemoteCertificatesListener onAddRemoteCertificatesListener, a aVar) {
        this.b = onAddRemoteCertificatesListener;
        this.c = aVar;
    }

    private List<String> b(String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        ArrayList arrayList = new ArrayList();
        List<c> a2 = this.c.a();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < a2.size(); i++) {
            arrayList2.add(a2.get(i).f9401a);
        }
        if (arrayList2.size() <= 0) {
            return asList;
        }
        for (int i2 = 0; i2 < asList.size(); i2++) {
            String str = asList.get(i2);
            if (!arrayList2.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(String... strArr) {
        List<String> b2 = b(strArr);
        if (b2.size() == 0) {
            OnAddRemoteCertificatesListener onAddRemoteCertificatesListener = this.b;
            if (onAddRemoteCertificatesListener != null) {
                onAddRemoteCertificatesListener.onSuccess();
            }
            LoggerWrapper.d(f10719a, "Certificates already persisted, no need to download again");
            return null;
        }
        ArrayList arrayList = new ArrayList(b2.size());
        int i = 0;
        while (i < b2.size()) {
            try {
                String str = b2.get(i);
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                if (httpURLConnection.getResponseCode() == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(inputStream);
                    inputStream.close();
                    arrayList.add(new c(b2.get(i), generateCertificate));
                    i++;
                } else {
                    LoggerWrapper.d(f10719a, "Certificate download failed, URL is ".concat(String.valueOf(str)));
                    throw new IOException("Certificate not found");
                }
            } catch (IOException e) {
                String str2 = f10719a;
                StringBuilder sb = new StringBuilder("IO Exception occurs, ");
                sb.append(e.getMessage());
                LoggerWrapper.e(str2, sb.toString());
                OnAddRemoteCertificatesListener onAddRemoteCertificatesListener2 = this.b;
                if (onAddRemoteCertificatesListener2 != null) {
                    onAddRemoteCertificatesListener2.onFailure(RemoteCertificateDownloadException.newInstance(a.a(), e));
                }
                return null;
            } catch (CertificateException e2) {
                LoggerWrapper.e(f10719a, "Certificate file parsing failed, is this file encoded in PEM or DER format?");
                OnAddRemoteCertificatesListener onAddRemoteCertificatesListener3 = this.b;
                if (onAddRemoteCertificatesListener3 != null) {
                    onAddRemoteCertificatesListener3.onFailure(RemoteCertificateDownloadException.newInstance(a.b(), e2));
                }
                return null;
            }
        }
        LoggerWrapper.d(f10719a, "Certificate downloads successful");
        this.c.a(arrayList);
        LoggerWrapper.d(f10719a, "Certificates saved to database successfully");
        OnAddRemoteCertificatesListener onAddRemoteCertificatesListener4 = this.b;
        if (onAddRemoteCertificatesListener4 != null) {
            onAddRemoteCertificatesListener4.onSuccess();
        }
        return null;
    }
}
