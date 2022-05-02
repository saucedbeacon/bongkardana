package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaVisibilities {
    @NotNull
    public static final JavaVisibilities INSTANCE = new JavaVisibilities();

    public static final class PackageVisibility extends Visibility {
        @NotNull
        public static final PackageVisibility INSTANCE = new PackageVisibility();

        @NotNull
        public final String getInternalDisplayName() {
            return "public/*package*/";
        }

        private PackageVisibility() {
            super("package", false);
        }

        @Nullable
        public final Integer compareTo(@NotNull Visibility visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            if (Visibilities.INSTANCE.isPrivate(visibility)) {
                return 1;
            }
            return -1;
        }

        @NotNull
        public final Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    private JavaVisibilities() {
    }

    public static final class ProtectedStaticVisibility extends Visibility {
        @NotNull
        public static final ProtectedStaticVisibility INSTANCE = new ProtectedStaticVisibility();

        @NotNull
        public final String getInternalDisplayName() {
            return "protected/*protected static*/";
        }

        private ProtectedStaticVisibility() {
            super("protected_static", true);
        }

        @NotNull
        public final Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {
        @NotNull
        public static final ProtectedAndPackage INSTANCE = new ProtectedAndPackage();

        @NotNull
        public final String getInternalDisplayName() {
            return "protected/*protected and package*/";
        }

        private ProtectedAndPackage() {
            super("protected_and_package", true);
        }

        @Nullable
        public final Integer compareTo(@NotNull Visibility visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            if (Intrinsics.areEqual((Object) this, (Object) visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.INSTANCE) {
                return null;
            }
            return Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1;
        }

        @NotNull
        public final Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }
}
