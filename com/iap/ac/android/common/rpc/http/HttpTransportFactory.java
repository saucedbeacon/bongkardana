package com.iap.ac.android.common.rpc.http;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public final class HttpTransportFactory {
    private static Creater creater;
    private static ConcurrentHashMap<String, Creater> createrMap = new ConcurrentHashMap<>();

    public interface Creater {
        AbstractHttpTransport createHttpTransport(@NonNull Context context) throws Exception;
    }

    @NonNull
    public static AbstractHttpTransport createHttpTransport(@NonNull Context context) throws Exception {
        Creater creater2 = creater;
        if (creater2 != null) {
            return creater2.createHttpTransport(context);
        }
        throw new IOException("Cannot find creater for HttpTransportFactory!");
    }

    @NonNull
    public static AbstractHttpTransport createHttpTransport(@NonNull Context context, String str) throws Exception {
        Creater creater2 = getCreater(str);
        if (creater2 == null) {
            creater2 = creater;
        }
        if (creater2 != null) {
            return creater2.createHttpTransport(context);
        }
        throw new IOException("Cannot find creater for HttpTransportFactory!");
    }

    public static Creater getCreater() {
        return creater;
    }

    public static void setCreater(@NonNull Creater creater2) {
        creater = creater2;
    }

    public static Creater getCreater(String str) {
        return createrMap.get(str);
    }

    public static void setCreater(@NonNull Creater creater2, String str) {
        if (!TextUtils.isEmpty(str)) {
            createrMap.put(str, creater2);
        }
    }
}
