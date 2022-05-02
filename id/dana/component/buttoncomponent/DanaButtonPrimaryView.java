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

public class DanaButtonPrimaryView extends BaseDanaButton {
    TextView amountButton;
    ConstraintLayout containerView;
    private String getMax;
    private int getMin;
    ImageView iconButton;
    private Drawable length;
    private String setMax;
    private int setMin;
    TextView titleButtonCenter;
    TextView titleButtonLeft;

    public void setError(String str) {
    }

    public DanaButtonPrimaryView(@NonNull Context context) {
        super(context);
    }

    public DanaButtonPrimaryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaButtonPrimaryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayout() {
        return setBackgroundColorRes.toIntRange.view_dana_button_primary;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.requestPostMessageChannel, 0, 0);
            try {
                this.getMin = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.receiveFile, 0);
                this.setMax = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.ICustomTabsService$Default);
                this.length = obtainStyledAttributes.getDrawable(setBackgroundColorRes.IsOverlapping.ICustomTabsService$Stub);
                this.getMax = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.validateRelationship);
                this.setMin = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.ICustomTabsService$Stub$Proxy, 0);
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
            setDisabledWithAmount(str, str2);
        }
    }

    public void setActiveButton(String str, Drawable drawable) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setVisibility(0);
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_primary_active);
        this.amountButton.setVisibility(4);
        this.titleButtonLeft.setVisibility(4);
        this.iconButton.setVisibility(4);
        vallidateSize(this.setMin, this.containerView, this.titleButtonCenter);
    }

    public void setActiveButtonWithIcon(String str, Drawable drawable) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setVisibility(0);
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_primary_active);
        this.iconButton.setImageDrawable(drawable);
        this.iconButton.setVisibility(0);
        this.iconButton.setColorFilter(IntRange.setMax(getContext(), setBackgroundColorRes.getMax.IsOverlapping), PorterDuff.Mode.SRC_IN);
        this.titleButtonLeft.setVisibility(4);
        this.amountButton.setVisibility(4);
    }

    public void setActiveButtonLeftAlignWithAmount(String str, String str2) {
        this.titleButtonLeft.setText(str);
        this.titleButtonLeft.setVisibility(0);
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_primary_active);
        this.amountButton.setText(str2);
        this.amountButton.setVisibility(0);
        this.titleButtonCenter.setVisibility(4);
        this.iconButton.setVisibility(4);
    }

    public void setActiveButtonLeftAlignWithIcon(String str, Drawable drawable) {
        this.titleButtonLeft.setText(str);
        this.titleButtonLeft.setVisibility(0);
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_primary_active);
        this.iconButton.setImageDrawable(drawable);
        this.iconButton.setVisibility(0);
        this.amountButton.setVisibility(4);
        this.titleButtonCenter.setVisibility(4);
    }

    public void setDisabled(String str) {
        this.titleButtonCenter.setText(str);
        this.titleButtonCenter.setVisibility(0);
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_primary_disabled);
        this.iconButton.setVisibility(4);
        this.amountButton.setVisibility(4);
        this.titleButtonLeft.setVisibility(4);
        vallidateSize(this.setMin, this.containerView, this.titleButtonCenter);
    }

    public void setDisabledWithAmount(String str, String str2) {
        this.titleButtonLeft.setText(str);
        this.titleButtonLeft.setVisibility(0);
        this.containerView.setBackgroundResource(setBackgroundColorRes.getMin.bg_dana_button_primary_disabled);
        this.amountButton.setText(str2);
        this.amountButton.setVisibility(0);
        this.titleButtonCenter.setVisibility(4);
        this.iconButton.setVisibility(4);
    }

    public void setup() {
        this.containerView = (ConstraintLayout) getRootView().findViewById(setBackgroundColorRes.length.FastBitmap$CoordinateSystem);
        this.titleButtonLeft = (TextView) getRootView().findViewById(setBackgroundColorRes.length.IPostMessageService);
        this.titleButtonCenter = (TextView) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsService$Stub$Proxy);
        this.amountButton = (TextView) getRootView().findViewById(setBackgroundColorRes.length.newSession);
        this.iconButton = (ImageView) getRootView().findViewById(setBackgroundColorRes.length.onPostMessage);
        setDanaButtonView(this.getMin, this.setMax, this.getMax, this.length);
    }
}
