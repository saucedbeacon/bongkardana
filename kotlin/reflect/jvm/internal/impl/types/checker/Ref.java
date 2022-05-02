package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.Nullable;

public final class Ref<T> {
    @Nullable
    private T value;

    public Ref(@Nullable T t) {
        this.value = t;
    }

    @Nullable
    public final T getValue() {
        return this.value;
    }
}
