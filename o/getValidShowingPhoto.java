package o;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import id.dana.showcase.ActionType;
import id.dana.showcase.view.PointerView;
import id.dana.showcase.view.ShowcaseView;
import id.dana.showcase.view.SkipShowCaseView;
import java.lang.ref.WeakReference;
import o.PhotoView;

abstract class getValidShowingPhoto implements PhotoView.PhotoInter {
    WeakReference<ShowcaseView> getMax;
    WeakReference<PointerView> getMin;
    private boolean isInside;
    protected final onLongPress length;
    WeakReference<Activity> setMax;
    private PhotoView.FlingRunnable setMin;
    private boolean toFloatRange;
    private View toIntRange;

    static /* synthetic */ void toFloatRange() {
    }

    static /* synthetic */ void toIntRange() {
    }

    /* access modifiers changed from: protected */
    public abstract View getMin();

    /* access modifiers changed from: protected */
    public abstract setUseAmcsLite length();

    /* access modifiers changed from: protected */
    public abstract void setMin();

    getValidShowingPhoto(onLongPress onlongpress, Activity activity, PhotoView.FlingRunnable flingRunnable) {
        this.length = onlongpress;
        this.setMax = new WeakReference<>(activity);
        this.setMin = flingRunnable;
        this.toFloatRange = true;
        this.isInside = false;
    }

    getValidShowingPhoto(onLongPress onlongpress, Activity activity, PhotoView.FlingRunnable flingRunnable, byte b) {
        this.length = onlongpress;
        this.setMax = new WeakReference<>(activity);
        this.setMin = flingRunnable;
        this.toFloatRange = false;
        this.isInside = false;
    }

    getValidShowingPhoto(onLongPress onlongpress, Activity activity, PhotoView.FlingRunnable flingRunnable, boolean z, boolean z2) {
        this.length = onlongpress;
        this.setMax = new WeakReference<>(activity);
        this.setMin = flingRunnable;
        this.toFloatRange = z;
        this.isInside = z2;
    }

    public PhotoView.PhotoInter getMax() {
        if (IsOverlapping()) {
            return this;
        }
        View decorView = this.setMax.get().getWindow().getDecorView();
        ShowcaseView showcaseView = new ShowcaseView((Context) this.setMax.get(), this.length.setMax, (PhotoView.DragListener) new PhotoView.DragDetector(this));
        showcaseView.setPadding(this.length.setMin, 0, this.length.getMin, 0);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(3);
        showcaseView.setLayoutTransition(layoutTransition);
        this.getMax = new WeakReference<>(showcaseView);
        PointerView pointerView = new PointerView(this.setMax.get(), length());
        pointerView.setContainerPadding(this.length.toIntRange);
        pointerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        pointerView.setClickable(true);
        this.getMin = new WeakReference<>(pointerView);
        pointerView.addContentView(getMin());
        if (this.isInside) {
            SkipShowCaseView skipShowCaseView = new SkipShowCaseView(this.setMax.get());
            skipShowCaseView.setOnSkipButtonClickListener(new isShowingThumbnail(this));
            showcaseView.addView(skipShowCaseView);
        }
        ((ViewGroup) decorView).addView(showcaseView);
        if (this.toFloatRange) {
            showcaseView.addView(pointerView);
        }
        if (this.getMax.get() != null) {
            this.getMax.get().startShowcase(this.length.length, this.length.getMax, new setOnLongClickListener() {
                public final void onAnimationStart(Animator animator) {
                    getValidShowingPhoto.setMax(getValidShowingPhoto.this);
                }

                public final void onAnimationEnd(Animator animator) {
                    getValidShowingPhoto.this.setMin();
                }
            });
        }
        return this;
    }

    public void setMax() {
        setMin(2);
    }

    /* access modifiers changed from: package-private */
    public final void getMin(int i) {
        PhotoView.FlingRunnable flingRunnable = this.setMin;
        if (flingRunnable != null) {
            flingRunnable.onTargetSelected(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean IsOverlapping() {
        return this.setMax.get() == null;
    }

    public void setMin(@ActionType final int i) {
        if (this.getMax.get() != null) {
            this.getMax.get().finishShowcase(this.length.length, this.length.getMax, new setOnLongClickListener() {
                public final void onAnimationEnd(Animator animator) {
                    Activity activity = getValidShowingPhoto.this.setMax.get();
                    if (activity != null) {
                        ((ViewGroup) activity.getWindow().getDecorView()).removeView(getValidShowingPhoto.this.getMax.get());
                        getValidShowingPhoto.getMin(getValidShowingPhoto.this, i);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void length(final setUseAmcsLite setuseamcslite) {
        ShowcaseView showcaseView = this.getMax.get();
        if (setuseamcslite.equals != null) {
            if (this.toIntRange != null) {
                this.getMax.get().removeView(this.toIntRange);
            }
            View view = setuseamcslite.equals;
            this.toIntRange = view;
            showcaseView.addView(view);
        }
        if (this.getMin.get() != null) {
            this.getMin.get().showPointer(setuseamcslite, new setOnLongClickListener() {
                public final void onAnimationEnd(Animator animator) {
                    getValidShowingPhoto.this.getMax.get().startSpotlight(setuseamcslite, new setOnLongClickListener(setuseamcslite) {
                        public final void onAnimationStart(Animator animator) {
                            getValidShowingPhoto.toIntRange();
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void setMax(getValidShowingPhoto getvalidshowingphoto) {
        PhotoView.FlingRunnable flingRunnable = getvalidshowingphoto.setMin;
        if (flingRunnable != null) {
            flingRunnable.onStarted();
        }
    }

    static /* synthetic */ void getMin(getValidShowingPhoto getvalidshowingphoto, int i) {
        PhotoView.FlingRunnable flingRunnable = getvalidshowingphoto.setMin;
        if (flingRunnable != null) {
            flingRunnable.onFinished(i);
        }
    }

    static /* synthetic */ void length(getValidShowingPhoto getvalidshowingphoto) {
        if (getvalidshowingphoto.length.getMin()) {
            getvalidshowingphoto.setMin(3);
        }
    }
}
