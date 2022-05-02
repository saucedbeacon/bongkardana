package id.dana.richview.servicescard.adapter.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.model.ThirdPartyService;
import o.RewriteQueriesToDropUnusedColumns;
import o.getDevOrientation;
import o.updateCornerMarking;

public class NewServiceViewHolder extends getDevOrientation {
    @BindView(2131362622)
    TextView badgesText;
    @BindView(2131362621)
    ImageView ivIcon;
    @BindView(2131362623)
    ImageView ivRedDot;
    @BindView(2131362624)
    TextView tvTitle;

    public final /* synthetic */ void setMax(Object obj) {
        ThirdPartyService thirdPartyService = (ThirdPartyService) obj;
        if (thirdPartyService != null) {
            String min = setMin(thirdPartyService);
            if (!TextUtils.isEmpty(min)) {
                this.tvTitle.setText(min);
            }
            int i = thirdPartyService.values;
            if (i == 1) {
                this.ivIcon.setImageResource(R.drawable.new_ic_more);
            } else if (i != 2) {
                String str = thirdPartyService.toFloatRange;
                int max = setMax(thirdPartyService.isInside);
                if (RewriteQueriesToDropUnusedColumns.setMax(str)) {
                    getMin(str);
                } else {
                    ((updateCornerMarking) Glide.getMax(this.length)).setMax(str).setMax((int) R.drawable.service_skeleton_circle).setMin(max).length(this.ivIcon);
                }
            } else {
                String str2 = thirdPartyService.toFloatRange;
                int max2 = setMax(thirdPartyService.isInside);
                if (RewriteQueriesToDropUnusedColumns.setMax(str2)) {
                    getMin(str2);
                } else {
                    ((updateCornerMarking) Glide.getMax(this.length)).setMax(str2).setMax((int) R.drawable.service_skeleton_circle).setMin(max2).length(this.ivIcon);
                }
            }
            this.ivRedDot.setVisibility(thirdPartyService.setMin() ? 0 : 8);
            String str3 = thirdPartyService.Mean$Arithmetic;
            if (TextUtils.isEmpty(str3)) {
                this.badgesText.setVisibility(8);
                return;
            }
            this.badgesText.setText(str3);
            this.badgesText.setVisibility(0);
        }
    }

    public NewServiceViewHolder(Context context, ViewGroup viewGroup) {
        super(context, R.layout.new_layout_custom_gridview, viewGroup);
    }

    private void getMin(String str) {
        RewriteQueriesToDropUnusedColumns.getMax getmax = new RewriteQueriesToDropUnusedColumns.getMax(this.length, (byte) 0);
        getmax.getMin = str;
        getmax.setMax = R.drawable.service_skeleton_circle;
        getmax.setMin = this.ivIcon;
        new RewriteQueriesToDropUnusedColumns(getmax, (byte) 0);
    }
}
