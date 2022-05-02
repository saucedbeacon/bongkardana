package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class zzgx extends zzgp {
    private final int responseCode;
    private final String responseMessage;
    private final HttpURLConnection zzyv;
    private final ArrayList<String> zzyz = new ArrayList<>();
    private final ArrayList<String> zzza = new ArrayList<>();

    zzgx(HttpURLConnection httpURLConnection) throws IOException {
        this.zzyv = httpURLConnection;
        int responseCode2 = httpURLConnection.getResponseCode();
        this.responseCode = responseCode2 == -1 ? 0 : responseCode2;
        this.responseMessage = httpURLConnection.getResponseMessage();
        ArrayList<String> arrayList = this.zzyz;
        ArrayList<String> arrayList2 = this.zzza;
        for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        arrayList.add(str);
                        arrayList2.add(str2);
                    }
                }
            }
        }
    }

    public final int getStatusCode() {
        return this.responseCode;
    }

    public final InputStream getContent() throws IOException {
        InputStream inputStream;
        try {
            inputStream = this.zzyv.getInputStream();
        } catch (IOException unused) {
            inputStream = this.zzyv.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new zzgw(this, inputStream);
    }

    public final String getContentEncoding() {
        return this.zzyv.getContentEncoding();
    }

    public final long getContentLength() {
        String headerField = this.zzyv.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    public final String getContentType() {
        return this.zzyv.getHeaderField("Content-Type");
    }

    public final String getReasonPhrase() {
        return this.responseMessage;
    }

    public final String zzfy() {
        String headerField = this.zzyv.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    public final int zzfz() {
        return this.zzyz.size();
    }

    public final String zzad(int i) {
        return this.zzyz.get(i);
    }

    public final String zzae(int i) {
        return this.zzza.get(i);
    }

    public final void disconnect() {
        this.zzyv.disconnect();
    }
}
