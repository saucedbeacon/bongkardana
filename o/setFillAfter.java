package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.sendmoney.model.VoucherModel;
import id.dana.sendmoney.voucher.viewholder.VoucherViewHolder;
import o.IMultiInstanceInvalidationCallback;

public final class setFillAfter extends IMultiInstanceInvalidationCallback.Stub<Ignore<VoucherModel>, VoucherModel> {
    private final getShortName length;

    public setFillAfter(getShortName getshortname) {
        this.length = getshortname;
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new VoucherViewHolder(viewGroup, this.length);
    }
}
