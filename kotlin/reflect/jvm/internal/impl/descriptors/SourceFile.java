package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.Nullable;

public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new SourceFile() {
        @Nullable
        public final String getName() {
            return null;
        }
    };

    @Nullable
    String getName();
}
