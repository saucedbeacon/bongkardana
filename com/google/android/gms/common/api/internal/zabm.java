package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface zabm {
    ConnectionResult zaa(long j, TimeUnit timeUnit);

    @Nullable
    ConnectionResult zaa(@NonNull Api<?> api);

    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(@NonNull T t);

    void zaa();

    void zaa(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr);

    boolean zaa(SignInConnectionListener signInConnectionListener);

    ConnectionResult zab();

    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(@NonNull T t);

    void zac();

    boolean zad();

    boolean zae();

    void zaf();

    void zag();
}
