package o;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.location.Location;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
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
import com.otaliastudios.cameraview.video.Full2VideoRecorder;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.ocr.model.SnapReceiptBroadcastData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import o.calculateDtToFit;
import o.exceptionLabel;
import o.initChildrenHelper;

@RequiresApi(21)
public final class initAutofill extends getCompatAccessibilityDelegate implements ImageReader.OnImageAvailableListener, getFullClassName {
    /* access modifiers changed from: private */
    public String ICustomTabsService;
    private removeAnimatingView ICustomTabsService$Default;
    private final CameraCaptureSession.CaptureCallback ICustomTabsService$Stub = new CameraCaptureSession.CaptureCallback() {
        public final void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            for (setHasFixedSize max : initAutofill.this.IPostMessageService) {
                max.getMax(initAutofill.this, captureRequest);
            }
        }

        public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            for (setHasFixedSize max : initAutofill.this.IPostMessageService) {
                max.setMax(initAutofill.this, captureRequest, captureResult);
            }
        }

        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            TotalCaptureResult unused = initAutofill.this.warmup = totalCaptureResult;
            for (setHasFixedSize min : initAutofill.this.IPostMessageService) {
                min.getMin(initAutofill.this, captureRequest, totalCaptureResult);
            }
        }
    };
    /* access modifiers changed from: private */
    public final List<setHasFixedSize> IPostMessageService = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public CaptureRequest.Builder extraCommand;
    /* access modifiers changed from: private */
    public CameraDevice getDefaultImpl;
    /* access modifiers changed from: private */
    public final CameraManager length = ((CameraManager) this.ICustomTabsCallback$Stub$Proxy.length().getSystemService(ImagePickerEvent.CAMERA));
    /* access modifiers changed from: private */
    public CameraCaptureSession mayLaunchUrl;
    private ImageReader newSession;
    private final removeOnChildAttachStateChangeListener newSessionWithExtras = removeOnChildAttachStateChangeListener.getMax();
    private final boolean postMessage = false;
    private Surface requestPostMessageChannel;
    private exceptionLabel.setMax requestPostMessageChannelWithExtras;
    /* access modifiers changed from: private */
    public CameraCharacteristics setDefaultImpl;
    private Surface updateVisuals;
    private ImageReader validateRelationship;
    /* access modifiers changed from: private */
    public TotalCaptureResult warmup;

    public initAutofill(initChildrenHelper.length length2) {
        super(length2);
        new removeAndRecycleViews().getMin((getFullClassName) this);
    }

    /* access modifiers changed from: private */
    @NonNull
    public static CameraException getMax(@NonNull CameraAccessException cameraAccessException) {
        int reason = cameraAccessException.getReason();
        int i = 3;
        if (reason != 1) {
            if (!(reason == 2 || reason == 3)) {
                if (!(reason == 4 || reason == 5)) {
                    i = 0;
                }
            }
            return new CameraException(cameraAccessException, i);
        }
        i = 1;
        return new CameraException(cameraAccessException, i);
    }

    /* access modifiers changed from: private */
    @NonNull
    public CaptureRequest.Builder values(int i) throws CameraAccessException {
        CaptureRequest.Builder builder = this.extraCommand;
        CaptureRequest.Builder createCaptureRequest = this.getDefaultImpl.createCaptureRequest(i);
        this.extraCommand = createCaptureRequest;
        createCaptureRequest.setTag(Integer.valueOf(i));
        setMax(this.extraCommand, builder);
        return this.extraCommand;
    }

    private void setMax(@NonNull Surface... surfaceArr) {
        this.extraCommand.addTarget(this.updateVisuals);
        Surface surface = this.requestPostMessageChannel;
        if (surface != null) {
            this.extraCommand.addTarget(surface);
        }
        int length2 = surfaceArr.length;
        int i = 0;
        while (i < length2) {
            Surface surface2 = surfaceArr[i];
            if (surface2 != null) {
                this.extraCommand.addTarget(surface2);
                i++;
            } else {
                throw new IllegalArgumentException("Should not add a null surface.");
            }
        }
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void IsOverlapping() {
        setMin(true, 3);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final List<shouldDeferAccessibilityEvent> length() {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.length.getCameraCharacteristics(this.ICustomTabsService).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.setMax.getMax());
                ArrayList arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(size.getWidth(), size.getHeight());
                    if (!arrayList.contains(shoulddeferaccessibilityevent)) {
                        arrayList.add(shoulddeferaccessibilityevent);
                    }
                }
                return arrayList;
            }
            throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
        } catch (CameraAccessException e) {
            throw getMax(e);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final List<shouldDeferAccessibilityEvent> setMax() {
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.length.getCameraCharacteristics(this.ICustomTabsService).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(this.toIntRange);
                ArrayList arrayList = new ArrayList(outputSizes.length);
                for (Size size : outputSizes) {
                    shouldDeferAccessibilityEvent shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(size.getWidth(), size.getHeight());
                    if (!arrayList.contains(shoulddeferaccessibilityevent)) {
                        arrayList.add(shoulddeferaccessibilityevent);
                    }
                }
                return arrayList;
            }
            throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
        } catch (CameraAccessException e) {
            throw getMax(e);
        }
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void getMax() {
        asInterface.getMax(1, "onPreviewStreamSizeChanged:", "Calling restartBind().");
        ITrustedWebActivityCallback$Stub();
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final boolean length(@NonNull Facing facing) {
        int max = removeOnChildAttachStateChangeListener.setMax(facing);
        try {
            String[] cameraIdList = this.length.getCameraIdList();
            asInterface.getMax(1, "collectCameraInfo", "Facing:", facing, "Internal:", Integer.valueOf(max), "Cameras:", Integer.valueOf(cameraIdList.length));
            int length2 = cameraIdList.length;
            int i = 0;
            while (i < length2) {
                String str = cameraIdList[i];
                try {
                    CameraCharacteristics cameraCharacteristics = this.length.getCameraCharacteristics(str);
                    int i2 = -99;
                    Object obj = cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (obj != null) {
                        i2 = obj;
                    }
                    if (max == ((Integer) i2).intValue()) {
                        this.ICustomTabsService = str;
                        int i3 = 0;
                        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        if (obj2 != null) {
                            i3 = obj2;
                        }
                        invoke().setMin(facing, ((Integer) i3).intValue());
                        return true;
                    }
                    i++;
                } catch (CameraAccessException unused) {
                }
            }
            return false;
        } catch (CameraAccessException e) {
            throw getMax(e);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"MissingPermission"})
    @NonNull
    @EngineThread
    public final Task<RecyclerView> setMin() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            this.length.openCamera(this.ICustomTabsService, new CameraDevice.StateCallback() {
                public final void onOpened(@NonNull CameraDevice cameraDevice) {
                    int i;
                    CameraDevice unused = initAutofill.this.getDefaultImpl = cameraDevice;
                    try {
                        initChildrenHelper.asInterface.getMax(1, "onStartEngine:", "Opened camera device.");
                        CameraCharacteristics unused2 = initAutofill.this.setDefaultImpl = initAutofill.this.length.getCameraCharacteristics(initAutofill.this.ICustomTabsService);
                        boolean min = initAutofill.this.ICustomTabsCallback.getMin(Reference.SENSOR, Reference.VIEW);
                        int i2 = AnonymousClass18.setMin[initAutofill.this.toString.ordinal()];
                        if (i2 == 1) {
                            i = 256;
                        } else if (i2 == 2) {
                            i = 32;
                        } else {
                            StringBuilder sb = new StringBuilder("Unknown format:");
                            sb.append(initAutofill.this.toString);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        initAutofill.this.getMin = new getItemDecorationCount(initAutofill.this.length, initAutofill.this.ICustomTabsService, min, i);
                        CaptureRequest.Builder unused3 = initAutofill.this.values(1);
                        taskCompletionSource.trySetResult(initAutofill.this.getMin);
                    } catch (CameraAccessException e) {
                        taskCompletionSource.trySetException(initAutofill.getMax(e));
                    }
                }

                public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
                    CameraException cameraException = new CameraException(3);
                    if (!taskCompletionSource.getTask().isComplete()) {
                        taskCompletionSource.trySetException(cameraException);
                        return;
                    }
                    initChildrenHelper.asInterface.getMax(1, "CameraDevice.StateCallback reported disconnection.");
                    throw cameraException;
                }

                public final void onError(@NonNull CameraDevice cameraDevice, int i) {
                    if (!taskCompletionSource.getTask().isComplete()) {
                        taskCompletionSource.trySetException(initAutofill.setMin(i));
                        return;
                    }
                    initChildrenHelper.asInterface.getMax(3, "CameraDevice.StateCallback reported an error:", Integer.valueOf(i));
                    throw new CameraException(3);
                }
            }, (Handler) null);
            return taskCompletionSource.getTask();
        } catch (CameraAccessException e) {
            throw getMax(e);
        }
    }

    /* renamed from: o.initAutofill$18  reason: invalid class name */
    static /* synthetic */ class AnonymousClass18 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.otaliastudios.cameraview.controls.PictureFormat[] r0 = com.otaliastudios.cameraview.controls.PictureFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.otaliastudios.cameraview.controls.PictureFormat r1 = com.otaliastudios.cameraview.controls.PictureFormat.JPEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.otaliastudios.cameraview.controls.PictureFormat r1 = com.otaliastudios.cameraview.controls.PictureFormat.DNG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.initAutofill.AnonymousClass18.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> getMin() {
        int i;
        asInterface.getMax(1, "onStartBind:", "Started");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.toFloatRange = IPostMessageService$Stub();
        this.equals = IPostMessageService$Default();
        ArrayList arrayList = new ArrayList();
        Class<SurfaceTexture> max = this.setMax.getMax();
        final Object min = this.setMax.getMin();
        if (max == SurfaceHolder.class) {
            try {
                Tasks.await(Tasks.call(new Callable<Void>() {
                    public final /* synthetic */ Object call() throws Exception {
                        ((SurfaceHolder) min).setFixedSize(initAutofill.this.equals.getMax, initAutofill.this.equals.getMin);
                        return null;
                    }
                }));
                this.updateVisuals = ((SurfaceHolder) min).getSurface();
            } catch (InterruptedException | ExecutionException e) {
                throw new CameraException(e, 1);
            }
        } else if (max == SurfaceTexture.class) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) min;
            surfaceTexture.setDefaultBufferSize(this.equals.getMax, this.equals.getMin);
            this.updateVisuals = new Surface(surfaceTexture);
        } else {
            throw new RuntimeException("Unknown CameraPreview output class.");
        }
        arrayList.add(this.updateVisuals);
        if (ICustomTabsCallback$Stub$Proxy() == Mode.VIDEO && this.requestPostMessageChannelWithExtras != null) {
            Full2VideoRecorder full2VideoRecorder = new Full2VideoRecorder(this, this.ICustomTabsService);
            try {
                arrayList.add(full2VideoRecorder.getMin(this.requestPostMessageChannelWithExtras));
                this.getMax = full2VideoRecorder;
            } catch (Full2VideoRecorder.PrepareException e2) {
                throw new CameraException(e2, 1);
            }
        }
        if (ICustomTabsCallback$Stub$Proxy() == Mode.PICTURE) {
            int i2 = AnonymousClass18.setMin[this.toString.ordinal()];
            if (i2 == 1) {
                i = 256;
            } else if (i2 == 2) {
                i = 32;
            } else {
                StringBuilder sb = new StringBuilder("Unknown format:");
                sb.append(this.toString);
                throw new IllegalArgumentException(sb.toString());
            }
            ImageReader newInstance = ImageReader.newInstance(this.toFloatRange.getMax, this.toFloatRange.getMin, i, 2);
            this.validateRelationship = newInstance;
            arrayList.add(newInstance.getSurface());
        }
        if (postMessage()) {
            this.isInside = onExtraCallback();
            ImageReader newInstance2 = ImageReader.newInstance(this.isInside.getMax, this.isInside.getMin, this.toIntRange, ICustomTabsCallback$Default() + 1);
            this.newSession = newInstance2;
            newInstance2.setOnImageAvailableListener(this, (Handler) null);
            Surface surface = this.newSession.getSurface();
            this.requestPostMessageChannel = surface;
            arrayList.add(surface);
        } else {
            this.newSession = null;
            this.isInside = null;
            this.requestPostMessageChannel = null;
        }
        try {
            this.getDefaultImpl.createCaptureSession(arrayList, new CameraCaptureSession.StateCallback() {
                public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
                    CameraCaptureSession unused = initAutofill.this.mayLaunchUrl = cameraCaptureSession;
                    initChildrenHelper.asInterface.getMax(1, "onStartBind:", SnapReceiptBroadcastData.Status.Completed);
                    taskCompletionSource.trySetResult(null);
                }

                public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
                    throw new RuntimeException(initChildrenHelper.asInterface.getMax(3, "onConfigureFailed! Session", cameraCaptureSession));
                }

                public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
                    super.onReady(cameraCaptureSession);
                    initChildrenHelper.asInterface.getMax(1, "CameraCaptureSession.StateCallback reported onReady.");
                }
            }, (Handler) null);
            return taskCompletionSource.getTask();
        } catch (CameraAccessException e3) {
            throw getMax(e3);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> isInside() {
        asInterface.getMax(1, "onStartPreview:", "Dispatching onCameraPreviewStreamSizeChanged.");
        this.ICustomTabsCallback$Stub$Proxy.setMax();
        shouldDeferAccessibilityEvent min = getMin(Reference.VIEW);
        if (min != null) {
            this.setMax.setMax(min.getMax, min.getMin);
            this.setMax.getMax(invoke().getMin(Reference.BASE, Reference.VIEW, Axis.ABSOLUTE));
            if (postMessage()) {
                FastBitmap$CoordinateSystem().getMin(this.toIntRange, this.isInside);
            }
            asInterface.setMax("onStartPreview:", "Starting preview.");
            setMax(new Surface[0]);
            setMin(false, 2);
            asInterface.setMax("onStartPreview:", "Started preview.");
            final exceptionLabel.setMax setmax = this.requestPostMessageChannelWithExtras;
            if (setmax != null) {
                this.requestPostMessageChannelWithExtras = null;
                removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
                removeitemdecorationat.setMin("do take video", true, new Callable<Task<Void>>(new Runnable(CameraState.PREVIEW, new Runnable() {
                    public final void run() {
                        initAutofill.setMin(initAutofill.this, setmax);
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
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            new setScrollingTouchSlop() {
                public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                    super.getMin(getfullclassname, captureRequest, totalCaptureResult);
                    getMax(Integer.MAX_VALUE);
                    taskCompletionSource.trySetResult(null);
                }
            }.getMin((getFullClassName) this);
            return taskCompletionSource.getTask();
        }
        throw new IllegalStateException("previewStreamSize should not be null at this point.");
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
        if (postMessage()) {
            FastBitmap$CoordinateSystem().length();
        }
        this.extraCommand.removeTarget(this.updateVisuals);
        Surface surface = this.requestPostMessageChannel;
        if (surface != null) {
            this.extraCommand.removeTarget(surface);
        }
        this.warmup = null;
        asInterface.getMax(1, "onStopPreview:", "Returning.");
        return Tasks.forResult(null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> toIntRange() {
        asInterface.getMax(1, "onStopBind:", "About to clean up.");
        this.requestPostMessageChannel = null;
        this.updateVisuals = null;
        this.equals = null;
        this.toFloatRange = null;
        this.isInside = null;
        ImageReader imageReader = this.newSession;
        if (imageReader != null) {
            imageReader.close();
            this.newSession = null;
        }
        ImageReader imageReader2 = this.validateRelationship;
        if (imageReader2 != null) {
            imageReader2.close();
            this.validateRelationship = null;
        }
        this.mayLaunchUrl.close();
        this.mayLaunchUrl = null;
        asInterface.getMax(1, "onStopBind:", "Returning.");
        return Tasks.forResult(null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public final Task<Void> toFloatRange() {
        try {
            asInterface.getMax(1, "onStopEngine:", "Clean up.", "Releasing camera.");
            this.getDefaultImpl.close();
            asInterface.getMax(1, "onStopEngine:", "Clean up.", "Released camera.");
        } catch (Exception e) {
            asInterface.getMax(2, "onStopEngine:", "Clean up.", "Exception while releasing camera.", e);
        }
        this.getDefaultImpl = null;
        asInterface.getMax(1, "onStopEngine:", "Aborting actions.");
        for (setHasFixedSize min : this.IPostMessageService) {
            min.setMin(this);
        }
        this.setDefaultImpl = null;
        this.getMin = null;
        this.getMax = null;
        this.extraCommand = null;
        asInterface.getMax(2, "onStopEngine:", "Returning.");
        return Tasks.forResult(null);
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void getMax(@NonNull final calculateDtToFit.length length2, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled, boolean z) {
        if (z) {
            asInterface.getMax(1, "onTakePictureSnapshot:", "doMetering is true. Delaying.");
            getClipToPadding getcliptopadding = new getClipToPadding(2500, getMin((setEdgeEffectFactory) null));
            getcliptopadding.getMin((hasFixedSize) new setClipToPadding() {
                public final void length() {
                    initAutofill.this.getMax(false);
                    initAutofill.this.setMax(length2);
                    initAutofill.this.getMax(true);
                }
            });
            getcliptopadding.getMin((getFullClassName) this);
            return;
        }
        asInterface.getMax(1, "onTakePictureSnapshot:", "doMetering is false. Performing.");
        if (this.setMax instanceof setItemAnimator) {
            length2.getMax = setMin(Reference.OUTPUT);
            length2.length = invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR);
            this.setMin = new resetScroll(length2, this, (setItemAnimator) this.setMax, predictiveitemanimationsenabled);
            this.setMin.getMax();
            return;
        }
        throw new RuntimeException("takePictureSnapshot with Camera2 is only supported with Preview.GL_SURFACE");
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void getMin(@NonNull final calculateDtToFit.length length2, boolean z) {
        if (z) {
            asInterface.getMax(1, "onTakePicture:", "doMetering is true. Delaying.");
            getClipToPadding getcliptopadding = new getClipToPadding(2500, getMin((setEdgeEffectFactory) null));
            getcliptopadding.getMin((hasFixedSize) new setClipToPadding() {
                public final void length() {
                    initAutofill.this.setMin(false);
                    initAutofill.this.setMin(length2);
                    initAutofill.this.setMin(true);
                }
            });
            getcliptopadding.getMin((getFullClassName) this);
            return;
        }
        asInterface.getMax(1, "onTakePicture:", "doMetering is false. Performing.");
        length2.length = invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR);
        length2.getMax = getMax(Reference.OUTPUT);
        try {
            CaptureRequest.Builder createCaptureRequest = this.getDefaultImpl.createCaptureRequest(2);
            setMax(createCaptureRequest, this.extraCommand);
            this.setMin = new requestChildOnScreen(length2, this, createCaptureRequest, this.validateRelationship);
            this.setMin.getMax();
        } catch (CameraAccessException e) {
            throw getMax(e);
        }
    }

    public final void getMax(@Nullable calculateDtToFit.length length2, @Nullable Exception exc) {
        boolean z = this.setMin instanceof requestChildOnScreen;
        super.getMax(length2, exc);
        if ((z && updateVisuals()) || (!z && IPostMessageService())) {
            removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
            removeitemdecorationat.setMin("reset metering after picture", true, new Callable<Task<Void>>(new Runnable(CameraState.PREVIEW, new Runnable() {
                public final void run() {
                    new swapAdapter(Arrays.asList(new setScrollingTouchSlop[]{new setScrollingTouchSlop() {
                        public final void length(@NonNull getFullClassName getfullclassname) {
                            super.length(getfullclassname);
                            initAutofill.this.length(getfullclassname.Grayscale$Algorithm());
                            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.FALSE);
                            getfullclassname.valueOf();
                            getMax(Integer.MAX_VALUE);
                        }
                    }, new setItemViewCacheSize()})).getMin((getFullClassName) initAutofill.this);
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
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void setMin(@NonNull exceptionLabel.setMax setmax) {
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent;
        asInterface.getMax(1, "onTakeVideo", "called.");
        setmax.getMax = invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR);
        if (invoke().getMin(Reference.SENSOR, Reference.OUTPUT)) {
            shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = this.toFloatRange;
            shoulddeferaccessibilityevent = new shouldDeferAccessibilityEvent(shoulddeferaccessibilityevent2.getMin, shoulddeferaccessibilityevent2.getMax);
        } else {
            shoulddeferaccessibilityevent = this.toFloatRange;
        }
        setmax.length = shoulddeferaccessibilityevent;
        asInterface.getMax(2, "onTakeVideo", "calling restartBind.");
        this.requestPostMessageChannelWithExtras = setmax;
        ITrustedWebActivityCallback$Stub();
    }

    /* access modifiers changed from: protected */
    @EngineThread
    public final void getMin(@NonNull exceptionLabel.setMax setmax, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled) {
        if (this.setMax instanceof setItemAnimator) {
            setItemAnimator setitemanimator = (setItemAnimator) this.setMax;
            shouldDeferAccessibilityEvent min = setMin(Reference.OUTPUT);
            if (min != null) {
                Rect max = pullGlows.setMax(min, predictiveitemanimationsenabled);
                setmax.length = new shouldDeferAccessibilityEvent(max.width(), max.height());
                setmax.getMax = invoke().getMin(Reference.BASE, Reference.OUTPUT, Axis.ABSOLUTE);
                setmax.FastBitmap$CoordinateSystem = Math.round(this.onNavigationEvent);
                asInterface.setMax("onTakeVideoSnapshot", "rotation:", Integer.valueOf(setmax.getMax), "size:", setmax.length);
                this.getMax = new processAdapterUpdatesAndSetAnimationFlags(this, setitemanimator, ICustomTabsCallback(), invoke().getMin(Reference.VIEW, Reference.OUTPUT, Axis.ABSOLUTE));
                this.getMax.setMax(setmax);
                return;
            }
            throw new IllegalStateException("outputSize should not be null.");
        }
        throw new IllegalStateException("Video snapshots are only supported with GL_SURFACE.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void values() {
        /*
            r6 = this;
            super.values()
            o.findNextViewToFocus r0 = r6.getMax
            boolean r0 = r0 instanceof com.otaliastudios.cameraview.video.Full2VideoRecorder
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0027
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.hardware.camera2.CameraCharacteristics r5 = r6.setDefaultImpl
            java.lang.Object r0 = r5.get(r0)
            if (r0 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r4 = r0
        L_0x001d:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r0 = r4.intValue()
            if (r0 != r3) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0059
            com.otaliastudios.cameraview.CameraLogger r0 = asInterface
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "Applying the Issue549 workaround."
            r4[r2] = r5
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r4[r1] = r5
            r0.getMax(r3, r4)
            r6.notifyNotificationWithChannel()
            com.otaliastudios.cameraview.CameraLogger r0 = asInterface
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "Applied the Issue549 workaround. Sleeping..."
            r4[r2] = r5
            r0.getMax(r3, r4)
            r4 = 600(0x258, double:2.964E-321)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x004e }
        L_0x004e:
            com.otaliastudios.cameraview.CameraLogger r0 = asInterface
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = "Applied the Issue549 workaround. Slept!"
            r1[r2] = r4
            r0.getMax(r3, r1)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initAutofill.values():void");
    }

    public final void setMax(@Nullable exceptionLabel.setMax setmax, @Nullable Exception exc) {
        super.setMax(setmax, exc);
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        removeitemdecorationat.setMin("restore preview template", true, new Callable<Task<Void>>(new Runnable(CameraState.BIND, new Runnable() {
            public final void run() {
                initAutofill.this.notifyNotificationWithChannel();
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
    @EngineThread
    public void notifyNotificationWithChannel() {
        if (((Integer) this.extraCommand.build().getTag()).intValue() != 1) {
            try {
                values(1);
                setMax(new Surface[0]);
                setMin(true, 3);
            } catch (CameraAccessException e) {
                throw getMax(e);
            }
        }
    }

    private void setMax(@NonNull CaptureRequest.Builder builder, @Nullable CaptureRequest.Builder builder2) {
        asInterface.getMax(1, "applyAllParameters:", "called for tag", builder.build().getTag());
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        length(builder);
        getMax(builder, Flash.OFF);
        getMax(builder);
        length(builder, WhiteBalance.AUTO);
        setMin(builder, Hdr.OFF);
        length(builder, 0.0f);
        getMax(builder, 0.0f);
        getMin(builder, 0.0f);
        if (builder2 != null) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, builder2.get(CaptureRequest.CONTROL_AF_REGIONS));
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, builder2.get(CaptureRequest.CONTROL_AE_REGIONS));
            builder.set(CaptureRequest.CONTROL_AWB_REGIONS, builder2.get(CaptureRequest.CONTROL_AWB_REGIONS));
            builder.set(CaptureRequest.CONTROL_AF_MODE, builder2.get(CaptureRequest.CONTROL_AF_MODE));
        }
    }

    /* access modifiers changed from: protected */
    public final void length(@NonNull CaptureRequest.Builder builder) {
        Object obj = new int[0];
        Object obj2 = this.setDefaultImpl.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (obj2 != null) {
            obj = obj2;
        }
        ArrayList arrayList = new ArrayList();
        for (int valueOf : (int[]) obj) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        if (ICustomTabsCallback$Stub$Proxy() == Mode.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        } else if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        } else if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else if (arrayList.contains(0)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(0.0f));
        }
    }

    private void setMin(@NonNull CaptureRequest.Builder builder) {
        Object obj = new int[0];
        Object obj2 = this.setDefaultImpl.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (obj2 != null) {
            obj = obj2;
        }
        ArrayList arrayList = new ArrayList();
        for (int valueOf : (int[]) obj) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        if (arrayList.contains(1)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        } else if (ICustomTabsCallback$Stub$Proxy() == Mode.VIDEO && arrayList.contains(3)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        } else if (arrayList.contains(4)) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
    }

    public final void setMin(@NonNull final Flash flash) {
        final Flash flash2 = this.toDoubleRange;
        this.toDoubleRange = flash;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("flash (");
        sb.append(flash);
        sb.append(")");
        this.onMessageChannelReady = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                initAutofill initautofill = initAutofill.this;
                boolean max = initautofill.getMax(initautofill.extraCommand, flash2);
                if (initAutofill.this.getInterfaceDescriptor.toFloatRange == CameraState.PREVIEW) {
                    initAutofill.this.toDoubleRange = Flash.OFF;
                    initAutofill initautofill2 = initAutofill.this;
                    initautofill2.getMax(initautofill2.extraCommand, flash2);
                    try {
                        initAutofill.this.mayLaunchUrl.capture(initAutofill.this.extraCommand.build(), (CameraCaptureSession.CaptureCallback) null, (Handler) null);
                        initAutofill.this.toDoubleRange = flash;
                        initAutofill initautofill3 = initAutofill.this;
                        initautofill3.getMax(initautofill3.extraCommand, flash2);
                        initAutofill.this.IsOverlapping();
                    } catch (CameraAccessException e) {
                        throw initAutofill.getMax(e);
                    }
                } else if (max) {
                    initAutofill.this.IsOverlapping();
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

    /* access modifiers changed from: protected */
    public final boolean getMax(@NonNull CaptureRequest.Builder builder, @NonNull Flash flash) {
        if (this.getMin.setMax(this.toDoubleRange)) {
            Object obj = new int[0];
            Object obj2 = this.setDefaultImpl.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (obj2 != null) {
                obj = obj2;
            }
            ArrayList arrayList = new ArrayList();
            for (int valueOf : (int[]) obj) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            for (Pair next : removeOnChildAttachStateChangeListener.getMin(this.toDoubleRange)) {
                if (arrayList.contains(next.first)) {
                    asInterface.setMax("applyFlash: setting CONTROL_AE_MODE to", next.first);
                    asInterface.setMax("applyFlash: setting FLASH_MODE to", next.second);
                    builder.set(CaptureRequest.CONTROL_AE_MODE, next.first);
                    builder.set(CaptureRequest.FLASH_MODE, next.second);
                    return true;
                }
            }
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
                initAutofill initautofill = initAutofill.this;
                initautofill.getMax(initautofill.extraCommand);
                initAutofill.this.IsOverlapping();
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

    /* access modifiers changed from: protected */
    public final boolean getMax(@NonNull CaptureRequest.Builder builder) {
        if (this.Mean$Arithmetic == null) {
            return true;
        }
        builder.set(CaptureRequest.JPEG_GPS_LOCATION, this.Mean$Arithmetic);
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
                initAutofill initautofill = initAutofill.this;
                if (initautofill.length(initautofill.extraCommand, whiteBalance2)) {
                    initAutofill.this.IsOverlapping();
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

    /* access modifiers changed from: protected */
    public final boolean length(@NonNull CaptureRequest.Builder builder, @NonNull WhiteBalance whiteBalance) {
        if (this.getMin.setMax(this.hashCode)) {
            builder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(removeOnChildAttachStateChangeListener.getMin(this.hashCode)));
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
                initAutofill initautofill = initAutofill.this;
                if (initautofill.setMin(initautofill.extraCommand, hdr2)) {
                    initAutofill.this.IsOverlapping();
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

    /* access modifiers changed from: protected */
    public final boolean setMin(@NonNull CaptureRequest.Builder builder, @NonNull Hdr hdr) {
        if (this.getMin.setMax(this.FastBitmap$CoordinateSystem)) {
            builder.set(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(removeOnChildAttachStateChangeListener.setMax(this.FastBitmap$CoordinateSystem)));
            return true;
        }
        this.FastBitmap$CoordinateSystem = hdr;
        return false;
    }

    public final void length(float f, @Nullable PointF[] pointFArr, boolean z) {
        final float f2 = this.invoke;
        this.invoke = f;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("zoom (");
        sb.append(f);
        sb.append(")");
        final boolean z2 = z;
        final float f3 = f;
        final PointF[] pointFArr2 = pointFArr;
        this.b = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                initAutofill initautofill = initAutofill.this;
                if (initautofill.length(initautofill.extraCommand, f2)) {
                    initAutofill.this.IsOverlapping();
                    if (z2) {
                        initAutofill.this.ICustomTabsCallback$Stub$Proxy.setMin(f3, pointFArr2);
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

    /* access modifiers changed from: protected */
    public final boolean length(@NonNull CaptureRequest.Builder builder, float f) {
        if (this.getMin.setMin()) {
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
            Object valueOf = Float.valueOf(1.0f);
            Object obj = this.setDefaultImpl.get(key);
            if (obj != null) {
                valueOf = obj;
            }
            float floatValue = ((Float) valueOf).floatValue();
            float f2 = floatValue - 1.0f;
            float f3 = (this.invoke * f2) + 1.0f;
            CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
            Object rect = new Rect();
            Object obj2 = this.setDefaultImpl.get(key2);
            if (obj2 != null) {
                rect = obj2;
            }
            Rect rect2 = (Rect) rect;
            int height = (int) (((float) rect2.height()) / floatValue);
            int width = rect2.width() - ((int) (((float) rect2.width()) / floatValue));
            int height2 = rect2.height() - height;
            float f4 = f3 - 1.0f;
            int i = (int) (((((float) width) * f4) / f2) / 2.0f);
            int i2 = (int) (((((float) height2) * f4) / f2) / 2.0f);
            builder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect2.width() - i, rect2.height() - i2));
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
        final float f3 = f;
        final float[] fArr2 = fArr;
        final PointF[] pointFArr2 = pointFArr;
        this.extraCallbackWithResult = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                initAutofill initautofill = initAutofill.this;
                if (initautofill.getMax(initautofill.extraCommand, f2)) {
                    initAutofill.this.IsOverlapping();
                    if (z2) {
                        initAutofill.this.ICustomTabsCallback$Stub$Proxy.getMax(f3, fArr2, pointFArr2);
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

    /* access modifiers changed from: protected */
    public final boolean getMax(@NonNull CaptureRequest.Builder builder, float f) {
        if (this.getMin.getMax()) {
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            Object rational = new Rational(1, 1);
            Object obj = this.setDefaultImpl.get(key);
            if (obj != null) {
                rational = obj;
            }
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(Math.round(this.valueOf * ((Rational) rational).floatValue())));
            return true;
        }
        this.valueOf = f;
        return false;
    }

    public final void setMax(boolean z) {
        this.invokeSuspend = z;
        this.ICustomTabsCallback$Stub = Tasks.forResult(null);
    }

    public final void length(float f) {
        final float f2 = this.onNavigationEvent;
        this.onNavigationEvent = f;
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("preview fps (");
        sb.append(f);
        sb.append(")");
        this.onTransact = removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
            public final void run() {
                initAutofill initautofill = initAutofill.this;
                if (initautofill.getMin(initautofill.extraCommand, f2)) {
                    initAutofill.this.IsOverlapping();
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

    /* access modifiers changed from: protected */
    public final boolean getMin(@NonNull CaptureRequest.Builder builder, float f) {
        Object obj = new Range[0];
        Object obj2 = this.setDefaultImpl.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (obj2 != null) {
            obj = obj2;
        }
        Range[] rangeArr = (Range[]) obj;
        if (this.onNavigationEvent == 0.0f) {
            for (Range range : rangeArr) {
                if (range.contains(30) || range.contains(24)) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                    return true;
                }
            }
        } else {
            this.onNavigationEvent = Math.min(this.onNavigationEvent, this.getMin.toFloatRange());
            this.onNavigationEvent = Math.max(this.onNavigationEvent, this.getMin.toIntRange());
            for (Range range2 : rangeArr) {
                if (range2.contains(Integer.valueOf(Math.round(this.onNavigationEvent)))) {
                    builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
                    return true;
                }
            }
        }
        this.onNavigationEvent = f;
        return false;
    }

    public final void setMax(@NonNull PictureFormat pictureFormat) {
        if (pictureFormat != this.toString) {
            this.toString = pictureFormat;
            removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
            StringBuilder sb = new StringBuilder("picture format (");
            sb.append(pictureFormat);
            sb.append(")");
            removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.ENGINE, new Runnable() {
                public final void run() {
                    initAutofill.this.ITrustedWebActivityService();
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
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final consumePendingUpdateOperations getMax(int i) {
        return new startInterceptRequestLayout(i);
    }

    @EngineThread
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        asInterface.getMax(0, "onImageAvailable:", "trying to acquire Image.");
        try {
            image = imageReader.acquireLatestImage();
        } catch (Exception unused) {
            image = null;
        }
        if (image == null) {
            asInterface.getMax(2, "onImageAvailable:", "failed to acquire Image!");
        } else if (this.getInterfaceDescriptor.toFloatRange != CameraState.PREVIEW || ITrustedWebActivityCallback$Default()) {
            asInterface.getMax(1, "onImageAvailable:", "Image acquired in wrong state. Closing it now.");
            image.close();
        } else {
            nestedScrollByInternal max = FastBitmap$CoordinateSystem().setMax(image, System.currentTimeMillis(), invoke().getMin(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR));
            if (max != null) {
                asInterface.getMax(0, "onImageAvailable:", "Image acquired, dispatching.");
                this.ICustomTabsCallback$Stub$Proxy.getMin(max);
                return;
            }
            asInterface.getMax(1, "onImageAvailable:", "Image acquired, but no free frames. DROPPING.");
        }
    }

    public final void setMax(final int i) {
        if (this.toIntRange == 0) {
            this.toIntRange = 35;
        }
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("frame processing format (");
        sb.append(i);
        sb.append(")");
        removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable() {
            public final void run() {
                if (!initAutofill.this.getInterfaceDescriptor.toFloatRange.isAtLeast(CameraState.BIND) || !initAutofill.this.ITrustedWebActivityCallback$Default()) {
                    initAutofill initautofill = initAutofill.this;
                    int i = i;
                    if (i <= 0) {
                        i = 35;
                    }
                    initautofill.toIntRange = i;
                    if (initAutofill.this.getInterfaceDescriptor.toFloatRange.isAtLeast(CameraState.BIND)) {
                        initAutofill.this.ITrustedWebActivityCallback$Stub();
                        return;
                    }
                    return;
                }
                initAutofill.this.setMax(i);
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
    @NonNull
    public removeAnimatingView getMin(@Nullable setEdgeEffectFactory setedgeeffectfactory) {
        removeAnimatingView removeanimatingview = this.ICustomTabsService$Default;
        if (removeanimatingview != null) {
            removeanimatingview.setMin(this);
        }
        setMin(this.extraCommand);
        removeAnimatingView removeanimatingview2 = new removeAnimatingView(this, setedgeeffectfactory, setedgeeffectfactory == null);
        this.ICustomTabsService$Default = removeanimatingview2;
        return removeanimatingview2;
    }

    public final void getMax(@NonNull setHasFixedSize sethasfixedsize) {
        if (!this.IPostMessageService.contains(sethasfixedsize)) {
            this.IPostMessageService.add(sethasfixedsize);
        }
    }

    public final void setMax(@NonNull setHasFixedSize sethasfixedsize) {
        this.IPostMessageService.remove(sethasfixedsize);
    }

    @NonNull
    public final CameraCharacteristics toDoubleRange() {
        return this.setDefaultImpl;
    }

    @Nullable
    public final TotalCaptureResult Mean$Arithmetic() {
        return this.warmup;
    }

    @NonNull
    public final CaptureRequest.Builder Grayscale$Algorithm() {
        return this.extraCommand;
    }

    @EngineThread
    private void setMin(boolean z, int i) {
        if ((this.getInterfaceDescriptor.toFloatRange == CameraState.PREVIEW && !ITrustedWebActivityCallback$Default()) || !z) {
            try {
                this.mayLaunchUrl.setRepeatingRequest(this.extraCommand.build(), this.ICustomTabsService$Stub, (Handler) null);
            } catch (CameraAccessException e) {
                throw new CameraException(e, i);
            } catch (IllegalStateException e2) {
                asInterface.getMax(3, "applyRepeatingRequestBuilder: session is invalid!", e2, "checkStarted:", Boolean.valueOf(z), "currentThread:", Thread.currentThread().getName(), "state:", this.getInterfaceDescriptor.toFloatRange, "targetState:", this.getInterfaceDescriptor.toIntRange);
                throw new CameraException(3);
            }
        }
    }

    public final void length(final boolean z) {
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("has frame processors (");
        sb.append(z);
        sb.append(")");
        removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable() {
            public final void run() {
                if (!initAutofill.this.getInterfaceDescriptor.toFloatRange.isAtLeast(CameraState.BIND) || !initAutofill.this.ITrustedWebActivityCallback$Default()) {
                    initAutofill.this.IsOverlapping = z;
                    if (initAutofill.this.getInterfaceDescriptor.toFloatRange.isAtLeast(CameraState.BIND)) {
                        initAutofill.this.ITrustedWebActivityCallback$Stub();
                        return;
                    }
                    return;
                }
                initAutofill.this.length(z);
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

    public final void setMax(@Nullable final Gesture gesture, @NonNull final setEdgeEffectFactory setedgeeffectfactory, @NonNull final PointF pointF) {
        removeItemDecorationAt removeitemdecorationat = this.getInterfaceDescriptor;
        StringBuilder sb = new StringBuilder("autofocus (");
        sb.append(gesture);
        sb.append(")");
        removeitemdecorationat.setMin(sb.toString(), true, new Callable<Task<Void>>(new Runnable(CameraState.PREVIEW, new Runnable() {
            public final void run() {
                if (initAutofill.this.getMin.getMin()) {
                    initAutofill.this.ICustomTabsCallback$Stub$Proxy.getMax(gesture, pointF);
                    final removeAnimatingView max = initAutofill.this.getMin(setedgeeffectfactory);
                    getClipToPadding getcliptopadding = new getClipToPadding(5000, max);
                    getcliptopadding.getMin((getFullClassName) initAutofill.this);
                    getcliptopadding.getMin((hasFixedSize) new setClipToPadding() {
                        public final void length() {
                            initAutofill.this.ICustomTabsCallback$Stub$Proxy.setMax(gesture, max.getMin(), pointF);
                            initAutofill.this.getInterfaceDescriptor.getMax("reset metering");
                            if (initAutofill.this.getDefaultImpl()) {
                                removeItemDecorationAt removeitemdecorationat = initAutofill.this.getInterfaceDescriptor;
                                removeitemdecorationat.length("reset metering", initAutofill.this.create, new Runnable(CameraState.PREVIEW, new Runnable() {
                                    public final void run() {
                                        new swapAdapter(Arrays.asList(new setScrollingTouchSlop[]{new setScrollingTouchSlop() {
                                            public final void length(@NonNull getFullClassName getfullclassname) {
                                                super.length(getfullclassname);
                                                initAutofill.this.length(getfullclassname.Grayscale$Algorithm());
                                                getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                                                getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.FALSE);
                                                getfullclassname.valueOf();
                                                getMax(Integer.MAX_VALUE);
                                            }
                                        }, new setItemViewCacheSize()})).getMin((getFullClassName) initAutofill.this);
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

    @EngineThread
    public final void valueOf() {
        setMin(true, 3);
    }

    public final void setMax(@NonNull CaptureRequest.Builder builder) throws CameraAccessException {
        if (this.getInterfaceDescriptor.toFloatRange == CameraState.PREVIEW && !ITrustedWebActivityCallback$Default()) {
            this.mayLaunchUrl.capture(builder.build(), this.ICustomTabsService$Stub, (Handler) null);
        }
    }

    static /* synthetic */ CameraException setMin(int i) {
        int i2 = 1;
        if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 5)) {
            i2 = 0;
        }
        return new CameraException(i2);
    }

    static /* synthetic */ void setMin(initAutofill initautofill, exceptionLabel.setMax setmax) {
        if (initautofill.getMax instanceof Full2VideoRecorder) {
            Full2VideoRecorder full2VideoRecorder = (Full2VideoRecorder) initautofill.getMax;
            try {
                initautofill.values(3);
                initautofill.setMax(full2VideoRecorder.length);
                initautofill.setMin(true, 3);
                initautofill.getMax.setMax(setmax);
            } catch (CameraAccessException e) {
                initautofill.setMax((exceptionLabel.setMax) null, (Exception) e);
                throw getMax(e);
            } catch (CameraException e2) {
                initautofill.setMax((exceptionLabel.setMax) null, (Exception) e2);
                throw e2;
            }
        } else {
            StringBuilder sb = new StringBuilder("doTakeVideo called, but video recorder is not a Full2VideoRecorder! ");
            sb.append(initautofill.getMax);
            throw new IllegalStateException(sb.toString());
        }
    }
}
