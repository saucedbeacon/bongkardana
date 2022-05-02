package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;

public interface JavaResolverSettings {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    boolean getCorrectNullabilityForNotNullTypeParameter();

    boolean getTypeEnhancementImprovements();

    boolean isReleaseCoroutines();

    public static final class Default implements JavaResolverSettings {
        @NotNull
        public static final Default INSTANCE = new Default();

        public final boolean getCorrectNullabilityForNotNullTypeParameter() {
            return false;
        }

        public final boolean getTypeEnhancementImprovements() {
            return false;
        }

        public final boolean isReleaseCoroutines() {
            return false;
        }

        private Default() {
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
