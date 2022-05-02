package kotlin.text;

import java.util.Locale;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\b\u001a\f\u0010\"\u001a\u00020\u001e*\u00020\u0002H\u0007\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", "", "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 4, 1}, xi = 1, xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    @InlineOnly
    private static final boolean isDefined(char c) {
        return Character.isDefined(c);
    }

    @InlineOnly
    private static final boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    @InlineOnly
    private static final boolean isLetterOrDigit(char c) {
        return Character.isLetterOrDigit(c);
    }

    @InlineOnly
    private static final boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    @InlineOnly
    private static final boolean isIdentifierIgnorable(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @InlineOnly
    private static final boolean isISOControl(char c) {
        return Character.isISOControl(c);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierPart(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierStart(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    public static final boolean isWhitespace(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @InlineOnly
    private static final boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    @InlineOnly
    private static final boolean isLowerCase(char c) {
        return Character.isLowerCase(c);
    }

    @InlineOnly
    private static final char toUpperCase(char c) {
        return Character.toUpperCase(c);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final char uppercaseChar(char c) {
        return Character.toUpperCase(c);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final String uppercase(char c) {
        String valueOf = String.valueOf(c);
        if (valueOf != null) {
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
            return upperCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    public static final String uppercase(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        if (valueOf != null) {
            String upperCase = valueOf.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    private static final char toLowerCase(char c) {
        return Character.toLowerCase(c);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final char lowercaseChar(char c) {
        return Character.toLowerCase(c);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final String lowercase(char c) {
        String valueOf = String.valueOf(c);
        if (valueOf != null) {
            String lowerCase = valueOf.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    public static final String lowercase(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        if (valueOf != null) {
            String lowerCase = valueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @InlineOnly
    private static final boolean isTitleCase(char c) {
        return Character.isTitleCase(c);
    }

    @InlineOnly
    private static final char toTitleCase(char c) {
        return Character.toTitleCase(c);
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final char titlecaseChar(char c) {
        return Character.toTitleCase(c);
    }

    @NotNull
    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    public static final String titlecase(char c) {
        String valueOf = String.valueOf(c);
        if (valueOf != null) {
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
            if (upperCase.length() <= 1) {
                return String.valueOf(Character.toTitleCase(c));
            }
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            if (upperCase != null) {
                String substring = upperCase.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                if (substring != null) {
                    String lowerCase = substring.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(charAt));
                    sb.append(lowerCase);
                    return sb.toString();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @NotNull
    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    public static final String titlecase(char c, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String uppercase = CharsKt.uppercase(c, locale);
        if (uppercase.length() <= 1) {
            String valueOf = String.valueOf(c);
            if (valueOf != null) {
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
                if (!Intrinsics.areEqual((Object) uppercase, (Object) upperCase)) {
                    return uppercase;
                }
                return String.valueOf(Character.toTitleCase(c));
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } else if (c == 329) {
            return uppercase;
        } else {
            char charAt = uppercase.charAt(0);
            if (uppercase != null) {
                String substring = uppercase.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                if (substring != null) {
                    String lowerCase = substring.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(charAt));
                    sb.append(lowerCase);
                    return sb.toString();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @NotNull
    public static final CharCategory getCategory(char c) {
        return CharCategory.Companion.valueOf(Character.getType(c));
    }

    @NotNull
    public static final CharDirectionality getDirectionality(char c) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality(c));
    }

    @InlineOnly
    private static final boolean isHighSurrogate(char c) {
        return Character.isHighSurrogate(c);
    }

    @InlineOnly
    private static final boolean isLowSurrogate(char c) {
        return Character.isLowSurrogate(c);
    }

    public static final int digitOf(char c, int i) {
        return Character.digit(c, i);
    }

    @PublishedApi
    public static final int checkRadix(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new IntRange(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
