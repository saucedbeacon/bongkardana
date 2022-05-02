package id.dana.component.buttoncomponent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.component.BaseRichView;

public abstract class BaseDanaButton extends BaseRichView {
    public static final int ACTIVE = 1;
    public static final int ACTIVE_LEFT_ALIGN_WITH_AMOUNT = 3;
    public static final int ACTIVE_LEFT_ALIGN_WITH_ICON = 4;
    public static final int ACTIVE_WITH_ICON = 2;
    public static final int DISABLED = 0;
    public static final int DISABLED_WITH_AMOUNT = 5;
    public static final int ERROR = 5;
    public static final int SMALL_SIZE = 10;
    public static final int TINY_SIZE = 11;

    public abstract void setActiveButton(String str, Drawable drawable);

    public abstract void setActiveButtonLeftAlignWithAmount(String str, String str2);

    public abstract void setActiveButtonLeftAlignWithIcon(String str, Drawable drawable);

    public abstract void setActiveButtonWithIcon(String str, Drawable drawable);

    public abstract void setDisabled(String str);

    public abstract void setError(String str);

    public BaseDanaButton(@NonNull Context context) {
        super(context);
    }

    public BaseDanaButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseDanaButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BaseDanaButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void vallidateSize(int i, ConstraintLayout constraintLayout, TextView textView) {
        if (i == 10) {
            constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 32.0f)));
            textView.setTextSize(12.0f);
        } else if (i == 11) {
            constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (Resources.getSystem().getDisplayMetrics().density * 21.0f)));
            constraintLayout.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 6.0f), 0, (int) (Resources.getSystem().getDisplayMetrics().density * 6.0f), 0);
            textView.setTextSize(10.0f);
        }
    }
}
