package id.dana.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.IntRange;
import o.resetInternal;

public class GridMenuView extends BaseRichView {
    @BindView(2131363173)
    ImageView imageView;
    private String length;
    private Drawable setMax;
    @BindView(2131364837)
    TextView titleView;

    public int getLayout() {
        return R.layout.view_grid_menu;
    }

    public GridMenuView(@NonNull Context context) {
        super(context);
    }

    public GridMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GridMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public GridMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.onExtrasChanged);
            try {
                this.length = obtainStyledAttributes.getString(1);
                this.setMax = IntRange.length(getContext(), obtainStyledAttributes.getResourceId(0, -1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        setTitle(this.length);
        setImage(this.setMax);
    }

    public void setTitle(String str) {
        this.titleView.setText(str);
    }

    public void setImage(Drawable drawable) {
        this.imageView.setImageDrawable(drawable);
    }

    public void setImage(@DrawableRes int i) {
        this.imageView.setImageResource(i);
    }
}
