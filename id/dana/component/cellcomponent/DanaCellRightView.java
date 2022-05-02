package id.dana.component.cellcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import o.setAnimationListener;
import o.setBackgroundColorRes;

public class DanaCellRightView extends BaseDanaCell {
    ConstraintLayout containerView;
    private String getMax;
    private String getMin;
    boolean isSmallCell;
    private int length;
    ImageView redDot;
    TextView rightAmount;
    TextView rightBlueColorValue;
    DanaButtonSecondaryView rightButton;
    ImageView rightDanaLogo;
    ImageView rightIcon;
    LinearLayout rightIconChip;
    DanaStepperView rightStepper;
    TextView rightSubValue;
    SwitchCompat rightSwitch;
    TextView rightValue;
    LinearLayout rightValueDouble;
    private Drawable setMax;
    private String setMin;

    public DanaCellRightView(@NonNull Context context) {
        super(context);
    }

    public DanaCellRightView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaCellRightView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayout() {
        return setBackgroundColorRes.toIntRange.view_dana_cell_right;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.notifyNotificationWithChannel, 0, 0);
            try {
                this.length = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.INotificationSideChannel, 0);
                this.setMax = obtainStyledAttributes.getDrawable(setBackgroundColorRes.IsOverlapping.getActiveNotifications);
                this.getMin = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.ITrustedWebActivityService$Default);
                this.setMin = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.ITrustedWebActivityService$Stub);
                this.getMax = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.getSmallIconId);
                this.isSmallCell = obtainStyledAttributes.getBoolean(setBackgroundColorRes.IsOverlapping.notify, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setCellRightIcon(Drawable drawable) {
        this.rightIcon.setVisibility(0);
        this.rightIcon.setImageDrawable(drawable);
    }

    public void setCellRightArrowValue(String str) {
        this.rightBlueColorValue.setVisibility(0);
        this.rightBlueColorValue.setText(str);
        setRightArrow();
    }

    public void setRightSwitchChecked(boolean z) {
        this.rightSwitch.setChecked(z);
    }

    public void setCellRightValueDouble(String str, String str2) {
        this.rightValueDouble.setVisibility(0);
        this.rightValue.setText(str);
        this.rightSubValue.setText(str2);
    }

    public void setCellRightStepper() {
        this.rightStepper.setVisibility(0);
    }

    public void setCellRightValue(String str) {
        this.rightValue.setText(str);
        this.rightValueDouble.setVisibility(0);
        this.rightSubValue.setVisibility(8);
    }

    public void setCellRightArrowDana() {
        setRightArrow();
        this.containerView.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0, (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), 0);
        this.rightDanaLogo.setVisibility(0);
    }

    public void setCellRightArrowChip() {
        setCellRightChip();
        setRightArrow();
        this.containerView.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0, (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), 0);
    }

    public void setCellRightChip() {
        this.rightIconChip.setVisibility(0);
    }

    public void setRightArrowNotif() {
        this.redDot.setVisibility(0);
        setRightArrow();
        this.containerView.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0, (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), 0);
    }

    public void setCellRightButton(String str) {
        this.rightButton.setVisibility(0);
        this.rightButton.setActiveButton(str, (Drawable) null);
    }

    public void setRightArrow() {
        this.rightIcon.setVisibility(0);
        this.rightIcon.setImageDrawable(getResources().getDrawable(setBackgroundColorRes.getMin.ic_arrow_right));
        this.containerView.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0, (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), 0);
    }

    public void setCellRightAmount(String str) {
        this.rightAmount.setVisibility(0);
        this.rightAmount.setText(str);
    }

    public void setup() {
        this.containerView = (ConstraintLayout) getRootView().findViewById(setBackgroundColorRes.length.toString);
        this.rightAmount = (TextView) getRootView().findViewById(setBackgroundColorRes.length.validateRelationship);
        this.rightValue = (TextView) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsService$Stub);
        this.rightSubValue = (TextView) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsService$Default);
        this.rightBlueColorValue = (TextView) getRootView().findViewById(setBackgroundColorRes.length.extraCommand);
        this.rightIcon = (ImageView) getRootView().findViewById(setBackgroundColorRes.length.onNavigationEvent);
        this.redDot = (ImageView) getRootView().findViewById(setBackgroundColorRes.length.asBinder);
        this.rightDanaLogo = (ImageView) getRootView().findViewById(setBackgroundColorRes.length.b);
        this.rightButton = (DanaButtonSecondaryView) getRootView().findViewById(setBackgroundColorRes.length.getMax);
        this.rightValueDouble = (LinearLayout) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsCallback$Stub);
        this.rightIconChip = (LinearLayout) getRootView().findViewById(setBackgroundColorRes.length.onTransact);
        this.rightSwitch = (SwitchCompat) getRootView().findViewById(setBackgroundColorRes.length.ICustomTabsCallback$Stub$Proxy);
        this.rightStepper = (DanaStepperView) getRootView().findViewById(setBackgroundColorRes.length.IPostMessageService$Stub);
        int i = this.length;
        Drawable drawable = this.setMax;
        String str = this.getMin;
        String str2 = this.setMin;
        String str3 = this.getMax;
        switch (i) {
            case 0:
                setCellRightAmount(str3);
                break;
            case 1:
                setRightArrow();
                break;
            case 2:
                setCellRightButton(str);
                break;
            case 3:
                setRightArrowNotif();
                break;
            case 4:
                setCellRightChip();
                break;
            case 5:
                setCellRightArrowChip();
                break;
            case 6:
                setCellRightArrowDana();
                break;
            case 7:
                setCellRightValue(str);
                break;
            case 8:
                setCellRightStepper();
                break;
            case 9:
                setCellRightValueDouble(str, str2);
                break;
            case 10:
                this.containerView.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0, (int) (Resources.getSystem().getDisplayMetrics().density * 10.0f), 0);
                this.rightSwitch.setVisibility(0);
                this.rightSwitch.setOnCheckedChangeListener(new setAnimationListener(this));
                break;
            case 11:
                setCellRightArrowValue(str);
                break;
            case 12:
                setCellRightIcon(drawable);
                break;
        }
        vallidateSmallCell(this.containerView, this.isSmallCell);
    }

    public static /* synthetic */ void length(DanaCellRightView danaCellRightView, boolean z) {
        danaCellRightView.rightSwitch.setThumbTintList(danaCellRightView.getResources().getColorStateList(setBackgroundColorRes.getMax.IsOverlapping));
        if (z) {
            danaCellRightView.rightSwitch.setTrackTintList(danaCellRightView.getResources().getColorStateList(setBackgroundColorRes.getMax.setMax));
        } else {
            danaCellRightView.rightSwitch.setTrackTintList(danaCellRightView.getResources().getColorStateList(setBackgroundColorRes.getMax.setMin));
        }
    }
}
