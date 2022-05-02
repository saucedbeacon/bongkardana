package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.AppCompatActivity;
import o.FloatRange;
import o.FractionRes;
import o.GuardedBy;
import o.IntRange;
import o.RequiresPermission;
import o.attachBaseContext;
import o.setAdapter;
import o.setNegativeButtonIcon;
import o.setPositiveButtonIcon;
import o.setTheme;
import o.show;

public class CoordinatorLayout extends ViewGroup implements attachBaseContext, setTheme {
    static final Class<?>[] CONSTRUCTOR_PARAMS = {Context.class, AttributeSet.class};
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors = new ThreadLocal<>();
    private static final setPositiveButtonIcon.length<Rect> sRectPool = new setPositiveButtonIcon.setMax(12);
    private AppCompatActivity mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final FractionRes<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final show mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private setMin mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    public interface getMax {
        @NonNull
        Behavior getBehavior();
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        return i == 0 ? BadgeDrawable.TOP_END : i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            WIDGET_PACKAGE_NAME = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$getMin r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$getMin
            r0.<init>()
            TOP_SORTED_CHILDREN_COMPARATOR = r0
            goto L_0x0021
        L_0x001f:
            TOP_SORTED_CHILDREN_COMPARATOR = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            CONSTRUCTOR_PARAMS = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            sConstructors = r0
            o.setPositiveButtonIcon$setMax r0 = new o.setPositiveButtonIcon$setMax
            r1 = 12
            r0.<init>(r1)
            sRectPool = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    @NonNull
    private static Rect acquireTempRect() {
        Rect max = sRectPool.getMax();
        return max == null ? new Rect() : max;
    }

    private static void releaseTempRect(@NonNull Rect rect) {
        rect.setEmpty();
        sRectPool.getMin(rect);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, FloatRange.setMin.setMax);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new FractionRes<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new show();
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, FloatRange.getMin.setMax, 0, FloatRange.getMax.setMin);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, FloatRange.getMin.setMax, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, FloatRange.getMin.setMax, attributeSet, typedArray, 0, FloatRange.getMax.setMin);
            } else {
                saveAttributeDataForStyleable(context, FloatRange.getMin.setMax, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(FloatRange.getMin.getMin, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length2 = this.mKeylines.length;
            for (int i2 = 0; i2 < length2; i2++) {
                int[] iArr = this.mKeylines;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.mStatusBarBackground = typedArray.getDrawable(FloatRange.getMin.getMax);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new setMax());
        if (ViewCompat.isInside(this) == 0) {
            ViewCompat.setMin((View) this, 1);
        }
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new setMin();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && ViewCompat.ICustomTabsCallback(this)) {
            ViewCompat.b(this);
        }
        this.mIsAttachedToWindow = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.mStatusBarBackground = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                RequiresPermission.Read.setMax(this.mStatusBarBackground, ViewCompat.IsOverlapping(this));
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            ViewCompat.equals(this);
        }
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isVisible() != z) {
            this.mStatusBarBackground.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        setStatusBarBackground(i != 0 ? IntRange.length(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* access modifiers changed from: package-private */
    public final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        if (setNegativeButtonIcon.getMax(this.mLastInsets, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.mLastInsets = windowInsetsCompat;
        boolean z = true;
        boolean z2 = windowInsetsCompat != null && windowInsetsCompat.setMax() > 0;
        this.mDrawStatusBarBackground = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(windowInsetsCompat);
        requestLayout();
        return dispatchApplyWindowInsetsToBehaviors;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((length) childAt.getLayoutParams()).setMin;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((length) getChildAt(i2).getLayoutParams()).FastBitmap$CoordinateSystem = false;
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private void getTopSortedChildren(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            length length2 = (length) view.getLayoutParams();
            Behavior behavior = length2.setMin;
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && behavior != null) {
                    if (i2 == 0) {
                        z = behavior.onInterceptTouchEvent(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = behavior.onTouchEvent(this, view, motionEvent2);
                    }
                    if (z) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean max = length2.setMax();
                boolean min = length2.setMin(this, view);
                z2 = min && !max;
                if (min && !z2) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEvent3);
                } else if (i2 == 1) {
                    behavior.onTouchEvent(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return performIntercept;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$length r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.length) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.setMin
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.resetTouchBehaviors(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.mDisallowInterceptReset) {
            resetTouchBehaviors(false);
            this.mDisallowInterceptReset = true;
        }
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr != null && i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(WIDGET_PACKAGE_NAME)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(WIDGET_PACKAGE_NAME);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = sConstructors.get();
            if (map == null) {
                map = new HashMap();
                sConstructors.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    /* access modifiers changed from: package-private */
    public length getResolvedLayoutParams(View view) {
        length length2 = (length) view.getLayoutParams();
        if (!length2.length) {
            if (view instanceof getMax) {
                length2.getMax(((getMax) view).getBehavior());
                length2.length = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        length2.getMax((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        defaultBehavior.value();
                    }
                }
                length2.length = true;
            }
        }
        return length2;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        FractionRes<View> fractionRes = this.mChildDag;
        int size = fractionRes.setMax.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) fractionRes.setMax.isInside[(i << 1) + 1];
            if (arrayList != null) {
                arrayList.clear();
                fractionRes.setMin.getMin(arrayList);
            }
        }
        fractionRes.setMax.clear();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            length resolvedLayoutParams = getResolvedLayoutParams(childAt);
            if (resolvedLayoutParams.toIntRange == -1) {
                resolvedLayoutParams.values = null;
                resolvedLayoutParams.toString = null;
            } else if (resolvedLayoutParams.toString == null || !resolvedLayoutParams.length(childAt, this)) {
                resolvedLayoutParams.toString = findViewById(resolvedLayoutParams.toIntRange);
                if (resolvedLayoutParams.toString != null) {
                    if (resolvedLayoutParams.toString != this) {
                        View view = resolvedLayoutParams.toString;
                        ViewParent parent = resolvedLayoutParams.toString.getParent();
                        while (true) {
                            if (parent == this || parent == null) {
                                resolvedLayoutParams.values = view;
                            } else if (parent != childAt) {
                                if (parent instanceof View) {
                                    view = (View) parent;
                                }
                                parent = parent.getParent();
                            } else if (isInEditMode()) {
                                resolvedLayoutParams.values = null;
                                resolvedLayoutParams.toString = null;
                            } else {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                        resolvedLayoutParams.values = view;
                    } else if (isInEditMode()) {
                        resolvedLayoutParams.values = null;
                        resolvedLayoutParams.toString = null;
                    } else {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (isInEditMode()) {
                    resolvedLayoutParams.values = null;
                    resolvedLayoutParams.toString = null;
                } else {
                    StringBuilder sb = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                    sb.append(getResources().getResourceName(resolvedLayoutParams.toIntRange));
                    sb.append(" to anchor view ");
                    sb.append(childAt);
                    throw new IllegalStateException(sb.toString());
                }
            }
            FractionRes<View> fractionRes2 = this.mChildDag;
            if (!fractionRes2.setMax.containsKey(childAt)) {
                fractionRes2.setMax.put(childAt, null);
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (!resolvedLayoutParams.getMax(this, childAt, childAt2)) {
                        continue;
                    } else {
                        if (!this.mChildDag.length(childAt2)) {
                            FractionRes<View> fractionRes3 = this.mChildDag;
                            if (!fractionRes3.setMax.containsKey(childAt2)) {
                                fractionRes3.setMax.put(childAt2, null);
                            }
                        }
                        FractionRes<View> fractionRes4 = this.mChildDag;
                        if (!fractionRes4.setMax.containsKey(childAt2) || !fractionRes4.setMax.containsKey(childAt)) {
                            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                        }
                        ArrayList arrayList2 = fractionRes4.setMax.get(childAt2);
                        if (arrayList2 == null) {
                            arrayList2 = fractionRes4.setMin.getMax();
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            fractionRes4.setMax.put(childAt2, arrayList2);
                        }
                        arrayList2.add(childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.getMax());
        Collections.reverse(this.mDependencySortedChildren);
    }

    /* access modifiers changed from: package-private */
    public void getDescendantRect(View view, Rect rect) {
        GuardedBy.getMax(this, view, rect);
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0112, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.prepareChildren()
            r30.ensurePreDrawListener()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.ViewCompat.IsOverlapping(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.WindowInsetsCompat r3 = r7.mLastInsets
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.ViewCompat.ICustomTabsCallback(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.mDependencySortedChildren
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x0171
            java.util.List<android.view.View> r0 = r7.mDependencySortedChildren
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0160
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$length r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.length) r1
            int r0 = r1.getMin
            if (r0 < 0) goto L_0x00b4
            if (r13 == 0) goto L_0x00b4
            int r0 = r1.getMin
            int r0 = r7.getKeyline(r0)
            int r11 = r1.getMax
            int r11 = resolveKeylineGravity(r11)
            int r11 = o.setAdapter.length(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0091
            if (r12 == 0) goto L_0x0096
        L_0x0091:
            r2 = 5
            if (r11 != r2) goto L_0x00a2
            if (r12 == 0) goto L_0x00a2
        L_0x0096:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00b9
        L_0x00a2:
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00ab
        L_0x00a6:
            r2 = 3
            if (r11 != r2) goto L_0x00b6
            if (r12 == 0) goto L_0x00b6
        L_0x00ab:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00b9
        L_0x00b4:
            r22 = r2
        L_0x00b6:
            r11 = 0
            r21 = 0
        L_0x00b9:
            if (r19 == 0) goto L_0x00eb
            boolean r0 = androidx.core.view.ViewCompat.ICustomTabsCallback(r20)
            if (r0 != 0) goto L_0x00eb
            androidx.core.view.WindowInsetsCompat r0 = r7.mLastInsets
            int r0 = r0.getMax()
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.setMin()
            int r0 = r0 + r2
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.setMax()
            androidx.core.view.WindowInsetsCompat r11 = r7.mLastInsets
            int r11 = r11.getMin()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00ef
        L_0x00eb:
            r11 = r31
            r23 = r32
        L_0x00ef:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.setMin
            if (r0 == 0) goto L_0x0115
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x012f
            goto L_0x0122
        L_0x0115:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x0122:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.onMeasureChild(r1, r2, r3, r4, r5)
        L_0x012f:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
            goto L_0x0169
        L_0x0160:
            r11 = r2
            r22 = r3
            r1 = r4
            r29 = r6
            r28 = r8
            r8 = r5
        L_0x0169:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x0171:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat windowInsetsCompat) {
        Behavior behavior;
        if (windowInsetsCompat.IsOverlapping()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.ICustomTabsCallback(childAt) && (behavior = ((length) childAt.getLayoutParams()).setMin) != null) {
                windowInsetsCompat = behavior.onApplyWindowInsets(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.IsOverlapping()) {
                    break;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void onLayoutChild(@NonNull View view, int i) {
        length length2 = (length) view.getLayoutParams();
        if (length2.setMin()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (length2.toString != null) {
            layoutChildWithAnchor(view, length2.toString, i);
        } else if (length2.getMin >= 0) {
            layoutChildWithKeyline(view, length2.getMin, i);
        } else {
            layoutChild(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int IsOverlapping = ViewCompat.IsOverlapping(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((length) view.getLayoutParams()).setMin) == null || !behavior.onLayoutChild(this, view, IsOverlapping))) {
                onLayoutChild(view, IsOverlapping);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            WindowInsetsCompat windowInsetsCompat = this.mLastInsets;
            int max = windowInsetsCompat != null ? windowInsetsCompat.setMax() : 0;
            if (max > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), max);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    /* access modifiers changed from: package-private */
    public void recordLastChildRect(View view, Rect rect) {
        ((length) view.getLayoutParams()).toDoubleRange.set(rect);
    }

    /* access modifiers changed from: package-private */
    public void getLastChildRect(View view, Rect rect) {
        rect.set(((length) view.getLayoutParams()).toDoubleRange);
    }

    /* access modifiers changed from: package-private */
    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, length length2, int i2, int i3) {
        int i4;
        int i5;
        int length3 = setAdapter.length(resolveAnchoredChildGravity(length2.getMax), i);
        int length4 = setAdapter.length(resolveGravity(length2.setMax), i);
        int i6 = length3 & 7;
        int i7 = length3 & 112;
        int i8 = length4 & 7;
        int i9 = length4 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    private void constrainChildRect(length length2, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + length2.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - length2.rightMargin));
        int max2 = Math.max(getPaddingTop() + length2.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - length2.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: package-private */
    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        length length2 = (length) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, length2, measuredWidth, measuredHeight);
        constrainChildRect(length2, rect2, measuredWidth, measuredHeight);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        length length2 = (length) view.getLayoutParams();
        int length3 = setAdapter.length(resolveKeylineGravity(length2.getMax), i2);
        int i3 = length3 & 7;
        int i4 = length3 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        if (i3 == 1) {
            keyline += measuredWidth / 2;
        } else if (i3 == 5) {
            keyline += measuredWidth;
        }
        int i5 = 0;
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + length2.leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - length2.rightMargin));
        int max2 = Math.max(getPaddingTop() + length2.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - length2.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void layoutChild(View view, int i) {
        length length2 = (length) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + length2.leftMargin, getPaddingTop() + length2.topMargin, (getWidth() - getPaddingRight()) - length2.rightMargin, (getHeight() - getPaddingBottom()) - length2.bottomMargin);
        if (this.mLastInsets != null && ViewCompat.ICustomTabsCallback(this) && !ViewCompat.ICustomTabsCallback(view)) {
            acquireTempRect.left += this.mLastInsets.getMax();
            acquireTempRect.top += this.mLastInsets.setMax();
            acquireTempRect.right -= this.mLastInsets.setMin();
            acquireTempRect.bottom -= this.mLastInsets.getMin();
        }
        Rect acquireTempRect2 = acquireTempRect();
        setAdapter.setMin(resolveGravity(length2.getMax), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        length length2 = (length) view.getLayoutParams();
        if (length2.setMin != null) {
            float scrimOpacity = length2.setMin.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(length2.setMin.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    public final void onChildViewsChanged(int i) {
        boolean z;
        int i2 = i;
        int IsOverlapping = ViewCompat.IsOverlapping(this);
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.mDependencySortedChildren.get(i3);
            length length2 = (length) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (length2.values == this.mDependencySortedChildren.get(i4)) {
                        offsetChildToAnchor(view, IsOverlapping);
                    }
                }
                getChildRect(view, true, acquireTempRect2);
                if (length2.equals != 0 && !acquireTempRect2.isEmpty()) {
                    int length3 = setAdapter.length(length2.equals, IsOverlapping);
                    int i5 = length3 & 112;
                    if (i5 == 48) {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i5 == 80) {
                        acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    int i6 = length3 & 7;
                    if (i6 == 3) {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (i6 == 5) {
                        acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (length2.isInside != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, IsOverlapping);
                }
                if (i2 != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.mDependencySortedChildren.get(i7);
                    length length4 = (length) view2.getLayoutParams();
                    Behavior behavior = length4.setMin;
                    if (behavior != null && behavior.layoutDependsOn(this, view2, view)) {
                        if (i2 != 0 || !length4.length()) {
                            if (i2 != 2) {
                                z = behavior.onDependentViewChanged(this, view2, view);
                            } else {
                                behavior.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                length4.hashCode = z;
                            }
                        } else {
                            length4.hashCode = false;
                        }
                    }
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int height;
        int i3;
        if (ViewCompat.asInterface(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            length length2 = (length) view.getLayoutParams();
            Behavior behavior = length2.setMin;
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behavior == null || !behavior.getInsetDodgeRect(this, view, acquireTempRect)) {
                acquireTempRect.set(acquireTempRect2);
            } else if (!acquireTempRect2.contains(acquireTempRect)) {
                StringBuilder sb = new StringBuilder("Rect should be within the child's bounds. Rect:");
                sb.append(acquireTempRect.toShortString());
                sb.append(" | Bounds:");
                sb.append(acquireTempRect2.toShortString());
                throw new IllegalArgumentException(sb.toString());
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int length3 = setAdapter.length(length2.isInside, i);
            boolean z3 = true;
            if ((length3 & 48) != 48 || (i3 = (acquireTempRect.top - length2.topMargin) - length2.IsOverlapping) >= rect.top) {
                z = false;
            } else {
                setInsetOffsetY(view, rect.top - i3);
                z = true;
            }
            if ((length3 & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - length2.bottomMargin) + length2.IsOverlapping) < rect.bottom) {
                setInsetOffsetY(view, height - rect.bottom);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((length3 & 3) != 3 || (i2 = (acquireTempRect.left - length2.leftMargin) - length2.toFloatRange) >= rect.left) {
                z2 = false;
            } else {
                setInsetOffsetX(view, rect.left - i2);
                z2 = true;
            }
            if ((length3 & 5) != 5 || (width = ((getWidth() - acquireTempRect.right) - length2.rightMargin) + length2.toFloatRange) >= rect.right) {
                z3 = z2;
            } else {
                setInsetOffsetX(view, width - rect.right);
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    private void setInsetOffsetX(View view, int i) {
        length length2 = (length) view.getLayoutParams();
        if (length2.toFloatRange != i) {
            ViewCompat.toFloatRange(view, i - length2.toFloatRange);
            length2.toFloatRange = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        length length2 = (length) view.getLayoutParams();
        if (length2.IsOverlapping != i) {
            ViewCompat.equals(view, i - length2.IsOverlapping);
            length2.IsOverlapping = i;
        }
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List list = this.mChildDag.setMax.get(view);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                Behavior behavior = ((length) view2.getLayoutParams()).setMin;
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        FractionRes<View> fractionRes = this.mChildDag;
        int size = fractionRes.setMax.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            ArrayList arrayList2 = (ArrayList) fractionRes.setMax.isInside[i2 + 1];
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fractionRes.setMax.isInside[i2]);
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List list = this.mChildDag.setMax.get(view);
        this.mTempDependenciesList.clear();
        if (list != null) {
            this.mTempDependenciesList.addAll(list);
        }
        return this.mTempDependenciesList;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    /* access modifiers changed from: package-private */
    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.mNeedsPreDrawListener) {
            return;
        }
        if (z) {
            addPreDrawListener();
        } else {
            removePreDrawListener();
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.getMin(view);
    }

    /* access modifiers changed from: package-private */
    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new setMin();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    /* access modifiers changed from: package-private */
    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    /* access modifiers changed from: package-private */
    public void offsetChildToAnchor(View view, int i) {
        Behavior behavior;
        View view2 = view;
        length length2 = (length) view.getLayoutParams();
        if (length2.toString != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(length2.toString, acquireTempRect);
            boolean z = false;
            getChildRect(view2, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            getDesiredAnchoredChildRectWithoutConstraints(view, i, acquireTempRect, acquireTempRect3, length2, measuredWidth, measuredHeight);
            if (!(acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top)) {
                z = true;
            }
            constrainChildRect(length2, acquireTempRect3, measuredWidth, i2);
            int i3 = acquireTempRect3.left - acquireTempRect2.left;
            int i4 = acquireTempRect3.top - acquireTempRect2.top;
            if (i3 != 0) {
                ViewCompat.toFloatRange(view2, i3);
            }
            if (i4 != 0) {
                ViewCompat.equals(view2, i4);
            }
            if (z && (behavior = length2.setMin) != null) {
                behavior.onDependentViewChanged(this, view2, length2.toString);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    public boolean isPointInChildBounds(@NonNull View view, int i, int i2) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect acquireTempRect = acquireTempRect();
        getChildRect(view, view.getParent() != this, acquireTempRect);
        Rect acquireTempRect2 = acquireTempRect();
        getChildRect(view2, view2.getParent() != this, acquireTempRect2);
        try {
            if (acquireTempRect.left <= acquireTempRect2.right && acquireTempRect.top <= acquireTempRect2.bottom && acquireTempRect.right >= acquireTempRect2.left && acquireTempRect.bottom >= acquireTempRect2.top) {
                z = true;
            }
            return z;
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    public length generateLayoutParams(AttributeSet attributeSet) {
        return new length(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public length generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof length) {
            return new length((length) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new length((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new length(layoutParams);
    }

    /* access modifiers changed from: protected */
    public length generateDefaultLayoutParams() {
        return new length();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof length) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                length length2 = (length) childAt.getLayoutParams();
                Behavior behavior = length2.setMin;
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    length2.getMin(i3, onStartNestedScroll);
                } else {
                    length2.getMin(i3, false);
                }
            }
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior behavior;
        show show = this.mNestedScrollingParentHelper;
        if (i2 == 1) {
            show.length = i;
        } else {
            show.getMax = i;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            length length2 = (length) childAt.getLayoutParams();
            if (length2.length(i2) && (behavior = length2.setMin) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onStopNestedScroll(View view, int i) {
        show show = this.mNestedScrollingParentHelper;
        if (i == 1) {
            show.length = 0;
        } else {
            show.getMax = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            length length2 = (length) childAt.getLayoutParams();
            if (length2.length(i)) {
                Behavior behavior = length2.setMin;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                length2.getMin(i, false);
                length2.hashCode = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        Behavior behavior;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                length length2 = (length) childAt.getLayoutParams();
                if (length2.length(i5) && (behavior = length2.setMin) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.mBehaviorConsumed[1]);
                    } else {
                        i7 = Math.min(i9, this.mBehaviorConsumed[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                length length2 = (length) childAt.getLayoutParams();
                if (length2.length(i3) && (behavior = length2.setMin) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.mBehaviorConsumed;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            } else {
                int i9 = i3;
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                length length2 = (length) childAt.getLayoutParams();
                if (length2.length(0) && (behavior = length2.setMin) != null) {
                    z2 |= behavior.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            onChildViewsChanged(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                length length2 = (length) childAt.getLayoutParams();
                if (length2.length(0) && (behavior = length2.setMin) != null) {
                    z |= behavior.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        show show = this.mNestedScrollingParentHelper;
        return show.length | show.getMax;
    }

    class setMin implements ViewTreeObserver.OnPreDrawListener {
        setMin() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    static class getMin implements Comparator<View> {
        getMin() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            float ICustomTabsCallback$Default = ViewCompat.ICustomTabsCallback$Default((View) obj);
            float ICustomTabsCallback$Default2 = ViewCompat.ICustomTabsCallback$Default((View) obj2);
            if (ICustomTabsCallback$Default > ICustomTabsCallback$Default2) {
                return -1;
            }
            return ICustomTabsCallback$Default < ICustomTabsCallback$Default2 ? 1 : 0;
        }
    }

    public static abstract class Behavior<V extends View> {
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return -16777216;
        }

        @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void onAttachedToLayoutParams(@NonNull length length) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((length) view.getLayoutParams()).invokeSuspend = obj;
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((length) view.getLayoutParams()).invokeSuspend;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    public static class length extends ViewGroup.MarginLayoutParams {
        boolean FastBitmap$CoordinateSystem;
        int IsOverlapping;
        private boolean Mean$Arithmetic;
        public int equals = 0;
        public int getMax = 0;
        public int getMin = -1;
        boolean hashCode;
        Object invokeSuspend;
        public int isInside = 0;
        boolean length = false;
        public int setMax = 0;
        public Behavior setMin;
        final Rect toDoubleRange = new Rect();
        int toFloatRange;
        public int toIntRange = -1;
        public View toString;
        private boolean valueOf;
        public View values;

        public length() {
            super(-2, -2);
        }

        length(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FloatRange.getMin.length);
            this.getMax = obtainStyledAttributes.getInteger(FloatRange.getMin.isInside, 0);
            this.toIntRange = obtainStyledAttributes.getResourceId(FloatRange.getMin.IsOverlapping, -1);
            this.setMax = obtainStyledAttributes.getInteger(FloatRange.getMin.toIntRange, 0);
            this.getMin = obtainStyledAttributes.getInteger(FloatRange.getMin.values, -1);
            this.equals = obtainStyledAttributes.getInt(FloatRange.getMin.hashCode, 0);
            this.isInside = obtainStyledAttributes.getInt(FloatRange.getMin.toFloatRange, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(FloatRange.getMin.equals);
            this.length = hasValue;
            if (hasValue) {
                this.setMin = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(FloatRange.getMin.equals));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.setMin;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public length(length length2) {
            super(length2);
        }

        public length(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public length(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void getMax(@Nullable Behavior behavior) {
            Behavior behavior2 = this.setMin;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.setMin = behavior;
                this.invokeSuspend = null;
                this.length = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin() {
            return this.toString == null && this.toIntRange != -1;
        }

        /* access modifiers changed from: package-private */
        public final boolean setMax() {
            if (this.setMin == null) {
                this.FastBitmap$CoordinateSystem = false;
            }
            return this.FastBitmap$CoordinateSystem;
        }

        /* access modifiers changed from: package-private */
        public final boolean setMin(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.FastBitmap$CoordinateSystem;
            if (z) {
                return true;
            }
            Behavior behavior = this.setMin;
            boolean blocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.FastBitmap$CoordinateSystem = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        /* access modifiers changed from: package-private */
        public final void getMin(int i, boolean z) {
            if (i == 0) {
                this.valueOf = z;
            } else if (i == 1) {
                this.Mean$Arithmetic = z;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean length(int i) {
            if (i == 0) {
                return this.valueOf;
            }
            if (i != 1) {
                return false;
            }
            return this.Mean$Arithmetic;
        }

        /* access modifiers changed from: package-private */
        public final boolean length() {
            return this.hashCode;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.values || getMax(view2, ViewCompat.IsOverlapping(coordinatorLayout))) {
                return true;
            }
            Behavior behavior = this.setMin;
            return behavior != null && behavior.layoutDependsOn(coordinatorLayout, view, view2);
        }

        /* access modifiers changed from: package-private */
        public final boolean length(View view, CoordinatorLayout coordinatorLayout) {
            if (this.toString.getId() != this.toIntRange) {
                return false;
            }
            View view2 = this.toString;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.values = null;
                    this.toString = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.values = view2;
            return true;
        }

        private boolean getMax(View view, int i) {
            int length2 = setAdapter.length(((length) view.getLayoutParams()).equals, i);
            return length2 != 0 && (setAdapter.length(this.isInside, i) & length2) == length2;
        }
    }

    class setMax implements ViewGroup.OnHierarchyChangeListener {
        setMax() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            if (CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.getMax;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            Behavior behavior = getResolvedLayoutParams(childAt).setMin;
            if (!(id2 == -1 || behavior == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id2 = childAt.getId();
            Behavior behavior = ((length) childAt.getLayoutParams()).setMin;
            if (!(id2 == -1 || behavior == null || (onSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) == null)) {
                sparseArray.append(id2, onSaveInstanceState);
            }
        }
        savedState.getMax = sparseArray;
        return savedState;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((length) view.getLayoutParams()).setMin;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void setupForInsets() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (ViewCompat.ICustomTabsCallback(this)) {
                if (this.mApplyWindowInsetsListener == null) {
                    this.mApplyWindowInsetsListener = new AppCompatActivity() {
                        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                            return CoordinatorLayout.this.setWindowInsets(windowInsetsCompat);
                        }
                    };
                }
                ViewCompat.setMax((View) this, this.mApplyWindowInsetsListener);
                setSystemUiVisibility(APEncodeOptions.DEFAULT_MAX_LEN);
                return;
            }
            ViewCompat.setMax((View) this, (AppCompatActivity) null);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        SparseArray<Parcelable> getMax;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.getMax = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.getMax.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.getMax;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.getMax.keyAt(i2);
                parcelableArr[i2] = this.getMax.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
