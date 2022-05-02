package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import id.dana.savings.model.TopUpModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.WheelView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\r"}, d2 = {"Lid/dana/savings/viewholder/SavingHistoryViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/savings/model/TopUpModel;", "context", "Landroid/content/Context;", "resource", "", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;ILandroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverImageLoadExtension extends Ignore<TopUpModel> {
    public final /* synthetic */ void setMax(Object obj) {
        TopUpModel topUpModel = (TopUpModel) obj;
        if (topUpModel != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (textView != null) {
                textView.setText(this.length.getString(R.string.top_up_history_title));
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.getSplitTrack);
            if (textView2 != null) {
                if (WheelView.OnWheelViewListener.getMax == null) {
                    WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                }
                Locale locale = WheelView.OnWheelViewListener.getMax;
                textView2.setText(new SimpleDateFormat("dd MMMM yyy • HH:mm", locale).format(new Date(Long.parseLong(topUpModel.length))));
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(resetInternal.setMax.setSwitchTextAppearance);
            if (textView3 != null) {
                CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(topUpModel.setMin.setMin);
                currencyAmountModel.length = "IDR";
                textView3.setText(setLineVisible.length(currencyAmountModel));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GriverImageLoadExtension(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        super(context, R.layout.item_saving_history, viewGroup);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }
}
