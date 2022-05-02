package id.dana.requestmoney.balance;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import id.dana.R;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.contract.staticqr.GetStaticQrModule;
import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.di.modules.RequestMoneyQrModule;
import id.dana.requestmoney.BaseRequestMoneyQrCardFragment;
import id.dana.richview.QRView;
import id.dana.richview.socialshare.SocialShareView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.InputBridgeExtension;
import o.OnTouch;
import o.PrepareException;
import o.WheelView;
import o.access$2900;
import o.activityGetScreenOrientation;
import o.getCacheRootDir;
import o.getTransitionProperties;
import o.loadOriginalImage;
import o.onDelete;
import o.parsePackage;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004H\u0002J\u0012\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\u0016H\u0016J\b\u0010&\u001a\u00020\u0016H\u0002J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0002J\u0018\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0002J\f\u0010.\u001a\u00020\u0004*\u00020\u0004H\u0002J\u001c\u0010/\u001a\u00020\u0016*\u0002002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lid/dana/requestmoney/balance/RequestMoneyBalanceQrCardFragment;", "Lid/dana/requestmoney/BaseRequestMoneyQrCardFragment;", "()V", "avatar", "", "isQrisActive", "", "kycLevel", "profileQrCode", "qrCode", "staticQrPresenter", "Lid/dana/contract/staticqr/GetStaticQrContract$Presenter;", "getStaticQrPresenter", "()Lid/dana/contract/staticqr/GetStaticQrContract$Presenter;", "setStaticQrPresenter", "(Lid/dana/contract/staticqr/GetStaticQrContract$Presenter;)V", "transferQrCode", "getGenerateDeepLinkModule", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkModule;", "getGetStaticQrModule", "Lid/dana/contract/staticqr/GetStaticQrModule;", "getProfileData", "", "getRequestMoneyModule", "Lid/dana/di/modules/RequestMoneyQrModule;", "init", "initComponent", "initData", "initHomeInfo", "homeInfo", "Lid/dana/model/HomeInfo;", "avatarUrl", "isQrLink", "qrUrl", "isViewExist", "view", "Landroid/view/View;", "reloadQr", "resetCurrentQr", "setShareSocialQrCode", "updateQrView", "qrString", "kycLevelUser", "updateTransferQr", "amount", "remarks", "addSourceParam", "showAvatar", "Lid/dana/richview/QRView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RequestMoneyBalanceQrCardFragment extends BaseRequestMoneyQrCardFragment {
    /* access modifiers changed from: private */
    public String IsOverlapping = "";
    /* access modifiers changed from: private */
    public String equals = "";
    /* access modifiers changed from: private */
    public boolean isInside;
    private String setMax = "";
    /* access modifiers changed from: private */
    public String setMin = "";
    @Inject
    public OnTouch.setMin staticQrPresenter;
    private HashMap toFloatRange;
    /* access modifiers changed from: private */
    public String toIntRange = "";

    private static boolean setMax(View view) {
        return view != null;
    }

    public final void invoke() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View setMin(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setMax() {
        super.setMax();
        FloatingActionButton floatingActionButton = (FloatingActionButton) setMin(resetInternal.setMax.invokeSuspend);
        if (floatingActionButton != null) {
            Intrinsics.checkNotNullParameter(floatingActionButton, "$this$toggleVisibility");
            floatingActionButton.hide();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"id/dana/requestmoney/balance/RequestMoneyBalanceQrCardFragment$getRequestMoneyModule$1", "Lid/dana/requestmoney/RequestMoneyQrContract$View;", "onDeeplinkActive", "", "active", "", "onFinishGetHomeInfo", "homeInfo", "Lid/dana/model/HomeInfo;", "avatarUrl", "", "onFinishGetRequestMoneyInfo", "requestMoneyInfo", "Lid/dana/requestmoney/model/RequestMoneyInfoModel;", "onGetTransferQrFail", "message", "onGetTransferQrSuccess", "qrCode", "onQrisActive", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements loadOriginalImage.setMin {
        final /* synthetic */ RequestMoneyBalanceQrCardFragment getMax;

        getMin(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment) {
            this.getMax = requestMoneyBalanceQrCardFragment;
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "qrCode");
            this.getMax.equals = str;
            this.getMax.setMax(str);
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            this.getMax.Mean$Arithmetic();
        }

        public final void setMax(@NotNull InputBridgeExtension inputBridgeExtension, @NotNull String str) {
            Intrinsics.checkNotNullParameter(inputBridgeExtension, "homeInfo");
            Intrinsics.checkNotNullParameter(str, AccountEntityRepository.UpdateType.AVATAR);
            RequestMoneyBalanceQrCardFragment.getMax(this.getMax, inputBridgeExtension, str);
        }

        public final void setMin(@NotNull access$2900 access_2900) {
            Intrinsics.checkNotNullParameter(access_2900, "requestMoneyInfo");
            this.getMax.getMax(access_2900);
        }

        public final void setMax(boolean z) {
            this.getMax.length(z);
        }

        public final void getMax(boolean z) {
            this.getMax.isInside = z;
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.getMax.setMin(resetInternal.setMax.setPopupCallback);
            if (appCompatImageView != null) {
                View view = appCompatImageView;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(z ? 0 : 8);
            }
            if (z) {
                OnTouch.setMin setmin = this.getMax.staticQrPresenter;
                if (setmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("staticQrPresenter");
                }
                setmin.setMin();
                return;
            }
            OnTouch.setMin setmin2 = this.getMax.staticQrPresenter;
            if (setmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staticQrPresenter");
            }
            setmin2.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"id/dana/requestmoney/balance/RequestMoneyBalanceQrCardFragment$getGenerateDeepLinkModule$1", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$ProfileView;", "dismissProgress", "", "onError", "errorMessage", "", "onProfileQrDeepLinkGenerated", "deepLink", "retryDeepLinkWithProfileQrUrl", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements getTransitionProperties.setMax {
        final /* synthetic */ RequestMoneyBalanceQrCardFragment length;

        public final void dismissProgress() {
        }

        public final void showProgress() {
        }

        setMax(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment) {
            this.length = requestMoneyBalanceQrCardFragment;
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "deepLink");
            if (!this.length.isInside || RequestMoneyBalanceQrCardFragment.toFloatRange(this.length.setMin)) {
                this.length.setMin = str;
                RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment = this.length;
                requestMoneyBalanceQrCardFragment.setMax(requestMoneyBalanceQrCardFragment.setMin, this.length.toIntRange, this.length.IsOverlapping);
            } else {
                if (this.length.setMin.length() > 0) {
                    RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment2 = this.length;
                    requestMoneyBalanceQrCardFragment2.setMax(requestMoneyBalanceQrCardFragment2.setMin, this.length.toIntRange, this.length.IsOverlapping);
                } else {
                    this.length.Mean$Arithmetic();
                }
            }
            RequestMoneyBalanceQrCardFragment.getMin(this.length, str);
        }

        public final void getMin() {
            OnTouch.setMin setmin = this.length.staticQrPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staticQrPresenter");
            }
            setmin.length();
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            this.length.Mean$Arithmetic();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"id/dana/requestmoney/balance/RequestMoneyBalanceQrCardFragment$getGenerateDeepLinkModule$2", "Lid/dana/contract/deeplink/generation/GenerateDeepLinkContract$TransferView;", "dismissProgress", "", "onError", "errorMessage", "", "onTransferQrDeepLinkGenerated", "deepLink", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements getTransitionProperties.IsOverlapping {
        final /* synthetic */ RequestMoneyBalanceQrCardFragment setMax;

        public final void dismissProgress() {
        }

        public final void showProgress() {
        }

        setMin(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment) {
            this.setMax = requestMoneyBalanceQrCardFragment;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "deepLink");
            if (!this.setMax.isInside || RequestMoneyBalanceQrCardFragment.toFloatRange(this.setMax.equals)) {
                RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment = this.setMax;
                requestMoneyBalanceQrCardFragment.setMax(str, requestMoneyBalanceQrCardFragment.toIntRange, this.setMax.IsOverlapping);
            } else {
                RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment2 = this.setMax;
                requestMoneyBalanceQrCardFragment2.setMax(requestMoneyBalanceQrCardFragment2.equals, this.setMax.toIntRange, this.setMax.IsOverlapping);
            }
            RequestMoneyBalanceQrCardFragment.getMin(this.setMax, str);
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            this.setMax.Mean$Arithmetic();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"id/dana/requestmoney/balance/RequestMoneyBalanceQrCardFragment$getGetStaticQrModule$1", "Lid/dana/contract/staticqr/GetStaticQrContract$View;", "dismissProgress", "", "onError", "errorMessage", "", "onGetProfileQr", "profileQrUrl", "onQrisTcicoEnable", "enable", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements OnTouch.length {
        final /* synthetic */ RequestMoneyBalanceQrCardFragment length;

        public final void dismissProgress() {
        }

        public final void setMin(boolean z) {
        }

        public final void showProgress() {
        }

        getMax(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment) {
            this.length = requestMoneyBalanceQrCardFragment;
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "profileQrUrl");
            this.length.setMin = str;
            RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment = this.length;
            requestMoneyBalanceQrCardFragment.getMax(requestMoneyBalanceQrCardFragment.setMin);
        }

        public final void onError(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "errorMessage");
            this.length.Mean$Arithmetic();
        }
    }

    /* access modifiers changed from: private */
    public final void setMax(String str, String str2, String str3) {
        CharSequence charSequence = str;
        if (StringsKt.isBlank(charSequence)) {
            str = this.setMax;
        }
        this.setMax = str;
        if (StringsKt.isBlank(str2)) {
            str2 = this.toIntRange;
        }
        this.toIntRange = str2;
        if (StringsKt.isBlank(str3)) {
            str3 = this.IsOverlapping;
        }
        this.IsOverlapping = str3;
        if (!StringsKt.isBlank(charSequence)) {
            QRView qRView = (QRView) setMin(resetInternal.setMax.setShowingForActionMode);
            if (qRView != null) {
                String str4 = this.toIntRange;
                qRView.setKycView(this.IsOverlapping);
                qRView.displayUserAvatar(str4);
            }
            String str5 = this.setMax;
            if (!this.isInside) {
                str5 = getCacheRootDir.getMax(str5, "request_money");
            }
            getMin(str5);
            SocialShareView socialShareView = (SocialShareView) setMin(resetInternal.setMax.getLastBaselineToBottomHeight);
            if (socialShareView != null) {
                socialShareView.setSharingMessage(getString(R.string.share_request_money_link), this.setMax);
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean toFloatRange(String str) {
        return StringsKt.startsWith$default(str, "http", false, 2, (Object) null);
    }

    public final void toDoubleRange() {
        PrepareException.AnonymousClass1 r2;
        parsePackage.getMax getmax = new parsePackage.getMax((byte) 0);
        if (this.getMax != null) {
            r2 = this.getMax.getApplicationComponent();
        } else {
            r2 = null;
        }
        if (r2 != null) {
            getmax.setMax = r2;
            getmax.getMin = new RequestMoneyQrModule(new getMin(this));
            getmax.length = new GetStaticQrModule(new getMax(this));
            getmax.getMax = new GenerateDeepLinkModule(new setMax(this), new setMin(this));
            stopIgnoring.setMin(getmax.getMin, RequestMoneyQrModule.class);
            stopIgnoring.setMin(getmax.length, GetStaticQrModule.class);
            stopIgnoring.setMin(getmax.getMax, GenerateDeepLinkModule.class);
            stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
            new parsePackage(getmax.getMin, getmax.length, getmax.getMax, getmax.setMax, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[3];
            loadOriginalImage.setMax setmax = this.requestMoneyQrPresenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
            }
            getminArr[0] = setmax;
            getTransitionProperties.getMax getmax2 = this.transferDeepLinkPresenter;
            if (getmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("transferDeepLinkPresenter");
            }
            getminArr[1] = getmax2;
            OnTouch.setMin setmin = this.staticQrPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staticQrPresenter");
            }
            getminArr[2] = setmin;
            getMin(getminArr);
            return;
        }
        throw null;
    }

    public final void FastBitmap$CoordinateSystem() {
        Grayscale$Algorithm();
        loadOriginalImage.setMax setmax = this.requestMoneyQrPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
        }
        setmax.getMin();
        loadOriginalImage.setMax setmax2 = this.requestMoneyQrPresenter;
        if (setmax2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
        }
        setmax2.setMin();
    }

    public final void values() {
        loadOriginalImage.setMax setmax = this.requestMoneyQrPresenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
        }
        setmax.toFloatRange();
        OnTouch.setMin setmin = this.staticQrPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("staticQrPresenter");
        }
        setmin.getMax();
        if (getMax().setMin > 0) {
            String obj = getMax().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "amount.toString()");
            String equals2 = equals();
            Grayscale$Algorithm();
            loadOriginalImage.setMax setmax2 = this.requestMoneyQrPresenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
            }
            setmax2.setMax(obj, equals2);
        } else if (!StringsKt.isBlank(this.setMin)) {
            setMax(this.setMin, this.toIntRange, this.IsOverlapping);
        } else {
            Grayscale$Algorithm();
            loadOriginalImage.setMax setmax3 = this.requestMoneyQrPresenter;
            if (setmax3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
            }
            setmax3.getMin();
            loadOriginalImage.setMax setmax4 = this.requestMoneyQrPresenter;
            if (setmax4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
            }
            setmax4.setMin();
        }
        if (this.getMin == null) {
            loadOriginalImage.setMax setmax5 = this.requestMoneyQrPresenter;
            if (setmax5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestMoneyQrPresenter");
            }
            setmax5.getMax();
        }
    }

    public static final /* synthetic */ void getMax(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment, InputBridgeExtension inputBridgeExtension, String str) {
        if (StringsKt.isBlank(str)) {
            str = inputBridgeExtension.getMin;
        }
        String str2 = requestMoneyBalanceQrCardFragment.setMax;
        Intrinsics.checkNotNullExpressionValue(str, "avatarUser");
        activityGetScreenOrientation activitygetscreenorientation = inputBridgeExtension.toIntRange;
        Intrinsics.checkNotNullExpressionValue(activitygetscreenorientation, "homeInfo.kyc");
        String str3 = activitygetscreenorientation.getMax;
        Intrinsics.checkNotNullExpressionValue(str3, "homeInfo.kyc.level");
        requestMoneyBalanceQrCardFragment.setMax(str2, str, str3);
        TextView textView = (TextView) requestMoneyBalanceQrCardFragment.setMin(resetInternal.setMax.getWeightSum);
        if (textView != null) {
            textView.setText(inputBridgeExtension.setMin);
        }
        TextView textView2 = (TextView) requestMoneyBalanceQrCardFragment.setMin(resetInternal.setMax.getVirtualChildAt);
        if (textView2 != null) {
            textView2.setText(WheelView.ScrollerTask.AnonymousClass2.getMin(inputBridgeExtension.getMax, false));
        }
        TextView textView3 = (TextView) requestMoneyBalanceQrCardFragment.setMin(resetInternal.setMax.getVirtualChildAt);
        if (textView3 != null) {
            View view = textView3;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        if (!StringsKt.isBlank(requestMoneyBalanceQrCardFragment.setMax)) {
            requestMoneyBalanceQrCardFragment.getMin(requestMoneyBalanceQrCardFragment.setMax);
        }
    }

    public static final /* synthetic */ void getMin(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment, String str) {
        if (setMax((View) (SocialShareView) requestMoneyBalanceQrCardFragment.setMin(resetInternal.setMax.getLastBaselineToBottomHeight))) {
            ((SocialShareView) requestMoneyBalanceQrCardFragment.setMin(resetInternal.setMax.getLastBaselineToBottomHeight)).setSharingMessage(requestMoneyBalanceQrCardFragment.getString(R.string.share_request_money_link), str);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
