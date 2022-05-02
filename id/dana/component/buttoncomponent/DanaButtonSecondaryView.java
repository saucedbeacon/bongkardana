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
import o.setBackgroundColorRes;

public class DanaButtonSecondaryView extends BaseDanaButton {
    TextView amountButton;
    ConstraintLayout containerView;
    private int getMax;
    private String getMin;
    ImageView iconButton;
    ImageView iconButtonCenter;
    private Drawable length;
    private String setMax;
    private int setMin;
    TextView titleButtonCenter;
    TextView titleButtonLeft;

    public DanaButtonSecondaryView(@NonNull Context context) {
        super(context);
    }

    public DanaButtonSecondaryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaButtonSecondaryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayout() {
        return setBackgroundColorRes.toIntRange.view_dana_button_secondary;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.IPostMessageService, 0, 0);
            try {
                this.getMax = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.onExtraCallback, 0);
                this.setMax = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.IPostMessageService$Stub$Proxy);
                this.length = obtainStyledAttributes.getDrawable(setBackgroundColorRes.IsOverlapping.ITrustedWebActivityCallback);
                this.getMin = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.IPostMessageService$Default);
                this.setMin = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.IPostMessageService$Stub, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setDanaButtonView(int i, String str, String str2, Drawable drawable) {
        if (i == 0) {
            setDisabled(str);
        } else if (i == 1) {
            setActiveButton(str, drawable);
        } else if (i == 2) {
            setActiveButtonWithIcon(str, drawable);
        } else if (i == 3) {
            setActiveButtonLeftAlignWithAmount(str, str2);
        } else if (i == 4) {
            setActiveButtonLeftAlignWithIcon(str, drawable);
        } else if (i == 5) {
            setError(str);
        }
    }

    public void setActiveButton(String str, Drawable drawable) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setVisibility(0);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax));
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_secondary_active);
        this.iconButtonCenter.setVisibility(0);
        this.iconButtonCenter.setImageDrawable(drawable);
        this.iconButtonCenter.setColorFilter(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax), PorterDuff.Mode.SRC_IN);
        this.amountButton.setVisibility(4);
        this.titleButtonLeft.setVisibility(4);
        this.iconButton.setVisibility(4);
        vallidateSize(this.setMin, this.containerView, this.titleButtonCenter);
    }

    public void setActiveButtonWithIcon(String str, Drawable drawable) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setVisibility(0);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax));
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_secondary_active);
        this.iconButton.setImageDrawable(drawable);
        this.iconButton.setVisibility(0);
        this.iconButton.setColorFilter(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax), PorterDuff.Mode.SRC_IN);
        this.iconButtonCenter.setVisibility(4);
        this.titleButtonLeft.setVisibility(4);
        this.amountButton.setVisibility(4);
    }

    public void setActiveButtonLeftAlignWithAmount(String str, String str2) {
        this.titleButtonLeft.setText(str);
        this.titleButtonLeft.setVisibility(0);
        this.titleButtonCenter.setVisibility(4);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax));
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_secondary_active);
        this.amountButton.setText(str2);
        this.amountButton.setVisibility(0);
        this.iconButtonCenter.setVisibility(4);
        this.iconButton.setVisibility(4);
    }

    public void setActiveButtonLeftAlignWithIcon(String str, Drawable drawable) {
        this.titleButtonLeft.setText(str);
        this.titleButtonLeft.setVisibility(0);
        this.titleButtonCenter.setVisibility(4);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax));
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_secondary_active);
        this.iconButton.setImageDrawable(drawable);
        this.iconButton.setVisibility(0);
        this.iconButton.setColorFilter(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMax), PorterDuff.Mode.SRC_IN);
        this.amountButton.setVisibility(4);
        this.iconButtonCenter.setVisibility(4);
    }

    public void setError(String str) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setTextColor(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.isInside));
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_secondary_error);
        this.titleButtonCenter.setVisibility(0);
        this.iconButton.setVisibility(4);
        this.amountButton.setVisibility(4);
        this.titleButtonLeft.setVisibility(4);
        this.iconButtonCenter.setVisibility(4);
        vallidateSize(this.setMin, this.containerView, this.titleButtonCenter);
    }

    public void setDisabled(String str) {
        this.titleButtonCenter.setText(str);
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_secondary_disabled);
        this.titleButtonCenter.setVisibility(0);
        this.titleButtonCenter.setTextColor(getResources().getColor(setBackgroundColorRes.getMax.setMin));
        this.iconButtonCenter.setVisibility(0);
        this.iconButtonCenter.setImageDrawable(this.length);
        this.iconButtonCenter.setColorFilter(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.setMin), PorterDuff.Mode.SRC_IN);
        this.iconButton.setVisibility(4);
        this.amountButton.setVisibility(4);
        this.titleButtonLeft.setVisibility(4);
        vallidateSize(this.setMin, this.containerView, this.titleButtonCenter);
    }

    public void setup() {
        this.containerView = (ConstraintLayout) getRootView().findViewById(setBackgroundColorRes.length.toDoubleRange);
        this.titleButtonLeft = (TextView) getRootView().findViewById(setBackgroundColorRes.length.IPostMessageService);
        this.titleButtonCenter = (TextView) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsService$Stub$Proxy);
        this.amountButton = (TextView) getRootView().findViewById(setBackgroundColorRes.length.newSession);
        this.iconButton = (ImageView) getRootView().findViewById(setBackgroundColorRes.length.onPostMessage);
        this.iconButtonCenter = (ImageView) getRootView().findViewById(setBackgroundColorRes.length.onRelationshipValidationResult);
        setDanaButtonView(this.getMax, this.setMax, this.getMin, this.length);
    }
}
