package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

public interface ModuleVisibilityHelper {
    boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2);

    public static final class EMPTY implements ModuleVisibilityHelper {
        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        public final boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
            Intrinsics.checkNotNullParameter(declarationDescriptor, "what");
            Intrinsics.checkNotNullParameter(declarationDescriptor2, "from");
            return true;
        }

        private EMPTY() {
        }
    }
}
