package o;

import android.content.Context;
import android.graphics.PointF;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.CameraException;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.controls.Audio;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.controls.Flash;
import com.otaliastudios.cameraview.controls.Hdr;
import com.otaliastudios.cameraview.controls.Mode;
import com.otaliastudios.cameraview.controls.PictureFormat;
import com.otaliastudios.cameraview.controls.VideoCodec;
import com.otaliastudios.cameraview.controls.WhiteBalance;
import com.otaliastudios.cameraview.engine.EngineThread;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.engine.orchestrator.CameraState;
import com.otaliastudios.cameraview.gesture.Gesture;
import com.otaliastudios.cameraview.overlay.Overlay;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o.addItemDecoration;
import o.calculateDtToFit;
import o.exceptionLabel;
import o.findNextViewToFocus;
import o.onEnterLayoutOrScroll;
import o.onPointerUp;

public abstract class initChildrenHelper implements onEnterLayoutOrScroll.setMax, onPointerUp.length, findNextViewToFocus.length {
    protected static final String ICustomTabsCallback$Default;
    protected static final CameraLogger asInterface;
    /* access modifiers changed from: package-private */
    public final length ICustomTabsCallback$Stub$Proxy;
    @VisibleForTesting
    Handler asBinder;
    public final removeItemDecorationAt getInterfaceDescriptor = new removeItemDecorationAt(new addItemDecoration.getMax() {
        @NonNull
        public final ensureTopGlow setMax() {
            return initChildrenHelper.this.length;
        }

        public final void getMax(@NonNull Exception exc) {
            initChildrenHelper.getMin(initChildrenHelper.this, exc, false);
        }
    });
    /* access modifiers changed from: private */
    public ensureTopGlow length;

    public interface length {
        void IsOverlapping();

        void equals();

        void getMax(float f, @NonNull float[] fArr, @Nullable PointF[] pointFArr);

        void getMax(@Nullable Gesture gesture, @NonNull PointF pointF);

        void getMax(boolean z);

        void getMin(@NonNull nestedScrollByInternal nestedscrollbyinternal);

        @NonNull
        Context length();

        void length(@NonNull exceptionLabel.setMax setmax);

        void setMax();

        void setMax(@Nullable Gesture gesture, boolean z, @NonNull PointF pointF);

        void setMax(@NonNull RecyclerView recyclerView);

        void setMin();

        void setMin(float f, @Nullable PointF[] pointFArr);

        void setMin(CameraException cameraException);

        void setMin(@NonNull calculateDtToFit.length length);
    }

    public abstract void FastBitmap$CoordinateSystem(int i);

    @Nullable
    public abstract Overlay ICustomTabsCallback();

    public abstract int ICustomTabsCallback$Default();

    public abstract int ICustomTabsCallback$Stub();

    @NonNull
    public abstract Mode ICustomTabsCallback$Stub$Proxy();

    @NonNull
    public abstract Facing ICustomTabsService();

    public abstract boolean ICustomTabsService$Default();

    public abstract boolean ICustomTabsService$Stub$Proxy();

    public abstract boolean IPostMessageService();

    public abstract void IsOverlapping(int i);

    public abstract int asBinder();

    public abstract int asInterface();

    @NonNull
    public abstract isComputingLayout b();

    @Nullable
    public abstract onEnterLayoutOrScroll create();

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public abstract Task<Void> equals();

    public abstract void equals(int i);

    public abstract int extraCallback();

    public abstract int extraCallbackWithResult();

    public abstract float extraCommand();

    @NonNull
    public abstract isComputingLayout getCause();

    @NonNull
    public abstract Audio getInterfaceDescriptor();

    @Nullable
    public abstract shouldDeferAccessibilityEvent getMax(@NonNull Reference reference);

    public abstract void getMax(@NonNull Audio audio);

    public abstract void getMax(@NonNull Hdr hdr);

    public abstract void getMax(@NonNull exceptionLabel.setMax setmax, @Nullable File file, @Nullable FileDescriptor fileDescriptor);

    public abstract void getMax(boolean z);

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public abstract Task<Void> getMin();

    @Nullable
    public abstract shouldDeferAccessibilityEvent getMin(@NonNull Reference reference);

    public abstract void getMin(int i);

    public abstract void getMin(long j);

    public abstract void getMin(@NonNull VideoCodec videoCodec);

    public abstract void getMin(@NonNull isComputingLayout iscomputinglayout);

