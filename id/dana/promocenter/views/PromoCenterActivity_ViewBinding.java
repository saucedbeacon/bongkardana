package id.dana.promocenter.views;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.promocenter.PromoCategoryView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PromoCenterActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMin;
    private View length;
    private PromoCenterActivity setMin;

    @UiThread
    public PromoCenterActivity_ViewBinding(final PromoCenterActivity promoCenterActivity, View view) {
        super(promoCenterActivity, view);
        this.setMin = promoCenterActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f36932131362145, "field 'btnTryAgain' and method 'onClickTryAgain'");
        promoCenterActivity.btnTryAgain = (Button) drawDividersHorizontal.getMin(max, R.id.f36932131362145, "field 'btnTryAgain'", Button.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                promoCenterActivity.onClickTryAgain();
            }
        });
        promoCenterActivity.ivErrorPromoCenter = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48782131363432, "field 'ivErrorPromoCenter'", ImageView.class);
        promoCenterActivity.llPromoErrorButton = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53512131363907, "field 'llPromoErrorButton'", LinearLayout.class);
        promoCenterActivity.llPromoErrorImage = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53522131363908, "field 'llPromoErrorImage'", LinearLayout.class);
        promoCenterActivity.pcbView = (PromoCenterBottomMenuView) drawDividersHorizontal.setMin(view, R.id.f56692131364241, "field 'pcbView'", PromoCenterBottomMenuView.class);
        promoCenterActivity.pcvPromoCenter = (PromoCategoryView) drawDividersHorizontal.setMin(view, R.id.f56712131364243, "field 'pcvPromoCenter'", PromoCategoryView.class);
        promoCenterActivity.rvPromoCenter = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59742131364559, "field 'rvPromoCenter'", RecyclerView.class);
        promoCenterActivity.tvErrorDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f66092131365236, "field 'tvErrorDescription'", TextView.class);
        promoCenterActivity.tvErrorTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f66142131365241, "field 'tvErrorTitle'", TextView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36342131362084, "method 'onClickHome'");
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                promoCenterActivity.onClickHome();
            }
        });
    }

    public final void setMax() {
        PromoCenterActivity promoCenterActivity = this.setMin;
        if (promoCenterActivity != null) {
            this.setMin = null;
            promoCenterActivity.btnTryAgain = null;
            promoCenterActivity.ivErrorPromoCenter = null;
            promoCenterActivity.llPromoErrorButton = null;
            promoCenterActivity.llPromoErrorImage = null;
            promoCenterActivity.pcbView = null;
            promoCenterActivity.pcvPromoCenter = null;
            promoCenterActivity.rvPromoCenter = null;
            promoCenterActivity.tvErrorDescription = null;
            promoCenterActivity.tvErrorTitle = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
