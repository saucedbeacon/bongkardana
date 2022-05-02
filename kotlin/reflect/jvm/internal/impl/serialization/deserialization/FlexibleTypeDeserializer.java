package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

public interface FlexibleTypeDeserializer {
    @NotNull
    KotlinType create(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2);

    public static final class ThrowException implements FlexibleTypeDeserializer {
        @NotNull
        public static final ThrowException INSTANCE = new ThrowException();

        private ThrowException() {
        }

        @NotNull
        public final KotlinType create(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
            Intrinsics.checkNotNullParameter(type, "proto");
            Intrinsics.checkNotNullParameter(str, "flexibleId");
            Intrinsics.checkNotNullParameter(simpleType, "lowerBound");
            Intrinsics.checkNotNullParameter(simpleType2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }
}
