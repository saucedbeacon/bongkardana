package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.model.ThirdPartyService;
import id.dana.richview.servicescard.adapter.viewholder.PromotedServiceViewHolder;
import o.IMultiInstanceInvalidationCallback;
import o.OrientationDetector;

public class onOrientationChanged extends IMultiInstanceInvalidationCallback.Stub<Ignore<ThirdPartyService>, ThirdPartyService> {
    private boolean getMax;
    private final View.OnClickListener setMin;

    static /* synthetic */ void setMax() {
    }

    public onOrientationChanged() {
        this.setMin = OrientationDetector.setMax;
    }

    public onOrientationChanged(View.OnClickListener onClickListener) {
        this.getMax = true;
        this.setMin = onClickListener;
    }

    public int getItemViewType(int i) {
        return (!this.getMax || i != 0) ? 1 : 0;
    }

    @NonNull
    public /* synthetic */ RecyclerView.valueOf onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View.OnClickListener onClickListener = this.setMin;
        Context context = viewGroup.getContext();
        if (i == 0) {
            return new PromotedServiceViewHolder(context, viewGroup, onClickListener);
        }
        return new OrientationDetector.MyOrientationEventListener(context, viewGroup);
    }
}
