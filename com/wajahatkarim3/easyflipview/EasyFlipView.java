package com.wajahatkarim3.easyflipview;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.getDecoratedMeasuredHeight;

public class EasyFlipView extends FrameLayout {
    public static final int DEFAULT_FLIP_DURATION = 400;
    public static final String TAG = EasyFlipView.class.getSimpleName();
    private int animFlipHorizontalInId = getDecoratedMeasuredHeight.getMax.animation_horizontal_flip_in;
    private int animFlipHorizontalOutId = getDecoratedMeasuredHeight.getMax.animation_horizontal_flip_out;
    private int animFlipVerticalInId = getDecoratedMeasuredHeight.getMax.animation_vertical_flip_in;
    private int animFlipVerticalOutId = getDecoratedMeasuredHeight.getMax.animation_vertical_flip_out;
    private Context context;
    private int flipDuration;
    private boolean flipEnabled;
    private boolean flipOnTouch;
    private int flipType = getMin.VERTICAL;
    /* access modifiers changed from: private */
    public View mCardBackLayout;
    /* access modifiers changed from: private */
    public View mCardFrontLayout;
    /* access modifiers changed from: private */
    public FlipState mFlipState = FlipState.FRONT_SIDE;
    private boolean mIsBackVisible = false;
    private AnimatorSet mSetBottomIn;
    private AnimatorSet mSetLeftIn;
    private AnimatorSet mSetRightOut;
    private AnimatorSet mSetTopOut;
    /* access modifiers changed from: private */
    public length onFlipListener = null;
    private float x1;
    private float y1;

    public enum FlipState {
        FRONT_SIDE,
        BACK_SIDE
    }

    public static class getMin {
        public static int HORIZONTAL = 0;
        public static int VERTICAL = 1;
    }

    public interface length {
        void onViewFlipCompleted(EasyFlipView easyFlipView, FlipState flipState);
    }

    public EasyFlipView(Context context2) {
        super(context2);
        this.context = context2;
        init(context2, (AttributeSet) null);
    }

    public EasyFlipView(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        init(context2, attributeSet);
    }

