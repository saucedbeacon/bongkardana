package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CaptureBtn;
import o.IMultiInstanceInvalidationCallback;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/savings/adapter/SavingBenefitAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/savings/viewholder/SavingBenefitViewHolder;", "Lid/dana/savings/model/SavingBenefitModel;", "()V", "rvHeight", "", "getRvHeight", "()I", "setRvHeight", "(I)V", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class notifySdcardError extends IMultiInstanceInvalidationCallback.Stub<BaseDecodeOptions, CaptureBtn.AnonymousClass1> {
    public int getMax;

    public final /* synthetic */ void getMax(Ignore ignore, int i) {
        BaseDecodeOptions baseDecodeOptions = (BaseDecodeOptions) ignore;
        Intrinsics.checkNotNullParameter(baseDecodeOptions, "holder");
        baseDecodeOptions.setMin = this.getMax;
        super.onBindViewHolder(baseDecodeOptions, i);
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        BaseDecodeOptions baseDecodeOptions = (BaseDecodeOptions) valueof;
        Intrinsics.checkNotNullParameter(baseDecodeOptions, "holder");
        baseDecodeOptions.setMin = this.getMax;
        super.onBindViewHolder(baseDecodeOptions, i);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new BaseDecodeOptions(context, viewGroup);
    }
}
