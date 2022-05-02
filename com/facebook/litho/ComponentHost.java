package com.facebook.litho;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.IResultReceiver;
import o.IconCompat;
import o.NotificationCompat$Action$SemanticAction;
import o.NotificationCompat$BadgeIconType;
import o.NotificationCompat$StreamType;
import o.NotificationCompatSideChannelService;
import o.PermissionChecker$PermissionResult;
import o.RemoteActionCompat;
import o.RemoteInput$Source;
import o.RequiresPermission;
import o.ViewCompat$ScrollIndicators;
import o.WindowInsetsAnimationCompat$Callback$DispatchMode;
import o.arrowScroll;
import o.checkPermission;
import o.computeHorizontalScrollRange;
import o.dispatchNestedPreFling;
import o.doStopCurrentWork;
import o.ensureProcessorRunningLocked;
import o.getBridge;
import o.getExecutor;
import o.getHandler;
import o.isStopped;
import o.keyToDirection;
import o.onRequestSendAccessibilityEvent;
import o.onStopCurrentWork;
import o.overScrollByCompat;
import o.pageScroll;
import o.setOnCancelListener;
import o.startNestedScroll;

@DoNotStrip
public class ComponentHost extends ViewGroup {
    private final setMax FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    @Nullable
    public startNestedScroll Grayscale$Algorithm;
    private NotificationCompat$BadgeIconType ICustomTabsCallback;
    private Object IsOverlapping;
    private long Mean$Arithmetic;
    private boolean asInterface;
    private boolean b;
    private checkPermission create;
    private IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> equals;
    private IconCompat<getBridge> extraCallback;
    private boolean extraCallbackWithResult;
    @Nullable
    private doStopCurrentWork getCause;
    private IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> getMax;
    private IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> getMin;
    /* access modifiers changed from: private */
    public final length hashCode;
    private boolean invoke;
    private boolean invokeSuspend;
    private CharSequence isInside;
    private IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> length;
    private RemoteActionCompat onMessageChannelReady;
    private onStopCurrentWork onNavigationEvent;
    private boolean onPostMessage;
    private overScrollByCompat onRelationshipValidationResult;
    private IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> setMax;
    /* access modifiers changed from: private */
    public IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> setMin;
    private boolean toDoubleRange;
    private SparseArray<Object> toFloatRange;
    private ArrayList<WindowInsetsAnimationCompat$Callback$DispatchMode> toIntRange;
    private boolean toString;
    private int[] valueOf;
    private boolean values;

    /* access modifiers changed from: package-private */
    public void performLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingSuperCall"})
    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public ComponentHost(Context context) {
        this(context, (AttributeSet) null);
    }

    public ComponentHost(Context context, AttributeSet attributeSet) {
        this(new ensureProcessorRunningLocked(context), attributeSet);
    }

    public ComponentHost(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        this(ensureprocessorrunninglocked, (AttributeSet) null);
    }

    public void setParentHostMarker(long j) {
        this.Mean$Arithmetic = j;
    }

    /* access modifiers changed from: package-private */
    public long getParentHostMarker() {
        return this.Mean$Arithmetic;
    }

    /* access modifiers changed from: package-private */
    public void setPerfEvent(startNestedScroll startnestedscroll) {
        this.Grayscale$Algorithm = startnestedscroll;
        length length2 = this.hashCode;
        if (!length2.length) {
            length2.setMax = new ArrayList(4);
            length2.setMin = new ArrayList(4);
        }
        length2.getMax = true;
        length2.length = true;
    }

    public boolean hasDisappearingItems() {
        ArrayList<WindowInsetsAnimationCompat$Callback$DispatchMode> arrayList = this.toIntRange;
        return arrayList != null && !arrayList.isEmpty();
    }

    @Nullable
    public List<pageScroll> getDisappearingItemTransitionIds() {
        if (!hasDisappearingItems()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.toIntRange.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(this.toIntRange.get(i).isInside);
        }
        return arrayList;
    }

    public int getMountItemCount() {
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.setMin;
        if (stub == null) {
            return 0;
        }
        return stub.getMin();
    }

    public WindowInsetsAnimationCompat$Callback$DispatchMode getMountItemAt(int i) {
        return this.setMin.IsOverlapping(i);
    }

    @Nullable
    public WindowInsetsAnimationCompat$Callback$DispatchMode getAccessibleMountItem() {
        for (int i = 0; i < getMountItemCount(); i++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode mountItemAt = getMountItemAt(i);
            if (mountItemAt.getMin()) {
                return mountItemAt;
            }
        }
        return null;
    }