    private void init(Context context2, AttributeSet attributeSet) {
        this.flipOnTouch = true;
        this.flipDuration = 400;
        this.flipEnabled = true;
        this.flipType = getMin.VERTICAL;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, getDecoratedMeasuredHeight.setMin.easy_flip_view, 0, 0);
            try {
                this.flipOnTouch = obtainStyledAttributes.getBoolean(getDecoratedMeasuredHeight.setMin.easy_flip_view_flipOnTouch, true);
                this.flipDuration = obtainStyledAttributes.getInt(getDecoratedMeasuredHeight.setMin.easy_flip_view_flipDuration, 400);
                this.flipEnabled = obtainStyledAttributes.getBoolean(getDecoratedMeasuredHeight.setMin.easy_flip_view_flipEnabled, true);
                this.flipType = obtainStyledAttributes.getInt(getDecoratedMeasuredHeight.setMin.easy_flip_view_flipType, getMin.HORIZONTAL);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        loadAnimations();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() <= 2) {
            findViews();
            changeCameraDistance();
            return;
        }
        throw new IllegalStateException("EasyFlipView can host only two direct children!");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 2) {
            super.addView(view, i, layoutParams);
            findViews();
            changeCameraDistance();
            return;
        }
        throw new IllegalStateException("EasyFlipView can host only two direct children!");
    }

    public void removeView(View view) {
        super.removeView(view);
        findViews();
    }

    public void removeAllViewsInLayout() {
        super.removeAllViewsInLayout();
        this.mFlipState = FlipState.FRONT_SIDE;
        findViews();
    }

    private void findViews() {
        this.mCardBackLayout = null;
        this.mCardFrontLayout = null;
        int childCount = getChildCount();
        if (childCount > 0) {
            if (childCount < 2) {
                this.mFlipState = FlipState.FRONT_SIDE;
                this.mCardFrontLayout = getChildAt(0);
            } else if (childCount == 2) {
                this.mCardFrontLayout = getChildAt(1);
                this.mCardBackLayout = getChildAt(0);
            }
            if (!isFlipOnTouch()) {
                this.mCardFrontLayout.setVisibility(0);
                View view = this.mCardBackLayout;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    private void loadAnimations() {
        if (this.flipType == getMin.HORIZONTAL) {
            this.mSetRightOut = (AnimatorSet) AnimatorInflater.loadAnimator(this.context, this.animFlipHorizontalOutId);
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this.context, this.animFlipHorizontalInId);
            this.mSetLeftIn = animatorSet;
            AnimatorSet animatorSet2 = this.mSetRightOut;
            if (animatorSet2 == null || animatorSet == null) {
                throw new RuntimeException("No Animations Found! Please set Flip in and Flip out animation Ids.");
            }
            animatorSet2.removeAllListeners();
            this.mSetRightOut.addListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (EasyFlipView.this.mFlipState == FlipState.FRONT_SIDE) {
                        EasyFlipView.this.mCardBackLayout.setVisibility(8);
                        EasyFlipView.this.mCardFrontLayout.setVisibility(0);
                        if (EasyFlipView.this.onFlipListener != null) {
                            EasyFlipView.this.onFlipListener.onViewFlipCompleted(EasyFlipView.this, FlipState.FRONT_SIDE);
                            return;
                        }
                        return;
                    }
                    EasyFlipView.this.mCardBackLayout.setVisibility(0);
                    EasyFlipView.this.mCardFrontLayout.setVisibility(8);
                    if (EasyFlipView.this.onFlipListener != null) {
                        EasyFlipView.this.onFlipListener.onViewFlipCompleted(EasyFlipView.this, FlipState.BACK_SIDE);
                    }
                }
            });
            setFlipDuration(this.flipDuration);
            return;
        }
        this.mSetTopOut = (AnimatorSet) AnimatorInflater.loadAnimator(this.context, this.animFlipVerticalOutId);
        AnimatorSet animatorSet3 = (AnimatorSet) AnimatorInflater.loadAnimator(this.context, this.animFlipVerticalInId);
        this.mSetBottomIn = animatorSet3;
        AnimatorSet animatorSet4 = this.mSetTopOut;
        if (animatorSet4 == null || animatorSet3 == null) {
            throw new RuntimeException("No Animations Found! Please set Flip in and Flip out animation Ids.");
        }
        animatorSet4.removeAllListeners();
        this.mSetTopOut.addListener(new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (EasyFlipView.this.mFlipState == FlipState.FRONT_SIDE) {
                    EasyFlipView.this.mCardBackLayout.setVisibility(8);
                    EasyFlipView.this.mCardFrontLayout.setVisibility(0);
                    if (EasyFlipView.this.onFlipListener != null) {
                        EasyFlipView.this.onFlipListener.onViewFlipCompleted(EasyFlipView.this, FlipState.FRONT_SIDE);
                        return;
                    }
                    return;
                }
                EasyFlipView.this.mCardBackLayout.setVisibility(0);
                EasyFlipView.this.mCardFrontLayout.setVisibility(8);
                if (EasyFlipView.this.onFlipListener != null) {
                    EasyFlipView.this.onFlipListener.onViewFlipCompleted(EasyFlipView.this, FlipState.BACK_SIDE);
                }
            }
        });
        setFlipDuration(this.flipDuration);
    }

    private void changeCameraDistance() {
        float f = getResources().getDisplayMetrics().density * 8000.0f;
        View view = this.mCardFrontLayout;
        if (view != null) {
            view.setCameraDistance(f);
        }
        View view2 = this.mCardBackLayout;
        if (view2 != null) {
            view2.setCameraDistance(f);
        }
    }

    public void flipTheView() {
        if (this.flipEnabled && getChildCount() >= 2) {
            if (this.flipType == getMin.HORIZONTAL) {
                if (!this.mSetRightOut.isRunning() && !this.mSetLeftIn.isRunning()) {
                    this.mCardBackLayout.setVisibility(0);
                    this.mCardFrontLayout.setVisibility(0);
                    if (this.mFlipState == FlipState.FRONT_SIDE) {
                        this.mSetRightOut.setTarget(this.mCardFrontLayout);
                        this.mSetLeftIn.setTarget(this.mCardBackLayout);
                        this.mSetRightOut.start();
                        this.mSetLeftIn.start();
                        this.mIsBackVisible = true;
                        this.mFlipState = FlipState.BACK_SIDE;
                        return;
                    }
                    this.mSetRightOut.setTarget(this.mCardBackLayout);
                    this.mSetLeftIn.setTarget(this.mCardFrontLayout);
                    this.mSetRightOut.start();
                    this.mSetLeftIn.start();
                    this.mIsBackVisible = false;
                    this.mFlipState = FlipState.FRONT_SIDE;
                }
            } else if (!this.mSetTopOut.isRunning() && !this.mSetBottomIn.isRunning()) {
                this.mCardBackLayout.setVisibility(0);
                this.mCardFrontLayout.setVisibility(0);
                if (this.mFlipState == FlipState.FRONT_SIDE) {
                    this.mSetTopOut.setTarget(this.mCardFrontLayout);
                    this.mSetBottomIn.setTarget(this.mCardBackLayout);
                    this.mSetTopOut.start();
                    this.mSetBottomIn.start();
                    this.mIsBackVisible = true;
                    this.mFlipState = FlipState.BACK_SIDE;
                    return;
                }
                this.mSetTopOut.setTarget(this.mCardBackLayout);
                this.mSetBottomIn.setTarget(this.mCardFrontLayout);
                this.mSetTopOut.start();
                this.mSetBottomIn.start();
                this.mIsBackVisible = false;
                this.mFlipState = FlipState.FRONT_SIDE;
            }
        }
    }

    public void flipTheView(boolean z) {
        if (getChildCount() >= 2) {
            if (this.flipType == getMin.HORIZONTAL) {
                if (!z) {
                    this.mSetLeftIn.setDuration(0);
                    this.mSetRightOut.setDuration(0);
                    boolean z2 = this.flipEnabled;
                    this.flipEnabled = true;
                    flipTheView();
                    this.mSetLeftIn.setDuration((long) this.flipDuration);
                    this.mSetRightOut.setDuration((long) this.flipDuration);
                    this.flipEnabled = z2;
                    return;
                }
                flipTheView();
            } else if (!z) {
                this.mSetBottomIn.setDuration(0);
                this.mSetTopOut.setDuration(0);
                boolean z3 = this.flipEnabled;
                this.flipEnabled = true;
                flipTheView();
                this.mSetBottomIn.setDuration((long) this.flipDuration);
                this.mSetTopOut.setDuration((long) this.flipDuration);
                this.flipEnabled = z3;
            } else {
                flipTheView();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.flipOnTouch) {
            return super.onTouchEvent(motionEvent);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.x1 = motionEvent.getX();
            this.y1 = motionEvent.getY();
            return true;
        } else if (action != 1) {
            return super.onTouchEvent(motionEvent);
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = x - this.x1;
            float f2 = y - this.y1;
            if (f >= 0.0f && f < 0.5f && f2 >= 0.0f && f2 < 0.5f) {
                flipTheView();
            }
            return true;
        }
    }

    public boolean isFlipOnTouch() {
        return this.flipOnTouch;
    }

    public void setFlipOnTouch(boolean z) {
        this.flipOnTouch = z;
    }

    public int getFlipDuration() {
        return this.flipDuration;
    }

    public void setFlipDuration(int i) {
        this.flipDuration = i;
        if (this.flipType == getMin.HORIZONTAL) {
            long j = (long) i;
            this.mSetRightOut.getChildAnimations().get(0).setDuration(j);
            long j2 = (long) (i / 2);
            this.mSetRightOut.getChildAnimations().get(1).setStartDelay(j2);
            this.mSetLeftIn.getChildAnimations().get(1).setDuration(j);
            this.mSetLeftIn.getChildAnimations().get(2).setStartDelay(j2);
            return;
        }
        long j3 = (long) i;
        this.mSetTopOut.getChildAnimations().get(0).setDuration(j3);
        long j4 = (long) (i / 2);
        this.mSetTopOut.getChildAnimations().get(1).setStartDelay(j4);
        this.mSetBottomIn.getChildAnimations().get(1).setDuration(j3);
        this.mSetBottomIn.getChildAnimations().get(2).setStartDelay(j4);
    }

    public boolean isFlipEnabled() {
        return this.flipEnabled;
    }

    public void setFlipEnabled(boolean z) {
        this.flipEnabled = z;
    }

    public FlipState getCurrentFlipState() {
        return this.mFlipState;
    }

    public boolean isFrontSide() {
        return this.mFlipState == FlipState.FRONT_SIDE;
    }

    public boolean isBackSide() {
        return this.mFlipState == FlipState.BACK_SIDE;
    }

    public length getOnFlipListener() {
        return this.onFlipListener;
    }

    public void setOnFlipListener(length length2) {
        this.onFlipListener = length2;
    }

    public boolean isHorizontalType() {
        return this.flipType == getMin.HORIZONTAL;
    }

    public boolean isVerticalType() {
        return this.flipType == getMin.VERTICAL;
    }

    public void setToHorizontalType() {
        this.flipType = getMin.HORIZONTAL;
    }

    public void setToVerticalType() {
        this.flipType = getMin.VERTICAL;
    }
}
