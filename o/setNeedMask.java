package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J4\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/social/utils/FeedUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkIfFeedsIsPastYear", "", "date", "Ljava/util/Date;", "formatFeedDate", "", "createdTime", "", "getContentDate", "diffDay", "", "dateTime", "getDayDiff", "getSectionText", "composeDIfferentYear", "Lkotlin/Function2;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setNeedMask {
    public final Context setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "<anonymous parameter 1>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function2<String, Date, String> {
        public static final length INSTANCE = new length();

        length() {
            super(2);
        }

        @NotNull
        public final String invoke(@NotNull String str, @NotNull Date date) {
            Intrinsics.checkNotNullParameter(str, "it");
            Intrinsics.checkNotNullParameter(date, "<anonymous parameter 1>");
            return str;
        }
    }

    @Inject
    public setNeedMask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = context;
    }

    public static boolean length(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return true;
        }
        return false;
    }
}
