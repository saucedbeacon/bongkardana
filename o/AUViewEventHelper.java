package o;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.splitbill.adapter.ClosePayerViewHolder;
import id.dana.splitbill.model.PayerModel;
import java.util.ArrayList;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;

public final class AUViewEventHelper extends IMultiInstanceInvalidationCallback.Stub<Ignore<PayerModel>, PayerModel> {
    private setMin getMax;
    private ClosePayerViewHolder.length length;

    public final class ClickListenerWrapper implements CompoundButton.OnCheckedChangeListener {
        private final PayerModel setMax;
        private final ClosePayerViewHolder setMin;

        public ClickListenerWrapper(ClosePayerViewHolder closePayerViewHolder, PayerModel payerModel) {
            this.setMin = closePayerViewHolder;
            this.setMax = payerModel;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ClosePayerViewHolder.getMax(this.setMin, this.setMax, z);
        }
    }

    public interface setMin {
        void setMax();
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        onBindViewHolder((Ignore) valueof, i);
    }

    public AUViewEventHelper(ClosePayerViewHolder.length length2, setMin setmin) {
        this.length = length2;
        this.getMax = setmin;
    }

    public final List<PayerModel> setMin() {
        ArrayList arrayList = new ArrayList();
        for (PayerModel payerModel : getMax()) {
            if (payerModel.length()) {
                arrayList.add(payerModel);
            }
        }
        return arrayList;
    }

    public final void getMax(Ignore<PayerModel> ignore, int i) {
        ignore.setMax((PayerModel) setMin(i));
        if (i == getMax().size() - 1) {
            this.getMax.setMax();
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ClosePayerViewHolder(viewGroup, this.length);
    }
}
