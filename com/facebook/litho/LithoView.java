package com.facebook.litho;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.VisibleForTesting;
import com.facebook.litho.ComponentsLogger;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import o.NotificationCompatSideChannelService;
import o.ViewCompat$FocusRelativeDirection;
import o.WindowInsetsAnimationCompat$Callback$DispatchMode;
import o.WindowInsetsCompat$Type$InsetsType;
import o.callbackSuccessAsync;
import o.computeScroll;
import o.computeVerticalScrollExtent;
import o.dequeueWork;
import o.ensureProcessorRunningLocked;
import o.getExecutor;
import o.isStopped;
import o.keyToDirection;
import o.setOnScrollChangeListener;
import o.setSupportProgressBarVisibility;
import o.startNestedScroll;

public class LithoView extends ComponentHost {
    public static final String SET_ALREADY_ATTACHED_COMPONENT_TREE = "LithoView:SetAlreadyAttachedComponentTree";
    public static final String ZERO_HEIGHT_LOG = "LithoView:0-height";
    private static final int[] invokeSuspend = new int[2];
    private setMax FastBitmap$CoordinateSystem;
    @Nullable
    private Map<String, dequeueWork> Grayscale$Algorithm;
    @Nullable
    private String ICustomTabsCallback;
    private boolean IsOverlapping;
    private int Mean$Arithmetic;
    private int equals;
    private final WindowInsetsCompat$Type$InsetsType getMax;
    private final Rect getMin;
    private final setMin hashCode;
    private boolean invoke;
    private boolean isInside;
    @Nullable
    private ComponentTree length;
    @Nullable
    private String onNavigationEvent;
    private final ensureProcessorRunningLocked setMax;
    private boolean setMin;
    private int toDoubleRange;
    private boolean toFloatRange;
    private boolean toIntRange;
    @Nullable
    private length toString;
    private ComponentTree valueOf;
    private final AccessibilityManager values;

    public interface getMax {
        int getMax();

        boolean length();

        int setMax();
    }

    public interface length {
    }

    public interface setMax {
    }

    /* access modifiers changed from: package-private */
    public void onDirtyMountComplete() {
    }

    /* access modifiers changed from: protected */
    public boolean shouldAlwaysLayoutChildren() {
        return false;
    }

    public static LithoView create(Context context, isStopped isstopped) {
        return create(new ensureProcessorRunningLocked(context), isstopped);
    }

    public static LithoView create(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped) {
        LithoView lithoView = new LithoView(ensureprocessorrunninglocked);
        lithoView.setComponentTree(ComponentTree.setMax(ensureprocessorrunninglocked, isstopped).length());
        return lithoView;
    }

    public LithoView(Context context) {
        this(context, (AttributeSet) null);
    }

    public LithoView(Context context, AttributeSet attributeSet) {
        this(new ensureProcessorRunningLocked(context), attributeSet);
    }

    public LithoView(ensureProcessorRunningLocked ensureprocessorrunninglocked) {
        this(ensureprocessorrunninglocked, (AttributeSet) null);
    }

    public LithoView(ensureProcessorRunningLocked ensureprocessorrunninglocked, AttributeSet attributeSet) {
        super(ensureprocessorrunninglocked, attributeSet);
        this.getMin = new Rect();
        this.isInside = false;
        this.toFloatRange = false;
        this.equals = -1;
        this.toDoubleRange = -1;
        this.FastBitmap$CoordinateSystem = null;
        this.toString = null;
        this.hashCode = new setMin(this, (byte) 0);
        this.setMax = ensureprocessorrunninglocked;
        this.getMax = new WindowInsetsCompat$Type$InsetsType(this);
        this.values = (AccessibilityManager) ensureprocessorrunninglocked.setMin.getSystemService("accessibility");
    }

