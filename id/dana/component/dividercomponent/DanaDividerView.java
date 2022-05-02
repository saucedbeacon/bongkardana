package id.dana.component.dividercomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.component.BaseRichView;
import o.setBackgroundColorRes;

public class DanaDividerView extends BaseRichView {
    ConstraintLayout containerView;
    private int length;
    private String setMax;
    TextView title;

    public DanaDividerView(@NonNull Context context) {
        super(context);
    }

    public DanaDividerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaDividerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DanaDividerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public int getLayout() {
        return setBackgroundColorRes.toIntRange.view_dana_divider_layout;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.RemoteActionCompatParcelizer, 0, 0);
            try {
                this.length = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.MediaBrowserCompat$CustomActionResultReceiver, 0);
                this.setMax = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.IconCompatParcelizer);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        this.containerView = (ConstraintLayout) getRootView().findViewById(setBackgroundColorRes.length.hashCode);
        this.title = (TextView) getRootView().findViewById(setBackgroundColorRes.length.requestPostMessageChannelWithExtras);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 1.0f));
        switch (this.length) {
            case 0:
                this.containerView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 4.0f)));
                return;
            case 1:
                this.containerView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 8.0f)));
                return;
            case 2:
                this.containerView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 12.0f)));
                return;
            case 3:
                this.containerView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)));
                return;
            case 4:
                this.containerView.setLayoutParams(layoutParams);
                return;
            case 5:
                layoutParams.setMargins((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0, 0, 0);
                this.containerView.setLayoutParams(layoutParams);
                return;
            case 6:
                layoutParams.setMargins(0, 0, (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0);
                this.containerView.setLayoutParams(layoutParams);
                return;
            case 7:
                layoutParams.setMargins((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0, (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0);
                this.containerView.setLayoutParams(layoutParams);
                return;
            case 8:
                this.containerView.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 22.0f)));
                this.title.setVisibility(0);
                this.title.setText(this.setMax);
                return;
            default:
                return;
        }
    }
}
