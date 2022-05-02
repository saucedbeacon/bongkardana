package kotlin.comparisons;

import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a&\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a&\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005\u001a+\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\bø\u0001\u0000¢\u0006\u0004\b'\u0010\b\u001a&\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010\f\u001a\"\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u000f\u001a+\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0011\u001a&\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0014\u001a\"\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0017\u001a+\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\bø\u0001\u0000¢\u0006\u0004\b-\u0010\u0019\u001a&\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001c\u001a\"\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a+\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\bø\u0001\u0000¢\u0006\u0004\b0\u0010!\u001a&\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010$\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"maxOf", "Lkotlin/UByte;", "a", "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", "other", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {1, 4, 1}, xi = 1, xs = "kotlin/comparisons/UComparisonsKt")
public class UComparisonsKt___UComparisonsKt {
    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: maxOf-J1ME1BU  reason: not valid java name */
    public static final int m1421maxOfJ1ME1BU(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2) >= 0 ? i : i2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: maxOf-eb3DHEI  reason: not valid java name */
    public static final long m1429maxOfeb3DHEI(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2) >= 0 ? j : j2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: maxOf-Kr8caGY  reason: not valid java name */
    public static final byte m1422maxOfKr8caGY(byte b, byte b2) {
        return Intrinsics.compare((int) b & 255, (int) b2 & 255) >= 0 ? b : b2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: maxOf-5PvTz6A  reason: not valid java name */
    public static final short m1420maxOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare((int) s & UShort.MAX_VALUE, (int) 65535 & s2) >= 0 ? s : s2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA  reason: not valid java name */
    private static final int m1426maxOfWZ9TVnA(int i, int i2, int i3) {
        return UComparisonsKt.m1421maxOfJ1ME1BU(i, UComparisonsKt.m1421maxOfJ1ME1BU(i2, i3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: maxOf-sambcqE  reason: not valid java name */
    private static final long m1430maxOfsambcqE(long j, long j2, long j3) {
        return UComparisonsKt.m1429maxOfeb3DHEI(j, UComparisonsKt.m1429maxOfeb3DHEI(j2, j3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: maxOf-b33U2AM  reason: not valid java name */
    private static final byte m1428maxOfb33U2AM(byte b, byte b2, byte b3) {
        return UComparisonsKt.m1422maxOfKr8caGY(b, UComparisonsKt.m1422maxOfKr8caGY(b2, b3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ  reason: not valid java name */
    private static final short m1425maxOfVKSA0NQ(short s, short s2, short s3) {
        return UComparisonsKt.m1420maxOf5PvTz6A(s, UComparisonsKt.m1420maxOf5PvTz6A(s2, s3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: maxOf-Md2H83M  reason: not valid java name */
    public static final int m1423maxOfMd2H83M(int i, @NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, H5ResourceHandlerUtil.OTHER);
        for (int r2 : iArr) {
            i = UComparisonsKt.m1421maxOfJ1ME1BU(i, r2);
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: maxOf-R03FKyM  reason: not valid java name */
    public static final long m1424maxOfR03FKyM(long j, @NotNull long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, H5ResourceHandlerUtil.OTHER);
        for (long r2 : jArr) {
            j = UComparisonsKt.m1429maxOfeb3DHEI(j, r2);
        }
        return j;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: maxOf-Wr6uiD8  reason: not valid java name */
    public static final byte m1427maxOfWr6uiD8(byte b, @NotNull byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, H5ResourceHandlerUtil.OTHER);
        for (byte r2 : bArr) {
            b = UComparisonsKt.m1422maxOfKr8caGY(b, r2);
        }
        return b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: maxOf-t1qELG4  reason: not valid java name */
    public static final short m1431maxOft1qELG4(short s, @NotNull short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, H5ResourceHandlerUtil.OTHER);
        for (short r2 : sArr) {
            s = UComparisonsKt.m1420maxOf5PvTz6A(s, r2);
        }
        return s;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: minOf-J1ME1BU  reason: not valid java name */
    public static final int m1433minOfJ1ME1BU(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2) <= 0 ? i : i2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: minOf-eb3DHEI  reason: not valid java name */
    public static final long m1441minOfeb3DHEI(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2) <= 0 ? j : j2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: minOf-Kr8caGY  reason: not valid java name */
    public static final byte m1434minOfKr8caGY(byte b, byte b2) {
        return Intrinsics.compare((int) b & 255, (int) b2 & 255) <= 0 ? b : b2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    /* renamed from: minOf-5PvTz6A  reason: not valid java name */
    public static final short m1432minOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare((int) s & UShort.MAX_VALUE, (int) 65535 & s2) <= 0 ? s : s2;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA  reason: not valid java name */
    private static final int m1438minOfWZ9TVnA(int i, int i2, int i3) {
        return UComparisonsKt.m1433minOfJ1ME1BU(i, UComparisonsKt.m1433minOfJ1ME1BU(i2, i3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: minOf-sambcqE  reason: not valid java name */
    private static final long m1442minOfsambcqE(long j, long j2, long j3) {
        return UComparisonsKt.m1441minOfeb3DHEI(j, UComparisonsKt.m1441minOfeb3DHEI(j2, j3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: minOf-b33U2AM  reason: not valid java name */
    private static final byte m1440minOfb33U2AM(byte b, byte b2, byte b3) {
        return UComparisonsKt.m1434minOfKr8caGY(b, UComparisonsKt.m1434minOfKr8caGY(b2, b3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.3")
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ  reason: not valid java name */
    private static final short m1437minOfVKSA0NQ(short s, short s2, short s3) {
        return UComparisonsKt.m1432minOf5PvTz6A(s, UComparisonsKt.m1432minOf5PvTz6A(s2, s3));
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: minOf-Md2H83M  reason: not valid java name */
    public static final int m1435minOfMd2H83M(int i, @NotNull int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, H5ResourceHandlerUtil.OTHER);
        for (int r2 : iArr) {
            i = UComparisonsKt.m1433minOfJ1ME1BU(i, r2);
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: minOf-R03FKyM  reason: not valid java name */
    public static final long m1436minOfR03FKyM(long j, @NotNull long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, H5ResourceHandlerUtil.OTHER);
        for (long r2 : jArr) {
            j = UComparisonsKt.m1441minOfeb3DHEI(j, r2);
        }
        return j;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: minOf-Wr6uiD8  reason: not valid java name */
    public static final byte m1439minOfWr6uiD8(byte b, @NotNull byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, H5ResourceHandlerUtil.OTHER);
        for (byte r2 : bArr) {
            b = UComparisonsKt.m1434minOfKr8caGY(b, r2);
        }
        return b;
    }

    @ExperimentalUnsignedTypes
    @SinceKotlin(version = "1.4")
    /* renamed from: minOf-t1qELG4  reason: not valid java name */
    public static final short m1443minOft1qELG4(short s, @NotNull short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, H5ResourceHandlerUtil.OTHER);
        for (short r2 : sArr) {
            s = UComparisonsKt.m1432minOf5PvTz6A(s, r2);
        }
        return s;
    }
}
