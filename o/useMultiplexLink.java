package o;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/data/security/SecureString;", "", "chars", "", "([C)V", "start", "", "end", "([CII)V", "length", "getLength", "()I", "clear", "", "get", "", "index", "subSequence", "startIndex", "endIndex", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class useMultiplexLink implements CharSequence {
    private final char[] chars;

    public useMultiplexLink(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "chars");
        this.chars = ArraysKt.copyOfRange(cArr, i, i2);
    }

    public final char charAt(int i) {
        return get(i);
    }

    public final int length() {
        return getLength();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public useMultiplexLink(@NotNull char[] cArr) {
        this(cArr, 0, cArr.length);
        Intrinsics.checkNotNullParameter(cArr, "chars");
    }

    public final int getLength() {
        return this.chars.length;
    }

    public final char get(int i) {
        return this.chars[i];
    }

    @NotNull
    public final CharSequence subSequence(int i, int i2) {
        return new useMultiplexLink(this.chars, i, i2);
    }

    public final void clear() {
        ArraysKt.fill$default(this.chars, '0', 0, 0, 6, (Object) null);
    }

    @NotNull
    public final String toString() {
        return StringsKt.concatToString(this.chars);
    }
}
