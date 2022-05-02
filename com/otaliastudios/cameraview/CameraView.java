package com.otaliastudios.cameraview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.media.MediaActionSound;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.google.firebase.messaging.Constants;
import com.otaliastudios.cameraview.controls.Audio;
import com.otaliastudios.cameraview.controls.Engine;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Grid;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.Mode;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.controls.Preview;
import com.otaliastudios.cameraview.controls.VideoCodec;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.engine.orchestrator.CameraState;
import com.otaliastudios.cameraview.gesture.Gesture;
import com.otaliastudios.cameraview.gesture.GestureAction;
import com.otaliastudios.cameraview.internal.GridLinesLayout;
import com.otaliastudios.cameraview.markers.AutoFocusTrigger;
import com.otaliastudios.cameraview.markers.MarkerLayout;
import com.otaliastudios.cameraview.overlay.Overlay;
import com.otaliastudios.cameraview.overlay.OverlayLayout;
import id.dana.util.permission.ManifestPermission;
import java.io.File;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.RecyclerView;
import o.calculateDtToFit;
import o.calculateDyToMakeVisible;
import o.clearOnScrollListeners;
import o.createLayoutManager;
import o.dispatchContentChangedIfNecessary;
import o.dispatchOnCancelled;
import o.ensureBottomGlow;
import o.ensureLeftGlow;
import o.exceptionLabel;
import o.getAccessibilityClassName;
import o.getItemAnimator;
import o.hasUpdatedView;
import o.initAutofill;
import o.initChildrenHelper;
import o.isComputingLayout;
import o.isPreferredNextFocus;
import o.nestedScrollBy;
import o.nestedScrollByInternal;
import o.onCancelLoad;
import o.onCanceled;
import o.onEnterLayoutOrScroll;
import o.onExitLayoutOrScroll;
import o.postAnimationRunner;
import o.predictiveItemAnimationsEnabled;
import o.pullGlows;
import o.removeItemDecoration;
import o.removeOnScrollListener;
import o.scrollByInternal;
import o.scrollStep;
import o.setAccessibilityDelegateCompat;
import o.setChecked;
import o.setChildDrawingOrderCallback;
import o.setEdgeEffectFactory;
import o.setItemAnimator;
import o.setOnScrollListener;
import o.shouldDeferAccessibilityEvent;
import o.showsIcon;
import o.stopInterceptRequestLayout;
import o.stopScroll;
import o.suppressLayout;
import o.updateActionForInterimTarget;

public class CameraView extends FrameLayout implements showsIcon {
    static final long DEFAULT_AUTOFOCUS_RESET_DELAY_MILLIS = 3000;
    static final int DEFAULT_FRAME_PROCESSING_EXECUTORS = 1;
    static final int DEFAULT_FRAME_PROCESSING_POOL_SIZE = 2;
    static final boolean DEFAULT_PICTURE_METERING = true;
    static final boolean DEFAULT_PICTURE_SNAPSHOT_METERING = false;
    static final boolean DEFAULT_PLAY_SOUNDS = true;
    static final boolean DEFAULT_REQUEST_PERMISSIONS = true;
    static final boolean DEFAULT_USE_DEVICE_ORIENTATION = true;
    public static final int PERMISSION_REQUEST_CODE = 16;
    private static final CameraLogger getMax;
    private static final String setMin;
    /* access modifiers changed from: private */
    public ensureLeftGlow FastBitmap$CoordinateSystem;
    private Lifecycle Grayscale$Algorithm;
    private setChildDrawingOrderCallback IsOverlapping;
    /* access modifiers changed from: private */
    public shouldDeferAccessibilityEvent Mean$Arithmetic;
    private boolean create;
    private int equals;
    private boolean getCause;
    private boolean getMin;
    /* access modifiers changed from: private */
    public Executor hashCode;
    /* access modifiers changed from: private */
    public ensureBottomGlow invoke;
    /* access modifiers changed from: private */
    public boolean invokeSuspend;
    private Preview isInside;
    /* access modifiers changed from: private */
    public boolean length;
    @VisibleForTesting
    length mCameraCallbacks;
    @VisibleForTesting
    List<nestedScrollBy> mFrameProcessors = new CopyOnWriteArrayList();
    @VisibleForTesting
    GridLinesLayout mGridLinesLayout;
    @VisibleForTesting
    List<updateActionForInterimTarget> mListeners = new CopyOnWriteArrayList();
    @VisibleForTesting
    MarkerLayout mMarkerLayout;
    @VisibleForTesting
    OverlayLayout mOverlayLayout;
    @VisibleForTesting
    hasUpdatedView mPinchGestureFinder;
    @VisibleForTesting
    suppressLayout mScrollGestureFinder;
    @VisibleForTesting
    stopScroll mTapGestureFinder;
    /* access modifiers changed from: private */
    public boolean setMax;
    private onEnterLayoutOrScroll toDoubleRange;
    private HashMap<Gesture, GestureAction> toFloatRange = new HashMap<>(4);
    private Engine toIntRange;
    /* access modifiers changed from: private */
    public initChildrenHelper toString;
    private MediaActionSound valueOf;
    /* access modifiers changed from: private */
    public Handler values;

    private static String length(int i) {
        if (i == Integer.MIN_VALUE) {
            return "AT_MOST";
        }
        if (i == 0) {
            return "UNSPECIFIED";
        }
        if (i != 1073741824) {
            return null;
        }
        return "EXACTLY";
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    static {
        String simpleName = CameraView.class.getSimpleName();
        setMin = simpleName;
        getMax = CameraLogger.setMin(simpleName);
    }

    public CameraView(@NonNull Context context) {
        super(context, (AttributeSet) null);
        setMax(context, (AttributeSet) null);
    }

    public CameraView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setMax(context, attributeSet);
    }

