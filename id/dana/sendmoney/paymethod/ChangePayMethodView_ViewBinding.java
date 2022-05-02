package id.dana.sendmoney.paymethod;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ChangePayMethodView_ViewBinding implements Unbinder {
    private View getMax;
    private ChangePayMethodView getMin;

    @UiThread
    public ChangePayMethodView_ViewBinding(final ChangePayMethodView changePayMethodView, View view) {
        this.getMin = changePayMethodView;
        changePayMethodView.btnDone = (Button) drawDividersHorizontal.setMin(view, R.id.btn_done, "field 'btnDone'", Button.class);
        changePayMethodView.clChangePayMethod = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39142131362393, "field 'clChangePayMethod'", ConstraintLayout.class);
        changePayMethodView.ivLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49642131363519, "field 'ivLogo'", ImageView.class);
        changePayMethodView.ivPrefixDescription = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50222131363577, "field 'ivPrefixDescription'", ImageView.class);
        changePayMethodView.llParentPayMethod = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f53452131363901, "field 'llParentPayMethod'", ConstraintLayout.class);
        changePayMethodView.rvPaymentMethod = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59552131364540, "field 'rvPaymentMethod'", RecyclerView.class);
        changePayMethodView.tvChangePaymethod = (TextView) drawDividersHorizontal.setMin(view, R.id.tv_title_change_paymethod, "field 'tvChangePaymethod'", TextView.class);
        changePayMethodView.tvDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f65682131365193, "field 'tvDescription'", TextView.class);
        changePayMethodView.tvDivider = (TextView) drawDividersHorizontal.setMin(view, R.id.f65892131365215, "field 'tvDivider'", TextView.class);
        changePayMethodView.tvPrefixDescription = (TextView) drawDividersHorizontal.setMin(view, R.id.f68232131365450, "field 'tvPrefixDescription'", TextView.class);
        changePayMethodView.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36092131362056, "method 'changePayMethod'");
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                changePayMethodView.changePayMethod();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        ChangePayMethodView changePayMethodView = this.getMin;
        if (changePayMethodView != null) {
            this.getMin = null;
            changePayMethodView.btnDone = null;
            changePayMethodView.clChangePayMethod = null;
            changePayMethodView.ivLogo = null;
            changePayMethodView.ivPrefixDescription = null;
            changePayMethodView.llParentPayMethod = null;
            changePayMethodView.rvPaymentMethod = null;
            changePayMethodView.tvChangePaymethod = null;
            changePayMethodView.tvDescription = null;
            changePayMethodView.tvDivider = null;
            changePayMethodView.tvPrefixDescription = null;
            changePayMethodView.tvTitle = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
