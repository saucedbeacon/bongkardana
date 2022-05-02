package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IntegerValueTypeConstructor implements TypeConstructor {
    @NotNull
    private final ModuleDescriptor module;
    @NotNull
    private final ArrayList<KotlinType> supertypes;
    private final long value;

    @Nullable
    public final Void getDeclarationDescriptor() {
        return null;
    }

    public final boolean isDenotable() {
        return false;
    }

    @NotNull
    public final Collection<KotlinType> getSupertypes() {
        return this.supertypes;
    }

    @NotNull
    public final List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @NotNull
    public final TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerValueType(");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }
}
