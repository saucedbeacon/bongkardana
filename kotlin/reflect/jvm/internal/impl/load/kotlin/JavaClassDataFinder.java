package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaClassDataFinder implements ClassDataFinder {
    @NotNull
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    @NotNull
    private final KotlinClassFinder kotlinClassFinder;

    public JavaClassDataFinder(@NotNull KotlinClassFinder kotlinClassFinder2, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver2) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder2, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver2, "deserializedDescriptorResolver");
        this.kotlinClassFinder = kotlinClassFinder2;
        this.deserializedDescriptorResolver = deserializedDescriptorResolver2;
    }

    @Nullable
    public final ClassData findClassData(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, classId);
        if (findKotlinClass == null) {
            return null;
        }
        boolean areEqual = Intrinsics.areEqual((Object) findKotlinClass.getClassId(), (Object) classId);
        if (!_Assertions.ENABLED || areEqual) {
            return this.deserializedDescriptorResolver.readClassData$descriptors_jvm(findKotlinClass);
        }
        StringBuilder sb = new StringBuilder("Class with incorrect id found: expected ");
        sb.append(classId);
        sb.append(", actual ");
        sb.append(findKotlinClass.getClassId());
        throw new AssertionError(sb.toString());
    }
}
