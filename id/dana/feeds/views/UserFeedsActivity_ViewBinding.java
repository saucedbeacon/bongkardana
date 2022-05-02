package id.dana.feeds.views;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;

public class UserFeedsActivity_ViewBinding extends BaseActivity_ViewBinding {
    private UserFeedsActivity setMin;

    @UiThread
    public UserFeedsActivity_ViewBinding(UserFeedsActivity userFeedsActivity, View view) {
        super(userFeedsActivity, view);
        this.setMin = userFeedsActivity;
        userFeedsActivity.rcFeeds = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f43922131362912, "field 'rcFeeds'", RecyclerView.class);
    }

    public final void setMax() {
        UserFeedsActivity userFeedsActivity = this.setMin;
        if (userFeedsActivity != null) {
            this.setMin = null;
            userFeedsActivity.rcFeeds = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
