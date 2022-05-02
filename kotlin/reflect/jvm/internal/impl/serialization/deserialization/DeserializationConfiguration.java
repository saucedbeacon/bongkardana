package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public interface DeserializationConfiguration {

    public static final class DefaultImpls {
        public static boolean getAllowUnstableDependencies(@NotNull DeserializationConfiguration deserializationConfiguration) {
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "this");
            return false;
        }

        public static boolean getPreserveDeclarationsOrdering(@NotNull DeserializationConfiguration deserializationConfiguration) {
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "this");
            return false;
        }

        public static boolean getReleaseCoroutines(@NotNull DeserializationConfiguration deserializationConfiguration) {
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "this");
            return false;
        }

        public static boolean getReportErrorsOnPreReleaseDependencies(@NotNull DeserializationConfiguration deserializationConfiguration) {
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "this");
            return false;
        }

        public static boolean getSkipMetadataVersionCheck(@NotNull DeserializationConfiguration deserializationConfiguration) {
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "this");
            return false;
        }

        public static boolean getSkipPrereleaseCheck(@NotNull DeserializationConfiguration deserializationConfiguration) {
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "this");
            return false;
        }

        public static boolean getTypeAliasesAllowed(@NotNull DeserializationConfiguration deserializationConfiguration) {
            Intrinsics.checkNotNullParameter(deserializationConfiguration, "this");
            return true;
        }
    }

    boolean getAllowUnstableDependencies();

    boolean getPreserveDeclarationsOrdering();

    boolean getReleaseCoroutines();

    boolean getReportErrorsOnPreReleaseDependencies();

    boolean getSkipMetadataVersionCheck();

    boolean getSkipPrereleaseCheck();

    boolean getTypeAliasesAllowed();

    public static final class Default implements DeserializationConfiguration {
        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        public final boolean getAllowUnstableDependencies() {
            return DefaultImpls.getAllowUnstableDependencies(this);
        }

        public final boolean getPreserveDeclarationsOrdering() {
            return DefaultImpls.getPreserveDeclarationsOrdering(this);
        }

        public final boolean getReleaseCoroutines() {
            return DefaultImpls.getReleaseCoroutines(this);
        }

        public final boolean getReportErrorsOnPreReleaseDependencies() {
            return DefaultImpls.getReportErrorsOnPreReleaseDependencies(this);
        }

        public final boolean getSkipMetadataVersionCheck() {
            return DefaultImpls.getSkipMetadataVersionCheck(this);
        }

        public final boolean getSkipPrereleaseCheck() {
            return DefaultImpls.getSkipPrereleaseCheck(this);
        }

        public final boolean getTypeAliasesAllowed() {
            return DefaultImpls.getTypeAliasesAllowed(this);
        }
    }
}
