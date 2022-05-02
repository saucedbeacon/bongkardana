package com.alipay.plus.android.transport.sdk;

import androidx.annotation.NonNull;
import com.alipay.plus.android.transport.a.a;

public final class HttpTransportFactory {
    @NonNull
    public static AbstractHttpTransport createHttpTransport() {
        return createHttpTransport(false);
    }

    @NonNull
    public static AbstractHttpTransport createHttpTransport(boolean z) {
        return new a(z);
    }
}
