package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import org.jetbrains.annotations.NotNull;

public final class DeprecationKt {
    @NotNull
    private static final CallableDescriptor.UserDataKey<Object> DEPRECATED_FUNCTION_KEY = new DeprecationKt$DEPRECATED_FUNCTION_KEY$1();

    @NotNull
    public static final CallableDescriptor.UserDataKey<Object> getDEPRECATED_FUNCTION_KEY() {
        return DEPRECATED_FUNCTION_KEY;
    }
}
