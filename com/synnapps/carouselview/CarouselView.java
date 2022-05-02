package com.synnapps.carouselview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.viewpager.widget.ViewPager;
import java.util.Timer;
import java.util.TimerTask;
import o.dispatchOnCancelled;
import o.getAdapterPositionInRecyclerView;
import o.getChildDrawingOrder;
import o.initFastScroller;
import o.onCancelLoad;
import o.onCanceled;
import o.onCreateViewHolder;
import o.setExpandActivityOverflowButtonDrawable;

@RemoteViews.RemoteView
public class CarouselView extends FrameLayout {
    public static final int DEFAULT_INDICATOR_VISIBILITY = 0;
    private static final int DEFAULT_SLIDE_INTERVAL = 3500;
    private static final int DEFAULT_SLIDE_VELOCITY = 400;
    private final int DEFAULT_GRAVITY = 81;
    /* access modifiers changed from: private */
    public boolean animateOnBoundary = true;
    private boolean autoPlay;
    ViewPager.setMax carouselOnPageChangeListener = new ViewPager.setMax() {
        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }

        public void onPageScrollStateChanged(int i) {
            if (CarouselView.this.previousState != 1 || i != 2) {
                int unused = CarouselView.this.previousState;
            } else if (CarouselView.this.disableAutoPlayOnUserInteraction) {
                CarouselView.this.pauseCarousel();
            } else {
                CarouselView.this.playCarousel();
            }
            int unused2 = CarouselView.this.previousState = i;
        }
    };
    /* access modifiers changed from: private */
    public CarouselViewPager containerViewPager;
    /* access modifiers changed from: private */
    public boolean disableAutoPlayOnUserInteraction;
    private initFastScroller imageClickListener = null;
    private int indicatorMarginHorizontal;
    private int indicatorMarginVertical;
    private int indicatorVisibility = 0;
    /* access modifiers changed from: private */
    public getAdapterPositionInRecyclerView mImageListener = null;
    private CirclePageIndicator mIndicator;
    private int mIndicatorGravity = 81;
    private int mPageCount;
    /* access modifiers changed from: private */
    public getChildDrawingOrder mViewListener = null;
    private int pageTransformInterval = 400;
    private ViewPager.getMax pageTransformer;
    /* access modifiers changed from: private */
    public int previousState;
    private int slideInterval = 3500;
    private length swipeTask;
    private Timer swipeTimer;

    public CarouselView(Context context) {
        super(context);
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context, attributeSet, 0, 0);
    }

    public CarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public CarouselView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context, attributeSet, i, i2);
    }

    private void initView(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            View inflate = LayoutInflater.from(context).inflate(onCreateViewHolder.isInside.view_carousel, this, true);
            this.containerViewPager = (CarouselViewPager) inflate.findViewById(onCreateViewHolder.setMax.containerViewPager);
            this.mIndicator = (CirclePageIndicator) inflate.findViewById(onCreateViewHolder.setMax.indicator);
            this.containerViewPager.addOnPageChangeListener(this.carouselOnPageChangeListener);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onCreateViewHolder.toIntRange.CarouselView, i, 0);
            try {
                this.indicatorMarginVertical = obtainStyledAttributes.getDimensionPixelSize(onCreateViewHolder.toIntRange.CarouselView_indicatorMarginVertical, getResources().getDimensionPixelSize(onCreateViewHolder.setMin.default_indicator_margin_vertical));
                this.indicatorMarginHorizontal = obtainStyledAttributes.getDimensionPixelSize(onCreateViewHolder.toIntRange.CarouselView_indicatorMarginHorizontal, getResources().getDimensionPixelSize(onCreateViewHolder.setMin.default_indicator_margin_horizontal));
                setPageTransformInterval(obtainStyledAttributes.getInt(onCreateViewHolder.toIntRange.CarouselView_pageTransformInterval, 400));
                setSlideInterval(obtainStyledAttributes.getInt(onCreateViewHolder.toIntRange.CarouselView_slideInterval, 3500));
                setOrientation(obtainStyledAttributes.getInt(onCreateViewHolder.toIntRange.CarouselView_indicatorOrientation, 0));
                setIndicatorGravity(obtainStyledAttributes.getInt(onCreateViewHolder.toIntRange.CarouselView_indicatorGravity, 81));
                setAutoPlay(obtainStyledAttributes.getBoolean(onCreateViewHolder.toIntRange.CarouselView_autoPlay, true));
                setDisableAutoPlayOnUserInteraction(obtainStyledAttributes.getBoolean(onCreateViewHolder.toIntRange.CarouselView_disableAutoPlayOnUserInteraction, false));
                setAnimateOnBoundary(obtainStyledAttributes.getBoolean(onCreateViewHolder.toIntRange.CarouselView_animateOnBoundary, true));
                setPageTransformer(obtainStyledAttributes.getInt(onCreateViewHolder.toIntRange.CarouselView_pageTransformer, -1));
                int i3 = obtainStyledAttributes.getInt(onCreateViewHolder.toIntRange.CarouselView_indicatorVisibility, 0);
                this.indicatorVisibility = i3;
                setIndicatorVisibility(i3);
                if (this.indicatorVisibility == 0) {
                    int color = obtainStyledAttributes.getColor(onCreateViewHolder.toIntRange.CarouselView_fillColor, 0);
                    if (color != 0) {
                        setFillColor(color);
                    }
                    int color2 = obtainStyledAttributes.getColor(onCreateViewHolder.toIntRange.CarouselView_pageColor, 0);
                    if (color2 != 0) {
                        setPageColor(color2);
                    }
                    float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(onCreateViewHolder.toIntRange.CarouselView_radius, 0);
                    if (dimensionPixelSize != 0.0f) {
                        setRadius(dimensionPixelSize);
                    }
                    setSnap(obtainStyledAttributes.getBoolean(onCreateViewHolder.toIntRange.CarouselView_snap, getResources().getBoolean(onCreateViewHolder.getMin.default_circle_indicator_snap)));
                    int color3 = obtainStyledAttributes.getColor(onCreateViewHolder.toIntRange.CarouselView_strokeColor, 0);
                    if (color3 != 0) {
                        setStrokeColor(color3);
                    }
                    float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(onCreateViewHolder.toIntRange.CarouselView_strokeWidth, 0);
                    if (dimensionPixelSize2 != 0.0f) {
                        setStrokeWidth(dimensionPixelSize2);
                    }
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.swipeTimer.cancel();
    }

    public int getSlideInterval() {
        return this.slideInterval;
    }

    public void setSlideInterval(int i) {
        this.slideInterval = i;
        if (this.containerViewPager != null) {
            playCarousel();
        }
    }

    public void reSetSlideInterval(int i) {
        setSlideInterval(i);
        if (this.containerViewPager != null) {
            playCarousel();
        }
    }

    public void setPageTransformInterval(int i) {
        if (i > 0) {
            this.pageTransformInterval = i;
        } else {
            this.pageTransformInterval = 400;
        }
        this.containerViewPager.setTransitionVelocity(i);
    }

    public ViewPager.getMax getPageTransformer() {
        return this.pageTransformer;
    }

    public void setPageTransformer(ViewPager.getMax getmax) {
        this.pageTransformer = getmax;
        this.containerViewPager.setPageTransformer(true, getmax);
    }

    public void setPageTransformer(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(895338043, oncanceled);
            onCancelLoad.getMin(895338043, oncanceled);
        }
        setPageTransformer((ViewPager.getMax) new CarouselViewPagerTransformer(i));
    }

    public void setAnimateOnBoundary(boolean z) {
        this.animateOnBoundary = z;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    private void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public boolean isDisableAutoPlayOnUserInteraction() {
        return this.disableAutoPlayOnUserInteraction;
    }

    private void setDisableAutoPlayOnUserInteraction(boolean z) {
        this.disableAutoPlayOnUserInteraction = z;
    }

    private void setData() {
        this.containerViewPager.setAdapter(new setMax(getContext()));
        this.mIndicator.setViewPager(this.containerViewPager);
        this.mIndicator.requestLayout();
        this.mIndicator.invalidate();
        this.containerViewPager.setOffscreenPageLimit(getPageCount());
        playCarousel();
    }

    private void stopScrollTimer() {
        Timer timer = this.swipeTimer;
        if (timer != null) {
            timer.cancel();
        }
        length length2 = this.swipeTask;
        if (length2 != null) {
            length2.cancel();
        }
    }

    private void resetScrollTimer() {
        stopScrollTimer();
        this.swipeTask = new length();
        this.swipeTimer = new Timer();
    }

    public void playCarousel() {
        resetScrollTimer();
        if (this.autoPlay && this.slideInterval > 0 && this.containerViewPager.getAdapter() != null && this.containerViewPager.getAdapter().getCount() > 1) {
            Timer timer = this.swipeTimer;
            length length2 = this.swipeTask;
            int i = this.slideInterval;
            timer.schedule(length2, (long) i, (long) i);
        }
    }

    public void pauseCarousel() {
        resetScrollTimer();
    }

    public void stopCarousel() {
        this.autoPlay = false;
    }

    class setMax extends setExpandActivityOverflowButtonDrawable {
        private Context mContext;

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public setMax(Context context) {
            this.mContext = context;
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (CarouselView.this.mImageListener != null) {
                ImageView imageView = new ImageView(this.mContext);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                CarouselView.this.mImageListener.setImageForPosition(i, imageView);
                viewGroup.addView(imageView);
                return imageView;
            } else if (CarouselView.this.mViewListener != null) {
                View viewForPosition = CarouselView.this.mViewListener.setViewForPosition(i);
                if (viewForPosition != null) {
                    viewGroup.addView(viewForPosition);
                    return viewForPosition;
                }
                throw new RuntimeException("View can not be null for position ".concat(String.valueOf(i)));
            } else {
                StringBuilder sb = new StringBuilder("View must set ");
                sb.append(getAdapterPositionInRecyclerView.class.getSimpleName());
                sb.append(" or ");
                sb.append(getChildDrawingOrder.class.getSimpleName());
                sb.append(".");
                throw new RuntimeException(sb.toString());
            }
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public final int getCount() {
            return CarouselView.this.getPageCount();
        }
    }

    class length extends TimerTask {
        private length() {
        }

        public void run() {
            CarouselView.this.containerViewPager.post(new Runnable() {
                public final void run() {
                    boolean z = true;
                    int currentItem = (CarouselView.this.containerViewPager.getCurrentItem() + 1) % CarouselView.this.getPageCount();
                    CarouselViewPager access$500 = CarouselView.this.containerViewPager;
                    if (currentItem == 0 && !CarouselView.this.animateOnBoundary) {
                        z = false;
                    }
                    access$500.setCurrentItem(currentItem, z);
                }
            });
        }
    }

    public void setImageListener(getAdapterPositionInRecyclerView getadapterpositioninrecyclerview) {
        this.mImageListener = getadapterpositioninrecyclerview;
    }

    public void setViewListener(getChildDrawingOrder getchilddrawingorder) {
        this.mViewListener = getchilddrawingorder;
    }

    public void setImageClickListener(initFastScroller initfastscroller) {
        this.imageClickListener = initfastscroller;
        this.containerViewPager.setImageClickListener(initfastscroller);
    }

    public int getPageCount() {
        return this.mPageCount;
    }

    public void setPageCount(int i) {
        this.mPageCount = i;
        setData();
    }

    public void addOnPageChangeListener(ViewPager.setMax setmax) {
        this.containerViewPager.addOnPageChangeListener(setmax);
    }

    public void clearOnPageChangeListeners() {
        this.containerViewPager.clearOnPageChangeListeners();
    }

    public void setCurrentItem(int i) {
        this.containerViewPager.setCurrentItem(i);
    }

    public int getCurrentItem() {
        return this.containerViewPager.getCurrentItem();
    }

    public int getIndicatorMarginVertical() {
        return this.indicatorMarginVertical;
    }

    public void setIndicatorMarginVertical(int i) {
        this.indicatorMarginVertical = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = this.indicatorMarginVertical;
        layoutParams.bottomMargin = this.indicatorMarginVertical;
    }

    public int getIndicatorMarginHorizontal() {
        return this.indicatorMarginHorizontal;
    }

    public void setIndicatorMarginHorizontal(int i) {
        this.indicatorMarginHorizontal = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = this.indicatorMarginHorizontal;
        layoutParams.rightMargin = this.indicatorMarginHorizontal;
    }

    public int getIndicatorGravity() {
        return this.mIndicatorGravity;
    }

    public void setIndicatorGravity(int i) {
        this.mIndicatorGravity = i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = this.mIndicatorGravity;
        int i2 = this.indicatorMarginHorizontal;
        int i3 = this.indicatorMarginVertical;
        layoutParams.setMargins(i2, i3, i2, i3);
        this.mIndicator.setLayoutParams(layoutParams);
    }

    public void setIndicatorVisibility(int i) {
        this.mIndicator.setVisibility(i);
    }

    public int getOrientation() {
        return this.mIndicator.getOrientation();
    }

    public int getFillColor() {
        return this.mIndicator.getFillColor();
    }

    public int getStrokeColor() {
        return this.mIndicator.getStrokeColor();
    }

    public void setSnap(boolean z) {
        this.mIndicator.setSnap(z);
    }

    public void setRadius(float f) {
        this.mIndicator.setRadius(f);
    }

    public float getStrokeWidth() {
        return this.mIndicator.getStrokeWidth();
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    public Drawable getIndicatorBackground() {
        return this.mIndicator.getBackground();
    }

    public void setFillColor(int i) {
        this.mIndicator.setFillColor(i);
    }

    public int getPageColor() {
        return this.mIndicator.getPageColor();
    }

    public void setOrientation(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(903820323, oncanceled);
            onCancelLoad.getMin(903820323, oncanceled);
        }
        this.mIndicator.setOrientation(i);
    }

    public boolean isSnap() {
        return this.mIndicator.isSnap();
    }

    public void setStrokeColor(int i) {
        this.mIndicator.setStrokeColor(i);
    }

    public float getRadius() {
        return this.mIndicator.getRadius();
    }

    public void setPageColor(int i) {
        this.mIndicator.setPageColor(i);
    }

    public void setStrokeWidth(float f) {
        this.mIndicator.setStrokeWidth(f);
        int i = (int) f;
        this.mIndicator.setPadding(i, i, i, i);
    }
}
