package com.alibaba.griver.ui.refresh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.ReflectUtils;
import com.alibaba.griver.ui.refresh.LoadMoreFooter;
import com.alibaba.griver.ui.refresh.RefreshHeader;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setSingleChoiceItems;

@SuppressLint({"ClickableViewAccessibility"})
public class GriverSwipeRefreshLayout extends ViewGroup {
    private boolean A;
    private float B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private volatile List<WMLAScrollerInfo> K;
    private int L;
    /* access modifiers changed from: private */
    public OnReachDistanceRefreshListener M;
    /* access modifiers changed from: private */
    public Animator.AnimatorListener N;

    /* renamed from: a  reason: collision with root package name */
    private View f10615a;
    /* access modifiers changed from: private */
    public boolean b;
    /* access modifiers changed from: private */
    public RefreshHeader c;
    /* access modifiers changed from: private */
    public LoadMoreFooter d;
    private int e;
    private int f;
    /* access modifiers changed from: private */
    public OnPullRefreshListener g;
    /* access modifiers changed from: private */
    public OnPushLoadMoreListener h;
    private boolean i;
    private boolean j;
    private boolean k;
    /* access modifiers changed from: private */
    public boolean l;
    private boolean m;
    protected int mCurrentTargetOffsetTop;
    protected float mDensity;
    protected DisplayMetrics mDisplayMetrics;
    protected int mFooterViewHeight;
    protected int mFooterViewWidth;
    protected int mFrom;
    protected int mHeaderViewHeight;
    protected int mHeaderViewWidth;
    protected int mOriginalOffsetTop;
    protected int mRefreshOffset;
    protected int mTouchSlop;
    /* access modifiers changed from: private */
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10616o;
    private int p;
    private boolean q;
    private float r;
    private int s;
    private int t;
    private float u;
    private boolean v;
    /* access modifiers changed from: private */
    public int w;
    private int x;
    private DecelerateInterpolator y;
    /* access modifiers changed from: private */
    public long z;

    public interface OnPullRefreshListener {
        void onPullDistance(int i);

        void onRefresh();

        void onRefreshStateChanged(RefreshHeader.RefreshState refreshState, RefreshHeader.RefreshState refreshState2);
    }

    public interface OnPushLoadMoreListener {
        void onLoadMore();

        void onLoadMoreStateChanged(LoadMoreFooter.LoadMoreState loadMoreState, LoadMoreFooter.LoadMoreState loadMoreState2);

        void onPushDistance(int i);
    }

    public interface OnReachDistanceRefreshListener {
        void onMotionEventUp();

        boolean onReachPullRefreshDistance();

        void onRefresh();
    }

