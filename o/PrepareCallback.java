package o;

import id.dana.richview.CurrencyTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/data/util/DateTimeUtil;", "", "()V", "MILLIS_TO_ONE_DAY", "", "SPLIT_DATE_FORMAT", "", "getCurrentSplitDateFormat", "getDateTimeString", "formatPattern", "locale", "Ljava/util/Locale;", "timemilis", "getFormatter", "Ljava/text/SimpleDateFormat;", "indoLocale", "isPastToday", "", "time", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PrepareCallback {
    @NotNull
    public static final PrepareCallback INSTANCE = new PrepareCallback();
    private static final long MILLIS_TO_ONE_DAY = 86400000;
    private static final String SPLIT_DATE_FORMAT = "MMM dd, hh:mm a";

    private PrepareCallback() {
    }

    private final Locale indoLocale() {
        return new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
    }

    @JvmStatic
    public static final boolean isPastToday(long j) {
        return System.currentTimeMillis() - j > MILLIS_TO_ONE_DAY;
    }

    @NotNull
    public final String getCurrentSplitDateFormat() {
        return getDateTimeString(SPLIT_DATE_FORMAT, indoLocale(), new Date().getTime());
    }

    @NotNull
    public final String getDateTimeString(@NotNull String str, @NotNull Locale locale, long j) {
        Intrinsics.checkNotNullParameter(str, "formatPattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String format = getFormatter(str, locale).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(format, "getFormatter(formatPatte…).format(Date(timemilis))");
        return format;
    }

    private final SimpleDateFormat getFormatter(String str, Locale locale) {
        return new SimpleDateFormat(str, locale);
    }
}
