package id.dana.ocr.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.otaliastudios.cameraview.controls.Flash;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.OCRCameraModule;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import id.dana.ocr.OCRCameraContract;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import id.dana.ocr.views.OCRPreviewImageActivity;
import id.dana.richview.LogoProgressView;
import id.dana.richview.camera.DanaCameraView;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import java.util.ArrayList;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.calculateDtToFit;
import o.cancelAll;
import o.dispatchOnCancelled;
import o.getParseLock;
import o.getSelectedIndex;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0016H\u0014J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020 H\u0002J\n\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0016J\u0014\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0001\u0010,\u001a\u00020\u001eH\u0002J\n\u0010-\u001a\u0004\u0018\u00010+H\u0002J\b\u0010.\u001a\u00020\u0016H\u0016J\u0006\u0010/\u001a\u00020\u0016J\u0006\u00100\u001a\u00020\u0016J\"\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u00103\u001a\u00020\u0016H\u0016J\u0012\u00104\u001a\u00020\u00162\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020\u00162\b\u00108\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u00109\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J+\u0010:\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u001e2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0<2\u0006\u0010=\u001a\u00020>H\u0016¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\u0016H\u0002J\u0018\u0010A\u001a\u00020\u00162\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00110GH\u0002J\b\u0010H\u001a\u00020\u0016H\u0016J\b\u0010I\u001a\u00020\u0016H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006K"}, d2 = {"Lid/dana/ocr/views/OCRCameraActivity;", "Lid/dana/base/BaseActivity;", "Lid/dana/ocr/OCRCameraContract$View;", "()V", "ocrCameraPresenter", "Lid/dana/ocr/OCRCameraContract$Presenter;", "getOcrCameraPresenter", "()Lid/dana/ocr/OCRCameraContract$Presenter;", "setOcrCameraPresenter", "(Lid/dana/ocr/OCRCameraContract$Presenter;)V", "onBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getOnBoardingPresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setOnBoardingPresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "addOnBoardingContentEnterPin", "Lid/dana/usereducation/model/ContentOnBoardingModel;", "addOnBoardingContentSaveCards", "addOnBoardingContentSecuredTrx", "addOnBoardingContentSendMoney", "adjustTorchIcon", "", "capturePicture", "capturing", "closeCameraWithErrorCode", "errorCode", "", "composeResultAndFinishActivity", "resultCode", "", "data", "Landroid/content/Intent;", "configToolbar", "createOnBoardingModel", "Lid/dana/usereducation/model/OnBoardingModel;", "dismissProgress", "generateGeneralErrorCodeIntent", "getBottomOnBoardingModule", "Lid/dana/di/modules/BottomSheetOnBoardingModule;", "getIvFlashRes", "getLayout", "getResourceDrawable", "Landroid/graphics/drawable/Drawable;", "res", "getTorchIconBackground", "init", "initComponent", "initViews", "onActivityResult", "requestCode", "onBackPressed", "onClickLeftMenuButton", "view", "Landroid/view/View;", "onError", "errorMessage", "onFailure", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openBottomSheetOnBoardingViewList", "openPreviewPage", "pictureResult", "Lcom/otaliastudios/cameraview/PictureResult;", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "setContentsOnBoarding", "Ljava/util/ArrayList;", "showProgress", "torchToggle", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRCameraActivity extends BaseActivity implements OCRCameraContract.View {
    @NotNull
    public static final Companion Companion = new Companion((byte) 0);
    public static final int OCR_CAMERA_REQUEST_CODE = 4103;
    @NotNull
    public static final String OCR_REQUEST_MODEL_KEY = "OCR_REQUEST_MODEL_KEY";
    @Inject
    public OCRCameraContract.Presenter ocrCameraPresenter;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;
    private HashMap setMax;

    @JvmStatic
    @NotNull
    public static final Intent generateIntent(@NotNull Context context, @NotNull OCRRequestModel oCRRequestModel) {
        return Companion.length(context, oCRRequestModel);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(1857652800, oncanceled);
            onCancelLoad.getMin(1857652800, oncanceled);
        }
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void configToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-363094262, oncanceled);
            onCancelLoad.getMin(-363094262, oncanceled);
        }
    }

    public final int getLayout() {
        return R.layout.activity_camera;
    }

    @NotNull
    public final OCRCameraContract.Presenter getOcrCameraPresenter() {
        OCRCameraContract.Presenter presenter = this.ocrCameraPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrCameraPresenter");
        }
        return presenter;
    }

    public final void setOcrCameraPresenter(@NotNull OCRCameraContract.Presenter presenter) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-632923882, oncanceled);
            onCancelLoad.getMin(-632923882, oncanceled);
        }
        Intrinsics.checkNotNullParameter(presenter, "<set-?>");
        this.ocrCameraPresenter = presenter;
    }

    @NotNull
    public final getSelectedIndex.length getOnBoardingPresenter() {
        getSelectedIndex.length length2 = this.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        return length2;
    }

    public final void setOnBoardingPresenter(@NotNull getSelectedIndex.length length2) {
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.onBoardingPresenter = length2;
    }

    public final void init() {
        initComponent();
        onDelete.getMin[] getminArr = new onDelete.getMin[1];
        OCRCameraContract.Presenter presenter = this.ocrCameraPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrCameraPresenter");
        }
        getminArr[0] = presenter;
        registerPresenter(getminArr);
        initViews();
        getSelectedIndex.length length2 = this.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        length2.setMin(BottomSheetOnBoardingScenario.SNAP_RECEIPT);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2;
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1685772535, oncanceled);
            onCancelLoad.getMin(-1685772535, oncanceled);
        }
        if (4626 == i && -1 == i2) {
            int max2 = dispatchOnCancelled.getMax(i2);
            if (i2 != max2) {
                onCanceled oncanceled2 = new onCanceled(i2, max2, 16);
                onCancelLoad.setMax(551232271, oncanceled2);
                onCancelLoad.getMin(551232271, oncanceled2);
            }
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
                onCanceled oncanceled3 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(551232271, oncanceled3);
                onCancelLoad.getMin(551232271, oncanceled3);
            }
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra(OCRPreviewImageActivity.KEY_OCR_RESULT_MODEL, new OCRResultModel.Builder("001").getMax());
            } else {
                intent2 = intent;
            }
            setResult(i2, intent2);
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onFailure(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        setMin(str);
    }

    public final void onBackPressed() {
        OCRCameraContract.Presenter presenter = this.ocrCameraPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrCameraPresenter");
        }
        presenter.getMax();
    }

    public final void capturePicture() {
        ((DanaCameraView) _$_findCachedViewById(resetInternal.setMax.evictAll)).takePicture();
    }

    public final void openPreviewPage(@NotNull calculateDtToFit calculatedttofit, @NotNull OCRRequestModel oCRRequestModel) {
        Intrinsics.checkNotNullParameter(calculatedttofit, "pictureResult");
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        OCRPreviewImageActivity.Companion companion = OCRPreviewImageActivity.Companion;
        OCRPreviewImageActivity.Companion.length(this, calculatedttofit, oCRRequestModel);
    }

    public final void showProgress() {
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
        if (logoProgressView != null) {
            logoProgressView.setVisibility(0);
            logoProgressView.startRefresh();
        }
    }

    public final void dismissProgress() {
        LogoProgressView logoProgressView = (LogoProgressView) _$_findCachedViewById(resetInternal.setMax.setActionBarVisibilityCallback);
        if (logoProgressView != null) {
            logoProgressView.setVisibility(8);
            logoProgressView.startRefresh();
        }
    }

    public final void onError(@Nullable String str) {
        showToast(str);
    }

    public final void onClickLeftMenuButton(@Nullable View view) {
        OCRCameraContract.Presenter presenter = this.ocrCameraPresenter;
        if (presenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ocrCameraPresenter");
        }
        presenter.getMax();
    }

    public final void initComponent() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1427769866 == (max = dispatchOnCancelled.getMax(applicationContext, -1427769866)))) {
            onCanceled oncanceled = new onCanceled(-1427769866, max, 512);
            onCancelLoad.setMax(-1427769866, oncanceled);
            onCancelLoad.getMin(-1427769866, oncanceled);
        }
        OCRRequestModel oCRRequestModel = (OCRRequestModel) getIntent().getParcelableExtra(OCR_REQUEST_MODEL_KEY);
        getParseLock.setMin setmin = new getParseLock.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.setMin = applicationComponent;
            setmin.getMax = new OCRCameraModule(this, oCRRequestModel);
            setmin.getMin = new BottomSheetOnBoardingModule(new OCRCameraActivity$getBottomOnBoardingModule$1(this));
            stopIgnoring.setMin(setmin.getMax, OCRCameraModule.class);
            stopIgnoring.setMin(setmin.getMin, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(setmin.setMin, PrepareException.AnonymousClass1.class);
            new getParseLock(setmin.getMax, setmin.getMin, setmin.setMin, (byte) 0).getMax(this);
            return;
        }
        throw null;
    }

    public final void initViews() {
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
        ((TextView) _$_findCachedViewById(resetInternal.setMax.setNegativeButton)).setOnClickListener(new getMin(this));
        ((Button) _$_findCachedViewById(resetInternal.setMax.onPlaybackStateChanged)).setOnClickListener(new setMin(this));
        ((ImageView) _$_findCachedViewById(resetInternal.setMax.setListSelectionHidden)).setOnClickListener(new length(this));
        ((DanaCameraView) _$_findCachedViewById(resetInternal.setMax.evictAll)).setDanaCameraListener(new OCRCameraActivity$initViews$4(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ OCRCameraActivity setMin;

        getMin(OCRCameraActivity oCRCameraActivity) {
            this.setMin = oCRCameraActivity;
        }

        public final void onClick(View view) {
            OCRCameraActivity.access$openBottomSheetOnBoardingViewList(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ OCRCameraActivity getMax;

        setMin(OCRCameraActivity oCRCameraActivity) {
            this.getMax = oCRCameraActivity;
        }

        public final void onClick(View view) {
            OCRCameraActivity.access$capturing(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ OCRCameraActivity getMax;

        length(OCRCameraActivity oCRCameraActivity) {
            this.getMax = oCRCameraActivity;
        }

        public final void onClick(View view) {
            OCRCameraActivity.access$torchToggle(this.getMax);
        }
    }

    private final Drawable getMax(@DrawableRes int i) {
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(135160470, oncanceled);
            onCancelLoad.getMin(135160470, oncanceled);
        }
        return cancelAll.getMin(this, i);
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (((DanaCameraView) _$_findCachedViewById(resetInternal.setMax.evictAll)).hasPermissionsResult(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: private */
    public final void setMin(String str) {
        Intent intent = new Intent();
        intent.putExtra(OCRPreviewImageActivity.KEY_OCR_RESULT_MODEL, new OCRResultModel.Builder(str).getMax());
        setResult(0, intent);
        finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/ocr/views/OCRCameraActivity$Companion;", "", "()V", "OCR_CAMERA_REQUEST_CODE", "", "OCR_REQUEST_MODEL_KEY", "", "generateIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "openOCRCamera", "", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent length(@NotNull Context context, @NotNull OCRRequestModel oCRRequestModel) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
            Intent intent = new Intent(context, OCRCameraActivity.class);
            intent.putExtra(OCRCameraActivity.OCR_REQUEST_MODEL_KEY, oCRRequestModel);
            return intent;
        }
    }

    public static final /* synthetic */ void access$openBottomSheetOnBoardingViewList(OCRCameraActivity oCRCameraActivity) {
        int length2;
        int min;
        int max;
        int length3;
        BottomSheetHelpActivity.getMin getmin = BottomSheetHelpActivity.Companion;
        Context context = oCRCameraActivity;
        String string = oCRCameraActivity.getString(R.string.receipt_photo_intructions);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.receipt_photo_intructions)");
        Context baseContext = oCRCameraActivity.getBaseContext();
        Context context2 = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1488458994, oncanceled);
            onCancelLoad.getMin(-1488458994, oncanceled);
        }
        ArrayList arrayList = new ArrayList();
        String string2 = oCRCameraActivity.getString(R.string.bottom_on_boarding_subtitle_snap_receipt_first);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.botto…title_snap_receipt_first)");
        String string3 = oCRCameraActivity.getString(R.string.bottom_on_boarding_body_snap_receipt_first);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.botto…_body_snap_receipt_first)");
        arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_clear_photo, string2, string3));
        Context baseContext2 = oCRCameraActivity.getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 505484827 == (max = dispatchOnCancelled.getMax(applicationContext2, 505484827)))) {
            onCanceled oncanceled2 = new onCanceled(505484827, max, 512);
            onCancelLoad.setMax(505484827, oncanceled2);
            onCancelLoad.getMin(505484827, oncanceled2);
        }
        Context baseContext3 = oCRCameraActivity.getBaseContext();
        if (baseContext3 != null) {
            context2 = baseContext3.getApplicationContext();
        }
        if (!(context2 == null || (length2 = context2.fileList().length) == (min = dispatchOnCancelled.getMin(context2, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(505484827, oncanceled3);
            onCancelLoad.getMin(505484827, oncanceled3);
        }
        String string4 = oCRCameraActivity.getString(R.string.bottom_on_boarding_subtitle_snap_receipt_second);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.botto…itle_snap_receipt_second)");
        String string5 = oCRCameraActivity.getString(R.string.bottom_on_boarding_body_snap_receipt_second);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.botto…body_snap_receipt_second)");
        arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_transaction_time, string4, string5));
        String string6 = oCRCameraActivity.getString(R.string.bottom_on_boarding_subtitle_snap_receipt_third);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.botto…title_snap_receipt_third)");
        String string7 = oCRCameraActivity.getString(R.string.bottom_on_boarding_body_snap_receipt_third);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.botto…_body_snap_receipt_third)");
        arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_point_amount, string6, string7));
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(706820414, oncanceled4);
            onCancelLoad.getMin(706820414, oncanceled4);
        }
        String string8 = oCRCameraActivity.getString(R.string.bottom_on_boarding_subtitle_snap_receipt_fourth);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.botto…itle_snap_receipt_fourth)");
        String string9 = oCRCameraActivity.getString(R.string.bottom_on_boarding_body_snap_receipt_fourth);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.botto…body_snap_receipt_fourth)");
        arrayList.add(new ContentOnBoardingModel((int) R.drawable.ic_claim_limit, string8, string9));
        oCRCameraActivity.startActivity(BottomSheetHelpActivity.getMin.length(context, new OnBoardingModel(string, BottomSheetType.LIST, arrayList, BottomSheetOnBoardingScenario.SNAP_RECEIPT), true));
    }

    public static final /* synthetic */ void access$capturing(OCRCameraActivity oCRCameraActivity) {
        if (!((DanaCameraView) oCRCameraActivity._$_findCachedViewById(resetInternal.setMax.evictAll)).isTakingPicture()) {
            OCRCameraContract.Presenter presenter = oCRCameraActivity.ocrCameraPresenter;
            if (presenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ocrCameraPresenter");
            }
            presenter.getMin();
        }
    }

    public static final /* synthetic */ void access$torchToggle(OCRCameraActivity oCRCameraActivity) {
        Drawable drawable;
        ((DanaCameraView) oCRCameraActivity._$_findCachedViewById(resetInternal.setMax.evictAll)).toggleTorch();
        if (((ImageView) oCRCameraActivity._$_findCachedViewById(resetInternal.setMax.setListSelectionHidden)) != null) {
            if (Flash.OFF == ((DanaCameraView) oCRCameraActivity._$_findCachedViewById(resetInternal.setMax.evictAll)).getFlash()) {
                drawable = oCRCameraActivity.getMax(R.drawable.bg_circle_transparent);
            } else {
                drawable = oCRCameraActivity.getMax(R.drawable.bg_circle_white_transparent);
            }
            if (drawable != null) {
                ImageView imageView = (ImageView) oCRCameraActivity._$_findCachedViewById(resetInternal.setMax.setListSelectionHidden);
                Intrinsics.checkNotNullExpressionValue(imageView, "torch_button");
                imageView.setBackground(drawable);
            }
            ((ImageView) oCRCameraActivity._$_findCachedViewById(resetInternal.setMax.setListSelectionHidden)).setImageResource(Flash.OFF == ((DanaCameraView) oCRCameraActivity._$_findCachedViewById(resetInternal.setMax.evictAll)).getFlash() ? R.drawable.ic_flash_pay : R.drawable.ic_flash_pay_active);
        }
    }

    @JvmStatic
    public static final void openOCRCamera(@NotNull Activity activity, @NotNull OCRRequestModel oCRRequestModel) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        activity.startActivityForResult(Companion.length(activity, oCRRequestModel), OCR_CAMERA_REQUEST_CODE);
    }
}
