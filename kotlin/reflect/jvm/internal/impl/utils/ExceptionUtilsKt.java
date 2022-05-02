package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExceptionUtilsKt {
    @NotNull
    public static final RuntimeException rethrow(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "e");
        throw th;
    }

    public static final boolean isProcessCanceledException(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Class cls = th.getClass();
        while (!Intrinsics.areEqual((Object) cls.getCanonicalName(), (Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
