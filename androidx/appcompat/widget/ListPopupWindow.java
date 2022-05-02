package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import o.ITrustedWebActivityCallback;
import o.dispatchKeyEvent;
import o.onRepeatModeChanged;
import o.setVolumeTo;

public class ListPopupWindow implements onRepeatModeChanged {
    private static Method equals;
    private static Method getMax;
    private static Method setMax;
    private int FastBitmap$CoordinateSystem;
    private boolean Grayscale$Algorithm;
    private int ICustomTabsCallback;
    private Rect ICustomTabsCallback$Default;
    private final setMin ICustomTabsCallback$Stub;
    public PopupWindow IsOverlapping;
    private boolean Mean$Arithmetic;
    private Runnable asBinder;
    private boolean asInterface;
    private boolean b;
    private DataSetObserver create;
    private final getMin extraCallback;
    private final length extraCallbackWithResult;
    private View getCause;
    final setMax getMin;
    private int hashCode;
    private boolean invoke;
    private int invokeSuspend;
    private ListAdapter isInside;
    setVolumeTo length;
    private AdapterView.OnItemSelectedListener onMessageChannelReady;
    private View onNavigationEvent;
    private Drawable onPostMessage;
    private AdapterView.OnItemClickListener onRelationshipValidationResult;
    private final Rect onTransact;
    int setMin;
    private int toDoubleRange;
    final Handler toFloatRange;
    private Context toIntRange;
    private int toString;
    private boolean valueOf;
    private int values;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                setMax = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                equals = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                getMax = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(@NonNull Context context) {
        this(context, (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.asInterface);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.asInterface);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.hashCode = -2;
        this.toString = -2;
        this.FastBitmap$CoordinateSystem = 1002;
        this.invokeSuspend = 0;
        this.Grayscale$Algorithm = false;
        this.b = false;
        this.setMin = Integer.MAX_VALUE;
        this.ICustomTabsCallback = 0;
        this.getMin = new setMax();
        this.extraCallback = new getMin();
        this.extraCallbackWithResult = new length();
        this.ICustomTabsCallback$Stub = new setMin();
        this.onTransact = new Rect();
        this.toIntRange = context;
        this.toFloatRange = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.getPackageName, i, i2);
        this.toDoubleRange = obtainStyledAttributes.getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.toIntRange.getVolumeAttributes, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(ITrustedWebActivityCallback.Stub.toIntRange.getTag, 0);
        this.values = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.Mean$Arithmetic = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.IsOverlapping = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public void setMax(@Nullable ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.create;
        if (dataSetObserver == null) {
            this.create = new getMax();
        } else {
            ListAdapter listAdapter2 = this.isInside;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.isInside = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.create);
        }
        setVolumeTo setvolumeto = this.length;
        if (setvolumeto != null) {
            setvolumeto.setAdapter(this.isInside);
        }
    }

    public void setMin(int i) {
        this.ICustomTabsCallback = i;
    }

    public void setMin(boolean z) {
        this.asInterface = z;
        this.IsOverlapping.setFocusable(z);
    }

    public boolean equals() {
        return this.asInterface;
    }

    @Nullable
    public Drawable getMax() {
        return this.IsOverlapping.getBackground();
    }

    public void setMin(@Nullable Drawable drawable) {
        this.IsOverlapping.setBackgroundDrawable(drawable);
    }

    public void getMax(@StyleRes int i) {
        this.IsOverlapping.setAnimationStyle(i);
    }

    @Nullable
    public View isInside() {
        return this.getCause;
    }

    public void setMax(@Nullable View view) {
        this.getCause = view;
    }

    public int IsOverlapping() {
        return this.toDoubleRange;
    }

    public void getMin(int i) {
        this.toDoubleRange = i;
    }

    public int setMax() {
        if (!this.Mean$Arithmetic) {
            return 0;
        }
        return this.values;
    }

    public void setMax(int i) {
        this.values = i;
        this.Mean$Arithmetic = true;
    }

    public void length(@Nullable Rect rect) {
        this.ICustomTabsCallback$Default = rect != null ? new Rect(rect) : null;
    }

    public void toFloatRange(int i) {
        this.invokeSuspend = i;
    }

    public int toDoubleRange() {
        return this.toString;
    }

    public void IsOverlapping(int i) {
        this.toString = i;
    }

    public void equals(int i) {
        Drawable background = this.IsOverlapping.getBackground();
        if (background != null) {
            background.getPadding(this.onTransact);
            this.toString = this.onTransact.left + this.onTransact.right + i;
            return;
        }
        IsOverlapping(i);
    }

    public void setMax(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
        this.onRelationshipValidationResult = onItemClickListener;
    }

    public void b_() {
        int floatRange = toFloatRange();
        boolean values2 = values();
        dispatchKeyEvent.getMin(this.IsOverlapping, this.FastBitmap$CoordinateSystem);
        boolean z = true;
        if (!this.IsOverlapping.isShowing()) {
            int i = this.toString;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = isInside().getWidth();
            }
            int i2 = this.hashCode;
            if (i2 == -1) {
                floatRange = -1;
            } else if (i2 != -2) {
                floatRange = i2;
            }
            this.IsOverlapping.setWidth(i);
            this.IsOverlapping.setHeight(floatRange);
            setMax(true);
            this.IsOverlapping.setOutsideTouchable(!this.b && !this.Grayscale$Algorithm);
            this.IsOverlapping.setTouchInterceptor(this.extraCallback);
            if (this.invoke) {
                dispatchKeyEvent.setMax(this.IsOverlapping, this.valueOf);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = equals;
                if (method != null) {
                    try {
                        method.invoke(this.IsOverlapping, new Object[]{this.ICustomTabsCallback$Default});
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.IsOverlapping.setEpicenterBounds(this.ICustomTabsCallback$Default);
            }
            dispatchKeyEvent.setMin(this.IsOverlapping, isInside(), this.toDoubleRange, this.values, this.invokeSuspend);
            this.length.setSelection(-1);
            if (!this.asInterface || this.length.isInTouchMode()) {
                FastBitmap$CoordinateSystem();
            }
            if (!this.asInterface) {
                this.toFloatRange.post(this.ICustomTabsCallback$Stub);
            }
        } else if (ViewCompat.ICustomTabsService(isInside())) {
            int i3 = this.toString;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = isInside().getWidth();
            }
            int i4 = this.hashCode;
            if (i4 == -1) {
                if (!values2) {
                    floatRange = -1;
                }
                if (values2) {
                    this.IsOverlapping.setWidth(this.toString == -1 ? -1 : 0);
                    this.IsOverlapping.setHeight(0);
                } else {
                    this.IsOverlapping.setWidth(this.toString == -1 ? -1 : 0);
                    this.IsOverlapping.setHeight(-1);
                }
            } else if (i4 != -2) {
                floatRange = i4;
            }
            PopupWindow popupWindow = this.IsOverlapping;
            if (this.b || this.Grayscale$Algorithm) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.IsOverlapping.update(isInside(), this.toDoubleRange, this.values, i3 < 0 ? -1 : i3, floatRange < 0 ? -1 : floatRange);
        }
    }

    public void length() {
        this.IsOverlapping.dismiss();
        toIntRange();
        this.IsOverlapping.setContentView((View) null);
        this.length = null;
        this.toFloatRange.removeCallbacks(this.getMin);
    }

    public void length(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.IsOverlapping.setOnDismissListener(onDismissListener);
    }

    private void toIntRange() {
        View view = this.onNavigationEvent;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.onNavigationEvent);
            }
        }
    }

    public void isInside(int i) {
        this.IsOverlapping.setInputMethodMode(i);
    }

    public void toIntRange(int i) {
        setVolumeTo setvolumeto = this.length;
        if (getMin() && setvolumeto != null) {
            setvolumeto.setListSelectionHidden(false);
            setvolumeto.setSelection(i);
            if (setvolumeto.getChoiceMode() != 0) {
                setvolumeto.setItemChecked(i, true);
            }
        }
    }

    public void FastBitmap$CoordinateSystem() {
        setVolumeTo setvolumeto = this.length;
        if (setvolumeto != null) {
            setvolumeto.setListSelectionHidden(true);
            setvolumeto.requestLayout();
        }
    }

    public boolean getMin() {
        return this.IsOverlapping.isShowing();
    }

    public boolean values() {
        return this.IsOverlapping.getInputMethodMode() == 2;
    }

    @Nullable
    public Object Grayscale$Algorithm() {
        if (!getMin()) {
            return null;
        }
        return this.length.getSelectedItem();
    }

    public int invokeSuspend() {
        if (!getMin()) {
            return -1;
        }
        return this.length.getSelectedItemPosition();
    }

    public long valueOf() {
        if (!getMin()) {
            return Long.MIN_VALUE;
        }
        return this.length.getSelectedItemId();
    }

    @Nullable
    public View invoke() {
        if (!getMin()) {
            return null;
        }
        return this.length.getSelectedView();
    }

    @Nullable
    public ListView c_() {
        return this.length;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public setVolumeTo setMin(Context context, boolean z) {
        return new setVolumeTo(context, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: o.setVolumeTo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: o.setVolumeTo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: o.setVolumeTo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int toFloatRange() {
        /*
            r12 = this;
            o.setVolumeTo r0 = r12.length
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00a7
            android.content.Context r0 = r12.toIntRange
            androidx.appcompat.widget.ListPopupWindow$1 r5 = new androidx.appcompat.widget.ListPopupWindow$1
            r5.<init>()
            r12.asBinder = r5
            boolean r5 = r12.asInterface
            r5 = r5 ^ r3
            o.setVolumeTo r5 = r12.setMin(r0, r5)
            r12.length = r5
            android.graphics.drawable.Drawable r6 = r12.onPostMessage
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            o.setVolumeTo r5 = r12.length
            android.widget.ListAdapter r6 = r12.isInside
            r5.setAdapter(r6)
            o.setVolumeTo r5 = r12.length
            android.widget.AdapterView$OnItemClickListener r6 = r12.onRelationshipValidationResult
            r5.setOnItemClickListener(r6)
            o.setVolumeTo r5 = r12.length
            r5.setFocusable(r3)
            o.setVolumeTo r5 = r12.length
            r5.setFocusableInTouchMode(r3)
            o.setVolumeTo r5 = r12.length
            androidx.appcompat.widget.ListPopupWindow$5 r6 = new androidx.appcompat.widget.ListPopupWindow$5
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            o.setVolumeTo r5 = r12.length
            androidx.appcompat.widget.ListPopupWindow$length r6 = r12.extraCallbackWithResult
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.onMessageChannelReady
            if (r5 == 0) goto L_0x0054
            o.setVolumeTo r6 = r12.length
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            o.setVolumeTo r5 = r12.length
            android.view.View r6 = r12.onNavigationEvent
            if (r6 == 0) goto L_0x00a0
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.ICustomTabsCallback
            if (r8 == 0) goto L_0x0077
            if (r8 == r3) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x007d
        L_0x0077:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x007d:
            int r0 = r12.toString
            if (r0 < 0) goto L_0x0084
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0086
        L_0x0084:
            r0 = 0
            r5 = 0
        L_0x0086:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            android.widget.PopupWindow r6 = r12.IsOverlapping
            r6.setContentView(r5)
            goto L_0x00c2
        L_0x00a7:
            android.widget.PopupWindow r0 = r12.IsOverlapping
            r0.getContentView()
            android.view.View r0 = r12.onNavigationEvent
            if (r0 == 0) goto L_0x00c1
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            android.widget.PopupWindow r5 = r12.IsOverlapping
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00e4
            android.graphics.Rect r6 = r12.onTransact
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.onTransact
            int r5 = r5.top
            android.graphics.Rect r6 = r12.onTransact
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r12.Mean$Arithmetic
            if (r6 != 0) goto L_0x00ea
            android.graphics.Rect r6 = r12.onTransact
            int r6 = r6.top
            int r6 = -r6
            r12.values = r6
            goto L_0x00ea
        L_0x00e4:
            android.graphics.Rect r5 = r12.onTransact
            r5.setEmpty()
            r5 = 0
        L_0x00ea:
            android.widget.PopupWindow r6 = r12.IsOverlapping
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r3 = 0
        L_0x00f5:
            android.view.View r4 = r12.isInside()
            int r6 = r12.values
            int r3 = r12.getMax(r4, r6, r3)
            boolean r4 = r12.Grayscale$Algorithm
            if (r4 != 0) goto L_0x016a
            int r4 = r12.hashCode
            if (r4 != r2) goto L_0x0108
            goto L_0x016a
        L_0x0108:
            int r4 = r12.toString
            r6 = -2
            if (r4 == r6) goto L_0x0131
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0116
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x014b
        L_0x0116:
            android.content.Context r2 = r12.toIntRange
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.onTransact
            int r4 = r4.left
            android.graphics.Rect r6 = r12.onTransact
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x014b
        L_0x0131:
            android.content.Context r2 = r12.toIntRange
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.onTransact
            int r4 = r4.left
            android.graphics.Rect r6 = r12.onTransact
            int r6 = r6.right
            int r4 = r4 + r6
            int r2 = r2 - r4
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x014b:
            r7 = r1
            o.setVolumeTo r6 = r12.length
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.measureHeightOfChildrenCompat(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0168
            o.setVolumeTo r2 = r12.length
            int r2 = r2.getPaddingTop()
            o.setVolumeTo r3 = r12.length
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0168:
            int r1 = r1 + r0
            return r1
        L_0x016a:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.toFloatRange():int");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMin(boolean z) {
        this.invoke = true;
        this.valueOf = z;
    }

    class getMax extends DataSetObserver {
        getMax() {
        }

        public final void onChanged() {
            if (ListPopupWindow.this.getMin()) {
                ListPopupWindow.this.b_();
            }
        }

        public final void onInvalidated() {
            ListPopupWindow.this.length();
        }
    }

    class setMin implements Runnable {
        setMin() {
        }

        public final void run() {
            ListPopupWindow.this.FastBitmap$CoordinateSystem();
        }
    }

    class setMax implements Runnable {
        setMax() {
        }

        public final void run() {
            if (ListPopupWindow.this.length != null && ViewCompat.ICustomTabsService(ListPopupWindow.this.length) && ListPopupWindow.this.length.getCount() > ListPopupWindow.this.length.getChildCount() && ListPopupWindow.this.length.getChildCount() <= ListPopupWindow.this.setMin) {
                ListPopupWindow.this.IsOverlapping.setInputMethodMode(2);
                ListPopupWindow.this.b_();
            }
        }
    }

    class getMin implements View.OnTouchListener {
        getMin() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.IsOverlapping != null && ListPopupWindow.this.IsOverlapping.isShowing() && x >= 0 && x < ListPopupWindow.this.IsOverlapping.getWidth() && y >= 0 && y < ListPopupWindow.this.IsOverlapping.getHeight()) {
                ListPopupWindow.this.toFloatRange.postDelayed(ListPopupWindow.this.getMin, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow.this.toFloatRange.removeCallbacks(ListPopupWindow.this.getMin);
                return false;
            }
        }
    }

    class length implements AbsListView.OnScrollListener {
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        length() {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.values() && ListPopupWindow.this.IsOverlapping.getContentView() != null) {
                ListPopupWindow.this.toFloatRange.removeCallbacks(ListPopupWindow.this.getMin);
                ListPopupWindow.this.getMin.run();
            }
        }
    }

    private void setMax(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = setMax;
            if (method != null) {
                try {
                    method.invoke(this.IsOverlapping, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.IsOverlapping.setIsClippedToScreen(z);
        }
    }

    private int getMax(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.IsOverlapping.getMaxAvailableHeight(view, i, z);
        }
        Method method = getMax;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.IsOverlapping, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.IsOverlapping.getMaxAvailableHeight(view, i);
    }
}
