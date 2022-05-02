package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {
    @NotNull
    private final ClassDescriptor classDescriptor;
    @NotNull
    private final ClassDescriptor declarationDescriptor;
    @NotNull
    private final ImplicitClassReceiver original;

    public ImplicitClassReceiver(@NotNull ClassDescriptor classDescriptor2, @Nullable ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
        this.classDescriptor = classDescriptor2;
        this.original = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.declarationDescriptor = this.classDescriptor;
    }

    @NotNull
    public final ClassDescriptor getClassDescriptor() {
        return this.classDescriptor;
    }

    @NotNull
    public SimpleType getType() {
        SimpleType defaultType = this.classDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "classDescriptor.defaultType");
        return defaultType;
    }

    public boolean equals(@Nullable Object obj) {
        ClassDescriptor classDescriptor2 = this.classDescriptor;
        ClassDescriptor classDescriptor3 = null;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        if (implicitClassReceiver != null) {
            classDescriptor3 = implicitClassReceiver.classDescriptor;
        }
        return Intrinsics.areEqual((Object) classDescriptor2, (Object) classDescriptor3);
    }

    public int hashCode() {
        return this.classDescriptor.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        sb.append(getType());
        sb.append('}');
        return sb.toString();
    }
}
