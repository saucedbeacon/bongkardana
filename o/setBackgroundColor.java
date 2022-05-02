package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.OptionPickerDialog;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\u0010\nJ\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/common/view/CheckboxViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/common/model/OptionModel;", "viewGroup", "Landroid/view/ViewGroup;", "onCheckBoxClickListener", "Lkotlin/Function2;", "", "", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)V", "cbOption", "Landroid/widget/CheckBox;", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setBackgroundColor extends Ignore<isLayoutRtlSupport> {
    /* access modifiers changed from: private */
    public final CheckBox getMin;
    /* access modifiers changed from: private */
    public final Function2<Integer, Boolean, Unit> setMax;

    public final /* synthetic */ void setMax(Object obj) {
        isLayoutRtlSupport islayoutrtlsupport = (isLayoutRtlSupport) obj;
        if (islayoutrtlsupport != null) {
            this.getMin.setText(islayoutrtlsupport.setMax);
            this.getMin.setChecked(islayoutrtlsupport.setMin());
            CheckBox checkBox = this.getMin;
            OptionPickerDialog.OnOptionPickListener onOptionPickListener = OptionPickerDialog.OnOptionPickListener.getMin;
            String string = this.length.getString(R.string.cd_promo_center_filter_item_prefix);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…enter_filter_item_prefix)");
            checkBox.setContentDescription(OptionPickerDialog.OnOptionPickListener.getMax(string, islayoutrtlsupport.setMax));
            this.getMin.setOnClickListener(new length(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setBackgroundColor(@NotNull ViewGroup viewGroup, @NotNull Function2<? super Integer, ? super Boolean, Unit> function2) {
        super(viewGroup.getContext(), R.layout.item_checkbox, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(function2, "onCheckBoxClickListener");
        this.setMax = function2;
        View findViewById = this.itemView.findViewById(R.id.f37732131362228);
        Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.cb_option)");
        this.getMin = (CheckBox) findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/common/view/CheckboxViewHolder$bindData$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ setBackgroundColor getMax;

        length(setBackgroundColor setbackgroundcolor) {
            this.getMax = setbackgroundcolor;
        }

        public final void onClick(View view) {
            this.getMax.setMax.invoke(Integer.valueOf(this.getMax.getAbsoluteAdapterPosition()), Boolean.valueOf(this.getMax.getMin.isChecked()));
        }
    }
}