    private static void getMax(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = componentHost.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof ComponentHost) {
                getMax((ComponentHost) childAt);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void forceRelayout() {
        this.IsOverlapping = true;
        requestLayout();
    }

    public void startTemporaryDetach() {
        this.valueOf = this.length;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setMin();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMax();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        getMax();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        setMin();
    }

    private void setMin() {
        if (!this.setMin) {
            this.setMin = true;
            ComponentTree componentTree = this.length;
            if (componentTree != null) {
                componentTree.getMin();
            }
            refreshAccessibilityDelegatesIfNeeded(getExecutor.setMin(getContext()));
            setSupportProgressBarVisibility.getMin(this.values, this.hashCode);
        }
    }

    private void getMax() {
        if (this.setMin) {
            this.setMin = false;
            WindowInsetsCompat$Type$InsetsType windowInsetsCompat$Type$InsetsType = this.getMax;
            ThreadUtils.getMax();
            windowInsetsCompat$Type$InsetsType.IsOverlapping();
            ComponentTree componentTree = this.length;
            if (componentTree != null) {
                componentTree.setMax();
            }
            setSupportProgressBarVisibility.getMax(this.values, this.hashCode);
            this.toIntRange = false;
        }
    }

    public void suppressMeasureComponentTree(boolean z) {
        this.toIntRange = z;
    }

    public void setAnimatedWidth(int i) {
        this.equals = i;
        requestLayout();
    }

    public void setAnimatedHeight(int i) {
        this.toDoubleRange = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ComponentTree componentTree;
        ComponentTree componentTree2;
        Resources resources = getResources();
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            Configuration configuration = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            int i4 = (int) ((displayMetrics.density * ((float) configuration.screenWidthDp)) + 0.5f);
            if (i3 != i4 && i4 == View.MeasureSpec.getSize(i)) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        }
        boolean z = true;
        boolean z2 = (this.equals == -1 && this.toDoubleRange == -1) ? false : true;
        int i5 = this.equals;
        if (i5 == -1) {
            i5 = getWidth();
        }
        int i6 = this.toDoubleRange;
        if (i6 == -1) {
            i6 = getHeight();
        }
        this.equals = -1;
        this.toDoubleRange = -1;
        if (!z2 || isMountStateDirty()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof getMax) {
                getMax getmax = (getMax) layoutParams;
                int max = getmax.setMax();
                if (max != -1) {
                    i = max;
                }
                int max2 = getmax.getMax();
                if (max2 != -1) {
                    i2 = max2;
                }
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            ComponentTree componentTree3 = this.valueOf;
            dequeueWork dequeuework = null;
            if (componentTree3 != null && this.length == null) {
                setComponentTree(componentTree3);
                this.valueOf = null;
            }
            if (!this.IsOverlapping && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
                this.invoke = true;
                setMeasuredDimension(size, size2);
                return;
            }
            this.isInside = true;
            ComponentTree componentTree4 = this.length;
            if (componentTree4 != null && !this.toIntRange) {
                boolean z3 = this.IsOverlapping;
                this.IsOverlapping = false;
                componentTree4.setMax(i, i2, invokeSuspend, z3);
                int[] iArr = invokeSuspend;
                size = iArr[0];
                size2 = iArr[1];
                this.invoke = false;
            }
            if (size2 == 0 && getComponentContext().getMin != null && ((componentTree2 = this.length) == null || componentTree2.ICustomTabsCallback == null || this.length.ICustomTabsCallback.hashCode != null)) {
                Map<String, dequeueWork> map = this.Grayscale$Algorithm;
                if (map != null) {
                    dequeuework = map.get(ZERO_HEIGHT_LOG);
                }
                if (dequeuework != null) {
                    ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                    if (!((layoutParams2 instanceof getMax) && ((getMax) layoutParams2).length())) {
                        ComponentTree componentTree5 = this.length;
                        if (componentTree5 != null) {
                            componentTree5.values();
                        }
                        LithoViewTestHelper.getMin(this);
                        if (dequeuework.getMin) {
                            ComponentsLogger.LogLevel logLevel = ComponentsLogger.LogLevel.FATAL;
                        } else {
                            ComponentsLogger.LogLevel logLevel2 = ComponentsLogger.LogLevel.ERROR;
                        }
                    }
                }
            }
            if (this.toIntRange || (componentTree = this.length) == null || (this.toFloatRange && componentTree.setMin())) {
                z = false;
            }
            if (z) {
                ComponentTree componentTree6 = this.length;
                ThreadUtils.getMax();
                LayoutState layoutState = componentTree6.ICustomTabsCallback;
                if (!(layoutState == null || layoutState.FastBitmap$CoordinateSystem == null)) {
                    WindowInsetsCompat$Type$InsetsType mountState = componentTree6.toString.getMountState();
                    if (mountState.getMax()) {
                        mountState.getMax(layoutState, componentTree6);
                    }
                }
                ComponentTree componentTree7 = this.length;
                int max3 = componentTree7.getMax(i5, this.toFloatRange, componentTree7.invokeSuspend, computeScroll.setMin);
                if (max3 != -1) {
                    size = max3;
                }
                ComponentTree componentTree8 = this.length;
                int max4 = componentTree8.getMax(i6, this.toFloatRange, componentTree8.invoke, computeScroll.getMax);
                if (max4 != -1) {
                    size2 = max4;
                }
            }
            setMeasuredDimension(size, size2);
            this.toFloatRange = false;
            this.isInside = false;
            return;
        }
        setMeasuredDimension(i5, i6);
    }

