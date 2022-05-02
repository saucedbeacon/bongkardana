package id.dana.richview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.contract.maintenance.MaintenanceBroadcastModule;
import javax.inject.Inject;
import o.PagerTabStrip;
import o.PrepareException;
import o.cancelAll;
import o.getPageWidth;
import o.setTabIndicatorColor;
import o.stopIgnoring;

public class MaintenanceBroadcastView extends BaseRichView implements setTabIndicatorColor.setMin {
    @BindView(2131362579)
    ConstraintLayout container;
    @Inject
    public setTabIndicatorColor.getMax presenter;
    private PagerTabStrip setMax;
    @BindView(2131365336)
    TextView tvMaintenanceBroadcast;

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.view_maintenance_broadcast;
    }

    public void onError(String str) {
    }

    public void setup() {
    }

    public void showProgress() {
    }

    public MaintenanceBroadcastView(@NonNull Context context) {
        super(context);
    }

    public MaintenanceBroadcastView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaintenanceBroadcastView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MaintenanceBroadcastView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.setMax == null) {
            getPageWidth.length length = new getPageWidth.length((byte) 0);
            if (r4 != null) {
                length.length = r4;
                length.setMax = new MaintenanceBroadcastModule(this);
                stopIgnoring.setMin(length.setMax, MaintenanceBroadcastModule.class);
                stopIgnoring.setMin(length.length, PrepareException.AnonymousClass1.class);
                this.setMax = new getPageWidth(length.setMax, length.length, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMax.length(this);
        registerPresenter(this.presenter);
    }

    public void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        this.tvMaintenanceBroadcast.setCompoundDrawablesWithIntrinsicBounds(cancelAll.getMin(context, R.drawable.ic_notification), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void injected(boolean z) {
        if (z) {
            this.presenter.getMax();
        }
    }

    public void showMaintenanceBroadcast(String str) {
        this.container.setVisibility(0);
        this.tvMaintenanceBroadcast.setText(str);
        this.tvMaintenanceBroadcast.requestFocus();
    }

    public void hideMaintenanceBroadcast() {
        this.container.setVisibility(8);
    }
}
