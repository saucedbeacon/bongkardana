package o;

import id.dana.domain.statement.StatementType;
import id.dana.statement.TimeUnitInterval;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lid/dana/statement/model/StatementSummaryInit;", "", "date", "", "timeUnit", "Lid/dana/statement/TimeUnitInterval;", "type", "Lid/dana/domain/statement/StatementType;", "(JLid/dana/statement/TimeUnitInterval;Lid/dana/domain/statement/StatementType;)V", "getDate", "()J", "setDate", "(J)V", "formattedDate", "", "getFormattedDate", "()Ljava/lang/String;", "getTimeUnit", "()Lid/dana/statement/TimeUnitInterval;", "setTimeUnit", "(Lid/dana/statement/TimeUnitInterval;)V", "getType", "()Lid/dana/domain/statement/StatementType;", "setType", "(Lid/dana/domain/statement/StatementType;)V", "checkInterval", "getDateFormat", "dateFormatParam", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCurrentTheme {
    @NotNull
    public static final getMin setMax = new getMin((byte) 0);
    private long getMax;
    @NotNull
    public TimeUnitInterval length;
    @NotNull
    public StatementType setMin;

    public getCurrentTheme(long j, @NotNull TimeUnitInterval timeUnitInterval, @NotNull StatementType statementType) {
        Intrinsics.checkNotNullParameter(timeUnitInterval, "timeUnit");
        Intrinsics.checkNotNullParameter(statementType, "type");
        this.getMax = j;
        this.length = timeUnitInterval;
        this.setMin = statementType;
    }

    public final String setMin() {
        int i = getViewSizeAndMargin.getMax[this.length.ordinal()];
        if (i == 1) {
            long j = this.getMax;
            Locale locale = Locale.getDefault();
            String format = new SimpleDateFormat("ddMMyyyy", locale).format(new Date(j));
            Intrinsics.checkNotNullExpressionValue(format, "DateTimeUtil.getDateTime…ocale.getDefault(), date)");
            return format;
        } else if (i == 2) {
            long j2 = this.getMax;
            Locale locale2 = Locale.getDefault();
            String format2 = new SimpleDateFormat("MMyyyy", locale2).format(new Date(j2));
            Intrinsics.checkNotNullExpressionValue(format2, "DateTimeUtil.getDateTime…ocale.getDefault(), date)");
            return format2;
        } else if (i == 3) {
            long j3 = this.getMax;
            Locale locale3 = Locale.getDefault();
            String format3 = new SimpleDateFormat("wwyyyy", locale3).format(new Date(j3));
            Intrinsics.checkNotNullExpressionValue(format3, "DateTimeUtil.getDateTime…ocale.getDefault(), date)");
            return format3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/statement/model/StatementSummaryInit$Companion;", "", "()V", "DATE_FORMAT_PARAM", "", "MONTH_FORMAT_PARAM", "WEEK_FORMAT_PARAM", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }
}
