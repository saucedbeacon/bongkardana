package com.alibaba.griver.ui.splash;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ariver.app.api.ui.StatusBarUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.utils.TypefaceCache;
import java.io.File;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

class SplashLoadingView extends LoadingView {
    public static final String ANIMATION_STOP_LOADING_PREPARE = "ANIMATION_STOP_LOADING_PREPARE";
    public static final String DATA_UPDATE_APPEARANCE_BG_COLOR = "UPDATE_APPEARANCE_BG_COLOR";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_BOTTOM_TIP = "UPDATE_APPEARANCE_LOADING_BOTTOM_TIP";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_ICON = "UPDATE_APPEARANCE_LOADING_ICON";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_TEXT = "UPDATE_APPEARANCE_LOADING_TEXT";
    public static final String DATA_UPDATE_APPEARANCE_LOADING_TEXT_COLOR = "UPDATE_APPEARANCE_LOADING_TEXT_COLOR";
    public static final String MSG_UPDATE_APPEARANCE = "UPDATE_APPEARANCE";

    /* renamed from: a  reason: collision with root package name */
    private Context f10621a;
    private Paint b;
    private Timer c;
    private TimerTask d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    /* access modifiers changed from: private */
    public int l;
    protected TextView mBackButton;
    protected TextView mBottomTip;
    protected ImageView mLoadingIcon;
    protected TextView mLoadingTitle;

    /* access modifiers changed from: protected */
    public float getTitleLeftMargin() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public boolean isBackButtonVisible() {
        return true;
    }

    static /* synthetic */ int access$008(SplashLoadingView splashLoadingView) {
        int i2 = splashLoadingView.l;
        splashLoadingView.l = i2 + 1;
        return i2;
    }

