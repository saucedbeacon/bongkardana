package id.dana.component.cellcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.component.BaseRichView;

public abstract class BaseDanaCell extends BaseRichView {
    public static final int CELL_LEFT_ICON_LABEL = 2;
    public static final int CELL_LEFT_ICON_LABEL_DESC = 4;
    public static final int CELL_LEFT_ICON_LABEL_INDENT = 3;
    public static final int CELL_LEFT_LABEL = 0;
    public static final int CELL_LEFT_LABEL_DESC = 1;
    public static final int CELL_LEFT_LABEL_DESC_ICON_RIGHT = 8;
    public static final int CELL_LEFT_LABEL_ICON_RIGHT = 7;
    public static final int CELL_LEFT_LOGO_LABEL = 5;
    public static final int CELL_LEFT_LOGO_LABEL_DESC = 6;
    public static final int CELL_RIGHT_AMOUNT = 0;
    public static final int CELL_RIGHT_ARROW = 1;
    public static final int CELL_RIGHT_ARROW_CHIP = 5;
    public static final int CELL_RIGHT_ARROW_DANA = 6;
    public static final int CELL_RIGHT_ARROW_NOTIF = 3;
    public static final int CELL_RIGHT_ARROW_VALUE = 11;
    public static final int CELL_RIGHT_BUTTON = 2;
    public static final int CELL_RIGHT_CHIP = 4;
    public static final int CELL_RIGHT_ICON = 12;
    public static final int CELL_RIGHT_STEPPER = 8;
    public static final int CELL_RIGHT_SWITCH = 10;
    public static final int CELL_RIGHT_VALUE = 7;
    public static final int CELL_RIGHT_VALUE_DOUBLE = 9;

    public BaseDanaCell(@NonNull Context context) {
        super(context);
    }

    public BaseDanaCell(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseDanaCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BaseDanaCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setSmallCell(ConstraintLayout constraintLayout) {
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 44.0f)));
    }

    public void vallidateSmallCell(ConstraintLayout constraintLayout, boolean z) {
        if (z) {
            setSmallCell(constraintLayout);
        }
    }

    public void setPaddingCell(ConstraintLayout constraintLayout, int i) {
        constraintLayout.setPadding(i, 0, (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), 0);
    }
}
