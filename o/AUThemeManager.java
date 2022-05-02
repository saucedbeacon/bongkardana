package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.statement.StatementTransactionType;
import id.dana.statement.model.StatementSummaryModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0015"}, d2 = {"Lid/dana/statement/adapter/TransactionStatementViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/statement/model/StatementSummaryModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "getAlphaColorProgress", "", "percentProgress", "getIconByCategoryType", "bizType", "", "getLocalizedTitleByBizType", "getStatementTransactionType", "Lid/dana/statement/StatementTransactionType;", "setCategoryIcon", "iconByCategoryType", "setProgressColor", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUThemeManager extends Ignore<StatementSummaryModel> {
    public final /* synthetic */ void setMax(Object obj) {
        StatementSummaryModel statementSummaryModel = (StatementSummaryModel) obj;
        if (statementSummaryModel != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.onCancelNotification);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_type");
            Context context = this.length;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            textView.setText(context.getResources().getString(getMax(statementSummaryModel.setMax).getLocalizedTitle()));
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.setSwitchTextAppearance);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tv_amount");
            textView2.setText(statementSummaryModel.setMin.setMax());
            int roundToInt = MathKt.roundToInt(statementSummaryModel.length);
            if (CornerMarkingDataProvider.length()) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                ProgressBar progressBar = (ProgressBar) view3.findViewById(resetInternal.setMax.setTitleOptional);
                Intrinsics.checkNotNullExpressionValue(progressBar, "itemView.pb_statement_transaction");
                progressBar.setProgressTintList(IntRange.getMin(this.length, getMin(roundToInt)));
            } else {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ProgressBar progressBar2 = (ProgressBar) view4.findViewById(resetInternal.setMax.setTitleOptional);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "itemView.pb_statement_transaction");
                Drawable mutate = progressBar2.getProgressDrawable().mutate();
                Intrinsics.checkNotNullExpressionValue(mutate, "itemView.pb_statement_tr…progressDrawable.mutate()");
                if (mutate != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) mutate;
                    layerDrawable.getDrawable(0).setColorFilter(IntRange.setMax(this.length, R.color.f20332131099945), PorterDuff.Mode.SRC_IN);
                    layerDrawable.getDrawable(1).setColorFilter(IntRange.setMax(this.length, getMin(roundToInt)), PorterDuff.Mode.SRC_IN);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                }
            }
            View view5 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "itemView");
            ProgressBar progressBar3 = (ProgressBar) view5.findViewById(resetInternal.setMax.setTitleOptional);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "itemView.pb_statement_transaction");
            progressBar3.setProgress(MathKt.roundToInt(statementSummaryModel.length));
            updateMessageMenuItem<Drawable> max = ((updateCornerMarking) Glide.getMax(this.length)).getMax(IntRange.length(this.length, getMax(statementSummaryModel.setMax).getDrawableIcon()));
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            max.length((ImageView) view6.findViewById(resetInternal.setMax.getState));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AUThemeManager(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_statement_history, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    private static int getMin(int i) {
        if (i == RangesKt.coerceIn(i, 80, 100)) {
            return R.color.f18642131099745;
        }
        if (i == RangesKt.coerceIn(i, 40, 79)) {
            return R.color.f18622131099743;
        }
        if (i == RangesKt.coerceIn(i, 10, 39)) {
            return R.color.f18612131099742;
        }
        RangesKt.coerceIn(i, 0, 9);
        return R.color.f18602131099740;
    }

    private static StatementTransactionType getMax(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.TOPUP.getBizType())) {
            return StatementTransactionType.TOPUP;
        }
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.CASHBACK.getBizType())) {
            return StatementTransactionType.CASHBACK;
        }
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.RECEIVEMONEY.getBizType())) {
            return StatementTransactionType.RECEIVEMONEY;
        }
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.DANAKAGET.getBizType())) {
            return StatementTransactionType.DANAKAGET;
        }
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.SERVICES.getBizType())) {
            return StatementTransactionType.SERVICES;
        }
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.MERCHANT.getBizType())) {
            return StatementTransactionType.MERCHANT;
        }
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.SENDMONEY.getBizType())) {
            return StatementTransactionType.SENDMONEY;
        }
        if (Intrinsics.areEqual((Object) str, (Object) StatementTransactionType.CASHOUT.getBizType())) {
            return StatementTransactionType.CASHOUT;
        }
        return StatementTransactionType.DEFAULT;
    }
}
