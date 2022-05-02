package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.CharCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"code", "", "", "getCode$annotations", "(C)V", "getCode", "(C)I", "Char", "kotlin-stdlib"}, k = 2, mv = {1, 4, 1})
public final class CharCodeKt {
    /* access modifiers changed from: private */
    public static final int getCode(char c) {
        return c;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @InlineOnly
    public static /* synthetic */ void getCode$annotations(char c) {
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final char Char(int i) {
        if (i >= getCode(0) && i <= getCode(CharCompanionObject.MAX_VALUE)) {
            return (char) (UShort.m220constructorimpl((short) i) & UShort.MAX_VALUE);
        }
        throw new IllegalArgumentException("Invalid Char code: ".concat(String.valueOf(i)));
    }
}
