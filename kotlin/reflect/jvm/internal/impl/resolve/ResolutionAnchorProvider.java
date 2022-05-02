package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ResolutionAnchorProvider {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Nullable
    ModuleDescriptor getResolutionAnchor(@NotNull ModuleDescriptor moduleDescriptor);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final ResolutionAnchorProvider Default = new ResolutionAnchorProvider$Companion$Default$1();

        private Companion() {
        }
    }
}