    public abstract void getMin(@NonNull onEnterLayoutOrScroll onenterlayoutorscroll);

    @NonNull
    public abstract removeItemDecoration invoke();

    @Nullable
    public abstract RecyclerView invokeSuspend();

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public abstract Task<Void> isInside();

    public abstract void isInside(int i);

    public abstract void length(float f);

    public abstract void length(float f, @Nullable PointF[] pointFArr, boolean z);

    public abstract void length(int i);

    public abstract void length(@Nullable Location location);

    public abstract void length(@NonNull WhiteBalance whiteBalance);

    public abstract void length(@Nullable Overlay overlay);

    public abstract void length(@Nullable isComputingLayout iscomputinglayout);

    public abstract void length(boolean z);

    /* access modifiers changed from: protected */
    @EngineThread
    public abstract boolean length(@NonNull Facing facing);

    public abstract float mayLaunchUrl();

    @NonNull
    public abstract Flash newSession();

    @NonNull
    public abstract WhiteBalance newSessionWithExtras();

    public abstract int onMessageChannelReady();

    public abstract long onNavigationEvent();

    public abstract int onPostMessage();

    @NonNull
    public abstract VideoCodec onRelationshipValidationResult();

    public abstract int onTransact();

    public abstract void receiveFile();

    @Nullable
    public abstract Location requestPostMessageChannel();

    @NonNull
    public abstract PictureFormat requestPostMessageChannelWithExtras();

    public abstract long setDefaultImpl();

    @Nullable
    public abstract shouldDeferAccessibilityEvent setMax(@NonNull Reference reference);

    public abstract void setMax(int i);

    public abstract void setMax(long j);

    public abstract void setMax(@NonNull Facing facing);

    public abstract void setMax(@NonNull Mode mode);

    public abstract void setMax(@NonNull PictureFormat pictureFormat);

    public abstract void setMax(@Nullable Gesture gesture, @NonNull setEdgeEffectFactory setedgeeffectfactory, @NonNull PointF pointF);

    public abstract void setMax(@NonNull calculateDtToFit.length length2);

    public abstract void setMax(@NonNull exceptionLabel.setMax setmax, @NonNull File file);

    public abstract void setMax(@NonNull isComputingLayout iscomputinglayout);

    public abstract void setMax(boolean z);

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public abstract Task<RecyclerView> setMin();

    @Nullable
    public abstract shouldDeferAccessibilityEvent setMin(@NonNull Reference reference);

    public abstract void setMin(float f, @NonNull float[] fArr, @Nullable PointF[] pointFArr, boolean z);

    public abstract void setMin(@NonNull Flash flash);

    public abstract void setMin(@NonNull calculateDtToFit.length length2);

    public abstract void setMin(boolean z);

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public abstract Task<Void> toFloatRange();

    public abstract void toFloatRange(int i);

    /* access modifiers changed from: protected */
    @NonNull
    @EngineThread
    public abstract Task<Void> toIntRange();

    public abstract void toIntRange(int i);

    public abstract boolean updateVisuals();

    public abstract float validateRelationship();

    @NonNull
    public abstract Hdr warmup();

    static {
        String simpleName = initChildrenHelper.class.getSimpleName();
        ICustomTabsCallback$Default = simpleName;
        asInterface = CameraLogger.setMin(simpleName);
    }

    protected initChildrenHelper(@NonNull length length2) {
        this.ICustomTabsCallback$Stub$Proxy = length2;
        this.asBinder = new Handler(Looper.getMainLooper());
        IsOverlapping(false);
    }

    class getMax implements Thread.UncaughtExceptionHandler {
        private getMax() {
        }

        /* synthetic */ getMax(initChildrenHelper initchildrenhelper, byte b) {
            this();
        }

