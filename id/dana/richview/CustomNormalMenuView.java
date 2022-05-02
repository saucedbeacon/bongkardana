package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.resetInternal;

public class CustomNormalMenuView extends BaseRichView {
    private Drawable getMin;
    @BindView(2131363479)
    ImageView ivIcon;
    @BindView(2131364415)
    RelativeLayout rlIcon;
    private String setMax;
    private int setMin;
    @BindView(2131365346)
    TextView tvMenuName;
    @BindView(2131365398)
    TextView tvNotif;

    public int getLayout() {
        return R.layout.view_custom_normal_menu;
    }

    public CustomNormalMenuView(@NonNull Context context) {
        super(context);
    }

    public CustomNormalMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomNormalMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomNormalMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        setIcon(this.getMin);
        setIconName(this.setMax);
        setTotalUnreadNotif(this.setMin);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.ITrustedWebActivityCallback$Stub$Proxy);
            try {
                this.setMax = obtainStyledAttributes.getString(1);
                this.getMin = obtainStyledAttributes.getDrawable(0);
                this.setMin = obtainStyledAttributes.getInt(2, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.getMin = drawable;
        this.ivIcon.setImageDrawable(drawable);
    }

    public void setIconName(@NonNull String str) {
        this.setMax = str;
        this.tvMenuName.setText(str);
    }

    public void setTotalUnreadNotif(int i) {
        this.setMin = i;
        this.tvNotif.setVisibility(8);
        if (i > 0) {
            this.tvNotif.setText(String.valueOf(i));
            this.tvNotif.setVisibility(0);
        }
    }

    public void setNotifBackground(Drawable drawable) {
        if (drawable != null) {
            this.tvNotif.setBackground(drawable);
            this.tvNotif.setVisibility(0);
        }
    }

    public String getMenuName() {
        return this.setMax;
    }
}
