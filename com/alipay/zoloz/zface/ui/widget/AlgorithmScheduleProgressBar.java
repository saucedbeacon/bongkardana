package com.alipay.zoloz.zface.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.zoloz.toyger.R;

public class AlgorithmScheduleProgressBar extends View {
    public static final int FILL = 1;
    public static final int STROKE = 0;
    private final int DEFAULT_INTERVAL;
    private final boolean DEFAULT_USE_ACCELERATE;
    private float backColorWidth;
    private int backgroundColor;
    private int endAngle;
    /* access modifiers changed from: private */
    public int mAnimateValue;
    private Handler mHandler;
    /* access modifiers changed from: private */
    public boolean mIsShowingProgress;
    private Matrix mMatrix;
    private Shader mProgressShader;
    public ValueAnimator mValueAnimator;
    private int mWidth;
    private int max;
    private Paint paint;
    private int progress;
    private int radius;
    private int roundColor;
    private int roundProgressColor;
    private int roundProgressEndColor;
    private int roundProgressStartColor;
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

    public AlgorithmScheduleProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public AlgorithmScheduleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlgorithmScheduleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.DEFAULT_INTERVAL = 500;
        this.DEFAULT_USE_ACCELERATE = false;
        this.mHandler = new Handler();
        this.mIsShowingProgress = false;
        this.style = 0;
        this.radius = 0;
        this.paint = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.zface_round_progressBar);
        this.roundColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_color, -65536);
        this.textColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_text_color, -16711936);
        this.textSize = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_text_size, 15.0f);
        this.roundWidth = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_round_width, 5.0f);
        this.max = obtainStyledAttributes.getInteger(R.styleable.zface_round_progressBar_zface_max, 100);
        this.textIsDisplayable = obtainStyledAttributes.getBoolean(R.styleable.zface_round_progressBar_zface_text_is_displayable, true);
        this.style = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_style, 0);
        this.roundShader = obtainStyledAttributes.getBoolean(R.styleable.zface_round_progressBar_zface_progress_shader, false);
        this.backColorWidth = obtainStyledAttributes.getDimension(R.styleable.zface_round_progressBar_zface_color_bg_width, 0.0f);
        this.startAngle = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_start_angle, 0);
        this.endAngle = obtainStyledAttributes.getInt(R.styleable.zface_round_progressBar_zface_end_angle, AUScreenAdaptTool.WIDTH_BASE);
        this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_background_color, -1);
        this.roundProgressColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_progress_color, -16711936);
        this.roundProgressStartColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_progress_start_color, -16711936);
        this.roundProgressEndColor = obtainStyledAttributes.getColor(R.styleable.zface_round_progressBar_zface_round_progress_end_color, -16711936);
        float f = this.backColorWidth;
        if (f > 0.0f && this.roundShader) {
            float f2 = f / 2.0f;
            float f3 = f / 2.0f;
            this.mProgressShader = new SweepGradient(f2, f3, this.roundProgressStartColor, this.roundProgressEndColor);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, f2, f3);
            this.mProgressShader.setLocalMatrix(matrix);
        }
        obtainStyledAttributes.recycle();
    }

    public void setProgressColor(int i, int i2, int i3) {
        if (this.mProgressShader != null) {
            float f = this.backColorWidth;
            float f2 = f / 2.0f;
            float f3 = f / 2.0f;
            this.mProgressShader = new SweepGradient(f2, f3, i2, i3);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, f2, f3);
            this.mProgressShader.setLocalMatrix(matrix);
        }
        this.roundColor = i;
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
            paintArc(canvas, rectF, Paint.Style.STROKE, true);
        } else if (i4 == 1) {
            paintArc(canvas, rectF, Paint.Style.FILL_AND_STROKE, false);
        }
    }

    private void paintArc(Canvas canvas, RectF rectF, Paint.Style style2, boolean z) {
        this.paint.setStyle(style2);
        Shader shader = this.mProgressShader;
        if (shader != null && z) {
            this.paint.setShader(shader);
        }
        int i = this.progress;
        if (i != 0) {
            int i2 = this.endAngle;
            int i3 = this.startAngle;
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            canvas2.drawArc(rectF2, (float) (i3 + 90), ((((float) (i2 - i3)) * 1.0f) * ((float) i)) / ((float) this.max), false, this.paint);
        }
        this.paint.setShader((Shader) null);
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
        postInvalidate();
    }

    public void setRoundColor(int i) {
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
        return this.roundProgressStartColor;
    }

    public void setCricleProgressColor(int i) {
        this.roundProgressStartColor = i;
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

    public void showProgress(float f) {
        showProgress(f, 500, false);
    }

    public void showProgress(float f, int i) {
        showProgress(f, i, false);
    }

    public void showProgress(float f, int i, boolean z) {
        showAnimator((int) (f * ((float) getMax())), i, z);
    }

    private void showAnimator(final int i, int i2, boolean z) {
        if (!this.mIsShowingProgress) {
            this.mIsShowingProgress = true;
            long j = (long) i2;
            this.mHandler.postDelayed(new Runnable() {
                public void run() {
                    boolean unused = AlgorithmScheduleProgressBar.this.mIsShowingProgress = false;
                }
            }, j);
            int progress2 = getProgress();
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{progress2, i});
            this.mValueAnimator = ofInt;
            ofInt.setDuration(j);
            if (z) {
                this.mValueAnimator.setInterpolator(new LinearInterpolator());
            } else {
                this.mValueAnimator.setInterpolator(new AccelerateInterpolator());
            }
            this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (AlgorithmScheduleProgressBar.this.mValueAnimator != null && AlgorithmScheduleProgressBar.this.mValueAnimator.isRunning()) {
                        AlgorithmScheduleProgressBar algorithmScheduleProgressBar = AlgorithmScheduleProgressBar.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(AlgorithmScheduleProgressBar.this.mValueAnimator.getAnimatedValue());
                        int unused = algorithmScheduleProgressBar.mAnimateValue = Integer.parseInt(sb.toString());
                        AlgorithmScheduleProgressBar algorithmScheduleProgressBar2 = AlgorithmScheduleProgressBar.this;
                        algorithmScheduleProgressBar2.setProgress(algorithmScheduleProgressBar2.mAnimateValue);
                        if (i == AlgorithmScheduleProgressBar.this.mAnimateValue) {
                            boolean unused2 = AlgorithmScheduleProgressBar.this.mIsShowingProgress = false;
                            AlgorithmScheduleProgressBar.this.mValueAnimator.cancel();
                            AlgorithmScheduleProgressBar.this.mValueAnimator = null;
                        }
                    }
                }
            });
            this.mValueAnimator.start();
        }
    }
}
