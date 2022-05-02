package id.dana.component.buttoncomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setBackgroundColorRes;

public class DanaButtonGhostView extends BaseDanaButton {
    ConstraintLayout containerView;
    private Drawable getMin;
    ImageView iconButtonCenter;
    private int length;
    private int setMax;
    private String setMin;
    TextView titleButtonCenter;

    public void setActiveButtonLeftAlignWithAmount(String str, String str2) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-2057344315, oncanceled);
            onCancelLoad.getMin(-2057344315, oncanceled);
        }
    }

    public void setActiveButtonLeftAlignWithIcon(String str, Drawable drawable) {
    }

    public void setActiveButtonWithIcon(String str, Drawable drawable) {
    }

    public DanaButtonGhostView(@NonNull Context context) {
        super(context);
    }

    public DanaButtonGhostView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaButtonGhostView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayout() {
        return setBackgroundColorRes.toIntRange.view_dana_button_ghost;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(924665858, oncanceled);
            onCancelLoad.getMin(924665858, oncanceled);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.mayLaunchUrl, 0, 0);
            try {
                this.length = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.updateVisuals, 0);
                this.setMin = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.requestPostMessageChannelWithExtras);
                this.getMin = obtainStyledAttributes.getDrawable(setBackgroundColorRes.IsOverlapping.newSessionWithExtras);
                this.setMax = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.postMessage, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setDanaButtonView(int i, String str, Drawable drawable) {
        if (i == 0) {
            setDisabled(str);
        } else if (i == 1) {
            setActiveButton(str, drawable);
        } else if (i == 5) {
            setError(str);
        }
    }

    public void setActiveButton(String str, Drawable drawable) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setVisibility(0);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax));
        this.iconButtonCenter.setVisibility(0);
        this.iconButtonCenter.setImageDrawable(drawable);
        this.iconButtonCenter.setColorFilter(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax), PorterDuff.Mode.SRC_IN);
        vallidateSize(this.setMax, this.containerView, this.titleButtonCenter);
    }

    public void setError(String str) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.isInside));
        this.titleButtonCenter.setVisibility(0);
        vallidateSize(this.setMax, this.containerView, this.titleButtonCenter);
    }

    public void setDisabled(String str) {
        this.containerView.setBackground((Drawable) null);
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMin));
        this.titleButtonCenter.setVisibility(0);
        vallidateSize(this.setMax, this.containerView, this.titleButtonCenter);
    }

    public void setup() {
        this.containerView = (ConstraintLayout) getRootView().findViewById(setBackgroundColorRes.length.values);
        this.titleButtonCenter = (TextView) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsService$Stub$Proxy);
        this.iconButtonCenter = (ImageView) getRootView().findViewById(setBackgroundColorRes.length.onMessageChannelReady);
        setDanaButtonView(this.length, this.setMin, this.getMin);
    }
}
