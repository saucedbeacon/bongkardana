package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import java.util.ArrayList;
import java.util.List;
import o.IntRange;
import o.RequiresPermission;
import o.onCreateDialog;
import o.onSupportActionModeFinished;
import o.setAdapter;
import o.setOnCancelListener;

public class DrawerLayout extends ViewGroup {
    static final boolean CAN_HIDE_DESCENDANTS = (Build.VERSION.SDK_INT >= 19);
    static final int[] LAYOUT_ATTRS = {16842931};
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final int[] getMin = {16843828};
    private static final boolean length;
    private boolean FastBitmap$CoordinateSystem;
    private int Grayscale$Algorithm;
    private boolean ICustomTabsCallback;
    private Drawable ICustomTabsCallback$Default;
    private Drawable ICustomTabsCallback$Stub;
    private Matrix ICustomTabsService;
    private final onCreateDialog IsOverlapping;
    private boolean Mean$Arithmetic;
    private Object asBinder;
    private boolean asInterface;
    private float b;
    private List<getMin> create;
    private int equals;
    private Drawable extraCallback;
    private CharSequence extraCallbackWithResult;
    private float getCause;
    private Drawable getDefaultImpl;
    private Rect getInterfaceDescriptor;
    private float getMax;
    private int hashCode;
    private int invoke;
    private int invokeSuspend;
    private Paint isInside;
    private Drawable onMessageChannelReady;
    @Nullable
    private getMin onNavigationEvent;
    private Drawable onPostMessage;
    private CharSequence onRelationshipValidationResult;
    private Drawable onTransact;
    private final ArrayList<View> setDefaultImpl;
    private int setMax;
    private final setMax setMin;
    private final length toDoubleRange;
    private final onCreateDialog toFloatRange;
    private float toIntRange;
    private final length toString;
    private int valueOf;
    private boolean values;

    public interface getMin {
        void getMax();

        void getMin();

        void getMin(float f);
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        length = z;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMin = new setMax();
        this.equals = -1728053248;
        this.isInside = new Paint();
        this.values = true;
        this.invokeSuspend = 3;
        this.valueOf = 3;
        this.Grayscale$Algorithm = 3;
        this.invoke = 3;
        this.ICustomTabsCallback$Stub = null;
        this.onTransact = null;
        this.ICustomTabsCallback$Default = null;
        this.getDefaultImpl = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.setMax = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.toDoubleRange = new length(3);
        this.toString = new length(5);
        onCreateDialog min = onCreateDialog.getMin((ViewGroup) this, 1.0f, (onCreateDialog.setMin) this.toDoubleRange);
        this.toFloatRange = min;
        min.getMax = 1;
        this.toFloatRange.setMax = f2;
        this.toDoubleRange.setMax = this.toFloatRange;
        onCreateDialog min2 = onCreateDialog.getMin((ViewGroup) this, 1.0f, (onCreateDialog.setMin) this.toString);
        this.IsOverlapping = min2;
        min2.getMax = 2;
        this.IsOverlapping.setMax = f2;
        this.toString.setMax = this.IsOverlapping;
        setFocusableInTouchMode(true);
        ViewCompat.setMin((View) this, 1);
        ViewCompat.getMin((View) this, (setOnCancelListener) new getMax());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.ICustomTabsCallback(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(APEncodeOptions.DEFAULT_MAX_LEN);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(getMin);
                try {
                    this.onPostMessage = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.onPostMessage = null;
            }
        }
        this.getMax = f * 10.0f;
        this.setDefaultImpl = new ArrayList<>();
    }