    public SplashLoadingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SplashLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SplashLoadingView(final Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = 0;
        this.f10621a = context;
        initView();
        this.mBackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SplashLoadingView.this.cancel();
                Context context = context;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        });
    }

    @TargetApi(21)
    public static void setStatusBarColor(Activity activity, int i2) {
        if (StatusBarUtils.isSupport() && activity != null) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(i2);
        }
    }

    public void initView() {
        ImageView imageView = new ImageView(this.f10621a);
        this.mLoadingIcon = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.mLoadingIcon.setImageResource(R.drawable.griver_ui_default_loading_icon);
        TextView textView = new TextView(this.f10621a);
        this.mLoadingTitle = textView;
        textView.setGravity(17);
        this.mLoadingTitle.setTextColor(this.f10621a.getResources().getColor(R.color.griver_web_loading_text));
        this.mLoadingTitle.setTextSize(1, 18.0f);
        this.mLoadingTitle.setEllipsize(TextUtils.TruncateAt.END);
        this.mLoadingTitle.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(this.mLoadingIcon);
        addView(this.mLoadingTitle);
        TextView textView2 = new TextView(this.f10621a);
        this.mBackButton = textView2;
        Context context = this.f10621a;
        StringBuilder sb = new StringBuilder("h5iconfont");
        sb.append(File.separator);
        sb.append("titlebar.ttf");
        textView2.setTypeface(TypefaceCache.getTypeface(context, "h5iconfont", sb.toString()));
        this.mBackButton.setText("");
        this.mBackButton.setTextSize(1, 22.0f);
        this.mBackButton.setTextColor(-15692055);
        this.mBackButton.setGravity(17);
        addView(this.mBackButton);
        TextView textView3 = new TextView(this.f10621a);
        this.mBottomTip = textView3;
        textView3.setTextColor(this.f10621a.getResources().getColor(R.color.griver_web_loading_bottom_tip_text));
        this.mBottomTip.setTextSize(12.0f);
        this.mBottomTip.setGravity(17);
        this.mBottomTip.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(this.mBottomTip);
        this.f = this.f10621a.getResources().getColor(R.color.griver_web_loading_dot_dark_new);
        this.g = this.f10621a.getResources().getColor(R.color.griver_web_loading_dot_light_new);
        this.k = a(R.dimen.griver_loading_dot_size);
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.j = a(R.dimen.griver_loading_dot_margin);
        setBackgroundColor(this.f10621a.getResources().getColor(R.color.griver_web_loading_default_bg));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int a2 = a(R.dimen.griver_loading_icon_size);
        this.mLoadingIcon.measure(b(a2), b(a2));
        int a3 = a(R.dimen.griver_loading_title_height);
        this.mLoadingTitle.measure(View.MeasureSpec.makeMeasureSpec(a(R.dimen.griver_loading_title_width), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(a3, Integer.MIN_VALUE));
        this.mBottomTip.measure(b(a(R.dimen.griver_loading_bottom_tip_width)), View.MeasureSpec.makeMeasureSpec(a(R.dimen.griver_loading_bottom_tip_height), Integer.MIN_VALUE));
        this.mBackButton.measure(b(a(R.dimen.griver_loading_back_button_width)), b(a(R.dimen.griver_loading_titlebar_height)));
        setMeasuredDimension(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        TextView textView = this.mBackButton;
        textView.layout(0, 0, textView.getMeasuredWidth(), this.mBackButton.getMeasuredHeight() + 0);
        int measuredWidth = (getMeasuredWidth() - this.mLoadingIcon.getMeasuredWidth()) / 2;
        int a2 = a(R.dimen.griver_loading_titlebar_height) + a(R.dimen.griver_loading_icon_margin_top);
        ImageView imageView = this.mLoadingIcon;
        imageView.layout(measuredWidth, a2, imageView.getMeasuredWidth() + measuredWidth, this.mLoadingIcon.getMeasuredHeight() + a2);
        int measuredWidth2 = (getMeasuredWidth() - this.mLoadingTitle.getMeasuredWidth()) / 2;
        int measuredHeight = a2 + this.mLoadingIcon.getMeasuredHeight() + a(R.dimen.griver_loading_title_margin_top);
        TextView textView2 = this.mLoadingTitle;
        textView2.layout(measuredWidth2, measuredHeight, textView2.getMeasuredWidth() + measuredWidth2, this.mLoadingTitle.getMeasuredHeight() + measuredHeight);
        this.h = ((getMeasuredWidth() / 2) - this.k) - this.j;
        this.i = measuredHeight + this.mLoadingTitle.getMeasuredHeight() + a(R.dimen.griver_loading_dot_margin_top);
        int measuredWidth3 = (getMeasuredWidth() - this.mBottomTip.getMeasuredWidth()) / 2;
        int measuredHeight2 = (getMeasuredHeight() - a(R.dimen.griver_loading_bottom_tip_margin_bottom)) - this.mBottomTip.getMeasuredHeight();
        TextView textView3 = this.mBottomTip;
        textView3.layout(measuredWidth3, measuredHeight2, textView3.getMeasuredWidth() + measuredWidth3, this.mBottomTip.getMeasuredHeight() + measuredHeight2);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            this.b.setColor(this.f);
            this.h = ((getMeasuredWidth() / 2) - this.k) - this.j;
            int i2 = 0;
            while (i2 < 3) {
                this.b.setColor(this.l == i2 ? this.g : this.f);
                canvas.drawCircle((float) this.h, (float) this.i, (float) (this.k / 2), this.b);
                this.h = this.h + this.j + this.k;
                i2++;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void startLoadingAnimation() {
        if (!this.e) {
            this.e = true;
            if (this.d == null) {
                this.d = new TimerTask() {
                    public void run() {
                        SplashLoadingView.access$008(SplashLoadingView.this);
                        if (SplashLoadingView.this.l > 2) {
                            int unused = SplashLoadingView.this.l = 0;
                        }
                        ExecutorUtils.runOnMain(new Runnable() {
                            public void run() {
                                SplashLoadingView.this.invalidate();
                            }
                        });
                    }
                };
            }
            if (this.c == null) {
                try {
                    Timer timer = new Timer();
                    this.c = timer;
                    timer.schedule(this.d, 0, 200);
                } catch (Throwable th) {
                    RVLogger.e(LoadingView.TAG, "printMonitor error", th);
                }
            }
        }
    }

    public void stopLoadingAnimation() {
        this.e = false;
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
        }
        TimerTask timerTask = this.d;
        if (timerTask != null) {
            timerTask.cancel();
        }
        invalidate();
    }

    private int a(int i2) {
        return this.f10621a.getResources().getDimensionPixelSize(i2);
    }

    private int b(int i2) {
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public void onStart() {
        a();
        startLoadingAnimation();
    }

    public void onStop() {
        stopLoadingAnimation();
    }

    public void onHandleMessage(String str, Map<String, Object> map) {
        if (MSG_UPDATE_APPEARANCE.equals(str)) {
            String str2 = (String) map.get(DATA_UPDATE_APPEARANCE_BG_COLOR);
            if (!TextUtils.isEmpty(str2)) {
                setBackgroundColor(Color.parseColor(str2));
            }
            Drawable drawable = (Drawable) map.get(DATA_UPDATE_APPEARANCE_LOADING_ICON);
            if (drawable != null) {
                this.mLoadingIcon.setImageDrawable(drawable);
            }
            String str3 = (String) map.get(DATA_UPDATE_APPEARANCE_LOADING_TEXT);
            if (str3 != null) {
                this.mLoadingTitle.setText(str3);
            }
            String str4 = (String) map.get(DATA_UPDATE_APPEARANCE_LOADING_TEXT_COLOR);
            if (!TextUtils.isEmpty(str4)) {
                this.mLoadingTitle.setTextColor(Color.parseColor(str4));
            }
            String str5 = (String) map.get(DATA_UPDATE_APPEARANCE_LOADING_BOTTOM_TIP);
            if (str5 != null) {
                this.mBottomTip.setText(str5);
            }
        }
    }

    public void performAnimation(final String str, final Animator.AnimatorListener animatorListener) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(str, animatorListener);
        } else {
            post(new Runnable() {
                public void run() {
                    SplashLoadingView.this.a(str, animatorListener);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, Animator.AnimatorListener animatorListener) {
        float f2;
        if (getParent() == null) {
            RVLogger.e(LoadingView.TAG, "loading view has not added to parent container");
        } else if (ANIMATION_STOP_LOADING_PREPARE.equals(str)) {
            this.e = false;
            int a2 = a(R.dimen.griver_loading_titlebar_height) / 4;
            if (isBackButtonVisible()) {
                f2 = this.mBackButton.getX() + ((float) this.mBackButton.getMeasuredWidth());
            } else {
                f2 = getTitleLeftMargin();
            }
            float a3 = (float) ((a(R.dimen.griver_loading_titlebar_height) - this.mLoadingTitle.getMeasuredHeight()) / 2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(400);
            if (animatorListener != null) {
                animatorSet.addListener(animatorListener);
            }
            ImageView imageView = this.mLoadingIcon;
            AnimatorSet.Builder play = animatorSet.play(ObjectAnimator.ofFloat(imageView, "y", new float[]{imageView.getY(), (float) a2}));
            ImageView imageView2 = this.mLoadingIcon;
            AnimatorSet.Builder with = play.with(ObjectAnimator.ofFloat(imageView2, "scaleX", new float[]{imageView2.getScaleX(), 0.0f}));
            ImageView imageView3 = this.mLoadingIcon;
            AnimatorSet.Builder with2 = with.with(ObjectAnimator.ofFloat(imageView3, "scaleY", new float[]{imageView3.getScaleY(), 0.0f}));
            TextView textView = this.mLoadingTitle;
            AnimatorSet.Builder with3 = with2.with(ObjectAnimator.ofFloat(textView, "x", new float[]{textView.getX(), f2}));
            TextView textView2 = this.mLoadingTitle;
            with3.with(ObjectAnimator.ofFloat(textView2, "y", new float[]{textView2.getY(), a3}));
            animatorSet.start();
        } else {
            super.performAnimation(str, animatorListener);
        }
    }

    private void a() {
        if (this.hostActivity != null && this.hostActivity.getClass().getName().equals("com.alipay.mobile.core.loading.impl.LoadingPage")) {
            setStatusBarColor(this.hostActivity, 855638016);
        }
    }
}
