package com.google.android.gms.internal.firebase_ml;

import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.google.firebase.perf.FirebasePerformance;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

public final class zzgj {
    private final int statusCode;
    private final zzgf zzwk;
    private int zzxb;
    private boolean zzxc;
    private final String zzxv;
    private InputStream zzxw;
    private final String zzxx;
    private final String zzxy;
    private zzgp zzxz;
    private final zzge zzya;
    private boolean zzyb;

    zzgj(zzge zzge, zzgp zzgp) throws IOException {
        StringBuilder sb;
        this.zzya = zzge;
        this.zzxb = zzge.zzfk();
        this.zzxc = zzge.zzfl();
        this.zzxz = zzgp;
        this.zzxx = zzgp.getContentEncoding();
        int statusCode2 = zzgp.getStatusCode();
        boolean z = false;
        this.statusCode = statusCode2 < 0 ? 0 : statusCode2;
        String reasonPhrase = zzgp.getReasonPhrase();
        this.zzxv = reasonPhrase;
        Logger logger = zzgn.zzye;
        if (this.zzxc && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        zzgf zzgf = null;
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            sb.append(zziv.zzadd);
            String zzfy = zzgp.zzfy();
            if (zzfy != null) {
                sb.append(zzfy);
            } else {
                sb.append(this.statusCode);
                if (reasonPhrase != null) {
                    sb.append(' ');
                    sb.append(reasonPhrase);
                }
            }
            sb.append(zziv.zzadd);
        } else {
            sb = null;
        }
        zzge.zzfn().zza(zzgp, z ? sb : null);
        String contentType = zzgp.getContentType();
        contentType = contentType == null ? zzge.zzfn().getContentType() : contentType;
        this.zzxy = contentType;
        this.zzwk = contentType != null ? new zzgf(contentType) : zzgf;
        if (z) {
            logger.logp(Level.CONFIG, "com.google.api.client.http.HttpResponse", "<init>", sb.toString());
        }
    }

    public final String getContentType() {
        return this.zzxy;
    }

    public final zzgd zzfm() {
        return this.zzya.zzfn();
    }

    public final boolean zzft() {
        int i = this.statusCode;
        return i >= 200 && i < 300;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.zzxv;
    }

    public final InputStream getContent() throws IOException {
        if (!this.zzyb) {
            zzio content = this.zzxz.getContent();
            if (content != null) {
                try {
                    String str = this.zzxx;
                    if (str != null && str.contains(HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP)) {
                        content = new GZIPInputStream(content);
                    }
                    Logger logger = zzgn.zzye;
                    if (this.zzxc && logger.isLoggable(Level.CONFIG)) {
                        content = new zzio(content, logger, Level.CONFIG, this.zzxb);
                    }
                    this.zzxw = content;
                } catch (EOFException unused) {
                    content.close();
                } catch (Throwable th) {
                    content.close();
                    throw th;
                }
            }
            this.zzyb = true;
        }
        return this.zzxw;
    }

    public final void ignore() throws IOException {
        InputStream content = getContent();
        if (content != null) {
            content.close();
        }
    }

    public final void disconnect() throws IOException {
        ignore();
        this.zzxz.disconnect();
    }

    public final <T> T zza(Class<T> cls) throws IOException {
        int i = this.statusCode;
        boolean z = true;
        if (this.zzya.getRequestMethod().equals(FirebasePerformance.HttpMethod.HEAD) || i / 100 == 1 || i == 204 || i == 304) {
            ignore();
            z = false;
        }
        if (!z) {
            return null;
        }
        return this.zzya.zzfp().zza(getContent(), zzfv(), cls);
    }

    /* JADX INFO: finally extract failed */
    public final String zzfu() throws IOException {
        InputStream content = getContent();
        if (content == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zzlp.checkNotNull(content);
            zzlp.checkNotNull(byteArrayOutputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    content.close();
                    return byteArrayOutputStream.toString(zzfv().name());
                }
            }
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    private final Charset zzfv() {
        zzgf zzgf = this.zzwk;
        return (zzgf == null || zzgf.zzfs() == null) ? zzhy.ISO_8859_1 : this.zzwk.zzfs();
    }
}
