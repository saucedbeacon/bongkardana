package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

final class SimpleTypeImpl extends SimpleType {
    @NotNull
    private final List<TypeProjection> arguments;
    @NotNull
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;
    @NotNull
    private final MemberScope memberScope;
    @NotNull
    private final Function1<KotlinTypeRefiner, SimpleType> refinedTypeFactory;

    @NotNull
    public final TypeConstructor getConstructor() {
        return this.constructor;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public final boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @NotNull
    public final MemberScope getMemberScope() {
        return this.memberScope;
    }

    public SimpleTypeImpl(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope2, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        Intrinsics.checkNotNullParameter(typeConstructor, "constructor");
        Intrinsics.checkNotNullParameter(list, "arguments");
        Intrinsics.checkNotNullParameter(memberScope2, "memberScope");
        Intrinsics.checkNotNullParameter(function1, "refinedTypeFactory");
        this.constructor = typeConstructor;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.memberScope = memberScope2;
        this.refinedTypeFactory = function1;
        if (getMemberScope() instanceof ErrorUtils.ErrorScope) {
            StringBuilder sb = new StringBuilder("SimpleTypeImpl should not be created for error type: ");
            sb.append(getMemberScope());
            sb.append(10);
            sb.append(getConstructor());
            throw new IllegalStateException(sb.toString());
        }
    }

    @NotNull
    public final Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @NotNull
    public final SimpleType replaceAnnotations(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "newAnnotations");
        if (annotations.isEmpty()) {
            return this;
        }
        return new AnnotatedSimpleType(this, annotations);
    }

    @NotNull
    public final SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        if (z) {
            return new NullableSimpleType(this);
        }
        return new NotNullSimpleType(this);
    }

    @NotNull
    public final SimpleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType invoke = this.refinedTypeFactory.invoke(kotlinTypeRefiner);
        return invoke == null ? this : invoke;
    }
}
