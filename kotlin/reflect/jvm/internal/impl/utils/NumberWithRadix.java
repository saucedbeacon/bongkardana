package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NumberWithRadix {
    @NotNull
    private final String number;
    private final int radix;

    @NotNull
    public final String component1() {
        return this.number;
    }

    public final int component2() {
        return this.radix;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumberWithRadix)) {
            return false;
        }
        NumberWithRadix numberWithRadix = (NumberWithRadix) obj;
        return Intrinsics.areEqual((Object) this.number, (Object) numberWithRadix.number) && this.radix == numberWithRadix.radix;
    }

    public final int hashCode() {
        return (this.number.hashCode() * 31) + this.radix;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NumberWithRadix(number=");
        sb.append(this.number);
        sb.append(", radix=");
        sb.append(this.radix);
        sb.append(')');
        return sb.toString();
    }

    public NumberWithRadix(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "number");
        this.number = str;
        this.radix = i;
    }
}
