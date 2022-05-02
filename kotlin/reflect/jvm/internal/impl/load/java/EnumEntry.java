package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

public final class EnumEntry extends JavaDefaultValue {
    @NotNull
    private final ClassDescriptor descriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumEntry(@NotNull ClassDescriptor classDescriptor) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(classDescriptor, "descriptor");
        this.descriptor = classDescriptor;
    }
}