    public void setDrawerElevation(float f) {
        this.getMax = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                ViewCompat.getMax(childAt, this.getMax);
            }
        }
    }

    public float getDrawerElevation() {
        if (length) {
            return this.getMax;
        }
        return 0.0f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setChildInsets(Object obj, boolean z) {
        this.asBinder = obj;
        this.asInterface = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!length) {
            if ((i & 8388611) == 8388611) {
                this.ICustomTabsCallback$Stub = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.onTransact = drawable;
            } else if ((i & 3) == 3) {
                this.ICustomTabsCallback$Default = drawable;
            } else if ((i & 5) == 5) {
                this.getDefaultImpl = drawable;
            } else {
                return;
            }
            if (!length) {
                this.extraCallback = length();
                this.onMessageChannelReady = setMax();
            }
            invalidate();
        }
    }

    public void setDrawerShadow(@DrawableRes int i, int i2) {
        setDrawerShadow(IntRange.length(getContext(), i), i2);
    }

    public void setScrimColor(@ColorInt int i) {
        this.equals = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(getMin getmin) {
        getMin getmin2 = this.onNavigationEvent;
        if (getmin2 != null) {
            removeDrawerListener(getmin2);
        }
        if (getmin != null) {
            addDrawerListener(getmin);
        }
        this.onNavigationEvent = getmin;
    }

    public void addDrawerListener(@NonNull getMin getmin) {
        if (getmin != null) {
            if (this.create == null) {
                this.create = new ArrayList();
            }
            this.create.add(getmin);
        }
    }

    public void removeDrawerListener(@NonNull getMin getmin) {
        List<getMin> list;
        if (getmin != null && (list = this.create) != null) {
            list.remove(getmin);
        }
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        View findDrawerWithGravity;
        int length2 = setAdapter.length(i2, ViewCompat.IsOverlapping(this));
        if (i2 == 3) {
            this.invokeSuspend = i;
        } else if (i2 == 5) {
            this.valueOf = i;
        } else if (i2 == 8388611) {
            this.Grayscale$Algorithm = i;
        } else if (i2 == 8388613) {
            this.invoke = i;
        }
        if (i != 0) {
            (length2 == 3 ? this.toFloatRange : this.IsOverlapping).setMin();
        }
        if (i == 1) {
            View findDrawerWithGravity2 = findDrawerWithGravity(length2);
            if (findDrawerWithGravity2 != null) {
                closeDrawer(findDrawerWithGravity2);
            }
        } else if (i == 2 && (findDrawerWithGravity = findDrawerWithGravity(length2)) != null) {
            openDrawer(findDrawerWithGravity);
        }
    }

    public void setDrawerLockMode(int i, @NonNull View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).getMin);
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }

    public int getDrawerLockMode(int i) {
        int i2;
        int i3;
        int i4;
        int IsOverlapping2 = ViewCompat.IsOverlapping(this);
        if (i == 3) {
            int i5 = this.invokeSuspend;
            if (i5 != 3) {
                return i5;
            }
            int i6 = IsOverlapping2 == 0 ? this.Grayscale$Algorithm : this.invoke;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i == 5) {
            int i7 = this.valueOf;
            if (i7 != 3) {
                return i7;
            }
            if (IsOverlapping2 == 0) {
                i2 = this.invoke;
            } else {
                i2 = this.Grayscale$Algorithm;
            }
            if (i2 != 3) {
                return i2;
            }
            return 0;
        } else if (i == 8388611) {
            int i8 = this.Grayscale$Algorithm;
            if (i8 != 3) {
                return i8;
            }
            if (IsOverlapping2 == 0) {
                i3 = this.invokeSuspend;
            } else {
                i3 = this.valueOf;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i9 = this.invoke;
            if (i9 != 3) {
                return i9;
            }
            if (IsOverlapping2 == 0) {
                i4 = this.valueOf;
            } else {
                i4 = this.invokeSuspend;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
    }

    public int getDrawerLockMode(@NonNull View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((LayoutParams) view.getLayoutParams()).getMin);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerTitle(int i, @Nullable CharSequence charSequence) {
        int length2 = setAdapter.length(i, ViewCompat.IsOverlapping(this));
        if (length2 == 3) {
            this.onRelationshipValidationResult = charSequence;
        } else if (length2 == 5) {
            this.extraCallbackWithResult = charSequence;
        }
    }

    @Nullable
    public CharSequence getDrawerTitle(int i) {
        int length2 = setAdapter.length(i, ViewCompat.IsOverlapping(this));
        if (length2 == 3) {
            return this.onRelationshipValidationResult;
        }
        if (length2 == 5) {
            return this.extraCallbackWithResult;
        }
        return null;
    }

    private boolean setMin(float f, float f2, View view) {
        if (this.getInterfaceDescriptor == null) {
            this.getInterfaceDescriptor = new Rect();
        }
        view.getHitRect(this.getInterfaceDescriptor);
        return this.getInterfaceDescriptor.contains((int) f, (int) f2);
    }

    private boolean getMax(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                if (this.ICustomTabsService == null) {
                    this.ICustomTabsService = new Matrix();
                }
                matrix.invert(this.ICustomTabsService);
                obtain.transform(this.ICustomTabsService);
            }
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(obtain);
            obtain.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* access modifiers changed from: package-private */
    public void updateDrawerState(int i, int i2, View view) {
        int i3 = this.toFloatRange.setMin;
        int i4 = this.IsOverlapping.setMin;
        int i5 = 2;
        if (i3 == 1 || i4 == 1) {
            i5 = 1;
        } else if (!(i3 == 2 || i4 == 2)) {
            i5 = 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.length == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (layoutParams.length == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i5 != this.hashCode) {
            this.hashCode = i5;
            List<getMin> list = this.create;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.create.get(size);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.setMin & 1) == 1) {
            layoutParams.setMin = 0;
            List<getMin> list = this.create;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.create.get(size).getMax();
                }
            }
            getMin(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerOpened(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.setMin & 1) == 0) {
            layoutParams.setMin = 1;
            List<getMin> list = this.create;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.create.get(size).getMin();
                }
            }
            getMin(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    private void getMin(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || isDrawerView(childAt)) && (!z || childAt != view)) {
                ViewCompat.setMin(childAt, 4);
            } else {
                ViewCompat.setMin(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerSlide(View view, float f) {
        List<getMin> list = this.create;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.create.get(size).getMin(f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setDrawerViewOffset(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.length) {
            layoutParams.length = f;
            dispatchOnDrawerSlide(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    public float getDrawerViewOffset(View view) {
        return ((LayoutParams) view.getLayoutParams()).length;
    }

    /* access modifiers changed from: package-private */
    public int getDrawerViewAbsoluteGravity(View view) {
        return setAdapter.length(((LayoutParams) view.getLayoutParams()).getMin, ViewCompat.IsOverlapping(this));
    }

    /* access modifiers changed from: package-private */
    public boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    /* access modifiers changed from: package-private */
    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).setMin & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void moveDrawerToOffset(View view, float f) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    /* access modifiers changed from: package-private */
    public View findDrawerWithGravity(int i) {
        int length2 = setAdapter.length(i, ViewCompat.IsOverlapping(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == length2) {
                return childAt;
            }
        }
        return null;
    }

    static String gravityToString(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.values = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.values = true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.asBinder != null && ViewCompat.ICustomTabsCallback(this);
        int IsOverlapping2 = ViewCompat.IsOverlapping(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int length2 = setAdapter.length(layoutParams.getMin, IsOverlapping2);
                    if (ViewCompat.ICustomTabsCallback(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.asBinder;
                            if (length2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (length2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.asBinder;
                        if (length2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (length2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (length) {
                        float Mean$Arithmetic2 = ViewCompat.Mean$Arithmetic(childAt);
                        float f = this.getMax;
                        if (Mean$Arithmetic2 != f) {
                            ViewCompat.getMax(childAt, f);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    boolean z4 = drawerViewAbsoluteGravity == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.setMax + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        sb.append(gravityToString(drawerViewAbsoluteGravity));
                        sb.append(" but this DrawerLayout already has a drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    private Drawable length() {
        int IsOverlapping2 = ViewCompat.IsOverlapping(this);
        if (IsOverlapping2 == 0) {
            Drawable drawable = this.ICustomTabsCallback$Stub;
            if (drawable != null) {
                getMax(drawable, IsOverlapping2);
                return this.ICustomTabsCallback$Stub;
            }
        } else {
            Drawable drawable2 = this.onTransact;
            if (drawable2 != null) {
                getMax(drawable2, IsOverlapping2);
                return this.onTransact;
            }
        }
        return this.ICustomTabsCallback$Default;
    }

    private Drawable setMax() {
        int IsOverlapping2 = ViewCompat.IsOverlapping(this);
        if (IsOverlapping2 == 0) {
            Drawable drawable = this.onTransact;
            if (drawable != null) {
                getMax(drawable, IsOverlapping2);
                return this.onTransact;
            }
        } else {
            Drawable drawable2 = this.ICustomTabsCallback$Stub;
            if (drawable2 != null) {
                getMax(drawable2, IsOverlapping2);
                return this.ICustomTabsCallback$Stub;
            }
        }
        return this.getDefaultImpl;
    }

    private static boolean getMax(Drawable drawable, int i) {
        if (drawable == null || !RequiresPermission.Read.setMin(drawable)) {
            return false;
        }
        RequiresPermission.Read.setMax(drawable, i);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.FastBitmap$CoordinateSystem = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.length * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i6 - ((int) (layoutParams.length * f3));
                        f = ((float) (i6 - i8)) / f3;
                        i5 = i8;
                    }
                    boolean z2 = f != layoutParams.length;
                    int i9 = layoutParams.getMin & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < layoutParams.topMargin) {
                            i11 = layoutParams.topMargin;
                        } else if (i11 + measuredHeight > i10 - layoutParams.bottomMargin) {
                            i11 = (i10 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f);
                    }
                    int i13 = layoutParams.length > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        this.FastBitmap$CoordinateSystem = false;
        this.values = false;
    }

    public void requestLayout() {
        if (!this.FastBitmap$CoordinateSystem) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).length);
        }
        this.toIntRange = f;
        boolean min = this.toFloatRange.getMin();
        boolean min2 = this.IsOverlapping.getMin();
        if (min || min2) {
            ViewCompat.equals(this);
        }
    }

    private static boolean setMax(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.onPostMessage = drawable;
        invalidate();
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.onPostMessage;
    }

    public void setStatusBarBackground(int i) {
        this.onPostMessage = i != 0 ? IntRange.length(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.onPostMessage = new ColorDrawable(i);
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.asBinder;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.asInterface
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.onPostMessage
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.asBinder
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.onPostMessage
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.onPostMessage
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean isContentView = isContentView(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && setMax(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.toIntRange;
        if (f > 0.0f && isContentView) {
            int i4 = this.equals;
            this.isInside.setColor((i4 & FlexItem.MAX_SIZE) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.isInside);
        } else if (this.extraCallback != null && checkDrawerViewAbsoluteGravity(view2, 3)) {
            int intrinsicWidth = this.extraCallback.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.toFloatRange.getMin), 1.0f));
            this.extraCallback.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.extraCallback.setAlpha((int) (max * 255.0f));
            this.extraCallback.draw(canvas);
        } else if (this.onMessageChannelReady != null && checkDrawerViewAbsoluteGravity(view2, 5)) {
            int intrinsicWidth2 = this.onMessageChannelReady.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.IsOverlapping.getMin), 1.0f));
            this.onMessageChannelReady.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.onMessageChannelReady.setAlpha((int) (max2 * 255.0f));
            this.onMessageChannelReady.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public boolean isContentView(View view) {
        return ((LayoutParams) view.getLayoutParams()).getMin == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean isDrawerView(View view) {
        int length2 = setAdapter.length(((LayoutParams) view.getLayoutParams()).getMin, ViewCompat.IsOverlapping(view));
        return ((length2 & 3) == 0 && (length2 & 5) == 0) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r7 = r6.toFloatRange.setMax((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            o.onCreateDialog r1 = r6.toFloatRange
            boolean r1 = r1.setMax((android.view.MotionEvent) r7)
            o.onCreateDialog r2 = r6.IsOverlapping
            boolean r2 = r2.setMax((android.view.MotionEvent) r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0042
            if (r0 == r2) goto L_0x0039
            r7 = 2
            if (r0 == r7) goto L_0x001e
            r7 = 3
            if (r0 == r7) goto L_0x0039
            goto L_0x0040
        L_0x001e:
            o.onCreateDialog r7 = r6.toFloatRange
            boolean r7 = r7.length()
            if (r7 == 0) goto L_0x0040
            androidx.drawerlayout.widget.DrawerLayout$length r7 = r6.toDoubleRange
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            java.lang.Runnable r7 = r7.setMin
            r0.removeCallbacks(r7)
            androidx.drawerlayout.widget.DrawerLayout$length r7 = r6.toString
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            java.lang.Runnable r7 = r7.setMin
            r0.removeCallbacks(r7)
            goto L_0x0040
        L_0x0039:
            r6.closeDrawers(r2)
            r6.Mean$Arithmetic = r3
            r6.ICustomTabsCallback = r3
        L_0x0040:
            r7 = 0
            goto L_0x006c
        L_0x0042:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.getCause = r0
            r6.b = r7
            float r4 = r6.toIntRange
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0067
            o.onCreateDialog r4 = r6.toFloatRange
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.setMax((int) r0, (int) r7)
            if (r7 == 0) goto L_0x0067
            boolean r7 = r6.isContentView(r7)
            if (r7 == 0) goto L_0x0067
            r7 = 1
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            r6.Mean$Arithmetic = r3
            r6.ICustomTabsCallback = r3
        L_0x006c:
            if (r1 != 0) goto L_0x007c
            if (r7 != 0) goto L_0x007c
            boolean r7 = r6.getMin()
            if (r7 != 0) goto L_0x007c
            boolean r7 = r6.ICustomTabsCallback
            if (r7 == 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            return r3
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.toIntRange <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (setMin(x, y, childAt) && !isContentView(childAt) && getMax(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View findOpenDrawer;
        this.toFloatRange.getMin(motionEvent);
        this.IsOverlapping.getMin(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.getCause = x;
            this.b = y;
            this.Mean$Arithmetic = false;
            this.ICustomTabsCallback = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View max = this.toFloatRange.setMax((int) x2, (int) y2);
            if (max != null && isContentView(max)) {
                float f = x2 - this.getCause;
                float f2 = y2 - this.b;
                int i = this.toFloatRange.length;
                if (!((f * f) + (f2 * f2) >= ((float) (i * i)) || (findOpenDrawer = findOpenDrawer()) == null || getDrawerLockMode(findOpenDrawer) == 2)) {
                    z = false;
                    closeDrawers(z);
                    this.Mean$Arithmetic = false;
                }
            }
            z = true;
            closeDrawers(z);
            this.Mean$Arithmetic = false;
        } else if (action == 3) {
            closeDrawers(true);
            this.Mean$Arithmetic = false;
            this.ICustomTabsCallback = false;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.Mean$Arithmetic = z;
        if (z) {
            closeDrawers(true);
        }
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    /* access modifiers changed from: package-private */
    public void closeDrawers(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || layoutParams.setMax)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    z2 = this.toFloatRange.setMax(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.IsOverlapping.setMax(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                layoutParams.setMax = false;
            }
        }
        length length2 = this.toDoubleRange;
        DrawerLayout.this.removeCallbacks(length2.setMin);
        length length3 = this.toString;
        DrawerLayout.this.removeCallbacks(length3.setMin);
        if (z3) {
            invalidate();
        }
    }

    public void openDrawer(@NonNull View view) {
        openDrawer(view, true);
    }

    public void openDrawer(@NonNull View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.values) {
                layoutParams.length = 1.0f;
                layoutParams.setMin = 1;
                getMin(view, true);
            } else if (z) {
                layoutParams.setMin |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.toFloatRange.setMax(view, 0, view.getTop());
                } else {
                    this.IsOverlapping.setMax(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(layoutParams.getMin, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(gravityToString(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public void closeDrawer(@NonNull View view) {
        closeDrawer(view, true);
    }

    public void closeDrawer(@NonNull View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.values) {
                layoutParams.length = 0.0f;
                layoutParams.setMin = 0;
            } else if (z) {
                layoutParams.setMin |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.toFloatRange.setMax(view, -view.getWidth(), view.getTop());
                } else {
                    this.IsOverlapping.setMax(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(layoutParams.getMin, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append(gravityToString(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isDrawerOpen(@NonNull View view) {
        if (isDrawerView(view)) {
            return (((LayoutParams) view.getLayoutParams()).setMin & 1) == 1;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerVisible(@NonNull View view) {
        if (isDrawerView(view)) {
            return ((LayoutParams) view.getLayoutParams()).length > 0.0f;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    private boolean getMin() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).setMax) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!isDrawerView(childAt)) {
                    this.setDefaultImpl.add(childAt);
                } else if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.setDefaultImpl.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.setDefaultImpl.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.setDefaultImpl.clear();
        }
    }

    private boolean setMin() {
        return findVisibleDrawer() != null;
    }

    /* access modifiers changed from: package-private */
    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void cancelChildViewTouch() {
        if (!this.ICustomTabsCallback) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.ICustomTabsCallback = true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !setMin()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer != null && getDrawerLockMode(findVisibleDrawer) == 0) {
            closeDrawers();
        }
        return findVisibleDrawer != null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!(savedState.length == 0 || (findDrawerWithGravity = findDrawerWithGravity(savedState.length)) == null)) {
            openDrawer(findDrawerWithGravity);
        }
        if (savedState.setMin != 3) {
            setDrawerLockMode(savedState.setMin, 3);
        }
        if (savedState.setMax != 3) {
            setDrawerLockMode(savedState.setMax, 5);
        }
        if (savedState.getMin != 3) {
            setDrawerLockMode(savedState.getMin, 8388611);
        }
        if (savedState.getMax != 3) {
            setDrawerLockMode(savedState.getMax, 8388613);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = layoutParams.setMin == 1;
            if (layoutParams.setMin != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.length = layoutParams.getMin;
            } else {
                i++;
            }
        }
        savedState.setMin = this.invokeSuspend;
        savedState.setMax = this.valueOf;
        savedState.getMin = this.Grayscale$Algorithm;
        savedState.getMax = this.invoke;
        return savedState;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            ViewCompat.setMin(view, 4);
        } else {
            ViewCompat.setMin(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            ViewCompat.getMin(view, (setOnCancelListener) this.setMin);
        }
    }

    static boolean includeChildForAccessibility(View view) {
        return (ViewCompat.isInside(view) == 4 || ViewCompat.isInside(view) == 2) ? false : true;
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
        int getMax;
        int getMin;
        int length = 0;
        int setMax;
        int setMin;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.length = parcel.readInt();
            this.setMin = parcel.readInt();
            this.setMax = parcel.readInt();
            this.getMin = parcel.readInt();
            this.getMax = parcel.readInt();
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.length);
            parcel.writeInt(this.setMin);
            parcel.writeInt(this.setMax);
            parcel.writeInt(this.getMin);
            parcel.writeInt(this.getMax);
        }
    }

    class length extends onCreateDialog.setMin {
        final int getMin;
        onCreateDialog setMax;
        final Runnable setMin = new Runnable() {
            public final void run() {
                View view;
                int i;
                length length = length.this;
                int i2 = length.setMax.getMin;
                int i3 = 0;
                boolean z = length.getMin == 3;
                if (z) {
                    view = DrawerLayout.this.findDrawerWithGravity(3);
                    if (view != null) {
                        i3 = -view.getWidth();
                    }
                    i = i3 + i2;
                } else {
                    view = DrawerLayout.this.findDrawerWithGravity(5);
                    i = DrawerLayout.this.getWidth() - i2;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                    length.setMax.setMax(view, i, view.getTop());
                    ((LayoutParams) view.getLayoutParams()).setMax = true;
                    DrawerLayout.this.invalidate();
                    length.setMin();
                    DrawerLayout.this.cancelChildViewTouch();
                }
            }
        };

        public final boolean onEdgeLock(int i) {
            return false;
        }

        length(int i) {
            this.getMin = i;
        }

        public final boolean tryCaptureView(View view, int i) {
            return DrawerLayout.this.isDrawerView(view) && DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.getMin) && DrawerLayout.this.getDrawerLockMode(view) == 0;
        }

        public final void onViewDragStateChanged(int i) {
            DrawerLayout.this.updateDrawerState(this.getMin, i, this.setMax.toIntRange);
        }

        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.setDrawerViewOffset(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public final void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).setMax = false;
            setMin();
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            int i = 3;
            if (this.getMin == 3) {
                i = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        public final void onViewReleased(View view, float f, float f2) {
            int i;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.setMax.getMax(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public final void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.setMin, 160);
        }

        public final void onEdgeDragStarted(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                view = DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (view != null && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                this.setMax.getMin(view, i2);
            }
        }

        public final int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int getMin = 0;
        float length;
        boolean setMax;
        int setMin;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.getMin = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super(layoutParams);
            this.getMin = layoutParams.getMin;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    class getMax extends setOnCancelListener {
        private final Rect length = new Rect();

        getMax() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
            } else {
                onSupportActionModeFinished min = onSupportActionModeFinished.setMin(onsupportactionmodefinished);
                super.onInitializeAccessibilityNodeInfo(view, min);
                onsupportactionmodefinished.setMax(view);
                ViewParent intRange = ViewCompat.toIntRange(view);
                if (intRange instanceof View) {
                    onsupportactionmodefinished.setMin((View) intRange);
                }
                Rect rect = this.length;
                min.getMax(rect);
                onsupportactionmodefinished.setMin(rect);
                min.getMin(rect);
                onsupportactionmodefinished.setMax(rect);
                onsupportactionmodefinished.getMax(min.equals());
                onsupportactionmodefinished.setMin(min.Grayscale$Algorithm());
                onsupportactionmodefinished.getMax(min.onNavigationEvent());
                onsupportactionmodefinished.length(min.create());
                onsupportactionmodefinished.isInside(min.valueOf());
                onsupportactionmodefinished.equals(min.values());
                onsupportactionmodefinished.getMin(min.isInside());
                onsupportactionmodefinished.setMin(min.toFloatRange());
                onsupportactionmodefinished.toIntRange(min.FastBitmap$CoordinateSystem());
                onsupportactionmodefinished.IsOverlapping(min.toDoubleRange());
                onsupportactionmodefinished.toFloatRange(min.invoke());
                onsupportactionmodefinished.setMin(min.setMax());
                min.ICustomTabsCallback();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.includeChildForAccessibility(childAt)) {
                        onsupportactionmodefinished.length(childAt);
                    }
                }
            }
            onsupportactionmodefinished.getMax((CharSequence) DrawerLayout.class.getName());
            onsupportactionmodefinished.getMin(false);
            onsupportactionmodefinished.setMin(false);
            onsupportactionmodefinished.setMax(onSupportActionModeFinished.setMax.setMax);
            onsupportactionmodefinished.setMax(onSupportActionModeFinished.setMax.setMin);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence drawerTitle;
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer == null || (drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer))) == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class setMax extends setOnCancelListener {
        setMax() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, onSupportActionModeFinished onsupportactionmodefinished) {
            super.onInitializeAccessibilityNodeInfo(view, onsupportactionmodefinished);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                onsupportactionmodefinished.setMin((View) null);
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (!length) {
            this.extraCallback = length();
            this.onMessageChannelReady = setMax();
        }
    }
}