    public GriverSwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public GriverSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = -1;
        this.f = -1;
        this.m = true;
        this.p = -1;
        this.r = 1.0f;
        this.s = -1;
        this.t = -1;
        this.v = true;
        this.w = 0;
        this.z = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
        this.A = false;
        this.F = 0;
        this.G = 0;
        this.H = -1;
        this.I = 0;
        this.J = -1;
        this.K = new ArrayList();
        this.L = 0;
        this.N = new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (GriverSwipeRefreshLayout.this.b) {
                    if (GriverSwipeRefreshLayout.this.l) {
                        if (GriverSwipeRefreshLayout.this.g != null) {
                            GriverSwipeRefreshLayout.this.g.onRefresh();
                        }
                        if (GriverSwipeRefreshLayout.this.M != null) {
                            GriverSwipeRefreshLayout.this.M.onRefresh();
                        }
                    }
                    GriverSwipeRefreshLayout.this.c.changeToState(RefreshHeader.RefreshState.REFRESHING);
                } else {
                    GriverSwipeRefreshLayout griverSwipeRefreshLayout = GriverSwipeRefreshLayout.this;
                    griverSwipeRefreshLayout.updateHeaderPosition(griverSwipeRefreshLayout.mOriginalOffsetTop - GriverSwipeRefreshLayout.this.mCurrentTargetOffsetTop);
                }
                GriverSwipeRefreshLayout griverSwipeRefreshLayout2 = GriverSwipeRefreshLayout.this;
                griverSwipeRefreshLayout2.mCurrentTargetOffsetTop = griverSwipeRefreshLayout2.c.getTop();
                GriverSwipeRefreshLayout.this.e();
            }
        };
        setWillNotDraw(false);
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mDisplayMetrics = displayMetrics;
        this.mDensity = displayMetrics.density;
        this.i = false;
        this.j = false;
        this.k = false;
        if (0 == 0 || 0 != 0) {
            this.mHeaderViewWidth = this.mDisplayMetrics.widthPixels;
            this.mHeaderViewHeight = (int) (this.mDensity * 48.0f);
            this.mFooterViewWidth = this.mDisplayMetrics.widthPixels;
            this.mFooterViewHeight = (int) (this.mDensity * 50.0f);
            this.y = new DecelerateInterpolator(2.0f);
            this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            a();
            b();
            ViewCompat.length((ViewGroup) this, true);
            this.mRefreshOffset = 0;
            float f2 = this.mDensity;
            int i2 = (int) (48.0f * f2);
            this.s = i2;
            this.t = (int) (((float) i2) + (20.0f * f2));
            this.x = (int) (f2 * 100.0f);
            this.J = this.mDisplayMetrics.heightPixels;
        }
    }

    public void setPullRefreshDistance(int i2) {
        int max = dispatchOnCancelled.setMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 1);
            onCancelLoad.setMax(-1260260342, oncanceled);
            onCancelLoad.getMin(-1260260342, oncanceled);
        }
        this.L = (int) (((float) i2) * this.mDensity);
    }

    public void setReachDistanceRefreshListener(OnReachDistanceRefreshListener onReachDistanceRefreshListener) {
        this.M = onReachDistanceRefreshListener;
    }

    private void a() {
        GriverRefreshHeader griverRefreshHeader = new GriverRefreshHeader(getContext());
        this.c = griverRefreshHeader;
        OnPullRefreshListener onPullRefreshListener = this.g;
        if (onPullRefreshListener != null) {
            griverRefreshHeader.setPullRefreshListener(onPullRefreshListener);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        addView(this.c, layoutParams);
    }

    private void b() {
        GriverLoadMoreFooter griverLoadMoreFooter = new GriverLoadMoreFooter(getContext());
        this.d = griverLoadMoreFooter;
        OnPushLoadMoreListener onPushLoadMoreListener = this.h;
        if (onPushLoadMoreListener != null) {
            griverLoadMoreFooter.setPushLoadMoreListener(onPushLoadMoreListener);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.mFooterViewHeight);
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        addView(this.d, layoutParams);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.e < 0 && this.f < 0) {
            return i3;
        }
        if (i3 == i2 - 2) {
            return this.e;
        }
        if (i3 == i2 - 1) {
            return this.f;
        }
        int i4 = this.f;
        int i5 = this.e;
        if (i4 <= i5) {
            i4 = i5;
        }
        int i6 = this.f;
        int i7 = this.e;
        if (i6 >= i7) {
            i6 = i7;
        }
        if (i3 < i6 || i3 >= i4 - 1) {
            return (i3 >= i4 || i3 == i4 + -1) ? i3 + 2 : i3;
        }
        return i3 + 1;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        super.onMeasure(i2, i3);
        if (this.f10615a == null) {
            c();
        }
        View view = this.f10615a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.c.measure(View.MeasureSpec.makeMeasureSpec(this.mHeaderViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mDisplayMetrics.heightPixels, 1073741824));
            this.d.measure(View.MeasureSpec.makeMeasureSpec(this.mFooterViewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.x, 1073741824));
            if ("huawei".equalsIgnoreCase(Build.BRAND) && this.J != -1 && this.mDisplayMetrics.heightPixels != (i4 = this.J) && this.mCurrentTargetOffsetTop == (-i4)) {
                int i5 = (-this.c.getMeasuredHeight()) + this.mRefreshOffset;
                this.mOriginalOffsetTop = i5;
                this.mCurrentTargetOffsetTop = i5;
                this.J = this.mDisplayMetrics.heightPixels;
            }
            if (!this.q) {
                this.q = true;
                int i6 = (-this.c.getMeasuredHeight()) + this.mRefreshOffset;
                this.mOriginalOffsetTop = i6;
                this.mCurrentTargetOffsetTop = i6;
                e();
            }
            this.e = -1;
            int i7 = 0;
            while (true) {
                if (i7 >= getChildCount()) {
                    break;
                } else if (getChildAt(i7) == this.c) {
                    this.e = i7;
                    break;
                } else {
                    i7++;
                }
            }
            this.f = -1;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                if (getChildAt(i8) == this.d) {
                    this.f = i8;
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f10615a == null) {
                c();
            }
            if (this.f10615a != null) {
                int measuredHeight2 = this.mCurrentTargetOffsetTop + this.c.getMeasuredHeight();
                if (!this.m) {
                    measuredHeight2 = 0;
                }
                View view = this.f10615a;
                int paddingLeft = getPaddingLeft();
                int paddingTop = (getPaddingTop() + measuredHeight2) - this.w;
                view.layout(paddingLeft, this.v ? paddingTop : paddingTop - this.mRefreshOffset, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, (paddingTop + ((measuredHeight - getPaddingTop()) - getPaddingBottom())) - this.mRefreshOffset);
                RefreshHeader refreshHeader = this.c;
                int i6 = this.mCurrentTargetOffsetTop;
                refreshHeader.layout(0, i6, this.mHeaderViewWidth, this.mDisplayMetrics.heightPixels + i6);
                if (!this.k && this.c.getSecondFloorView() != null) {
                    this.c.getSecondFloorView().setVisibility(8);
                }
                LoadMoreFooter loadMoreFooter = this.d;
                int i7 = this.w;
                loadMoreFooter.layout(0, measuredHeight - i7, this.mFooterViewWidth, (measuredHeight + this.x) - i7);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c();
        int max = setSingleChoiceItems.setMax(motionEvent);
        boolean isChildScrollToTop = this.i ? isChildScrollToTop(motionEvent) : false;
        if (!isChildScrollToTop && this.c.getCurrentState() != RefreshHeader.RefreshState.NONE) {
            isChildScrollToTop = true;
        }
        boolean isChildScrollToBottom = this.j ? isChildScrollToBottom(motionEvent) : false;
        if (!isChildScrollToBottom && this.d.getCurrentState() != LoadMoreFooter.LoadMoreState.NONE) {
            isChildScrollToBottom = true;
        }
        if (!isChildScrollToTop && !isChildScrollToBottom) {
            return false;
        }
        if (max != 0) {
            if (max != 1) {
                if (max == 2) {
                    int i2 = this.p;
                    if (i2 == -1) {
                        this.p = setSingleChoiceItems.getMin(motionEvent, setSingleChoiceItems.getMax(motionEvent));
                        this.B = motionEvent.getY();
                        this.H = this.p;
                        this.C = (int) motionEvent.getY();
                        float a2 = a(motionEvent, this.p);
                        if (a2 == -1.0f) {
                            return false;
                        }
                        this.u = a2;
                        return false;
                    }
                    float a3 = a(motionEvent, i2);
                    if (a3 == -1.0f) {
                        return false;
                    }
                    if (isChildScrollToBottom(motionEvent)) {
                        if (this.u - a3 > ((float) this.mTouchSlop) && !this.f10616o) {
                            this.f10616o = true;
                        }
                    } else if (isChildScrollToTop(motionEvent)) {
                        float f2 = a3 - this.u;
                        if (f2 > ((float) this.mTouchSlop) && !this.f10616o) {
                            this.f10616o = true;
                        } else if (f2 < 0.0f && this.c.getCurrentState() == RefreshHeader.RefreshState.REFRESHING) {
                            setRefreshing(false);
                        }
                    }
                } else if (max != 3) {
                    if (max == 6) {
                        a(motionEvent);
                    }
                }
            }
            if (this.f10616o) {
                onTouchEvent(motionEvent);
                this.f10616o = false;
            }
            this.p = -1;
        } else {
            this.C = (int) motionEvent.getY();
            int max2 = setSingleChoiceItems.getMax(motionEvent);
            if (this.p == -1) {
                this.p = setSingleChoiceItems.getMin(motionEvent, max2);
                this.B = motionEvent.getY();
                this.H = this.p;
            }
            this.f10616o = false;
            float a4 = a(motionEvent, this.p);
            if (a4 == -1.0f) {
                return false;
            }
            this.u = a4;
            this.c.getCurrentState();
            RefreshHeader.RefreshState refreshState = RefreshHeader.RefreshState.REFRESHING;
            if (this.d.getCurrentState() == LoadMoreFooter.LoadMoreState.LOADING) {
                setLoadMore(false);
            }
        }
        if (this.f10616o) {
            GriverLogger.d("SwipeRefreshLayout", "onInterceptTouchEvent: mIsBeingDragged");
            onTouchEvent(motionEvent);
        }
        return false;
    }

    private float a(MotionEvent motionEvent, int i2) {
        int min = setSingleChoiceItems.setMin(motionEvent, i2);
        if (min < 0) {
            return -1.0f;
        }
        return setSingleChoiceItems.setMax(motionEvent, min);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int max = setSingleChoiceItems.setMax(motionEvent);
        boolean isChildScrollToTop = this.i ? isChildScrollToTop(motionEvent) : false;
        boolean z2 = true;
        if (!isChildScrollToTop && this.c.getCurrentState() != RefreshHeader.RefreshState.NONE) {
            isChildScrollToTop = true;
        }
        if (this.c.getCurrentState() == RefreshHeader.RefreshState.SECOND_FLOOR_START || this.c.getCurrentState() == RefreshHeader.RefreshState.SECOND_FLOOR_END) {
            isChildScrollToTop = false;
        }
        boolean isChildScrollToBottom = this.j ? isChildScrollToBottom(motionEvent) : false;
        if (isChildScrollToBottom || this.d.getCurrentState() == LoadMoreFooter.LoadMoreState.NONE) {
            z2 = isChildScrollToBottom;
        }
        if (!isChildScrollToTop && !z2) {
            GriverLogger.d("SwipeRefreshLayout", "onTouchEvent: ".concat(String.valueOf(isChildScrollToTop)));
            return false;
        } else if (isChildScrollToTop) {
            return b(motionEvent, max);
        } else {
            if (z2) {
                return c(motionEvent, max);
            }
            return false;
        }
    }

    private boolean b(MotionEvent motionEvent, int i2) {
        int i3;
        OnReachDistanceRefreshListener onReachDistanceRefreshListener;
        if (i2 != 1) {
            if (i2 == 2) {
                if (this.p == -1) {
                    this.p = setSingleChoiceItems.getMin(motionEvent, setSingleChoiceItems.getMax(motionEvent));
                    this.B = motionEvent.getY();
                    this.H = this.p;
                }
                try {
                    int max = (int) setSingleChoiceItems.setMax(motionEvent, d(motionEvent, this.p));
                    if (this.A) {
                        int i4 = this.H;
                        int i5 = this.p;
                        if (i4 == i5) {
                            float f2 = (float) max;
                            float f3 = this.B;
                            i3 = (int) (((float) this.D) + (f2 - f3));
                            this.E = i3;
                            this.G = (int) (((float) this.F) + (f2 - f3));
                        } else {
                            int i6 = this.E;
                            this.H = i5;
                            this.D = i6;
                            this.F = this.G;
                            i3 = (int) (((float) i6) + (((float) max) - this.B));
                        }
                    } else {
                        i3 = max - this.C;
                        this.D = i3;
                        this.E = i3;
                        this.F = max;
                        this.G = max;
                    }
                    if (this.f10616o) {
                        int i7 = (int) (((float) i3) * this.r);
                        int measuredHeight = this.f10615a.getMeasuredHeight();
                        double abs = (double) (((float) measuredHeight) - Math.abs(this.f10615a.getY()));
                        Double.isNaN(abs);
                        double d2 = (double) measuredHeight;
                        Double.isNaN(d2);
                        double d3 = ((abs / 1.0d) / d2) * 0.4000000059604645d;
                        if (d3 <= 0.01d) {
                            d3 = 0.01d;
                        }
                        double d4 = (double) i7;
                        Double.isNaN(d4);
                        int min = Math.min(this.mDisplayMetrics.heightPixels, (int) (d4 * d3));
                        if (min >= this.L && (onReachDistanceRefreshListener = this.M) != null) {
                            onReachDistanceRefreshListener.onReachPullRefreshDistance();
                        }
                        float f4 = (((float) min) * 1.0f) / ((float) this.s);
                        if (f4 < 0.0f) {
                            return false;
                        }
                        float min2 = Math.min(1.0f, Math.abs(f4));
                        if (min < this.s) {
                            this.c.changeToState(RefreshHeader.RefreshState.PULL_TO_REFRESH);
                        } else if (!this.k) {
                            this.c.changeToState(RefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                        } else if (min > this.t) {
                            this.c.changeToState(RefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR);
                        } else {
                            this.c.changeToState(RefreshHeader.RefreshState.RELEASE_TO_REFRESH);
                        }
                        this.c.setProgress(min2);
                        updateHeaderPosition(min - (this.mCurrentTargetOffsetTop - this.mOriginalOffsetTop));
                    }
                } catch (IllegalArgumentException unused) {
                }
            } else if (i2 != 3) {
                if (i2 == 5) {
                    int max2 = setSingleChoiceItems.getMax(motionEvent);
                    if (max2 < 0) {
                        return false;
                    }
                    this.B = setSingleChoiceItems.setMax(motionEvent, max2);
                    this.p = setSingleChoiceItems.getMin(motionEvent, max2);
                    this.A = true;
                } else if (i2 == 6) {
                    a(motionEvent);
                }
            }
            return true;
        }
        OnReachDistanceRefreshListener onReachDistanceRefreshListener2 = this.M;
        if (onReachDistanceRefreshListener2 != null) {
            onReachDistanceRefreshListener2.onMotionEventUp();
        }
        if (this.p == -1) {
            return false;
        }
        this.f10616o = false;
        if (this.c.getCurrentState() == RefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR && this.k) {
            this.c.changeToState(RefreshHeader.RefreshState.SECOND_FLOOR_START);
            c(this.mCurrentTargetOffsetTop, (Animator.AnimatorListener) new Animator.AnimatorListener() {
                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                }

                public void onAnimationEnd(Animator animator) {
                    GriverSwipeRefreshLayout.this.c.changeToState(RefreshHeader.RefreshState.SECOND_FLOOR_END);
                }
            });
        } else if (this.c.getCurrentState() == RefreshHeader.RefreshState.RELEASE_TO_REFRESH) {
            a(true, true);
        } else {
            this.b = false;
            this.c.changeToState(RefreshHeader.RefreshState.NONE);
            b(this.mCurrentTargetOffsetTop, (Animator.AnimatorListener) null);
        }
        this.p = -1;
        this.A = false;
        this.D = 0;
        this.F = 0;
        return false;
    }

    private boolean c(MotionEvent motionEvent, int i2) {
        int min;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int min2 = setSingleChoiceItems.setMin(motionEvent, this.p);
                    if (min2 < 0) {
                        return false;
                    }
                    float max = (this.u - setSingleChoiceItems.setMax(motionEvent, min2)) * this.r;
                    if (this.f10616o) {
                        this.w = Math.min((int) max, this.x);
                        d();
                        if (this.h != null) {
                            if (this.w >= this.mFooterViewHeight) {
                                z2 = true;
                            }
                            if (z2) {
                                this.d.changeToState(LoadMoreFooter.LoadMoreState.RELEASE_TO_LOAD);
                            } else {
                                this.d.changeToState(LoadMoreFooter.LoadMoreState.PUSH_TO_LOAD);
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 5) {
                        this.p = setSingleChoiceItems.getMin(motionEvent, setSingleChoiceItems.getMax(motionEvent));
                    } else if (i2 == 6) {
                        a(motionEvent);
                    }
                }
            }
            int i3 = this.p;
            if (i3 == -1 || (min = setSingleChoiceItems.setMin(motionEvent, i3)) < 0) {
                return false;
            }
            float min3 = Math.min((this.u - setSingleChoiceItems.setMax(motionEvent, min)) * this.r, (float) this.x);
            this.f10616o = false;
            this.p = -1;
            int i4 = this.mFooterViewHeight;
            if (min3 < ((float) i4) || this.h == null) {
                this.w = 0;
            } else {
                this.w = i4;
            }
            a((int) min3, this.w);
            return false;
        }
        this.p = setSingleChoiceItems.getMin(motionEvent, 0);
        this.f10616o = false;
        return true;
    }

    private void c() {
        if (this.f10615a == null) {
            int i2 = 0;
            while (i2 < getChildCount()) {
                View childAt = getChildAt(i2);
                if (childAt.equals(this.c) || childAt.equals(this.d)) {
                    i2++;
                } else {
                    this.f10615a = childAt;
                    return;
                }
            }
        }
    }

    public boolean isChildScrollToTop(MotionEvent motionEvent) {
        return !a(this.f10615a, motionEvent);
    }

    private boolean a(View view, MotionEvent motionEvent) {
        if (view instanceof WebView) {
            return view.getScrollY() != 0;
        }
        if (ReflectUtils.classExist("com.uc.webview.export.WebView") && (view instanceof com.uc.webview.export.WebView)) {
            com.uc.webview.export.WebView webView = (com.uc.webview.export.WebView) view;
            return webView.isDestroied() || webView.getCoreView().getScrollY() != 0;
        } else if (!(view instanceof ViewGroup)) {
            return ViewCompat.setMax(view, -1);
        } else {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                z2 = z2 || a(viewGroup.getChildAt(i2), motionEvent);
                if (z2) {
                    break;
                }
                i2++;
            }
            return z2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isChildScrollToBottom(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r9 = r8.isChildScrollToTop(r9)
            r0 = 0
            if (r9 == 0) goto L_0x0008
            return r0
        L_0x0008:
            android.view.View r9 = r8.f10615a
            boolean r1 = r9 instanceof androidx.recyclerview.widget.RecyclerView
            r2 = 1
            if (r1 == 0) goto L_0x008d
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            androidx.recyclerview.widget.RecyclerView$IsOverlapping r1 = r9.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.getAdapter()
            int r9 = r9.getItemCount()
            boolean r3 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x002d
            if (r9 <= 0) goto L_0x002d
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r1 = r1.findLastCompletelyVisibleItemPosition()
            int r9 = r9 - r2
            if (r1 != r9) goto L_0x008c
            return r2
        L_0x002d:
            boolean r3 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r3 == 0) goto L_0x008c
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r3 = 2
            int[] r4 = new int[r3]
            int r5 = r1.setMax
            if (r3 < r5) goto L_0x0071
            r3 = 0
        L_0x003b:
            int r5 = r1.setMax
            if (r3 >= r5) goto L_0x0065
            androidx.recyclerview.widget.StaggeredGridLayoutManager$getMax[] r5 = r1.setMin
            r5 = r5[r3]
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            boolean r6 = r6.getMax
            if (r6 == 0) goto L_0x0054
            java.util.ArrayList<android.view.View> r6 = r5.length
            int r6 = r6.size()
            int r5 = r5.length(r0, r6)
            goto L_0x0060
        L_0x0054:
            java.util.ArrayList<android.view.View> r6 = r5.length
            int r6 = r6.size()
            int r6 = r6 - r2
            r7 = -1
            int r5 = r5.length(r6, r7)
        L_0x0060:
            r4[r3] = r5
            int r3 = r3 + 1
            goto L_0x003b
        L_0x0065:
            r1 = r4[r0]
            r3 = r4[r2]
            int r1 = java.lang.Math.max(r1, r3)
            int r9 = r9 - r2
            if (r1 != r9) goto L_0x008c
            return r2
        L_0x0071:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Provided int[]'s size must be more than or equal to span count. Expected:"
            r0.<init>(r2)
            int r1 = r1.setMax
            r0.append(r1)
            java.lang.String r1 = ", array size:2"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x008c:
            return r0
        L_0x008d:
            boolean r1 = r9 instanceof android.widget.AbsListView
            if (r1 == 0) goto L_0x00bf
            android.widget.AbsListView r9 = (android.widget.AbsListView) r9
            android.widget.Adapter r1 = r9.getAdapter()
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            int r1 = r1.getCount()
            int r3 = r9.getFirstVisiblePosition()
            if (r3 != 0) goto L_0x00b2
            android.view.View r3 = r9.getChildAt(r0)
            int r3 = r3.getTop()
            int r4 = r9.getPaddingTop()
            if (r3 < r4) goto L_0x00b2
            return r0
        L_0x00b2:
            int r9 = r9.getLastVisiblePosition()
            if (r9 <= 0) goto L_0x00be
            if (r1 <= 0) goto L_0x00be
            int r1 = r1 - r2
            if (r9 != r1) goto L_0x00be
            return r2
        L_0x00be:
            return r0
        L_0x00bf:
            boolean r1 = r9 instanceof android.widget.ScrollView
            if (r1 == 0) goto L_0x00e1
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            int r1 = r9.getChildCount()
            int r1 = r1 - r2
            android.view.View r1 = r9.getChildAt(r1)
            if (r1 == 0) goto L_0x0103
            int r1 = r1.getBottom()
            int r3 = r9.getHeight()
            int r9 = r9.getScrollY()
            int r3 = r3 + r9
            int r1 = r1 - r3
            if (r1 != 0) goto L_0x0103
            return r2
        L_0x00e1:
            boolean r1 = r9 instanceof androidx.core.widget.NestedScrollView
            if (r1 == 0) goto L_0x0103
            androidx.core.widget.NestedScrollView r9 = (androidx.core.widget.NestedScrollView) r9
            int r1 = r9.getChildCount()
            int r1 = r1 - r2
            android.view.View r1 = r9.getChildAt(r1)
            if (r1 == 0) goto L_0x0103
            int r1 = r1.getBottom()
            int r3 = r9.getHeight()
            int r9 = r9.getScrollY()
            int r3 = r3 + r9
            int r1 = r1 - r3
            if (r1 != 0) goto L_0x0103
            return r2
        L_0x0103:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.refresh.GriverSwipeRefreshLayout.isChildScrollToBottom(android.view.MotionEvent):boolean");
    }

    public void setRefreshingWithNotify(boolean z2, boolean z3) {
        if (!z2 || this.b == z2) {
            a(z2, false);
            return;
        }
        this.b = z2;
        updateHeaderPosition((this.mHeaderViewHeight + this.mOriginalOffsetTop) - this.mCurrentTargetOffsetTop);
        this.l = z3;
        a(this.N);
    }

    public void setAutoRefreshing(boolean z2) {
        this.l = z2;
        c();
        this.b = true;
        this.c.changeToState(RefreshHeader.RefreshState.REFRESHING);
        a(this.mCurrentTargetOffsetTop, (Animator.AnimatorListener) new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                GriverSwipeRefreshLayout.this.N.onAnimationEnd(animator);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        GriverSwipeRefreshLayout.this.setRefreshing(false);
                    }
                }, GriverSwipeRefreshLayout.this.z);
            }
        });
    }

    public void setAutoRefreshingDuration(long j2) {
        if (j2 > 0) {
            this.z = j2;
        }
    }

    private void a(boolean z2, boolean z3) {
        if (this.b != z2) {
            this.l = z3;
            c();
            this.b = z2;
            if (z2) {
                this.c.changeToState(RefreshHeader.RefreshState.REFRESHING);
                a(this.mCurrentTargetOffsetTop, this.N);
                return;
            }
            this.c.changeToState(RefreshHeader.RefreshState.NONE);
            b(this.mCurrentTargetOffsetTop, this.N);
            return;
        }
        if (this.c.getCurrentState() == RefreshHeader.RefreshState.SECOND_FLOOR_END) {
            this.b = false;
        } else if (z2) {
            this.l = z3;
            c();
            this.b = z2;
            if (z2) {
                this.c.changeToState(RefreshHeader.RefreshState.REFRESHING);
                a(this.mCurrentTargetOffsetTop, this.N);
                return;
            }
        } else {
            return;
        }
        this.c.changeToState(RefreshHeader.RefreshState.NONE);
        b(this.mCurrentTargetOffsetTop, this.N);
    }

    public void setLoadMore(boolean z2) {
        if (!z2 && this.n) {
            a(this.mFooterViewHeight, 0);
        }
    }

    private void a(Animator.AnimatorListener animatorListener) {
        this.c.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration((long) getResources().getInteger(17694721));
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    public boolean isRefreshing() {
        return getRefresHeader().getCurrentState() != RefreshHeader.RefreshState.NONE;
    }

    public void setRefreshing(boolean z2) {
        if (!z2 || this.b == z2) {
            a(z2, false);
            return;
        }
        this.b = z2;
        updateHeaderPosition((this.mHeaderViewHeight + this.mOriginalOffsetTop) - this.mCurrentTargetOffsetTop);
        this.l = false;
        a(this.N);
    }

    @TargetApi(11)
    private void a(int i2, final int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, i3});
        ofInt.setDuration(150);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int unused = GriverSwipeRefreshLayout.this.w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                GriverSwipeRefreshLayout.this.d();
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                if (i3 <= 0 || GriverSwipeRefreshLayout.this.h == null) {
                    boolean unused = GriverSwipeRefreshLayout.this.n = false;
                    GriverSwipeRefreshLayout.this.d.changeToState(LoadMoreFooter.LoadMoreState.NONE);
                    return;
                }
                boolean unused2 = GriverSwipeRefreshLayout.this.n = true;
                GriverSwipeRefreshLayout.this.d.changeToState(LoadMoreFooter.LoadMoreState.LOADING);
                GriverSwipeRefreshLayout.this.h.onLoadMore();
            }
        });
        ofInt.setInterpolator(this.y);
        ofInt.start();
    }

    private void a(int i2, Animator.AnimatorListener animatorListener) {
        int i3;
        int i4;
        this.mFrom = i2;
        if (this.v) {
            i3 = this.mHeaderViewHeight - Math.abs(this.mOriginalOffsetTop);
            i4 = this.mRefreshOffset;
        } else {
            i3 = this.mHeaderViewHeight;
            i4 = Math.abs(this.mOriginalOffsetTop);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.mFrom, i3 - i4});
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                GriverSwipeRefreshLayout.this.updateHeaderPosition(((Integer) valueAnimator.getAnimatedValue()).intValue() - GriverSwipeRefreshLayout.this.c.getTop());
            }
        });
        ofInt.setDuration(300);
        ofInt.setInterpolator(this.y);
        ofInt.start();
    }

    private void b(int i2, Animator.AnimatorListener animatorListener) {
        this.mFrom = i2;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, this.mOriginalOffsetTop});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                GriverSwipeRefreshLayout.this.c.setProgress(((float) (intValue - GriverSwipeRefreshLayout.this.mFrom)) / (((float) (GriverSwipeRefreshLayout.this.mOriginalOffsetTop - GriverSwipeRefreshLayout.this.mFrom)) * 1.0f));
                GriverSwipeRefreshLayout griverSwipeRefreshLayout = GriverSwipeRefreshLayout.this;
                griverSwipeRefreshLayout.updateHeaderPosition(intValue - griverSwipeRefreshLayout.c.getTop());
            }
        });
        ofInt.setDuration(300);
        ofInt.setInterpolator(this.y);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    private void c(int i2, Animator.AnimatorListener animatorListener) {
        this.mFrom = i2;
        new ValueAnimator();
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.mFrom, 0});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                GriverSwipeRefreshLayout.this.updateHeaderPosition(((Integer) ofInt.getAnimatedValue()).intValue() - GriverSwipeRefreshLayout.this.c.getTop());
            }
        });
        ofInt.setDuration(300);
        ofInt.setInterpolator(this.y);
        if (animatorListener != null) {
            ofInt.addListener(animatorListener);
        }
        ofInt.start();
    }

    public void updateHeaderPosition(int i2) {
        StringBuilder sb = new StringBuilder("updateHeaderPosition() called with: offset = [");
        sb.append(i2);
        sb.append("]");
        GriverLogger.d("SwipeRefreshLayout", sb.toString());
        this.c.bringToFront();
        this.c.offsetTopAndBottom(i2);
        this.f10615a.offsetTopAndBottom(i2);
        this.mCurrentTargetOffsetTop = this.c.getTop();
        e();
    }

    /* access modifiers changed from: private */
    public void d() {
        this.d.setVisibility(0);
        this.d.bringToFront();
        if (Build.VERSION.SDK_INT < 19) {
            this.d.getParent().requestLayout();
        }
        this.d.offsetTopAndBottom(-this.w);
        f();
    }

    /* access modifiers changed from: private */
    public void e() {
        int i2 = this.mCurrentTargetOffsetTop - this.mOriginalOffsetTop;
        OnPullRefreshListener onPullRefreshListener = this.g;
        if (onPullRefreshListener != null) {
            onPullRefreshListener.onPullDistance(i2);
        }
    }

    private void f() {
        OnPushLoadMoreListener onPushLoadMoreListener = this.h;
        if (onPushLoadMoreListener != null) {
            onPushLoadMoreListener.onPushDistance(this.w);
        }
    }

    private void a(MotionEvent motionEvent) {
        int max = setSingleChoiceItems.getMax(motionEvent);
        if (setSingleChoiceItems.getMin(motionEvent, max) == this.p) {
            int i2 = max == 0 ? 1 : 0;
            this.B = setSingleChoiceItems.setMax(motionEvent, i2);
            this.p = setSingleChoiceItems.getMin(motionEvent, i2);
        }
        int d2 = d(motionEvent, this.p);
        if (this.p != -1) {
            this.B = setSingleChoiceItems.setMax(motionEvent, d2);
        }
    }

    public boolean isTargetScrollWithLayout() {
        return this.m;
    }

    public void setTargetScrollWithLayout(boolean z2) {
        this.m = z2;
    }

    public void enablePullRefresh(boolean z2) {
        this.i = z2;
    }

    public void enableLoadMore(boolean z2) {
        this.j = z2;
    }

    public void enableSecondFloor(boolean z2) {
        this.k = z2;
    }

    public float getDistanceToRefresh() {
        return (float) this.s;
    }

    public void setDistanceToRefresh(int i2) {
        float f2 = (float) i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) >= this.mHeaderViewHeight) {
            int i3 = (int) (f2 * f3);
            this.s = i3;
            if (((float) (this.t - i3)) < f3 * 20.0f) {
                this.t = (int) (((float) i3) + (f3 * 20.0f));
            }
        }
    }

    public float getDistanceToSecondFloor() {
        return (float) this.t;
    }

    public void setDistanceToSecondFloor(int i2) {
        float f2 = (float) i2;
        float f3 = this.mDensity;
        if (((float) (((int) (f2 * f3)) - this.s)) >= 20.0f * f3) {
            this.t = (int) (f2 * f3);
        }
    }

    public void setMaxPushDistance(int i2) {
        float f2 = (float) i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) >= this.mFooterViewHeight) {
            this.x = (int) (f2 * f3);
        }
    }

    public void enableTargetOffset(boolean z2) {
        this.v = z2;
    }

    public int getRefreshOffset() {
        return this.mRefreshOffset;
    }

    public void setRefreshOffset(int i2) {
        int i3 = this.mHeaderViewHeight;
        float f2 = (float) i2;
        float f3 = this.mDensity;
        if (i3 >= ((int) (f2 * f3))) {
            this.mRefreshOffset = (int) (f2 * f3);
        }
    }

    public void setOnPullRefreshListener(OnPullRefreshListener onPullRefreshListener) {
        this.g = onPullRefreshListener;
        RefreshHeader refreshHeader = this.c;
        if (refreshHeader != null) {
            refreshHeader.setPullRefreshListener(onPullRefreshListener);
        }
    }

    public void setOnPushLoadMoreListener(OnPushLoadMoreListener onPushLoadMoreListener) {
        this.h = onPushLoadMoreListener;
        LoadMoreFooter loadMoreFooter = this.d;
        if (loadMoreFooter != null) {
            loadMoreFooter.setPushLoadMoreListener(onPushLoadMoreListener);
        }
    }

    public void setDragRate(float f2) {
        if (f2 > 0.0f && f2 < 1.0f) {
            this.r = f2;
        }
    }

    public void setHeaderView(RefreshHeader refreshHeader) {
        if (refreshHeader != null) {
            int indexOfChild = indexOfChild(this.c);
            RefreshHeader refreshHeader2 = this.c;
            if (!(refreshHeader2 == null || indexOfChild == -1)) {
                removeView(refreshHeader2);
            }
            this.c = refreshHeader;
            refreshHeader.setPullRefreshListener(this.g);
            addView(this.c, indexOfChild, new ViewGroup.LayoutParams(-1, this.mHeaderViewHeight));
        }
    }

    public int getHeaderViewHeight() {
        return this.mHeaderViewHeight;
    }

    public void setHeaderViewHeight(int i2) {
        float f2 = (float) i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) < this.mRefreshOffset) {
            GriverLogger.d("SwipeRefreshLayout", "HeaderView height cannot be smaller than refresh offset.");
            return;
        }
        int i3 = (int) (f2 * f3);
        this.mHeaderViewHeight = i3;
        if (this.s < i3) {
            this.s = i3;
        }
        int i4 = this.t;
        int i5 = this.s;
        if (i4 < i5) {
            this.t = (int) (((float) i5) + (this.mDensity * 20.0f));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        GriverLogger.d("SwipeRefreshLayout", "onConfigurationChanged");
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mDisplayMetrics = displayMetrics;
        this.mHeaderViewWidth = displayMetrics.widthPixels;
        this.mFooterViewWidth = this.mDisplayMetrics.widthPixels;
        this.q = false;
    }

    public void setFooterView(LoadMoreFooter loadMoreFooter) {
        if (loadMoreFooter != null) {
            int indexOfChild = indexOfChild(this.d);
            LoadMoreFooter loadMoreFooter2 = this.d;
            if (!(loadMoreFooter2 == null || indexOfChild == -1)) {
                removeView(loadMoreFooter2);
            }
            this.d = loadMoreFooter;
            loadMoreFooter.setPushLoadMoreListener(this.h);
            addView(this.d, indexOfChild, new ViewGroup.LayoutParams(-1, this.mFooterViewHeight));
        }
    }

    public int getFooterViewHeight() {
        return this.mFooterViewHeight;
    }

    public void setFooterViewHeight(int i2) {
        float f2 = (float) i2;
        float f3 = this.mDensity;
        if (((int) (f2 * f3)) > this.x) {
            this.x = (int) (f3 * f2);
        }
        this.mFooterViewHeight = (int) (f2 * this.mDensity);
    }

    public RefreshHeader getRefresHeader() {
        return this.c;
    }

    public LoadMoreFooter getLoadMoreFooter() {
        return this.d;
    }

    private int d(MotionEvent motionEvent, int i2) {
        int min = setSingleChoiceItems.setMin(motionEvent, i2);
        if (min == -1) {
            this.p = -1;
        }
        return min;
    }

    public void setCurrentTargetOffsetTop(int i2) {
        this.mCurrentTargetOffsetTop = i2;
    }

    class WMLAScrollerInfo implements Serializable {
        float bottom;
        float left;
        float right;
        float top;

        WMLAScrollerInfo() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WMLAScrollerInfo{top=");
            sb.append(this.top);
            sb.append(", left=");
            sb.append(this.left);
            sb.append(", bottom=");
            sb.append(this.bottom);
            sb.append(", right=");
            sb.append(this.right);
            sb.append('}');
            return sb.toString();
        }
    }
}
