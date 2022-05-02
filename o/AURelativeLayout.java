package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.splitbill.adapter.PayerViewHolder;
import id.dana.splitbill.model.SplitBillPayerModel;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;

public final class AURelativeLayout extends IMultiInstanceInvalidationCallback.Stub<Ignore<SplitBillPayerModel>, SplitBillPayerModel> {
    public PayerViewHolder.length getMax;
    public SplitBillPayerModel length;
    private long setMin;

    public AURelativeLayout(long j) {
        SplitBillPayerModel splitBillPayerModel = new SplitBillPayerModel();
        this.length = splitBillPayerModel;
        splitBillPayerModel.IsOverlapping = 1;
        this.setMin = j;
    }

    public final int getItemViewType(int i) {
        return ((SplitBillPayerModel) setMin(i)).IsOverlapping;
    }

    public final void setMax(List<SplitBillPayerModel> list) {
        getMax().clear();
        getMax().add((SplitBillPayerModel) setMin(0));
        if (!getMax().contains(this.length)) {
            super.length(list);
            getMax(this.length);
            return;
        }
        super.setMax(getItemCount() - 1, list);
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new PayerViewHolder(viewGroup, this.getMax, this.setMin);
        }
        return new Ignore<SplitBillPayerModel>(viewGroup) {
            public final /* bridge */ /* synthetic */ void setMax(Object obj) {
            }
        };
    }
}
