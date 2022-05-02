package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LocalClassifierTypeSettings {
    @Nullable
    SimpleType getReplacementTypeForLocalClassifiers();

    public static final class Default implements LocalClassifierTypeSettings {
        @NotNull
        public static final Default INSTANCE = new Default();

        @Nullable
        public final SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }

        private Default() {
        }
    }
}
