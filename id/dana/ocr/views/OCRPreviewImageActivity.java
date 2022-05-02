package id.dana.ocr.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.modules.OCRPreviewImageModule;
import id.dana.di.modules.PreprocessingAndOcrModule;
import id.dana.ocr.OCRPreviewImageContract;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import id.dana.ocr.model.OcrAndUploadTaskModel;
import id.dana.ocr.preview.BottomSheetPromptView;
import id.dana.ocr.views.SnapReceiptService;
import id.dana.richview.LogoProgressView;
import id.dana.richview.imageview.ZoomableImageView;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.PrepareException;
import o.calculateDtToFit;
import o.dispatchOnCancelled;
import o.getResourceHeaderMap;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0011J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0011H\u0002J\b\u00100\u001a\u00020\u0011H\u0002J\b\u00101\u001a\u00020\u0011H\u0002J\b\u00102\u001a\u00020\u0011H\u0016J\u0010\u00103\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u00104\u001a\u00020\u00112\n\b\u0002\u00105\u001a\u0004\u0018\u00010 H\u0002J\b\u00106\u001a\u00020\u0011H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u00068"}, d2 = {"Lid/dana/ocr/views/OCRPreviewImageActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/ocr/OCRPreviewImageContract$View;", "()V", "ocrPreviewImagePresenter", "Lid/dana/ocr/OCRPreviewImageContract$Presenter;", "getOcrPreviewImagePresenter", "()Lid/dana/ocr/OCRPreviewImageContract$Presenter;", "setOcrPreviewImagePresenter", "(Lid/dana/ocr/OCRPreviewImageContract$Presenter;)V", "preprocessingAndOcrPresenter", "Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;", "getPreprocessingAndOcrPresenter", "()Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;", "setPreprocessingAndOcrPresenter", "(Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;)V", "closePage", "", "configToolbar", "dismissProgress", "getLayout", "", "getStorageDir", "Ljava/io/File;", "handleBundle", "hideBottomPrompt", "hideLoading", "init", "initComponent", "initViews", "onError", "errorMessage", "", "onFailConvertBitmap", "onFilePathNull", "onSuccessConvertImage", "bitmap", "Landroid/graphics/Bitmap;", "processImageOnBackground", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "filePath", "processImageOnForeground", "imageOrigin", "setResultActivityAndFinish", "ocrResultModel", "Lid/dana/ocr/model/OCRResultModel;", "setTextLoadingProgressOcrProcess", "setTextLoadingProgressPreProcessing", "setTextLoadingProgressSubmission", "showBottomPrompt", "showImage", "showLoading", "loadingText", "showProgress", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRPreviewImageActivity extends BaseActivity implements OCRPreviewImageContract.View {
    @NotNull
    public static final Companion Companion = new Companion((byte) 0);
    @NotNull
    public static final String KEY_OCR_RESULT_MODEL = "KEY_OCR_RESULT_MODEL";
    public static final int OCR_PREVIEW_IMAGE_REQUEST_CODE = 4626;
    /* access modifiers changed from: private */
    public static calculateDtToFit setMax;
    private HashMap getMax;
    @Inject
    public OCRPreviewImageContract.Presenter ocrPreviewImagePresenter;
    @Inject
    public PreprocessingAndOcrContract.Presenter preprocessingAndOcrPresenter;

    @JvmStatic
    @NotNull
    public static final Intent generateIntent(@NotNull Context context, @NotNull calculateDtToFit calculatedttofit, @NotNull OCRRequestModel oCRRequestModel) {
        return Companion.setMin(context, calculatedttofit, oCRRequestModel);
    }

    @JvmStatic
    public static final void openOCRPreviewImage(@NotNull Activity activity, @NotNull calculateDtToFit calculatedttofit, @NotNull OCRRequestModel oCRRequestModel) {
        Companion.length(activity, calculatedttofit, oCRRequestModel);
    }

    @JvmStatic
    public static final void setPictureResult(@NotNull calculateDtToFit calculatedttofit) {
        Companion.setMax(calculatedttofit);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void configToolbar() {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1859625648, oncanceled);
            onCancelLoad.getMin(-1859625648, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (context != null && (length = context.fileList().length) != (min = dispatchOnCancelled.getMin(context, length))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1859625648, oncanceled2);
            onCancelLoad.getMin(-1859625648, oncanceled2);
        }
    }

    public final int getLayout() {
        return R.layout.activity_preview_image;
    }

    public static final /* synthetic */ void access$setResultActivityAndFinish(OCRPreviewImageActivity oCRPreviewImageActivity, OCRResultModel oCRResultModel) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1936793744, oncanceled);
            onCancelLoad.getMin(-1936793744, oncanceled);
        }
        Context baseContext = oCRPreviewImageActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1936793744, oncanceled2);
            onCancelLoad.getMin(-1936793744, oncanceled2);
        }
        Intent intent = new Intent();
        intent.putExtra(KEY_OCR_RESULT_MODEL, oCRResultModel);
        oCRPreviewImageActivity.setResult(-1, intent);
        oCRPreviewImageActivity.finish();
    }

    @NotNull
    public final OCRPreviewImageContract.Presenter getOcrPreviewImagePresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1054037740 == (max = dispatchOnCancelled.getMax(applicationContext, 1054037740)))) {
            onCanceled oncanceled = new onCanceled(1054037740, max, 512);
            onCancelLoad.setMax(1054037740, oncanceled);
            onCancelLoad.getMin(1054037740, oncanceled);
        }
        OCRPreviewImageContract.Presenter presenter = this.ocrPreviewImagePresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrPreviewImagePresenter");
        }
        return presenter;
    }

    public final void setOcrPreviewImagePresenter(@NotNull OCRPreviewImageContract.Presenter presenter) {
        Intrinsics.checkNotNullParameter(presenter, "<set-?>");
        this.ocrPreviewImagePresenter = presenter;
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

    public final void init() {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(700719137, oncanceled);
            onCancelLoad.getMin(700719137, oncanceled);
        }
        initComponent();
        onDelete.getMin[] getminArr = new onDelete.getMin[2];
        OCRPreviewImageContract.Presenter presenter = this.ocrPreviewImagePresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrPreviewImagePresenter");
        }
        getminArr[0] = presenter;
        OCRPreviewImageContract.Presenter presenter2 = this.ocrPreviewImagePresenter;
        if (presenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrPreviewImagePresenter");
        }
        getminArr[1] = presenter2;
        registerPresenter(getminArr);
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1320157517, oncanceled2);
            onCancelLoad.getMin(1320157517, oncanceled2);
        }
        OCRRequestModel oCRRequestModel = (OCRRequestModel) getIntent().getParcelableExtra(OCRCameraActivity.OCR_REQUEST_MODEL_KEY);
        if (oCRRequestModel != null) {
            OCRPreviewImageContract.Presenter presenter3 = this.ocrPreviewImagePresenter;
            if (presenter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ocrPreviewImagePresenter");
            }
            Intrinsics.checkNotNullExpressionValue(oCRRequestModel, "it");
            presenter3.setMax(oCRRequestModel);
            PreprocessingAndOcrContract.Presenter presenter4 = this.preprocessingAndOcrPresenter;
            if (presenter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preprocessingAndOcrPresenter");
            }
            presenter4.setMax(oCRRequestModel);
        }
        initViews();
    }

    public final void initViews() {
        OCRPreviewImageContract.Presenter presenter = this.ocrPreviewImagePresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrPreviewImagePresenter");
        }
        calculateDtToFit calculatedttofit = setMax;
        if (calculatedttofit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pictureResult");
        }
        presenter.setMax(calculatedttofit);
        ((BottomSheetPromptView) _$_findCachedViewById(resetInternal.setMax.IsOverlapping)).setListener(new OCRPreviewImageActivity$initViews$1(this));
    }

    @NotNull
    public final File getStorageDir() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1271621714, oncanceled);
            onCancelLoad.getMin(-1271621714, oncanceled);
        }
        File min = ConfirmPopup.AnonymousClass2.getMin(this);
        Intrinsics.checkNotNullExpressionValue(min, "FileUtil.getAppPrivateDirectory(this)");
        return min;
    }

    public final void processImageOnForeground(@NotNull Bitmap bitmap) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1764902913, oncanceled);
            onCancelLoad.getMin(-1764902913, oncanceled);
        }
        Intrinsics.checkNotNullParameter(bitmap, "imageOrigin");
        PreprocessingAndOcrContract.Presenter presenter = this.preprocessingAndOcrPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preprocessingAndOcrPresenter");
        }
        presenter.length("1", bitmap);
    }

    public final void processImageOnBackground(@NotNull OCRRequestModel oCRRequestModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        Intrinsics.checkNotNullParameter(str, "filePath");
        String obj = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "UUID.randomUUID().toString()");
        OcrAndUploadTaskModel ocrAndUploadTaskModel = new OcrAndUploadTaskModel(obj, oCRRequestModel, str);
        SnapReceiptService.Companion companion = SnapReceiptService.Companion;
        SnapReceiptService.Companion.getMax(this, ocrAndUploadTaskModel);
        Intent putExtra = new Intent().putExtra(KEY_OCR_RESULT_MODEL, new OCRResultModel.Builder().getMax());
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .pu…tModel.Builder().build())");
        setResult(-1, putExtra);
        finish();
    }

    public final void showBottomPrompt() {
        BottomSheetPromptView bottomSheetPromptView = (BottomSheetPromptView) _$_findCachedViewById(resetInternal.setMax.IsOverlapping);
        if (bottomSheetPromptView != null) {
            bottomSheetPromptView.show();
        }
    }

    public final void hideBottomPrompt() {
        BottomSheetPromptView bottomSheetPromptView = (BottomSheetPromptView) _$_findCachedViewById(resetInternal.setMax.IsOverlapping);
        if (bottomSheetPromptView != null) {
            bottomSheetPromptView.hide();
        }
    }

    public final void showProgress() {
        showLoading$default(this, (String) null, 1, (Object) null);
    }

    public final void dismissProgress() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1028244398, oncanceled);
            onCancelLoad.getMin(1028244398, oncanceled);
        }
        setMin();
    }

    public final void onError(@Nullable String str) {
        showToast(str);
        finish();
    }

    public final void onFailConvertBitmap() {
        onError(getString(R.string.fail_convert_bitmap));
    }

    public final void onFilePathNull() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(986319552, oncanceled);
            onCancelLoad.getMin(986319552, oncanceled);
        }
        onError(getString(R.string.file_path_null));
    }

    public final void closePage() {
        onBackPressed();
    }

    static /* synthetic */ void showLoading$default(OCRPreviewImageActivity oCRPreviewImageActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        oCRPreviewImageActivity.getMax(str);
    }

    /* access modifiers changed from: private */
    public final void getMax(String str) {
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
        if (logoProgressView != null) {
            logoProgressView.setVisibility(0);
            logoProgressView.startRefresh();
        }
        if (str != null) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getHorizontalMargins);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_progress");
            textView.setVisibility(0);
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getHorizontalMargins);
            Intrinsics.checkNotNullExpressionValue(textView2, "tv_progress");
            textView2.setText(str);
        }
    }

    /* access modifiers changed from: private */
    public final void setMin() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1048280955, oncanceled);
            onCancelLoad.getMin(1048280955, oncanceled);
        }
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
        if (logoProgressView != null) {
            logoProgressView.stopRefresh();
            logoProgressView.setVisibility(8);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getHorizontalMargins);
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/ocr/views/OCRPreviewImageActivity$Companion;", "", "()V", "KEY_OCR_RESULT_MODEL", "", "OCR_PREVIEW_IMAGE_REQUEST_CODE", "", "pictureResult", "Lcom/otaliastudios/cameraview/PictureResult;", "generateIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "openOCRPreviewImage", "", "activity", "Landroid/app/Activity;", "setPictureResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }

        @JvmStatic
        public static void setMax(@NotNull calculateDtToFit calculatedttofit) {
            Intrinsics.checkNotNullParameter(calculatedttofit, "pictureResult");
            OCRPreviewImageActivity.setMax = calculatedttofit;
        }

        @JvmStatic
        @NotNull
        public static Intent setMin(@NotNull Context context, @NotNull calculateDtToFit calculatedttofit, @NotNull OCRRequestModel oCRRequestModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(calculatedttofit, "pictureResult");
            Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
            Intrinsics.checkNotNullParameter(calculatedttofit, "pictureResult");
            OCRPreviewImageActivity.setMax = calculatedttofit;
            Intent intent = new Intent(context, OCRPreviewImageActivity.class);
            intent.putExtra(OCRCameraActivity.OCR_REQUEST_MODEL_KEY, oCRRequestModel);
            return intent;
        }

        @JvmStatic
        public static void length(@NotNull Activity activity, @NotNull calculateDtToFit calculatedttofit, @NotNull OCRRequestModel oCRRequestModel) {
            Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
            Intrinsics.checkNotNullParameter(calculatedttofit, "pictureResult");
            Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
            activity.startActivityForResult(setMin(activity, calculatedttofit, oCRRequestModel), OCRPreviewImageActivity.OCR_PREVIEW_IMAGE_REQUEST_CODE);
        }
    }

    public final void initComponent() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1136465360, oncanceled);
            onCancelLoad.getMin(1136465360, oncanceled);
        }
        getResourceHeaderMap.getMax getmax = new getResourceHeaderMap.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.getMin = applicationComponent;
            getmax.setMin = new OCRPreviewImageModule(this);
            getmax.setMax = new PreprocessingAndOcrModule(new OCRPreviewImageActivity$initComponent$1(this));
            stopIgnoring.setMin(getmax.setMin, OCRPreviewImageModule.class);
            stopIgnoring.setMin(getmax.setMax, PreprocessingAndOcrModule.class);
            stopIgnoring.setMin(getmax.getMin, PrepareException.AnonymousClass1.class);
            new getResourceHeaderMap(getmax.setMin, getmax.setMax, getmax.getMin, (byte) 0).setMax(this);
            return;
        }
        throw null;
    }

    public final void onSuccessConvertImage(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ((ZoomableImageView) _$_findCachedViewById(resetInternal.setMax.setIcon)).setImageBitmap(bitmap);
        showBottomPrompt();
    }
}
