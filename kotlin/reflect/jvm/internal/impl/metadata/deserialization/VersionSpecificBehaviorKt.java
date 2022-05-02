package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class VersionSpecificBehaviorKt {
    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion binaryVersion) {
        Intrinsics.checkNotNullParameter(binaryVersion, "version");
        return isKotlin1Dot4OrLater(binaryVersion);
    }

    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion binaryVersion) {
        Intrinsics.checkNotNullParameter(binaryVersion, "version");
        return binaryVersion.getMajor() == 1 && binaryVersion.getMinor() >= 4;
    }
}
