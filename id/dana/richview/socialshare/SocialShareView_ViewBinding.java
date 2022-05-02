package id.dana.richview.socialshare;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SocialShareView_ViewBinding implements Unbinder {
    private View getMax;
    private View getMin;
    private SocialShareView length;

    @UiThread
    public SocialShareView_ViewBinding(final SocialShareView socialShareView, View view) {
        this.length = socialShareView;
        socialShareView.llShareQr = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53732131363929, "field 'llShareQr'", LinearLayout.class);
        socialShareView.llShareFirst = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53712131363927, "field 'llShareFirst'", LinearLayout.class);
        socialShareView.llShareSecond = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53742131363930, "field 'llShareSecond'", LinearLayout.class);
        socialShareView.llShareThird = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53752131363931, "field 'llShareThird'", LinearLayout.class);
        socialShareView.llShareOthers = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53722131363928, "field 'llShareOthers'", LinearLayout.class);
        socialShareView.tvSocialShareTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69422131365569, "field 'tvSocialShareTitle'", TextView.class);
        socialShareView.civSocialShareFirst = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38292131362307, "field 'civSocialShareFirst'", CircleImageView.class);
        socialShareView.civSocialShareSecond = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38302131362308, "field 'civSocialShareSecond'", CircleImageView.class);
        socialShareView.civSocialShareThird = (CircleImageView) drawDividersHorizontal.setMin(view, R.id.f38312131362309, "field 'civSocialShareThird'", CircleImageView.class);
        socialShareView.tvSocialShareFirst = (TextView) drawDividersHorizontal.setMin(view, R.id.f69382131365565, "field 'tvSocialShareFirst'", TextView.class);
        socialShareView.tvSocialShareSecond = (TextView) drawDividersHorizontal.setMin(view, R.id.f69402131365567, "field 'tvSocialShareSecond'", TextView.class);
        socialShareView.tvSocialShareThird = (TextView) drawDividersHorizontal.setMin(view, R.id.f69412131365568, "field 'tvSocialShareThird'", TextView.class);
        socialShareView.tvAppNameFirst = (TextView) drawDividersHorizontal.setMin(view, R.id.f64812131365106, "field 'tvAppNameFirst'", TextView.class);
        socialShareView.tvAppNameSecond = (TextView) drawDividersHorizontal.setMin(view, R.id.f64822131365107, "field 'tvAppNameSecond'", TextView.class);
        socialShareView.tvAppNameThird = (TextView) drawDividersHorizontal.setMin(view, R.id.f64832131365108, "field 'tvAppNameThird'", TextView.class);
        socialShareView.llViewContainer = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53022131363858, "field 'llViewContainer'", LinearLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f69392131365566, "field 'tvSocialShareOthers' and method 'setOnClickOthers'");
        socialShareView.tvSocialShareOthers = (TextView) drawDividersHorizontal.getMin(max, R.id.f69392131365566, "field 'tvSocialShareOthers'", TextView.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                socialShareView.setOnClickOthers();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f38272131362305, "method 'setOnClickOthers'");
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                socialShareView.setOnClickOthers();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        SocialShareView socialShareView = this.length;
        if (socialShareView != null) {
            this.length = null;
            socialShareView.llShareQr = null;
            socialShareView.llShareFirst = null;
            socialShareView.llShareSecond = null;
            socialShareView.llShareThird = null;
            socialShareView.llShareOthers = null;
            socialShareView.tvSocialShareTitle = null;
            socialShareView.civSocialShareFirst = null;
            socialShareView.civSocialShareSecond = null;
            socialShareView.civSocialShareThird = null;
            socialShareView.tvSocialShareFirst = null;
            socialShareView.tvSocialShareSecond = null;
            socialShareView.tvSocialShareThird = null;
            socialShareView.tvAppNameFirst = null;
            socialShareView.tvAppNameSecond = null;
            socialShareView.tvAppNameThird = null;
            socialShareView.llViewContainer = null;
            socialShareView.tvSocialShareOthers = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
