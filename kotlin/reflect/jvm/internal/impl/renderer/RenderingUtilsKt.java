package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

public final class RenderingUtilsKt {
    @NotNull
    public static final String render(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        boolean shouldBeEscaped = shouldBeEscaped(name);
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString()");
        return shouldBeEscaped ? Intrinsics.stringPlus("`".concat(String.valueOf(asString)), "`") : asString;
    }

    private static final boolean shouldBeEscaped(Name name) {
        boolean z;
        if (name.isSpecial()) {
            return false;
        }
        String asString = name.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "asString()");
        if (!KeywordStringsGenerated.KEYWORDS.contains(asString)) {
            CharSequence charSequence = asString;
            int i = 0;
            while (true) {
                if (i >= charSequence.length()) {
                    z = false;
                    break;
                }
                char charAt = charSequence.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        Intrinsics.checkNotNullParameter(fqNameUnsafe, "<this>");
        List<Name> pathSegments = fqNameUnsafe.pathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments()");
        return renderFqName(pathSegments);
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> list) {
        Intrinsics.checkNotNullParameter(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (Name next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render(next));
        }
        String obj = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "StringBuilder().apply(builderAction).toString()");
        return obj;
    }
}
