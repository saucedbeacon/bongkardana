package id.dana.base;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BaseActivity_ViewBinding implements Unbinder {
    private View getMax;
    private View getMin;
    private View length;
    private BaseActivity setMin;

    @UiThread
    public BaseActivity_ViewBinding(final BaseActivity baseActivity, View view) {
        this.setMin = baseActivity;
        baseActivity.icImageFg = (ImageView) drawDividersHorizontal.length(view, R.id.f46072131363152, "field 'icImageFg'", ImageView.class);
        View findViewById = view.findViewById(R.id.f52182131363774);
        baseActivity.leftButton = (TextView) drawDividersHorizontal.getMin(findViewById, R.id.f52182131363774, "field 'leftButton'", TextView.class);
        if (findViewById != null) {
            this.length = findViewById;
            findViewById.setOnClickListener(new getDividerWidth() {
                public final void setMax(View view) {
                    baseActivity.onClickLeftMenuButton(view);
                }
            });
        }
        View findViewById2 = view.findViewById(R.id.f58042131364386);
        baseActivity.rightButton = (TextView) drawDividersHorizontal.getMin(findViewById2, R.id.f58042131364386, "field 'rightButton'", TextView.class);
        if (findViewById2 != null) {
            this.getMin = findViewById2;
            findViewById2.setOnClickListener(new getDividerWidth() {
                public final void setMax(View view) {
                    baseActivity.onClickRightMenuButton(view);
                }
            });
        }
        baseActivity.rightProgressBar = (RelativeLayout) drawDividersHorizontal.length(view, R.id.f53932131363949, "field 'rightProgressBar'", RelativeLayout.class);
        baseActivity.rlToolbar = (RelativeLayout) drawDividersHorizontal.length(view, R.id.f58592131364441, "field 'rlToolbar'", RelativeLayout.class);
        baseActivity.toolbar = (Toolbar) drawDividersHorizontal.length(view, R.id.f62482131364862, "field 'toolbar'", Toolbar.class);
        baseActivity.toolbarImage = (ImageView) drawDividersHorizontal.length(view, R.id.f51012131363656, "field 'toolbarImage'", ImageView.class);
        View findViewById3 = view.findViewById(R.id.f62532131364867);
        baseActivity.toolbarTitle = (TextView) drawDividersHorizontal.getMin(findViewById3, R.id.f62532131364867, "field 'toolbarTitle'", TextView.class);
        if (findViewById3 != null) {
            this.getMax = findViewById3;
            findViewById3.setOnClickListener(new getDividerWidth() {
                public final void setMax(View view) {
                    baseActivity.OnClickTitle(view);
                }
            });
        }
    }

    @CallSuper
    public void setMax() {
        BaseActivity baseActivity = this.setMin;
        if (baseActivity != null) {
            this.setMin = null;
            baseActivity.icImageFg = null;
            baseActivity.leftButton = null;
            baseActivity.rightButton = null;
            baseActivity.rightProgressBar = null;
            baseActivity.rlToolbar = null;
            baseActivity.toolbar = null;
            baseActivity.toolbarImage = null;
            baseActivity.toolbarTitle = null;
            View view = this.length;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.length = null;
            }
            View view2 = this.getMin;
            if (view2 != null) {
                view2.setOnClickListener((View.OnClickListener) null);
                this.getMin = null;
            }
            View view3 = this.getMax;
            if (view3 != null) {
                view3.setOnClickListener((View.OnClickListener) null);
                this.getMax = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
