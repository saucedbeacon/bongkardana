package com.google.android.gms.internal.firebase_ml;

import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class zzfu implements zzfy {
    public final String getName() {
        return HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP;
    }

    public final void zza(zziw zziw, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new zzfx(this, outputStream));
        zziw.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
