package com.google.android.gms.internal.firebase_ml;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

public final class zzgq extends zzfs {
    private Object data;

    public zzgq(Object obj) {
        super(zzgt.MEDIA_TYPE);
        this.data = zzlp.checkNotNull(obj);
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, zzfe()));
        boolean z = true;
        for (Map.Entry next : zzid.zzf(this.data).entrySet()) {
            Object value = next.getValue();
            if (value != null) {
                String zzao = zzjc.zzao((String) next.getKey());
                Class<?> cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object zza : zziy.zzi(value)) {
                        z = zza(z, bufferedWriter, zzao, zza);
                    }
                } else {
                    z = zza(z, bufferedWriter, zzao, value);
                }
            }
        }
        bufferedWriter.flush();
    }

    private static boolean zza(boolean z, Writer writer, String str, Object obj) throws IOException {
        if (obj != null && !zzid.isNull(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String zzao = zzjc.zzao(obj instanceof Enum ? zzij.zza((Enum<?>) (Enum) obj).getName() : obj.toString());
            if (zzao.length() != 0) {
                writer.write(SimpleComparison.EQUAL_TO_OPERATION);
                writer.write(zzao);
            }
        }
        return z;
    }
}
