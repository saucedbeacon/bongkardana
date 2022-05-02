package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import id.dana.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lid/dana/social/bottomsheet/ReasonReportViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/domain/social/model/ReportReasons;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAddIcon extends Ignore<setSimulatedScanData> {
    @NotNull
    public static final getMin getMax = new getMin((byte) 0);

    public final /* synthetic */ void setMax(Object obj) {
        setSimulatedScanData setsimulatedscandata = (setSimulatedScanData) obj;
        Intrinsics.checkNotNullParameter(setsimulatedscandata, "data");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (Intrinsics.areEqual((Object) locale.getLanguage(), (Object) startH5OpenAuth.KEY_EN)) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.getOuterActionMenuPresenter);
            if (appCompatTextView != null) {
                appCompatTextView.setText(setsimulatedscandata.getEn());
                return;
            }
            return;
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view2.findViewById(resetInternal.setMax.getOuterActionMenuPresenter);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(setsimulatedscandata.getId());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getAddIcon(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_reason_report_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/bottomsheet/ReasonReportViewHolder$Companion;", "", "()V", "DEVICE_LANGUAGE_EN", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }
}
