package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TypeAndDefaultQualifiers {
    @Nullable
    private final JavaDefaultQualifiers defaultQualifiers;
    private final boolean isFromStarProjection;
    @NotNull
    private final KotlinType type;
    @Nullable
    private final TypeParameterDescriptor typeParameterForArgument;

    @NotNull
    public final KotlinType component1() {
        return this.type;
    }

    @Nullable
    public final JavaDefaultQualifiers component2() {
        return this.defaultQualifiers;
    }

    @Nullable
    public final TypeParameterDescriptor component3() {
        return this.typeParameterForArgument;
    }

    public final boolean component4() {
        return this.isFromStarProjection;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeAndDefaultQualifiers)) {
            return false;
        }
        TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) typeAndDefaultQualifiers.type) && Intrinsics.areEqual((Object) this.defaultQualifiers, (Object) typeAndDefaultQualifiers.defaultQualifiers) && Intrinsics.areEqual((Object) this.typeParameterForArgument, (Object) typeAndDefaultQualifiers.typeParameterForArgument) && this.isFromStarProjection == typeAndDefaultQualifiers.isFromStarProjection;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        JavaDefaultQualifiers javaDefaultQualifiers = this.defaultQualifiers;
        int i = 0;
        int hashCode2 = (hashCode + (javaDefaultQualifiers == null ? 0 : javaDefaultQualifiers.hashCode())) * 31;
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterForArgument;
        if (typeParameterDescriptor != null) {
            i = typeParameterDescriptor.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.isFromStarProjection;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAndDefaultQualifiers(type=");
        sb.append(this.type);
        sb.append(", defaultQualifiers=");
        sb.append(this.defaultQualifiers);
        sb.append(", typeParameterForArgument=");
        sb.append(this.typeParameterForArgument);
        sb.append(", isFromStarProjection=");
        sb.append(this.isFromStarProjection);
        sb.append(')');
        return sb.toString();
    }

    public TypeAndDefaultQualifiers(@NotNull KotlinType kotlinType, @Nullable JavaDefaultQualifiers javaDefaultQualifiers, @Nullable TypeParameterDescriptor typeParameterDescriptor, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType, "type");
        this.type = kotlinType;
        this.defaultQualifiers = javaDefaultQualifiers;
        this.typeParameterForArgument = typeParameterDescriptor;
        this.isFromStarProjection = z;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }
}
