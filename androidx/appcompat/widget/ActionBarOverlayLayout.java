package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import o.ITrustedWebActivityCallback;
import o.PluralsRes;
import o.attachBaseContext;
import o.getMetadata;
import o.getTag;
import o.initDelegate;
import o.onQueueTitleChanged;
import o.playFromSearch;
import o.setTheme;
import o.show;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements getTag, initDelegate, attachBaseContext, setTheme {
    static final int[] ATTRS = {ITrustedWebActivityCallback.Stub.getMin.getMin, 16842841};
    private final Rect FastBitmap$CoordinateSystem;
    private final Rect Grayscale$Algorithm;
    private final Runnable ICustomTabsCallback;
    private boolean IsOverlapping;
    private final Rect Mean$Arithmetic;
    private OverScroller b;
    @NonNull
    private WindowInsetsCompat create;
    private boolean equals;
    private final show extraCallback;
    private setMax getCause;
    private Drawable getMax;
    private int getMin;
    private final Rect hashCode;
    @NonNull
    private WindowInsetsCompat invoke;
    private final Rect invokeSuspend;
    private boolean isInside;
    private ContentFrameLayout length;
    ActionBarContainer mActionBarTop;
    boolean mAnimatingForFling;
    ViewPropertyAnimator mCurrentActionBarTopAnimator;
    final AnimatorListenerAdapter mTopAnimatorListener;
    @NonNull
    private WindowInsetsCompat onNavigationEvent;
    private final Runnable onPostMessage;
    private getMetadata setMax;
    private int setMin;
    private int toDoubleRange;
    private boolean toFloatRange;
    private int toIntRange;
    private final Rect toString;
    @NonNull
    private WindowInsetsCompat valueOf;
    private final Rect values;

    public interface setMax {
        void FastBitmap$CoordinateSystem();

        void length(int i);

        void setMax(boolean z);

        void toDoubleRange();

        void values();
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getMin = 0;
        this.FastBitmap$CoordinateSystem = new Rect();
        this.toString = new Rect();
        this.values = new Rect();
        this.hashCode = new Rect();
        this.Mean$Arithmetic = new Rect();
        this.invokeSuspend = new Rect();
        this.Grayscale$Algorithm = new Rect();
        this.invoke = WindowInsetsCompat.getMax;
        this.valueOf = WindowInsetsCompat.getMax;
        this.onNavigationEvent = WindowInsetsCompat.getMax;
        this.create = WindowInsetsCompat.getMax;
        this.mTopAnimatorListener = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = null;
                ActionBarOverlayLayout.this.mAnimatingForFling = false;
            }

            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.mCurrentActionBarTopAnimator = null;
                ActionBarOverlayLayout.this.mAnimatingForFling = false;
            }
        };
        this.ICustomTabsCallback = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
            }
        };
        this.onPostMessage = new Runnable() {
            public final void run() {
                ActionBarOverlayLayout.this.haltActionBarHideOffsetAnimations();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY((float) (-ActionBarOverlayLayout.this.mActionBarTop.getHeight())).setListener(ActionBarOverlayLayout.this.mTopAnimatorListener);
            }
        };
        setMax(context);
        this.extraCallback = new show();
    }

    private void setMax(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        boolean z = false;
        this.setMin = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.getMax = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.isInside = z;
        this.b = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    public void setActionBarVisibilityCallback(setMax setmax) {
        this.getCause = setmax;
        if (getWindowToken() != null) {
            this.getCause.length(this.getMin);
            int i = this.toDoubleRange;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.b(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.IsOverlapping = z;
        this.isInside = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public boolean isInOverlayMode() {
        return this.IsOverlapping;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.equals = z;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setMax(getContext());
        ViewCompat.b(this);
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        pullChildren();
        int i2 = this.toDoubleRange ^ i;
        this.toDoubleRange = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        setMax setmax = this.getCause;
        if (setmax != null) {
            setmax.setMax(!z);
            if (z2 || !z) {
                this.getCause.toDoubleRange();
            } else {
                this.getCause.values();
            }
        }
        if ((i2 & 256) != 0 && this.getCause != null) {
            ViewCompat.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.getMin = i;
        setMax setmax = this.getCause;
        if (setmax != null) {
            setmax.length(i);
        }
    }

    private static boolean getMax(@NonNull View view, @NonNull Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != rect.left) {
            layoutParams.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z2 = true;
        }
        if (layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || layoutParams.bottomMargin == rect.bottom) {
            return z2;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        pullChildren();
        boolean max = getMax(this.mActionBarTop, rect, false);
        this.hashCode.set(rect);
        playFromSearch.length(this, this.hashCode, this.FastBitmap$CoordinateSystem);
        if (!this.Mean$Arithmetic.equals(this.hashCode)) {
            this.Mean$Arithmetic.set(this.hashCode);
            max = true;
        }
        if (!this.toString.equals(this.FastBitmap$CoordinateSystem)) {
            this.toString.set(this.FastBitmap$CoordinateSystem);
            max = true;
        }
        if (max) {
            requestLayout();
        }
        return true;
    }

    @RequiresApi(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        pullChildren();
        WindowInsetsCompat max = WindowInsetsCompat.setMax(windowInsets, this);
        boolean max2 = getMax(this.mActionBarTop, new Rect(max.getMax(), max.setMax(), max.setMin(), max.getMin()), false);
        ViewCompat.getMax(this, max, this.FastBitmap$CoordinateSystem);
        WindowInsetsCompat min = max.getMin(this.FastBitmap$CoordinateSystem.left, this.FastBitmap$CoordinateSystem.top, this.FastBitmap$CoordinateSystem.right, this.FastBitmap$CoordinateSystem.bottom);
        this.invoke = min;
        boolean z = true;
        if (!this.valueOf.equals(min)) {
            this.valueOf = this.invoke;
            max2 = true;
        }
        if (!this.toString.equals(this.FastBitmap$CoordinateSystem)) {
            this.toString.set(this.FastBitmap$CoordinateSystem);
        } else {
            z = max2;
        }
        if (z) {
            requestLayout();
        }
        return max.toFloatRange().toIntRange().equals().values();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        pullChildren();
        measureChildWithMargins(this.mActionBarTop, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.mActionBarTop.getLayoutParams();
        int max = Math.max(0, this.mActionBarTop.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.mActionBarTop.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.mActionBarTop.getMeasuredState());
        boolean z = (ViewCompat.getCause(this) & 256) != 0;
        if (z) {
            i3 = this.setMin;
            if (this.equals && this.mActionBarTop.getTabContainer() != null) {
                i3 += this.setMin;
            }
        } else {
            i3 = this.mActionBarTop.getVisibility() != 8 ? this.mActionBarTop.getMeasuredHeight() : 0;
        }
        this.values.set(this.FastBitmap$CoordinateSystem);
        if (Build.VERSION.SDK_INT >= 21) {
            this.onNavigationEvent = this.invoke;
        } else {
            this.invokeSuspend.set(this.hashCode);
        }
        if (!this.IsOverlapping && !z) {
            this.values.top += i3;
            this.values.bottom += 0;
            if (Build.VERSION.SDK_INT >= 21) {
                this.onNavigationEvent = this.onNavigationEvent.getMin(0, i3, 0, 0);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.onNavigationEvent = new WindowInsetsCompat.getMax(this.onNavigationEvent).length(PluralsRes.setMax(this.onNavigationEvent.getMax(), this.onNavigationEvent.setMax() + i3, this.onNavigationEvent.setMin(), this.onNavigationEvent.getMin() + 0)).setMax();
        } else {
            this.invokeSuspend.top += i3;
            this.invokeSuspend.bottom += 0;
        }
        getMax(this.length, this.values, true);
        if (Build.VERSION.SDK_INT >= 21 && !this.create.equals(this.onNavigationEvent)) {
            WindowInsetsCompat windowInsetsCompat = this.onNavigationEvent;
            this.create = windowInsetsCompat;
            ViewCompat.length((View) this.length, windowInsetsCompat);
        } else if (Build.VERSION.SDK_INT < 21 && !this.Grayscale$Algorithm.equals(this.invokeSuspend)) {
            this.Grayscale$Algorithm.set(this.invokeSuspend);
            this.length.dispatchFitSystemWindows(this.invokeSuspend);
        }
        measureChildWithMargins(this.length, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.length.getLayoutParams();
        int max3 = Math.max(max, this.length.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.length.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.length.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.getMax != null && !this.isInside) {
            int bottom = this.mActionBarTop.getVisibility() == 0 ? (int) (((float) this.mActionBarTop.getBottom()) + this.mActionBarTop.getTranslationY() + 0.5f) : 0;
            this.getMax.setBounds(0, bottom, getWidth(), this.getMax.getIntrinsicHeight() + bottom);
            this.getMax.draw(canvas);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.mActionBarTop.getVisibility() != 0) {
            return false;
        }
        return this.toFloatRange;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.extraCallback.getMax = i;
        this.toIntRange = getActionBarHideOffset();
        haltActionBarHideOffsetAnimations();
        setMax setmax = this.getCause;
        if (setmax != null) {
            setmax.FastBitmap$CoordinateSystem();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.toIntRange + i2;
        this.toIntRange = i5;
        setActionBarHideOffset(i5);
    }

    public void onStopNestedScroll(View view) {
        if (this.toFloatRange && !this.mAnimatingForFling) {
            if (this.toIntRange <= this.mActionBarTop.getHeight()) {
                haltActionBarHideOffsetAnimations();
                postDelayed(this.ICustomTabsCallback, 600);
                return;
            }
            haltActionBarHideOffsetAnimations();
            postDelayed(this.onPostMessage, 600);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.toFloatRange || !z) {
            return false;
        }
        if (setMax(f2)) {
            haltActionBarHideOffsetAnimations();
            this.onPostMessage.run();
        } else {
            haltActionBarHideOffsetAnimations();
            this.ICustomTabsCallback.run();
        }
        this.mAnimatingForFling = true;
        return true;
    }

    public int getNestedScrollAxes() {
        show show = this.extraCallback;
        return show.length | show.getMax;
    }

    /* access modifiers changed from: package-private */
    public void pullChildren() {
        getMetadata getmetadata;
        if (this.length == null) {
            this.length = (ContentFrameLayout) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.getMin);
            this.mActionBarTop = (ActionBarContainer) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.setMax);
            View findViewById = findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.length);
            if (findViewById instanceof getMetadata) {
                getmetadata = (getMetadata) findViewById;
            } else if (findViewById instanceof Toolbar) {
                getmetadata = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
                sb.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(sb.toString());
            }
            this.setMax = getmetadata;
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.toFloatRange) {
            this.toFloatRange = z;
            if (!z) {
                haltActionBarHideOffsetAnimations();
                setActionBarHideOffset(0);
            }
        }
    }

    public boolean isHideOnContentScrollEnabled() {
        return this.toFloatRange;
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.mActionBarTop;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        haltActionBarHideOffsetAnimations();
        this.mActionBarTop.setTranslationY((float) (-Math.max(0, Math.min(i, this.mActionBarTop.getHeight()))));
    }

    /* access modifiers changed from: package-private */
    public void haltActionBarHideOffsetAnimations() {
        removeCallbacks(this.ICustomTabsCallback);
        removeCallbacks(this.onPostMessage);
        ViewPropertyAnimator viewPropertyAnimator = this.mCurrentActionBarTopAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private boolean setMax(float f) {
        this.b.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.b.getFinalY() > this.mActionBarTop.getHeight();
    }

    public void setWindowCallback(Window.Callback callback) {
        pullChildren();
        this.setMax.setMax(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        pullChildren();
        this.setMax.setMin(charSequence);
    }

    public CharSequence getTitle() {
        pullChildren();
        return this.setMax.setMin();
    }

    public void initFeature(int i) {
        pullChildren();
        if (i == 109) {
            setOverlayMode(true);
        }
    }

    public boolean hasIcon() {
        pullChildren();
        return this.setMax.IsOverlapping();
    }

    public boolean hasLogo() {
        pullChildren();
        return this.setMax.equals();
    }

    public void setIcon(int i) {
        pullChildren();
        this.setMax.length(i);
    }

    public void setIcon(Drawable drawable) {
        pullChildren();
        this.setMax.length(drawable);
    }

    public void setLogo(int i) {
        pullChildren();
        this.setMax.setMax(i);
    }

    public boolean canShowOverflowMenu() {
        pullChildren();
        return this.setMax.isInside();
    }

    public boolean isOverflowMenuShowing() {
        pullChildren();
        return this.setMax.toIntRange();
    }

    public boolean isOverflowMenuShowPending() {
        pullChildren();
        return this.setMax.toFloatRange();
    }

    public boolean showOverflowMenu() {
        pullChildren();
        return this.setMax.FastBitmap$CoordinateSystem();
    }

    public boolean hideOverflowMenu() {
        pullChildren();
        return this.setMax.toDoubleRange();
    }

    public void setMenuPrepared() {
        pullChildren();
        this.setMax.values();
    }

    public void setMenu(Menu menu, onQueueTitleChanged.setMax setmax) {
        pullChildren();
        this.setMax.setMin(menu, setmax);
    }

    public void saveToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.setMax.getMax(sparseArray);
    }

    public void restoreToolbarHierarchyState(SparseArray<Parcelable> sparseArray) {
        pullChildren();
        this.setMax.getMin(sparseArray);
    }

    public void dismissPopups() {
        pullChildren();
        this.setMax.invoke();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
