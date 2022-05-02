package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

public final class NameUtils {
    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();
    @NotNull
    private static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");

    private NameUtils() {
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace((CharSequence) str, "_");
    }
}
