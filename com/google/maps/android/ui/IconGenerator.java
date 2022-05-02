package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.google.maps.android.R;

public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 1.0f;
    private BubbleDrawable mBackground;
    private ViewGroup mContainer;
    private View mContentView;
    private final Context mContext;
    private int mRotation;
    private RotationLayout mRotationLayout;
    private TextView mTextView;

    private static int getStyleColor(int i) {
        if (i == 3) {
            return -3407872;
        }
        if (i == 4) {
            return -16737844;
        }
        if (i == 5) {
            return -10053376;
        }
        if (i != 6) {
            return i != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    public IconGenerator(Context context) {
        this.mContext = context;
        this.mBackground = new BubbleDrawable(this.mContext);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.mContext).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.mContainer = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.mRotationLayout = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        this.mTextView = textView;
        this.mContentView = textView;
        setStyle(1);
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public Bitmap makeIcon() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContainer.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.mContainer.getMeasuredWidth();
        int measuredHeight = this.mContainer.getMeasuredHeight();
        this.mContainer.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.mRotation;
        if (i == 1 || i == 3) {
            measuredHeight = this.mContainer.getMeasuredWidth();
            measuredWidth = this.mContainer.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = this.mRotation;
        if (i2 == 1) {
            canvas.translate((float) measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i2 == 2) {
            canvas.rotate(180.0f, (float) (measuredWidth / 2), (float) (measuredHeight / 2));
        } else if (i2 == 3) {
            canvas.translate(0.0f, (float) measuredHeight);
            canvas.rotate(270.0f);
        }
        this.mContainer.draw(canvas);
        return createBitmap;
    }

    public void setContentView(View view) {
        this.mRotationLayout.removeAllViews();
        this.mRotationLayout.addView(view);
        this.mContentView = view;
        View findViewById = this.mRotationLayout.findViewById(R.id.amu_text);
        this.mTextView = findViewById instanceof TextView ? (TextView) findViewById : null;
    }

    public void setContentRotation(int i) {
        this.mRotationLayout.setViewRotation(i);
    }

    public void setRotation(int i) {
        this.mRotation = ((i + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE) / 90;
    }

    public float getAnchorU() {
        return rotateAnchor(this.mAnchorU, this.mAnchorV);
    }

    public float getAnchorV() {
        return rotateAnchor(this.mAnchorV, this.mAnchorU);
    }

    private float rotateAnchor(float f, float f2) {
        int i = this.mRotation;
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            return 1.0f - f2;
        }
        if (i == 2) {
            return 1.0f - f;
        }
        if (i == 3) {
            return f2;
        }
        throw new IllegalStateException();
    }

    public void setTextAppearance(Context context, int i) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(this.mContext, i);
    }

    public void setStyle(int i) {
        setColor(getStyleColor(i));
        setTextAppearance(this.mContext, getTextStyle(i));
    }

    public void setColor(int i) {
        this.mBackground.setColor(i);
        setBackground(this.mBackground);
    }

    public void setBackground(Drawable drawable) {
        this.mContainer.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.mContainer.setPadding(0, 0, 0, 0);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentView.setPadding(i, i2, i3, i4);
    }

    private static int getTextStyle(int i) {
        if (i == 3 || i == 4 || i == 5 || i == 6 || i == 7) {
            return R.style.amu_Bubble_TextAppearance_Light;
        }
        return R.style.amu_Bubble_TextAppearance_Dark;
    }
}
