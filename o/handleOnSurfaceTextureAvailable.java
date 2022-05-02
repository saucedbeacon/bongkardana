package o;

import com.github.mikephil.charting.data.Entry;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.WheelView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/richview/statement/mapper/StatementChartMapper;", "", "()V", "transform", "Lid/dana/richview/statement/model/PointModel;", "entry", "Lcom/github/mikephil/charting/data/Entry;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class handleOnSurfaceTextureAvailable {
    @NotNull
    public static final handleOnSurfaceTextureAvailable length = new handleOnSurfaceTextureAvailable();

    private handleOnSurfaceTextureAvailable() {
    }

    @NotNull
    public static getRecordType length(@Nullable Entry entry) {
        Object obj;
        int i;
        Float f = null;
        if (entry != null) {
            obj = entry.getMax;
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        if (entry != null) {
            f = Float.valueOf(entry.getMin());
        }
        if (f == null) {
            f = Float.valueOf(0.0f);
        }
        AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
        int i2 = 0;
        if (Intrinsics.areEqual((Object) AUAbsTheme.setMax(), (Object) valueOf)) {
            i2 = R.drawable.ic_arrow_up_green;
            i = R.drawable.bg_income_statement;
        } else {
            AUAbsTheme aUAbsTheme2 = AUAbsTheme.getMin;
            if (Intrinsics.areEqual((Object) AUAbsTheme.getMin(), (Object) valueOf)) {
                i2 = R.drawable.ic_arrow_down_orange;
                i = R.drawable.bg_expense_statement;
            } else {
                i = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Rp");
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        sb.append(NumberFormat.getNumberInstance(WheelView.OnWheelViewListener.getMax).format((long) f.floatValue()));
        return new getRecordType(i2, i, sb.toString());
    }
}
