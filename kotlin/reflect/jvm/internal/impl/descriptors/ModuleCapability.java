package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ModuleCapability<T> {
    @NotNull
    private final String name;

    public ModuleCapability(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.name = str;
    }

    @NotNull
    public final String toString() {
        return this.name;
    }
}
