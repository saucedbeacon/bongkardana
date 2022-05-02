package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;

public interface NotNullLazyValue<T> extends Function0<T> {
    boolean isComputed();
}
