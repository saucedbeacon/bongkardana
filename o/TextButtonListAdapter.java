package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.splitbill.adapter.PayerListViewHolder;
import id.dana.splitbill.model.PayerModel;
import o.IMultiInstanceInvalidationCallback;

public final class TextButtonListAdapter extends IMultiInstanceInvalidationCallback.Stub<PayerListViewHolder, PayerModel> {
    public boolean setMax;

    public final /* synthetic */ void getMax(Ignore ignore, int i) {
        ((PayerListViewHolder) ignore).length((PayerModel) setMin(i), this.setMax);
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        ((PayerListViewHolder) valueof).length((PayerModel) setMin(i), this.setMax);
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PayerListViewHolder(viewGroup);
    }
}
