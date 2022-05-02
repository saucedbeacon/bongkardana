package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

public interface JavaClassesTracker {
    void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor);

    public static final class Default implements JavaClassesTracker {
        @NotNull
        public static final Default INSTANCE = new Default();

        public final void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor) {
            Intrinsics.checkNotNullParameter(javaClassDescriptor, "classDescriptor");
        }

        private Default() {
        }
    }
}
