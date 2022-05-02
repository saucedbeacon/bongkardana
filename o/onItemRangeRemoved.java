package o;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppNode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"RFC1123_FORMAT", "", "dateFormatTimeZone", "dateFormatUTC", "dateFormatterTimeZone", "Ljava/text/SimpleDateFormat;", "getDateFormatterTimeZone", "()Ljava/text/SimpleDateFormat;", "dateFormatterUTC", "fromRFC1123Date", "Ljava/util/Date;", "date", "fromRFC3339Date", "toRFC3339Date", "verify_release"}, k = 2, mv = {1, 1, 16})
public final class onItemRangeRemoved {
    @NotNull
    private static final SimpleDateFormat getMin = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
    private static final SimpleDateFormat length;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        length = simpleDateFormat;
    }

    @NotNull
    public static final Date setMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, AppNode.AnonymousClass2.KEY_DATE);
        try {
            if (StringsKt.endsWith$default(str, "Z", false, 2, (Object) null)) {
                Date parse = length.parse(str);
                Intrinsics.checkExpressionValueIsNotNull(parse, "dateFormatterUTC.parse(date)");
                return parse;
            }
            String substring = str.substring(0, StringsKt.lastIndexOf$default((CharSequence) str, '-', 0, false, 6, (Object) null));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring2 = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, '-', 0, false, 6, (Object) null));
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            int indexOf$default = StringsKt.indexOf$default((CharSequence) substring2, ':', 0, false, 6, (Object) null);
            if (substring2 != null) {
                String substring3 = substring2.substring(0, indexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(substring3);
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) substring2, ':', 0, false, 6, (Object) null) + 1;
                if (substring2 != null) {
                    String substring4 = substring2.substring(indexOf$default2);
                    Intrinsics.checkExpressionValueIsNotNull(substring4, "(this as java.lang.String).substring(startIndex)");
                    sb.append(substring4);
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(substring);
                    sb2.append(obj);
                    Date parse2 = getMin.parse(sb2.toString());
                    Intrinsics.checkExpressionValueIsNotNull(parse2, "dateFormatterTimeZone.parse(dateString)");
                    return parse2;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (ParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }

    @NotNull
    public static final String getMax(@NotNull Date date) {
        Intrinsics.checkParameterIsNotNull(date, AppNode.AnonymousClass2.KEY_DATE);
        String format = length.format(date);
        Intrinsics.checkExpressionValueIsNotNull(format, "dateFormatterUTC.format(date)");
        return format;
    }

    @NotNull
    public static final Date setMin(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, AppNode.AnonymousClass2.KEY_DATE);
        try {
            Date parse = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US).parse(str);
            Intrinsics.checkExpressionValueIsNotNull(parse, "SimpleDateFormat(RFC1123…T, Locale.US).parse(date)");
            return parse;
        } catch (ParseException e) {
            throw e;
        } catch (Exception e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }
}
