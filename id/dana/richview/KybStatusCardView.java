package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;

public class KybStatusCardView extends BaseRichView {
    @BindView(2131362764)
    ImageView dot;
    @BindView(2131363151)
    ImageView icKyb;
    @BindView(2131363709)
    ImageView kybImageArrow;
    @BindView(2131363710)
    TextView labelKybStatus;

    public int getLayout() {
        return R.layout.cardview_kyb_status;
    }

    public void setup() {
    }

    public KybStatusCardView(Context context) {
        super(context);
    }

    public KybStatusCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KybStatusCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 0;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(1000406071, oncanceled);
            onCancelLoad.getMin(1000406071, oncanceled);
        }
        ButterKnife.setMin(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, resetInternal.getMin.adjustVolume, 0, 0);
            try {
                this.icKyb.setImageResource(obtainStyledAttributes.getResourceId(3, R.drawable.ic_kyb));
                this.labelKybStatus.setText(obtainStyledAttributes.getString(4));
                this.kybImageArrow.setImageResource(obtainStyledAttributes.getResourceId(1, R.drawable.arrow));
                this.kybImageArrow.setRotation(obtainStyledAttributes.getFloat(2, 0.0f));
                ImageView imageView = this.dot;
                if (!obtainStyledAttributes.getBoolean(0, false)) {
                    i = 8;
                }
                imageView.setVisibility(i);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.icKyb.setImageDrawable(drawable);
    }

    public String getKybVerifyStatusText() {
        return this.labelKybStatus.getText().toString();
    }

    public void setKybVerifyStatusText(String str) {
        this.labelKybStatus.setText(str);
    }

    public void setCircleMarkVisibility(boolean z) {
        this.dot.setVisibility(z ? 0 : 8);
    }
}
