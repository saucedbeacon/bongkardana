package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"getTime", "", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class PageStartedPoint {
    public static final long getTime() {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date parse = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
        Intrinsics.checkNotNullExpressionValue(parse, "formatter.parse(formatter.format(Date()))");
        return parse.getTime();
    }
}
