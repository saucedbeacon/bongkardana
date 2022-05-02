package zoloz.ap.com.toolkit.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import zoloz.ap.com.toolkit.R;
import zoloz.ap.com.toolkit.R2;

public class TitleBar extends RelativeLayout {
    private View mBackLayout;
    private CustomTextView mTitleTextView;

    public TitleBar(Context context) {
        super(context);
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        boolean z2;
        View inflate = inflate(context, R.layout.layout_titile_bar, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TitleBar);
        obtainStyledAttributes.getString(R.styleable.TitleBar_z_text);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.TitleBar_z_left_src, -1);
        int color = obtainStyledAttributes.getColor(R.styleable.TitleBar_z_background, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.TitleBar_z_bg, -1);
        int color2 = obtainStyledAttributes.getColor(R.styleable.TitleBar_z_text_color, -1);
        boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.TitleBar_z_separate_visibility, true);
        boolean z4 = obtainStyledAttributes.getBoolean(R.styleable.TitleBar_z_custom, false);
        obtainStyledAttributes.recycle();
        this.mTitleTextView = (CustomTextView) findViewById(R.id.tv_title);
        if (resourceId2 != -1) {
            inflate.setBackgroundResource(resourceId2);
        } else {
            inflate.setBackgroundColor(color);
        }
        this.mTitleTextView = (CustomTextView) findViewById(R.id.tv_title);
        if (color2 != -1) {
            setTextColor(color2);
        }
        if (resourceId != -1) {
            setBackDrawable(getResources().getDrawable(resourceId));
        }
        if (!z3) {
            findViewById(R.id.iv_separate).setVisibility(8);
            findViewById(R.id.iv_bar).setVisibility(8);
        }
        if (z4) {
            this.mTitleTextView.setTextFont();
            this.mTitleTextView.setSize();
        }
        try {
            z = R2.bool.title_bar_title_center_horizontal();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTitleTextView.getLayoutParams();
            layoutParams.addRule(14);
            this.mTitleTextView.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mTitleTextView.getLayoutParams();
            layoutParams2.addRule(17, R.id.iv_separate);
            layoutParams2.addRule(1, R.id.iv_separate);
            this.mTitleTextView.setLayoutParams(layoutParams2);
        }
        try {
            z2 = R2.bool.title_bar_left();
        } catch (Exception unused2) {
            z2 = true;
        }
        if (z2) {
            updateBackBtn(R.id.btn_left, R.id.iv_left, R.id.tv_left, z4);
            gone(R.id.btn_right);
            return;
        }
        updateBackBtn(R.id.btn_right, R.id.iv_right, R.id.tv_right, z4);
        gone(R.id.btn_left, R.id.iv_separate);
    }

    private void updateBackBtn(int i, int i2, int i3, boolean z) {
        this.mBackLayout = findViewById(i);
        CustomTextView customTextView = (CustomTextView) findViewById(i3);
        String title_back = R2.string.title_back();
        if (!TextUtils.isEmpty(title_back)) {
            gone(i2);
            visible(i3);
            customTextView.setText(title_back);
            customTextView.setTextColor(R2.color.title_back_color());
            if (z) {
                customTextView.setTextFont();
                return;
            }
            return;
        }
        gone(i3);
        visible(i2);
    }

    private void gone(int... iArr) {
        for (int findViewById : iArr) {
            findViewById(findViewById).setVisibility(8);
        }
    }

    private void visible(int... iArr) {
        for (int findViewById : iArr) {
            findViewById(findViewById).setVisibility(0);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setText(String str) {
        this.mTitleTextView.setText(str);
    }

    public void setTextColor(int i) {
        this.mTitleTextView.setTextColor(i);
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.mBackLayout.setOnClickListener(onClickListener);
    }

    public void setBackDrawable(Drawable drawable) {
        if (drawable != null) {
            ((ImageView) findViewById(R.id.iv_left)).setImageDrawable(drawable);
            ((ImageView) findViewById(R.id.iv_right)).setImageDrawable(drawable);
        }
    }
}
