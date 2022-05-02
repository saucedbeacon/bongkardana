package id.dana.referral.referraltracker.viewholders;

import android.text.TextUtils;
import android.widget.ImageView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import o.Ignore;
import o.StartupParamsBridgeExtension;
import o.dispatchOnCancelled;
import o.evaluate;
import o.onCancelLoad;
import o.onCanceled;
import o.updateCornerMarking;

public class ReferralTrackerEmptyViewHolder extends Ignore<StartupParamsBridgeExtension> {
    @BindView(2131363608)
    ImageView ivReferralTrackerEmpty;

    public final /* synthetic */ void setMax(Object obj) {
        int i;
        StartupParamsBridgeExtension startupParamsBridgeExtension = (StartupParamsBridgeExtension) obj;
        if (!TextUtils.isEmpty(startupParamsBridgeExtension.isInside)) {
            String str = startupParamsBridgeExtension.isInside;
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-777872705, oncanceled);
                onCancelLoad.getMin(-777872705, oncanceled);
            }
            ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax(evaluate.setMin).length(this.ivReferralTrackerEmpty);
        }
    }
}
