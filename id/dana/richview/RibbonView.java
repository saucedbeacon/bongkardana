package id.dana.richview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.resetInternal;

public class RibbonView extends BaseRichView {
    @BindView(2131363498)
    ImageView ivInfo;
    @BindView(2131363614)
    LinearLayout ivRibbon;
    @BindView(2131363885)
    LinearLayout llLineBottom;
    @BindView(2131365525)
    TextView tvRibbonLineBottom;
    @BindView(2131365526)
    TextView tvRibbonLineTop;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
        public static final int BOTTOM_LEFT = 1;
        public static final int HEADER_RIGHT = 0;
    }

    public int getLayout() {
        return R.layout.view_ribbon_display;
    }

    public void setup() {
    }

    public RibbonView(@NonNull Context context) {
        super(context);
    }

    public RibbonView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RibbonView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RibbonView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            setStyledAttributes(context, attributeSet, resetInternal.getMin.peekAvailableContext);
            try {
                setRibbonView();
            } finally {
                getStyledAttributes().recycle();
            }
        }
    }

    public void setRibbonPosition(Integer num) {
        if (num.intValue() == 0) {
            this.ivRibbon.setBackgroundResource(R.drawable.img_ribbon_header_right);
        } else if (num.intValue() == 1) {
            this.ivRibbon.setBackgroundResource(R.drawable.img_ribbon_bottom_left);
        }
    }

    public void setRibbonLineTopText(String str) {
        TextView textView = this.tvRibbonLineTop;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setRibbonLineBottomText(String str) {
        TextView textView = this.tvRibbonLineBottom;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setIvInfoVisibility(boolean z) {
        this.ivInfo.setVisibility(z ? 0 : 8);
    }

    public void setSingleLineRibbon(boolean z) {
        LinearLayout linearLayout = this.llLineBottom;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 8 : 0);
        }
    }

    public void setTextSizeLineTop(float f) {
        this.tvRibbonLineTop.setTextSize(0, f);
    }

    public void setTextSizeLineBottom(float f) {
        this.tvRibbonLineBottom.setTextSize(0, f);
    }

    public void setIvInfoSize(int i) {
        this.ivInfo.getLayoutParams().height = i;
        this.ivInfo.getLayoutParams().width = i;
        this.ivInfo.requestLayout();
    }

    public void setRibbonView() {
        Integer valueOf = Integer.valueOf(getStyledAttributes().getInt(3, 0));
        if (valueOf.intValue() == 0) {
            this.ivRibbon.setBackgroundResource(R.drawable.img_ribbon_header_right);
        } else if (valueOf.intValue() == 1) {
            this.ivRibbon.setBackgroundResource(R.drawable.img_ribbon_bottom_left);
        }
        setSingleLineRibbon(getStyledAttributes().getBoolean(2, false));
        setIvInfoVisibility(getStyledAttributes().getBoolean(1, false));
        setRibbonLineTopText(getStyledAttributes().getString(5));
        TextView textView = this.tvRibbonLineBottom;
        if (textView != null) {
            textView.setText(getStyledAttributes().getString(4));
        }
        setTextSizeLineTop((float) getStyledAttributes().getDimensionPixelSize(7, (int) this.tvRibbonLineTop.getTextSize()));
        setTextSizeLineBottom((float) getStyledAttributes().getDimensionPixelSize(6, (int) this.tvRibbonLineBottom.getTextSize()));
        setIvInfoSize(getStyledAttributes().getDimensionPixelSize(0, this.ivInfo.getHeight()));
    }
}
