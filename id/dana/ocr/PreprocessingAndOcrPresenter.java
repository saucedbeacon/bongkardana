package id.dana.ocr;

import Catalano.Imaging.FastBitmap;
import Catalano.Imaging.Filters.Mean;
import android.graphics.Bitmap;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.constant.ErrorOcr;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverProgressBar;
import o.IRedDotManager;
import o.MonitorUtils;
import o.NavigationBarCompat;
import o.RedDotDrawable;
import o.RedDotManager;
import o.SecuritySignature;
import o.StaggeredGridLayoutManager;
import o.TitleBarRightButtonView;
import o.getActionButton;
import o.getPopAnchor;
import o.getScheme;
import o.getSecureSignatureComp;
import o.getSeletedIndex;
import o.hasActionButtons;
import o.hasCornerMarking;
import o.hideProgress;
import o.openTranslucentStatusBarSupport;
import o.releaseViewList;
import o.setBackButtonColor;
import o.setGlobalUserData;
import o.setMinDuration;
import o.setRefreshAnimation;
import o.switchToBlueTheme;
import o.updateActionSheetContent;
import o.updateProgress;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 =2\u00020\u0001:\u0001=B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!H\u0003J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0#2\u0006\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010'\u001a\u00020\u0014H\u0002J\b\u0010(\u001a\u00020\u0014H\u0016J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001a\u0010*\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010\u0018H\u0002J&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u0012H\u0002J\u0018\u0010/\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fH\u0016J\u0018\u0010/\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001dH\u0016J\u0018\u00101\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0018H\u0002J\u0018\u00102\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0002J\u0018\u00104\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00105\u001a\u00020\u001fH\u0002J\u0010\u00106\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u00107\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0018H\u0002J\u0014\u00108\u001a\u00020\u0018*\u00020\u00182\u0006\u0010$\u001a\u00020\u001fH\u0002J\f\u00109\u001a\u00020:*\u00020\u001fH\u0002J \u0010;\u001a\b\u0012\u0004\u0012\u00020\u001a0#*\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J(\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180#*\b\u0012\u0004\u0012\u00020\u00180#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lid/dana/ocr/PreprocessingAndOcrPresenter;", "Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;", "view", "Lid/dana/ocr/PreprocessingAndOcrContract$View;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getOcrFromReceipt", "Lid/dana/domain/ocr/interactor/GetOcrFromReceipt;", "getOcrSnapLimit", "Lid/dana/appcontainer/plugin/ocrreceipt/usecase/GetOcrSnapLimit;", "getOcrPreprocessingConfig", "Lid/dana/danah5/ocrreceipt/usecase/GetOcrPreprocessingConfig;", "(Lid/dana/ocr/PreprocessingAndOcrContract$View;Lid/dana/domain/PostExecutionThread;Lio/reactivex/disposables/CompositeDisposable;Lid/dana/domain/ocr/interactor/GetOcrFromReceipt;Lid/dana/appcontainer/plugin/ocrreceipt/usecase/GetOcrSnapLimit;Lid/dana/danah5/ocrreceipt/usecase/GetOcrPreprocessingConfig;)V", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "processOcrTime", "", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "composeResultModelFromResultInfo", "Lid/dana/ocr/model/OCRResultModel;", "receiptInfoModel", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "doImagePreProcessing", "taskId", "", "image", "Landroid/graphics/Bitmap;", "emitter", "Lio/reactivex/SingleEmitter;", "executeOcr", "Lio/reactivex/Single;", "imageOrigin", "getFilePathName", "initialize", "logProcessOcr", "onDestroy", "onErrorProcess", "onSuccessProcess", "ocrResultModel", "preProcessing", "src", "timeout", "processImage", "filePath", "sendBackResult", "sendFailResultWithoutData", "errorCode", "startOcrProcess", "img", "startPreProcessingProcess", "startSubmissionProcess", "addFile", "bitmapToFastBitmap", "LCatalano/Imaging/FastBitmap;", "ocrProcess", "submissionProcess", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PreprocessingAndOcrPresenter implements PreprocessingAndOcrContract.Presenter {
    /* access modifiers changed from: private */
    public static final String equals;
    @NotNull
    public static final Companion setMax = new Companion((byte) 0);
    /* access modifiers changed from: private */
    public final MonitorUtils IsOverlapping;
    private final getScheme getMax;
    private long getMin;
    private final StaggeredGridLayoutManager isInside;
    private final PreprocessingAndOcrContract.View length;
    private OCRRequestModel setMin;
    private final getActionButton toFloatRange;
    private final IRedDotManager toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/ocr/model/OCRResultModel;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsCallback<T, R> implements RedDotDrawable<OCRResultModel, OCRResultModel> {
        final /* synthetic */ Bitmap getMin;
        final /* synthetic */ PreprocessingAndOcrPresenter setMax;

        ICustomTabsCallback(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, Bitmap bitmap) {
            this.setMax = preprocessingAndOcrPresenter;
            this.getMin = bitmap;
        }

        public final /* synthetic */ Object apply(Object obj) {
            OCRResultModel oCRResultModel = (OCRResultModel) obj;
            Intrinsics.checkNotNullParameter(oCRResultModel, "it");
            return PreprocessingAndOcrPresenter.setMin(this.setMax, oCRResultModel, this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "LCatalano/Imaging/FastBitmap;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<FastBitmap, FastBitmap> {
        public static final IsOverlapping getMin = new IsOverlapping();

        IsOverlapping() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r13) {
            /*
                r12 = this;
                Catalano.Imaging.FastBitmap r13 = (Catalano.Imaging.FastBitmap) r13
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = "$this$applyGrayscale"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                Catalano.Imaging.Filters.Grayscale r0 = new Catalano.Imaging.Filters.Grayscale
                Catalano.Imaging.Filters.Grayscale$Algorithm r1 = Catalano.Imaging.Filters.Grayscale.Algorithm.Lightness
                r0.<init>(r1)
                boolean r1 = r0.getMin
                r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L_0x0059
                r13.setMin = r4
                int[] r1 = r13.setMax
            L_0x001f:
                int r4 = r1.length
                if (r3 >= r4) goto L_0x01aa
                r4 = r1[r3]
                int r4 = r4 >> 16
                r4 = r4 & 255(0xff, float:3.57E-43)
                double r4 = (double) r4
                r6 = r1[r3]
                int r6 = r6 >> 8
                r6 = r6 & 255(0xff, float:3.57E-43)
                double r6 = (double) r6
                r8 = r1[r3]
                r8 = r8 & 255(0xff, float:3.57E-43)
                double r8 = (double) r8
                double r10 = r0.setMin
                java.lang.Double.isNaN(r4)
                double r4 = r4 * r10
                double r10 = r0.getMax
                java.lang.Double.isNaN(r6)
                double r6 = r6 * r10
                double r4 = r4 + r6
                double r6 = r0.setMax
                java.lang.Double.isNaN(r8)
                double r8 = r8 * r6
                double r4 = r4 + r8
                int r4 = (int) r4
                int r5 = r4 << 16
                r5 = r5 | r2
                int r6 = r4 << 8
                r5 = r5 | r6
                r4 = r4 | r5
                r1[r3] = r4
                int r3 = r3 + 1
                goto L_0x001f
            L_0x0059:
                r13.setMin = r4
                Catalano.Imaging.Filters.Grayscale$Algorithm r0 = r0.length
                int[] r1 = r13.setMax
                int[] r4 = Catalano.Imaging.Filters.Grayscale.AnonymousClass5.length
                int r0 = r0.ordinal()
                r0 = r4[r0]
                switch(r0) {
                    case 1: goto L_0x0173;
                    case 2: goto L_0x0142;
                    case 3: goto L_0x0109;
                    case 4: goto L_0x00c6;
                    case 5: goto L_0x0099;
                    case 6: goto L_0x006c;
                    default: goto L_0x006a;
                }
            L_0x006a:
                goto L_0x01aa
            L_0x006c:
                int r0 = r1.length
                if (r3 >= r0) goto L_0x01aa
                r0 = r1[r3]
                int r0 = r0 >> 16
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r4 = (double) r0
                r0 = r1[r3]
                int r0 = r0 >> 8
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r6 = (double) r0
                r0 = r1[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r8 = (double) r0
                double r4 = java.lang.Math.max(r4, r6)
                int r0 = (int) r4
                double r4 = (double) r0
                double r4 = java.lang.Math.max(r4, r8)
                int r0 = (int) r4
                int r4 = r0 << 16
                r4 = r4 | r2
                int r5 = r0 << 8
                r4 = r4 | r5
                r0 = r0 | r4
                r1[r3] = r0
                int r3 = r3 + 1
                goto L_0x006c
            L_0x0099:
                int r0 = r1.length
                if (r3 >= r0) goto L_0x01aa
                r0 = r1[r3]
                int r0 = r0 >> 16
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r4 = (double) r0
                r0 = r1[r3]
                int r0 = r0 >> 8
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r6 = (double) r0
                r0 = r1[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r8 = (double) r0
                double r4 = java.lang.Math.min(r4, r6)
                int r0 = (int) r4
                double r4 = (double) r0
                double r4 = java.lang.Math.min(r4, r8)
                int r0 = (int) r4
                int r4 = r0 << 16
                r4 = r4 | r2
                int r5 = r0 << 8
                r4 = r4 | r5
                r0 = r0 | r4
                r1[r3] = r0
                int r3 = r3 + 1
                goto L_0x0099
            L_0x00c6:
                int r0 = r1.length
                if (r3 >= r0) goto L_0x01aa
                r0 = r1[r3]
                int r0 = r0 >> 16
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r4 = (double) r0
                r0 = r1[r3]
                int r0 = r0 >> 8
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r6 = (double) r0
                r0 = r1[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r8 = (double) r0
                r10 = 4596824139657065267(0x3fcb333333333333, double:0.2125)
                java.lang.Double.isNaN(r4)
                double r4 = r4 * r10
                r10 = 4604618969892118122(0x3fe6e48e8a71de6a, double:0.7154)
                java.lang.Double.isNaN(r6)
                double r6 = r6 * r10
                double r4 = r4 + r6
                r6 = 4589859773193299532(0x3fb27525460aa64c, double:0.0721)
                java.lang.Double.isNaN(r8)
                double r8 = r8 * r6
                double r4 = r4 + r8
                int r0 = (int) r4
                int r4 = r0 << 16
                r4 = r4 | r2
                int r5 = r0 << 8
                r4 = r4 | r5
                r0 = r0 | r4
                r1[r3] = r0
                int r3 = r3 + 1
                goto L_0x00c6
            L_0x0109:
                int r0 = r1.length
                if (r3 >= r0) goto L_0x01aa
                r0 = r1[r3]
                int r0 = r0 >> 16
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r4 = (double) r0
                r0 = r1[r3]
                int r0 = r0 >> 8
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r6 = (double) r0
                r0 = r1[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r8 = (double) r0
                java.lang.Double.isNaN(r4)
                java.lang.Double.isNaN(r6)
                double r4 = r4 * r6
                java.lang.Double.isNaN(r8)
                double r4 = r4 * r8
                r6 = 4599616371426034975(0x3fd51eb851eb851f, double:0.33)
                double r4 = java.lang.Math.pow(r4, r6)
                int r0 = (int) r4
                int r4 = r0 << 16
                r4 = r4 | r2
                int r5 = r0 << 8
                r4 = r4 | r5
                r0 = r0 | r4
                r1[r3] = r0
                int r3 = r3 + 1
                goto L_0x0109
            L_0x0142:
                int r0 = r1.length
                if (r3 >= r0) goto L_0x01aa
                r0 = r1[r3]
                int r0 = r0 >> 16
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r4 = (double) r0
                r0 = r1[r3]
                int r0 = r0 >> 8
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r6 = (double) r0
                r0 = r1[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r8 = (double) r0
                java.lang.Double.isNaN(r4)
                java.lang.Double.isNaN(r6)
                double r4 = r4 + r6
                java.lang.Double.isNaN(r8)
                double r4 = r4 + r8
                r6 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r4 = r4 / r6
                int r0 = (int) r4
                int r4 = r0 << 16
                r4 = r4 | r2
                int r5 = r0 << 8
                r4 = r4 | r5
                r0 = r0 | r4
                r1[r3] = r0
                int r3 = r3 + 1
                goto L_0x0142
            L_0x0173:
                int r0 = r1.length
                if (r3 >= r0) goto L_0x01aa
                r0 = r1[r3]
                int r0 = r0 >> 16
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r4 = (double) r0
                r0 = r1[r3]
                int r0 = r0 >> 8
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r6 = (double) r0
                r0 = r1[r3]
                r0 = r0 & 255(0xff, float:3.57E-43)
                double r8 = (double) r0
                double r10 = java.lang.Math.max(r4, r6)
                double r10 = java.lang.Math.max(r10, r8)
                double r4 = java.lang.Math.min(r4, r6)
                double r4 = java.lang.Math.min(r4, r8)
                double r10 = r10 + r4
                r4 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r10 = r10 / r4
                int r0 = (int) r10
                int r4 = r0 << 16
                r4 = r4 | r2
                int r5 = r0 << 8
                r4 = r4 | r5
                r0 = r0 | r4
                r1[r3] = r0
                int r3 = r3 + 1
                goto L_0x0173
            L_0x01aa:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.PreprocessingAndOcrPresenter.IsOverlapping.apply(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "LCatalano/Imaging/FastBitmap;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<FastBitmap, FastBitmap> {
        public static final equals setMin = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            FastBitmap fastBitmap = (FastBitmap) obj;
            Intrinsics.checkNotNullParameter(fastBitmap, "it");
            Intrinsics.checkNotNullParameter(fastBitmap, "$this$applyBrightnessCorrection");
            o.getMin getmin = new o.setMin().setMin;
            int length = fastBitmap.setMax.length;
            int i = 0;
            if (fastBitmap.getMin()) {
                o.getMin.setMin(getmin.setMax, getmin.isInside, getmin.toString);
                while (i < length) {
                    int i2 = getmin.toString[fastBitmap.setMax[i] & 255];
                    fastBitmap.setMax[i] = i2 | (i2 << 16) | -16777216 | (i2 << 8);
                    i++;
                }
            } else {
                o.getMin.setMin(getmin.setMin, getmin.length, getmin.toFloatRange);
                o.getMin.setMin(getmin.getMin, getmin.toIntRange, getmin.equals);
                o.getMin.setMin(getmin.getMax, getmin.IsOverlapping, getmin.FastBitmap$CoordinateSystem);
                while (i < length) {
                    int i3 = getmin.toFloatRange[(fastBitmap.setMax[i] >> 16) & 255];
                    int i4 = getmin.equals[(fastBitmap.setMax[i] >> 8) & 255];
                    fastBitmap.setMax[i] = (i3 << 16) | -16777216 | (i4 << 8) | getmin.FastBitmap$CoordinateSystem[fastBitmap.setMax[i] & 255];
                    i++;
                }
            }
            return fastBitmap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Bitmap, Bitmap> {
        final /* synthetic */ PreprocessingAndOcrPresenter getMin;
        final /* synthetic */ String length;

        getMin(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str) {
            this.getMin = preprocessingAndOcrPresenter;
            this.length = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(bitmap, "it");
            return this.getMin.length.setMin(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/ocr/model/OCRResultModel;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class invoke<T, R> implements RedDotDrawable<OCRResultModel, OCRResultModel> {
        final /* synthetic */ PreprocessingAndOcrPresenter getMax;
        final /* synthetic */ String setMax;

        invoke(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str) {
            this.getMax = preprocessingAndOcrPresenter;
            this.setMax = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            OCRResultModel oCRResultModel = (OCRResultModel) obj;
            Intrinsics.checkNotNullParameter(oCRResultModel, "it");
            return this.getMax.length.length(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend<T> implements RedDotManager<Throwable> {
        final /* synthetic */ String getMax;
        final /* synthetic */ PreprocessingAndOcrPresenter setMax;

        invokeSuspend(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str) {
            this.setMax = preprocessingAndOcrPresenter;
            this.getMax = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            String length = PreprocessingAndOcrPresenter.equals;
            StringBuilder sb = new StringBuilder("Error occur ");
            sb.append(((Throwable) obj).getMessage());
            updateActionSheetContent.e(length, sb.toString());
            this.setMax.setMax(this.getMax, "001");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lid/dana/danah5/ocrreceipt/usecase/model/OcrImagePreprocessingConfigModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class length<T> implements RedDotManager<hasActionButtons> {
        final /* synthetic */ PreprocessingAndOcrPresenter getMax;
        final /* synthetic */ TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 getMin;
        final /* synthetic */ Bitmap setMax;
        final /* synthetic */ String setMin;

        length(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r2, String str, Bitmap bitmap) {
            this.getMax = preprocessingAndOcrPresenter;
            this.getMin = r2;
            this.setMin = str;
            this.setMax = bitmap;
        }

        public final /* synthetic */ void accept(Object obj) {
            hasActionButtons hasactionbuttons = (hasActionButtons) obj;
            if (hasactionbuttons.getEnable()) {
                this.getMin.onSuccess(PreprocessingAndOcrPresenter.length(this.getMax, this.setMin, this.setMax, hasactionbuttons.getTimeout()).setMin());
            } else {
                this.getMin.onSuccess(this.setMax);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "kotlin.jvm.PlatformType", "it", "Landroid/graphics/Bitmap;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<Bitmap, setMinDuration<? extends NavigationBarCompat>> {
        final /* synthetic */ PreprocessingAndOcrPresenter setMin;

        setMax(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter) {
            this.setMin = preprocessingAndOcrPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(bitmap, "it");
            return PreprocessingAndOcrPresenter.setMin(this.setMin, bitmap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "LCatalano/Imaging/FastBitmap;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange<T, R> implements RedDotDrawable<FastBitmap, FastBitmap> {
        public static final toDoubleRange setMax = new toDoubleRange();

        toDoubleRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            Mean mean;
            Mean mean2;
            int i6;
            FastBitmap fastBitmap;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            Mean mean3;
            int i16;
            FastBitmap fastBitmap2;
            FastBitmap fastBitmap3;
            int i17;
            Mean mean4;
            FastBitmap fastBitmap4 = (FastBitmap) obj;
            Intrinsics.checkNotNullParameter(fastBitmap4, "it");
            Intrinsics.checkNotNullParameter(fastBitmap4, "$this$applyDenoise");
            Mean mean5 = new Mean();
            int width = fastBitmap4.length.getWidth();
            int height = fastBitmap4.length.getHeight();
            int i18 = (mean5.getMax * 2) + 1;
            FastBitmap fastBitmap5 = new FastBitmap(fastBitmap4);
            int i19 = Mean.AnonymousClass2.setMin[mean5.length.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    int i20 = width;
                    int i21 = height;
                    int i22 = i18;
                    FastBitmap fastBitmap6 = fastBitmap5;
                    if (fastBitmap4.getMin()) {
                        int i23 = i21;
                        int i24 = 0;
                        while (i24 < i23) {
                            int i25 = i20;
                            int i26 = 0;
                            while (i26 < i25) {
                                int i27 = i22;
                                int i28 = 0;
                                double d = 0.0d;
                                for (int i29 = 0; i29 < i27; i29++) {
                                    int i30 = (i29 - mean5.getMax) + i24;
                                    int i31 = 0;
                                    while (i31 < i27) {
                                        int i32 = (i31 - mean5.getMax) + i26;
                                        if (i30 < 0 || i30 >= i23 || i32 < 0 || i32 >= i25) {
                                            mean2 = mean5;
                                            i6 = i30;
                                            fastBitmap = fastBitmap6;
                                        } else {
                                            mean2 = mean5;
                                            i6 = i30;
                                            fastBitmap = fastBitmap6;
                                            double d2 = (double) (fastBitmap6.setMax[(fastBitmap6.getMin * i30) + (i32 * fastBitmap6.getMax)] & 255);
                                            Double.isNaN(d2);
                                            d += 1.0d / d2;
                                            i28++;
                                        }
                                        i31++;
                                        fastBitmap6 = fastBitmap;
                                        i30 = i6;
                                        mean5 = mean2;
                                    }
                                    Mean mean6 = mean5;
                                    FastBitmap fastBitmap7 = fastBitmap6;
                                }
                                Mean mean7 = mean5;
                                FastBitmap fastBitmap8 = fastBitmap6;
                                double d3 = (double) i28;
                                Double.isNaN(d3);
                                fastBitmap4.setMin(i24, i26, (int) (d3 / d));
                                i26++;
                                i22 = i27;
                            }
                            Mean mean8 = mean5;
                            FastBitmap fastBitmap9 = fastBitmap6;
                            int i33 = i22;
                            i24++;
                            i20 = i25;
                        }
                    } else {
                        Mean mean9 = mean5;
                        FastBitmap fastBitmap10 = fastBitmap6;
                        int i34 = i22;
                        int i35 = i20;
                        int i36 = i21;
                        if (fastBitmap4.getMax()) {
                            int i37 = 0;
                            while (i37 < i36) {
                                int i38 = 0;
                                while (i38 < i35) {
                                    int i39 = 0;
                                    int i40 = 0;
                                    double d4 = 0.0d;
                                    double d5 = 0.0d;
                                    double d6 = 0.0d;
                                    while (i39 < i34) {
                                        FastBitmap fastBitmap11 = fastBitmap4;
                                        Mean mean10 = mean9;
                                        int i41 = (i39 - mean10.getMax) + i37;
                                        int i42 = i37;
                                        int i43 = 0;
                                        while (i43 < i34) {
                                            int i44 = i34;
                                            int i45 = (i43 - mean10.getMax) + i38;
                                            if (i41 < 0 || i41 >= i36 || i45 < 0 || i45 >= i35) {
                                                i5 = i36;
                                                i4 = i35;
                                                mean = mean10;
                                            } else {
                                                mean = mean10;
                                                i4 = i35;
                                                i5 = i36;
                                                double d7 = (double) ((fastBitmap10.setMax[(fastBitmap10.getMin * i41) + (fastBitmap10.getMax * i45)] >> 16) & 255);
                                                Double.isNaN(d7);
                                                d4 += 1.0d / d7;
                                                double d8 = (double) ((fastBitmap10.setMax[(fastBitmap10.getMin * i41) + (fastBitmap10.getMax * i45)] >> 8) & 255);
                                                Double.isNaN(d8);
                                                d5 += 1.0d / d8;
                                                double d9 = (double) (fastBitmap10.setMax[(fastBitmap10.getMin * i41) + (i45 * fastBitmap10.getMax)] & 255);
                                                Double.isNaN(d9);
                                                d6 += 1.0d / d9;
                                                i40++;
                                            }
                                            i43++;
                                            mean10 = mean;
                                            i36 = i5;
                                            i34 = i44;
                                            i35 = i4;
                                        }
                                        int i46 = i36;
                                        int i47 = i35;
                                        int i48 = i34;
                                        i39++;
                                        fastBitmap4 = fastBitmap11;
                                        i37 = i42;
                                        mean9 = mean10;
                                    }
                                    int i49 = i36;
                                    int i50 = i35;
                                    int i51 = i34;
                                    double d10 = (double) i40;
                                    Double.isNaN(d10);
                                    Double.isNaN(d10);
                                    Double.isNaN(d10);
                                    int i52 = (int) (d10 / d6);
                                    fastBitmap4.setMin(i37, i38, (int) (d10 / d4), (int) (d10 / d5), i52);
                                    i38++;
                                    mean9 = mean9;
                                }
                                FastBitmap fastBitmap12 = fastBitmap4;
                                int i53 = i36;
                                int i54 = i35;
                                int i55 = i34;
                                i37++;
                                mean9 = mean9;
                            }
                        }
                    }
                } else if (i19 == 3) {
                    int i56 = width;
                    int i57 = height;
                    int i58 = i18;
                    double d11 = 0.0d;
                    FastBitmap fastBitmap13 = fastBitmap5;
                    if (fastBitmap4.getMin()) {
                        int i59 = i57;
                        int i60 = 0;
                        while (i60 < i59) {
                            int i61 = i56;
                            int i62 = 0;
                            while (i62 < i61) {
                                double d12 = d11;
                                double d13 = d12;
                                int i63 = i58;
                                for (int i64 = 0; i64 < i63; i64++) {
                                    int i65 = (i64 - mean5.getMax) + i60;
                                    int i66 = 0;
                                    while (i66 < i63) {
                                        int i67 = (i66 - mean5.getMax) + i62;
                                        if (i65 < 0 || i65 >= i59 || i67 < 0 || i67 >= i61) {
                                            i11 = i59;
                                            i12 = i61;
                                            i13 = i63;
                                        } else {
                                            i13 = i63;
                                            i12 = i61;
                                            i11 = i59;
                                            d12 += Math.pow((double) (fastBitmap13.setMax[(fastBitmap13.getMin * i65) + (fastBitmap13.getMax * i67)] & 255), (double) (mean5.getMin + 1));
                                            d13 += Math.pow((double) (fastBitmap13.setMax[(fastBitmap13.getMin * i65) + (i67 * fastBitmap13.getMax)] & 255), (double) mean5.getMin);
                                        }
                                        i66++;
                                        i63 = i13;
                                        i61 = i12;
                                        i59 = i11;
                                    }
                                    int i68 = i59;
                                    int i69 = i61;
                                    int i70 = i63;
                                }
                                int i71 = i59;
                                int i72 = i61;
                                fastBitmap4.setMin(i60, i62, (int) (d12 / d13));
                                i62++;
                                i58 = i63;
                                d11 = 0.0d;
                            }
                            int i73 = i59;
                            int i74 = i58;
                            i60++;
                            i56 = i61;
                            d11 = 0.0d;
                        }
                    } else {
                        int i75 = i58;
                        int i76 = i57;
                        int i77 = i56;
                        if (fastBitmap4.getMax()) {
                            int i78 = i76;
                            int i79 = 0;
                            while (i79 < i78) {
                                int i80 = i77;
                                int i81 = 0;
                                while (i81 < i80) {
                                    int i82 = i75;
                                    double d14 = 0.0d;
                                    double d15 = 0.0d;
                                    double d16 = 0.0d;
                                    double d17 = 0.0d;
                                    double d18 = 0.0d;
                                    double d19 = 0.0d;
                                    for (int i83 = 0; i83 < i82; i83++) {
                                        int i84 = (i83 - mean5.getMax) + i79;
                                        int i85 = 0;
                                        while (i85 < i82) {
                                            int i86 = i82;
                                            int i87 = (i85 - mean5.getMax) + i81;
                                            if (i84 < 0 || i84 >= i78 || i87 < 0 || i87 >= i80) {
                                                i8 = i78;
                                                i7 = i79;
                                                i9 = i80;
                                                i10 = i81;
                                            } else {
                                                i9 = i80;
                                                i8 = i78;
                                                i10 = i81;
                                                i7 = i79;
                                                d14 += Math.pow((double) ((fastBitmap13.setMax[(fastBitmap13.getMin * i84) + (fastBitmap13.getMax * i87)] >> 16) & 255), (double) (mean5.getMin + 1));
                                                d16 += Math.pow((double) ((fastBitmap13.setMax[(fastBitmap13.getMin * i84) + (fastBitmap13.getMax * i87)] >> 8) & 255), (double) (mean5.getMin + 1));
                                                int i88 = i87;
                                                d18 += Math.pow((double) (fastBitmap13.setMax[(fastBitmap13.getMin * i84) + (fastBitmap13.getMax * i87)] & 255), (double) (mean5.getMin + 1));
                                                d15 += Math.pow((double) ((fastBitmap13.setMax[(fastBitmap13.getMin * i84) + (i88 * fastBitmap13.getMax)] >> 16) & 255), (double) mean5.getMin);
                                                d17 += Math.pow((double) ((fastBitmap13.setMax[(fastBitmap13.getMin * i84) + (i88 * fastBitmap13.getMax)] >> 8) & 255), (double) mean5.getMin);
                                                d19 += Math.pow((double) (fastBitmap13.setMax[(fastBitmap13.getMin * i84) + (i88 * fastBitmap13.getMax)] & 255), (double) mean5.getMin);
                                            }
                                            i85++;
                                            i81 = i10;
                                            i82 = i86;
                                            i80 = i9;
                                            i78 = i8;
                                            i79 = i7;
                                        }
                                        int i89 = i78;
                                        int i90 = i79;
                                        int i91 = i80;
                                        int i92 = i81;
                                        int i93 = i82;
                                    }
                                    int i94 = i79;
                                    int i95 = i80;
                                    int i96 = i81;
                                    fastBitmap4.setMin(i94, i96, (int) (d14 / d15), (int) (d16 / d17), (int) (d18 / d19));
                                    i81 = i96 + 1;
                                    i75 = i82;
                                    i78 = i78;
                                    i79 = i94;
                                }
                                int i97 = i78;
                                int i98 = i75;
                                i79++;
                                i77 = i80;
                            }
                        }
                    }
                } else if (i19 == 4) {
                    if (fastBitmap4.getMin()) {
                        for (int i99 = 0; i99 < height; i99++) {
                            int i100 = 0;
                            while (i100 < width) {
                                double d20 = 1.0d;
                                int i101 = 0;
                                for (int i102 = 0; i102 < i18; i102++) {
                                    int i103 = (i102 - mean5.getMax) + i99;
                                    int i104 = 0;
                                    while (i104 < i18) {
                                        int i105 = (i104 - mean5.getMax) + i100;
                                        if (i103 < 0 || i103 >= height || i105 < 0 || i105 >= width) {
                                            mean4 = mean5;
                                            i17 = i103;
                                            fastBitmap3 = fastBitmap5;
                                        } else {
                                            mean4 = mean5;
                                            i17 = i103;
                                            fastBitmap3 = fastBitmap5;
                                            double d21 = (double) (fastBitmap5.setMax[(fastBitmap5.getMin * i103) + (i105 * fastBitmap5.getMax)] & 255);
                                            Double.isNaN(d21);
                                            d20 *= d21;
                                            i101++;
                                        }
                                        i104++;
                                        mean5 = mean4;
                                        i103 = i17;
                                        fastBitmap5 = fastBitmap3;
                                    }
                                    Mean mean11 = mean5;
                                    FastBitmap fastBitmap14 = fastBitmap5;
                                }
                                Mean mean12 = mean5;
                                FastBitmap fastBitmap15 = fastBitmap5;
                                double d22 = (double) i101;
                                Double.isNaN(d22);
                                fastBitmap4.setMin(i99, i100, (int) Math.pow(d20, 1.0d / d22));
                                i100++;
                                fastBitmap5 = fastBitmap15;
                            }
                            Mean mean13 = mean5;
                            FastBitmap fastBitmap16 = fastBitmap5;
                        }
                    } else {
                        Mean mean14 = mean5;
                        FastBitmap fastBitmap17 = fastBitmap5;
                        if (fastBitmap4.getMax()) {
                            int i106 = 0;
                            while (i106 < height) {
                                int i107 = 0;
                                while (i107 < width) {
                                    double d23 = 1.0d;
                                    double d24 = 1.0d;
                                    double d25 = 1.0d;
                                    int i108 = 0;
                                    int i109 = 0;
                                    while (i108 < i18) {
                                        Mean mean15 = mean14;
                                        int i110 = (i108 - mean15.getMax) + i106;
                                        int i111 = i106;
                                        int i112 = 0;
                                        while (i112 < i18) {
                                            int i113 = i18;
                                            int i114 = (i112 - mean15.getMax) + i107;
                                            if (i110 < 0 || i110 >= height || i114 < 0 || i114 >= width) {
                                                i15 = height;
                                                i14 = i107;
                                                mean3 = mean15;
                                                fastBitmap2 = fastBitmap17;
                                                i16 = width;
                                            } else {
                                                mean3 = mean15;
                                                fastBitmap2 = fastBitmap17;
                                                i16 = width;
                                                i15 = height;
                                                i14 = i107;
                                                double d26 = (double) ((fastBitmap2.setMax[(fastBitmap2.getMin * i110) + (fastBitmap2.getMax * i114)] >> 16) & 255);
                                                Double.isNaN(d26);
                                                d23 *= d26;
                                                double d27 = (double) ((fastBitmap2.setMax[(fastBitmap2.getMin * i110) + (fastBitmap2.getMax * i114)] >> 8) & 255);
                                                Double.isNaN(d27);
                                                d24 *= d27;
                                                double d28 = (double) (fastBitmap2.setMax[(fastBitmap2.getMin * i110) + (i114 * fastBitmap2.getMax)] & 255);
                                                Double.isNaN(d28);
                                                d25 *= d28;
                                                i109++;
                                            }
                                            i112++;
                                            i18 = i113;
                                            width = i16;
                                            height = i15;
                                            i107 = i14;
                                            fastBitmap17 = fastBitmap2;
                                            mean15 = mean3;
                                        }
                                        int i115 = height;
                                        int i116 = i107;
                                        int i117 = i18;
                                        Mean mean16 = mean15;
                                        FastBitmap fastBitmap18 = fastBitmap17;
                                        int i118 = width;
                                        i108++;
                                        i106 = i111;
                                        mean14 = mean16;
                                        fastBitmap17 = fastBitmap18;
                                    }
                                    int i119 = height;
                                    int i120 = i107;
                                    int i121 = i18;
                                    Mean mean17 = mean14;
                                    FastBitmap fastBitmap19 = fastBitmap17;
                                    int i122 = i106;
                                    double d29 = (double) i109;
                                    Double.isNaN(d29);
                                    double d30 = 1.0d / d29;
                                    fastBitmap4.setMin(i122, i120, (int) Math.pow(d23, d30), (int) Math.pow(d24, d30), (int) Math.pow(d25, d30));
                                    i107 = i120 + 1;
                                    i106 = i122;
                                    width = width;
                                    mean14 = mean17;
                                    fastBitmap17 = fastBitmap19;
                                }
                                int i123 = height;
                                int i124 = i18;
                                FastBitmap fastBitmap20 = fastBitmap17;
                                int i125 = width;
                                i106++;
                                mean14 = mean14;
                                fastBitmap17 = fastBitmap20;
                            }
                        }
                    }
                }
                return fastBitmap4;
            }
            FastBitmap fastBitmap21 = fastBitmap4;
            Mean mean18 = mean5;
            int i126 = width;
            int i127 = height;
            int i128 = i18;
            FastBitmap fastBitmap22 = fastBitmap5;
            if (fastBitmap21.getMin()) {
                int i129 = i127;
                int i130 = 0;
                while (i130 < i129) {
                    int i131 = i126;
                    int i132 = 0;
                    while (i132 < i131) {
                        int i133 = i128;
                        int i134 = 0;
                        int i135 = 0;
                        int i136 = 0;
                        while (i134 < i133) {
                            Mean mean19 = mean18;
                            int i137 = (i134 - mean19.getMax) + i130;
                            for (int i138 = 0; i138 < i133; i138++) {
                                int i139 = (i138 - mean19.getMax) + i132;
                                if (i137 >= 0 && i137 < i129 && i139 >= 0 && i139 < i131) {
                                    i135 += fastBitmap22.setMax[(fastBitmap22.getMin * i137) + (i139 * fastBitmap22.getMax)] & 255;
                                    i136++;
                                }
                            }
                            i134++;
                            mean18 = mean19;
                        }
                        Mean mean20 = mean18;
                        fastBitmap21.setMin(i130, i132, i135 / i136);
                        i132++;
                        i128 = i133;
                    }
                    FastBitmap fastBitmap23 = fastBitmap21;
                    Mean mean21 = mean18;
                    int i140 = i128;
                    i130++;
                    i126 = i131;
                }
                return fastBitmap21;
            }
            FastBitmap fastBitmap24 = fastBitmap21;
            Mean mean22 = mean18;
            int i141 = i127;
            int i142 = i128;
            int i143 = i126;
            if (!fastBitmap24.getMax()) {
                return fastBitmap24;
            }
            for (int i144 = 0; i144 < i141; i144++) {
                int i145 = 0;
                while (i145 < i143) {
                    int i146 = 0;
                    int i147 = 0;
                    int i148 = 0;
                    int i149 = 0;
                    for (int i150 = 0; i150 < i142; i150++) {
                        int i151 = (i150 - mean22.getMax) + i144;
                        int i152 = 0;
                        while (i152 < i142) {
                            int i153 = (i152 - mean22.getMax) + i145;
                            if (i151 < 0 || i151 >= i141 || i153 < 0 || i153 >= i143) {
                                i = i141;
                                i2 = i143;
                                i3 = i142;
                            } else {
                                i = i141;
                                i2 = i143;
                                i3 = i142;
                                i146 += (fastBitmap22.setMax[(fastBitmap22.getMin * i151) + (fastBitmap22.getMax * i153)] >> 16) & 255;
                                i148 += (fastBitmap22.setMax[(fastBitmap22.getMin * i151) + (fastBitmap22.getMax * i153)] >> 8) & 255;
                                i149 += fastBitmap22.setMax[(fastBitmap22.getMin * i151) + (i153 * fastBitmap22.getMax)] & 255;
                                i147++;
                            }
                            i152++;
                            i142 = i3;
                            i143 = i2;
                            i141 = i;
                        }
                        int i154 = i141;
                        int i155 = i143;
                        int i156 = i142;
                    }
                    int i157 = i142;
                    fastBitmap24.setMin(i144, i145, i146 / i147, i148 / i147, i149 / i147);
                    i145++;
                    i143 = i143;
                    i141 = i141;
                }
                int i158 = i141;
                int i159 = i143;
                int i160 = i142;
            }
            return fastBitmap24;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "LCatalano/Imaging/FastBitmap;", "kotlin.jvm.PlatformType", "it", "Landroid/graphics/Bitmap;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<Bitmap, FastBitmap> {
        final /* synthetic */ PreprocessingAndOcrPresenter setMax;

        toFloatRange(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter) {
            this.setMax = preprocessingAndOcrPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            Intrinsics.checkNotNullParameter(bitmap, "it");
            return PreprocessingAndOcrPresenter.getMax(bitmap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "LCatalano/Imaging/FastBitmap;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<FastBitmap, FastBitmap> {
        public static final toIntRange setMin = new toIntRange();

        toIntRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ArrayList arrayList;
            FastBitmap fastBitmap = (FastBitmap) obj;
            Intrinsics.checkNotNullParameter(fastBitmap, "it");
            Intrinsics.checkNotNullParameter(fastBitmap, "$this$applyHistogramEqualization");
            o.toIntRange tointrange = new o.toIntRange(fastBitmap);
            ArrayList arrayList2 = new ArrayList();
            double width = (double) (fastBitmap.length.getWidth() * fastBitmap.length.getHeight());
            Double.isNaN(width);
            float f = (float) (255.0d / width);
            long j = 0;
            int i = 256;
            int i2 = 0;
            if (fastBitmap.getMin()) {
                if (tointrange.length != null) {
                    arrayList2.add(tointrange.length.getMin);
                    arrayList = new ArrayList();
                    int[] iArr = new int[256];
                    for (int i3 = 0; i3 < 256; i3++) {
                        iArr[i3] = 0;
                    }
                    for (int i4 = 0; i4 < 256; i4++) {
                        j += (long) ((int[]) arrayList2.get(0))[i4];
                        int i5 = (int) (((float) j) * f);
                        if (i5 > 255) {
                            iArr[i4] = 255;
                        } else {
                            iArr[i4] = i5;
                        }
                    }
                    arrayList.add(iArr);
                } else {
                    throw new IllegalArgumentException("Histogram gray is null");
                }
            } else if (tointrange.getMin != null) {
                arrayList2.add(tointrange.getMin.getMin);
                if (tointrange.setMax != null) {
                    arrayList2.add(tointrange.setMax.getMin);
                    if (tointrange.getMax != null) {
                        arrayList2.add(tointrange.getMax.getMin);
                        arrayList = new ArrayList();
                        int[] iArr2 = new int[256];
                        int[] iArr3 = new int[256];
                        int[] iArr4 = new int[256];
                        for (int i6 = 0; i6 < 256; i6++) {
                            iArr2[i6] = 0;
                            iArr3[i6] = 0;
                            iArr4[i6] = 0;
                        }
                        long j2 = 0;
                        long j3 = 0;
                        int i7 = 0;
                        while (i7 < i) {
                            int[] iArr5 = iArr3;
                            j += (long) ((int[]) arrayList2.get(i2))[i7];
                            int i8 = (int) (((float) j) * f);
                            if (i8 > 255) {
                                iArr2[i7] = 255;
                            } else {
                                iArr2[i7] = i8;
                            }
                            j2 += (long) ((int[]) arrayList2.get(1))[i7];
                            int i9 = (int) (((float) j2) * f);
                            if (i9 > 255) {
                                iArr5[i7] = 255;
                            } else {
                                iArr5[i7] = i9;
                            }
                            long j4 = j3 + ((long) ((int[]) arrayList2.get(2))[i7]);
                            int i10 = (int) (((float) j4) * f);
                            if (i10 > 255) {
                                iArr4[i7] = 255;
                            } else {
                                iArr4[i7] = i10;
                            }
                            i7++;
                            j3 = j4;
                            iArr3 = iArr5;
                            i = 256;
                            i2 = 0;
                        }
                        arrayList.add(iArr2);
                        arrayList.add(iArr3);
                        arrayList.add(iArr4);
                    } else {
                        throw new IllegalArgumentException("Histogram blue is null");
                    }
                } else {
                    throw new IllegalArgumentException("Histogram green is null");
                }
            } else {
                throw new IllegalArgumentException("Histogram red is null");
            }
            int length = fastBitmap.setMax.length;
            if (fastBitmap.getMin()) {
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = ((int[]) arrayList.get(0))[fastBitmap.setMax[i11] & 255];
                    fastBitmap.setMax[i11] = i12 | (i12 << 16) | -16777216 | (i12 << 8);
                }
            } else if (fastBitmap.getMax()) {
                for (int i13 = 0; i13 < length; i13++) {
                    fastBitmap.setMax[i13] = (((int[]) arrayList.get(0))[(fastBitmap.setMax[i13] >> 16) & 255] << 16) | -16777216 | (((int[]) arrayList.get(1))[(fastBitmap.setMax[i13] >> 8) & 255] << 8) | ((int[]) arrayList.get(2))[fastBitmap.setMax[i13] & 255];
                }
            }
            return fastBitmap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "LCatalano/Imaging/FastBitmap;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toString<T, R> implements RedDotDrawable<FastBitmap, Bitmap> {
        public static final toString length = new toString();

        toString() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            FastBitmap fastBitmap = (FastBitmap) obj;
            Intrinsics.checkNotNullParameter(fastBitmap, "it");
            return fastBitmap.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "accept"}, k = 3, mv = {1, 4, 2})
    static final class values<T> implements RedDotManager<Bitmap> {
        final /* synthetic */ String getMax;
        final /* synthetic */ PreprocessingAndOcrPresenter setMin;

        values(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str) {
            this.setMin = preprocessingAndOcrPresenter;
            this.getMax = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                PreprocessingAndOcrPresenter preprocessingAndOcrPresenter = this.setMin;
                String str = this.getMax;
                Intrinsics.checkNotNullExpressionValue(bitmap, "it");
                preprocessingAndOcrPresenter.length(str, bitmap);
                return;
            }
            this.setMin.setMax(this.getMax, ErrorOcr.FILE_NOT_FOUND);
        }
    }

    @Inject
    public PreprocessingAndOcrPresenter(@NotNull PreprocessingAndOcrContract.View view, @NotNull getScheme getscheme, @NotNull IRedDotManager iRedDotManager, @NotNull MonitorUtils monitorUtils, @NotNull StaggeredGridLayoutManager staggeredGridLayoutManager, @NotNull getActionButton getactionbutton) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(iRedDotManager, "compositeDisposable");
        Intrinsics.checkNotNullParameter(monitorUtils, "getOcrFromReceipt");
        Intrinsics.checkNotNullParameter(staggeredGridLayoutManager, "getOcrSnapLimit");
        Intrinsics.checkNotNullParameter(getactionbutton, "getOcrPreprocessingConfig");
        this.length = view;
        this.getMax = getscheme;
        this.toIntRange = iRedDotManager;
        this.IsOverlapping = monitorUtils;
        this.isInside = staggeredGridLayoutManager;
        this.toFloatRange = getactionbutton;
    }

    public static final /* synthetic */ OCRRequestModel setMin(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter) {
        OCRRequestModel oCRRequestModel = preprocessingAndOcrPresenter.setMin;
        if (oCRRequestModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrRequestModel");
        }
        return oCRRequestModel;
    }

    public final void setMax(@NotNull OCRRequestModel oCRRequestModel) {
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        this.setMin = oCRRequestModel;
    }

    public final void setMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(str2, "filePath");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 max = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(new PreprocessingAndOcrPresenter$FastBitmap$CoordinateSystem(str2));
        hasCornerMarking min = getSecureSignatureComp.setMin();
        setRefreshAnimation.getMax(min, "scheduler is null");
        setMinDuration setbackbuttoncolor = new setBackButtonColor(max, min);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            setbackbuttoncolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setbackbuttoncolor);
        }
        hasCornerMarking scheduler = this.getMax.getScheduler();
        setRefreshAnimation.getMax(scheduler, "scheduler is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 opentranslucentstatusbarsupport = new openTranslucentStatusBarSupport(setbackbuttoncolor, scheduler);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
        if (redDotDrawable2 != null) {
            opentranslucentstatusbarsupport = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, opentranslucentstatusbarsupport);
        }
        GriverProgressBar.UpdateRunnable min2 = opentranslucentstatusbarsupport.setMin(new values(this, str), new hashCode(this, str));
        Intrinsics.checkNotNullExpressionValue(min2, "Single.fromCallable {\n  …NOT_FOUND)\n            })");
        IRedDotManager iRedDotManager = this.toIntRange;
        if (iRedDotManager != null) {
            iRedDotManager.getMin(min2);
            return;
        }
        throw null;
    }

    public final void length(@NotNull String str, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(bitmap, "imageOrigin");
        this.getMin = System.currentTimeMillis();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new valueOf(this, str, bitmap));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create<Bitmap> { …)\n            }\n        }");
        hasCornerMarking length2 = hideProgress.length();
        setRefreshAnimation.getMax(length2, "scheduler is null");
        setMinDuration opentranslucentstatusbarsupport = new openTranslucentStatusBarSupport(min, length2);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            opentranslucentstatusbarsupport = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, opentranslucentstatusbarsupport);
        }
        RedDotDrawable getmin = new getMin(this, str);
        setRefreshAnimation.getMax(getmin, "mapper is null");
        setMinDuration releaseviewlist = new releaseViewList(opentranslucentstatusbarsupport, getmin);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
        if (redDotDrawable2 != null) {
            releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
        }
        hasCornerMarking min2 = getSecureSignatureComp.setMin();
        setRefreshAnimation.getMax(min2, "scheduler is null");
        setMinDuration opentranslucentstatusbarsupport2 = new openTranslucentStatusBarSupport(releaseviewlist, min2);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable3 = SecuritySignature.toString;
        if (redDotDrawable3 != null) {
            opentranslucentstatusbarsupport2 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, opentranslucentstatusbarsupport2);
        }
        RedDotDrawable setmax = new setMax(this);
        setRefreshAnimation.getMax(setmax, "mapper is null");
        setMinDuration switchtobluetheme = new switchToBlueTheme(opentranslucentstatusbarsupport2, setmax);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable4 = SecuritySignature.toString;
        if (redDotDrawable4 != null) {
            switchtobluetheme = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable4, switchtobluetheme);
        }
        RedDotManager setmin = new setMin(this, str);
        setRefreshAnimation.getMax(setmin, "onError is null");
        setMinDuration getpopanchor = new getPopAnchor(switchtobluetheme, setmin);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable5 = SecuritySignature.toString;
        if (redDotDrawable5 != null) {
            getpopanchor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable5, getpopanchor);
        }
        Intrinsics.checkNotNullExpressionValue(getpopanchor, "this\n            .observ…NNOT_RECOGNIZE_RECEIPT) }");
        RedDotDrawable preprocessingAndOcrPresenter$Grayscale$Algorithm = new PreprocessingAndOcrPresenter$Grayscale$Algorithm(this);
        setRefreshAnimation.getMax(preprocessingAndOcrPresenter$Grayscale$Algorithm, "mapper is null");
        setMinDuration releaseviewlist2 = new releaseViewList(getpopanchor, preprocessingAndOcrPresenter$Grayscale$Algorithm);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable6 = SecuritySignature.toString;
        if (redDotDrawable6 != null) {
            releaseviewlist2 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable6, releaseviewlist2);
        }
        Intrinsics.checkNotNullExpressionValue(releaseviewlist2, "Single.create<Bitmap> { …ModelFromResultInfo(it) }");
        hasCornerMarking length3 = hideProgress.length();
        setRefreshAnimation.getMax(length3, "scheduler is null");
        setMinDuration opentranslucentstatusbarsupport3 = new openTranslucentStatusBarSupport(releaseviewlist2, length3);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable7 = SecuritySignature.toString;
        if (redDotDrawable7 != null) {
            opentranslucentstatusbarsupport3 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable7, opentranslucentstatusbarsupport3);
        }
        RedDotDrawable invoke2 = new invoke(this, str);
        setRefreshAnimation.getMax(invoke2, "mapper is null");
        setMinDuration releaseviewlist3 = new releaseViewList(opentranslucentstatusbarsupport3, invoke2);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable8 = SecuritySignature.toString;
        if (redDotDrawable8 != null) {
            releaseviewlist3 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable8, releaseviewlist3);
        }
        hasCornerMarking min3 = getSecureSignatureComp.setMin();
        setRefreshAnimation.getMax(min3, "scheduler is null");
        setMinDuration opentranslucentstatusbarsupport4 = new openTranslucentStatusBarSupport(releaseviewlist3, min3);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable9 = SecuritySignature.toString;
        if (redDotDrawable9 != null) {
            opentranslucentstatusbarsupport4 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable9, opentranslucentstatusbarsupport4);
        }
        RedDotDrawable iCustomTabsCallback = new ICustomTabsCallback(this, bitmap);
        setRefreshAnimation.getMax(iCustomTabsCallback, "mapper is null");
        setMinDuration releaseviewlist4 = new releaseViewList(opentranslucentstatusbarsupport4, iCustomTabsCallback);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable10 = SecuritySignature.toString;
        if (redDotDrawable10 != null) {
            releaseviewlist4 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable10, releaseviewlist4);
        }
        Intrinsics.checkNotNullExpressionValue(releaseviewlist4, "this.observeOn(AndroidSc…it.addFile(imageOrigin) }");
        hasCornerMarking scheduler = this.getMax.getScheduler();
        setRefreshAnimation.getMax(scheduler, "scheduler is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 opentranslucentstatusbarsupport5 = new openTranslucentStatusBarSupport(releaseviewlist4, scheduler);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable11 = SecuritySignature.toString;
        if (redDotDrawable11 != null) {
            opentranslucentstatusbarsupport5 = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable11, opentranslucentstatusbarsupport5);
        }
        GriverProgressBar.UpdateRunnable min4 = opentranslucentstatusbarsupport5.setMin(new PreprocessingAndOcrPresenter$Mean$Arithmetic(this, str), new invokeSuspend(this, str));
        Intrinsics.checkNotNullExpressionValue(min4, "Single.create<Bitmap> { …ss(taskId)\n            })");
        IRedDotManager iRedDotManager = this.toIntRange;
        if (iRedDotManager != null) {
            iRedDotManager.getMin(min4);
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class valueOf<T> implements updateProgress<Bitmap> {
        final /* synthetic */ Bitmap getMax;
        final /* synthetic */ String getMin;
        final /* synthetic */ PreprocessingAndOcrPresenter setMax;

        valueOf(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str, Bitmap bitmap) {
            this.setMax = preprocessingAndOcrPresenter;
            this.getMin = str;
            this.getMax = bitmap;
        }

        public final void subscribe(@NotNull TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<Bitmap> r4) {
            Intrinsics.checkNotNullParameter(r4, "emitter");
            try {
                PreprocessingAndOcrPresenter.getMax(this.setMax, this.getMin, this.getMax, r4);
            } catch (Exception e) {
                r4.onError(e);
            }
        }
    }

    public final void setMax() {
        this.length.dismissProgress();
        this.toIntRange.dispose();
        this.IsOverlapping.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/SingleEmitter;", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements updateProgress<NavigationBarCompat> {
        final /* synthetic */ Bitmap length;
        final /* synthetic */ PreprocessingAndOcrPresenter setMin;

        getMax(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, Bitmap bitmap) {
            this.setMin = preprocessingAndOcrPresenter;
            this.length = bitmap;
        }

        public final void subscribe(@NotNull TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1<NavigationBarCompat> r6) {
            Intrinsics.checkNotNullParameter(r6, "emitter");
            MonitorUtils length2 = this.setMin.IsOverlapping;
            setGlobalUserData preprocessingAndOcrPresenter$executeOcr$1$1 = new PreprocessingAndOcrPresenter$executeOcr$1$1(r6);
            String str = PreprocessingAndOcrPresenter.setMin(this.setMin).setMin;
            if (str != null) {
                length2.execute(preprocessingAndOcrPresenter$executeOcr$1$1, new MonitorUtils.setMax(str, PreprocessingAndOcrPresenter.setMin(this.setMin).getMin, this.length));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(String str, String str2) {
        getMax();
        this.length.dismissProgress();
        PreprocessingAndOcrContract.View view = this.length;
        OCRRequestModel oCRRequestModel = this.setMin;
        if (oCRRequestModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrRequestModel");
        }
        view.getMax(str, oCRRequestModel, new OCRResultModel.Builder(str2).getMax());
    }

    private final void getMax() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.getMin == 0) {
            this.getMin = currentTimeMillis - 300;
        }
        String str = equals;
        StringBuilder sb = new StringBuilder("Ocr until write to file process delay: ");
        sb.append(currentTimeMillis - this.getMin);
        updateActionSheetContent.d(str, sb.toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/ocr/PreprocessingAndOcrPresenter$Companion;", "", "()V", "DEFAULT_DEVIATION_TIME_MILLIS", "", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    static {
        String simpleName = PreprocessingAndOcrPresenter.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "PreprocessingAndOcrPrese…er::class.java.simpleName");
        equals = simpleName;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T> implements RedDotManager<Throwable> {
        final /* synthetic */ String getMax;
        final /* synthetic */ PreprocessingAndOcrPresenter setMax;

        hashCode(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str) {
            this.setMax = preprocessingAndOcrPresenter;
            this.getMax = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.setMax.setMax(this.getMax, ErrorOcr.FILE_NOT_FOUND);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<Throwable> {
        final /* synthetic */ String getMax;
        final /* synthetic */ PreprocessingAndOcrPresenter length;

        setMin(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str) {
            this.length = preprocessingAndOcrPresenter;
            this.getMax = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.length.setMax(this.getMax, "006");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class isInside<V> implements Callable<Bitmap> {
        final /* synthetic */ String getMax;
        final /* synthetic */ Bitmap setMax;
        final /* synthetic */ PreprocessingAndOcrPresenter setMin;

        isInside(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str, Bitmap bitmap) {
            this.setMin = preprocessingAndOcrPresenter;
            this.getMax = str;
            this.setMax = bitmap;
        }

        public final /* synthetic */ Object call() {
            this.setMin.length.setMax(this.getMax);
            return this.setMax;
        }
    }

    public static final /* synthetic */ void getMax(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str, Bitmap bitmap, TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.AnonymousClass1 r6) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<hasActionButtons> invoke2 = preprocessingAndOcrPresenter.toFloatRange.invoke();
        hasCornerMarking min = getSecureSignatureComp.setMin();
        setRefreshAnimation.getMax(min, "scheduler is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 setbackbuttoncolor = new setBackButtonColor(invoke2, min);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            setbackbuttoncolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setbackbuttoncolor);
        }
        setbackbuttoncolor.setMin(new length(preprocessingAndOcrPresenter, r6, str, bitmap), Functions.IsOverlapping);
    }

    public static final /* synthetic */ OCRResultModel getMax(NavigationBarCompat navigationBarCompat) {
        OCRResultModel.Builder builder;
        if (navigationBarCompat.isFulFilled()) {
            builder = new OCRResultModel.Builder();
        } else {
            builder = new OCRResultModel.Builder("004");
        }
        String merchantName = navigationBarCompat.getMerchantName();
        OCRResultModel.Builder builder2 = builder;
        if (merchantName != null) {
            builder2.getMin = merchantName;
        }
        String billNumber = navigationBarCompat.getBillNumber();
        OCRResultModel.Builder builder3 = builder2;
        if (billNumber != null) {
            builder3.setMax = billNumber;
        }
        String timestamp = navigationBarCompat.getTimestamp();
        OCRResultModel.Builder builder4 = builder3;
        if (timestamp != null) {
            builder4.setMin = timestamp;
        }
        String amount = navigationBarCompat.getAmount();
        OCRResultModel.Builder builder5 = builder4;
        if (amount != null) {
            builder5.length = amount;
        }
        String rawText = navigationBarCompat.getRawText();
        OCRResultModel.Builder builder6 = builder5;
        if (rawText != null) {
            builder6.getMax = rawText;
        }
        return builder6.getMax();
    }

    public static final /* synthetic */ void getMax(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, String str, OCRResultModel oCRResultModel) {
        if (oCRResultModel != null) {
            preprocessingAndOcrPresenter.getMax();
            preprocessingAndOcrPresenter.length.dismissProgress();
            PreprocessingAndOcrContract.View view = preprocessingAndOcrPresenter.length;
            OCRRequestModel oCRRequestModel = preprocessingAndOcrPresenter.setMin;
            if (oCRRequestModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ocrRequestModel");
            }
            view.getMax(str, oCRRequestModel, oCRResultModel);
            return;
        }
        preprocessingAndOcrPresenter.setMax(str, "001");
    }

    public static final /* synthetic */ TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 setMin(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, Bitmap bitmap) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 min = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin(new getMax(preprocessingAndOcrPresenter, bitmap));
        Intrinsics.checkNotNullExpressionValue(min, "Single.create<ReceiptInf…, imageOrigin))\n        }");
        return min;
    }

    public static final /* synthetic */ OCRResultModel setMin(PreprocessingAndOcrPresenter preprocessingAndOcrPresenter, OCRResultModel oCRResultModel, Bitmap bitmap) {
        getSeletedIndex getseletedindex = getSeletedIndex.getMin;
        String path = preprocessingAndOcrPresenter.length.setMin().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "view.getStorageDir().path");
        Long min = preprocessingAndOcrPresenter.isInside.getMax.getSnapSizeLimit().setMin();
        Intrinsics.checkNotNullExpressionValue(min, "getOcrSnapLimit.invoke().blockingGet()");
        String absolutePath = getSeletedIndex.getMax(bitmap, path, min.longValue()).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "ImageUtil.createFile(ima…ockingGet()).absolutePath");
        Intrinsics.checkNotNullParameter(absolutePath, "filePath");
        return new OCRResultModel(oCRResultModel.getMax(), oCRResultModel.getMin, oCRResultModel.setMin, oCRResultModel.getMax, oCRResultModel.setMax, oCRResultModel.length, oCRResultModel.toIntRange, absolutePath);
    }

    /* JADX WARNING: type inference failed for: r8v11, types: [o.TitleBarRightButtonView$CornerMarkingUIController$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 length(id.dana.ocr.PreprocessingAndOcrPresenter r8, java.lang.String r9, android.graphics.Bitmap r10, long r11) {
        /*
            id.dana.ocr.PreprocessingAndOcrPresenter$isInside r0 = new id.dana.ocr.PreprocessingAndOcrPresenter$isInside
            r0.<init>(r8, r9, r10)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r9 = o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(r0)
            o.hasCornerMarking r0 = o.hideProgress.length()
            java.lang.String r1 = "scheduler is null"
            o.setRefreshAnimation.getMax(r0, (java.lang.String) r1)
            o.setBackButtonColor r2 = new o.setBackButtonColor
            r2.<init>(r9, r0)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x0024
            java.lang.Object r9 = o.SecuritySignature.getMax(r9, r2)
            r2 = r9
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x0024:
            o.hasCornerMarking r9 = o.getSecureSignatureComp.getMin()
            o.setRefreshAnimation.getMax(r9, (java.lang.String) r1)
            o.openTranslucentStatusBarSupport r0 = new o.openTranslucentStatusBarSupport
            r0.<init>(r2, r9)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x003b
            java.lang.Object r9 = o.SecuritySignature.getMax(r9, r0)
            r0 = r9
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r0 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r0
        L_0x003b:
            id.dana.ocr.PreprocessingAndOcrPresenter$toFloatRange r9 = new id.dana.ocr.PreprocessingAndOcrPresenter$toFloatRange
            r9.<init>(r8)
            o.RedDotDrawable r9 = (o.RedDotDrawable) r9
            java.lang.String r8 = "mapper is null"
            o.setRefreshAnimation.getMax(r9, (java.lang.String) r8)
            o.releaseViewList r2 = new o.releaseViewList
            r2.<init>(r0, r9)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x0057
            java.lang.Object r9 = o.SecuritySignature.getMax(r9, r2)
            r2 = r9
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x0057:
            id.dana.ocr.PreprocessingAndOcrPresenter$IsOverlapping r9 = id.dana.ocr.PreprocessingAndOcrPresenter.IsOverlapping.getMin
            o.RedDotDrawable r9 = (o.RedDotDrawable) r9
            o.setRefreshAnimation.getMax(r9, (java.lang.String) r8)
            o.releaseViewList r0 = new o.releaseViewList
            r0.<init>(r2, r9)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x006e
            java.lang.Object r9 = o.SecuritySignature.getMax(r9, r0)
            r0 = r9
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r0 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r0
        L_0x006e:
            id.dana.ocr.PreprocessingAndOcrPresenter$equals r9 = id.dana.ocr.PreprocessingAndOcrPresenter.equals.setMin
            o.RedDotDrawable r9 = (o.RedDotDrawable) r9
            o.setRefreshAnimation.getMax(r9, (java.lang.String) r8)
            o.releaseViewList r2 = new o.releaseViewList
            r2.<init>(r0, r9)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x0085
            java.lang.Object r9 = o.SecuritySignature.getMax(r9, r2)
            r2 = r9
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x0085:
            id.dana.ocr.PreprocessingAndOcrPresenter$toIntRange r9 = id.dana.ocr.PreprocessingAndOcrPresenter.toIntRange.setMin
            o.RedDotDrawable r9 = (o.RedDotDrawable) r9
            o.setRefreshAnimation.getMax(r9, (java.lang.String) r8)
            o.releaseViewList r0 = new o.releaseViewList
            r0.<init>(r2, r9)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x009c
            java.lang.Object r9 = o.SecuritySignature.getMax(r9, r0)
            r0 = r9
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r0 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r0
        L_0x009c:
            id.dana.ocr.PreprocessingAndOcrPresenter$toDoubleRange r9 = id.dana.ocr.PreprocessingAndOcrPresenter.toDoubleRange.setMax
            o.RedDotDrawable r9 = (o.RedDotDrawable) r9
            o.setRefreshAnimation.getMax(r9, (java.lang.String) r8)
            o.releaseViewList r2 = new o.releaseViewList
            r2.<init>(r0, r9)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x00b3
            java.lang.Object r9 = o.SecuritySignature.getMax(r9, r2)
            r2 = r9
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x00b3:
            id.dana.ocr.PreprocessingAndOcrPresenter$toString r9 = id.dana.ocr.PreprocessingAndOcrPresenter.toString.length
            o.RedDotDrawable r9 = (o.RedDotDrawable) r9
            o.setRefreshAnimation.getMax(r9, (java.lang.String) r8)
            o.releaseViewList r8 = new o.releaseViewList
            r8.<init>(r2, r9)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x00c9
            java.lang.Object r8 = o.SecuritySignature.getMax(r9, r8)
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r8 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r8
        L_0x00c9:
            r3 = r8
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            o.hasCornerMarking r7 = o.getSecureSignatureComp.getMin()
            java.lang.String r8 = "unit is null"
            o.setRefreshAnimation.getMax(r6, (java.lang.String) r8)
            o.setRefreshAnimation.getMax(r7, (java.lang.String) r1)
            o.setBackHomeButtonColor r8 = new o.setBackHomeButtonColor
            r2 = r8
            r4 = r11
            r2.<init>(r3, r4, r6, r7)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r9 = o.SecuritySignature.toString
            if (r9 == 0) goto L_0x00e9
            java.lang.Object r8 = o.SecuritySignature.getMax(r9, r8)
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r8 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r8
        L_0x00e9:
            java.lang.String r9 = "value is null"
            o.setRefreshAnimation.getMax(r10, (java.lang.String) r9)
            o.setOptionMenuColor r9 = new o.setOptionMenuColor
            r11 = 0
            r9.<init>(r8, r11, r10)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r8 = o.SecuritySignature.toString
            if (r8 == 0) goto L_0x00ff
            java.lang.Object r8 = o.SecuritySignature.getMax(r8, r9)
            r9 = r8
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r9 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r9
        L_0x00ff:
            java.lang.String r8 = "Single.fromCallable {\n  …  .onErrorReturnItem(src)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.ocr.PreprocessingAndOcrPresenter.length(id.dana.ocr.PreprocessingAndOcrPresenter, java.lang.String, android.graphics.Bitmap, long):o.TitleBarRightButtonView$CornerMarkingUIController$1");
    }

    public static final /* synthetic */ FastBitmap getMax(Bitmap bitmap) {
        return new FastBitmap(bitmap.copy(bitmap.getConfig(), true));
    }
}
