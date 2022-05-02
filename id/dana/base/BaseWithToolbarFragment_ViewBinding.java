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

public class BaseWithToolbarFragment_ViewBinding implements Unbinder {
    private View getMax;
    private View getMin;
    private BaseWithToolbarFragment setMin;

    @UiThread
    public BaseWithToolbarFragment_ViewBinding(final BaseWithToolbarFragment baseWithToolbarFragment, View view) {
        this.setMin = baseWithToolbarFragment;
        View findViewById = view.findViewById(R.id.f52182131363774);
        baseWithToolbarFragment.leftButton = (TextView) drawDividersHorizontal.getMin(findViewById, R.id.f52182131363774, "field 'leftButton'", TextView.class);
        if (findViewById != null) {
            this.getMin = findViewById;
            findViewById.setOnClickListener(new getDividerWidth() {
                public final void setMax(View view) {
                    baseWithToolbarFragment.onClickLeftMenuButton(view);
                }
            });
        }
        View findViewById2 = view.findViewById(R.id.f58042131364386);
        baseWithToolbarFragment.rightButton = (TextView) drawDividersHorizontal.getMin(findViewById2, R.id.f58042131364386, "field 'rightButton'", TextView.class);
        if (findViewById2 != null) {
            this.getMax = findViewById2;
            findViewById2.setOnClickListener(new getDividerWidth() {
                public final void setMax(View view) {
                    baseWithToolbarFragment.onClickRightMenuButton(view);
                }
            });
        }
        baseWithToolbarFragment.rlToolbar = (RelativeLayout) drawDividersHorizontal.length(view, R.id.f58592131364441, "field 'rlToolbar'", RelativeLayout.class);
        baseWithToolbarFragment.toolbar = (Toolbar) drawDividersHorizontal.length(view, R.id.f62482131364862, "field 'toolbar'", Toolbar.class);
        baseWithToolbarFragment.toolbarImage = (ImageView) drawDividersHorizontal.length(view, R.id.f51012131363656, "field 'toolbarImage'", ImageView.class);
        baseWithToolbarFragment.toolbarTitle = (TextView) drawDividersHorizontal.length(view, R.id.f62532131364867, "field 'toolbarTitle'", TextView.class);
    }

    @CallSuper
    public void setMax() {
        BaseWithToolbarFragment baseWithToolbarFragment = this.setMin;
        if (baseWithToolbarFragment != null) {
            this.setMin = null;
            baseWithToolbarFragment.leftButton = null;
            baseWithToolbarFragment.rightButton = null;
            baseWithToolbarFragment.rlToolbar = null;
            baseWithToolbarFragment.toolbar = null;
            baseWithToolbarFragment.toolbarImage = null;
            baseWithToolbarFragment.toolbarTitle = null;
            View view = this.getMin;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.getMin = null;
            }
            View view2 = this.getMax;
            if (view2 != null) {
                view2.setOnClickListener((View.OnClickListener) null);
                this.getMax = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
