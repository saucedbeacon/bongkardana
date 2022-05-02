package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.location.Location;
import android.os.Build;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.CameraException;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.Mode;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import com.otaliastudios.cameraview.engine.EngineThread;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.engine.orchestrator.CameraState;
import com.otaliastudios.cameraview.gesture.Gesture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o.calculateDtToFit;
import o.exceptionLabel;
import o.initChildrenHelper;
import o.jumpToPositionForSmoothScroller;

public final class getAccessibilityClassName extends getCompatAccessibilityDelegate implements Camera.PreviewCallback, Camera.ErrorCallback, jumpToPositionForSmoothScroller.length {
    private final setOnFlingListener ICustomTabsService = setOnFlingListener.getMin();
    @VisibleForTesting
    int length;
    /* access modifiers changed from: private */
    public Camera setDefaultImpl;

    public getAccessibilityClassName(@NonNull initChildrenHelper.length length2) {
        super(length2);
    }

    public final void onError(int i, Camera camera) {
        int i2 = 0;
        RuntimeException runtimeException = new RuntimeException(asInterface.getMax(3, "Internal Camera1 error.", Integer.valueOf(i)));
        if (i == 1 || i == 2 || i == 100) {
            i2 = 3;
        }
        throw new CameraException(runtimeException, i2);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final List<shouldDeferAccessibilityEvent> length() {
        List<Camera.Size> supportedPreviewSizes = this.setDefaultImpl.getParameters().getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList(supportedPreviewSizes.size());
        for (Camera.Size next : supportedPreviewSizes) {
            shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(next.width, next.height);
            if (!arrayList.contains(shoulddeferaccessibilityevent)) {
                arrayList.add(shoulddeferaccessibilityevent);
            }
        }
        asInterface.setMax("getPreviewStreamAvailableSizes:", arrayList);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final List<shouldDeferAccessibilityEvent> setMax() {
        return Collections.singletonList(this.equals);
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void getMax() {
        ITrustedWebActivityCallback$Stub$Proxy();
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final boolean length(@NonNull Facing facing) {
        int max = setOnFlingListener.getMax(facing);
        asInterface.getMax(1, "collectCameraInfo", "Facing:", facing, "Internal:", Integer.valueOf(max), "Cameras:", Integer.valueOf(Camera.getNumberOfCameras()));
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == max) {
                invoke().setMin(facing, cameraInfo.orientation);
                this.length = i;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<RecyclerView> setMin() {
        try {
            Camera open = Camera.open(this.length);
            this.setDefaultImpl = open;
            open.setErrorCallback(this);
            asInterface.getMax(1, "onStartEngine:", "Applying default parameters.");
            Camera.Parameters parameters = this.setDefaultImpl.getParameters();
            this.getMin = new getItemDecorationAt(parameters, this.length, invoke().getMin(Reference.SENSOR, Reference.VIEW));
            parameters.setRecordingHint(ICustomTabsCallback$Stub$Proxy() == Mode.VIDEO);
            setMax(parameters);
            setMin(parameters, Flash.OFF);
            getMin(parameters);
            setMax(parameters, WhiteBalance.AUTO);
            setMin(parameters, Hdr.OFF);
            setMin(parameters, 0.0f);
            setMax(parameters, 0.0f);
            IsOverlapping(this.invokeSuspend);
            length(parameters, 0.0f);
            this.setDefaultImpl.setParameters(parameters);
            this.setDefaultImpl.setDisplayOrientation(invoke().getMin(Reference.SENSOR, Reference.VIEW, Axis.ABSOLUTE));
            asInterface.getMax(1, "onStartEngine:", "Ended");
            return Tasks.forResult(this.getMin);
        } catch (Exception e) {
            asInterface.getMax(3, "onStartEngine:", "Failed to connect. Maybe in use by another app?");
            throw new CameraException(e, 1);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> getMin() {
        asInterface.getMax(1, "onStartBind:", "Started");
        try {
            if (this.setMax.getMax() == SurfaceHolder.class) {
                this.setDefaultImpl.setPreviewDisplay((SurfaceHolder) this.setMax.getMin());
            } else if (this.setMax.getMax() == SurfaceTexture.class) {
                this.setDefaultImpl.setPreviewTexture((SurfaceTexture) this.setMax.getMin());
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
            this.toFloatRange = IPostMessageService$Stub();
            this.equals = IPostMessageService$Default();
            return Tasks.forResult(null);
        } catch (IOException e) {
            asInterface.setMin("onStartBind:", "Failed to bind.", e);
            throw new CameraException(e, 2);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> isInside() {
        asInterface.getMax(1, "onStartPreview", "Dispatching onCameraPreviewStreamSizeChanged.");
        this.ICustomTabsCallback$Stub$Proxy.setMax();
        shouldDeferAccessibilityEvent min = getMin(Reference.VIEW);
        if (min != null) {
            this.setMax.setMax(min.getMax, min.getMin);
            Camera.Parameters parameters = this.setDefaultImpl.getParameters();
            parameters.setPreviewFormat(17);
            parameters.setPreviewSize(this.equals.getMax, this.equals.getMin);
            if (ICustomTabsCallback$Stub$Proxy() == Mode.PICTURE) {
                parameters.setPictureSize(this.toFloatRange.getMax, this.toFloatRange.getMin);
            } else {
                shouldDeferAccessibilityEvent min2 = getMin(Mode.PICTURE);
                parameters.setPictureSize(min2.getMax, min2.getMin);
            }
            this.setDefaultImpl.setParameters(parameters);
            this.setDefaultImpl.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
            this.setDefaultImpl.setPreviewCallbackWithBuffer(this);
            ((jumpToPositionForSmoothScroller) super.FastBitmap$CoordinateSystem()).getMin(17, this.equals);
            asInterface.setMax("onStartPreview", "Starting preview with startPreview().");
            try {
                this.setDefaultImpl.startPreview();
                asInterface.setMax("onStartPreview", "Started preview.");
                return Tasks.forResult(null);
            } catch (Exception e) {
                asInterface.setMin("onStartPreview", "Failed to start preview.", e);
                throw new CameraException(e, 2);
            }
        } else {
            throw new IllegalStateException("previewStreamSize should not be null at this point.");
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> equals() {
        asInterface.getMax(1, "onStopPreview:", "Started.");
        if (this.getMax != null) {
            this.getMax.setMin(true);
            this.getMax = null;
        }
        this.setMin = null;
        ((jumpToPositionForSmoothScroller) super.FastBitmap$CoordinateSystem()).length();
        asInterface.getMax(1, "onStopPreview:", "Releasing preview buffers.");
        this.setDefaultImpl.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
        try {
            asInterface.getMax(1, "onStopPreview:", "Stopping preview.");
            this.setDefaultImpl.stopPreview();
            asInterface.getMax(1, "onStopPreview:", "Stopped preview.");
        } catch (Exception e) {
            asInterface.getMax(3, "stopPreview", "Could not stop preview", e);
        }
        return Tasks.forResult(null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> toIntRange() {
        this.equals = null;
        this.toFloatRange = null;
        try {
            if (this.setMax.getMax() == SurfaceHolder.class) {
                this.setDefaultImpl.setPreviewDisplay((SurfaceHolder) null);
            } else if (this.setMax.getMax() == SurfaceTexture.class) {
                this.setDefaultImpl.setPreviewTexture((SurfaceTexture) null);
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
        } catch (IOException e) {
            asInterface.setMin("onStopBind", "Could not release surface", e);
        }
        return Tasks.forResult(null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> toFloatRange() {
        asInterface.getMax(1, "onStopEngine:", "About to clean up.");
        this.getInterfaceDescriptor.getMax("focus reset");
        this.getInterfaceDescriptor.getMax("focus end");
        if (this.setDefaultImpl != null) {
            try {
                asInterface.getMax(1, "onStopEngine:", "Clean up.", "Releasing camera.");
                this.setDefaultImpl.release();
                asInterface.getMax(1, "onStopEngine:", "Clean up.", "Released camera.");
            } catch (Exception e) {
                asInterface.getMax(2, "onStopEngine:", "Clean up.", "Exception while releasing camera.", e);
            }
            this.setDefaultImpl = null;
            this.getMin = null;
        }
        this.getMax = null;
        this.getMin = null;
        this.setDefaultImpl = null;
        asInterface.getMax(2, "onStopEngine:", "Clean up.", "Returning.");
        return Tasks.forResult(null);
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void getMin(@NonNull calculateDtToFit.length length2, boolean z) {
        asInterface.getMax(1, "onTakePicture:", "executing.");
        length2.length = invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR);
        length2.getMax = getMax(Reference.OUTPUT);
        this.setMin = new dispatchToOnItemTouchListeners(length2, this, this.setDefaultImpl);
        this.setMin.getMax();
        asInterface.getMax(1, "onTakePicture:", "executed.");
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void getMax(@NonNull calculateDtToFit.length length2, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled, boolean z) {
        asInterface.getMax(1, "onTakePictureSnapshot:", "executing.");
        length2.getMax = setMin(Reference.OUTPUT);
        length2.length = invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR);
        if (!(this.setMax instanceof setItemAnimator) || Build.VERSION.SDK_INT < 19) {
            this.setMin = new defaultOnMeasure(length2, this, this.setDefaultImpl, predictiveitemanimationsenabled);
        } else {
            this.setMin = new findInterceptingOnItemTouchListener(length2, this, (setItemAnimator) this.setMax, predictiveitemanimationsenabled);
        }
        this.setMin.getMax();
        asInterface.getMax(1, "onTakePictureSnapshot:", "executed.");
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void setMin(@NonNull exceptionLabel.setMax setmax) {
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent;
        setmax.getMax = invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR);
        if (invoke().getMin(Reference.SENSOR, Reference.OUTPUT)) {
            shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = this.toFloatRange;
            shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent2.getMin, shoulddeferaccessibilityevent2.getMax);
        } else {
            shoulddeferaccessibilityevent = this.toFloatRange;
        }
        setmax.length = shoulddeferaccessibilityevent;
        try {
            this.setDefaultImpl.unlock();
            this.getMax = new resetFocusInfo(this, this.setDefaultImpl, this.length);
            this.getMax.setMax(setmax);
        } catch (Exception e) {
            super.setMax((exceptionLabel.setMax) null, e);
            this.setDefaultImpl.lock();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    @EngineThread
    public final void getMin(@NonNull exceptionLabel.setMax setmax, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled) {
        if (!(this.setMax instanceof setItemAnimator)) {
            throw new IllegalStateException("Video snapshots are only supported with GL_SURFACE.");
        } else if (Build.VERSION.SDK_INT >= 18) {
            setItemAnimator setitemanimator = (setItemAnimator) this.setMax;
            shouldDeferAccessibilityEvent min = setMin(Reference.OUTPUT);
            if (min != null) {
                Rect max = pullGlows.setMax(min, predictiveitemanimationsenabled);
                setmax.length = new shouldDeferAccessibilityEvent(max.width(), max.height());
                setmax.getMax = invoke().getMin(Reference.VIEW, Reference.OUTPUT, Axis.ABSOLUTE);
                setmax.FastBitmap$CoordinateSystem = Math.round(this.onNavigationEvent);
                asInterface.setMax("onTakeVideoSnapshot", "rotation:", Integer.valueOf(setmax.getMax), "size:", setmax.length);
                this.getMax = new processAdapterUpdatesAndSetAnimationFlags(this, setitemanimator, ICustomTabsCallback(), setmax.getMax);
                this.getMax.setMax(setmax);
                return;
            }
            throw new IllegalStateException("outputSize should not be null.");
        } else {
            throw new IllegalStateException("Video snapshots are only supported on API 18+.");
        }
    }

    public final void setMax(@Nullable exceptionLabel.setMax setmax, @Nullable Exception exc) {
        super.setMax(setmax, exc);
        if (setmax == null) {
            this.setDefaultImpl.lock();
        }
    }

    /* access modifiers changed from: private */
    public void setMax(@NonNull Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (ICustomTabsCallback$Stub$Proxy() == Mode.VIDEO && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        } else if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("infinity")) {
            parameters.setFocusMode("infinity");
        } else if (supportedFocusModes.contains("fixed")) {
            parameters.setFocusMode("fixed");
        }
    }

    public final void setMin(@NonNull Flash flash) {
        final Flash flash2 = this.toDoubleRange;
        this.toDoubleRange = flash;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("flash (");
        sb.append(flash);
        sb.append(")");
        this.onMessageChannelReady = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                if (getAccessibilityClassName.this.setMin(parameters, flash2)) {
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean setMin(@NonNull Camera.Parameters parameters, @NonNull Flash flash) {
        if (this.getMin.setMax(this.toDoubleRange)) {
            parameters.setFlashMode(setOnFlingListener.getMax(this.toDoubleRange));
            return true;
        }
        this.toDoubleRange = flash;
        return false;
    }

    public final void length(@Nullable Location location) {
        final Location location2 = this.Mean$Arithmetic;
        this.Mean$Arithmetic = location;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        this.onRelationshipValidationResult = removeitemdecorationat.setMin("location", true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                if (getAccessibilityClassName.this.getMin(parameters)) {
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean getMin(@NonNull Camera.Parameters parameters) {
        if (this.Mean$Arithmetic == null) {
            return true;
        }
        parameters.setGpsLatitude(this.Mean$Arithmetic.getLatitude());
        parameters.setGpsLongitude(this.Mean$Arithmetic.getLongitude());
        parameters.setGpsAltitude(this.Mean$Arithmetic.getAltitude());
        parameters.setGpsTimestamp(this.Mean$Arithmetic.getTime());
        parameters.setGpsProcessingMethod(this.Mean$Arithmetic.getProvider());
        return true;
    }

    public final void length(@NonNull WhiteBalance whiteBalance) {
        final WhiteBalance whiteBalance2 = this.hashCode;
        this.hashCode = whiteBalance;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("white balance (");
        sb.append(whiteBalance);
        sb.append(")");
        this.onPostMessage = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                if (getAccessibilityClassName.this.setMax(parameters, whiteBalance2)) {
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean setMax(@NonNull Camera.Parameters parameters, @NonNull WhiteBalance whiteBalance) {
        if (this.getMin.setMax(this.hashCode)) {
            parameters.setWhiteBalance(setOnFlingListener.getMax(this.hashCode));
            parameters.remove("auto-whitebalance-lock");
            return true;
        }
        this.hashCode = whiteBalance;
        return false;
    }

    public final void getMax(@NonNull Hdr hdr) {
        final Hdr hdr2 = this.FastBitmap$CoordinateSystem;
        this.FastBitmap$CoordinateSystem = hdr;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("hdr (");
        sb.append(hdr);
        sb.append(")");
        this.extraCallback = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                if (getAccessibilityClassName.this.setMin(parameters, hdr2)) {
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean setMin(@NonNull Camera.Parameters parameters, @NonNull Hdr hdr) {
        if (this.getMin.setMax(this.FastBitmap$CoordinateSystem)) {
            parameters.setSceneMode(setOnFlingListener.setMax(this.FastBitmap$CoordinateSystem));
            return true;
        }
        this.FastBitmap$CoordinateSystem = hdr;
        return false;
    }

    public final void length(float f, @Nullable final PointF[] pointFArr, final boolean z) {
        final float f2 = this.invoke;
        this.invoke = f;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("zoom (");
        sb.append(f);
        sb.append(")");
        this.b = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                if (getAccessibilityClassName.this.setMin(parameters, f2)) {
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                    if (z) {
                        getAccessibilityClassName.this.ICustomTabsCallback$Stub$Proxy.setMin(getAccessibilityClassName.this.invoke, pointFArr);
                    }
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean setMin(@NonNull Camera.Parameters parameters, float f) {
        if (this.getMin.setMin()) {
            parameters.setZoom((int) (this.invoke * ((float) parameters.getMaxZoom())));
            this.setDefaultImpl.setParameters(parameters);
            return true;
        }
        this.invoke = f;
        return false;
    }

    public final void setMin(float f, @NonNull float[] fArr, @Nullable PointF[] pointFArr, boolean z) {
        final float f2 = this.valueOf;
        this.valueOf = f;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("exposure correction (");
        sb.append(f);
        sb.append(")");
        final boolean z2 = z;
        final float[] fArr2 = fArr;
        final PointF[] pointFArr2 = pointFArr;
        this.extraCallbackWithResult = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                if (getAccessibilityClassName.this.setMax(parameters, f2)) {
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                    if (z2) {
                        getAccessibilityClassName.this.ICustomTabsCallback$Stub$Proxy.getMax(getAccessibilityClassName.this.valueOf, fArr2, pointFArr2);
                    }
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean setMax(@NonNull Camera.Parameters parameters, float f) {
        if (this.getMin.getMax()) {
            float isInside = this.getMin.isInside();
            float equals = this.getMin.equals();
            float f2 = this.valueOf;
            if (f2 < equals) {
                isInside = equals;
            } else if (f2 <= isInside) {
                isInside = f2;
            }
            this.valueOf = isInside;
            parameters.setExposureCompensation((int) (this.valueOf / parameters.getExposureCompensationStep()));
            return true;
        }
        this.valueOf = f;
        return false;
    }

    public final void setMax(boolean z) {
        final boolean z2 = this.invokeSuspend;
        this.invokeSuspend = z;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("play sounds (");
        sb.append(z);
        sb.append(")");
        this.ICustomTabsCallback$Stub = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                boolean unused = getAccessibilityClassName.this.IsOverlapping(z2);
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    @TargetApi(17)
    public boolean IsOverlapping(boolean z) {
        if (Build.VERSION.SDK_INT >= 17) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.length, cameraInfo);
            if (cameraInfo.canDisableShutterSound) {
                try {
                    return this.setDefaultImpl.enableShutterSound(this.invokeSuspend);
                } catch (RuntimeException unused) {
                    return false;
                }
            }
        }
        if (this.invokeSuspend) {
            return true;
        }
        this.invokeSuspend = z;
        return false;
    }

    public final void length(final float f) {
        this.onNavigationEvent = f;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("preview fps (");
        sb.append(f);
        sb.append(")");
        this.onTransact = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                if (getAccessibilityClassName.this.length(parameters, f)) {
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    /* access modifiers changed from: private */
    public boolean length(@NonNull Camera.Parameters parameters, float f) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (this.onNavigationEvent == 0.0f) {
            for (int[] next : supportedPreviewFpsRange) {
                float f2 = ((float) next[0]) / 1000.0f;
                float f3 = ((float) next[1]) / 1000.0f;
                if ((f2 <= 30.0f && 30.0f <= f3) || (f2 <= 24.0f && 24.0f <= f3)) {
                    parameters.setPreviewFpsRange(next[0], next[1]);
                    return true;
                }
            }
        } else {
            this.onNavigationEvent = Math.min(this.onNavigationEvent, this.getMin.toFloatRange());
            this.onNavigationEvent = Math.max(this.onNavigationEvent, this.getMin.toIntRange());
            for (int[] next2 : supportedPreviewFpsRange) {
                float f4 = ((float) next2[1]) / 1000.0f;
                float round = (float) Math.round(this.onNavigationEvent);
                if (((float) next2[0]) / 1000.0f <= round && round <= f4) {
                    parameters.setPreviewFpsRange(next2[0], next2[1]);
                    return true;
                }
            }
        }
        this.onNavigationEvent = f;
        return false;
    }

    public final void setMax(@NonNull PictureFormat pictureFormat) {
        if (pictureFormat == PictureFormat.JPEG) {
            this.toString = pictureFormat;
            return;
        }
        throw new UnsupportedOperationException("Unsupported picture format: ".concat(String.valueOf(pictureFormat)));
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final consumePendingUpdateOperations getMax(int i) {
        return new jumpToPositionForSmoothScroller(i, this);
    }

    @NonNull
    public final jumpToPositionForSmoothScroller IsOverlapping() {
        return (jumpToPositionForSmoothScroller) super.FastBitmap$CoordinateSystem();
    }

    public final void length(boolean z) {
        this.IsOverlapping = z;
    }

    public final void setMax(int i) {
        this.toIntRange = 17;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        nestedScrollByInternal max;
        if (bArr != null && (max = ((jumpToPositionForSmoothScroller) super.FastBitmap$CoordinateSystem()).setMax(bArr, System.currentTimeMillis(), invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR))) != null) {
            this.ICustomTabsCallback$Stub$Proxy.getMin(max);
        }
    }

    public final void getMax(@NonNull byte[] bArr) {
        if (this.getInterfaceDescriptor.toFloatRange.isAtLeast(CameraState.ENGINE) && this.getInterfaceDescriptor.toIntRange.isAtLeast(CameraState.ENGINE)) {
            this.setDefaultImpl.addCallbackBuffer(bArr);
        }
    }

    public final void setMax(@Nullable final Gesture gesture, @NonNull final setEdgeEffectFactory setedgeeffectfactory, @NonNull final PointF pointF) {
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        removeitemdecorationat.setMin("auto focus", true, new Callable<Task<Void>>(new Runnable(CameraState.BIND, new Runnable() {
            public final void run() {
                if (getAccessibilityClassName.this.getMin.getMin()) {
                    removeItemDecoration removeitemdecoration = getAccessibilityClassName.this.ICustomTabsCallback;
                    onEnterLayoutOrScroll create = getAccessibilityClassName.this.create();
                    setRecycledViewPool setrecycledviewpool = new setRecycledViewPool(removeitemdecoration, new shouldDeferAccessibilityEvent(create.toIntRange, create.IsOverlapping));
                    setEdgeEffectFactory min = setedgeeffectfactory.setMin(setrecycledviewpool);
                    Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                    int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                    int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                    if (maxNumFocusAreas > 0) {
                        parameters.setFocusAreas(min.getMin(maxNumFocusAreas, setrecycledviewpool));
                    }
                    if (maxNumMeteringAreas > 0) {
                        parameters.setMeteringAreas(min.getMin(maxNumMeteringAreas, setrecycledviewpool));
                    }
                    parameters.setFocusMode("auto");
                    getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                    getAccessibilityClassName.this.ICustomTabsCallback$Stub$Proxy.getMax(gesture, pointF);
                    getAccessibilityClassName.this.getInterfaceDescriptor.getMax("focus end");
                    getAccessibilityClassName.this.getInterfaceDescriptor.length("focus end", 2500, new Runnable() {
                        public final void run() {
                            getAccessibilityClassName.this.ICustomTabsCallback$Stub$Proxy.setMax(gesture, false, pointF);
                        }
                    });
                    try {
                        getAccessibilityClassName.this.setDefaultImpl.autoFocus(new Camera.AutoFocusCallback() {
                            public final void onAutoFocus(boolean z, Camera camera) {
                                getAccessibilityClassName.this.getInterfaceDescriptor.getMax("focus end");
                                getAccessibilityClassName.this.getInterfaceDescriptor.getMax("focus reset");
                                getAccessibilityClassName.this.ICustomTabsCallback$Stub$Proxy.setMax(gesture, z, pointF);
                                if (getAccessibilityClassName.this.getDefaultImpl()) {
                                    removeItemDecorationAt removeitemdecorationat = getAccessibilityClassName.this.getInterfaceDescriptor;
                                    removeitemdecorationat.length("focus reset", getAccessibilityClassName.this.create, new Runnable(CameraState.ENGINE, new Runnable() {
                                        public final void run() {
                                            getAccessibilityClassName.this.setDefaultImpl.cancelAutoFocus();
                                            Camera.Parameters parameters = getAccessibilityClassName.this.setDefaultImpl.getParameters();
                                            int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                                            int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                                            if (maxNumFocusAreas > 0) {
                                                parameters.setFocusAreas((List) null);
                                            }
                                            if (maxNumMeteringAreas > 0) {
                                                parameters.setMeteringAreas((List) null);
                                            }
                                            getAccessibilityClassName.this.setMax(parameters);
                                            getAccessibilityClassName.this.setDefaultImpl.setParameters(parameters);
                                        }
                                    }) {
                                        final /* synthetic */ Runnable getMin;
                                        final /* synthetic */ CameraState length;

                                        {
                                            this.length = r2;
                                            this.getMin = r3;
                                        }

                                        public final void run() {
                                            if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                                                this.getMin.run();
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    } catch (RuntimeException e) {
                        initChildrenHelper.asInterface.getMax(3, "startAutoFocus:", "Error calling autoFocus", e);
                    }
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;
            final /* synthetic */ CameraState length;

            {
                this.length = r2;
                this.getMin = r3;
            }

            public final void run() {
                if (removeItemDecorationAt.this.toFloatRange.isAtLeast(this.length)) {
                    this.getMin.run();
                }
            }
        }) {
            final /* synthetic */ Runnable getMin;

            {
                this.getMin = r2;
            }

            public final /* synthetic */ Object call() throws Exception {
                this.getMin.run();
                return Tasks.forResult(null);
            }
        });
    }

    @NonNull
    public final /* bridge */ /* synthetic */ consumePendingUpdateOperations FastBitmap$CoordinateSystem() {
        return (jumpToPositionForSmoothScroller) super.FastBitmap$CoordinateSystem();
    }
}
