package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\n\u0010\r\u001a\u00020\u0004*\u00020\u0004¨\u0006\u000e"}, d2 = {"Lid/dana/domain/util/StringUtil;", "", "()V", "camelToSentenceCase", "", "camelCaseString", "getDateTime", "pattern", "locale", "Ljava/util/Locale;", "timeZone", "maskName", "givenName", "capitalizeWords", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class startBluetoothDevicesDiscovery {
    @NotNull
    public static final startBluetoothDevicesDiscovery INSTANCE = new startBluetoothDevicesDiscovery();

    private startBluetoothDevicesDiscovery() {
    }

    @JvmStatic
    @NotNull
    public static final String maskName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "givenName");
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = str;
        if (charSequence.length() > 0) {
            Object[] array = new Regex(" ").split(StringsKt.trim(charSequence).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    int i2 = 3;
                    if (str2.length() <= 3) {
                        i2 = str2.length() > 0 ? 1 : 0;
                    }
                    if (str2 != null) {
                        String substring = str2.substring(0, i2);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        int length2 = str2.length();
                        if (str2 != null) {
                            String substring2 = str2.substring(i2, length2);
                            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            String replace = new Regex("(?s).").replace((CharSequence) substring2, "•");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(substring);
                            sb2.append(replace);
                            String obj = sb2.toString();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(obj);
                            sb3.append(' ');
                            sb.append(sb3.toString());
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        String obj2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "builder.toString()");
        return obj2;
    }

    @JvmStatic
    @NotNull
    public static final String camelToSentenceCase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "camelCaseString");
        return INSTANCE.capitalizeWords(new Regex("(?<=[a-zA-Z])[A-Z]").replace((CharSequence) str, (Function1<? super MatchResult, ? extends CharSequence>) setMax.INSTANCE));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<MatchResult, CharSequence> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        @NotNull
        public final CharSequence invoke(@NotNull MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "it");
            StringBuilder sb = new StringBuilder(" ");
            sb.append(matchResult.getValue());
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<String, CharSequence> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        @NotNull
        public final CharSequence invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return StringsKt.capitalize(str);
        }
    }

    @NotNull
    public final String capitalizeWords(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$capitalizeWords");
        return CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, setMin.INSTANCE, 30, (Object) null);
    }

    @JvmStatic
    @NotNull
    public static final String getDateTime(@NotNull String str, @NotNull Locale locale, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "pattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        if (str2 != null) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str2));
        }
        String format = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(Date())");
        return format;
    }
}
