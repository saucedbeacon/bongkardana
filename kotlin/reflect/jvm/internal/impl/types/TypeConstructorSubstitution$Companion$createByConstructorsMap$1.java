package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeConstructorSubstitution$Companion$createByConstructorsMap$1 extends TypeConstructorSubstitution {
    final /* synthetic */ boolean $approximateCapturedTypes;
    final /* synthetic */ Map<TypeConstructor, TypeProjection> $map;

    TypeConstructorSubstitution$Companion$createByConstructorsMap$1(Map<TypeConstructor, ? extends TypeProjection> map, boolean z) {
        this.$map = map;
        this.$approximateCapturedTypes = z;
    }

    @Nullable
    public final TypeProjection get(@NotNull TypeConstructor typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "key");
        return this.$map.get(typeConstructor);
    }

    public final boolean isEmpty() {
        return this.$map.isEmpty();
    }

    public final boolean approximateCapturedTypes() {
        return this.$approximateCapturedTypes;
    }
}
