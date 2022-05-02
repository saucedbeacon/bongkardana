package id.dana.playstorereview;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PlayStoreReviewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private PlayStoreReviewActivity length;
    private View setMin;

    @UiThread
    public PlayStoreReviewActivity_ViewBinding(final PlayStoreReviewActivity playStoreReviewActivity, View view) {
        super(playStoreReviewActivity, view);
        this.length = playStoreReviewActivity;
        playStoreReviewActivity.clDialog = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39412131362420, "field 'clDialog'", ConstraintLayout.class);
        playStoreReviewActivity.clMainRoot = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f54302131363988, "field 'clMainRoot'", ConstraintLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36592131362111, "method 'btnPlayStoreReviewYesClicked'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                playStoreReviewActivity.btnPlayStoreReviewYesClicked();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36582131362110, "method 'btnPlayStoreReviewNoClicked'");
        this.getMax = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                playStoreReviewActivity.btnPlayStoreReviewNoClicked();
            }
        });
    }

    public final void setMax() {
        PlayStoreReviewActivity playStoreReviewActivity = this.length;
        if (playStoreReviewActivity != null) {
            this.length = null;
            playStoreReviewActivity.clDialog = null;
            playStoreReviewActivity.clMainRoot = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
