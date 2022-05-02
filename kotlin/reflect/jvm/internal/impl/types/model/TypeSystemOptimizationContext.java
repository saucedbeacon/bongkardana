package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public interface TypeSystemOptimizationContext {

    public static final class DefaultImpls {
        public static boolean identicalArguments(@NotNull TypeSystemOptimizationContext typeSystemOptimizationContext, @NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2) {
            Intrinsics.checkNotNullParameter(typeSystemOptimizationContext, "this");
            Intrinsics.checkNotNullParameter(simpleTypeMarker, "a");
            Intrinsics.checkNotNullParameter(simpleTypeMarker2, "b");
            return false;
        }
    }

    boolean identicalArguments(@NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2);
}
