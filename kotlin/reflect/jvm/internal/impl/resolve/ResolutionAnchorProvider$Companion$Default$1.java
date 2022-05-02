package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ResolutionAnchorProvider$Companion$Default$1 implements ResolutionAnchorProvider {
    @Nullable
    public final ModuleDescriptor getResolutionAnchor(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        return null;
    }

    ResolutionAnchorProvider$Companion$Default$1() {
    }
}
