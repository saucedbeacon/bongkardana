package zoloz.ap.com.toolkit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import zoloz.ap.com.toolkit.R;

public class CustomButton extends Button {
    private static String fontName;

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.obtainStyledAttributes(attributeSet, R.styleable.CustomButton).recycle();
        FontUtils.setFont(this, CustomTextView.fontName);
    }

    public CustomButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void setFontName(String str) {
        fontName = str;
    }

    public void setTextFont() {
        FontUtils.setFont(this, fontName);
    }
}
