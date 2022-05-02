package id.dana.richview.servicescard.adapter.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.model.ThirdPartyService;
import o.RewriteQueriesToDropUnusedColumns;
import o.dispatchOnCancelled;
import o.getDevOrientation;
import o.onCancelLoad;
import o.onCanceled;
import o.updateCornerMarking;

public class NewPromotedServiceViewHolder extends getDevOrientation {
    @BindView(2131362131)
    Button btnAction;
    private final View.OnClickListener getMax;
    @BindView(2131363590)
    ImageView ivPromotedService;
    @BindView(2131365473)
    TextView tvDescription;
    @BindView(2131365472)
    TextView tvTitle;

    public final /* synthetic */ void setMax(Object obj) {
        ThirdPartyService thirdPartyService = (ThirdPartyService) obj;
        if (thirdPartyService != null) {
            String min = setMin(thirdPartyService);
            if (!TextUtils.isEmpty(min)) {
                this.tvTitle.setText(min);
            }
            String max = getMax(thirdPartyService.toDoubleRange);
            if (!TextUtils.isEmpty(max)) {
                this.tvDescription.setText(max);
            }
            String max2 = getMax(thirdPartyService.FastBitmap$CoordinateSystem);
            if (!TextUtils.isEmpty(max2)) {
                this.btnAction.setText(max2);
            }
            View.OnClickListener onClickListener = this.getMax;
            if (onClickListener != null) {
                this.btnAction.setOnClickListener(onClickListener);
            }
            String str = thirdPartyService.toFloatRange;
            int max3 = setMax(thirdPartyService.isInside);
            int i = 0;
            if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
                getmax.getMin = str;
                getmax.setMax = R.drawable.service_skeleton_circle;
                getmax.setMin = this.ivPromotedService;
                new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
                return;
            }
            if (str != null) {
                i = str.length();
            }
            int max4 = dispatchOnCancelled.setMax(i);
            if (i != max4) {
                onCanceled oncanceled = new onCanceled(i, max4, 1);
                onCancelLoad.setMax(1171393847, oncanceled);
                onCancelLoad.getMin(1171393847, oncanceled);
            }
            ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax((int) R.drawable.service_skeleton_circle).setMin(max3).length(this.ivPromotedService);
        }
    }

    public NewPromotedServiceViewHolder(Context context, ViewGroup viewGroup, View.OnClickListener onClickListener) {
        super(context, R.layout.new_item_promoted_service, viewGroup);
        this.getMax = onClickListener;
    }
}
