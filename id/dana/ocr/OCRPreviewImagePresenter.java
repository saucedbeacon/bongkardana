package id.dana.ocr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import id.dana.ocr.OCRPreviewImageContract;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.preview.BottomSheetPromptView;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import o.IRedDotManager;
import o.RedDotDrawable;
import o.RedDotManager;
import o.SecuritySignature;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.calculateDtToFit;
import o.getScheme;
import o.getSecureSignatureComp;
import o.getSeletedIndex;
import o.hasCornerMarking;
import o.openTranslucentStatusBarSupport;
import o.releaseViewList;
import o.setBackButtonColor;
import o.setMinDuration;
import o.setRefreshAnimation;
import o.switchToBlueTheme;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020&H\u0002J\u0018\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020&H\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0010H\u0002J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010/\u001a\u00020\u001fH\u0002J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\nH\u0016J\b\u00102\u001a\u00020\u001fH\u0016J\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020\u001004*\b\u0012\u0004\u0012\u00020\u001004H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@GX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016@GX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lid/dana/ocr/OCRPreviewImagePresenter;", "Lid/dana/ocr/OCRPreviewImageContract$Presenter;", "view", "Lid/dana/ocr/OCRPreviewImageContract$View;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lid/dana/ocr/OCRPreviewImageContract$View;Lid/dana/domain/PostExecutionThread;Lio/reactivex/disposables/CompositeDisposable;)V", "<set-?>", "", "filePath", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "imageResult", "getImageResult", "()Landroid/graphics/Bitmap;", "setImageResult", "(Landroid/graphics/Bitmap;)V", "Lid/dana/ocr/model/OCRRequestModel;", "ocrRequestModel", "getOcrRequestModel", "()Lid/dana/ocr/model/OCRRequestModel;", "setOcrRequestModel", "(Lid/dana/ocr/model/OCRRequestModel;)V", "processDisplayTime", "", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "convertPictureResultToBitmap", "pictureResult", "Lcom/otaliastudios/cameraview/PictureResult;", "getExpectedOrientation", "", "source", "", "orientation", "getOrientationFromExif", "handleConvertedBitmapResult", "bitmap", "initialize", "loadPictureResult", "logProcessDisplay", "onBottomSheetPromptAction", "result", "onDestroy", "writeToFileAlso", "Lio/reactivex/Single;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRPreviewImagePresenter implements OCRPreviewImageContract.Presenter {
    @NotNull
    public static final Companion length;
    @NotNull
    private static final String toIntRange;
    private final getScheme IsOverlapping;
    /* access modifiers changed from: private */
    public final OCRPreviewImageContract.View equals;
    @Nullable
    String getMax;
    public OCRRequestModel getMin;
    public Bitmap setMax;
    private long setMin;
    private final IRedDotManager toFloatRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<Throwable> {
        final /* synthetic */ OCRPreviewImagePresenter getMax;

        getMax(OCRPreviewImagePresenter oCRPreviewImagePresenter) {
            this.getMax = oCRPreviewImagePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.getMax.setMin();
            this.getMax.equals.dismissProgress();
            this.getMax.equals.onError(((Throwable) obj).getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements RedDotManager<Bitmap> {
        final /* synthetic */ OCRPreviewImagePresenter getMax;

        getMin(OCRPreviewImagePresenter oCRPreviewImagePresenter) {
            this.getMax = oCRPreviewImagePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            OCRPreviewImagePresenter oCRPreviewImagePresenter = this.getMax;
            Intrinsics.checkNotNullExpressionValue(bitmap, "it");
            OCRPreviewImagePresenter.setMin(oCRPreviewImagePresenter, bitmap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Lkotlin/Unit;)Lio/reactivex/SingleSource;"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<Unit, setMinDuration<? extends Bitmap>> {
        final /* synthetic */ TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 getMax;

        length(TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Unit) obj, "it");
            return this.getMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<Bitmap, Unit> {
        final /* synthetic */ OCRPreviewImagePresenter getMin;

        setMin(OCRPreviewImagePresenter oCRPreviewImagePresenter) {
            this.getMin = oCRPreviewImagePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(bitmap, "it");
            OCRPreviewImagePresenter oCRPreviewImagePresenter = this.getMin;
            getSeletedIndex getseletedindex = getSeletedIndex.getMin;
            String path = this.getMin.equals.getStorageDir().getPath();
            Intrinsics.checkNotNullExpressionValue(path, "view.getStorageDir().path");
            oCRPreviewImagePresenter.getMax = getSeletedIndex.getMax(bitmap, path, 0).getAbsolutePath();
            return Unit.INSTANCE;
        }
    }

    @Inject
    public OCRPreviewImagePresenter(@NotNull OCRPreviewImageContract.View view, @NotNull getScheme getscheme, @NotNull IRedDotManager iRedDotManager) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(iRedDotManager, "compositeDisposable");
        this.equals = view;
        this.IsOverlapping = getscheme;
        this.toFloatRange = iRedDotManager;
    }

    public final void setMax(@NotNull OCRRequestModel oCRRequestModel) {
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        this.getMin = oCRRequestModel;
    }

    public final void setMax(@NotNull calculateDtToFit calculatedttofit) {
        switchToBlueTheme switchtobluetheme;
        Intrinsics.checkNotNullParameter(calculatedttofit, "pictureResult");
        this.equals.showProgress();
        this.setMin = System.currentTimeMillis();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 max = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(new setMax(this, calculatedttofit));
        hasCornerMarking min = getSecureSignatureComp.getMin();
        setRefreshAnimation.getMax(min, "scheduler is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 setbackbuttoncolor = new setBackButtonColor(max, min);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            setbackbuttoncolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setbackbuttoncolor);
        }
        Intrinsics.checkNotNullExpressionValue(switchtobluetheme, "Single.fromCallable<Bitm…Schedulers.computation())");
        OCRRequestModel oCRRequestModel = this.getMin;
        if (oCRRequestModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrRequestModel");
        }
        if (oCRRequestModel.setMin()) {
            hasCornerMarking min2 = getSecureSignatureComp.setMin();
            setRefreshAnimation.getMax(min2, "scheduler is null");
            setMinDuration setbackbuttoncolor2 = new setBackButtonColor(switchtobluetheme, min2);
            RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
            if (redDotDrawable2 != null) {
                setbackbuttoncolor2 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, setbackbuttoncolor2);
            }
            RedDotDrawable setmin = new setMin(this);
            setRefreshAnimation.getMax(setmin, "mapper is null");
            setMinDuration releaseviewlist = new releaseViewList(setbackbuttoncolor2, setmin);
            RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable3 = SecuritySignature.toString;
            if (redDotDrawable3 != null) {
                releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, releaseviewlist);
            }
            RedDotDrawable length2 = new length(switchtobluetheme);
            setRefreshAnimation.getMax(length2, "mapper is null");
            switchToBlueTheme switchtobluetheme2 = new switchToBlueTheme(releaseviewlist, length2);
            RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable4 = SecuritySignature.toString;
            switchtobluetheme = redDotDrawable4 != null ? (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable4, switchtobluetheme2) : switchtobluetheme2;
            Intrinsics.checkNotNullExpressionValue(switchtobluetheme, "this.subscribeOn(Schedul…       }.flatMap { this }");
        }
        hasCornerMarking scheduler = this.IsOverlapping.getScheduler();
        setRefreshAnimation.getMax(scheduler, "scheduler is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 opentranslucentstatusbarsupport = new openTranslucentStatusBarSupport(switchtobluetheme, scheduler);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable5 = SecuritySignature.toString;
        if (redDotDrawable5 != null) {
            opentranslucentstatusbarsupport = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable5, opentranslucentstatusbarsupport);
        }
        GriverProgressBar.UpdateRunnable min3 = opentranslucentstatusbarsupport.setMin(new getMin(this), new getMax(this));
        Intrinsics.checkNotNullExpressionValue(min3, "Single.fromCallable<Bitm…t.message)\n            })");
        IRedDotManager iRedDotManager = this.toFloatRange;
        if (iRedDotManager != null) {
            iRedDotManager.getMin(min3);
            return;
        }
        throw null;
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "result");
        int hashCode = str.hashCode();
        if (hashCode != -453042432) {
            if (hashCode == 992505156 && str.equals(BottomSheetPromptView.Result.NEGATIVE_BUTTON_CLICKED)) {
                this.equals.closePage();
            }
        } else if (str.equals(BottomSheetPromptView.Result.POSITIVE_BUTTON_CLICKED)) {
            OCRRequestModel oCRRequestModel = this.getMin;
            if (oCRRequestModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ocrRequestModel");
            }
            if (!oCRRequestModel.setMin()) {
                this.equals.showProgress();
                OCRPreviewImageContract.View view = this.equals;
                Bitmap bitmap = this.setMax;
                if (bitmap == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageResult");
                }
                view.processImageOnForeground(bitmap);
                return;
            }
            String str2 = this.getMax;
            if (str2 != null) {
                OCRPreviewImageContract.View view2 = this.equals;
                OCRRequestModel oCRRequestModel2 = this.getMin;
                if (oCRRequestModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ocrRequestModel");
                }
                view2.processImageOnBackground(oCRRequestModel2, str2);
                return;
            }
            this.equals.onFilePathNull();
        }
    }

    public final void setMax() {
        this.equals.dismissProgress();
        this.toFloatRange.dispose();
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.setMin == 0) {
            this.setMin = currentTimeMillis - 300;
        }
        String str = toIntRange;
        StringBuilder sb = new StringBuilder("Display process delay: ");
        sb.append(currentTimeMillis - this.setMin);
        updateActionSheetContent.d(str, sb.toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/ocr/OCRPreviewImagePresenter$Companion;", "", "()V", "DEFAULT_DEVIATION_TIME_MILLIS", "", "TAG", "", "getTAG$app_productionRelease", "()Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    static {
        Companion companion = new Companion((byte) 0);
        length = companion;
        String simpleName = companion.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        toIntRange = simpleName;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<Bitmap> {
        final /* synthetic */ OCRPreviewImagePresenter getMax;
        final /* synthetic */ calculateDtToFit getMin;

        setMax(OCRPreviewImagePresenter oCRPreviewImagePresenter, calculateDtToFit calculatedttofit) {
            this.getMax = oCRPreviewImagePresenter;
            this.getMin = calculatedttofit;
        }

        public final /* synthetic */ Object call() {
            byte[] length = this.getMin.length();
            Intrinsics.checkNotNullExpressionValue(length, "pictureResult.data");
            BitmapFactory.Options options = new BitmapFactory.Options();
            byte[] length2 = this.getMin.length();
            Intrinsics.checkNotNullExpressionValue(length2, "pictureResult.data");
            return getSeletedIndex.getMin(length, options, OCRPreviewImagePresenter.getMax(length2, this.getMin.getMin));
        }
    }

    public static final /* synthetic */ int getMax(byte[] bArr, int i) {
        updateActionSheetContent.d(toIntRange, "original orientation ".concat(String.valueOf(i)));
        Integer valueOf = Integer.valueOf(WheelView.setMax(bArr));
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i;
        if (i == 0 || 180 == i) {
            intValue = 90;
        }
        updateActionSheetContent.d(toIntRange, "expected orientation ".concat(String.valueOf(intValue)));
        return intValue;
    }

    public static final /* synthetic */ void setMin(OCRPreviewImagePresenter oCRPreviewImagePresenter, Bitmap bitmap) {
        oCRPreviewImagePresenter.setMax = bitmap;
        oCRPreviewImagePresenter.equals.onSuccessConvertImage(bitmap);
        oCRPreviewImagePresenter.setMin();
        oCRPreviewImagePresenter.equals.dismissProgress();
    }
}
