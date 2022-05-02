package id.dana.base;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import o.FtsOptions$Order;
import o.onConflict;

public abstract class BaseWithToolbarFragment extends FtsOptions$Order {
    @Nullable
    @BindView(2131363774)
    TextView leftButton;
    @Nullable
    @BindView(2131364386)
    public TextView rightButton;
    @Nullable
    @BindView(2131364441)
    RelativeLayout rlToolbar;
    @Nullable
    @BindView(2131364862)
    Toolbar toolbar;
    @Nullable
    @BindView(2131363656)
    ImageView toolbarImage;
    @Nullable
    @BindView(2131364867)
    public TextView toolbarTitle;

    @OnClick({2131363774})
    @Optional
    public void onClickLeftMenuButton(View view) {
    }

    @OnClick({2131364386})
    @Optional
    public void onClickRightMenuButton(View view) {
    }

    public final void getMax(@DrawableRes int i) {
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 != null && i != 0) {
            toolbar2.setNavigationIcon(i);
            this.toolbar.setNavigationOnClickListener(new onConflict(this));
            this.leftButton.setVisibility(8);
        }
    }
}
