package id.dana.scanner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.HybridBinarizer;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.DecodeQrImageModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.danah5.DanaH5;
import id.dana.data.base.NetworkException;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.domain.qrbarcode.DecodeQrBizType;
import id.dana.home.HomeTabActivity;
import id.dana.model.ThirdPartyService;
import id.dana.richview.CustomDecoratedBarcodeView;
import id.dana.richview.EllipseTextView;
import id.dana.scanner.handler.ScannerActionState;
import id.dana.scanner.handler.ScannerViewType;
import id.dana.scanner.handler.nativepages.ScannerSceneType;
import id.dana.splitbill.view.SplitBillDetailsActivity;
import id.dana.tracker.TrackerKey;
import id.dana.usereducation.BottomSheetHelpActivity;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import id.dana.usereducation.constant.BottomSheetType;
import id.dana.usereducation.model.ContentOnBoardingModel;
import id.dana.usereducation.model.OnBoardingModel;
import id.dana.util.media.MimeType;
import id.dana.utils.permission.ManifestPermission;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.ArcMotion;
import o.BindView;
import o.BitmapLock;
import o.ConfirmPopup;
import o.DecodeFilter;
import o.DecodeOptions;
import o.DecodeResult;
import o.DecodeWrapper;
import o.FtsOptions$Order;
import o.GriverManifest;
import o.ITrustedWebActivityCallback;
import o.JavaBlurProcess;
import o.PackageParseUtils;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PhotoView;
import o.PrepareException;
import o.R;
import o.RedDotDrawable;
import o.RedDotManager;
import o.SecuritySignature;
import o.Workflow;
import o.access$1402;
import o.callback;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dismissBadgeView;
import o.dispatchOnCancelled;
import o.fillPageCommonInfo;
import o.genTextSelector;
import o.getBigDecimal;
import o.getDuration;
import o.getMaxTextureSize;
import o.getPhotoRect;
import o.getRunningAnimators;
import o.getSelectedIndex;
import o.getUseSecurityGuard;
import o.handle;
import o.handleBitmap;
import o.hasCornerMarking;
import o.hideProgress;
import o.initRect;
import o.layoutChildWithAnchor;
import o.name;
import o.onCancelLoad;
import o.onCanceled;
import o.onNext;
import o.parseBehavior;
import o.performLoadChildren;
import o.performLoadItem;
import o.postWebViewMessage;
import o.removeStateDidChangeHandler;
import o.setCancelOnTouchOutside$core;
import o.setCancelText;
import o.setContentViewAfter;
import o.setFavoriteBtnVisibility;
import o.setH5MenuList;
import o.setH5Page;
import o.setHeaderViewHeight;
import o.setRefreshAnimation;
import o.setRefreshOffset;
import o.setStateOn;
import o.setUseAmcsLite;
import o.setUseSecurityGuard;
import o.showSoftInput;
import o.stopIgnoring;
import o.style;
import o.updateActionSheetContent;
import o.updateCornerMarking;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ValidFragment"})
public class ScannerFragment extends FtsOptions$Order {
    private static final int setMin = ((int) (Resources.getSystem().getDisplayMetrics().density * 24.0f));
    private List<ContentOnBoardingModel> FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public String Grayscale$Algorithm;
    /* access modifiers changed from: private */
    public String IsOverlapping;
    private final ITrustedWebActivityCallback<Intent> Mean$Arithmetic = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new handleBitmap(this));
    @BindView(2131361931)
    protected CustomDecoratedBarcodeView barcodeView;
    @Inject
    public getSelectedIndex.length bottomSheetOnBoardingPresenter;
    @Inject
    public callback.setMax decodePresenter;
    private getBigDecimal equals;
    @Inject
    public getRunningAnimators.setMax featurePresenter;
    /* access modifiers changed from: package-private */
    public String getMin;
    @Inject
    public onNext.setMin globalNetworkPresenter;
    @Inject
    public GriverManifest.AnonymousClass22.getMin h5EventPresenter;
    private JavaBlurProcess.BlurTask hashCode;
    @Nullable
    @BindView(2131363152)
    ImageView icImageFg;
    @BindView(2131363624)
    ImageView imgScanGallery;
    /* access modifiers changed from: private */
    public PhotoView.PhotoInter invoke;
    /* access modifiers changed from: private */
    public boolean invokeSuspend;
    /* access modifiers changed from: private */
    public boolean isInside;
    private boolean onNavigationEvent = false;
    @Inject
    public PdfImageSource.setMin playStoreReviewPresenter;
    @Inject
    public R.id.getMax presenter;
    @Inject
    public getDuration.length readDeepLinkPropertiesPresenter;
    @Inject
    public BindView.setMin restoreUrlPresenter;
    @butterknife.BindView(2131364414)
    RelativeLayout rlHelpScanQr;
    @butterknife.BindView(2131364431)
    RelativeLayout rlScanGallery;
    @butterknife.BindView(2131364432)
    RelativeLayout rlScanner;
    @Inject
    public R.id.getMax scanQrPresenter;
    protected boolean setMax;
    @Inject
    public setH5Page timerUtil;
    private boolean toDoubleRange;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    private setStateOn toIntRange;
    private long toString;
    @butterknife.BindView(2131362836)
    EllipseTextView tvNoteScanner;
    private final ITrustedWebActivityCallback<Intent> valueOf = registerForActivityResult(new ITrustedWebActivityCallback.Stub.Proxy.getMin(), new handle(this));
    private long values;

    public int setMin() {
        return id.dana.R.layout.fragment_scanner;
    }

    public static ScannerFragment values() {
        return new ScannerFragment();
    }

    /* access modifiers changed from: protected */
    @OnClick({2131364418})
    public void setTorch() {
        if (this.setMax) {
            this.setMax = false;
            this.barcodeView.setTorchOff();
            return;
        }
        this.setMax = true;
        this.barcodeView.setTorchOn();
    }

    /* access modifiers changed from: protected */
    @OnClick({2131364431})
    public void openGallery() {
        this.Mean$Arithmetic.getMin(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI).setType(MimeType.IMAGE_ALL), (name) null);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131365217})
    public void doneScan() {
        getMax();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.toIntRange;
        if (setstateon == null || !setstateon.getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: private */
    public void FastBitmap$CoordinateSystem() {
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.barcodeView;
        if (!(customDecoratedBarcodeView == null || customDecoratedBarcodeView.getDecoratedBarcodeView() == null)) {
            this.barcodeView.getDecoratedBarcodeView().setStatusText("");
        }
        if (this.hashCode == null) {
            this.hashCode = new JavaBlurProcess.BlurTask();
        }
        if (this.values == 0) {
            this.values = System.currentTimeMillis();
        }
        CustomDecoratedBarcodeView customDecoratedBarcodeView2 = this.barcodeView;
        if (!(customDecoratedBarcodeView2 == null || customDecoratedBarcodeView2.getDecoratedBarcodeView() == null)) {
            this.barcodeView.getDecoratedBarcodeView().decodeSingle(new performLoadItem() {
                public final void getMin(List<ResultPoint> list) {
                }

                public final void getMax(performLoadChildren performloadchildren) {
                    ScannerFragment.this.hashCode.setMax = TrackerKey.ScanQRSourceType.QR_SOURCE_SCAN;
                    ScannerFragment.this.getMax(performloadchildren.getMin(), ScannerFragment.this.getMin);
                }
            });
        }
        if (getContext() != null) {
            if (this.toIntRange == null) {
                setStateOn.getMin getmin = new setStateOn.getMin((Fragment) this);
                getmin.length.add("android.permission.CAMERA");
                getmin.getMax = new setStateOn.length() {
                    public final void getMin(setStateOn.setMin setmin) {
                        ScannerFragment.this.equals();
                    }

                    public final void setMin(setStateOn.setMin setmin) {
                        ScannerFragment.this.getMax();
                    }
                };
                this.toIntRange = new setStateOn(getmin, (byte) 0);
            }
            this.toIntRange.setMin();
        }
    }

    /* access modifiers changed from: private */
    public void getMin(boolean z) {
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.barcodeView;
        if (customDecoratedBarcodeView == null) {
            return;
        }
        if (z) {
            customDecoratedBarcodeView.setVisibility(8);
            this.imgScanGallery.setVisibility(0);
            return;
        }
        customDecoratedBarcodeView.setVisibility(0);
        this.imgScanGallery.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void getMax(String str, String str2) {
        if (!this.toFloatRange) {
            if (this.hashCode == null) {
                this.hashCode = new JavaBlurProcess.BlurTask();
            }
            this.hashCode.length = System.currentTimeMillis() - this.values;
            this.hashCode.getMin = str;
            this.toString = System.currentTimeMillis();
            if (str != null && str.trim().contains("https://link.dana.id/")) {
                getMin(false);
                this.readDeepLinkPropertiesPresenter.setMax(setH5MenuList.setMax(str, str2));
                setMin(TrackerKey.SourceType.DEEP_LINK);
            } else if (ScannerSceneType.SCENE_QRIS_TOP_UP_KYB.equals(str2)) {
                this.scanQrPresenter.getMax(str, "Scan QR", str2);
            } else {
                this.scanQrPresenter.setMin(str, "Scan QR", str2);
            }
        }
    }

    private boolean toDoubleRange() {
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.barcodeView;
        return customDecoratedBarcodeView != null && customDecoratedBarcodeView.isBubbleQrisSupportedVisible();
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131364414})
    public void onHelpClicked() {
        convertDipToPx.length length = new convertDipToPx.length(getContext());
        length.getMax = TrackerKey.Event.SCAN_QR_HELP;
        length.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        ArrayList arrayList = new ArrayList();
        this.FastBitmap$CoordinateSystem = arrayList;
        getMin((List<ContentOnBoardingModel>) arrayList);
        startActivity(BottomSheetHelpActivity.createBottomSheetHelpIntent(getActivity(), new OnBoardingModel(getString(id.dana.R.string.bottom_on_boarding_title_scan), BottomSheetType.LIST, this.FastBitmap$CoordinateSystem, "scan_qr")));
    }

    public final boolean n_() {
        this.toDoubleRange = false;
        PhotoView.PhotoInter photoInter = this.invoke;
        if (photoInter != null) {
            photoInter.setMax();
        }
        return super.n_();
    }

    public void onResume() {
        super.onResume();
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.barcodeView;
        if (customDecoratedBarcodeView != null) {
            customDecoratedBarcodeView.pause();
            if (Mean$Arithmetic()) {
                FastBitmap$CoordinateSystem();
                this.barcodeView.resume();
                if (Grayscale$Algorithm()) {
                    length(getMin(ScannerActionState.ADD_PARTICIPANT), true);
                } else {
                    length(getMin(ScannerActionState.IDLE));
                }
            }
        }
    }

    public void onPause() {
        this.barcodeView.pause();
        super.onPause();
    }

    public final void o_() {
        if (getContext() != null) {
            this.toFloatRange = false;
            FastBitmap$CoordinateSystem();
            if (Mean$Arithmetic()) {
                length(getMin(ScannerActionState.IDLE));
            }
            super.o_();
        }
    }

    public final void IsOverlapping() {
        this.toFloatRange = false;
        if (this.setMax) {
            this.setMax = false;
            this.barcodeView.setTorchOff();
        }
        length(getMin(ScannerActionState.IDLE), false);
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.barcodeView;
        if (customDecoratedBarcodeView != null) {
            customDecoratedBarcodeView.pause();
        }
        super.IsOverlapping();
    }

    private boolean Mean$Arithmetic() {
        return getUserVisibleHint() && setStateOn.getMin(this.getMax, "android.permission.CAMERA");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMax(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1167020686: goto L_0x002a;
                case 141637776: goto L_0x0020;
                case 554049076: goto L_0x0016;
                case 923238916: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "MERCHANT_CODE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "PARKING_CODE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "USER_MERCHANT_CODE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "EMVCO_CODE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x003e
            if (r5 == r4) goto L_0x003e
            if (r5 == r3) goto L_0x003e
            if (r5 == r2) goto L_0x003e
            return r4
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.scanner.ScannerFragment.getMax(java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public void setMin(String str) {
        String str2;
        if (this.hashCode != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.toString;
            convertDipToPx.length length = new convertDipToPx.length(this.getMax.getApplicationContext());
            length.getMax = "Scan QR";
            convertDipToPx.length max = length.setMax(TrackerKey.ScanQRProperties.CAMERA_LIGHT_TURNED_ON, String.valueOf(this.setMax)).setMax(TrackerKey.ScanQRProperties.QR_RESULT_DURATION, String.valueOf(currentTimeMillis)).setMax("Source", DecodeWrapper.getMax()).setMax(TrackerKey.ScanQRProperties.QR_RESULT_ACTION, str);
            if (this.hashCode.setMax == null) {
                str2 = "";
            } else {
                str2 = this.hashCode.setMax;
            }
            convertDipToPx.length max2 = max.setMax(TrackerKey.ScanQRProperties.QR_SOURCE, str2).setMax(TrackerKey.ScanQRProperties.QR_DECODE_DURATION, String.valueOf(this.hashCode.length)).setMax(TrackerKey.ScanQRProperties.QR_DECODE_RESULT, this.hashCode.getMin).setMax(TrackerKey.ScanQRProperties.QR_DECODE_RESULT_TYPE, this.hashCode.setMin).setMax();
            max2.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max2, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            this.values = 0;
            this.toString = 0;
            this.hashCode = new JavaBlurProcess.BlurTask();
        }
    }

    /* access modifiers changed from: private */
    public void setMax(String str, boolean z) {
        length(str, true);
        if (z) {
            setFavoriteBtnVisibility length = setFavoriteBtnVisibility.length(1500, TimeUnit.MILLISECONDS);
            hasCornerMarking length2 = hideProgress.length();
            setRefreshAnimation.getMax(length2, "scheduler is null");
            dismissBadgeView setrefreshoffset = new setRefreshOffset(length, length2);
            RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
            if (redDotDrawable != null) {
                setrefreshoffset = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setrefreshoffset);
            }
            hasCornerMarking length3 = hideProgress.length();
            setRefreshAnimation.getMax(length3, "scheduler is null");
            setFavoriteBtnVisibility setheaderviewheight = new setHeaderViewHeight(setrefreshoffset, length3);
            RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable2 = SecuritySignature.valueOf;
            if (redDotDrawable2 != null) {
                setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable2, setheaderviewheight);
            }
            DecodeOptions.Mode mode = new DecodeOptions.Mode(this);
            RedDotManager length4 = Functions.length();
            RedDotManager length5 = Functions.length();
            removeStateDidChangeHandler removestatedidchangehandler = Functions.length;
            length(setheaderviewheight.getMax(length4, length5, mode, removestatedidchangehandler, removestatedidchangehandler, Functions.length).v_());
        }
    }

    /* access modifiers changed from: private */
    public void invokeSuspend() {
        if ((getActivity() instanceof ScannerActivity) && this.onNavigationEvent && getActivity() != null) {
            getActivity().finish();
        }
    }

    private boolean Grayscale$Algorithm() {
        return !TextUtils.isEmpty(this.Grayscale$Algorithm) && "split_bill".equals(this.Grayscale$Algorithm);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMin(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1879307469: goto L_0x0034;
                case -1145597085: goto L_0x002a;
                case -1109161484: goto L_0x0020;
                case -755483303: goto L_0x0016;
                case 2274292: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "Idle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 4
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "Send to self"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "Add Participant"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "Invalid QR Code"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 3
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "Processing"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x0065
            if (r0 == r4) goto L_0x005d
            if (r0 == r3) goto L_0x0055
            if (r0 == r2) goto L_0x004d
            if (r0 == r1) goto L_0x004a
            return r6
        L_0x004a:
            java.lang.String r6 = ""
            return r6
        L_0x004d:
            r6 = 2131887632(0x7f120610, float:1.9409877E38)
            java.lang.String r6 = r5.getString(r6)
            return r6
        L_0x0055:
            r6 = 2131888655(0x7f120a0f, float:1.9411951E38)
            java.lang.String r6 = r5.getString(r6)
            return r6
        L_0x005d:
            r6 = 2131888355(0x7f1208e3, float:1.9411343E38)
            java.lang.String r6 = r5.getString(r6)
            return r6
        L_0x0065:
            r6 = 2131888737(0x7f120a61, float:1.9412118E38)
            java.lang.String r6 = r5.getString(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.scanner.ScannerFragment.getMin(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void getMax() {
        if (this.setMax) {
            this.setMax = false;
            this.barcodeView.setTorchOff();
        }
        this.toFloatRange = false;
        this.getMax.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void equals() {
        if (!this.toDoubleRange) {
            if (getActivity() instanceof HomeTabActivity) {
                ((HomeTabActivity) getActivity()).setSwipeable(false);
            }
            this.toDoubleRange = true;
            this.bottomSheetOnBoardingPresenter.setMin("scan_qr");
        }
        this.barcodeView.resume();
    }

    /* access modifiers changed from: private */
    public void length(String str, boolean z) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1845456310, oncanceled);
            onCancelLoad.getMin(1845456310, oncanceled);
        }
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.barcodeView;
        if (customDecoratedBarcodeView != null) {
            customDecoratedBarcodeView.clearBubbleView();
            this.barcodeView.setStatusText(str);
            this.barcodeView.setPlaceholderShow(false);
        }
        if (z) {
            this.timerUtil.getMax(3, new BitmapLock.ImageHandler(this));
            return;
        }
        setH5Page seth5page = this.timerUtil;
        if (seth5page.setMin != null && !seth5page.setMin.isDisposed()) {
            seth5page.setMin.dispose();
        }
        CustomDecoratedBarcodeView customDecoratedBarcodeView2 = this.barcodeView;
        if (customDecoratedBarcodeView2 != null) {
            customDecoratedBarcodeView2.setVisibilityToastText(true);
        }
    }

    private void length(String str) {
        CustomDecoratedBarcodeView customDecoratedBarcodeView = this.barcodeView;
        if (customDecoratedBarcodeView != null) {
            customDecoratedBarcodeView.clearBubbleView();
            this.barcodeView.setStatusText(str);
            this.barcodeView.setPlaceholderShow(true);
        }
        this.timerUtil.getMax(3, new BitmapLock.ImageHandler(this));
    }

    public void setMax() {
        PrepareException.AnonymousClass1 r4;
        if (this.equals != null) {
            this.equals = null;
        }
        PackageParseUtils.a.setMax setmax = new PackageParseUtils.a.setMax((byte) 0);
        if (this.getMax != null) {
            r4 = this.getMax.getApplicationComponent();
        } else {
            r4 = null;
        }
        if (r4 != null) {
            setmax.values = r4;
            setmax.equals = new CheckoutH5EventModule(new DecodeOptions.MinLenMode(this));
            setmax.toFloatRange = new ServicesModule((style.getMin) new style.getMin() {
                @JvmDefault
                public final void dismissProgress() {
                }

                @JvmDefault
                public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                    Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                }

                @JvmDefault
                public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                    Intrinsics.checkNotNullParameter(str, "authCode");
                }

                @JvmDefault
                public final void getMax(@NotNull List<ThirdPartyService> list) {
                    Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                }

                @JvmDefault
                public final void getMin(@NotNull List<ThirdPartyService> list) {
                    Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                }

                @JvmDefault
                public final void length() {
                }

                @JvmDefault
                public final void onError(@org.jetbrains.annotations.Nullable String str) {
                }

                @JvmDefault
                public final void setMax(@NotNull List<ThirdPartyService> list) {
                    Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                }

                @JvmDefault
                public final void setMax(boolean z) {
                }

                @JvmDefault
                public final void setMin() {
                }

                @JvmDefault
                public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                    Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                }

                @JvmDefault
                public final void setMin(@NotNull List<ThirdPartyService> list) {
                    Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
                }

                @JvmDefault
                public final void showProgress() {
                }
            });
            DeepLinkModule.setMin max = DeepLinkModule.getMax();
            max.getMax = getActivity();
            max.setMin = new ArcMotion() {
                public final void getMin(showSoftInput showsoftinput) {
                }

                public final void length(String str) {
                }

                public final void setMax() {
                    ScannerFragment.this.invokeSuspend();
                }
            };
            max.length = "Scan QR";
            setmax.setMax = new DeepLinkModule(max, (byte) 0);
            ScanQrModule.setMin max2 = ScanQrModule.getMax();
            max2.setMin = getActivity();
            max2.getMin = new R.id.length() {
                public final void setMax(fillPageCommonInfo fillpagecommoninfo) {
                    ScannerFragment.getMin(ScannerFragment.this, fillpagecommoninfo);
                }

                public final void getMax(fillPageCommonInfo fillpagecommoninfo) {
                    ScannerFragment.getMin(ScannerFragment.this, fillpagecommoninfo);
                }

                public final void setMin() {
                    ScannerFragment.this.setMin(TrackerKey.ScannerAction.ERROR_CODE_NOT_WHITE_LIST);
                }

                public final void getMin(String str) {
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    scannerFragment.setMax(scannerFragment.getMin(str), true);
                    ScannerFragment.this.setMin(TrackerKey.ScannerAction.ERROR_QR_BARCODE);
                }

                public final void getMax(String str) {
                    String unused = ScannerFragment.this.IsOverlapping = str;
                    ScannerFragment.isInside(ScannerFragment.this);
                    ScannerFragment.this.setMin(TrackerKey.ScannerAction.OPEN_H5_SCAN);
                }

                public final void length() {
                    ScannerFragment.this.getMax.startActivity(SplitBillDetailsActivity.createNonEligibleUserIntent(ScannerFragment.this.getContext()));
                    ScannerFragment.this.setMin(TrackerKey.ScannerAction.ERROR_NON_SPLITBILL_PAYER);
                }

                public final String setMax() {
                    return ScannerFragment.this.Grayscale$Algorithm;
                }

                public final void getMin() {
                    ScannerFragment.FastBitmap$CoordinateSystem(ScannerFragment.this);
                }

                public final void showProgress() {
                    boolean unused = ScannerFragment.this.toFloatRange = true;
                    if (ScannerFragment.this.barcodeView != null) {
                        ScannerFragment.this.barcodeView.pause();
                    }
                    ScannerFragment.toString(ScannerFragment.this);
                }

                public final void dismissProgress() {
                    ScannerFragment.hashCode(ScannerFragment.this);
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    scannerFragment.length(scannerFragment.getMin(ScannerActionState.IDLE), false);
                }

                public final void onError(String str) {
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    scannerFragment.setMax(scannerFragment.getMin(str), true);
                    ScannerFragment.this.setMin("Error");
                }

                public final void getMax() {
                    if ("split_bill".equals(ScannerFragment.this.Grayscale$Algorithm)) {
                        String max = ScannerFragment.this.getMin(ScannerActionState.INVALID_QR_CODE);
                        ScannerFragment scannerFragment = ScannerFragment.this;
                        scannerFragment.setMax(scannerFragment.getMin(max), true);
                        ScannerFragment.this.setMin(TrackerKey.ScannerAction.ERROR_QR_BARCODE);
                        ScannerFragment.this.getMin(false);
                        ScannerFragment.this.FastBitmap$CoordinateSystem();
                    } else {
                        ScannerFragment scannerFragment2 = ScannerFragment.this;
                        scannerFragment2.setMax(scannerFragment2.getMin(ScannerActionState.SEND_TO_SELF), true);
                    }
                    ScannerFragment.this.setMin(TrackerKey.ScannerAction.ERROR_SCAN_IT_SELF);
                }
            };
            max2.setMax = new setCancelOnTouchOutside$core() {
                public final void onContainerCreated(Bundle bundle) {
                }

                public final void onContainerDestroyed(Bundle bundle) {
                    ScannerFragment.this.h5EventPresenter.length();
                    if (ScannerFragment.this.isInside) {
                        ScannerFragment.this.playStoreReviewPresenter.length();
                    } else {
                        ScannerFragment.toIntRange(ScannerFragment.this);
                    }
                }
            };
            setmax.setMin = new ScanQrModule(max2, (byte) 0);
            RestoreUrlModule.setMin min = RestoreUrlModule.setMin();
            min.getMax = getActivity();
            setmax.getMin = new RestoreUrlModule(min, (byte) 0);
            FeatureModule.length length = FeatureModule.length();
            length.setMax = getActivity();
            length.getMax = new DecodeOptions.FitRectMode(this);
            setmax.length = new FeatureModule(length, (byte) 0);
            OauthModule.getMax min2 = OauthModule.setMin();
            min2.setMin = getActivity();
            setmax.toIntRange = new OauthModule(min2, (byte) 0);
            setmax.getMax = new DecodeQrImageModule(new callback.getMin() {
                public final void setMin(String str) {
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    scannerFragment.getMax(str, scannerFragment.getMin);
                }

                public final void showProgress() {
                    ScannerFragment.getMax(ScannerFragment.this, true);
                }

                public final void dismissProgress() {
                    ScannerFragment.getMax(ScannerFragment.this, false);
                }

                public final void onError(String str) {
                    ScannerFragment.getMax(ScannerFragment.this, false);
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    scannerFragment.setMax(scannerFragment.getMin(str), true);
                    ScannerFragment.this.setMin(TrackerKey.ScannerAction.DECODE_CODE_GALLERY_ERROR);
                }
            });
            setmax.IsOverlapping = new PlayStoreReviewModules(new PdfViewerActivity.PageAdapter(getActivity()) {
                public final void getMin(PdfViewerActivity pdfViewerActivity) {
                    super.getMin(pdfViewerActivity);
                    ScannerFragment.toIntRange(ScannerFragment.this);
                }
            });
            setmax.isInside = new BottomSheetOnBoardingModule(new getSelectedIndex.setMax() {
                public final void dismissProgress() {
                }

                public final void setMax(boolean z, @org.jetbrains.annotations.Nullable String str) {
                }

                public final void showProgress() {
                }

                public final void onGetBottomSheetOnBoardingAvailability(boolean z, String str) {
                    boolean unused = ScannerFragment.this.invokeSuspend = z;
                    if (z) {
                        ScannerFragment.equals(ScannerFragment.this);
                    } else {
                        ScannerFragment.toFloatRange(ScannerFragment.this);
                    }
                }

                public final void onError(String str) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(" onErrorGetBottomSheetOnBoardingAvailability: ");
                    updateActionSheetContent.exception(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString(), str);
                }
            });
            setmax.toDoubleRange = new GlobalNetworkModule(new Workflow() {
                public final void getMin(String str, final boolean z) {
                    DanaH5.startContainerFullUrl(str, new setCancelOnTouchOutside$core() {
                        public final void onContainerCreated(Bundle bundle) {
                        }

                        public final void onContainerDestroyed(Bundle bundle) {
                            ScannerFragment.this.globalNetworkPresenter.invokeSuspend();
                            ScannerFragment.this.globalNetworkPresenter.getMax(z);
                            ScannerFragment.this.getMin(false);
                            ScannerFragment.this.FastBitmap$CoordinateSystem();
                        }
                    });
                }

                public final void getMax() {
                    ScannerFragment.this.getMin(false);
                    ScannerFragment.this.FastBitmap$CoordinateSystem();
                    ((BaseActivity) ScannerFragment.this.getContext()).showToast(ScannerFragment.this.getString(id.dana.R.string.general_error_msg));
                }

                public final void length(Throwable th) {
                    String str;
                    ScannerFragment.this.getMin(false);
                    ScannerFragment.this.FastBitmap$CoordinateSystem();
                    Context context = ScannerFragment.this.getContext();
                    if (th instanceof NetworkException) {
                        str = ((NetworkException) th).getMessage();
                    } else {
                        str = context.getString(id.dana.R.string.general_error_msg);
                    }
                    ScannerFragment.this.getMax.showToast(str);
                }

                public final void setMax() {
                    ScannerFragment scannerFragment = ScannerFragment.this;
                    scannerFragment.setMax(scannerFragment.getMin(ScannerActionState.INVALID_QR_CODE));
                }

                public final void IsOverlapping() {
                    ScannerFragment.setMax(ScannerFragment.this);
                }

                public final void toFloatRange() {
                    ScannerFragment.this.getMax.showWarningDialog(ScannerFragment.this.getString(id.dana.R.string.cscanb_blacklist_warning_dialog));
                    ScannerFragment.this.FastBitmap$CoordinateSystem();
                }
            });
            stopIgnoring.setMin(setmax.setMin, ScanQrModule.class);
            stopIgnoring.setMin(setmax.getMax, DecodeQrImageModule.class);
            stopIgnoring.setMin(setmax.setMax, DeepLinkModule.class);
            stopIgnoring.setMin(setmax.getMin, RestoreUrlModule.class);
            stopIgnoring.setMin(setmax.length, FeatureModule.class);
            stopIgnoring.setMin(setmax.toIntRange, OauthModule.class);
            if (setmax.toFloatRange == null) {
                setmax.toFloatRange = new ServicesModule();
            }
            stopIgnoring.setMin(setmax.IsOverlapping, PlayStoreReviewModules.class);
            stopIgnoring.setMin(setmax.equals, CheckoutH5EventModule.class);
            stopIgnoring.setMin(setmax.isInside, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(setmax.toDoubleRange, GlobalNetworkModule.class);
            stopIgnoring.setMin(setmax.values, PrepareException.AnonymousClass1.class);
            PackageParseUtils.a aVar = new PackageParseUtils.a(setmax.setMin, setmax.getMax, setmax.setMax, setmax.getMin, setmax.length, setmax.toIntRange, setmax.toFloatRange, setmax.IsOverlapping, setmax.equals, setmax.isInside, setmax.toDoubleRange, setmax.values, (byte) 0);
            this.equals = aVar;
            aVar.getMax(this);
            getMin(this.scanQrPresenter, this.decodePresenter, this.readDeepLinkPropertiesPresenter, this.restoreUrlPresenter, this.playStoreReviewPresenter, this.featurePresenter, this.bottomSheetOnBoardingPresenter, this.globalNetworkPresenter);
            if (getActivity() instanceof ScannerActivity) {
                FastBitmap$CoordinateSystem();
                if (!(getActivity() == null || getActivity().getIntent() == null)) {
                    this.Grayscale$Algorithm = getActivity().getIntent().getStringExtra(ScannerActivity.FROM_VIEW_TYPE);
                    if (Grayscale$Algorithm()) {
                        length(getMin(ScannerActionState.ADD_PARTICIPANT), true);
                    }
                }
                try {
                    if (!(this.getMax.getIntent() == null || this.getMax.getIntent().getExtras() == null)) {
                        this.onNavigationEvent = this.getMax.getIntent().getBooleanExtra(ScannerActivity.CLOSE_AFTER_SCAN, false);
                    }
                } catch (Exception e) {
                    updateActionSheetContent.e(DanaLogConstants.TAG.SCANNER_FRAGMENT, e.getMessage());
                }
                this.getMin = this.getMax.getIntent().getStringExtra("scene");
            }
            this.values = System.currentTimeMillis();
            this.presenter.length();
            this.presenter.getMin();
            if (getPhotoRect.length().setMax != null && getContext() != null) {
                DecodeResult decodeResult = new DecodeResult(setContentViewAfter.length(getPhotoRect.length().setMax, getContext()));
                setFavoriteBtnVisibility length2 = setFavoriteBtnVisibility.length(1, TimeUnit.SECONDS);
                hasCornerMarking length3 = hideProgress.length();
                setRefreshAnimation.getMax(length3, "scheduler is null");
                dismissBadgeView setrefreshoffset = new setRefreshOffset(length2, length3);
                RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable = SecuritySignature.valueOf;
                if (redDotDrawable != null) {
                    setrefreshoffset = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable, setrefreshoffset);
                }
                hasCornerMarking length4 = hideProgress.length();
                setRefreshAnimation.getMax(length4, "scheduler is null");
                setFavoriteBtnVisibility setheaderviewheight = new setHeaderViewHeight(setrefreshoffset, length4);
                RedDotDrawable<? super setFavoriteBtnVisibility, ? extends setFavoriteBtnVisibility> redDotDrawable2 = SecuritySignature.valueOf;
                if (redDotDrawable2 != null) {
                    setheaderviewheight = (setFavoriteBtnVisibility) SecuritySignature.getMax(redDotDrawable2, setheaderviewheight);
                }
                DecodeFilter decodeFilter = new DecodeFilter(this, decodeResult);
                RedDotManager length5 = Functions.length();
                RedDotManager length6 = Functions.length();
                removeStateDidChangeHandler removestatedidchangehandler = Functions.length;
                length(setheaderviewheight.getMax(length5, length6, decodeFilter, removestatedidchangehandler, removestatedidchangehandler, Functions.length).v_());
                return;
            }
            return;
        }
        throw null;
    }

    private void getMin(List<ContentOnBoardingModel> list) {
        list.add(new ContentOnBoardingModel((int) id.dana.R.drawable.on_boarding_send_money, getString(id.dana.R.string.bottom_on_boarding_subtitle_scan_first), getString(id.dana.R.string.bottom_on_boarding_body_text_scan_first)));
        list.add(new ContentOnBoardingModel((int) id.dana.R.drawable.onboarding_easy_trx, getString(id.dana.R.string.bottom_on_boarding_subtitle_scan_second), getString(id.dana.R.string.bottom_on_boarding_body_text_scan_second)));
        list.add(new ContentOnBoardingModel((int) id.dana.R.drawable.on_boarding_qris, getString(id.dana.R.string.bottom_on_boarding_subtitle_scan_third), getString(id.dana.R.string.bottom_on_boarding_body_text_scan_third)));
        list.add(new ContentOnBoardingModel((int) id.dana.R.drawable.on_boarding_request, getString(id.dana.R.string.bottom_on_boarding_subtitle_scan_fourth), getString(id.dana.R.string.bottom_on_boarding_body_text_scan_fourth)));
    }

    /* access modifiers changed from: private */
    public void setMax(String str) {
        RelativeLayout relativeLayout = this.rlScanner;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        this.toFloatRange = false;
        FastBitmap$CoordinateSystem();
        setMax(str, false);
        setMin(TrackerKey.ScannerAction.ERROR_QR_BARCODE);
    }

    static /* synthetic */ void getMax(ScannerFragment scannerFragment, boolean z) {
        if (z) {
            scannerFragment.length(scannerFragment.getMin(ScannerActionState.PROCESSING), false);
        } else {
            scannerFragment.length(scannerFragment.getMin(ScannerActionState.IDLE), false);
        }
    }

    static /* synthetic */ void setMax(ScannerFragment scannerFragment) {
        if (scannerFragment.getContext() != null) {
            setStateOn.getMin getmin = new setStateOn.getMin((Fragment) scannerFragment);
            Collections.addAll(getmin.length, new String[]{"android.permission.ACCESS_FINE_LOCATION", ManifestPermission.ACCESS_COARSE_LOCATION});
            getmin.getMax = new setStateOn.length() {
                public final void getMin(setStateOn.setMin setmin) {
                    ScannerFragment.this.globalNetworkPresenter.getMax();
                }

                public final void setMin(setStateOn.setMin setmin) {
                    ScannerFragment.this.barcodeView.resume();
                }
            };
            new setStateOn(getmin, (byte) 0).setMin();
        }
    }

    static /* synthetic */ void equals(ScannerFragment scannerFragment) {
        ArrayList arrayList = new ArrayList();
        scannerFragment.FastBitmap$CoordinateSystem = arrayList;
        scannerFragment.getMin((List<ContentOnBoardingModel>) arrayList);
        scannerFragment.valueOf.getMin(BottomSheetOnBoardingActivity.createOnBoardingIntent(scannerFragment.getActivity(), new OnBoardingModel(scannerFragment.getString(id.dana.R.string.bottom_on_boarding_title_scan), BottomSheetType.VIEW_PAGER, scannerFragment.FastBitmap$CoordinateSystem, "scan_qr")), (name) null);
    }

    static /* synthetic */ void toFloatRange(ScannerFragment scannerFragment) {
        if (scannerFragment.getActivity() instanceof HomeTabActivity) {
            ((HomeTabActivity) scannerFragment.getActivity()).setSwipeable(true);
        }
    }

    static /* synthetic */ void toIntRange(ScannerFragment scannerFragment) {
        if (ScannerViewType.ACTIVITY.equals(scannerFragment.IsOverlapping) && scannerFragment.getActivity() != null) {
            scannerFragment.getActivity().finish();
        }
    }

    static /* synthetic */ void getMin(ScannerFragment scannerFragment, fillPageCommonInfo fillpagecommoninfo) {
        boolean z = false;
        if (fillpagecommoninfo.getBizType().equals(DecodeQrBizType.GN_AC_CODE)) {
            scannerFragment.globalNetworkPresenter.setMax(fillpagecommoninfo.getBizInfo().invoke, fillpagecommoninfo.getAcDecodeConfig());
        } else {
            scannerFragment.getMin(false);
            scannerFragment.FastBitmap$CoordinateSystem();
            scannerFragment.hashCode.setMin = fillpagecommoninfo.getBizType();
            if (getMax(fillpagecommoninfo.getBizType())) {
                scannerFragment.setMin(TrackerKey.ScannerAction.DECODE_CODE);
            }
        }
        postWebViewMessage bizInfo = fillpagecommoninfo.getBizInfo();
        if (!(bizInfo == null || bizInfo.valueOf == null)) {
            if (bizInfo.valueOf.contains("mini://") || scannerFragment.onNavigationEvent) {
                z = true;
            }
            scannerFragment.onNavigationEvent = z;
        }
        scannerFragment.invokeSuspend();
    }

    static /* synthetic */ void isInside(ScannerFragment scannerFragment) {
        scannerFragment.isInside = false;
        scannerFragment.h5EventPresenter.getMin();
    }

    static /* synthetic */ void FastBitmap$CoordinateSystem(ScannerFragment scannerFragment) {
        setCancelText.setMax(scannerFragment.getMax, id.dana.R.drawable.ic_close_red, scannerFragment.getMax.getString(id.dana.R.string.qr_expired_scanner_error_message));
        RelativeLayout relativeLayout = scannerFragment.rlScanner;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        scannerFragment.toFloatRange = false;
        scannerFragment.FastBitmap$CoordinateSystem();
        scannerFragment.setMin(TrackerKey.ScannerAction.ERROR_QR_BARCODE);
    }

    static /* synthetic */ void toString(ScannerFragment scannerFragment) {
        if (!(scannerFragment.getContext() == null || scannerFragment.icImageFg == null)) {
            scannerFragment.length(scannerFragment.getMin(ScannerActionState.PROCESSING), false);
            Animation loadAnimation = AnimationUtils.loadAnimation(scannerFragment.getContext(), id.dana.R.anim.f732130772045);
            loadAnimation.setInterpolator(new LinearInterpolator());
            scannerFragment.icImageFg.startAnimation(loadAnimation);
        }
        RelativeLayout relativeLayout = scannerFragment.rlScanner;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    static /* synthetic */ void hashCode(ScannerFragment scannerFragment) {
        RelativeLayout relativeLayout = scannerFragment.rlScanner;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        scannerFragment.toFloatRange = false;
    }

    public static /* synthetic */ void invokeSuspend(ScannerFragment scannerFragment) {
        RelativeLayout relativeLayout = scannerFragment.rlScanner;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        scannerFragment.toFloatRange = false;
        scannerFragment.FastBitmap$CoordinateSystem();
        scannerFragment.getMin(false);
    }

    public static /* synthetic */ void getMin(ScannerFragment scannerFragment, ActivityResult activityResult) {
        if (activityResult.length != null) {
            final Uri data = activityResult.length.getData();
            scannerFragment.getMin(true);
            ((updateCornerMarking) Glide.getMax((Fragment) scannerFragment)).length(data).setMin((int) id.dana.R.drawable.ic_dana_logo_white).setMax(new parseBehavior<Drawable>() {
                public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, layoutChildWithAnchor<Drawable> layoutchildwithanchor, boolean z) {
                    return false;
                }

                public final /* synthetic */ boolean onResourceReady(Object obj, Object obj2, layoutChildWithAnchor layoutchildwithanchor, DataSource dataSource, boolean z) {
                    return setMin((Drawable) obj);
                }

                private boolean setMin(Drawable drawable) {
                    ScannerFragment.this.imgScanGallery.setImageDrawable(drawable);
                    ScannerFragment.getMax(ScannerFragment.this, true);
                    ScannerFragment.this.decodePresenter.length(data);
                    ScannerFragment.this.hashCode.setMax = "Gallery";
                    return false;
                }
            }).length(scannerFragment.imgScanGallery);
        }
    }

    public static /* synthetic */ void length(ScannerFragment scannerFragment, DecodeResult decodeResult) {
        try {
            scannerFragment.getMax(decodeResult.setMax.decode(new BinaryBitmap(new HybridBinarizer(decodeResult.setMin.setMin()))).getText(), "");
        } catch (NotFoundException unused) {
            scannerFragment.setMax(scannerFragment.getString(id.dana.R.string.invalid_qr_code), true);
        }
        ConfirmPopup.AnonymousClass2.setMin(scannerFragment.getContext(), getPhotoRect.length().setMax);
        getPhotoRect.length().setMax = null;
    }

    public static /* synthetic */ void Mean$Arithmetic(ScannerFragment scannerFragment) {
        scannerFragment.FastBitmap$CoordinateSystem();
        if (scannerFragment.invokeSuspend) {
            setUseAmcsLite min = ((setUseSecurityGuard) ((setUseSecurityGuard) ((setUseSecurityGuard) new setUseSecurityGuard(scannerFragment.getActivity()).getMax(scannerFragment.rlHelpScanQr)).setMin(new getUseSecurityGuard((float) setMin))).getMin(new access$1402(scannerFragment.getResources().getString(id.dana.R.string.tooltip_highlight_title), scannerFragment.getResources().getString(id.dana.R.string.tooltip_highlight_description_scan_qr)))).getMin();
            if (scannerFragment.invoke == null) {
                initRect initrect = new initRect(scannerFragment.getActivity());
                initrect.toString = min;
                initRect initrect2 = (initRect) initrect.length(false);
                initrect2.values = scannerFragment.getResources().getString(id.dana.R.string.btnQrOnboarding);
                scannerFragment.invoke = ((initRect) initrect2.setMin((PhotoView.FlingRunnable) new getMaxTextureSize() {
                    public final void onFinished(int i) {
                        PhotoView.PhotoInter unused = ScannerFragment.this.invoke = null;
                        ScannerFragment.toFloatRange(ScannerFragment.this);
                    }
                })).length();
            }
            scannerFragment.invokeSuspend = false;
            scannerFragment.length(scannerFragment.getMin(ScannerActionState.IDLE));
        }
    }

    public static /* synthetic */ void Grayscale$Algorithm(ScannerFragment scannerFragment) {
        CustomDecoratedBarcodeView customDecoratedBarcodeView;
        scannerFragment.getMin(false);
        CustomDecoratedBarcodeView customDecoratedBarcodeView2 = scannerFragment.barcodeView;
        if (customDecoratedBarcodeView2 != null) {
            customDecoratedBarcodeView2.setVisibilityToastText(false);
        }
        CustomDecoratedBarcodeView customDecoratedBarcodeView3 = scannerFragment.barcodeView;
        if (customDecoratedBarcodeView3 != null) {
            customDecoratedBarcodeView3.setVisibilityQrisStampWithPlaceholder(false);
        }
        if (!scannerFragment.toDoubleRange() && !scannerFragment.invokeSuspend && (customDecoratedBarcodeView = scannerFragment.barcodeView) != null) {
            customDecoratedBarcodeView.setVisibilityQrisSupportedStamp(true);
        }
        setH5Page seth5page = scannerFragment.timerUtil;
        if (seth5page.setMin != null && !seth5page.setMin.isDisposed()) {
            seth5page.setMin.dispose();
        }
    }

    public static /* synthetic */ void isInside(ScannerFragment scannerFragment, String str) {
        if ("split_bill".equals(scannerFragment.Grayscale$Algorithm) && BranchLinkConstant.ActionTarget.SPLIT_BILL_DETAIL.equals(str)) {
            scannerFragment.setMax(scannerFragment.getMin(ScannerActionState.INVALID_QR_CODE));
        } else if (BranchLinkConstant.ActionTarget.PROFILE_QRIS_ALERT.equals(str)) {
            new Handler(Looper.getMainLooper()).postDelayed(new DecodeOptions.MaxLenMode(scannerFragment), AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