    private void setMax(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        Context context2 = context;
        boolean isInEditMode = isInEditMode();
        this.getCause = isInEditMode;
        if (!isInEditMode) {
            setWillNotDraw(false);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, calculateDyToMakeVisible.setMax.length, 0, 0);
            setAccessibilityDelegateCompat setaccessibilitydelegatecompat = new setAccessibilityDelegateCompat(context2, obtainStyledAttributes);
            boolean z = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.ICustomTabsCallback$Stub$Proxy, true);
            boolean z2 = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.mayLaunchUrl, true);
            this.create = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.toFloatRange, false);
            this.getMin = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.setDefaultImpl, true);
            this.isInside = Preview.fromValue(setaccessibilitydelegatecompat.getMin);
            this.toIntRange = Engine.fromValue(setaccessibilitydelegatecompat.equals);
            int color = obtainStyledAttributes.getColor(calculateDyToMakeVisible.setMax.b, GridLinesLayout.DEFAULT_COLOR);
            long j = (long) obtainStyledAttributes.getFloat(calculateDyToMakeVisible.setMax.validateRelationship, 0.0f);
            int integer = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.postMessage, 0);
            int integer2 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.extraCommand, 0);
            int integer3 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.setMax, 0);
            float f = obtainStyledAttributes.getFloat(calculateDyToMakeVisible.setMax.ICustomTabsService, 0.0f);
            int i = integer;
            long integer4 = (long) obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.getMin, 3000);
            boolean z3 = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.onMessageChannelReady, true);
            float f2 = f;
            boolean z4 = obtainStyledAttributes.getBoolean(calculateDyToMakeVisible.setMax.getDefaultImpl, false);
            long j2 = integer4;
            int integer5 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.warmup, 0);
            int integer6 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.newSession, 0);
            int integer7 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.hashCode, 0);
            int integer8 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.toDoubleRange, 0);
            int integer9 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.values, 0);
            int integer10 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.toString, 2);
            int integer11 = obtainStyledAttributes.getInteger(calculateDyToMakeVisible.setMax.FastBitmap$CoordinateSystem, 1);
            postAnimationRunner postanimationrunner = new postAnimationRunner(obtainStyledAttributes);
            int i2 = integer11;
            scrollByInternal scrollbyinternal = new scrollByInternal(obtainStyledAttributes);
            isPreferredNextFocus ispreferrednextfocus = new isPreferredNextFocus(obtainStyledAttributes);
            setOnScrollListener setonscrolllistener = new setOnScrollListener(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            this.mCameraCallbacks = new length();
            this.values = new Handler(Looper.getMainLooper());
            this.mPinchGestureFinder = new hasUpdatedView(this.mCameraCallbacks);
            this.mTapGestureFinder = new stopScroll(this.mCameraCallbacks);
            this.mScrollGestureFinder = new suppressLayout(this.mCameraCallbacks);
            this.mGridLinesLayout = new GridLinesLayout(context2);
            this.mOverlayLayout = new OverlayLayout(context2);
            this.mMarkerLayout = new MarkerLayout(context2);
            addView(this.mGridLinesLayout);
            addView(this.mMarkerLayout);
            addView(this.mOverlayLayout);
            getMin();
            setPlaySounds(z);
            setUseDeviceOrientation(z2);
            setGrid(Grid.fromValue(setaccessibilitydelegatecompat.getMax));
            setGridColor(color);
            setFacing(Facing.fromValue(setaccessibilitydelegatecompat.setMin));
            setFlash(Flash.fromValue(setaccessibilitydelegatecompat.setMax));
            setMode(Mode.fromValue(setaccessibilitydelegatecompat.IsOverlapping));
            setWhiteBalance(WhiteBalance.fromValue(setaccessibilitydelegatecompat.length));
            setHdr(Hdr.fromValue(setaccessibilitydelegatecompat.isInside));
            setAudio(Audio.fromValue(setaccessibilitydelegatecompat.toIntRange));
            setAudioBitRate(integer3);
            setPictureSize(postanimationrunner.getMax);
            setPictureMetering(z3);
            setPictureSnapshotMetering(z4);
            setPictureFormat(PictureFormat.fromValue(setaccessibilitydelegatecompat.values));
            setVideoSize(postanimationrunner.setMin);
            setVideoCodec(VideoCodec.fromValue(setaccessibilitydelegatecompat.toFloatRange));
            setVideoMaxSize(j);
            setVideoMaxDuration(i);
            setVideoBitRate(integer2);
            setAutoFocusResetDelay(j2);
            setPreviewFrameRate(f2);
            setSnapshotMaxWidth(integer5);
            setSnapshotMaxHeight(integer6);
            setFrameProcessingMaxWidth(integer7);
            setFrameProcessingMaxHeight(integer8);
            setFrameProcessingFormat(integer9);
            setFrameProcessingPoolSize(integer10);
            setFrameProcessingExecutors(i2);
            scrollByInternal scrollbyinternal2 = scrollbyinternal;
            mapGesture(Gesture.TAP, GestureAction.fromValue(scrollbyinternal2.setMax));
            mapGesture(Gesture.LONG_TAP, GestureAction.fromValue(scrollbyinternal2.length));
            mapGesture(Gesture.PINCH, GestureAction.fromValue(scrollbyinternal2.getMin));
            mapGesture(Gesture.SCROLL_HORIZONTAL, GestureAction.fromValue(scrollbyinternal2.setMin));
            mapGesture(Gesture.SCROLL_VERTICAL, GestureAction.fromValue(scrollbyinternal2.getMax));
            setAutoFocusMarker(ispreferrednextfocus.length);
            setFilter(setonscrolllistener.length);
            this.FastBitmap$CoordinateSystem = new ensureLeftGlow(context2, this.mCameraCallbacks);
        }
    }

    private void getMin() {
        getMax.getMax(2, "doInstantiateEngine:", "instantiating. engine:", this.toIntRange);
        initChildrenHelper instantiateCameraEngine = instantiateCameraEngine(this.toIntRange, this.mCameraCallbacks);
        this.toString = instantiateCameraEngine;
        getMax.getMax(2, "doInstantiateEngine:", "instantiated. engine:", instantiateCameraEngine.getClass().getSimpleName());
        this.toString.length((Overlay) this.mOverlayLayout);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public void doInstantiatePreview() {
        getMax.getMax(2, "doInstantiateEngine:", "instantiating. preview:", this.isInside);
        onEnterLayoutOrScroll instantiatePreview = instantiatePreview(this.isInside, getContext(), this);
        this.toDoubleRange = instantiatePreview;
        getMax.getMax(2, "doInstantiateEngine:", "instantiated. preview:", instantiatePreview.getClass().getSimpleName());
        this.toString.getMin(this.toDoubleRange);
        setChildDrawingOrderCallback setchilddrawingordercallback = this.IsOverlapping;
        if (setchilddrawingordercallback != null) {
            setFilter(setchilddrawingordercallback);
            this.IsOverlapping = null;
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    public initChildrenHelper instantiateCameraEngine(@NonNull Engine engine, @NonNull initChildrenHelper.length length2) {
        if (this.create && engine == Engine.CAMERA2 && Build.VERSION.SDK_INT >= 21) {
            return new initAutofill(length2);
        }
        this.toIntRange = Engine.CAMERA1;
        return new getAccessibilityClassName(length2);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public onEnterLayoutOrScroll instantiatePreview(@NonNull Preview preview, @NonNull Context context, @NonNull ViewGroup viewGroup) {
        int i = AnonymousClass10.getMax[preview.ordinal()];
        if (i == 1) {
            return new onExitLayoutOrScroll(context, viewGroup);
        }
        if (i == 2 && isHardwareAccelerated()) {
            return new getItemAnimator(context, viewGroup);
        }
        this.isInside = Preview.GL_SURFACE;
        return new setItemAnimator(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.getCause) {
            if (this.toDoubleRange == null) {
                doInstantiatePreview();
            }
            this.FastBitmap$CoordinateSystem.setMin();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (!this.getCause) {
            ensureLeftGlow ensureleftglow = this.FastBitmap$CoordinateSystem;
            ensureleftglow.getMin.disable();
            if (Build.VERSION.SDK_INT >= 17) {
                ((DisplayManager) ensureleftglow.getMax.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).unregisterDisplayListener(ensureleftglow.setMin);
            }
            ensureleftglow.length = -1;
            ensureleftglow.setMax = -1;
        }
        this.Mean$Arithmetic = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.getCause) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            return;
        }
        shouldDeferAccessibilityEvent min = this.toString.getMin(Reference.VIEW);
        this.Mean$Arithmetic = min;
        if (min == null) {
            getMax.getMax(2, "onMeasure:", "surface is not ready. Calling default behavior.");
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = (float) this.Mean$Arithmetic.getMax;
        float f2 = (float) this.Mean$Arithmetic.getMin;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!this.toDoubleRange.toFloatRange()) {
            if (mode == 1073741824) {
                mode = Integer.MIN_VALUE;
            }
            if (mode2 == 1073741824) {
                mode2 = Integer.MIN_VALUE;
            }
        } else {
            if (mode == Integer.MIN_VALUE && layoutParams.width == -1) {
                mode = 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE && layoutParams.height == -1) {
                mode2 = 1073741824;
            }
        }
        CameraLogger cameraLogger = getMax;
        StringBuilder sb = new StringBuilder("requested dimensions are (");
        sb.append(size);
        sb.append("[");
        sb.append(length(mode));
        sb.append("]x");
        sb.append(size2);
        sb.append("[");
        sb.append(length(mode2));
        sb.append("])");
        cameraLogger.setMax("onMeasure:", sb.toString());
        CameraLogger cameraLogger2 = getMax;
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(f);
        sb2.append("x");
        sb2.append(f2);
        sb2.append(")");
        cameraLogger2.setMax("onMeasure:", "previewSize is", sb2.toString());
        if (mode == 1073741824 && mode2 == 1073741824) {
            CameraLogger cameraLogger3 = getMax;
            StringBuilder sb3 = new StringBuilder("(");
            sb3.append(size);
            sb3.append("x");
            sb3.append(size2);
            sb3.append(")");
            cameraLogger3.setMax("onMeasure:", "both are MATCH_PARENT or fixed value. We adapt.", "This means CROP_CENTER.", sb3.toString());
            super.onMeasure(i, i2);
        } else if (mode == 0 && mode2 == 0) {
            CameraLogger cameraLogger4 = getMax;
            StringBuilder sb4 = new StringBuilder("(");
            sb4.append(f);
            sb4.append("x");
            sb4.append(f2);
            sb4.append(")");
            cameraLogger4.setMax("onMeasure:", "both are completely free.", "We respect that and extend to the whole preview size.", sb4.toString());
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f2, 1073741824));
        } else {
            float f3 = f2 / f;
            if (mode == 0 || mode2 == 0) {
                if (mode == 0) {
                    size = Math.round(((float) size2) / f3);
                } else {
                    size2 = Math.round(((float) size) * f3);
                }
                CameraLogger cameraLogger5 = getMax;
                StringBuilder sb5 = new StringBuilder("(");
                sb5.append(size);
                sb5.append("x");
                sb5.append(size2);
                sb5.append(")");
                cameraLogger5.setMax("onMeasure:", "one dimension was free, we adapted it to fit the ratio.", sb5.toString());
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (mode == 1073741824 || mode2 == 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(Math.round(((float) size2) / f3), size);
                } else {
                    size2 = Math.min(Math.round(((float) size) * f3), size2);
                }
                CameraLogger cameraLogger6 = getMax;
                StringBuilder sb6 = new StringBuilder("(");
                sb6.append(size);
                sb6.append("x");
                sb6.append(size2);
                sb6.append(")");
                cameraLogger6.setMax("onMeasure:", "one dimension was EXACTLY, another AT_MOST.", "We have TRIED to fit the aspect ratio, but it's not guaranteed.", sb6.toString());
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                float f4 = (float) size2;
                float f5 = (float) size;
                if (f4 / f5 >= f3) {
                    size2 = Math.round(f5 * f3);
                } else {
                    size = Math.round(f4 / f3);
                }
                CameraLogger cameraLogger7 = getMax;
                StringBuilder sb7 = new StringBuilder("(");
                sb7.append(size);
                sb7.append("x");
                sb7.append(size2);
                sb7.append(")");
                cameraLogger7.setMax("onMeasure:", "both dimension were AT_MOST.", "We fit the preview aspect ratio.", sb7.toString());
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
        }
    }

    public boolean mapGesture(@NonNull Gesture gesture, @NonNull GestureAction gestureAction) {
        GestureAction gestureAction2 = GestureAction.NONE;
        boolean z = false;
        if (gesture.isAssignableTo(gestureAction)) {
            this.toFloatRange.put(gesture, gestureAction);
            int i = AnonymousClass10.setMax[gesture.ordinal()];
            if (i == 1) {
                hasUpdatedView hasupdatedview = this.mPinchGestureFinder;
                if (this.toFloatRange.get(Gesture.PINCH) != gestureAction2) {
                    z = true;
                }
                hasupdatedview.setMax = z;
            } else if (i == 2 || i == 3) {
                stopScroll stopscroll = this.mTapGestureFinder;
                if (!(this.toFloatRange.get(Gesture.TAP) == gestureAction2 && this.toFloatRange.get(Gesture.LONG_TAP) == gestureAction2)) {
                    z = true;
                }
                stopscroll.setMax = z;
            } else if (i == 4 || i == 5) {
                suppressLayout suppresslayout = this.mScrollGestureFinder;
                if (!(this.toFloatRange.get(Gesture.SCROLL_HORIZONTAL) == gestureAction2 && this.toFloatRange.get(Gesture.SCROLL_VERTICAL) == gestureAction2)) {
                    z = true;
                }
                suppresslayout.setMax = z;
            }
            return true;
        }
        mapGesture(gesture, gestureAction2);
        return false;
    }

    public void clearGesture(@NonNull Gesture gesture) {
        mapGesture(gesture, GestureAction.NONE);
    }

    @NonNull
    public GestureAction getGestureAction(@NonNull Gesture gesture) {
        return this.toFloatRange.get(gesture);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isOpened()) {
            return true;
        }
        RecyclerView invokeSuspend2 = this.toString.invokeSuspend();
        if (invokeSuspend2 != null) {
            if (this.mPinchGestureFinder.length(motionEvent)) {
                getMax.setMax("onTouchEvent", "pinch!");
                getMin(this.mPinchGestureFinder, invokeSuspend2);
            } else if (this.mScrollGestureFinder.length(motionEvent)) {
                getMax.setMax("onTouchEvent", "scroll!");
                getMin(this.mScrollGestureFinder, invokeSuspend2);
            } else if (this.mTapGestureFinder.length(motionEvent)) {
                getMax.setMax("onTouchEvent", "tap!");
                getMin(this.mTapGestureFinder, invokeSuspend2);
            }
            return true;
        }
        throw new IllegalStateException("Options should not be null here.");
    }

    public boolean isOpened() {
        return this.toString.getInterfaceDescriptor.toFloatRange.isAtLeast(CameraState.ENGINE) && this.toString.getInterfaceDescriptor.toIntRange.isAtLeast(CameraState.ENGINE);
    }

    private boolean setMin() {
        return this.toString.getInterfaceDescriptor.toFloatRange == CameraState.OFF && !this.toString.ITrustedWebActivityCallback$Default();
    }

    public void setLifecycleOwner(@NonNull setChecked setchecked) {
        Lifecycle lifecycle = this.Grayscale$Algorithm;
        if (lifecycle != null) {
            lifecycle.length(this);
        }
        Lifecycle lifecycle2 = setchecked.getLifecycle();
        this.Grayscale$Algorithm = lifecycle2;
        lifecycle2.setMax(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void open() {
        if (!this.getCause) {
            onEnterLayoutOrScroll onenterlayoutorscroll = this.toDoubleRange;
            if (onenterlayoutorscroll != null) {
                onenterlayoutorscroll.setMin();
            }
            if (checkPermissions(getAudio())) {
                this.FastBitmap$CoordinateSystem.setMin();
                removeItemDecoration invoke2 = this.toString.invoke();
                int i = this.FastBitmap$CoordinateSystem.length;
                removeItemDecoration.setMin(i);
                invoke2.setMax = i;
                invoke2.length();
                this.toString.areNotificationsEnabled();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void close() {
        if (!this.getCause) {
            this.toString.toFloatRange(false);
            onEnterLayoutOrScroll onenterlayoutorscroll = this.toDoubleRange;
            if (onenterlayoutorscroll != null) {
                onenterlayoutorscroll.IsOverlapping();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        if (!this.getCause) {
            clearCameraListeners();
            clearFrameProcessors();
            this.toString.isInside(true);
            onEnterLayoutOrScroll onenterlayoutorscroll = this.toDoubleRange;
            if (onenterlayoutorscroll != null) {
                onenterlayoutorscroll.isInside();
            }
        }
    }

    public void setExperimental(boolean z) {
        this.create = z;
    }

    public void set(@NonNull createLayoutManager createlayoutmanager) {
        if (createlayoutmanager instanceof Audio) {
            setAudio((Audio) createlayoutmanager);
        } else if (createlayoutmanager instanceof Facing) {
            setFacing((Facing) createlayoutmanager);
        } else if (createlayoutmanager instanceof Flash) {
            setFlash((Flash) createlayoutmanager);
        } else if (createlayoutmanager instanceof Grid) {
            setGrid((Grid) createlayoutmanager);
        } else if (createlayoutmanager instanceof Hdr) {
            setHdr((Hdr) createlayoutmanager);
        } else if (createlayoutmanager instanceof Mode) {
            setMode((Mode) createlayoutmanager);
        } else if (createlayoutmanager instanceof WhiteBalance) {
            setWhiteBalance((WhiteBalance) createlayoutmanager);
        } else if (createlayoutmanager instanceof VideoCodec) {
            setVideoCodec((VideoCodec) createlayoutmanager);
        } else if (createlayoutmanager instanceof Preview) {
            setPreview((Preview) createlayoutmanager);
        } else if (createlayoutmanager instanceof Engine) {
            setEngine((Engine) createlayoutmanager);
        } else if (createlayoutmanager instanceof PictureFormat) {
            setPictureFormat((PictureFormat) createlayoutmanager);
        }
    }

    @NonNull
    public <T extends createLayoutManager> T get(@NonNull Class<T> cls) {
        if (cls == Audio.class) {
            return getAudio();
        }
        if (cls == Facing.class) {
            return getFacing();
        }
        if (cls == Flash.class) {
            return getFlash();
        }
        if (cls == Grid.class) {
            return getGrid();
        }
        if (cls == Hdr.class) {
            return getHdr();
        }
        if (cls == Mode.class) {
            return getMode();
        }
        if (cls == WhiteBalance.class) {
            return getWhiteBalance();
        }
        if (cls == VideoCodec.class) {
            return getVideoCodec();
        }
        if (cls == Preview.class) {
            return getPreview();
        }
        if (cls == Engine.class) {
            return getEngine();
        }
        if (cls == PictureFormat.class) {
            return getPictureFormat();
        }
        throw new IllegalArgumentException("Unknown control class: ".concat(String.valueOf(cls)));
    }

    public void setPreview(@NonNull Preview preview) {
        onEnterLayoutOrScroll onenterlayoutorscroll;
        boolean z = true;
        if (preview != this.isInside) {
            this.isInside = preview;
            if (getWindowToken() == null) {
                z = false;
            }
            if (!z && (onenterlayoutorscroll = this.toDoubleRange) != null) {
                onenterlayoutorscroll.isInside();
                this.toDoubleRange = null;
            }
        }
    }

    @NonNull
    public Preview getPreview() {
        return this.isInside;
    }

    public void setEngine(@NonNull Engine engine) {
        if (setMin()) {
            this.toIntRange = engine;
            initChildrenHelper initchildrenhelper = this.toString;
            getMin();
            onEnterLayoutOrScroll onenterlayoutorscroll = this.toDoubleRange;
            if (onenterlayoutorscroll != null) {
                this.toString.getMin(onenterlayoutorscroll);
            }
            setFacing(initchildrenhelper.ICustomTabsService());
            setFlash(initchildrenhelper.newSession());
            setMode(initchildrenhelper.ICustomTabsCallback$Stub$Proxy());
            setWhiteBalance(initchildrenhelper.newSessionWithExtras());
            setHdr(initchildrenhelper.warmup());
            setAudio(initchildrenhelper.getInterfaceDescriptor());
            setAudioBitRate(initchildrenhelper.onMessageChannelReady());
            setPictureSize(initchildrenhelper.b());
            setPictureFormat(initchildrenhelper.requestPostMessageChannelWithExtras());
            setVideoSize(initchildrenhelper.getCause());
            setVideoCodec(initchildrenhelper.onRelationshipValidationResult());
            setVideoMaxSize(initchildrenhelper.onNavigationEvent());
            setVideoMaxDuration(initchildrenhelper.extraCallbackWithResult());
            setVideoBitRate(initchildrenhelper.extraCallback());
            setAutoFocusResetDelay(initchildrenhelper.setDefaultImpl());
            setPreviewFrameRate(initchildrenhelper.validateRelationship());
            setSnapshotMaxWidth(initchildrenhelper.onPostMessage());
            setSnapshotMaxHeight(initchildrenhelper.onTransact());
            setFrameProcessingMaxWidth(initchildrenhelper.asBinder());
            setFrameProcessingMaxHeight(initchildrenhelper.ICustomTabsCallback$Stub());
            setFrameProcessingFormat(0);
            setFrameProcessingPoolSize(initchildrenhelper.ICustomTabsCallback$Default());
            this.toString.length(!this.mFrameProcessors.isEmpty());
        }
    }

    @NonNull
    public Engine getEngine() {
        return this.toIntRange;
    }

    @Nullable
    public RecyclerView getCameraOptions() {
        return this.toString.invokeSuspend();
    }

    public void setExposureCorrection(float f) {
        RecyclerView cameraOptions = getCameraOptions();
        if (cameraOptions != null) {
            float equals2 = cameraOptions.equals();
            float isInside2 = cameraOptions.isInside();
            if (f < equals2) {
                f = equals2;
            }
            if (f > isInside2) {
                f = isInside2;
            }
            this.toString.setMin(f, new float[]{equals2, isInside2}, (PointF[]) null, false);
        }
    }

    public float getExposureCorrection() {
        return this.toString.extraCommand();
    }

    public void setZoom(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.toString.length(f, (PointF[]) null, false);
    }

    public float getZoom() {
        return this.toString.mayLaunchUrl();
    }

    public void setGrid(@NonNull Grid grid) {
        this.mGridLinesLayout.setGridMode(grid);
    }

    @NonNull
    public Grid getGrid() {
        return this.mGridLinesLayout.getGridMode();
    }

    public void setGridColor(@ColorInt int i) {
        this.mGridLinesLayout.setGridColor(i);
    }

    public int getGridColor() {
        return this.mGridLinesLayout.getGridColor();
    }

    public void setHdr(@NonNull Hdr hdr) {
        this.toString.getMax(hdr);
    }

    @NonNull
    public Hdr getHdr() {
        return this.toString.warmup();
    }

    public void setLocation(double d, double d2) {
        Location location = new Location("Unknown");
        location.setTime(System.currentTimeMillis());
        location.setAltitude(0.0d);
        location.setLatitude(d);
        location.setLongitude(d2);
        this.toString.length(location);
    }

    public void setLocation(@Nullable Location location) {
        this.toString.length(location);
    }

    @Nullable
    public Location getLocation() {
        return this.toString.requestPostMessageChannel();
    }

    public void setWhiteBalance(@NonNull WhiteBalance whiteBalance) {
        this.toString.length(whiteBalance);
    }

    @NonNull
    public WhiteBalance getWhiteBalance() {
        return this.toString.newSessionWithExtras();
    }

    public void setFacing(@NonNull Facing facing) {
        this.toString.setMax(facing);
    }

    @NonNull
    public Facing getFacing() {
        return this.toString.ICustomTabsService();
    }

    /* renamed from: com.otaliastudios.cameraview.CameraView$10  reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] getMax;
        static final /* synthetic */ int[] getMin;
        static final /* synthetic */ int[] length;
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|26|27|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b8 */
        static {
            /*
                com.otaliastudios.cameraview.controls.Facing[] r0 = com.otaliastudios.cameraview.controls.Facing.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                r1 = 1
                com.otaliastudios.cameraview.controls.Facing r2 = com.otaliastudios.cameraview.controls.Facing.BACK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.controls.Facing r3 = com.otaliastudios.cameraview.controls.Facing.FRONT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.otaliastudios.cameraview.gesture.GestureAction[] r2 = com.otaliastudios.cameraview.gesture.GestureAction.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                length = r2
                com.otaliastudios.cameraview.gesture.GestureAction r3 = com.otaliastudios.cameraview.gesture.GestureAction.TAKE_PICTURE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = length     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.otaliastudios.cameraview.gesture.GestureAction r3 = com.otaliastudios.cameraview.gesture.GestureAction.AUTO_FOCUS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = length     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.otaliastudios.cameraview.gesture.GestureAction r4 = com.otaliastudios.cameraview.gesture.GestureAction.ZOOM     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = length     // Catch:{ NoSuchFieldError -> 0x004e }
                com.otaliastudios.cameraview.gesture.GestureAction r5 = com.otaliastudios.cameraview.gesture.GestureAction.EXPOSURE_CORRECTION     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                r4 = 5
                int[] r5 = length     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.otaliastudios.cameraview.gesture.GestureAction r6 = com.otaliastudios.cameraview.gesture.GestureAction.FILTER_CONTROL_1     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r5 = length     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.otaliastudios.cameraview.gesture.GestureAction r6 = com.otaliastudios.cameraview.gesture.GestureAction.FILTER_CONTROL_2     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.otaliastudios.cameraview.gesture.Gesture[] r5 = com.otaliastudios.cameraview.gesture.Gesture.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                setMax = r5
                com.otaliastudios.cameraview.gesture.Gesture r6 = com.otaliastudios.cameraview.gesture.Gesture.PINCH     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r5 = setMax     // Catch:{ NoSuchFieldError -> 0x007f }
                com.otaliastudios.cameraview.gesture.Gesture r6 = com.otaliastudios.cameraview.gesture.Gesture.TAP     // Catch:{ NoSuchFieldError -> 0x007f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r5 = setMax     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.otaliastudios.cameraview.gesture.Gesture r6 = com.otaliastudios.cameraview.gesture.Gesture.LONG_TAP     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                int[] r5 = setMax     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.otaliastudios.cameraview.gesture.Gesture r6 = com.otaliastudios.cameraview.gesture.Gesture.SCROLL_HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r3 = setMax     // Catch:{ NoSuchFieldError -> 0x009d }
                com.otaliastudios.cameraview.gesture.Gesture r5 = com.otaliastudios.cameraview.gesture.Gesture.SCROLL_VERTICAL     // Catch:{ NoSuchFieldError -> 0x009d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r3[r5] = r4     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                com.otaliastudios.cameraview.controls.Preview[] r3 = com.otaliastudios.cameraview.controls.Preview.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                getMax = r3
                com.otaliastudios.cameraview.controls.Preview r4 = com.otaliastudios.cameraview.controls.Preview.SURFACE     // Catch:{ NoSuchFieldError -> 0x00ae }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00ae }
            L_0x00ae:
                int[] r1 = getMax     // Catch:{ NoSuchFieldError -> 0x00b8 }
                com.otaliastudios.cameraview.controls.Preview r3 = com.otaliastudios.cameraview.controls.Preview.TEXTURE     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                int[] r0 = getMax     // Catch:{ NoSuchFieldError -> 0x00c2 }
                com.otaliastudios.cameraview.controls.Preview r1 = com.otaliastudios.cameraview.controls.Preview.GL_SURFACE     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.CameraView.AnonymousClass10.<clinit>():void");
        }
    }

    public Facing toggleFacing() {
        int i = AnonymousClass10.getMin[this.toString.ICustomTabsService().ordinal()];
        if (i == 1) {
            setFacing(Facing.FRONT);
        } else if (i == 2) {
            setFacing(Facing.BACK);
        }
        return this.toString.ICustomTabsService();
    }

    public void setFlash(@NonNull Flash flash) {
        this.toString.setMin(flash);
    }

    @NonNull
    public Flash getFlash() {
        return this.toString.newSession();
    }

    public void setAudio(@NonNull Audio audio) {
        if (audio == getAudio() || setMin()) {
            this.toString.getMax(audio);
        } else if (checkPermissions(audio)) {
            this.toString.getMax(audio);
        } else {
            close();
        }
    }

    @NonNull
    public Audio getAudio() {
        return this.toString.getInterfaceDescriptor();
    }

    public void setAutoFocusMarker(@Nullable ensureBottomGlow ensurebottomglow) {
        this.invoke = ensurebottomglow;
        this.mMarkerLayout.onMarker(1, ensurebottomglow);
    }

    public void setAutoFocusResetDelay(long j) {
        this.toString.setMax(j);
    }

    public long getAutoFocusResetDelay() {
        return this.toString.setDefaultImpl();
    }

    public void startAutoFocus(float f, float f2) {
        if (f < 0.0f || f > ((float) getWidth())) {
            throw new IllegalArgumentException("x should be >= 0 and <= getWidth()");
        } else if (f2 < 0.0f || f2 > ((float) getHeight())) {
            throw new IllegalArgumentException("y should be >= 0 and <= getHeight()");
        } else {
            shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(getWidth(), getHeight());
            PointF pointF = new PointF(f, f2);
            this.toString.setMax((Gesture) null, setEdgeEffectFactory.setMin(shoulddeferaccessibilityevent, setEdgeEffectFactory.setMax(pointF, ((float) shoulddeferaccessibilityevent.getMax) * 0.05f, ((float) shoulddeferaccessibilityevent.getMin) * 0.05f), true), pointF);
        }
    }

    public void startAutoFocus(@NonNull RectF rectF) {
        if (new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()).contains(rectF)) {
            this.toString.setMax((Gesture) null, setEdgeEffectFactory.setMin(new shouldDeferAccessibilityEvent(getWidth(), getHeight()), rectF, false), new PointF(rectF.centerX(), rectF.centerY()));
            return;
        }
        throw new IllegalArgumentException("Region is out of view bounds! ".concat(String.valueOf(rectF)));
    }

    public void setPreviewStreamSize(@NonNull isComputingLayout iscomputinglayout) {
        this.toString.length(iscomputinglayout);
    }

    public void setMode(@NonNull Mode mode) {
        this.toString.setMax(mode);
    }

    @NonNull
    public Mode getMode() {
        return this.toString.ICustomTabsCallback$Stub$Proxy();
    }

    public void setPictureSize(@NonNull isComputingLayout iscomputinglayout) {
        this.toString.getMin(iscomputinglayout);
    }

    public void setPictureMetering(boolean z) {
        this.toString.setMin(z);
    }

    public boolean getPictureMetering() {
        return this.toString.updateVisuals();
    }

    public void setPictureSnapshotMetering(boolean z) {
        this.toString.getMax(z);
    }

    public boolean getPictureSnapshotMetering() {
        return this.toString.IPostMessageService();
    }

    public void setPictureFormat(@NonNull PictureFormat pictureFormat) {
        this.toString.setMax(pictureFormat);
    }

    @NonNull
    public PictureFormat getPictureFormat() {
        return this.toString.requestPostMessageChannelWithExtras();
    }

    public void setVideoSize(@NonNull isComputingLayout iscomputinglayout) {
        this.toString.setMax(iscomputinglayout);
    }

    public void setVideoBitRate(int i) {
        this.toString.length(i);
    }

    public int getVideoBitRate() {
        return this.toString.extraCallback();
    }

    public void setPreviewFrameRate(float f) {
        this.toString.length(f);
    }

    public float getPreviewFrameRate() {
        return this.toString.validateRelationship();
    }

    public void setAudioBitRate(int i) {
        this.toString.toFloatRange(i);
    }

    public int getAudioBitRate() {
        return this.toString.onMessageChannelReady();
    }

    public void addCameraListener(@NonNull updateActionForInterimTarget updateactionforinterimtarget) {
        this.mListeners.add(updateactionforinterimtarget);
    }

    public void removeCameraListener(@NonNull updateActionForInterimTarget updateactionforinterimtarget) {
        this.mListeners.remove(updateactionforinterimtarget);
    }

    public void clearCameraListeners() {
        this.mListeners.clear();
    }

    public void takePicture() {
        this.toString.setMin(new calculateDtToFit.length());
    }

    public void takePictureSnapshot() {
        this.toString.setMax(new calculateDtToFit.length());
    }

    public void takeVideo(@NonNull File file) {
        setMin(file, (FileDescriptor) null);
    }

    public void takeVideo(@NonNull FileDescriptor fileDescriptor) {
        setMin((File) null, fileDescriptor);
    }

    private void setMin(@Nullable File file, @Nullable FileDescriptor fileDescriptor) {
        exceptionLabel.setMax setmax = new exceptionLabel.setMax();
        if (file != null) {
            this.toString.getMax(setmax, file, (FileDescriptor) null);
        } else if (fileDescriptor != null) {
            this.toString.getMax(setmax, (File) null, fileDescriptor);
        } else {
            throw new IllegalStateException("file and fileDescriptor are both null.");
        }
        this.values.post(new Runnable() {
            public final void run() {
                CameraView cameraView = CameraView.this;
                boolean unused = cameraView.invokeSuspend = cameraView.getKeepScreenOn();
                if (!CameraView.this.invokeSuspend) {
                    CameraView.this.setKeepScreenOn(true);
                }
            }
        });
    }

    public void takeVideoSnapshot(@NonNull File file) {
        this.toString.setMax(new exceptionLabel.setMax(), file);
        this.values.post(new Runnable() {
            public final void run() {
                CameraView cameraView = CameraView.this;
                boolean unused = cameraView.invokeSuspend = cameraView.getKeepScreenOn();
                if (!CameraView.this.invokeSuspend) {
                    CameraView.this.setKeepScreenOn(true);
                }
            }
        });
    }

    public void takeVideoSnapshot(@NonNull File file, int i) {
        final int videoMaxDuration = getVideoMaxDuration();
        addCameraListener(new updateActionForInterimTarget() {
            public final void getMin() {
                CameraView.this.setVideoMaxDuration(videoMaxDuration);
                CameraView.this.removeCameraListener(this);
            }

            public final void length(@NonNull CameraException cameraException) {
                super.length(cameraException);
                if (cameraException.getReason() == 5) {
                    CameraView.this.setVideoMaxDuration(videoMaxDuration);
                    CameraView.this.removeCameraListener(this);
                }
            }
        });
        setVideoMaxDuration(i);
        takeVideoSnapshot(file);
    }

    public void stopVideo() {
        this.toString.receiveFile();
        this.values.post(new Runnable() {
            public final void run() {
                if (CameraView.this.getKeepScreenOn() != CameraView.this.invokeSuspend) {
                    CameraView cameraView = CameraView.this;
                    cameraView.setKeepScreenOn(cameraView.invokeSuspend);
                }
            }
        });
    }

    public void setSnapshotMaxWidth(int i) {
        this.toString.toIntRange(i);
    }

    public void setSnapshotMaxHeight(int i) {
        this.toString.equals(i);
    }

    public int getSnapshotMaxWidth() {
        return this.toString.onPostMessage();
    }

    public int getSnapshotMaxHeight() {
        return this.toString.onTransact();
    }

    @Nullable
    public shouldDeferAccessibilityEvent getSnapshotSize() {
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = null;
        if (!(getWidth() == 0 || getHeight() == 0)) {
            shouldDeferAccessibilityEvent min = this.toString.setMin(Reference.VIEW);
            if (min == null) {
                return null;
            }
            Rect max = pullGlows.setMax(min, predictiveItemAnimationsEnabled.setMax(getWidth(), getHeight()));
            shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(max.width(), max.height());
            if (this.toString.invoke().getMin(Reference.VIEW, Reference.OUTPUT)) {
                return new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent.getMin, shoulddeferaccessibilityevent.getMax);
            }
        }
        return shoulddeferaccessibilityevent;
    }

    @Nullable
    public shouldDeferAccessibilityEvent getPictureSize() {
        return this.toString.getMax(Reference.OUTPUT);
    }

    @Nullable
    public shouldDeferAccessibilityEvent getVideoSize() {
        return this.toString.setMax(Reference.OUTPUT);
    }

    @TargetApi(23)
    private void setMin(boolean z, boolean z2) {
        Activity activity = null;
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("android.permission.CAMERA");
        }
        if (z2) {
            arrayList.add(ManifestPermission.RECORD_AUDIO);
        }
        if (activity != null) {
            activity.requestPermissions((String[]) arrayList.toArray(new String[0]), 16);
        }
    }

    public void setPlaySounds(boolean z) {
        this.length = z && Build.VERSION.SDK_INT >= 16;
        this.toString.setMax(z);
    }

    public boolean getPlaySounds() {
        return this.length;
    }

    public void setUseDeviceOrientation(boolean z) {
        this.setMax = z;
    }

    public boolean getUseDeviceOrientation() {
        return this.setMax;
    }

    public void setVideoCodec(@NonNull VideoCodec videoCodec) {
        this.toString.getMin(videoCodec);
    }

    @NonNull
    public VideoCodec getVideoCodec() {
        return this.toString.onRelationshipValidationResult();
    }

    public void setVideoMaxSize(long j) {
        this.toString.getMin(j);
    }

    public long getVideoMaxSize() {
        return this.toString.onNavigationEvent();
    }

    public void setVideoMaxDuration(int i) {
        this.toString.getMin(i);
    }

    public int getVideoMaxDuration() {
        return this.toString.extraCallbackWithResult();
    }

    public boolean isTakingVideo() {
        return this.toString.ICustomTabsService$Stub$Proxy();
    }

    public boolean isTakingPicture() {
        return this.toString.ICustomTabsService$Default();
    }

    @VisibleForTesting
    class length implements initChildrenHelper.length, ensureLeftGlow.getMax, stopInterceptRequestLayout.getMax {
        /* access modifiers changed from: private */
        public final CameraLogger setMax;
        private final String setMin;

        length() {
            String simpleName = length.class.getSimpleName();
            this.setMin = simpleName;
            this.setMax = CameraLogger.setMin(simpleName);
        }

        @NonNull
        public final Context length() {
            return CameraView.this.getContext();
        }

        public final int getMax() {
            return CameraView.this.getWidth();
        }

        public final int getMin() {
            return CameraView.this.getHeight();
        }

        public final void setMax(@NonNull final RecyclerView recyclerView) {
            this.setMax.getMax(1, "dispatchOnCameraOpened", recyclerView);
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void setMin() {
            this.setMax.getMax(1, "dispatchOnCameraClosed");
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void setMax() {
            shouldDeferAccessibilityEvent min = CameraView.this.toString.getMin(Reference.VIEW);
            if (min == null) {
                throw new RuntimeException("Preview stream size should not be null here.");
            } else if (min.equals(CameraView.this.Mean$Arithmetic)) {
                this.setMax.setMax("onCameraPreviewStreamSizeChanged:", "swallowing because the preview size has not changed.", min);
            } else {
                this.setMax.setMax("onCameraPreviewStreamSizeChanged: posting a requestLayout call.", "Preview stream size:", min);
                CameraView.this.values.post(new Runnable() {
                    public final void run() {
                        CameraView.this.requestLayout();
                    }
                });
            }
        }

        public final void getMax(boolean z) {
            if (z && CameraView.this.length) {
                CameraView.access$500(CameraView.this, 0);
            }
        }

        public final void setMin(@NonNull final calculateDtToFit.length length2) {
            this.setMax.getMax(1, "dispatchOnPictureTaken", length2);
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    calculateDtToFit calculatedttofit = new calculateDtToFit(length2);
                    for (updateActionForInterimTarget min : CameraView.this.mListeners) {
                        min.setMin(calculatedttofit);
                    }
                }
            });
        }

        public final void length(@NonNull final exceptionLabel.setMax setmax) {
            this.setMax.getMax(1, "dispatchOnVideoTaken", setmax);
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    new exceptionLabel(setmax);
                    for (updateActionForInterimTarget min : CameraView.this.mListeners) {
                        min.getMin();
                    }
                }
            });
        }

        public final void getMax(@Nullable final Gesture gesture, @NonNull final PointF pointF) {
            this.setMax.getMax(1, "dispatchOnFocusStart", gesture, pointF);
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    CameraView.this.mMarkerLayout.onEvent(1, new PointF[]{pointF});
                    if (CameraView.this.invoke != null) {
                        CameraView.this.invoke.getMin(gesture != null ? AutoFocusTrigger.GESTURE : AutoFocusTrigger.METHOD);
                    }
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void setMax(@Nullable final Gesture gesture, final boolean z, @NonNull final PointF pointF) {
            this.setMax.getMax(1, "dispatchOnFocusEnd", gesture, Boolean.valueOf(z), pointF);
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    if (z && CameraView.this.length) {
                        CameraView.access$500(CameraView.this, 1);
                    }
                    if (CameraView.this.invoke != null) {
                        CameraView.this.invoke.getMax(gesture != null ? AutoFocusTrigger.GESTURE : AutoFocusTrigger.METHOD, z);
                    }
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void setMin(int i) {
            this.setMax.getMax(1, "onDeviceOrientationChanged", Integer.valueOf(i));
            int i2 = CameraView.this.FastBitmap$CoordinateSystem.length;
            if (!CameraView.this.setMax) {
                int i3 = (360 - i2) % AUScreenAdaptTool.WIDTH_BASE;
                removeItemDecoration invoke = CameraView.this.toString.invoke();
                removeItemDecoration.setMin(i3);
                invoke.setMin = i3;
                invoke.length();
            } else {
                removeItemDecoration invoke2 = CameraView.this.toString.invoke();
                removeItemDecoration.setMin(i);
                invoke2.setMin = i;
                invoke2.length();
            }
            final int i4 = (i + i2) % AUScreenAdaptTool.WIDTH_BASE;
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void length(int i, boolean z) {
            this.setMax.getMax(1, "onDisplayOffsetChanged", Integer.valueOf(i), "recreate:", Boolean.valueOf(z));
            if (CameraView.this.isOpened() && !z) {
                this.setMax.getMax(2, "onDisplayOffsetChanged", "restarting the camera.");
                CameraView.this.close();
                CameraView.this.open();
            }
        }

        public final void setMin(final float f, @Nullable final PointF[] pointFArr) {
            this.setMax.getMax(1, "dispatchOnZoomChanged", Float.valueOf(f));
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void getMax(final float f, @NonNull final float[] fArr, @Nullable final PointF[] pointFArr) {
            this.setMax.getMax(1, "dispatchOnExposureCorrectionChanged", Float.valueOf(f));
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void getMin(@NonNull final nestedScrollByInternal nestedscrollbyinternal) {
            CameraLogger cameraLogger = this.setMax;
            nestedscrollbyinternal.length();
            cameraLogger.getMax(0, "dispatchFrame:", Long.valueOf(nestedscrollbyinternal.setMax), "processors:", Integer.valueOf(CameraView.this.mFrameProcessors.size()));
            if (CameraView.this.mFrameProcessors.isEmpty()) {
                nestedscrollbyinternal.setMin();
            } else {
                CameraView.this.hashCode.execute(new Runnable() {
                    public final void run() {
                        CameraLogger length = length.this.setMax;
                        nestedScrollByInternal nestedscrollbyinternal = nestedscrollbyinternal;
                        nestedscrollbyinternal.length();
                        length.getMax(0, "dispatchFrame: executing. Passing", Long.valueOf(nestedscrollbyinternal.setMax), "to processors.");
                        Iterator<nestedScrollBy> it = CameraView.this.mFrameProcessors.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        nestedscrollbyinternal.setMin();
                    }
                });
            }
        }

        public final void setMin(final CameraException cameraException) {
            this.setMax.getMax(1, "dispatchError", cameraException);
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    for (updateActionForInterimTarget length : CameraView.this.mListeners) {
                        length.length(cameraException);
                    }
                }
            });
        }

        public final void equals() {
            this.setMax.getMax(1, "dispatchOnVideoRecordingStart");
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }

        public final void IsOverlapping() {
            this.setMax.getMax(1, "dispatchOnVideoRecordingEnd");
            CameraView.this.values.post(new Runnable() {
                public final void run() {
                    Iterator<updateActionForInterimTarget> it = CameraView.this.mListeners.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }
    }

    public void addFrameProcessor(@Nullable nestedScrollBy nestedscrollby) {
        if (nestedscrollby != null) {
            this.mFrameProcessors.add(nestedscrollby);
            if (this.mFrameProcessors.size() == 1) {
                this.toString.length(true);
            }
        }
    }

    public void removeFrameProcessor(@Nullable nestedScrollBy nestedscrollby) {
        if (nestedscrollby != null) {
            this.mFrameProcessors.remove(nestedscrollby);
            if (this.mFrameProcessors.size() == 0) {
                this.toString.length(false);
            }
        }
    }

    public void clearFrameProcessors() {
        boolean z = this.mFrameProcessors.size() > 0;
        this.mFrameProcessors.clear();
        if (z) {
            this.toString.length(false);
        }
    }

    public void setFrameProcessingMaxWidth(int i) {
        this.toString.IsOverlapping(i);
    }

    public void setFrameProcessingMaxHeight(int i) {
        this.toString.isInside(i);
    }

    public int getFrameProcessingMaxWidth() {
        return this.toString.asBinder();
    }

    public int getFrameProcessingMaxHeight() {
        return this.toString.ICustomTabsCallback$Stub();
    }

    public void setFrameProcessingFormat(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(278605963, oncanceled);
            onCancelLoad.getMin(278605963, oncanceled);
        }
        this.toString.setMax(i);
    }

    public int getFrameProcessingFormat() {
        return this.toString.asInterface();
    }

    public void setFrameProcessingPoolSize(int i) {
        this.toString.FastBitmap$CoordinateSystem(i);
    }

    public int getFrameProcessingPoolSize() {
        return this.toString.ICustomTabsCallback$Default();
    }

    public void setFrameProcessingExecutors(int i) {
        if (i > 0) {
            this.equals = i;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 4, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
                private final AtomicInteger setMax = new AtomicInteger(1);

                public final Thread newThread(@NonNull Runnable runnable) {
                    StringBuilder sb = new StringBuilder("FrameExecutor #");
                    sb.append(this.setMax.getAndIncrement());
                    return new Thread(runnable, sb.toString());
                }
            });
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.hashCode = threadPoolExecutor;
            return;
        }
        throw new IllegalArgumentException("Need at least 1 executor, got ".concat(String.valueOf(i)));
    }

    public int getFrameProcessingExecutors() {
        return this.equals;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.getCause || !this.mOverlayLayout.isOverlay(attributeSet)) {
            return super.generateLayoutParams(attributeSet);
        }
        return this.mOverlayLayout.generateLayoutParams(attributeSet);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.getCause || !this.mOverlayLayout.isOverlay(layoutParams)) {
            super.addView(view, i, layoutParams);
        } else {
            this.mOverlayLayout.addView(view, layoutParams);
        }
    }

    public void removeView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.getCause || layoutParams == null || !this.mOverlayLayout.isOverlay(layoutParams)) {
            super.removeView(view);
        } else {
            this.mOverlayLayout.removeView(view);
        }
    }

    public void setFilter(@NonNull setChildDrawingOrderCallback setchilddrawingordercallback) {
        onEnterLayoutOrScroll onenterlayoutorscroll = this.toDoubleRange;
        if (onenterlayoutorscroll == null) {
            this.IsOverlapping = setchilddrawingordercallback;
            return;
        }
        boolean z = onenterlayoutorscroll instanceof dispatchContentChangedIfNecessary;
        if (!(setchilddrawingordercallback instanceof clearOnScrollListeners) && !z) {
            StringBuilder sb = new StringBuilder("Filters are only supported by the GL_SURFACE preview. Current preview:");
            sb.append(this.isInside);
            throw new RuntimeException(sb.toString());
        } else if (z) {
            ((dispatchContentChangedIfNecessary) this.toDoubleRange).length(setchilddrawingordercallback);
        }
    }

    @NonNull
    public setChildDrawingOrderCallback getFilter() {
        onEnterLayoutOrScroll onenterlayoutorscroll = this.toDoubleRange;
        if (onenterlayoutorscroll == null) {
            return this.IsOverlapping;
        }
        if (onenterlayoutorscroll instanceof dispatchContentChangedIfNecessary) {
            return ((dispatchContentChangedIfNecessary) onenterlayoutorscroll).equals();
        }
        StringBuilder sb = new StringBuilder("Filters are only supported by the GL_SURFACE preview. Current:");
        sb.append(this.isInside);
        throw new RuntimeException(sb.toString());
    }

    private void getMin(@NonNull stopInterceptRequestLayout stopinterceptrequestlayout, @NonNull RecyclerView recyclerView) {
        Gesture gesture = stopinterceptrequestlayout.getMin;
        PointF[] pointFArr = stopinterceptrequestlayout.length;
        switch (AnonymousClass10.length[this.toFloatRange.get(gesture).ordinal()]) {
            case 1:
                takePicture();
                return;
            case 2:
                shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(getWidth(), getHeight());
                this.toString.setMax(gesture, setEdgeEffectFactory.setMin(shoulddeferaccessibilityevent, setEdgeEffectFactory.setMax(pointFArr[0], ((float) shoulddeferaccessibilityevent.getMax) * 0.05f, ((float) shoulddeferaccessibilityevent.getMin) * 0.05f), true), pointFArr[0]);
                return;
            case 3:
                float mayLaunchUrl = this.toString.mayLaunchUrl();
                float min = stopinterceptrequestlayout.getMin(mayLaunchUrl, 0.0f, 1.0f);
                if (min != mayLaunchUrl) {
                    this.toString.length(min, pointFArr, true);
                    return;
                }
                return;
            case 4:
                float extraCommand = this.toString.extraCommand();
                float equals2 = recyclerView.equals();
                float isInside2 = recyclerView.isInside();
                float min2 = stopinterceptrequestlayout.getMin(extraCommand, equals2, isInside2);
                if (min2 != extraCommand) {
                    this.toString.setMin(min2, new float[]{equals2, isInside2}, pointFArr, true);
                    return;
                }
                return;
            case 5:
                if (getFilter() instanceof removeOnScrollListener) {
                    stopinterceptrequestlayout.getMin(((removeOnScrollListener) getFilter()).setMax(), 0.0f, 1.0f);
                    return;
                }
                return;
            case 6:
                if (getFilter() instanceof scrollStep) {
                    stopinterceptrequestlayout.getMin(((scrollStep) getFilter()).IsOverlapping(), 0.0f, 1.0f);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public boolean checkPermissions(@NonNull Audio audio) {
        if (audio == Audio.ON || audio == Audio.MONO || audio == Audio.STEREO) {
            try {
                String[] strArr = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 4096).requestedPermissions;
                int length2 = strArr.length;
                int i = 0;
                while (i < length2) {
                    if (!strArr[i].equals(ManifestPermission.RECORD_AUDIO)) {
                        i++;
                    }
                }
                throw new IllegalStateException(getMax.getMax(3, "Permission error: when audio is enabled (Audio.ON) the RECORD_AUDIO permission should be added to the app manifest file."));
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        Context context = getContext();
        boolean z = audio == Audio.ON || audio == Audio.MONO || audio == Audio.STEREO;
        boolean z2 = context.checkSelfPermission("android.permission.CAMERA") != 0;
        boolean z3 = z && context.checkSelfPermission(ManifestPermission.RECORD_AUDIO) != 0;
        if (!z2 && !z3) {
            return true;
        }
        if (this.getMin) {
            setMin(z2, z3);
        }
        return false;
    }

    public void takeVideo(@NonNull File file, int i) {
        final int videoMaxDuration = getVideoMaxDuration();
        addCameraListener(new updateActionForInterimTarget() {
            public final void getMin() {
                CameraView.this.setVideoMaxDuration(r0);
                CameraView.this.removeCameraListener(this);
            }

            public final void length(@NonNull CameraException cameraException) {
                super.length(cameraException);
                if (cameraException.getReason() == 5) {
                    CameraView.this.setVideoMaxDuration(r0);
                    CameraView.this.removeCameraListener(this);
                }
            }
        });
        setVideoMaxDuration(i);
        setMin(file, (FileDescriptor) null);
    }

    public void takeVideo(@NonNull FileDescriptor fileDescriptor, int i) {
        final int videoMaxDuration = getVideoMaxDuration();
        addCameraListener(new updateActionForInterimTarget() {
            public final void getMin() {
                CameraView.this.setVideoMaxDuration(videoMaxDuration);
                CameraView.this.removeCameraListener(this);
            }

            public final void length(@NonNull CameraException cameraException) {
                super.length(cameraException);
                if (cameraException.getReason() == 5) {
                    CameraView.this.setVideoMaxDuration(videoMaxDuration);
                    CameraView.this.removeCameraListener(this);
                }
            }
        });
        setVideoMaxDuration(i);
        setMin((File) null, fileDescriptor);
    }

    static /* synthetic */ void access$500(CameraView cameraView, int i) {
        if (cameraView.length) {
            if (cameraView.valueOf == null) {
                cameraView.valueOf = new MediaActionSound();
            }
            cameraView.valueOf.play(i);
        }
    }
}
