package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.model.SendMoneyHomeMenuModel;
import id.dana.sendmoney.adapter.SendMoneyHomeMenuViewHolder;
import o.IMultiInstanceInvalidationCallback;

public class setSourcePath extends IMultiInstanceInvalidationCallback.Stub<SendMoneyHomeMenuViewHolder, SendMoneyHomeMenuModel> {
    public SendMoneyHomeMenuViewHolder.setMin setMax;
    public final setRetmsg setMin = new setRetmsg(this);

    public int getItemViewType(int i) {
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: setMax */
    public void onBindViewHolder(@NonNull SendMoneyHomeMenuViewHolder sendMoneyHomeMenuViewHolder, int i) {
        SendMoneyHomeMenuModel sendMoneyHomeMenuModel = (SendMoneyHomeMenuModel) setMin(i);
        if (sendMoneyHomeMenuModel != null) {
            sendMoneyHomeMenuViewHolder.setMax(sendMoneyHomeMenuModel);
            sendMoneyHomeMenuViewHolder.length(sendMoneyHomeMenuModel);
            sendMoneyHomeMenuViewHolder.setMin(sendMoneyHomeMenuModel.length, sendMoneyHomeMenuModel.equals);
            sendMoneyHomeMenuViewHolder.clSendMoneyHomeMenu.setOnClickListener(new APImageInfo(sendMoneyHomeMenuViewHolder, sendMoneyHomeMenuModel));
            sendMoneyHomeMenuViewHolder.setMin(sendMoneyHomeMenuModel);
        }
    }

    public final boolean setMax() {
        return this.setMin.length();
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SendMoneyHomeMenuViewHolder(viewGroup.getContext(), viewGroup, this.setMax);
    }
}
