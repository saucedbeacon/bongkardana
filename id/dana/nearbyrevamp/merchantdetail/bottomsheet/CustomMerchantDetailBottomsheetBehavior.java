package id.dana.nearbyrevamp.merchantdetail.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import id.dana.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onCreateDialog;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

public class CustomMerchantDetailBottomsheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    static final /* synthetic */ boolean setMax = (!CustomMerchantDetailBottomsheetBehavior.class.desiredAssertionStatus());
    private float FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public int Grayscale$Algorithm;
    private int ICustomTabsCallback = 5;
    /* access modifiers changed from: private */
    public boolean IsOverlapping;
    private boolean Mean$Arithmetic;
    /* access modifiers changed from: private */
    public boolean b;
    private int create;
    private int equals;
    /* access modifiers changed from: private */
    public onCreateDialog extraCallback;
    /* access modifiers changed from: private */
    public boolean extraCallbackWithResult;
    private boolean getCause;
    /* access modifiers changed from: private */
    public boolean getMax = true;
    private View getMin;
    private int hashCode;
    /* access modifiers changed from: private */
    public int invoke;
    /* access modifiers changed from: private */
    public int invokeSuspend;
    private int isInside;
    /* access modifiers changed from: private */
    public int length;
    private VelocityTracker onMessageChannelReady;
    /* access modifiers changed from: private */
    public int onNavigationEvent = 5;
    private final onCreateDialog.setMin onPostMessage = new onCreateDialog.setMin() {
        public final void onViewDragStateChanged(int i) {
            if (i == 1 && CustomMerchantDetailBottomsheetBehavior.this.getMax) {
                CustomMerchantDetailBottomsheetBehavior.this.setMax(1);
            }
        }

        public final void onViewReleased(@NotNull View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 3;
            if (f2 < 0.0f) {
                i = CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend;
            } else if (!CustomMerchantDetailBottomsheetBehavior.this.IsOverlapping || !CustomMerchantDetailBottomsheetBehavior.this.setMin(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend) < Math.abs(top - CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange)) {
                        i = CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend;
                    } else {
                        i2 = CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange;
                    }
                } else {
                    i2 = CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange;
                }
                i = i2;
                i3 = 4;
            } else {
                i = CustomMerchantDetailBottomsheetBehavior.this.Grayscale$Algorithm;
                i3 = 5;
            }
            if (CustomMerchantDetailBottomsheetBehavior.this.extraCallback.getMax(view.getLeft(), i)) {
                CustomMerchantDetailBottomsheetBehavior.this.setMax(2);
                ViewCompat.getMax(view, (Runnable) new setMax(view, i3));
                return;
            }
            CustomMerchantDetailBottomsheetBehavior.this.setMax(i3);
        }

        public final int getViewVerticalDragRange(@NotNull View view) {
            int length;
            int min;
            if (CustomMerchantDetailBottomsheetBehavior.this.IsOverlapping) {
                length = CustomMerchantDetailBottomsheetBehavior.this.Grayscale$Algorithm;
                min = CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend;
            } else {
                length = CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange;
                min = CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend;
            }
            return length - min;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
            r6 = (android.view.View) id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.equals(r4.getMin).get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean tryCaptureView(@org.jetbrains.annotations.NotNull android.view.View r5, int r6) {
            /*
                r4 = this;
                id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior r0 = id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.this
                int r0 = r0.onNavigationEvent
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x000b
                return r2
            L_0x000b:
                id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior r0 = id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.this
                boolean r0 = r0.extraCallbackWithResult
                if (r0 == 0) goto L_0x0014
                return r2
            L_0x0014:
                id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior r0 = id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.this
                int r0 = r0.onNavigationEvent
                r3 = 3
                if (r0 != r3) goto L_0x003b
                id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior r0 = id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.this
                int r0 = r0.length
                if (r0 != r6) goto L_0x003b
                id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior r6 = id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.this
                java.lang.ref.WeakReference r6 = r6.valueOf
                java.lang.Object r6 = r6.get()
                android.view.View r6 = (android.view.View) r6
                if (r6 == 0) goto L_0x003b
                r0 = -1
                boolean r6 = r6.canScrollVertically(r0)
                if (r6 == 0) goto L_0x003b
                return r2
            L_0x003b:
                id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior r6 = id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.this
                java.lang.ref.WeakReference r6 = r6.onRelationshipValidationResult
                if (r6 == 0) goto L_0x0050
                id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior r6 = id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.this
                java.lang.ref.WeakReference r6 = r6.onRelationshipValidationResult
                java.lang.Object r6 = r6.get()
                if (r6 != r5) goto L_0x0050
                return r1
            L_0x0050:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.AnonymousClass2.tryCaptureView(android.view.View, int):boolean");
        }

        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        public final int clampViewPositionVertical(@NotNull View view, int i, int i2) {
            int min = CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend;
            int max = CustomMerchantDetailBottomsheetBehavior.this.IsOverlapping ? CustomMerchantDetailBottomsheetBehavior.this.Grayscale$Algorithm : CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange;
            if (i < min) {
                return min;
            }
            return i > max ? max : i;
        }

        public final void onViewPositionChanged(@NotNull View view, int i, int i2, int i3, int i4) {
            float f;
            if (CustomMerchantDetailBottomsheetBehavior.this.onRelationshipValidationResult.get() != null) {
                View view2 = (View) CustomMerchantDetailBottomsheetBehavior.this.onRelationshipValidationResult.get();
                if (i2 > CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange || CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange == CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend) {
                    f = (((float) (CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange - i2)) / ((float) CustomMerchantDetailBottomsheetBehavior.this.Grayscale$Algorithm)) - ((float) CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange);
                } else {
                    f = ((float) (CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange - i2)) / ((float) (CustomMerchantDetailBottomsheetBehavior.this.toDoubleRange - CustomMerchantDetailBottomsheetBehavior.this.invokeSuspend));
                }
                CustomMerchantDetailBottomsheetBehavior.this.getMin(i2, f);
                CustomMerchantDetailBottomsheetBehavior.this.setMax(view2);
            }
        }
    };
    /* access modifiers changed from: private */
    public WeakReference<V> onRelationshipValidationResult;
    private List<Object> setMin = new ArrayList();
    /* access modifiers changed from: private */
    public int toDoubleRange;
    private int toFloatRange;
    private boolean toIntRange;
    private int toString;
    /* access modifiers changed from: private */
    public WeakReference<View> valueOf;
    private boolean values;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public CustomMerchantDetailBottomsheetBehavior() {
    }

    public CustomMerchantDetailBottomsheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.areNotificationsEnabled);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            length(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            length(peekValue.data);
        }
        this.IsOverlapping = obtainStyledAttributes.getBoolean(1, false);
        this.b = obtainStyledAttributes.getBoolean(3, false);
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(0);
        if (peekValue2 == null || peekValue2.data != -1) {
            setMin(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        } else {
            setMin(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.FastBitmap$CoordinateSystem = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, V v, @NotNull MotionEvent motionEvent) {
        onCreateDialog oncreatedialog;
        if (!v.isShown() || !this.getMax) {
            this.values = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.length = -1;
            VelocityTracker velocityTracker = this.onMessageChannelReady;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.onMessageChannelReady = null;
            }
        }
        if (this.onMessageChannelReady == null) {
            this.onMessageChannelReady = VelocityTracker.obtain();
        }
        this.onMessageChannelReady.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.onMessageChannelReady.clear();
            int x = (int) motionEvent.getX();
            this.hashCode = (int) motionEvent.getY();
            if (this.onNavigationEvent == 6) {
                this.length = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.extraCallbackWithResult = true;
            } else {
                View view = this.valueOf.get();
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.hashCode)) {
                    this.length = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.extraCallbackWithResult = true;
                }
            }
            this.values = this.length == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.hashCode);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.extraCallbackWithResult = false;
            this.length = -1;
            if (this.values) {
                this.values = false;
                return false;
            }
        }
        if (!this.values && (oncreatedialog = this.extraCallback) != null && oncreatedialog.setMax(motionEvent)) {
            return true;
        }
        View view2 = this.valueOf.get();
        return this.extraCallback != null && actionMasked == 2 && view2 != null && !this.values && this.onNavigationEvent != 1 && !coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.hashCode) - motionEvent.getY()) > ((float) this.extraCallback.length);
    }

    public boolean onTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, V v, @NotNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.onNavigationEvent == 1 && actionMasked == 0) {
            return true;
        }
        onCreateDialog oncreatedialog = this.extraCallback;
        if (oncreatedialog != null) {
            oncreatedialog.getMin(motionEvent);
        }
        if (actionMasked == 0) {
            this.length = -1;
            VelocityTracker velocityTracker = this.onMessageChannelReady;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.onMessageChannelReady = null;
            }
        }
        if (this.onMessageChannelReady == null) {
            this.onMessageChannelReady = VelocityTracker.obtain();
        }
        this.onMessageChannelReady.addMovement(motionEvent);
        if (length(actionMasked, motionEvent)) {
            this.extraCallback.getMin((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.values) {
            return true;
        }
        return false;
    }

    private boolean length(int i, MotionEvent motionEvent) {
        return this.extraCallback != null && i == 2 && !this.values && Math.abs(((float) this.hashCode) - motionEvent.getY()) > ((float) this.extraCallback.length);
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.toString = 0;
        this.Mean$Arithmetic = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r5.ICustomTabsCallback != 4) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (java.lang.Math.abs(r6 - r5.invokeSuspend) < java.lang.Math.abs(r6 - r5.toDoubleRange)) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r6 > r5.isInside) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r6, @androidx.annotation.NonNull V r7, @androidx.annotation.NonNull android.view.View r8, int r9) {
        /*
            r5 = this;
            int r6 = r7.getTop()
            int r9 = r5.invokeSuspend
            r0 = 3
            if (r6 != r9) goto L_0x000d
            r5.setMax((int) r0)
            return
        L_0x000d:
            java.lang.ref.WeakReference<android.view.View> r6 = r5.valueOf
            if (r6 == 0) goto L_0x00d4
            java.lang.Object r6 = r6.get()
            if (r8 != r6) goto L_0x00d4
            boolean r6 = r5.Mean$Arithmetic
            if (r6 != 0) goto L_0x001d
            goto L_0x00d4
        L_0x001d:
            int r6 = r7.getTop()
            int r8 = r5.toString
            android.view.VelocityTracker r9 = r5.onMessageChannelReady
            float r1 = r5.FastBitmap$CoordinateSystem
            r2 = 1000(0x3e8, float:1.401E-42)
            r9.computeCurrentVelocity(r2, r1)
            android.view.VelocityTracker r9 = r5.onMessageChannelReady
            int r1 = r5.length
            float r9 = r9.getYVelocity(r1)
            r1 = 4
            if (r8 <= 0) goto L_0x0042
            int r8 = r5.isInside
            if (r6 > r8) goto L_0x0070
            int r8 = r5.ICustomTabsCallback
            if (r8 == r1) goto L_0x0070
            int r8 = r5.invokeSuspend
            goto L_0x0072
        L_0x0042:
            boolean r3 = r5.IsOverlapping
            if (r3 == 0) goto L_0x004f
            boolean r9 = r5.setMin(r7, r9)
            if (r9 == 0) goto L_0x004f
            int r8 = r5.Grayscale$Algorithm
            goto L_0x0072
        L_0x004f:
            if (r8 != 0) goto L_0x0069
            int r8 = r5.invokeSuspend
            int r8 = r6 - r8
            int r8 = java.lang.Math.abs(r8)
            int r9 = r5.toDoubleRange
            int r9 = r6 - r9
            int r9 = java.lang.Math.abs(r9)
            if (r8 >= r9) goto L_0x0066
            int r8 = r5.invokeSuspend
            goto L_0x0072
        L_0x0066:
            int r8 = r5.toDoubleRange
            goto L_0x0072
        L_0x0069:
            int r8 = r5.isInside
            if (r6 <= r8) goto L_0x0070
            int r8 = r5.toDoubleRange
            goto L_0x0072
        L_0x0070:
            int r8 = r5.isInside
        L_0x0072:
            int r9 = r5.toString
            android.view.VelocityTracker r3 = r5.onMessageChannelReady
            float r4 = r5.FastBitmap$CoordinateSystem
            r3.computeCurrentVelocity(r2, r4)
            android.view.VelocityTracker r2 = r5.onMessageChannelReady
            int r3 = r5.length
            float r2 = r2.getYVelocity(r3)
            if (r9 <= 0) goto L_0x008e
            int r9 = r5.isInside
            if (r6 > r9) goto L_0x00b4
            int r6 = r5.ICustomTabsCallback
            if (r6 == r1) goto L_0x00b4
            goto L_0x00b5
        L_0x008e:
            boolean r3 = r5.IsOverlapping
            if (r3 == 0) goto L_0x009a
            boolean r2 = r5.setMin(r7, r2)
            if (r2 == 0) goto L_0x009a
            r0 = 5
            goto L_0x00b5
        L_0x009a:
            if (r9 != 0) goto L_0x00ae
            int r9 = r5.invokeSuspend
            int r9 = r6 - r9
            int r9 = java.lang.Math.abs(r9)
            int r2 = r5.toDoubleRange
            int r6 = r6 - r2
            int r6 = java.lang.Math.abs(r6)
            if (r9 >= r6) goto L_0x00b2
            goto L_0x00b5
        L_0x00ae:
            int r9 = r5.isInside
            if (r6 <= r9) goto L_0x00b4
        L_0x00b2:
            r0 = 4
            goto L_0x00b5
        L_0x00b4:
            r0 = 6
        L_0x00b5:
            o.onCreateDialog r6 = r5.extraCallback
            int r9 = r7.getLeft()
            boolean r6 = r6.setMax((android.view.View) r7, (int) r9, (int) r8)
            if (r6 == 0) goto L_0x00ce
            r6 = 2
            r5.setMax((int) r6)
            id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior$setMax r6 = new id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior$setMax
            r6.<init>(r7, r0)
            androidx.core.view.ViewCompat.getMax((android.view.View) r7, (java.lang.Runnable) r6)
            goto L_0x00d1
        L_0x00ce:
            r5.setMax((int) r0)
        L_0x00d1:
            r6 = 0
            r5.Mean$Arithmetic = r6
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        float f;
        int i4;
        if (i3 != 1 && this.getMax && view == this.valueOf.get()) {
            int top = v.getTop();
            int i5 = top - i2;
            if (i2 > 0) {
                int i6 = this.invokeSuspend;
                if (i5 >= i6) {
                    iArr[1] = i2;
                    ViewCompat.equals(v, -i2);
                    setMax(1);
                } else if (this.ICustomTabsCallback == 4) {
                    ViewCompat.equals(v, this.isInside);
                    setMax(6);
                } else {
                    iArr[1] = top - i6;
                    ViewCompat.equals(v, -iArr[1]);
                    setMax(3);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i7 = this.toDoubleRange;
                if (i5 <= i7 || this.IsOverlapping) {
                    iArr[1] = i2;
                    ViewCompat.equals(v, -i2);
                    setMax(1);
                } else {
                    iArr[1] = top - i7;
                    ViewCompat.equals(v, -iArr[1]);
                    setMax(4);
                }
            }
            int top2 = v.getTop();
            int max = dispatchOnCancelled.setMax(top2);
            if (top2 != max) {
                onCanceled oncanceled = new onCanceled(top2, max, 1);
                onCancelLoad.setMax(-2107153088, oncanceled);
                onCancelLoad.getMin(-2107153088, oncanceled);
            }
            if (this.onRelationshipValidationResult.get() != null) {
                View view2 = (View) this.onRelationshipValidationResult.get();
                int i8 = this.toDoubleRange;
                if (top2 > i8 || i8 == (i4 = this.invokeSuspend)) {
                    int i9 = this.toDoubleRange;
                    f = (((float) (i9 - top2)) / ((float) this.Grayscale$Algorithm)) - ((float) i9);
                } else {
                    f = ((float) (i8 - top2)) / ((float) (i8 - i4));
                }
                getMin(top2, f);
                setMax(view2);
            }
            this.toString = i2;
            this.Mean$Arithmetic = true;
        }
    }

    public boolean onNestedPreFling(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v, @NotNull View view, float f, float f2) {
        if (view == this.valueOf.get()) {
            return this.onNavigationEvent != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    public void onRestoreInstanceState(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v, @NotNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (setMax || savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
            this.onNavigationEvent = 5;
            return;
        }
        throw new AssertionError();
    }

    public Parcelable onSaveInstanceState(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (CustomMerchantDetailBottomsheetBehavior<?>) this);
    }

    /* access modifiers changed from: private */
    public void setMax(View view) {
        List<Object> list;
        if (view != null && (list = this.setMin) != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: private */
    public void getMin(int i, float f) {
        View view = this.getMin;
        if (view != null) {
            int height = view.getHeight();
            if (f <= 0.0f) {
                this.getMin.setVisibility(8);
                return;
            }
            float f2 = this.getMin.getY() < 0.0f ? (float) i : (float) this.isInside;
            float f3 = f2 - ((float) height);
            int i2 = this.toDoubleRange;
            this.getMin.setVisibility(0);
            this.getMin.setY(f3 + ((((float) i2) - f3) * ((((float) i) - f2) / (((float) i2) - f2))));
        }
    }

    /* access modifiers changed from: private */
    public void setMax(int i) {
        List<Object> list;
        int i2;
        if (this.onNavigationEvent != i) {
            this.onNavigationEvent = i;
            if (!(i == 1 || i == 2)) {
                this.ICustomTabsCallback = i;
            }
            if (this.getMin != null && ((i2 = this.onNavigationEvent) == 6 || i2 == 3)) {
                this.getMin.setVisibility(0);
            }
            if (((View) this.onRelationshipValidationResult.get()) != null && (list = this.setMin) != null) {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean setMin(View view, float f) {
        return this.b ? view.getTop() >= this.isInside : view.getTop() >= this.toDoubleRange && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.toDoubleRange)) / ((float) this.invoke) > 0.5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void length(int r4) {
        /*
            r3 = this;
            int r0 = o.dispatchOnCancelled.setMax(r4)
            r1 = 1
            if (r4 == r0) goto L_0x0015
            o.onCanceled r2 = new o.onCanceled
            r2.<init>(r4, r0, r1)
            r0 = -1680177412(0xffffffff9bda86fc, float:-3.6152306E-22)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x0015:
            r0 = -1
            r2 = 0
            if (r4 != r0) goto L_0x0020
            boolean r4 = r3.getCause
            if (r4 != 0) goto L_0x0029
            r3.getCause = r1
            goto L_0x0038
        L_0x0020:
            boolean r0 = r3.getCause
            if (r0 != 0) goto L_0x002b
            int r0 = r3.invoke
            if (r0 == r4) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r1 = 0
            goto L_0x0038
        L_0x002b:
            r3.getCause = r2
            int r0 = java.lang.Math.max(r2, r4)
            r3.invoke = r0
            int r0 = r3.Grayscale$Algorithm
            int r0 = r0 - r4
            r3.toDoubleRange = r0
        L_0x0038:
            if (r1 == 0) goto L_0x004e
            int r4 = r3.onNavigationEvent
            r0 = 4
            if (r4 != r0) goto L_0x004e
            java.lang.ref.WeakReference<V> r4 = r3.onRelationshipValidationResult
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x004e
            r4.requestLayout()
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.length(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMin(int r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.toIntRange
            if (r4 != 0) goto L_0x0024
            r3.toIntRange = r1
            goto L_0x0023
        L_0x000c:
            boolean r2 = r3.toIntRange
            if (r2 != 0) goto L_0x0014
            int r2 = r3.toFloatRange
            if (r2 == r4) goto L_0x0024
        L_0x0014:
            r3.toIntRange = r0
            int r0 = r3.invoke
            int r0 = java.lang.Math.max(r0, r4)
            r3.toFloatRange = r0
            int r0 = r3.Grayscale$Algorithm
            int r0 = r0 - r4
            r3.isInside = r0
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.onNavigationEvent
            r0 = 6
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.onRelationshipValidationResult
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.merchantdetail.bottomsheet.CustomMerchantDetailBottomsheetBehavior.setMin(int):void");
    }

    @VisibleForTesting
    private View length(View view) {
        if (ViewCompat.ICustomTabsCallback$Stub(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View length2 = length(viewGroup.getChildAt(i));
            if (length2 != null) {
                return length2;
            }
        }
        return null;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            @NonNull
            public final /* synthetic */ Object createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @NonNull
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Nullable
            public final /* synthetic */ Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        int getMin;
        boolean length;
        final int setMax;
        boolean setMin;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.setMax = parcel.readInt();
            this.getMin = parcel.readInt();
            boolean z = false;
            this.length = parcel.readInt() == 1;
            this.setMin = parcel.readInt() == 1 ? true : z;
        }

        public SavedState(Parcelable parcelable, CustomMerchantDetailBottomsheetBehavior<?> customMerchantDetailBottomsheetBehavior) {
            super(parcelable);
            this.setMax = customMerchantDetailBottomsheetBehavior.onNavigationEvent;
            this.getMin = customMerchantDetailBottomsheetBehavior.invoke;
            this.length = customMerchantDetailBottomsheetBehavior.IsOverlapping;
            this.setMin = customMerchantDetailBottomsheetBehavior.b;
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.setMax);
            parcel.writeInt(this.getMin);
            parcel.writeInt(this.length ? 1 : 0);
            parcel.writeInt(this.setMin ? 1 : 0);
        }
    }

    class setMax implements Runnable {
        private final View getMax;
        private final int setMax;

        setMax(View view, int i) {
            this.getMax = view;
            this.setMax = i;
        }

        public final void run() {
            if (CustomMerchantDetailBottomsheetBehavior.this.extraCallback == null || !CustomMerchantDetailBottomsheetBehavior.this.extraCallback.getMin()) {
                CustomMerchantDetailBottomsheetBehavior.this.setMax(this.setMax);
            } else {
                ViewCompat.getMax(this.getMax, (Runnable) this);
            }
        }
    }

    public boolean onLayoutChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v, int i) {
        if (ViewCompat.ICustomTabsCallback(coordinatorLayout) && !ViewCompat.ICustomTabsCallback(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.Grayscale$Algorithm = coordinatorLayout.getHeight();
        if (this.getCause) {
            int i2 = this.create;
            if (i2 != 0) {
                i2 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.f32102131165948);
            }
            this.create = i2;
            this.invoke = i2;
        }
        if (this.toIntRange) {
            int i3 = this.equals;
            if (i3 == 0) {
                i3 = this.Grayscale$Algorithm - ((coordinatorLayout.getWidth() * 9) / 16);
            }
            this.equals = i3;
            this.toFloatRange = i3;
        }
        int max = Math.max(0, this.Grayscale$Algorithm - v.getHeight());
        this.invokeSuspend = max;
        int max2 = Math.max(this.Grayscale$Algorithm - this.invoke, max);
        this.toDoubleRange = max2;
        this.isInside = Math.min(this.Grayscale$Algorithm - this.toFloatRange, max2);
        int i4 = this.onNavigationEvent;
        if (i4 == 3) {
            ViewCompat.equals(v, this.invokeSuspend);
        } else if (!this.IsOverlapping || i4 != 5) {
            int i5 = this.onNavigationEvent;
            if (i5 == 4) {
                ViewCompat.equals(v, this.toDoubleRange);
                View view = this.getMin;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else if (i5 == 1 || i5 == 2) {
                ViewCompat.equals(v, top - v.getTop());
            } else if (i5 == 6) {
                ViewCompat.equals(v, this.isInside);
                View view2 = this.getMin;
                if (view2 != null) {
                    view2.setY(0.0f);
                    this.getMin.setVisibility(0);
                }
            }
        } else {
            ViewCompat.equals(v, this.Grayscale$Algorithm);
            View view3 = this.getMin;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        if (this.extraCallback == null) {
            this.extraCallback = onCreateDialog.getMin((ViewGroup) coordinatorLayout, this.onPostMessage);
        }
        this.onRelationshipValidationResult = new WeakReference<>(v);
        this.valueOf = new WeakReference<>(length((View) v));
        return true;
    }
}
