package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.sendmoney.bank.savedcard.SavedBankViewHolder;
import id.dana.sendmoney.model.RecentBankModel;
import javax.inject.Inject;
import o.IMultiInstanceInvalidationCallback;

public class APMode extends IMultiInstanceInvalidationCallback.Stub<Ignore<RecentBankModel>, RecentBankModel> {
    @Inject
    APMode() {
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SavedBankViewHolder(viewGroup);
    }
}
