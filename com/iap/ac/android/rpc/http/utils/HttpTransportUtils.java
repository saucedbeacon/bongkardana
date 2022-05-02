package com.iap.ac.android.rpc.http.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.rpc.http.error.HttpError;
import com.iap.ac.android.rpc.http.error.HttpException;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public class HttpTransportUtils {
    private static final String TAG = logTag("HttpTransportUtils");

    @NonNull
    public static String logTag(@NonNull String str) {
        return "HttpTransport-".concat(String.valueOf(str));
    }

    @Nullable
    public static byte[] readBytes(@Nullable InputStream inputStream) {
        return readBytes(inputStream, true);
    }

    @Nullable
    public static byte[] readBytes(@Nullable InputStream inputStream, boolean z) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                ACLog.e(TAG, "readBytes exception", e);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z) {
            close(inputStream);
        }
        return byteArray;
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ACLog.w(TAG, "Take it easy, just cannot close stream.", e);
            }
        }
    }

    @NonNull
    public static String getLanguage() {
        return Locale.getDefault().toString();
    }

    public static Exception createException(@NonNull HttpError httpError, String str) {
        return new HttpException(httpError.getErrorCode(), str);
    }

    public static Exception createException(@NonNull String str, String str2) {
        return new HttpException(str, str2);
    }
}
