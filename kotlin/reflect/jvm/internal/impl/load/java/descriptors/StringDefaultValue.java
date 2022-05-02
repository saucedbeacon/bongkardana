package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class StringDefaultValue extends AnnotationDefaultValue {
    @NotNull
    private final String value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringDefaultValue(@NotNull String str) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "value");
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
