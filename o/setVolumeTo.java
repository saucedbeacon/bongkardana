package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import o.INotificationSideChannel;
import o.ITrustedWebActivityCallback;

public class setVolumeTo extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private invalidateOptionsMenu FastBitmap$CoordinateSystem;
    private Field IsOverlapping;
    private int equals;
    private int getMax = 0;
    private int getMin = 0;
    private boolean hashCode;
    private boolean isInside;
    private final Rect length = new Rect();
    getMax mResolveHoverRunnable;
    private int setMax = 0;
    private int setMin = 0;
    private onKeyDown toDoubleRange;
    private setMin toFloatRange;
    private boolean toIntRange;

    public setVolumeTo(@NonNull Context context, boolean z) {
        super(context, (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.extraCallbackWithResult);
        this.isInside = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.IsOverlapping = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public boolean isInTouchMode() {
        return (this.isInside && this.toIntRange) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.isInside || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.isInside || super.isFocused();
    }

    public boolean hasFocus() {
        return this.isInside || super.hasFocus();
    }

    public void setSelector(Drawable drawable) {
        setMin setmin = drawable != null ? new setMin(drawable) : null;
        this.toFloatRange = setmin;
        super.setSelector(setmin);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.setMax = rect.left;
        this.getMin = rect.top;
        this.getMax = rect.right;
        this.setMin = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.mResolveHoverRunnable == null) {
            super.drawableStateChanged();
            setMin setmin = this.toFloatRange;
            if (setmin != null) {
                setmin.getMax = true;
            }
            length();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.equals = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        getMax getmax = this.mResolveHoverRunnable;
        if (getmax != null) {
            setVolumeTo.this.mResolveHoverRunnable = null;
            setVolumeTo.this.removeCallbacks(getmax);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int lookForSelectablePosition(int i, boolean z) {
        int i2;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    i2 = Math.max(0, i);
                    while (i2 < count && !adapter.isEnabled(i2)) {
                        i2++;
                    }
                } else {
                    int min = Math.min(i, count - 1);
                    while (i2 >= 0 && !adapter.isEnabled(i2)) {
                        min = i2 - 1;
                    }
                }
                if (i2 < 0 || i2 >= count) {
                    return -1;
                }
                return i2;
            } else if (i < 0 || i >= count) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    static class setMin extends INotificationSideChannel.Stub {
        boolean getMax = true;

        setMin(Drawable drawable) {
            super(drawable);
        }

        public final boolean setState(int[] iArr) {
            if (this.getMax) {
                return super.setState(iArr);
            }
            return false;
        }

        public final void draw(Canvas canvas) {
            if (this.getMax) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f2) {
            if (this.getMax) {
                super.setHotspot(f, f2);
            }
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.getMax) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.getMax) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.mResolveHoverRunnable == null) {
            getMax getmax = new getMax();
            this.mResolveHoverRunnable = getmax;
            setVolumeTo.this.post(getmax);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                length();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 != 3) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onForwardedEvent(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L_0x001c
            r5 = 2
            if (r2 == r5) goto L_0x001a
            r5 = 3
            if (r2 == r5) goto L_0x0016
        L_0x0012:
            r3 = 0
            r5 = 1
            goto L_0x0131
        L_0x0016:
            r3 = 0
            r5 = 0
            goto L_0x0131
        L_0x001a:
            r5 = 1
            goto L_0x001d
        L_0x001c:
            r5 = 0
        L_0x001d:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0024
            goto L_0x0016
        L_0x0024:
            float r7 = r1.getX(r6)
            int r7 = (int) r7
            float r6 = r1.getY(r6)
            int r6 = (int) r6
            int r8 = r0.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0037
            goto L_0x0131
        L_0x0037:
            int r5 = r16.getFirstVisiblePosition()
            int r5 = r8 - r5
            android.view.View r5 = r0.getChildAt(r5)
            float r7 = (float) r7
            float r6 = (float) r6
            r0.hashCode = r3
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x004e
            r0.drawableHotspotChanged(r7, r6)
        L_0x004e:
            boolean r10 = r16.isPressed()
            if (r10 != 0) goto L_0x0057
            r0.setPressed(r3)
        L_0x0057:
            r16.layoutChildren()
            int r10 = r0.equals
            if (r10 == r9) goto L_0x0074
            int r12 = r16.getFirstVisiblePosition()
            int r10 = r10 - r12
            android.view.View r10 = r0.getChildAt(r10)
            if (r10 == 0) goto L_0x0074
            if (r10 == r5) goto L_0x0074
            boolean r12 = r10.isPressed()
            if (r12 == 0) goto L_0x0074
            r10.setPressed(r4)
        L_0x0074:
            r0.equals = r8
            int r10 = r5.getLeft()
            float r10 = (float) r10
            float r10 = r7 - r10
            int r12 = r5.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r11) goto L_0x008b
            r5.drawableHotspotChanged(r10, r12)
        L_0x008b:
            boolean r10 = r5.isPressed()
            if (r10 != 0) goto L_0x0094
            r5.setPressed(r3)
        L_0x0094:
            android.graphics.drawable.Drawable r10 = r16.getSelector()
            if (r10 == 0) goto L_0x009e
            if (r8 == r9) goto L_0x009e
            r11 = 1
            goto L_0x009f
        L_0x009e:
            r11 = 0
        L_0x009f:
            if (r11 == 0) goto L_0x00a4
            r10.setVisible(r4, r4)
        L_0x00a4:
            android.graphics.Rect r12 = r0.length
            int r13 = r5.getLeft()
            int r14 = r5.getTop()
            int r15 = r5.getRight()
            int r3 = r5.getBottom()
            r12.set(r13, r14, r15, r3)
            int r3 = r12.left
            int r13 = r0.setMax
            int r3 = r3 - r13
            r12.left = r3
            int r3 = r12.top
            int r13 = r0.getMin
            int r3 = r3 - r13
            r12.top = r3
            int r3 = r12.right
            int r13 = r0.getMax
            int r3 = r3 + r13
            r12.right = r3
            int r3 = r12.bottom
            int r13 = r0.setMin
            int r3 = r3 + r13
            r12.bottom = r3
            java.lang.reflect.Field r3 = r0.IsOverlapping     // Catch:{ IllegalAccessException -> 0x00f5 }
            boolean r3 = r3.getBoolean(r0)     // Catch:{ IllegalAccessException -> 0x00f5 }
            boolean r12 = r5.isEnabled()     // Catch:{ IllegalAccessException -> 0x00f5 }
            if (r12 == r3) goto L_0x00f6
            java.lang.reflect.Field r12 = r0.IsOverlapping     // Catch:{ IllegalAccessException -> 0x00f5 }
            if (r3 != 0) goto L_0x00e7
            r3 = 1
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x00f5 }
            r12.set(r0, r3)     // Catch:{ IllegalAccessException -> 0x00f5 }
            if (r8 == r9) goto L_0x00f6
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00f5 }
            goto L_0x00f6
        L_0x00f5:
        L_0x00f6:
            if (r11 == 0) goto L_0x0111
            android.graphics.Rect r3 = r0.length
            float r11 = r3.exactCenterX()
            float r3 = r3.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x010a
            r12 = 1
            goto L_0x010b
        L_0x010a:
            r12 = 0
        L_0x010b:
            r10.setVisible(r12, r4)
            o.RequiresPermission.Read.getMax(r10, r11, r3)
        L_0x0111:
            android.graphics.drawable.Drawable r3 = r16.getSelector()
            if (r3 == 0) goto L_0x011c
            if (r8 == r9) goto L_0x011c
            o.RequiresPermission.Read.getMax(r3, r7, r6)
        L_0x011c:
            o.setVolumeTo$setMin r3 = r0.toFloatRange
            if (r3 == 0) goto L_0x0122
            r3.getMax = r4
        L_0x0122:
            r16.refreshDrawableState()
            r3 = 1
            if (r2 != r3) goto L_0x0012
            long r2 = r0.getItemIdAtPosition(r8)
            r0.performItemClick(r5, r8, r2)
            goto L_0x0012
        L_0x0131:
            if (r5 == 0) goto L_0x0135
            if (r3 == 0) goto L_0x0157
        L_0x0135:
            r0.hashCode = r4
            r0.setPressed(r4)
            r16.drawableStateChanged()
            int r2 = r0.equals
            int r3 = r16.getFirstVisiblePosition()
            int r2 = r2 - r3
            android.view.View r2 = r0.getChildAt(r2)
            if (r2 == 0) goto L_0x014d
            r2.setPressed(r4)
        L_0x014d:
            o.invalidateOptionsMenu r2 = r0.FastBitmap$CoordinateSystem
            if (r2 == 0) goto L_0x0157
            r2.getMax()
            r2 = 0
            r0.FastBitmap$CoordinateSystem = r2
        L_0x0157:
            if (r5 == 0) goto L_0x016f
            o.onKeyDown r2 = r0.toDoubleRange
            if (r2 != 0) goto L_0x0164
            o.onKeyDown r2 = new o.onKeyDown
            r2.<init>(r0)
            r0.toDoubleRange = r2
        L_0x0164:
            o.onKeyDown r2 = r0.toDoubleRange
            r3 = 1
            r2.toIntRange = r3
            o.onKeyDown r2 = r0.toDoubleRange
            r2.onTouch(r0, r1)
            goto L_0x0185
        L_0x016f:
            o.onKeyDown r1 = r0.toDoubleRange
            if (r1 == 0) goto L_0x0185
            boolean r2 = r1.toIntRange
            if (r2 == 0) goto L_0x0183
            boolean r2 = r1.getMax
            if (r2 == 0) goto L_0x017e
            r1.setMin = r4
            goto L_0x0183
        L_0x017e:
            o.getSupportParentActivityIntent$length r2 = r1.length
            r2.getMin()
        L_0x0183:
            r1.toIntRange = r4
        L_0x0185:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVolumeTo.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    public void setListSelectionHidden(boolean z) {
        this.toIntRange = z;
    }

    private void length() {
        Drawable selector = getSelector();
        if (selector != null && getMax() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private boolean getMax() {
        return this.hashCode;
    }

    class getMax implements Runnable {
        getMax() {
        }

        public void run() {
            setVolumeTo.this.mResolveHoverRunnable = null;
            setVolumeTo.this.drawableStateChanged();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.length.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.length);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
