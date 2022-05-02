package com.alipay.biometrics.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.android.phone.mobilecommon.biometric.bio.R;
import com.alipay.mobile.security.bio.utils.BitmapHelper;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class RoundProgressBar extends View {
    public static final int FILL = 1;
    public static final int STROKE = 0;
    private float backColorWidth;
    private int backgroundColor;
    private int endAngle;
    public BitmapShader mBitmapShader;
    private Matrix mMatrix;
    private int mWidth;
    private int max;
    private Paint paint;
    private int progress;
    private int radius;
    private int roundColor;
    private int roundProgressColor;
    private boolean roundShader;
    private float roundWidth;
    private int startAngle;
    private int style;
    private int textColor;
    private boolean textIsDisplayable;
    private float textSize;

    public int getRadius() {
        return this.radius;
    }

    public RoundProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.style = 0;
        this.radius = 0;
        this.paint = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.bio_round_progressBar);
        this.roundColor = obtainStyledAttributes.getColor(R.styleable.bio_round_progressBar_bio_round_color, -65536);
        this.roundProgressColor = obtainStyledAttributes.getColor(R.styleable.bio_round_progressBar_bio_round_progress_color, -16711936);
        this.textColor = obtainStyledAttributes.getColor(R.styleable.bio_round_progressBar_bio_text_color, -16711936);
        this.textSize = obtainStyledAttributes.getDimension(R.styleable.bio_round_progressBar_bio_text_size, 15.0f);
        this.roundWidth = obtainStyledAttributes.getDimension(R.styleable.bio_round_progressBar_bio_round_width, 5.0f);
        this.max = obtainStyledAttributes.getInteger(R.styleable.bio_round_progressBar_bio_max, 100);
        this.textIsDisplayable = obtainStyledAttributes.getBoolean(R.styleable.bio_round_progressBar_bio_text_is_displayable, true);
        this.style = obtainStyledAttributes.getInt(R.styleable.bio_round_progressBar_bio_style, 0);
        this.roundShader = obtainStyledAttributes.getBoolean(R.styleable.bio_round_progressBar_bio_progress_shader, false);
        this.backColorWidth = obtainStyledAttributes.getDimension(R.styleable.bio_round_progressBar_bio_color_bg_width, 0.0f);
        this.startAngle = obtainStyledAttributes.getInt(R.styleable.bio_round_progressBar_bio_start_angle, 0);
        this.endAngle = obtainStyledAttributes.getInt(R.styleable.bio_round_progressBar_bio_end_angle, AUScreenAdaptTool.WIDTH_BASE);
        this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.bio_round_progressBar_bio_background_color, -1);
        if (this.backColorWidth > 0.0f && this.roundShader) {
            this.mMatrix = new Matrix();
            Bitmap readBitMap = BitmapHelper.readBitMap(context, R.drawable.circle_bg);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.mBitmapShader = new BitmapShader(readBitMap, tileMode, tileMode);
            this.mWidth = (int) this.backColorWidth;
            float min = (((float) this.mWidth) * 1.0f) / ((float) Math.min(readBitMap.getWidth(), readBitMap.getHeight()));
            this.mMatrix.setScale(min, min);
            this.mBitmapShader.setLocalMatrix(this.mMatrix);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f = (float) width;
        this.radius = (int) (f - (this.roundWidth / 2.0f));
        this.paint.setColor(this.roundColor);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.roundWidth);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setColor(this.backgroundColor);
        canvas.drawCircle(f, f, (float) this.radius, this.paint);
        this.paint.setStrokeWidth(0.0f);
        this.paint.setColor(this.textColor);
        this.paint.setTextSize(this.textSize);
        this.paint.setTypeface(Typeface.DEFAULT_BOLD);
        int i = (int) ((((float) this.progress) / ((float) this.max)) * 100.0f);
        Paint paint2 = this.paint;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("%");
        float measureText = paint2.measureText(sb.toString());
        this.paint.setShader((Shader) null);
        if (this.textIsDisplayable && i != 0 && this.style == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append("%");
            canvas.drawText(sb2.toString(), f - (measureText / 2.0f), f + (this.textSize / 2.0f), this.paint);
        }
        this.paint.setStrokeWidth(this.roundWidth);
        int i2 = this.radius;
        RectF rectF = new RectF((float) (width - i2), (float) (width - i2), (float) (width + i2), (float) (width + i2));
        this.paint.setColor(this.roundColor);
        int i3 = this.startAngle;
        canvas.drawArc(rectF, (float) (i3 + 90), (float) (this.endAngle - i3), false, this.paint);
        this.paint.setColor(this.roundProgressColor);
        int i4 = this.style;
        if (i4 == 0) {
            paintStroke(canvas, rectF);
        } else if (i4 == 1) {
            this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
            int i5 = this.progress;
            if (i5 != 0) {
                int i6 = this.startAngle;
                canvas.drawArc(rectF, (float) (i6 + 90), (float) (((this.endAngle - i6) * i5) / this.max), true, this.paint);
            }
        }
    }

    private void paintStroke(Canvas canvas, RectF rectF) {
        this.paint.setStyle(Paint.Style.STROKE);
        BitmapShader bitmapShader = this.mBitmapShader;
        if (bitmapShader != null) {
            this.paint.setShader(bitmapShader);
        }
        int i = this.startAngle;
        canvas.drawArc(rectF, (float) (i + 90), (float) (((this.endAngle - i) * this.progress) / this.max), false, this.paint);
        this.paint.setShader((Shader) null);
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
        postInvalidate();
    }

    public void setRoundColor(int i) {
        int max2 = dispatchOnCancelled.setMax(i);
        if (i != max2) {
            onCanceled oncanceled = new onCanceled(i, max2, 1);
            onCancelLoad.setMax(-2065025785, oncanceled);
            onCancelLoad.getMin(-2065025785, oncanceled);
        }
        this.roundColor = i;
        postInvalidate();
    }

    public synchronized int getMax() {
        return this.max;
    }

    public synchronized void setMax(int i) {
        if (i >= 0) {
            this.max = i;
        } else {
            throw new IllegalArgumentException("max not less than 0");
        }
    }

    public synchronized int getProgress() {
        return this.progress;
    }

    public synchronized void setProgress(int i) {
        if (i >= 0) {
            if (i > this.max) {
                i = this.max;
            }
            if (i <= this.max) {
                this.progress = i;
                postInvalidate();
            }
        } else {
            throw new IllegalArgumentException("progress not less than 0");
        }
    }

    public int getCricleColor() {
        return this.roundColor;
    }

    public void setCricleColor(int i) {
        this.roundColor = i;
    }

    public int getCricleProgressColor() {
        return this.roundProgressColor;
    }

    public void setCricleProgressColor(int i) {
        this.roundProgressColor = i;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public void setTextColor(int i) {
        this.textColor = i;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextSize(float f) {
        this.textSize = f;
    }

    public float getRoundWidth() {
        return this.roundWidth;
    }

    public void setRoundWidth(float f) {
        this.roundWidth = f;
    }
}
