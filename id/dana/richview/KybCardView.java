package id.dana.richview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.IntRange;
import o.getInsetDodgeRect;
import o.onDetachedFromLayoutParams;
import o.resetInternal;

public class KybCardView extends BaseRichView {
    private onDetachedFromLayoutParams IsOverlapping;
    private onDetachedFromLayoutParams equals;
    private ImageView getMax;
    private TextView getMin;
    private ConstraintLayout isInside;
    private ImageView length;
    private ImageView setMax;
    private TextView setMin;

    public int getLayout() {
        return R.layout.cardview_kyb;
    }

    public void setup() {
    }

    public KybCardView(Context context) {
        super(context);
    }

    public KybCardView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KybCardView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        this.getMin = (TextView) findViewById(R.id.f51522131363708);
        this.setMin = (TextView) findViewById(R.id.f51502131363706);
        this.setMax = (ImageView) findViewById(R.id.f51512131363707);
        this.length = (ImageView) findViewById(R.id.f46062131363151);
        this.getMax = (ImageView) findViewById(R.id.f51532131363709);
        this.isInside = (ConstraintLayout) findViewById(R.id.f39732131362453);
        if (attributeSet != null) {
            int i = 0;
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, resetInternal.getMin.getMetadata, 0, 0);
            try {
                this.getMin.setText(obtainStyledAttributes.getString(1));
                this.setMin.setText(obtainStyledAttributes.getString(0));
                this.length.setImageResource(obtainStyledAttributes.getResourceId(4, R.drawable.ic_kyb));
                this.getMax.setImageResource(obtainStyledAttributes.getResourceId(2, R.drawable.arrow));
                this.getMax.setRotation(obtainStyledAttributes.getFloat(3, 0.0f));
                ImageView imageView = this.setMax;
                if (!obtainStyledAttributes.getBoolean(5, false)) {
                    i = 8;
                }
                imageView.setVisibility(i);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public String getKybBodyText() {
        return this.setMin.getText().toString();
    }

    public void setKybBodyText(String str) {
        int i;
        TextView textView = this.setMin;
        if (textView != null) {
            textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            this.setMin.setText(str);
            if (TextUtils.isEmpty(str)) {
                i = getResources().getDimensionPixelOffset(R.dimen.f32072131165942);
            } else {
                i = getResources().getDimensionPixelOffset(R.dimen.f32062131165941);
            }
            Integer valueOf = Integer.valueOf(i);
            this.isInside.setPadding(0, valueOf.intValue(), 0, valueOf.intValue());
        }
    }

    public void setKybSubtitleColor(String str) {
        if (str == null || str.equals("")) {
            TextViewCompat.setMax(this.setMin, (int) R.style.f78382131951905);
        } else {
            this.setMin.setTextColor(Color.parseColor(str));
        }
    }

    public String getKybHeaderText() {
        return this.getMin.getText().toString();
    }

    public void setKybHeaderText(String str) {
        if (this.getMin == null || TextUtils.isEmpty(str)) {
            showTextViewSkeleton();
            return;
        }
        hideTextViewSkeleton();
        this.getMin.setText(str);
    }

    public void setIcKyb(Drawable drawable) {
        this.length.setImageDrawable(drawable);
    }

    public void setArrowImage(Drawable drawable) {
        this.getMax.setImageDrawable(drawable);
    }

    public void setCircleMarkVisibility(boolean z) {
        ImageView imageView = this.setMax;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setParentVisibility(int i) {
        this.isInside.setVisibility(i);
    }

    public void hideTextViewSkeleton() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.equals;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
            this.equals = null;
        }
        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.IsOverlapping;
        if (ondetachedfromlayoutparams2 != null) {
            ondetachedfromlayoutparams2.length();
            this.IsOverlapping = null;
        }
    }

    public void showTextViewSkeleton() {
        this.equals = setMin(this.getMin);
        this.IsOverlapping = setMin(this.setMin);
    }

    private static onDetachedFromLayoutParams setMin(View view) {
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(view);
        setmax.getMax = R.layout.view_icon_me_page_skeleton;
        setmax.isInside = 20;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        return getinsetdodgerect;
    }
}
