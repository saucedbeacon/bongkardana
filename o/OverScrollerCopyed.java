package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import id.dana.R;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import id.dana.model.PayMethodModel;
import id.dana.sendmoney.model.RecipientViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.removeItemAtInt;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/viewholder/BalanceViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/PayMethodModel;", "parent", "Landroid/view/ViewGroup;", "isKycActive", "", "(Landroid/view/ViewGroup;Z)V", "()Z", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "bindData", "", "data", "getTopUpUrl", "", "setOnItemClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OverScrollerCopyed extends Ignore<PayMethodModel> {
    /* access modifiers changed from: private */
    public Ignore.setMin getMax;
    private final boolean getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lid/dana/sendmoney_v2/recipient/datasource/RecipientDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lid/dana/sendmoney/model/RecipientViewModel;", "()V", "filter", "", "getFilter", "()Ljava/lang/String;", "setFilter", "(Ljava/lang/String;)V", "isSearching", "", "()Z", "setSearching", "(Z)V", "getItemsToBeDisplayed", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public abstract class SplineOverScroller extends removeItemAtInt.length<Integer, RecipientViewModel> {
        @NotNull
        private String length = "";
        public boolean setMax;

        public final boolean getMax() {
            return this.setMax;
        }

        public final void getMax(@NotNull String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(584197593, oncanceled);
                onCancelLoad.getMin(584197593, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.length = str;
        }

        @NotNull
        public final String getMin() {
            return this.length;
        }
    }

    public final /* synthetic */ void setMax(Object obj) {
        PayMethodModel payMethodModel = (PayMethodModel) obj;
        if (payMethodModel != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RadioButton radioButton = (RadioButton) view.findViewById(resetInternal.setMax.getActionBarHideOffset);
            Intrinsics.checkNotNullExpressionValue(radioButton, "itemView.rb_selected_card");
            radioButton.setChecked(payMethodModel.getMin());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_title");
            textView.setText(payMethodModel.length(this.length));
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(resetInternal.setMax.setSplitTrack);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tv_description");
            textView2.setText(payMethodModel.getMin(this.length));
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ((RadioButton) view4.findViewById(resetInternal.setMax.getActionBarHideOffset)).setOnClickListener(new getMax(this, payMethodModel));
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            Button button = (Button) view5.findViewById(resetInternal.setMax.MediaBrowserCompat$ItemReceiver);
            if (button != null) {
                button.setOnClickListener(new setMin(this, payMethodModel));
            }
            if (!this.getMin) {
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                Button button2 = (Button) view6.findViewById(resetInternal.setMax.requestPostMessageChannel);
                if (button2 != null) {
                    button2.setVisibility(0);
                }
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                ((Button) view7.findViewById(resetInternal.setMax.requestPostMessageChannel)).setOnClickListener(new setMax(this, payMethodModel));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverScrollerCopyed(@NotNull ViewGroup viewGroup, boolean z) {
        super(viewGroup.getContext(), R.layout.item_paymethod_balance_v2, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMin = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/sendmoney_v2/paymethod/viewholder/BalanceViewHolder$bindData$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ OverScrollerCopyed setMax;
        final /* synthetic */ PayMethodModel setMin;

        getMax(OverScrollerCopyed overScrollerCopyed, PayMethodModel payMethodModel) {
            this.setMax = overScrollerCopyed;
            this.setMin = payMethodModel;
        }

        public final void onClick(View view) {
            Ignore.setMin max = this.setMax.getMax;
            if (max != null) {
                max.length(this.setMax.getAdapterPosition());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/sendmoney_v2/paymethod/viewholder/BalanceViewHolder$bindData$1$2"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ OverScrollerCopyed getMin;
        final /* synthetic */ PayMethodModel length;

        setMin(OverScrollerCopyed overScrollerCopyed, PayMethodModel payMethodModel) {
            this.getMin = overScrollerCopyed;
            this.length = payMethodModel;
        }

        public final void onClick(View view) {
            DanaH5.startContainerFullUrl(OverScrollerCopyed.setMin());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/sendmoney_v2/paymethod/viewholder/BalanceViewHolder$bindData$1$3"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ PayMethodModel getMax;
        final /* synthetic */ OverScrollerCopyed length;

        setMax(OverScrollerCopyed overScrollerCopyed, PayMethodModel payMethodModel) {
            this.length = overScrollerCopyed;
            this.getMax = payMethodModel;
        }

        public final void onClick(View view) {
            Ignore.setMin max = this.length.getMax;
            if (max != null) {
                max.length(this.length.getAdapterPosition());
            }
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        super.setMin(setmin);
        this.getMax = setmin;
    }

    public static final /* synthetic */ String setMin() {
        String max = setH5OptionMenuTextFlag.setMin("https://m.dana.id/m/portal/topup?entryPoint={entryPoint}").getMin(UrlTag.ENTRY_POINT, "sendMoney").getMax();
        Intrinsics.checkNotNullExpressionValue(max, "TagFormat.from(DanaUrl.B…EY)\n            .format()");
        return max;
    }
}
