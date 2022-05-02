package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Constant extends JavaDefaultValue {
    @NotNull
    private final Object value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Constant(@NotNull Object obj) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(obj, "value");
        this.value = obj;
    }
}
