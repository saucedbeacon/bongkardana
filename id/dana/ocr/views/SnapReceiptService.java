package id.dana.ocr.views;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.text.TextUtils;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.di.modules.PreprocessingAndOcrModule;
import id.dana.di.modules.UploadSnapReceiptModule;
import id.dana.notification.NotificationData;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.UploadSnapReceiptContract;
import id.dana.ocr.model.OcrAndUploadTaskModel;
import id.dana.ocr.model.ReuploadReceiptTaskModel;
import id.dana.ocr.model.SnapReceiptBroadcastData;
import id.dana.ocr.model.SnapReceiptTaskModel;
import id.dana.ocr.model.SubmitReceiptResultModel;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.ChoosePhoneContactBridgeExtension;
import o.CornerMarkingDataProvider;
import o.InspectableProperty;
import o.IntRange;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.getShortName;
import o.interceptAfter;
import o.isNfcEnable;
import o.onCancelLoad;
import o.onCanceled;
import o.restorePresenterStates;
import o.stopIgnoring;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 N2\u00020\u0001:\u0001NB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020#H\u0002J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\n2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020#H\u0002J\u0014\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020\nH\u0002J\b\u0010/\u001a\u00020#H\u0016J\b\u00100\u001a\u00020#H\u0016J\"\u00101\u001a\u00020#2\u0006\u0010$\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u00104\u001a\u00020#2\u0006\u00102\u001a\u00020\nH\u0002J\"\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010-2\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u000206H\u0016J \u0010:\u001a\u00020#2\u0006\u0010$\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002J \u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0002J\b\u0010C\u001a\u000206H\u0002J&\u0010D\u001a\u00060 R\u00020!*\u00020E2\f\u0010F\u001a\b\u0018\u00010 R\u00020!2\u0006\u0010G\u001a\u00020\nH\u0002J\f\u0010H\u001a\u00020#*\u00020-H\u0002J\f\u0010I\u001a\u00020#*\u00020-H\u0002J\f\u0010J\u001a\u00020#*\u00020-H\u0002J\u0014\u0010K\u001a\u00020#*\u00020L2\u0006\u0010$\u001a\u00020\nH\u0002J\u0012\u0010M\u001a\u00020#*\b\u0018\u00010 R\u00020!H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u00020\u000e8BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0018\u00010 R\u00020!X\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lid/dana/ocr/views/SnapReceiptService;", "Landroid/app/Service;", "()V", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "getDynamicUrlWrapper", "()Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "setDynamicUrlWrapper", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "foregroundTaskId", "", "idleTimer", "Ljava/util/Timer;", "isForegroundService", "", "()Z", "preprocessingAndOcrPresenter", "Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;", "getPreprocessingAndOcrPresenter", "()Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;", "setPreprocessingAndOcrPresenter", "(Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;)V", "taskMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lid/dana/ocr/model/SnapReceiptTaskModel;", "uploadSnapReceiptPresenter", "Lid/dana/ocr/UploadSnapReceiptContract$Presenter;", "getUploadSnapReceiptPresenter", "()Lid/dana/ocr/UploadSnapReceiptContract$Presenter;", "setUploadSnapReceiptPresenter", "(Lid/dana/ocr/UploadSnapReceiptContract$Presenter;)V", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "checkIfThereDuplicateTaskId", "", "taskId", "clearIdleTimer", "holdForegroundNotification", "notification", "Landroid/app/Notification;", "initComponent", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCompleteTask", "onCreate", "onDestroy", "onError", "message", "errorCode", "onProgress", "onStartCommand", "", "intent", "flags", "startId", "onSuccess", "submitResult", "Lid/dana/ocr/model/SubmitReceiptResultModel;", "sendbroadcast", "broadcastData", "Lid/dana/ocr/model/SnapReceiptBroadcastData;", "showOCRReceiptNotification", "onGoing", "title", "shutdownIfThereArentAnyActiveTasks", "acquirePartialWakeLock", "Landroid/content/Context;", "currentWakeLock", "tag", "handleActionOcrAndUpload", "handleActionUploadOnly", "handleParamIntent", "notify", "Landroidx/core/app/NotificationCompat$Builder;", "safeRelease", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SnapReceiptService extends Service {
    @NotNull
    public static final Companion Companion = new Companion((byte) 0);
    /* access modifiers changed from: private */
    public static final String isInside;
    @Inject
    public getShortName dynamicUrlWrapper;
    private Timer getMax;
    private PowerManager.WakeLock getMin;
    private volatile String length;
    @Inject
    public PreprocessingAndOcrContract.Presenter preprocessingAndOcrPresenter;
    private boolean setMax = true;
    private final ConcurrentHashMap<String, SnapReceiptTaskModel> setMin = new ConcurrentHashMap<>();
    @Inject
    public UploadSnapReceiptContract.Presenter uploadSnapReceiptPresenter;

    @JvmStatic
    public static final void startUpload(@NotNull Context context, @NotNull SnapReceiptTaskModel snapReceiptTaskModel) {
        Companion.getMax(context, snapReceiptTaskModel);
    }

    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        int max = dispatchOnCancelled.getMax(0);
        if (max == 0) {
            return null;
        }
        onCanceled oncanceled = new onCanceled(0, max, 16);
        onCancelLoad.setMax(1030959658, oncanceled);
        onCancelLoad.getMin(1030959658, oncanceled);
        return null;
    }

    @NotNull
    public final PreprocessingAndOcrContract.Presenter getPreprocessingAndOcrPresenter() {
        PreprocessingAndOcrContract.Presenter presenter = this.preprocessingAndOcrPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preprocessingAndOcrPresenter");
        }
        return presenter;
    }

    public final void setPreprocessingAndOcrPresenter(@NotNull PreprocessingAndOcrContract.Presenter presenter) {
        Intrinsics.checkNotNullParameter(presenter, "<set-?>");
        this.preprocessingAndOcrPresenter = presenter;
    }

    @NotNull
    public final UploadSnapReceiptContract.Presenter getUploadSnapReceiptPresenter() {
        UploadSnapReceiptContract.Presenter presenter = this.uploadSnapReceiptPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadSnapReceiptPresenter");
        }
        return presenter;
    }

    public final void setUploadSnapReceiptPresenter(@NotNull UploadSnapReceiptContract.Presenter presenter) {
        Intrinsics.checkNotNullParameter(presenter, "<set-?>");
        this.uploadSnapReceiptPresenter = presenter;
    }

    @NotNull
    public final getShortName getDynamicUrlWrapper() {
        getShortName getshortname = this.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        return getshortname;
    }

    public final void setDynamicUrlWrapper(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "<set-?>");
        this.dynamicUrlWrapper = getshortname;
    }

    public final void onCreate() {
        int min;
        super.onCreate();
        if (CornerMarkingDataProvider.FastBitmap$CoordinateSystem()) {
            String string = getString(R.string.loading_info_text_preprocessing);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.loadi…_info_text_preprocessing)");
            NotificationData min2 = ChoosePhoneContactBridgeExtension.setMin(true, SnapReceiptBroadcastData.Status.InProgress, string);
            ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = ChoosePhoneContactBridgeExtension.setMin;
            Context context = this;
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext == null || 10 == (min = dispatchOnCancelled.setMin(applicationContext, 10)))) {
                onCanceled oncanceled = new onCanceled(10, min, 8);
                onCancelLoad.setMax(-757077530, oncanceled);
                onCancelLoad.getMin(-757077530, oncanceled);
            }
            Intrinsics.checkNotNullParameter(SnapReceiptBroadcastData.Status.InProgress, "title");
            NotificationChannel notificationChannel = new NotificationChannel("local_channel", SnapReceiptBroadcastData.Status.InProgress, 4);
            Object systemService = context.getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
                startForeground(1, ChoosePhoneContactBridgeExtension.setMax(context, min2));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1754139163, oncanceled2);
            onCancelLoad.getMin(1754139163, oncanceled2);
        }
        interceptAfter.setMin setmin = new interceptAfter.setMin((byte) 0);
        if (PrepareException.getMin != null) {
            PrepareException.AnonymousClass1 r3 = PrepareException.getMin.setMax;
            if (r3 != null) {
                setmin.getMax = r3;
                setmin.length = new PreprocessingAndOcrModule(new SnapReceiptService$initComponent$1(this));
                setmin.setMin = new UploadSnapReceiptModule(new SnapReceiptService$initComponent$2(this));
                stopIgnoring.setMin(setmin.length, PreprocessingAndOcrModule.class);
                stopIgnoring.setMin(setmin.setMin, UploadSnapReceiptModule.class);
                stopIgnoring.setMin(setmin.getMax, PrepareException.AnonymousClass1.class);
                new interceptAfter(setmin.length, setmin.setMin, setmin.getMax, (byte) 0).getMax(this);
                PowerManager.WakeLock wakeLock = this.getMin;
                String str = isInside;
                if (wakeLock == null || !wakeLock.isHeld()) {
                    Object systemService2 = getSystemService("power");
                    if (systemService2 != null) {
                        wakeLock = ((PowerManager) systemService2).newWakeLock(1, str);
                        wakeLock.setReferenceCounted(false);
                        if (!wakeLock.isHeld()) {
                            wakeLock.acquire();
                        }
                        Intrinsics.checkNotNullExpressionValue(wakeLock, "powerManager.newWakeLock…Held) acquire()\n        }");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
                    }
                }
                this.getMin = wakeLock;
                return;
            }
            throw null;
        }
        throw new IllegalStateException("Application components needs to be set in Application");
    }

    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length3 = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length3, 4);
            onCancelLoad.setMax(1996938640, oncanceled);
            onCancelLoad.getMin(1996938640, oncanceled);
        }
        ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = ChoosePhoneContactBridgeExtension.setMin;
        String str = isInside;
        Intrinsics.checkNotNullParameter("SnapReceiptServiceNotificationChannel", "channel");
        Intrinsics.checkNotNullParameter(str, "name");
        if (CornerMarkingDataProvider.FastBitmap$CoordinateSystem()) {
            NotificationChannel notificationChannel = new NotificationChannel("SnapReceiptServiceNotificationChannel", str, 4);
            notificationChannel.enableLights(true);
            if (PrepareException.getMin != null) {
                InspectableProperty.ValueType min2 = InspectableProperty.ValueType.getMin((Context) PrepareException.getMin.setMax.setMax());
                Intrinsics.checkNotNullExpressionValue(min2, "NotificationManagerCompa….provide().application())");
                min2.getMin(notificationChannel);
            } else {
                throw new IllegalStateException("Application components needs to be set in Application");
            }
        }
        if (intent != null) {
            Context baseContext2 = getBaseContext();
            if (baseContext2 != null) {
                context = baseContext2.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled2 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(766962446, oncanceled2);
                onCancelLoad.getMin(766962446, oncanceled2);
            }
            if (TextUtils.isEmpty(intent.getAction())) {
                setMin();
            } else {
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -2146930587) {
                        if (hashCode == 311947419 && action.equals("ocr_and_upload_task_action")) {
                            OcrAndUploadTaskModel ocrAndUploadTaskModel = (OcrAndUploadTaskModel) intent.getParcelableExtra("snapReceiptParamKey");
                            if (ocrAndUploadTaskModel != null) {
                                if (this.setMin.containsKey(ocrAndUploadTaskModel.setMin)) {
                                    setMin();
                                }
                                getMin();
                                this.setMin.put(ocrAndUploadTaskModel.setMin, ocrAndUploadTaskModel);
                                PreprocessingAndOcrContract.Presenter presenter = this.preprocessingAndOcrPresenter;
                                if (presenter == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("preprocessingAndOcrPresenter");
                                }
                                presenter.setMax(ocrAndUploadTaskModel.getMax);
                                PreprocessingAndOcrContract.Presenter presenter2 = this.preprocessingAndOcrPresenter;
                                if (presenter2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("preprocessingAndOcrPresenter");
                                }
                                presenter2.setMin(ocrAndUploadTaskModel.setMin, ocrAndUploadTaskModel.getMin);
                            } else {
                                setMin();
                            }
                        }
                    } else if (action.equals("reupload_task_action")) {
                        int max = dispatchOnCancelled.getMax(0);
                        if (max != 0) {
                            onCanceled oncanceled3 = new onCanceled(0, max, 16);
                            onCancelLoad.setMax(1180230506, oncanceled3);
                            onCancelLoad.getMin(1180230506, oncanceled3);
                        }
                        ReuploadReceiptTaskModel reuploadReceiptTaskModel = (ReuploadReceiptTaskModel) intent.getParcelableExtra("snapReceiptParamKey");
                        if (reuploadReceiptTaskModel != null) {
                            if (this.setMin.containsKey(reuploadReceiptTaskModel.length)) {
                                setMin();
                            }
                            getMin();
                            this.setMin.put(reuploadReceiptTaskModel.length, reuploadReceiptTaskModel);
                            UploadSnapReceiptContract.Presenter presenter3 = this.uploadSnapReceiptPresenter;
                            if (presenter3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("uploadSnapReceiptPresenter");
                            }
                            presenter3.length(reuploadReceiptTaskModel.length, reuploadReceiptTaskModel.getMax);
                        } else {
                            setMin();
                        }
                    }
                }
            }
        } else {
            setMin();
        }
        return 1;
    }

    public final void onDestroy() {
        super.onDestroy();
        PreprocessingAndOcrContract.Presenter presenter = this.preprocessingAndOcrPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preprocessingAndOcrPresenter");
        }
        presenter.setMax();
        UploadSnapReceiptContract.Presenter presenter2 = this.uploadSnapReceiptPresenter;
        if (presenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadSnapReceiptPresenter");
        }
        presenter2.setMax();
        PowerManager.WakeLock wakeLock = this.getMin;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    private final void length(String str) {
        SnapReceiptTaskModel remove = this.setMin.remove(str);
        if (setMax() && remove != null && Intrinsics.areEqual((Object) remove.length(), (Object) this.length)) {
            this.length = null;
        }
        if (setMax() && this.setMin.isEmpty()) {
            stopForeground(true);
            setMin();
        }
    }

    private final int setMin() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(836639044, oncanceled);
            onCancelLoad.getMin(836639044, oncanceled);
        }
        if (!this.setMin.isEmpty()) {
            return 1;
        }
        getMin();
        StringBuilder sb = new StringBuilder();
        sb.append(isInside);
        sb.append("IdleTimer");
        Timer timer = new Timer(sb.toString());
        timer.schedule(new SnapReceiptService$shutdownIfThereArentAnyActiveTasks$$inlined$apply$lambda$1(this), 10000);
        Unit unit = Unit.INSTANCE;
        this.getMax = timer;
        return 2;
    }

    private final synchronized void getMin() {
        Timer timer = this.getMax;
        if (timer != null) {
            updateActionSheetContent.i(isInside, "Clearing idle timer");
            timer.cancel();
        }
        this.getMax = null;
    }

    private final boolean setMax() {
        return CornerMarkingDataProvider.FastBitmap$CoordinateSystem() || this.setMax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/ocr/views/SnapReceiptService$Companion;", "", "()V", "SNAP_RECEIPT_NOTIFICATION_BASE_ID", "", "SNAP_RECIPT_NOTIFICATION_CHANNEL", "", "TAG", "idleTimeoutSeconds", "paramKey", "startUpload", "", "context", "Landroid/content/Context;", "snapReceiptTaskModel", "Lid/dana/ocr/model/SnapReceiptTaskModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }

        @JvmStatic
        public static void getMax(@NotNull Context context, @NotNull SnapReceiptTaskModel snapReceiptTaskModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(snapReceiptTaskModel, "snapReceiptTaskModel");
            Intent intent = new Intent(context, SnapReceiptService.class);
            intent.setAction(snapReceiptTaskModel.getMin());
            intent.putExtra("snapReceiptParamKey", snapReceiptTaskModel);
            IntRange.length(context, intent);
        }
    }

    static {
        String simpleName = SnapReceiptService.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "SnapReceiptService::class.java.simpleName");
        isInside = simpleName;
    }

    /* access modifiers changed from: private */
    public final void getMax(SnapReceiptBroadcastData snapReceiptBroadcastData) {
        String str = snapReceiptBroadcastData.getMin;
        String str2 = snapReceiptBroadcastData.setMin;
        if (str2 == null) {
            str2 = "";
        }
        getShortName getshortname = this.dynamicUrlWrapper;
        if (getshortname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicUrlWrapper");
        }
        isNfcEnable max = new Object(getshortname) {
            private final getShortName setMax;

            {
                this.setMax = r1;
            }

            public final o.isNfcEnable setMax(android.content.Context r4, id.dana.notification.NotificationData r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = r5.getMax
                    if (r0 == 0) goto L_0x00a3
                    r1 = -1
                    int r2 = r0.hashCode()
                    switch(r2) {
                        case -2035039290: goto L_0x0053;
                        case -1983828400: goto L_0x0049;
                        case -805752590: goto L_0x003f;
                        case 66575: goto L_0x0035;
                        case 191796002: goto L_0x002b;
                        case 1469380567: goto L_0x0021;
                        case 1544398073: goto L_0x0017;
                        case 2107599432: goto L_0x000d;
                        default: goto L_0x000c;
                    }
                L_0x000c:
                    goto L_0x005c
                L_0x000d:
                    java.lang.String r2 = "GN_AML"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 4
                    goto L_0x005c
                L_0x0017:
                    java.lang.String r2 = "ipgRegistration"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 5
                    goto L_0x005c
                L_0x0021:
                    java.lang.String r2 = "OCR_RECEIPT"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 6
                    goto L_0x005c
                L_0x002b:
                    java.lang.String r2 = "VOUCHER_DETAIL"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 1
                    goto L_0x005c
                L_0x0035:
                    java.lang.String r2 = "CDP"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 2
                    goto L_0x005c
                L_0x003f:
                    java.lang.String r2 = "TRANSACTION_DETAIL"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 0
                    goto L_0x005c
                L_0x0049:
                    java.lang.String r2 = "TWILIO_CHALLENGE"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 7
                    goto L_0x005c
                L_0x0053:
                    java.lang.String r2 = "INNER_URL"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x005c
                    r1 = 3
                L_0x005c:
                    switch(r1) {
                        case 0: goto L_0x009d;
                        case 1: goto L_0x0095;
                        case 2: goto L_0x008f;
                        case 3: goto L_0x0089;
                        case 4: goto L_0x0083;
                        case 5: goto L_0x0071;
                        case 6: goto L_0x006b;
                        case 7: goto L_0x0065;
                        default: goto L_0x005f;
                    }
                L_0x005f:
                    o.HCEBridgeExtension$1 r0 = new o.HCEBridgeExtension$1
                    r0.<init>(r4, r5)
                    return r0
                L_0x0065:
                    o.makePhoneCall r0 = new o.makePhoneCall
                    r0.<init>(r4, r5)
                    return r0
                L_0x006b:
                    o.processCommandApdu r0 = new o.processCommandApdu
                    r0.<init>(r4, r5)
                    return r0
                L_0x0071:
                    boolean r0 = r5.getMax()
                    if (r0 == 0) goto L_0x007d
                    o.TinyAppConstants r0 = new o.TinyAppConstants
                    r0.<init>(r4, r5)
                    return r0
                L_0x007d:
                    o.HCEBridgeExtension$1 r0 = new o.HCEBridgeExtension$1
                    r0.<init>(r4, r5)
                    return r0
                L_0x0083:
                    o.hasFeatureNfc r0 = new o.hasFeatureNfc
                    r0.<init>(r4, r5)
                    return r0
                L_0x0089:
                    o.MakePhoneCallBridgeExtension r0 = new o.MakePhoneCallBridgeExtension
                    r0.<init>(r4, r5)
                    return r0
                L_0x008f:
                    o.byteArrayToHexString r0 = new o.byteArrayToHexString
                    r0.<init>(r4, r5)
                    return r0
                L_0x0095:
                    o.ChoosePhoneContactBridgeExtension$1 r0 = new o.ChoosePhoneContactBridgeExtension$1
                    o.getShortName r1 = r3.setMax
                    r0.<init>(r4, r5, r1)
                    return r0
                L_0x009d:
                    o.contact r0 = new o.contact
                    r0.<init>(r4, r5)
                    return r0
                L_0x00a3:
                    r4 = 0
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.TinyAppHostApduService.AnonymousClass1.setMax(android.content.Context, id.dana.notification.NotificationData):o.isNfcEnable");
            }
        }.setMax(getApplicationContext(), ChoosePhoneContactBridgeExtension.setMin(false, str, str2));
        if (max != null) {
            max.setMax();
        }
        restorePresenterStates length2 = restorePresenterStates.length(getApplicationContext());
        Intent intent = new Intent("IAPAppContainer_UPLOAD_LOCAL_IMAGE_SERVICE_LISTENER");
        SnapReceiptBroadcastData snapReceiptBroadcastData2 = snapReceiptBroadcastData;
        intent.putExtra("status", snapReceiptBroadcastData2.getMin);
        intent.putExtra("statusMessage", snapReceiptBroadcastData2.setMin);
        intent.putExtra("errorCode", snapReceiptBroadcastData2.length);
        intent.putExtra("submitReceiptResult", snapReceiptBroadcastData2.setMax);
        length2.setMin(intent);
    }

    public static final /* synthetic */ void access$onError(SnapReceiptService snapReceiptService, String str, String str2, String str3) {
        snapReceiptService.getMax(new SnapReceiptBroadcastData("Error", str2, str3, (SubmitReceiptResultModel) null));
        snapReceiptService.length(str);
    }

    public static final /* synthetic */ void access$onSuccess(SnapReceiptService snapReceiptService, String str, String str2, SubmitReceiptResultModel submitReceiptResultModel) {
        snapReceiptService.getMax(new SnapReceiptBroadcastData("Success", str2, (String) null, submitReceiptResultModel));
        snapReceiptService.length(str);
    }
}