    public List<Drawable> getDrawables() {
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
        if (stub == null || stub.getMin() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.length.getMin());
        int min = this.length.getMin();
        for (int i = 0; i < min; i++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode IsOverlapping2 = this.length.IsOverlapping(i);
            arrayList.add((Drawable) (IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax));
        }
        return arrayList;
    }

    public CharSequence getContentDescription() {
        return this.isInside;
    }

    public void setContentDescription(CharSequence charSequence) {
        this.isInside = charSequence;
        if (!TextUtils.isEmpty(charSequence) && ViewCompat.isInside(this) == 0) {
            ViewCompat.setMin((View) this, 1);
        }
        invalidateAccessibilityState();
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i == dispatchNestedPreFling.setMax.length && obj != null) {
            refreshAccessibilityDelegatesIfNeeded(getExecutor.setMin(getContext()));
            doStopCurrentWork dostopcurrentwork = this.getCause;
            if (dostopcurrentwork != null) {
                dostopcurrentwork.length = (ViewCompat$ScrollIndicators) obj;
            }
        }
    }

    public void moveItem(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode, int i, int i2) {
        WindowInsetsAnimationCompat$Callback$DispatchMode min;
        WindowInsetsAnimationCompat$Callback$DispatchMode min2;
        WindowInsetsAnimationCompat$Callback$DispatchMode min3;
        Rect rect;
        overScrollByCompat overscrollbycompat;
        overScrollByCompat.length min4;
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub;
        if (windowInsetsAnimationCompat$Callback$DispatchMode == null && (stub = this.setMax) != null) {
            windowInsetsAnimationCompat$Callback$DispatchMode = stub.setMin(i);
        }
        if (windowInsetsAnimationCompat$Callback$DispatchMode != null) {
            computeHorizontalScrollRange computehorizontalscrollrange = windowInsetsAnimationCompat$Callback$DispatchMode.getMax;
            if (computehorizontalscrollrange != null) {
                if (computehorizontalscrollrange.setMin == null || computehorizontalscrollrange.setMin.isEmpty()) {
                    rect = null;
                } else {
                    rect = computehorizontalscrollrange.setMin;
                }
                if (!(rect == null || (overscrollbycompat = this.onRelationshipValidationResult) == null)) {
                    if (overscrollbycompat.setMax.setMin(i2) != null) {
                        if (overscrollbycompat.length == null) {
                            overscrollbycompat.length = overScrollByCompat.setMax();
                        }
                        IResultReceiver.Stub<overScrollByCompat.length> stub2 = overscrollbycompat.setMax;
                        IResultReceiver.Stub<overScrollByCompat.length> stub3 = overscrollbycompat.length;
                        if (!(stub2 == null || stub3 == null || (min4 = stub2.setMin(i2)) == null)) {
                            stub3.setMax(i2, min4);
                        }
                    }
                    NotificationCompat$Action$SemanticAction.length(i, i2, overscrollbycompat.setMax, overscrollbycompat.length);
                    if (overscrollbycompat.length != null && overscrollbycompat.length.getMin() == 0) {
                        overScrollByCompat.getMin(overscrollbycompat.length);
                        overscrollbycompat.length = null;
                    }
                }
            }
            Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
            if (this.getMin == null) {
                this.getMin = new IResultReceiver.Stub<>();
            }
            if (obj instanceof Drawable) {
                ThreadUtils.getMax();
                if (this.length == null) {
                    this.length = new IResultReceiver.Stub<>();
                }
                if (this.length.setMin(i2) != null) {
                    if (this.equals == null) {
                        this.equals = NotificationCompatSideChannelService.IsOverlapping();
                    }
                    IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub4 = this.length;
                    IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub5 = this.equals;
                    if (!(stub4 == null || stub5 == null || (min3 = stub4.setMin(i2)) == null)) {
                        stub5.setMax(i2, min3);
                    }
                }
                NotificationCompat$Action$SemanticAction.length(i, i2, this.length, this.equals);
                invalidate();
                getMin();
            } else if (obj instanceof View) {
                this.invoke = true;
                View view = (View) obj;
                if (Build.VERSION.SDK_INT >= 19) {
                    view.cancelPendingInputEvents();
                }
                ViewCompat.hashCode(view);
                if (this.getMin.setMin(i2) != null) {
                    if (this.getMax == null) {
                        this.getMax = NotificationCompatSideChannelService.IsOverlapping();
                    }
                    IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub6 = this.getMin;
                    IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub7 = this.getMax;
                    if (!(stub6 == null || stub7 == null || (min2 = stub6.setMin(i2)) == null)) {
                        stub7.setMax(i2, min2);
                    }
                }
                NotificationCompat$Action$SemanticAction.length(i, i2, this.getMin, this.getMax);
            }
            if (this.setMin == null) {
                this.setMin = new IResultReceiver.Stub<>();
            }
            if (this.setMin.setMin(i2) != null) {
                if (this.setMax == null) {
                    this.setMax = NotificationCompatSideChannelService.IsOverlapping();
                }
                IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub8 = this.setMin;
                IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub9 = this.setMax;
                if (!(stub8 == null || stub9 == null || (min = stub8.setMin(i2)) == null)) {
                    stub9.setMax(i2, min);
                }
            }
            NotificationCompat$Action$SemanticAction.length(i, i2, this.setMin, this.setMax);
            getMin();
            if (obj instanceof View) {
                ViewCompat.toDoubleRange((View) obj);
            }
        }
    }

    public void setViewTag(Object obj) {
        this.IsOverlapping = obj;
    }

    public void setViewTags(SparseArray<Object> sparseArray) {
        this.toFloatRange = sparseArray;
    }

    public void setComponentClickListener(onStopCurrentWork onstopcurrentwork) {
        this.onNavigationEvent = onstopcurrentwork;
        setOnClickListener(onstopcurrentwork);
    }

    public onStopCurrentWork getComponentClickListener() {
        return this.onNavigationEvent;
    }

    public void setComponentLongClickListener(checkPermission checkpermission) {
        this.create = checkpermission;
        setOnLongClickListener(checkpermission);
    }

    public checkPermission getComponentLongClickListener() {
        return this.create;
    }

    public void setComponentFocusChangeListener(NotificationCompat$BadgeIconType notificationCompat$BadgeIconType) {
        this.ICustomTabsCallback = notificationCompat$BadgeIconType;
        setOnFocusChangeListener(notificationCompat$BadgeIconType);
    }

    public NotificationCompat$BadgeIconType getComponentFocusChangeListener() {
        return this.ICustomTabsCallback;
    }

    public void setComponentTouchListener(RemoteActionCompat remoteActionCompat) {
        this.onMessageChannelReady = remoteActionCompat;
        setOnTouchListener(remoteActionCompat);
    }

    public void setInterceptTouchEventHandler(IconCompat<getBridge> iconCompat) {
        this.extraCallback = iconCompat;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IconCompat<getBridge> iconCompat = this.extraCallback;
        if (iconCompat != null) {
            return getHandler.length(iconCompat, this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public RemoteActionCompat getComponentTouchListener() {
        return this.onMessageChannelReady;
    }

    public void suppressInvalidations(boolean z) {
        if (this.toDoubleRange != z) {
            this.toDoubleRange = z;
            if (!z) {
                if (this.toString) {
                    invalidate();
                    this.toString = false;
                }
                if (this.values) {
                    invalidateAccessibilityState();
                    this.values = false;
                }
            }
        }
    }

    public void invalidateAccessibilityState() {
        if (this.b) {
            if (this.toDoubleRange) {
                this.values = true;
            } else if (this.getCause != null) {
                setMin();
            }
        }
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.getCause != null) {
            setMin();
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    private boolean setMin() {
        getAccessibleMountItem();
        return false;
    }

    public List<CharSequence> getContentDescriptions() {
        CharSequence charSequence;
        ArrayList arrayList = new ArrayList();
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
        int min = stub == null ? 0 : stub.getMin();
        for (int i = 0; i < min; i++) {
            ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = this.length.IsOverlapping(i).getMin;
            if (!(viewCompat$ScrollIndicators == null || (charSequence = viewCompat$ScrollIndicators.setMax) == null)) {
                arrayList.add(charSequence);
            }
        }
        CharSequence contentDescription = getContentDescription();
        if (contentDescription != null) {
            arrayList.add(contentDescription);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public overScrollByCompat getTouchExpansionDelegate() {
        return this.onRelationshipValidationResult;
    }

    public void dispatchDraw(Canvas canvas) {
        setMax setmax = this.FastBitmap$CoordinateSystem;
        setmax.setMax = canvas;
        setmax.setMin = 0;
        setmax.getMax = ComponentHost.this.setMin == null ? 0 : ComponentHost.this.setMin.getMin();
        super.dispatchDraw(canvas);
        if (this.FastBitmap$CoordinateSystem.length()) {
            this.FastBitmap$CoordinateSystem.getMin();
        }
        setMax setmax2 = this.FastBitmap$CoordinateSystem;
        if (ComponentHost.this.hashCode.getMax) {
            length access$700 = ComponentHost.this.hashCode;
            startNestedScroll unused = ComponentHost.this.Grayscale$Algorithm;
            access$700.setMax.toArray(new String[0]);
            access$700.setMin.toArray(new Double[0]);
            access$700.getMax = false;
            access$700.setMax.clear();
            access$700.setMin.clear();
            startNestedScroll unused2 = ComponentHost.this.Grayscale$Algorithm = null;
        }
        setmax2.setMax = null;
        ArrayList<WindowInsetsAnimationCompat$Callback$DispatchMode> arrayList = this.toIntRange;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode = this.toIntRange.get(i);
            Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
            if (obj instanceof Drawable) {
                ((Drawable) obj).draw(canvas);
            }
        }
        if (keyToDirection.setMin) {
            if (RemoteInput$Source.setMax == null) {
                Paint paint = new Paint();
                RemoteInput$Source.setMax = paint;
                paint.setColor(1724029951);
            }
            if (RemoteInput$Source.setMin == null) {
                Paint paint2 = new Paint();
                RemoteInput$Source.setMin = paint2;
                paint2.setColor(1154744270);
            }
            if (RemoteInput$Source.setMax(this)) {
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), RemoteInput$Source.setMax);
            }
            for (int mountItemCount = getMountItemCount() - 1; mountItemCount >= 0; mountItemCount--) {
                WindowInsetsAnimationCompat$Callback$DispatchMode mountItemAt = getMountItemAt(mountItemCount);
                isStopped isstopped = mountItemAt.setMin;
                if (isStopped.length(isstopped) && !isStopped.setMin(isstopped)) {
                    View view = (View) (mountItemAt.length != null ? mountItemAt.length : mountItemAt.setMax);
                    if (RemoteInput$Source.setMax(view)) {
                        canvas.drawRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), RemoteInput$Source.setMin);
                    }
                }
            }
            overScrollByCompat touchExpansionDelegate = getTouchExpansionDelegate();
            if (touchExpansionDelegate != null) {
                touchExpansionDelegate.getMax(canvas, RemoteInput$Source.setMin);
            }
        }
        if (keyToDirection.toIntRange) {
            RemoteInput$Source.setMin(this, canvas);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ThreadUtils.getMax();
        boolean z = true;
        if (isEnabled()) {
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
            int min = (stub == null ? 0 : stub.getMin()) - 1;
            while (true) {
                if (min < 0) {
                    break;
                }
                WindowInsetsAnimationCompat$Callback$DispatchMode IsOverlapping2 = this.length.IsOverlapping(min);
                if (((IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax) instanceof arrowScroll) && !WindowInsetsAnimationCompat$Callback$DispatchMode.getMax(IsOverlapping2.toDoubleRange)) {
                    arrowScroll arrowscroll = (arrowScroll) (IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax);
                    if (arrowscroll.length(motionEvent) && arrowscroll.length(motionEvent, this)) {
                        break;
                    }
                }
                min--;
            }
        }
        z = false;
        return !z ? super.onTouchEvent(motionEvent) : z;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.invokeSuspend = true;
        performLayout(z, i, i2, i3, i4);
        this.invokeSuspend = false;
    }

    public void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof ComponentHost) {
            if (((ComponentHost) viewParent).shouldRequestLayout()) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean shouldRequestLayout() {
        return !this.invokeSuspend;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
        int min = stub == null ? 0 : stub.getMin();
        for (int i = 0; i < min; i++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode IsOverlapping2 = this.length.IsOverlapping(i);
            NotificationCompat$Action$SemanticAction.getMax(this, (Drawable) (IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax), IsOverlapping2.toDoubleRange, IsOverlapping2.getMin);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
        int min = stub == null ? 0 : stub.getMin();
        for (int i = 0; i < min; i++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode IsOverlapping2 = this.length.IsOverlapping(i);
            RequiresPermission.Read.getMin((Drawable) (IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax));
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
        int min = stub == null ? 0 : stub.getMin();
        for (int i2 = 0; i2 < min; i2++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode IsOverlapping2 = this.length.IsOverlapping(i2);
            ((Drawable) (IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax)).setVisible(i == 0, false);
        }
    }

    @DoNotStrip
    public Object getTag() {
        Object obj = this.IsOverlapping;
        if (obj != null) {
            return obj;
        }
        return super.getTag();
    }

    public Object getTag(int i) {
        Object obj;
        SparseArray<Object> sparseArray = this.toFloatRange;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    public void invalidate(Rect rect) {
        if (this.toDoubleRange) {
            this.toString = true;
        } else {
            super.invalidate(rect);
        }
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        if (this.toDoubleRange) {
            this.toString = true;
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }

    public void invalidate() {
        if (this.toDoubleRange) {
            this.toString = true;
        } else {
            super.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void refreshAccessibilityDelegatesIfNeeded(boolean z) {
        if (z != this.b) {
            if (z && this.getCause == null) {
                this.getCause = new doStopCurrentWork(this, isFocusable(), ViewCompat.isInside(this));
            }
            ViewCompat.getMin((View) this, (setOnCancelListener) z ? this.getCause : null);
            this.b = z;
            if (z) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof ComponentHost) {
                        ((ComponentHost) childAt).refreshAccessibilityDelegatesIfNeeded(true);
                    } else {
                        ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = (ViewCompat$ScrollIndicators) childAt.getTag(dispatchNestedPreFling.setMax.length);
                        if (viewCompat$ScrollIndicators != null) {
                            ViewCompat.getMin(childAt, (setOnCancelListener) new doStopCurrentWork(childAt, viewCompat$ScrollIndicators, childAt.isFocusable(), ViewCompat.isInside(childAt)));
                        }
                    }
                }
            }
        }
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.b = false;
    }

    public boolean hasOverlappingRendering() {
        return keyToDirection.getCause;
    }

    public void setClipChildren(boolean z) {
        if (this.extraCallbackWithResult) {
            this.asInterface = z;
            return;
        }
        if (Build.VERSION.SDK_INT < 18) {
            this.onPostMessage = z;
        }
        super.setClipChildren(z);
    }

    public boolean getClipChildren() {
        if (Build.VERSION.SDK_INT < 18) {
            return this.onPostMessage;
        }
        return super.getClipChildren();
    }

    public void temporaryDisableChildClipping() {
        if (!this.extraCallbackWithResult) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.asInterface = getClipChildren();
            } else {
                this.asInterface = this.onPostMessage;
            }
            setClipChildren(false);
            this.extraCallbackWithResult = true;
        }
    }

    public void restoreChildClipping() {
        if (this.extraCallbackWithResult) {
            this.extraCallbackWithResult = false;
            setClipChildren(this.asInterface);
        }
    }

    @Deprecated
    public void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @VisibleForTesting
    public void addViewForTest(View view) {
        super.addView(view, -1, view.getLayoutParams() == null ? generateDefaultLayoutParams() : view.getLayoutParams());
    }

    @Nullable
    public List<Drawable> getLinkedDrawablesForAnimation() {
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
        int min = stub == null ? 0 : stub.getMin();
        ArrayList arrayList = null;
        for (int i = 0; i < min; i++) {
            WindowInsetsAnimationCompat$Callback$DispatchMode IsOverlapping2 = this.length.IsOverlapping(i);
            if ((IsOverlapping2.toDoubleRange & 4) != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Drawable) (IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax));
            }
        }
        return arrayList;
    }

    private void getMin() {
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.setMax;
        if (stub != null && stub.getMin() == 0) {
            NotificationCompatSideChannelService.setMin(this.setMax);
            this.setMax = null;
        }
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub2 = this.getMax;
        if (stub2 != null && stub2.getMin() == 0) {
            NotificationCompatSideChannelService.setMin(this.getMax);
            this.getMax = null;
        }
    }

    class setMax {
        int getMax;
        Canvas setMax;
        int setMin;

        /* synthetic */ setMax(ComponentHost componentHost, byte b) {
            this();
        }

        private setMax() {
        }

        /* access modifiers changed from: private */
        public boolean length() {
            return this.setMax != null && this.setMin < this.getMax;
        }

        /* access modifiers changed from: package-private */
        public final void getMin() {
            if (this.setMax != null) {
                int min = ComponentHost.this.setMin == null ? 0 : ComponentHost.this.setMin.getMin();
                for (int i = this.setMin; i < min; i++) {
                    long nanoTime = System.nanoTime();
                    WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode = (WindowInsetsAnimationCompat$Callback$DispatchMode) ComponentHost.this.setMin.IsOverlapping(i);
                    Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
                    if (obj instanceof View) {
                        this.setMin = i + 1;
                        return;
                    }
                    if (windowInsetsAnimationCompat$Callback$DispatchMode.equals()) {
                        NotificationCompat$StreamType.setMin();
                        String access$800 = ComponentHost.this.hashCode.getMax ? ComponentHost.access$800(windowInsetsAnimationCompat$Callback$DispatchMode) : null;
                        ((Drawable) obj).draw(this.setMax);
                        long nanoTime2 = System.nanoTime();
                        if (ComponentHost.this.hashCode.getMax) {
                            List<Double> list = ComponentHost.this.hashCode.setMin;
                            double d = (double) (nanoTime2 - nanoTime);
                            Double.isNaN(d);
                            list.add(Double.valueOf(d / 1000000.0d));
                            ComponentHost.this.hashCode.setMax.add(access$800);
                        }
                    }
                }
                this.setMin = this.getMax;
            }
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 512 || i == 256) {
            CharSequence charSequence = null;
            if (!TextUtils.isEmpty(getContentDescription())) {
                charSequence = getContentDescription();
            } else if (!getContentDescriptions().isEmpty()) {
                charSequence = TextUtils.join(", ", getContentDescriptions());
            } else if (!getTextContent().getTextItems().isEmpty()) {
                charSequence = TextUtils.join(", ", getTextContent().getTextItems());
            }
            if (charSequence == null) {
                return false;
            }
            this.isInside = charSequence;
            super.setContentDescription(charSequence);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    static class length {
        boolean getMax;
        boolean length;
        List<String> setMax;
        List<Double> setMin;

        private length() {
            this.getMax = false;
            this.length = false;
        }

        /* synthetic */ length(byte b) {
            this();
        }
    }

    public ComponentHost(ensureProcessorRunningLocked ensureprocessorrunninglocked, AttributeSet attributeSet) {
        super(ensureprocessorrunninglocked.setMin, attributeSet);
        this.FastBitmap$CoordinateSystem = new setMax(this, (byte) 0);
        this.hashCode = new length((byte) 0);
        this.valueOf = new int[0];
        this.b = false;
        this.onPostMessage = true;
        this.extraCallbackWithResult = false;
        this.asInterface = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        refreshAccessibilityDelegatesIfNeeded(getExecutor.setMin(ensureprocessorrunninglocked.setMin));
        this.setMin = new IResultReceiver.Stub<>();
        this.getMin = new IResultReceiver.Stub<>();
        this.length = new IResultReceiver.Stub<>();
        this.toIntRange = new ArrayList<>();
    }

    public void mount(int i, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode, Rect rect) {
        Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        boolean z = true;
        if (obj instanceof Drawable) {
            ThreadUtils.getMax();
            if (this.length == null) {
                this.length = new IResultReceiver.Stub<>();
            }
            this.length.setMax(i, windowInsetsAnimationCompat$Callback$DispatchMode);
            Drawable drawable = (Drawable) (windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax);
            int i2 = windowInsetsAnimationCompat$Callback$DispatchMode.toDoubleRange;
            ViewCompat$ScrollIndicators viewCompat$ScrollIndicators = windowInsetsAnimationCompat$Callback$DispatchMode.getMin;
            if (getVisibility() != 0) {
                z = false;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            NotificationCompat$Action$SemanticAction.getMax(this, drawable, i2, viewCompat$ScrollIndicators);
            invalidate(rect);
        } else if (obj instanceof View) {
            if (this.getMin == null) {
                this.getMin = new IResultReceiver.Stub<>();
            }
            this.getMin.setMax(i, windowInsetsAnimationCompat$Callback$DispatchMode);
            View view = (View) obj;
            view.setDuplicateParentStateEnabled(WindowInsetsAnimationCompat$Callback$DispatchMode.setMax(windowInsetsAnimationCompat$Callback$DispatchMode.toDoubleRange));
            this.invoke = true;
            if (!(view instanceof ComponentHost) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.invokeSuspend) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            } else {
                ViewCompat.toDoubleRange(view);
                view.setVisibility(0);
            }
            maybeRegisterTouchExpansion(i, windowInsetsAnimationCompat$Callback$DispatchMode);
        }
        if (this.setMin == null) {
            this.setMin = new IResultReceiver.Stub<>();
        }
        this.setMin.setMax(i, windowInsetsAnimationCompat$Callback$DispatchMode);
        if (windowInsetsAnimationCompat$Callback$DispatchMode.getMin()) {
            windowInsetsAnimationCompat$Callback$DispatchMode.toFloatRange.invalidateAccessibilityState();
        }
    }

    public void unmount(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        if (this.setMin == null) {
            this.setMin = new IResultReceiver.Stub<>();
        }
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.setMin;
        unmount(stub.getMin(stub.getMax(windowInsetsAnimationCompat$Callback$DispatchMode)), windowInsetsAnimationCompat$Callback$DispatchMode);
    }

    public void unmount(int i, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        if (obj instanceof Drawable) {
            if (this.length == null) {
                this.length = new IResultReceiver.Stub<>();
            }
            ThreadUtils.getMax();
            Drawable drawable = (Drawable) (windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax);
            drawable.setCallback((Drawable.Callback) null);
            invalidate(drawable.getBounds());
            getMin();
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub2 = this.equals;
            if (NotificationCompat$Action$SemanticAction.getMin(i, stub2)) {
                stub2.getMax(i);
            } else {
                stub.getMax(i);
            }
        } else if (obj instanceof View) {
            View view = (View) obj;
            this.invoke = true;
            if (this.invokeSuspend) {
                super.removeViewInLayout(view);
            } else {
                super.removeView(view);
            }
            if (this.getMin == null) {
                this.getMin = new IResultReceiver.Stub<>();
            }
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub3 = this.getMin;
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub4 = this.getMax;
            if (NotificationCompat$Action$SemanticAction.getMin(i, stub4)) {
                stub4.getMax(i);
            } else {
                stub3.getMax(i);
            }
            this.invoke = true;
            maybeUnregisterTouchExpansion(i, windowInsetsAnimationCompat$Callback$DispatchMode);
        }
        if (this.setMin == null) {
            this.setMin = new IResultReceiver.Stub<>();
        }
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub5 = this.setMin;
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub6 = this.setMax;
        if (NotificationCompat$Action$SemanticAction.getMin(i, stub6)) {
            stub6.getMax(i);
        } else {
            stub5.getMax(i);
        }
        getMin();
        if (windowInsetsAnimationCompat$Callback$DispatchMode.getMin()) {
            windowInsetsAnimationCompat$Callback$DispatchMode.toFloatRange.invalidateAccessibilityState();
        }
    }

    public void startUnmountDisappearingItem(int i, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
        if (obj instanceof Drawable) {
            if (this.length == null) {
                this.length = new IResultReceiver.Stub<>();
            }
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.length;
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub2 = this.equals;
            if (NotificationCompat$Action$SemanticAction.getMin(i, stub2)) {
                stub2.getMax(i);
            } else {
                stub.getMax(i);
            }
        } else if (obj instanceof View) {
            if (this.getMin == null) {
                this.getMin = new IResultReceiver.Stub<>();
            }
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub3 = this.getMin;
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub4 = this.getMax;
            if (NotificationCompat$Action$SemanticAction.getMin(i, stub4)) {
                stub4.getMax(i);
            } else {
                stub3.getMax(i);
            }
            this.invoke = true;
            maybeUnregisterTouchExpansion(i, windowInsetsAnimationCompat$Callback$DispatchMode);
        }
        if (this.setMin == null) {
            this.setMin = new IResultReceiver.Stub<>();
        }
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub5 = this.setMin;
        IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub6 = this.setMax;
        if (NotificationCompat$Action$SemanticAction.getMin(i, stub6)) {
            stub6.getMax(i);
        } else {
            stub5.getMax(i);
        }
        getMin();
        if (this.toIntRange == null) {
            this.toIntRange = new ArrayList<>();
        }
        this.toIntRange.add(windowInsetsAnimationCompat$Callback$DispatchMode);
    }

    public void unmountDisappearingItem(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        if (this.toIntRange == null) {
            this.toIntRange = new ArrayList<>();
        }
        if (this.toIntRange.remove(windowInsetsAnimationCompat$Callback$DispatchMode)) {
            Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
            if (obj instanceof Drawable) {
                ThreadUtils.getMax();
                Drawable drawable = (Drawable) (windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax);
                drawable.setCallback((Drawable.Callback) null);
                invalidate(drawable.getBounds());
                getMin();
            } else if (obj instanceof View) {
                View view = (View) obj;
                this.invoke = true;
                if (this.invokeSuspend) {
                    super.removeViewInLayout(view);
                } else {
                    super.removeView(view);
                }
            }
            if (windowInsetsAnimationCompat$Callback$DispatchMode.getMin()) {
                windowInsetsAnimationCompat$Callback$DispatchMode.toFloatRange.invalidateAccessibilityState();
                return;
            }
            return;
        }
        throw new RuntimeException("Tried to remove non-existent disappearing item, transitionId: ".concat(String.valueOf(windowInsetsAnimationCompat$Callback$DispatchMode.isInside)));
    }

    public void maybeRegisterTouchExpansion(int i, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        Rect rect;
        computeHorizontalScrollRange computehorizontalscrollrange = windowInsetsAnimationCompat$Callback$DispatchMode.getMax;
        if (computehorizontalscrollrange != null) {
            if (computehorizontalscrollrange.setMin == null || computehorizontalscrollrange.setMin.isEmpty()) {
                rect = null;
            } else {
                rect = computehorizontalscrollrange.setMin;
            }
            if (rect != null) {
                if (!equals(windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax)) {
                    if (this.onRelationshipValidationResult == null) {
                        overScrollByCompat overscrollbycompat = new overScrollByCompat(this);
                        this.onRelationshipValidationResult = overscrollbycompat;
                        setTouchDelegate(overscrollbycompat);
                    }
                    this.onRelationshipValidationResult.setMax.setMax(i, overScrollByCompat.length.getMin((View) (windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax), rect));
                }
            }
        }
    }

    public void maybeUnregisterTouchExpansion(int i, WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        Rect rect;
        computeHorizontalScrollRange computehorizontalscrollrange = windowInsetsAnimationCompat$Callback$DispatchMode.getMax;
        if (computehorizontalscrollrange != null && this.onRelationshipValidationResult != null) {
            if (computehorizontalscrollrange.setMin == null || computehorizontalscrollrange.setMin.isEmpty()) {
                rect = null;
            } else {
                rect = computehorizontalscrollrange.setMin;
            }
            if (rect != null) {
                if (!equals(windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax)) {
                    overScrollByCompat overscrollbycompat = this.onRelationshipValidationResult;
                    if (!overscrollbycompat.setMin(i)) {
                        int equals2 = overscrollbycompat.setMax.equals(i);
                        overscrollbycompat.setMax.length(equals2);
                        overscrollbycompat.setMax.IsOverlapping(equals2).getMax();
                    }
                }
            }
        }
    }

    @DoNotStrip
    public TextContent getTextContent() {
        if (this.setMin == null) {
            this.setMin = new IResultReceiver.Stub<>();
        }
        return NotificationCompat$Action$SemanticAction.setMin(NotificationCompat$Action$SemanticAction.getMin(this.setMin));
    }

    public onRequestSendAccessibilityEvent getImageContent() {
        if (this.setMin == null) {
            this.setMin = new IResultReceiver.Stub<>();
        }
        List<?> min = NotificationCompat$Action$SemanticAction.getMin(this.setMin);
        int size = min.size();
        if (size == 1) {
            Object obj = min.get(0);
            return obj instanceof onRequestSendAccessibilityEvent ? (onRequestSendAccessibilityEvent) obj : onRequestSendAccessibilityEvent.length;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj2 = min.get(i);
            if (obj2 instanceof onRequestSendAccessibilityEvent) {
                arrayList.addAll(((onRequestSendAccessibilityEvent) obj2).getMin());
            }
        }
        return new onRequestSendAccessibilityEvent(arrayList) {
            final /* synthetic */ List getMin;

            {
                this.getMin = r1;
            }

            public final List<Drawable> getMin() {
                return this.getMin;
            }
        };
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.invoke) {
            int childCount = getChildCount();
            if (this.valueOf.length < childCount) {
                this.valueOf = new int[(childCount + 5)];
            }
            IResultReceiver.Stub<WindowInsetsAnimationCompat$Callback$DispatchMode> stub = this.getMin;
            int min = stub == null ? 0 : stub.getMin();
            int i3 = 0;
            int i4 = 0;
            while (i3 < min) {
                WindowInsetsAnimationCompat$Callback$DispatchMode IsOverlapping2 = this.getMin.IsOverlapping(i3);
                this.valueOf[i4] = indexOfChild((View) (IsOverlapping2.length != null ? IsOverlapping2.length : IsOverlapping2.setMax));
                i3++;
                i4++;
            }
            ArrayList<WindowInsetsAnimationCompat$Callback$DispatchMode> arrayList = this.toIntRange;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode = this.toIntRange.get(i5);
                Object obj = windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax;
                if (obj instanceof View) {
                    this.valueOf[i4] = indexOfChild((View) obj);
                    i4++;
                }
            }
            this.invoke = false;
        }
        if (this.FastBitmap$CoordinateSystem.length()) {
            this.FastBitmap$CoordinateSystem.getMin();
        }
        return this.valueOf[i2];
    }

    static /* synthetic */ String access$800(WindowInsetsAnimationCompat$Callback$DispatchMode windowInsetsAnimationCompat$Callback$DispatchMode) {
        String str = windowInsetsAnimationCompat$Callback$DispatchMode.setMin.valueOf;
        if (!((windowInsetsAnimationCompat$Callback$DispatchMode.length != null ? windowInsetsAnimationCompat$Callback$DispatchMode.length : windowInsetsAnimationCompat$Callback$DispatchMode.setMax) instanceof PermissionChecker$PermissionResult)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("DL");
        return sb.toString();
    }
}