        public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            initChildrenHelper.getMin(initChildrenHelper.this, th, true);
        }
    }

    static class setMin implements Thread.UncaughtExceptionHandler {
        private setMin() {
        }

        /* synthetic */ setMin(byte b) {
            this();
        }

        public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            initChildrenHelper.asInterface.getMax(2, "EXCEPTION:", "In the NoOpExceptionHandler, probably while destroying.", "Thread:", thread, "Error:", th);
        }
    }

    private void IsOverlapping(boolean z) {
        ensureTopGlow ensuretopglow = this.length;
        if (ensuretopglow != null) {
            ensuretopglow.setMax();
        }
        ensureTopGlow max = ensureTopGlow.getMax("CameraViewEngine");
        this.length = max;
        max.getMax.setUncaughtExceptionHandler(new getMax(this, (byte) 0));
        if (z) {
            this.getInterfaceDescriptor.setMax();
        }
    }

    public final boolean ITrustedWebActivityCallback$Default() {
        return this.getInterfaceDescriptor.getMax();
    }

    public final void isInside(boolean z) {
        getMin(z, 0);
    }

    private void getMin(boolean z, int i) {
        asInterface.getMax(1, "DESTROY:", "state:", this.getInterfaceDescriptor.toFloatRange, "thread:", Thread.currentThread(), "depth:", Integer.valueOf(i), "unrecoverably:", Boolean.valueOf(z));
        if (z) {
            this.length.getMax.setUncaughtExceptionHandler(new setMin((byte) 0));
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        toFloatRange(true).addOnCompleteListener(this.length.setMax, new OnCompleteListener<Void>() {
            public final void onComplete(@NonNull Task<Void> task) {
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(6, TimeUnit.SECONDS)) {
                asInterface.setMin("DESTROY: Could not destroy synchronously after 6 seconds.", "Current thread:", Thread.currentThread(), "Handler thread:", this.length.getMax);
                int i2 = i + 1;
                if (i2 < 2) {
                    IsOverlapping(true);
                    asInterface.setMin("DESTROY: Trying again on thread:", this.length.getMax);
                    getMin(z, i2);
                    return;
                }
                asInterface.getMin("DESTROY: Giving up because DESTROY_RETRIES was reached.");
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void ITrustedWebActivityService() {
        asInterface.getMax(1, "RESTART:", "scheduled. State:", this.getInterfaceDescriptor.toFloatRange);
        toFloatRange(false);
        areNotificationsEnabled();
    }

    @NonNull
    public final Task<Void> areNotificationsEnabled() {
        asInterface.getMax(1, "START:", "scheduled. State:", this.getInterfaceDescriptor.toFloatRange);
        Task<Void> max = getMax();
        this.getInterfaceDescriptor.getMin(CameraState.ENGINE, CameraState.BIND, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                if (initChildrenHelper.this.create() == null || !initChildrenHelper.this.create().setMax()) {
                    return Tasks.forCanceled();
                }
                return initChildrenHelper.this.getMin();
            }
        });
        this.getInterfaceDescriptor.getMin(CameraState.BIND, CameraState.PREVIEW, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.isInside();
            }
        });
        return max;
    }

    @NonNull
    public final Task<Void> toFloatRange(boolean z) {
        asInterface.getMax(1, "STOP:", "scheduled. State:", this.getInterfaceDescriptor.toFloatRange);
        this.getInterfaceDescriptor.getMin(CameraState.PREVIEW, CameraState.BIND, !z, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.equals();
            }
        });
        this.getInterfaceDescriptor.getMin(CameraState.BIND, CameraState.ENGINE, !z, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.toIntRange();
            }
        });
        return toIntRange(z);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final Task<Void> ITrustedWebActivityCallback$Stub() {
        asInterface.getMax(1, "RESTART BIND:", "scheduled. State:", this.getInterfaceDescriptor.toFloatRange);
        this.getInterfaceDescriptor.getMin(CameraState.PREVIEW, CameraState.BIND, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.equals();
            }
        });
        this.getInterfaceDescriptor.getMin(CameraState.BIND, CameraState.ENGINE, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.toIntRange();
            }
        });
        this.getInterfaceDescriptor.getMin(CameraState.ENGINE, CameraState.BIND, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                if (initChildrenHelper.this.create() == null || !initChildrenHelper.this.create().setMax()) {
                    return Tasks.forCanceled();
                }
                return initChildrenHelper.this.getMin();
            }
        });
        return this.getInterfaceDescriptor.getMin(CameraState.BIND, CameraState.PREVIEW, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.isInside();
            }
        });
    }

    /* access modifiers changed from: protected */
    @NonNull
    public final Task<Void> ITrustedWebActivityCallback$Stub$Proxy() {
        asInterface.getMax(1, "RESTART PREVIEW:", "scheduled. State:", this.getInterfaceDescriptor.toFloatRange);
        this.getInterfaceDescriptor.getMin(CameraState.PREVIEW, CameraState.BIND, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.equals();
            }
        });
        return this.getInterfaceDescriptor.getMin(CameraState.BIND, CameraState.PREVIEW, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.isInside();
            }
        });
    }

    @NonNull
    @EngineThread
    private Task<Void> getMax() {
        return this.getInterfaceDescriptor.getMin(CameraState.OFF, CameraState.ENGINE, true, new Callable<Task<RecyclerView>>() {
            public final /* synthetic */ Object call() throws Exception {
                initChildrenHelper initchildrenhelper = initChildrenHelper.this;
                if (initchildrenhelper.length(initchildrenhelper.ICustomTabsService())) {
                    return initChildrenHelper.this.setMin();
                }
                initChildrenHelper.asInterface.getMax(3, "onStartEngine:", "No camera available for facing", initChildrenHelper.this.ICustomTabsService());
                throw new CameraException(6);
            }
        }).onSuccessTask(new SuccessContinuation<RecyclerView, Void>() {
            @NonNull
            public final /* synthetic */ Task then(@Nullable Object obj) throws Exception {
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView != null) {
                    initChildrenHelper.this.ICustomTabsCallback$Stub$Proxy.setMax(recyclerView);
                    return Tasks.forResult(null);
                }
                throw new RuntimeException("Null options!");
            }
        });
    }

    @NonNull
    @EngineThread
    private Task<Void> toIntRange(boolean z) {
        return this.getInterfaceDescriptor.getMin(CameraState.ENGINE, CameraState.OFF, !z, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.toFloatRange();
            }
        }).addOnSuccessListener(new OnSuccessListener<Void>() {
            public final /* synthetic */ void onSuccess(Object obj) {
                initChildrenHelper.this.ICustomTabsCallback$Stub$Proxy.setMin();
            }
        });
    }

    public final void getActiveNotifications() {
        CameraLogger cameraLogger = asInterface;
        onEnterLayoutOrScroll create = create();
        cameraLogger.getMax(1, "onSurfaceAvailable:", "Size is", new shouldDeferAccessibilityEvent(create.toIntRange, create.IsOverlapping));
        this.getInterfaceDescriptor.getMin(CameraState.ENGINE, CameraState.BIND, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                if (initChildrenHelper.this.create() == null || !initChildrenHelper.this.create().setMax()) {
                    return Tasks.forCanceled();
                }
                return initChildrenHelper.this.getMin();
            }
        });
        this.getInterfaceDescriptor.getMin(CameraState.BIND, CameraState.PREVIEW, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.isInside();
            }
        });
    }

    public final void cancelNotification() {
        asInterface.getMax(1, "onSurfaceDestroyed");
        this.getInterfaceDescriptor.getMin(CameraState.PREVIEW, CameraState.BIND, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.equals();
            }
        });
        this.getInterfaceDescriptor.getMin(CameraState.BIND, CameraState.ENGINE, true, new Callable<Task<Void>>() {
            public final /* synthetic */ Object call() throws Exception {
                return initChildrenHelper.this.toIntRange();
            }
        });
    }

    static /* synthetic */ void getMin(initChildrenHelper initchildrenhelper, final Throwable th, boolean z) {
        if (z) {
            asInterface.getMax(3, "EXCEPTION:", "Handler thread is gone. Replacing.");
            initchildrenhelper.IsOverlapping(false);
        }
        asInterface.getMax(3, "EXCEPTION:", "Scheduling on the crash handler...");
        initchildrenhelper.asBinder.post(new Runnable() {
            public final void run() {
                Throwable th = th;
                if (th instanceof CameraException) {
                    CameraException cameraException = (CameraException) th;
                    if (cameraException.isUnrecoverable()) {
                        initChildrenHelper.asInterface.getMax(3, "EXCEPTION:", "Got CameraException. Since it is unrecoverable, executing destroy(false).");
                        initChildrenHelper.this.isInside(false);
                    }
                    initChildrenHelper.asInterface.getMax(3, "EXCEPTION:", "Got CameraException. Dispatching to callback.");
                    initChildrenHelper.this.ICustomTabsCallback$Stub$Proxy.setMin(cameraException);
                    return;
                }
                initChildrenHelper.asInterface.getMax(3, "EXCEPTION:", "Unexpected error! Executing destroy(true).");
                initChildrenHelper.this.isInside(true);
                initChildrenHelper.asInterface.getMax(3, "EXCEPTION:", "Unexpected error! Throwing.");
                Throwable th2 = th;
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw new RuntimeException(th);
            }
        });
    }
}
