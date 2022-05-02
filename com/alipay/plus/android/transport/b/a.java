package com.alipay.plus.android.transport.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.errorcode.IAPException;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.transport.sdk.HttpError;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10769a = a("HttpTransportUtils");

    public static Exception a(@NonNull HttpError httpError, String str) {
        return new IAPException(new IAPError(httpError.getErrorCode(), str));
    }

    @NonNull
    public static String a() {
        return Locale.getDefault().toString();
    }

    @NonNull
    public static String a(@NonNull String str) {
        return "HttpTransport-".concat(String.valueOf(str));
    }

    public static void a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                LoggerWrapper.w(f10769a, "Take it easy, just cannot close stream.", e);
            }
        }
    }

    @Nullable
    public static byte[] a(@Nullable InputStream inputStream) {
        return a(inputStream, true);
    }

    @Nullable
    public static byte[] a(@Nullable InputStream inputStream, boolean z) {
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
                LoggerWrapper.e(f10769a, "readBytes exception", e);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z) {
            a((Closeable) inputStream);
        }
        return byteArray;
    }
}