    /* access modifiers changed from: protected */
    public void performLayout(boolean z, int i, int i2, int i3, int i4) {
        ComponentTree componentTree = this.length;
        if (componentTree == null) {
            return;
        }
        if (!componentTree.toDoubleRange()) {
            if (this.invoke || this.length.ICustomTabsCallback == null) {
                this.length.setMax(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), invokeSuspend, false);
                this.toFloatRange = false;
                this.invoke = false;
            }
            boolean intRange = this.length.toIntRange();
            if (!intRange && isIncrementalMountEnabled()) {
                performIncrementalMount();
            }
            if (!intRange || shouldAlwaysLayoutChildren()) {
                getMax(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
    }

    public ensureProcessorRunningLocked getComponentContext() {
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    public boolean shouldRequestLayout() {
        ComponentTree componentTree = this.length;
        if (componentTree == null || !componentTree.length()) {
            return super.shouldRequestLayout();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void assertNotInMeasure() {
        if (this.isInside) {
            throw new RuntimeException("Cannot update ComponentTree while in the middle of measure");
        }
    }

    @Nullable
    public ComponentTree getComponentTree() {
        return this.length;
    }

    public void setOnDirtyMountListener(setMax setmax) {
        this.FastBitmap$CoordinateSystem = setmax;
    }

    public void setOnPostDrawListener(@Nullable length length2) {
        this.toString = length2;
    }

    public void setComponentTree(@Nullable ComponentTree componentTree) {
        Map<String, dequeueWork> map;
        ThreadUtils.getMax();
        assertNotInMeasure();
        String str = null;
        this.valueOf = null;
        ComponentTree componentTree2 = this.length;
        if (componentTree2 != componentTree) {
            this.toFloatRange = componentTree2 == null || componentTree == null || componentTree2.extraCallback != componentTree.extraCallback;
            setMountStateDirty();
            if (this.length != null) {
                if (keyToDirection.invoke && componentTree == null) {
                    unmountAllItems();
                }
                if (this.Grayscale$Algorithm != null) {
                    this.ICustomTabsCallback = this.length.values();
                }
                if (!(componentTree == null || componentTree.getLithoView() == null || (map = this.Grayscale$Algorithm) == null || !map.containsKey(SET_ALREADY_ATTACHED_COMPONENT_TREE))) {
                    ComponentTree componentTree3 = this.length;
                    dequeueWork dequeuework = this.Grayscale$Algorithm.get(SET_ALREADY_ATTACHED_COMPONENT_TREE);
                    if (getComponentContext().getMin != null) {
                        LithoViewTestHelper.getMin(componentTree3.getLithoView());
                        LithoViewTestHelper.getMin(componentTree.getLithoView());
                        componentTree3.values();
                        componentTree.values();
                        if (dequeuework.getMin) {
                            ComponentsLogger.LogLevel logLevel = ComponentsLogger.LogLevel.FATAL;
                        } else {
                            ComponentsLogger.LogLevel logLevel2 = ComponentsLogger.LogLevel.ERROR;
                        }
                    }
                }
                if (this.setMin) {
                    this.length.setMax();
                }
                ComponentTree componentTree4 = this.length;
                ThreadUtils.getMax();
                if (!componentTree4.FastBitmap$CoordinateSystem) {
                    componentTree4.toString = null;
                } else {
                    throw new IllegalStateException("Clearing the LithoView while the ComponentTree is attached");
                }
            }
            this.length = componentTree;
            if (componentTree != null) {
                if (!componentTree.toDoubleRange()) {
                    this.length.getMax(this);
                    if (this.setMin) {
                        this.length.getMin();
                    } else {
                        requestLayout();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Setting a released ComponentTree to a LithoView, released component was: ");
                    sb.append(this.length.Grayscale$Algorithm());
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (this.length == null) {
                str = "set_CT";
            }
            this.onNavigationEvent = str;
        } else if (this.setMin) {
            rebind();
        }
    }

    public void setComponent(isStopped isstopped) {
        ComponentTree componentTree = this.length;
        if (componentTree == null) {
            setComponentTree(ComponentTree.setMax(getComponentContext(), isstopped).length());
        } else if (isstopped != null) {
            setOnScrollChangeListener setonscrollchangelistener = callbackSuccessAsync.length;
            if (setonscrollchangelistener != null) {
                isstopped = setonscrollchangelistener.getMin();
            }
            componentTree.length(isstopped, false, 0, (String) null, (computeVerticalScrollExtent) null);
        } else {
            throw new IllegalArgumentException("Root component can't be null");
        }
    }

    public void setComponentAsync(isStopped isstopped) {
        ComponentTree componentTree = this.length;
        if (componentTree == null) {
            setComponentTree(ComponentTree.setMax(getComponentContext(), isstopped).length());
        } else if (isstopped != null) {
            setOnScrollChangeListener setonscrollchangelistener = callbackSuccessAsync.length;
            if (setonscrollchangelistener != null) {
                isstopped = setonscrollchangelistener.getMin();
            }
            componentTree.length(isstopped, true, 0, (String) null, (computeVerticalScrollExtent) null);
        } else {
            throw new IllegalArgumentException("Root component can't be null");
        }
    }

    public void rebind() {
        WindowInsetsCompat$Type$InsetsType windowInsetsCompat$Type$InsetsType = this.getMax;
        ThreadUtils.getMax();
        if (windowInsetsCompat$Type$InsetsType.setMin != null) {
            for (long max : windowInsetsCompat$Type$InsetsType.setMin) {
                ThreadUtils.getMax();
                WindowInsetsAnimationCompat$Callback$DispatchMode max2 = windowInsetsCompat$Type$InsetsType.length.getMax(max, null);
                if (max2 != null && !max2.equals()) {
                    isStopped isstopped = max2.setMin;
                    Object obj = max2.setMax;
                    ensureProcessorRunningLocked ensureprocessorrunninglocked = isstopped.FastBitmap$CoordinateSystem;
                    if (ensureprocessorrunninglocked == null) {
                        ensureprocessorrunninglocked = windowInsetsCompat$Type$InsetsType.toIntRange;
                    }
                    isstopped.setMax(ensureprocessorrunninglocked, obj);
                    max2.equals = true;
                    if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                        View view = (View) obj;
                        if (view.isLayoutRequested()) {
                            WindowInsetsCompat$Type$InsetsType.setMax(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
                        }
                    }
                }
            }
        }
    }

    public void unbind() {
        this.getMax.IsOverlapping();
    }

    /* access modifiers changed from: package-private */
    public void clearComponentTree() {
        ThreadUtils.getMax();
        if (!this.setMin) {
            this.length = null;
            this.onNavigationEvent = "clear_CT";
            return;
        }
        throw new IllegalStateException("Trying to clear the ComponentTree while attached.");
    }

    public void setVisibilityHint(boolean z) {
        ThreadUtils.getMax();
        ComponentTree componentTree = this.length;
        if (componentTree != null && componentTree.isInside()) {
            if (z) {
                Rect isInside2 = NotificationCompatSideChannelService.isInside();
                if (getLocalVisibleRect(isInside2)) {
                    ComponentTree componentTree2 = this.length;
                    ThreadUtils.getMax();
                    if (!componentTree2.hashCode) {
                        throw new IllegalStateException("Calling processVisibilityOutputs() but incremental mount is not enabled");
                    } else if (!(componentTree2.toString == null || componentTree2.ICustomTabsCallback == null)) {
                        Rect isInside3 = NotificationCompatSideChannelService.isInside();
                        if (componentTree2.toString.getLocalVisibleRect(isInside3)) {
                            componentTree2.toString.processVisibilityOutputs(componentTree2.ICustomTabsCallback, isInside3);
                        }
                        NotificationCompatSideChannelService.setMax(isInside3);
                    }
                }
                NotificationCompatSideChannelService.setMax(isInside2);
                return;
            }
            this.getMax.setMin();
        }
    }

    public void setHasTransientState(boolean z) {
        ComponentTree componentTree;
        ComponentTree componentTree2;
        if (z) {
            if (this.Mean$Arithmetic == 0 && (componentTree2 = this.length) != null && componentTree2.isInside()) {
                Rect isInside2 = NotificationCompatSideChannelService.isInside();
                isInside2.set(0, 0, getWidth(), getHeight());
                performIncrementalMount(isInside2, false);
                NotificationCompatSideChannelService.setMax(isInside2);
            }
            this.Mean$Arithmetic++;
        } else {
            int i = this.Mean$Arithmetic - 1;
            this.Mean$Arithmetic = i;
            if (i == 0 && (componentTree = this.length) != null && componentTree.isInside()) {
                performIncrementalMount();
            }
            if (this.Mean$Arithmetic < 0) {
                this.Mean$Arithmetic = 0;
            }
        }
        super.setHasTransientState(z);
    }

    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        length();
    }

    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        length();
    }

    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            length();
        }
    }

    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            length();
        }
    }

    public void draw(Canvas canvas) {
        ComponentsLogger componentsLogger;
        startNestedScroll startnestedscroll = null;
        if (getComponentTree() == null) {
            componentsLogger = null;
        } else {
            componentsLogger = getComponentTree().toFloatRange.getMin;
        }
        if (componentsLogger != null) {
            startnestedscroll = ViewCompat$FocusRelativeDirection.setMax(getComponentContext(), componentsLogger, componentsLogger.getMax());
        }
        if (startnestedscroll != null) {
            setPerfEvent(startnestedscroll);
        }
        super.draw(canvas);
        if (startnestedscroll != null) {
            getComponentTree().equals();
        }
    }

    private void length() {
        ComponentTree componentTree = this.length;
        if (componentTree != null && componentTree.isInside() && (getParent() instanceof View)) {
            int width = ((View) getParent()).getWidth();
            int height = ((View) getParent()).getHeight();
            int translationX = (int) getTranslationX();
            int translationY = (int) getTranslationY();
            int top = getTop() + translationY;
            int bottom = getBottom() + translationY;
            int left = getLeft() + translationX;
            int right = getRight() + translationX;
            if (left < 0 || top < 0 || right > width || bottom > height || this.getMin.width() != getWidth() || this.getMin.height() != getHeight()) {
                Rect isInside2 = NotificationCompatSideChannelService.isInside();
                if (!getLocalVisibleRect(isInside2)) {
                    NotificationCompatSideChannelService.setMax(isInside2);
                    return;
                }
                performIncrementalMount(isInside2, true);
                NotificationCompatSideChannelService.setMax(isInside2);
            }
        }
    }

    private boolean setMax() {
        if (this.length.ICustomTabsCallback != null) {
            return true;
        }
        if (isLayoutRequested()) {
            return false;
        }
        throw new RuntimeException("Trying to incrementally mount a component with a null main thread LayoutState on a LithoView that hasn't requested layout!");
    }

    public void performIncrementalMount(Rect rect, boolean z) {
        if (this.length != null && setMax()) {
            if (this.length.isInside()) {
                this.length.setMax(rect, z);
                return;
            }
            throw new IllegalStateException("To perform incremental mounting, you need first to enable it when creating the ComponentTree.");
        }
    }

    public void performIncrementalMount() {
        ComponentTree componentTree = this.length;
        if (componentTree != null && componentTree.ICustomTabsCallback != null) {
            if (this.length.isInside()) {
                this.length.getMax();
                return;
            }
            throw new IllegalStateException("To perform incremental mounting, you need first to enable it when creating the ComponentTree.");
        }
    }

    public boolean isIncrementalMountEnabled() {
        ComponentTree componentTree = this.length;
        return componentTree != null && componentTree.isInside();
    }

    public void release() {
        LayoutState layoutState;
        LayoutState layoutState2;
        ThreadUtils.getMax();
        ComponentTree componentTree = this.length;
        if (componentTree == null) {
            return;
        }
        if (!componentTree.equals) {
            synchronized (componentTree) {
                ComponentTree.setMax.removeMessages(1, componentTree);
                synchronized (componentTree.toDoubleRange) {
                    if (componentTree.Grayscale$Algorithm != null) {
                        componentTree.values.removeCallbacks(componentTree.Grayscale$Algorithm);
                        componentTree.Grayscale$Algorithm = null;
                    }
                }
                synchronized (componentTree.IsOverlapping) {
                    if (componentTree.toIntRange != null) {
                        componentTree.values.removeCallbacks(componentTree.toIntRange);
                        componentTree.toIntRange = null;
                    }
                }
                synchronized (componentTree.Mean$Arithmetic) {
                    for (int i = 0; i < componentTree.valueOf.size(); i++) {
                        componentTree.valueOf.get(i).setMax();
                    }
                    componentTree.valueOf.clear();
                }
                if (componentTree.isInside != null) {
                    componentTree.isInside.removeCallbacks(componentTree.getMax);
                }
                componentTree.length = true;
                componentTree.setMin = componentTree.b.valueOf;
                if (componentTree.toString != null) {
                    componentTree.toString.setComponentTree((ComponentTree) null);
                }
                componentTree.b = null;
                componentTree.FastBitmap$CoordinateSystem();
                layoutState = componentTree.ICustomTabsCallback;
                componentTree.ICustomTabsCallback = null;
                layoutState2 = componentTree.create;
                componentTree.create = null;
                componentTree.onNavigationEvent = null;
                if (componentTree.onMessageChannelReady != null && !componentTree.extraCallbackWithResult) {
                    NotificationCompatSideChannelService.getMin(componentTree.onMessageChannelReady);
                }
                componentTree.onMessageChannelReady = null;
                componentTree.extraCallbackWithResult = false;
            }
            if (layoutState != null) {
                layoutState.length();
            }
            if (layoutState2 != null) {
                layoutState2.length();
            }
            synchronized (componentTree.asBinder) {
                componentTree.asBinder.getMin();
            }
            this.length = null;
            this.onNavigationEvent = "release_CT";
            return;
        }
        throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [o.AbsSavedState, com.facebook.litho.Transition] */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0283 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mount(com.facebook.litho.LayoutState r25, android.graphics.Rect r26, boolean r27) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            int r2 = r1.Mean$Arithmetic
            r9 = 1
            r10 = 0
            if (r2 <= 0) goto L_0x0030
            com.facebook.litho.ComponentTree r2 = r1.length
            if (r2 == 0) goto L_0x0030
            boolean r2 = r2.isInside()
            if (r2 == 0) goto L_0x0030
            o.WindowInsetsCompat$Type$InsetsType r2 = r1.getMax
            boolean r2 = r2.getMax()
            if (r2 != 0) goto L_0x001d
            return
        L_0x001d:
            android.graphics.Rect r2 = o.NotificationCompatSideChannelService.isInside()
            int r3 = r24.getWidth()
            int r4 = r24.getHeight()
            r2.set(r10, r10, r3, r4)
            r11 = r2
            r12 = 0
            r13 = 1
            goto L_0x0035
        L_0x0030:
            r11 = r26
            r12 = r27
            r13 = 0
        L_0x0035:
            if (r11 != 0) goto L_0x003d
            android.graphics.Rect r2 = r1.getMin
            r2.setEmpty()
            goto L_0x0042
        L_0x003d:
            android.graphics.Rect r2 = r1.getMin
            r2.set(r11)
        L_0x0042:
            o.WindowInsetsCompat$Type$InsetsType r14 = r1.getMax
            com.facebook.litho.ThreadUtils.getMax()
            if (r0 == 0) goto L_0x0379
            com.facebook.litho.LithoView r2 = r14.toFloatRange
            com.facebook.litho.ComponentTree r2 = r2.getComponentTree()
            if (r11 == 0) goto L_0x0053
            r15 = 1
            goto L_0x0054
        L_0x0053:
            r15 = 0
        L_0x0054:
            o.NotificationCompat$StreamType.setMin()
            o.ensureProcessorRunningLocked r3 = r2.toFloatRange
            com.facebook.litho.ComponentsLogger r8 = r3.getMin
            int r7 = r0.Mean$Arithmetic
            int r3 = r14.toString
            if (r7 == r3) goto L_0x0064
            r14.isInside()
        L_0x0064:
            r6 = 0
            if (r8 != 0) goto L_0x006a
            r16 = r6
            goto L_0x0076
        L_0x006a:
            o.ensureProcessorRunningLocked r3 = r2.toFloatRange
            o.startNestedScroll r4 = r8.getMax()
            o.startNestedScroll r3 = o.ViewCompat$FocusRelativeDirection.setMax(r3, r8, r4)
            r16 = r3
        L_0x0076:
            boolean r3 = r14.setMax
            if (r3 == 0) goto L_0x00cc
            boolean r3 = r14.setMax
            if (r3 == 0) goto L_0x00c4
            o.NotificationCompat$StreamType.setMin()
            int r3 = r0.Mean$Arithmetic     // Catch:{ all -> 0x00c2 }
            int r4 = r14.toString     // Catch:{ all -> 0x00c2 }
            if (r4 == r3) goto L_0x008f
            r14.toIntRange()     // Catch:{ all -> 0x00c2 }
            boolean r3 = r14.toDoubleRange     // Catch:{ all -> 0x00c2 }
            if (r3 != 0) goto L_0x008f
            goto L_0x00bb
        L_0x008f:
            java.util.Map<o.pageScroll, o.hide<o.WindowInsetsAnimationCompat$Callback$DispatchMode>> r3 = r14.invokeSuspend     // Catch:{ all -> 0x00c2 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00c2 }
            if (r3 != 0) goto L_0x009a
            r14.length((com.facebook.litho.LayoutState) r0)     // Catch:{ all -> 0x00c2 }
        L_0x009a:
            boolean r3 = r14.setMax((com.facebook.litho.LayoutState) r0)     // Catch:{ all -> 0x00c2 }
            if (r3 == 0) goto L_0x00ae
            r14.getMax((com.facebook.litho.LayoutState) r0, (com.facebook.litho.ComponentTree) r2)     // Catch:{ all -> 0x00c2 }
            boolean r2 = r14.equals()     // Catch:{ all -> 0x00c2 }
            if (r2 == 0) goto L_0x00ae
            com.facebook.litho.Transition r2 = r14.invoke     // Catch:{ all -> 0x00c2 }
            r14.getMin((com.facebook.litho.LayoutState) r0, (com.facebook.litho.Transition) r2)     // Catch:{ all -> 0x00c2 }
        L_0x00ae:
            r14.valueOf = r6     // Catch:{ all -> 0x00c2 }
            java.util.HashSet<o.pageScroll> r2 = r14.values     // Catch:{ all -> 0x00c2 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00c2 }
            if (r2 != 0) goto L_0x00bb
            r14.getMin((com.facebook.litho.LayoutState) r0)     // Catch:{ all -> 0x00c2 }
        L_0x00bb:
            r14.getMin((boolean) r9)
            r14.setMin((com.facebook.litho.LayoutState) r0)
            goto L_0x00cc
        L_0x00c2:
            r0 = move-exception
            throw r0
        L_0x00c4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Should only process transitions on dirty mounts"
            r0.<init>(r2)
            throw r0
        L_0x00cc:
            o.WindowInsetsCompat$Type$InsetsType$setMax r2 = r14.IsOverlapping
            r2.IsOverlapping = r10
            r2.toDoubleRange = r10
            r2.hashCode = r10
            r2.toString = r10
            r3 = 0
            r2.values = r3
            boolean r3 = r2.Mean$Arithmetic
            if (r3 == 0) goto L_0x010b
            java.util.List<java.lang.String> r3 = r2.getMin
            r3.clear()
            java.util.List<java.lang.String> r3 = r2.setMin
            r3.clear()
            java.util.List<java.lang.String> r3 = r2.length
            r3.clear()
            java.util.List<java.lang.String> r3 = r2.getMax
            r3.clear()
            java.util.List<java.lang.String> r3 = r2.setMax
            r3.clear()
            java.util.List<java.lang.Double> r3 = r2.equals
            r3.clear()
            java.util.List<java.lang.Double> r3 = r2.isInside
            r3.clear()
            java.util.List<java.lang.Double> r3 = r2.toFloatRange
            r3.clear()
            java.util.List<java.lang.Double> r3 = r2.toIntRange
            r3.clear()
        L_0x010b:
            r2.FastBitmap$CoordinateSystem = r10
            if (r16 == 0) goto L_0x015e
            boolean r2 = r8.setMax()
            if (r2 == 0) goto L_0x015e
            o.WindowInsetsCompat$Type$InsetsType$setMax r2 = r14.IsOverlapping
            r2.FastBitmap$CoordinateSystem = r9
            boolean r3 = r2.Mean$Arithmetic
            if (r3 != 0) goto L_0x015e
            r2.Mean$Arithmetic = r9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.getMin = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.setMin = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.length = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.getMax = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.setMax = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.equals = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.isInside = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.toFloatRange = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.toIntRange = r3
        L_0x015e:
            if (r15 == 0) goto L_0x016e
            boolean r2 = r14.setMax(r0, r11, r12)
            if (r2 != 0) goto L_0x0167
            goto L_0x016e
        L_0x0167:
            r1 = r6
            r23 = r7
            r22 = r8
            goto L_0x029e
        L_0x016e:
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r2 = r14.length
            r3 = 0
            java.lang.Object r2 = r2.getMax(r3, r6)
            r5 = r2
            o.WindowInsetsAnimationCompat$Callback$DispatchMode r5 = (o.WindowInsetsAnimationCompat$Callback$DispatchMode) r5
            java.util.List<com.facebook.litho.LayoutOutput> r2 = r0.toFloatRange
            int r4 = r2.size()
            r3 = 0
        L_0x0180:
            if (r3 >= r4) goto L_0x0294
            java.util.List<com.facebook.litho.LayoutOutput> r2 = r0.toFloatRange
            java.lang.Object r2 = r2.get(r3)
            com.facebook.litho.LayoutOutput r2 = (com.facebook.litho.LayoutOutput) r2
            o.isStopped r10 = r2.getMin
            com.facebook.litho.ThreadUtils.getMax()
            o.PlaybackStateCompat$ShuffleMode<o.WindowInsetsAnimationCompat$Callback$DispatchMode> r9 = r14.length
            long[] r1 = r14.setMin
            r27 = r7
            r26 = r8
            r7 = r1[r3]
            java.lang.Object r1 = r9.getMax(r7, r6)
            o.WindowInsetsAnimationCompat$Callback$DispatchMode r1 = (o.WindowInsetsAnimationCompat$Callback$DispatchMode) r1
            if (r1 == 0) goto L_0x01a3
            r7 = 1
            goto L_0x01a4
        L_0x01a3:
            r7 = 0
        L_0x01a4:
            if (r15 == 0) goto L_0x01c1
            boolean r8 = o.WindowInsetsCompat$Type$InsetsType.getMax((o.WindowInsetsAnimationCompat$Callback$DispatchMode) r1)
            if (r8 != 0) goto L_0x01c1
            android.graphics.Rect r8 = r2.setMax
            boolean r8 = android.graphics.Rect.intersects(r11, r8)
            if (r8 != 0) goto L_0x01c1
            boolean r8 = r14.getMax((int) r3)
            if (r8 != 0) goto L_0x01c1
            if (r1 == 0) goto L_0x01bf
            if (r1 != r5) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r8 = 0
            goto L_0x01c2
        L_0x01c1:
            r8 = 1
        L_0x01c2:
            if (r8 == 0) goto L_0x01d6
            if (r7 != 0) goto L_0x01d6
            r14.setMin(r3, r2, r0)
            boolean r1 = r14.getMax((int) r3)
            if (r1 == 0) goto L_0x0277
            if (r15 == 0) goto L_0x0277
            o.WindowInsetsCompat$Type$InsetsType.getMin()
            goto L_0x0277
        L_0x01d6:
            if (r8 != 0) goto L_0x01e1
            if (r7 == 0) goto L_0x01e1
            o.PlaybackStateCompat$ShuffleMode<com.facebook.litho.ComponentHost> r1 = r14.equals
            r14.setMax((int) r3, (o.PlaybackStateCompat.ShuffleMode<com.facebook.litho.ComponentHost>) r1)
            goto L_0x0277
        L_0x01e1:
            if (r7 == 0) goto L_0x0277
            boolean r7 = r14.setMax
            if (r7 == 0) goto L_0x0265
            com.facebook.litho.LayoutState r7 = r14.FastBitmap$CoordinateSystem
            if (r7 == 0) goto L_0x01f5
            com.facebook.litho.LayoutState r7 = r14.FastBitmap$CoordinateSystem
            int r7 = r7.invoke
            int r8 = r0.onNavigationEvent
            if (r7 != r8) goto L_0x01f5
            r7 = 1
            goto L_0x01f6
        L_0x01f5:
            r7 = 0
        L_0x01f6:
            long r17 = java.lang.System.nanoTime()
            o.pageScroll r9 = r1.isInside
            r8 = r2
            r2 = r14
            r19 = r3
            r3 = r8
            r20 = r4
            r4 = r25
            r21 = r5
            r5 = r1
            r1 = r6
            r6 = r7
            r8 = r27
            r7 = r8
            r22 = r26
            r23 = r8
            r8 = r19
            boolean r2 = r2.getMax(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0225
            o.smoothScrollBy r3 = r14.hashCode
            if (r3 == 0) goto L_0x0225
            if (r9 != 0) goto L_0x0220
            goto L_0x0225
        L_0x0220:
            o.smoothScrollBy r3 = r14.hashCode
            r3.length((o.pageScroll) r9, (o.hide<java.lang.Object>) r1)
        L_0x0225:
            o.WindowInsetsCompat$Type$InsetsType$setMax r3 = r14.IsOverlapping
            boolean r3 = r3.FastBitmap$CoordinateSystem
            if (r3 == 0) goto L_0x0270
            if (r2 == 0) goto L_0x025c
            o.WindowInsetsCompat$Type$InsetsType$setMax r2 = r14.IsOverlapping
            java.util.List<java.lang.String> r2 = r2.length
            java.lang.String r3 = r10.valueOf
            r2.add(r3)
            o.WindowInsetsCompat$Type$InsetsType$setMax r2 = r14.IsOverlapping
            java.util.List<java.lang.Double> r2 = r2.toFloatRange
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r17
            double r3 = (double) r3
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r5
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.add(r3)
            o.WindowInsetsCompat$Type$InsetsType$setMax r2 = r14.IsOverlapping
            int r3 = r2.hashCode
            r4 = 1
            int r3 = r3 + r4
            r2.hashCode = r3
            goto L_0x0271
        L_0x025c:
            r4 = 1
            o.WindowInsetsCompat$Type$InsetsType$setMax r2 = r14.IsOverlapping
            int r3 = r2.toString
            int r3 = r3 + r4
            r2.toString = r3
            goto L_0x0271
        L_0x0265:
            r22 = r26
            r23 = r27
            r19 = r3
            r20 = r4
            r21 = r5
            r1 = r6
        L_0x0270:
            r4 = 1
        L_0x0271:
            if (r15 == 0) goto L_0x0283
            o.WindowInsetsCompat$Type$InsetsType.getMin()
            goto L_0x0283
        L_0x0277:
            r22 = r26
            r23 = r27
            r19 = r3
            r20 = r4
            r21 = r5
            r1 = r6
            r4 = 1
        L_0x0283:
            int r3 = r19 + 1
            r6 = r1
            r4 = r20
            r5 = r21
            r8 = r22
            r7 = r23
            r9 = 1
            r10 = 0
            r1 = r24
            goto L_0x0180
        L_0x0294:
            r1 = r6
            r23 = r7
            r22 = r8
            if (r15 == 0) goto L_0x029e
            r14.setMax((com.facebook.litho.LayoutState) r0, (android.graphics.Rect) r11)
        L_0x029e:
            r14.length()
            boolean r2 = r14.setMax((com.facebook.litho.LayoutState) r0)
            if (r2 == 0) goto L_0x02c6
            boolean r2 = r14.equals()
            if (r2 == 0) goto L_0x02c6
            o.smoothScrollBy r2 = r14.hashCode
            r2.getMin()
            o.AbsSavedState r3 = r2.isInside
            if (r3 == 0) goto L_0x02c6
            o.AbsSavedState r3 = r2.isInside
            o.smoothScrollBy$setMin r4 = r2.getMax
            r3.getMax(r4)
            o.AbsSavedState r3 = r2.isInside
            o.smoothScrollBy$toFloatRange r4 = r2.IsOverlapping
            r3.setMax((o.dispatchHoverEvent) r4)
            r2.isInside = r1
        L_0x02c6:
            if (r12 == 0) goto L_0x02d1
            o.NotificationCompat$StreamType.getMax()
            r14.setMin((com.facebook.litho.LayoutState) r0, (android.graphics.Rect) r11)
            o.NotificationCompat$StreamType.length()
        L_0x02d1:
            r14.invoke = r1
            r1 = 0
            r14.Grayscale$Algorithm = r1
            r14.setMax = r1
            r14.getMin = r1
            r14.toDoubleRange = r1
            if (r11 == 0) goto L_0x02e3
            android.graphics.Rect r1 = r14.isInside
            r1.set(r11)
        L_0x02e3:
            r14.isInside()
            r1 = r23
            r14.toString = r1
            java.util.concurrent.atomic.AtomicInteger r1 = r0.invokeSuspend
            int r1 = r1.getAndIncrement()
            if (r1 == 0) goto L_0x0371
            r14.FastBitmap$CoordinateSystem = r0
            r14.getMax((com.facebook.litho.LayoutState) r0)
            r0 = 0
            r14.getMin((boolean) r0)
            if (r22 == 0) goto L_0x036b
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            boolean r0 = r0.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x036b
            if (r16 != 0) goto L_0x0308
            goto L_0x036b
        L_0x0308:
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            int r0 = r0.IsOverlapping
            if (r0 == 0) goto L_0x036b
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.String> r0 = r0.getMin
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0319
            goto L_0x036b
        L_0x0319:
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.String> r0 = r0.getMin
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.Double> r0 = r0.equals
            java.lang.Double[] r2 = new java.lang.Double[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.String> r0 = r0.setMin
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.Double> r0 = r0.isInside
            java.lang.Double[] r2 = new java.lang.Double[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.String> r0 = r0.setMax
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.String> r0 = r0.length
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.Double> r0 = r0.toFloatRange
            java.lang.Double[] r2 = new java.lang.Double[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.String> r0 = r0.getMax
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.toArray(r2)
            o.WindowInsetsCompat$Type$InsetsType$setMax r0 = r14.IsOverlapping
            java.util.List<java.lang.Double> r0 = r0.toIntRange
            java.lang.Double[] r1 = new java.lang.Double[r1]
            r0.toArray(r1)
        L_0x036b:
            if (r13 == 0) goto L_0x0370
            o.NotificationCompatSideChannelService.setMax((android.graphics.Rect) r11)
        L_0x0370:
            return
        L_0x0371:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to use a released LayoutState"
            r0.<init>(r1)
            throw r0
        L_0x0379:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to mount a null layoutState"
            r0.<init>(r1)
            goto L_0x0382
        L_0x0381:
            throw r0
        L_0x0382:
            goto L_0x0381
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.mount(com.facebook.litho.LayoutState, android.graphics.Rect, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public void processVisibilityOutputs(LayoutState layoutState, Rect rect) {
        this.getMax.setMin(layoutState, rect);
    }

    public void unmountAllItems() {
        WindowInsetsCompat$Type$InsetsType windowInsetsCompat$Type$InsetsType = this.getMax;
        ThreadUtils.getMax();
        if (windowInsetsCompat$Type$InsetsType.setMin != null) {
            for (int length2 = windowInsetsCompat$Type$InsetsType.setMin.length - 1; length2 >= 0; length2--) {
                windowInsetsCompat$Type$InsetsType.setMax(length2, windowInsetsCompat$Type$InsetsType.equals);
            }
            windowInsetsCompat$Type$InsetsType.isInside.setEmpty();
            windowInsetsCompat$Type$InsetsType.getMin = true;
        }
        this.getMin.setEmpty();
    }

    public Rect getPreviousMountBounds() {
        return this.getMin;
    }

    /* access modifiers changed from: package-private */
    public void setMountStateDirty() {
        WindowInsetsCompat$Type$InsetsType windowInsetsCompat$Type$InsetsType = this.getMax;
        ThreadUtils.getMax();
        windowInsetsCompat$Type$InsetsType.setMax = true;
        windowInsetsCompat$Type$InsetsType.isInside.setEmpty();
        this.getMin.setEmpty();
    }

    /* access modifiers changed from: package-private */
    public boolean isMountStateDirty() {
        return this.getMax.getMax();
    }

    /* access modifiers changed from: package-private */
    public boolean mountStateNeedsRemount() {
        return this.getMax.setMax();
    }

    public WindowInsetsCompat$Type$InsetsType getMountState() {
        return this.getMax;
    }

    public void setInvalidStateLogParamsList(@Nullable List<dequeueWork> list) {
        if (list == null) {
            this.Grayscale$Algorithm = null;
            return;
        }
        this.Grayscale$Algorithm = new HashMap();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dequeueWork dequeuework = list.get(i);
            this.Grayscale$Algorithm.put(dequeuework.length, dequeuework);
        }
    }

    /* access modifiers changed from: package-private */
    @DoNotStrip
    @VisibleForTesting(otherwise = 2)
    public Deque<TestItem> findTestItems(String str) {
        WindowInsetsCompat$Type$InsetsType windowInsetsCompat$Type$InsetsType = this.getMax;
        if (windowInsetsCompat$Type$InsetsType.getMax != null) {
            Deque<TestItem> deque = windowInsetsCompat$Type$InsetsType.getMax.get(str);
            return deque == null ? new LinkedList() : deque;
        }
        throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
    }

    static class setMin extends setSupportProgressBarVisibility.setMin {
        private final WeakReference<LithoView> getMin;

        /* synthetic */ setMin(LithoView lithoView, byte b) {
            this(lithoView);
        }

        private setMin(LithoView lithoView) {
            this.getMin = new WeakReference<>(lithoView);
        }

        public final void getMax(boolean z) {
            getExecutor.setMax();
            LithoView lithoView = this.getMin.get();
            if (lithoView != null) {
                lithoView.rerenderForAccessibility(z);
            }
        }
    }

    public void rerenderForAccessibility(boolean z) {
        refreshAccessibilityDelegatesIfNeeded(z);
        forceRelayout();
    }

    public String toString() {
        return LithoViewTestHelper.viewToString(this, true);
    }
}
