package kotlin.reflect.jvm.internal.impl.renderer;

import com.j256.ormlite.stmt.query.SimpleComparison;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public enum RenderingFormat {
    ;

    @NotNull
    public abstract String escape(@NotNull String str);

    static final class PLAIN extends RenderingFormat {
        @NotNull
        public final String escape(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "string");
            return str;
        }

        PLAIN(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }
    }

    static final class HTML extends RenderingFormat {
        HTML(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final String escape(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "string");
            return StringsKt.replace$default(StringsKt.replace$default(str, SimpleComparison.LESS_THAN_OPERATION, "&lt;", false, 4, (Object) null), SimpleComparison.GREATER_THAN_OPERATION, "&gt;", false, 4, (Object) null);
        }
    }
}
