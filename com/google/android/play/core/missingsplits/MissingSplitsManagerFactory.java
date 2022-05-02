package com.google.android.play.core.missingsplits;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

public class MissingSplitsManagerFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<Boolean> f9115a = new AtomicReference<>((Object) null);

    @NonNull
    public static MissingSplitsManager create(@NonNull Context context) {
        return new b(context, Runtime.getRuntime(), new a(context, context.getPackageManager()), f9115a);
    }
}
