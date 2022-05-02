package kotlin.text;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 4, 1})
public final class Charsets {
    @NotNull
    public static final Charsets INSTANCE = new Charsets();
    @NotNull
    @JvmField
    public static final Charset ISO_8859_1;
    @NotNull
    @JvmField
    public static final Charset US_ASCII;
    @NotNull
    @JvmField
    public static final Charset UTF_16;
    @NotNull
    @JvmField
    public static final Charset UTF_16BE;
    @NotNull
    @JvmField
    public static final Charset UTF_16LE;
    @NotNull
    @JvmField
    public static final Charset UTF_8;
    private static int getMin = 0;
    private static int setMax = 1;
    private static int setMin;
    private static Charset utf_32;
    private static Charset utf_32be;
    private static Charset utf_32le;

    static void length() {
        getMin = 146;
    }

    static {
        length();
        Charset forName = Charset.forName(setMax(218 - AndroidCharacter.getEastAsianWidth('0'), Color.green(0) + 4, new char[]{16, 2, 65513, 65524, 17}, !KeyEvent.metaStateHasNoModifiers(0), TextUtils.indexOf("", "", 0, 0) + 5).intern());
        Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-8\")");
        UTF_8 = forName;
        Charset forName2 = Charset.forName(C.UTF16_NAME);
        Intrinsics.checkNotNullExpressionValue(forName2, "Charset.forName(\"UTF-16\")");
        UTF_16 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName3, "Charset.forName(\"UTF-16BE\")");
        UTF_16BE = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(forName4, "Charset.forName(\"UTF-16LE\")");
        UTF_16LE = forName4;
        Charset forName5 = Charset.forName(C.ASCII_NAME);
        Intrinsics.checkNotNullExpressionValue(forName5, "Charset.forName(\"US-ASCII\")");
        US_ASCII = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(forName6, "Charset.forName(\"ISO-8859-1\")");
        ISO_8859_1 = forName6;
        int i = setMin + 5;
        setMax = i % 128;
        if ((i % 2 == 0 ? 'B' : 'U') != 'U') {
            Object obj = null;
            super.hashCode();
        }
    }

    private Charsets() {
    }

    @NotNull
    @JvmName(name = "UTF32")
    public final Charset UTF32() {
        int i = setMin + 111;
        setMax = i % 128;
        int i2 = i % 2;
        Charset charset = utf_32;
        if (!(charset != null)) {
            try {
                charset = Charset.forName("UTF-32");
                Intrinsics.checkNotNullExpressionValue(charset, "Charset.forName(\"UTF-32\")");
                utf_32 = charset;
                int i3 = setMin + 17;
                setMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        return charset;
    }

    @NotNull
    @JvmName(name = "UTF32_LE")
    public final Charset UTF32_LE() {
        Charset forName;
        try {
            Charset charset = utf_32le;
            boolean z = true;
            if (!(charset != null)) {
                int i = setMax + 85;
                setMin = i % 128;
                if (i % 2 != 0) {
                    z = false;
                }
                if (z) {
                    forName = Charset.forName("UTF-32LE");
                    Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-32LE\")");
                    utf_32le = forName;
                } else {
                    forName = Charset.forName("UTF-32LE");
                    Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-32LE\")");
                    utf_32le = forName;
                    Object obj = null;
                    super.hashCode();
                }
                charset = forName;
            }
            int i2 = setMax + 113;
            setMin = i2 % 128;
            if ((i2 % 2 != 0 ? 'R' : 29) != 'R') {
                return charset;
            }
            int i3 = 92 / 0;
            return charset;
        } catch (Exception e) {
            throw e;
        }
    }

    @NotNull
    @JvmName(name = "UTF32_BE")
    public final Charset UTF32_BE() {
        try {
            int i = setMin + 111;
            setMax = i % 128;
            if ((i % 2 == 0 ? '6' : Typography.dollar) != '6') {
                Charset charset = utf_32be;
                if ((charset == null ? '%' : 6) == 6) {
                    return charset;
                }
            } else {
                Charset charset2 = utf_32be;
                Object obj = null;
                super.hashCode();
                if (!(charset2 == null)) {
                    return charset2;
                }
            }
            Charset forName = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-32BE\")");
            utf_32be = forName;
            int i2 = setMax + 71;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            return forName;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String setMax(int i, int i2, char[] cArr, boolean z, int i3) {
        int i4;
        char[] cArr2;
        int i5 = setMax + 83;
        setMin = i5 % 128;
        if (i5 % 2 != 0) {
            cArr2 = new char[i3];
            i4 = 1;
        } else {
            cArr2 = new char[i3];
            i4 = 0;
        }
        while (i4 < i3) {
            cArr2[i4] = (char) (cArr[i4] + i);
            cArr2[i4] = (char) (cArr2[i4] - getMin);
            i4++;
            try {
                int i6 = setMin + 43;
                try {
                    setMax = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        if (i2 > 0) {
            int i8 = setMin + 69;
            setMax = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i10 = i3 - i2;
            System.arraycopy(cArr3, 0, cArr2, i10, i2);
            System.arraycopy(cArr3, i2, cArr2, 0, i10);
        }
        if (z) {
            int i11 = setMax + 29;
            setMin = i11 % 128;
            if (i11 % 2 != 0) {
            }
            char[] cArr4 = new char[i3];
            int i12 = 0;
            while (i12 < i3) {
                int i13 = setMax + 21;
                setMin = i13 % 128;
                if (!(i13 % 2 == 0)) {
                    cArr4[i12] = cArr2[(i3 * i12) / 0];
                    i12 += 81;
                } else {
                    cArr4[i12] = cArr2[(i3 - i12) - 1];
                    i12++;
                }
            }
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
