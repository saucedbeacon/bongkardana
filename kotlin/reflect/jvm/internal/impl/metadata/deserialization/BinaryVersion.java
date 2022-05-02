package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class BinaryVersion {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int major;
    private final int minor;
    @NotNull
    private final int[] numbers;
    private final int patch;
    @NotNull
    private final List<Integer> rest;

    public BinaryVersion(@NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "numbers");
        this.numbers = iArr;
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        int i = -1;
        this.major = orNull == null ? -1 : orNull.intValue();
        Integer orNull2 = ArraysKt.getOrNull(this.numbers, 1);
        this.minor = orNull2 == null ? -1 : orNull2.intValue();
        Integer orNull3 = ArraysKt.getOrNull(this.numbers, 2);
        this.patch = orNull3 != null ? orNull3.intValue() : i;
        int[] iArr2 = this.numbers;
        this.rest = iArr2.length > 3 ? CollectionsKt.toList(ArraysKt.asList(iArr2).subList(3, this.numbers.length)) : CollectionsKt.emptyList();
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    @NotNull
    public final int[] toArray() {
        return this.numbers;
    }

    /* access modifiers changed from: protected */
    public final boolean isCompatibleTo(@NotNull BinaryVersion binaryVersion) {
        Intrinsics.checkNotNullParameter(binaryVersion, "ourVersion");
        int i = this.major;
        return i == 0 ? binaryVersion.major == 0 && this.minor == binaryVersion.minor : i == binaryVersion.major && this.minor <= binaryVersion.minor;
    }

    public final boolean isAtLeast(@NotNull BinaryVersion binaryVersion) {
        Intrinsics.checkNotNullParameter(binaryVersion, "version");
        return isAtLeast(binaryVersion.major, binaryVersion.minor, binaryVersion.patch);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.patch >= i3;
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.patch <= i3;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int i2 = array[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        List list = arrayList;
        return list.isEmpty() ? "unknown" : CollectionsKt.joinToString$default(list, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !Intrinsics.areEqual((Object) getClass(), (Object) obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual((Object) this.rest, (Object) binaryVersion.rest);
    }

    public int hashCode() {
        int i = this.major;
        int i2 = i + (i * 31) + this.minor;
        int i3 = i2 + (i2 * 31) + this.patch;
        return i3 + (i3 * 31) + this.rest.hashCode();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
