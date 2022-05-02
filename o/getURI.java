package o;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 4, 2})
public final class getURI {
    public static final boolean length(@NotNull String str) {
        return buildHandShake.setMin(str);
    }

    public static /* synthetic */ int getMax(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) getMin(str, (long) i, (long) i2, (long) i3);
    }

    public static final long getMin(@NotNull String str, long j, long j2, long j3) {
        String min = connectNetwork.setMin(str);
        if (min == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(min);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            sb.append("..");
            sb.append(j3);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' has unrecognized value '");
        sb2.append(min);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }
}
