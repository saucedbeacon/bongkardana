package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.BeforeGetMainPackageResourcePoint;
import o.GriverAmcsLiteConfig;
import o.GriverPrepareInterceptor;
import o.loadOriginalImage;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0016H\u0007J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010#H\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\u0018\u0010\u0006\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u001bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lid/dana/requestmoney/RequestMoneyQrPresenter;", "Lid/dana/requestmoney/RequestMoneyQrContract$Presenter;", "context", "Landroid/content/Context;", "getAvatarUrl", "Lid/dana/domain/account/interactor/GetAvatarUrl;", "getTransferQr", "Lid/dana/domain/qrbarcode/interactor/GetTransferQr;", "view", "Lid/dana/requestmoney/RequestMoneyQrContract$View;", "checkBranchDeepLinkFeature", "Lid/dana/domain/featureconfig/interactor/CheckBranchDeepLinkFeature;", "checkQrisTcicoFeature", "Lid/dana/domain/featureconfig/interactor/CheckQrisTcicoFeature;", "(Landroid/content/Context;Lid/dana/domain/account/interactor/GetAvatarUrl;Lid/dana/domain/qrbarcode/interactor/GetTransferQr;Lid/dana/requestmoney/RequestMoneyQrContract$View;Lid/dana/domain/featureconfig/interactor/CheckBranchDeepLinkFeature;Lid/dana/domain/featureconfig/interactor/CheckQrisTcicoFeature;)V", "getRequestMoneyInfoFeature", "Lid/dana/domain/featureconfig/interactor/GetRequestMoneyInfoFeature;", "homeInfo", "Lid/dana/domain/homeinfo/interactor/GetHomeInfo;", "homeInfoMapper", "Lid/dana/mapper/HomeInfoMapper;", "requestMoneyInfoModelMapper", "Lid/dana/requestmoney/mapper/RequestMoneyInfoModelMapper;", "transferQrObserver", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/qrbarcode/QrUserResult;", "buildHomeInfoDependencies", "", "buildRequestMoneyInfo", "getRequestMoneyInfo", "mapper", "checkDeeplinkFeature", "checkQrisFeature", "getHomeInfo", "getProfileURL", "Lid/dana/model/HomeInfo;", "amount", "", "comment", "onDestroy", "resetDynamicQr", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverH5Utils implements loadOriginalImage.setMax {
    /* access modifiers changed from: private */
    public final Context IsOverlapping;
    private final BeforeGetMainPackageResourcePoint equals;
    u getMax;
    private GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1> getMin;
    /* access modifiers changed from: private */
    public final loadOriginalImage.setMin isInside;
    setNetworkAvailable length;
    NetworkBridgeExtension setMax;
    getGriverSectionConfig setMin;
    private final getAppByUrl toFloatRange;
    private final getMinimumLogicalFontSize toIntRange;
    private final setNeedInitialFocus values;

    @Inject
    public GriverH5Utils(@NotNull Context context, @NotNull getAppByUrl getappbyurl, @NotNull BeforeGetMainPackageResourcePoint beforeGetMainPackageResourcePoint, @NotNull loadOriginalImage.setMin setmin, @NotNull getMinimumLogicalFontSize getminimumlogicalfontsize, @NotNull setNeedInitialFocus setneedinitialfocus) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getappbyurl, "getAvatarUrl");
        Intrinsics.checkNotNullParameter(beforeGetMainPackageResourcePoint, "getTransferQr");
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(getminimumlogicalfontsize, "checkBranchDeepLinkFeature");
        Intrinsics.checkNotNullParameter(setneedinitialfocus, "checkQrisTcicoFeature");
        this.IsOverlapping = context;
        this.toFloatRange = getappbyurl;
        this.equals = beforeGetMainPackageResourcePoint;
        this.isInside = setmin;
        this.toIntRange = getminimumlogicalfontsize;
        this.values = setneedinitialfocus;
    }

    public static final /* synthetic */ u setMax(GriverH5Utils griverH5Utils) {
        u uVar = griverH5Utils.getMax;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestMoneyInfoModelMapper");
        }
        return uVar;
    }

    public static final /* synthetic */ NetworkBridgeExtension setMin(GriverH5Utils griverH5Utils) {
        NetworkBridgeExtension networkBridgeExtension = griverH5Utils.setMax;
        if (networkBridgeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeInfoMapper");
        }
        return networkBridgeExtension;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/requestmoney/RequestMoneyQrPresenter$getTransferQr$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/qrbarcode/QrUserResult;", "onError", "", "e", "", "onNext", "qrUserResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1> {
        final /* synthetic */ GriverH5Utils length;

        isInside(GriverH5Utils griverH5Utils) {
            this.length = griverH5Utils;
        }

        public final /* synthetic */ void onNext(Object obj) {
            GriverPrepareInterceptor.AnonymousClass1 r3 = (GriverPrepareInterceptor.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r3, "qrUserResult");
            this.length.isInside.length(r3.getQrCode());
            Collection qrCodeList = r3.getQrCodeList();
            if (qrCodeList == null || qrCodeList.isEmpty()) {
                dispose();
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.length.isInside.getMax(this.length.IsOverlapping.getString(R.string.general_error_msg));
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.REQUEST_MONEY_QR_PREFIX);
            sb.append(getClass().getName());
            sb.append(":onError");
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, sb.toString(), th);
        }
    }

    public final void setMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, "comment");
        BeforeGetMainPackageResourcePoint beforeGetMainPackageResourcePoint = this.equals;
        GriverAppVirtualHostProxy<GriverPrepareInterceptor.AnonymousClass1> isinside = new isInside(this);
        this.getMin = isinside;
        beforeGetMainPackageResourcePoint.execute(isinside, BeforeGetMainPackageResourcePoint.getMin.Companion.forGetTransferQr(str, str2));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/requestmoney/RequestMoneyQrPresenter$getHomeInfo$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/homeinfo/HomeInfoResponse;", "onError", "", "e", "", "onNext", "homeInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<GriverAmcsLiteConfig.AnonymousClass2> {
        final /* synthetic */ GriverH5Utils getMax;

        length(GriverH5Utils griverH5Utils) {
            this.getMax = griverH5Utils;
        }

        public final /* synthetic */ void onNext(Object obj) {
            GriverAmcsLiteConfig.AnonymousClass2 r2 = (GriverAmcsLiteConfig.AnonymousClass2) obj;
            Intrinsics.checkNotNullParameter(r2, "homeInfoResponse");
            this.getMax.toFloatRange.execute(new setMin(this.getMax, GriverH5Utils.setMin(this.getMax).length(r2)));
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.REQUEST_MONEY_HOMEINFO_PREFIX);
            sb.append(getClass().getName());
            sb.append(":onError");
            updateActionSheetContent.e(DanaLogConstants.TAG.REQUEST_MONEY_TAG, sb.toString(), th);
        }
    }

    public final void setMin() {
        getGriverSectionConfig getgriversectionconfig = this.setMin;
        if (getgriversectionconfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeInfo");
        }
        getgriversectionconfig.execute(new length(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/requestmoney/RequestMoneyQrPresenter$getRequestMoneyInfo$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/featureconfig/model/RequestMoneyInfo;", "onNext", "", "requestMoneyInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<onReceivedError> {
        final /* synthetic */ GriverH5Utils setMin;

        getMax(GriverH5Utils griverH5Utils) {
            this.setMin = griverH5Utils;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onReceivedError onreceivederror = (onReceivedError) obj;
            Intrinsics.checkNotNullParameter(onreceivederror, "requestMoneyInfo");
            this.setMin.isInside.setMin((access$2900) GriverH5Utils.setMax(this.setMin).apply(onreceivederror));
        }
    }

    public final void getMax() {
        setNetworkAvailable setnetworkavailable = this.length;
        if (setnetworkavailable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getRequestMoneyInfoFeature");
        }
        setnetworkavailable.execute(new getMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/requestmoney/RequestMoneyQrPresenter$checkDeeplinkFeature$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "active", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ GriverH5Utils length;

        setMax(GriverH5Utils griverH5Utils) {
            this.length = griverH5Utils;
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.length.isInside.setMax(((Boolean) obj).booleanValue());
        }
    }

    public final void length() {
        this.toIntRange.execute(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/requestmoney/RequestMoneyQrPresenter$checkQrisFeature$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "active", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ GriverH5Utils length;

        getMin(GriverH5Utils griverH5Utils) {
            this.length = griverH5Utils;
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.length.isInside.getMax(((Boolean) obj).booleanValue());
        }
    }

    public final void getMin() {
        this.values.execute(new getMin(this));
    }

    public final void toFloatRange() {
        this.equals.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/requestmoney/RequestMoneyQrPresenter$getProfileURL$1", "Lid/dana/domain/DefaultObserver;", "", "onNext", "", "avatarUrl", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ GriverH5Utils getMin;
        final /* synthetic */ InputBridgeExtension length;

        setMin(GriverH5Utils griverH5Utils, InputBridgeExtension inputBridgeExtension) {
            this.getMin = griverH5Utils;
            this.length = inputBridgeExtension;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, AccountEntityRepository.UpdateType.AVATAR);
            this.getMin.isInside.setMax(this.length, str);
        }
    }

    public final void setMax() {
        this.equals.dispose();
        this.toFloatRange.dispose();
        getGriverSectionConfig getgriversectionconfig = this.setMin;
        if (getgriversectionconfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeInfo");
        }
        getgriversectionconfig.dispose();
        setNetworkAvailable setnetworkavailable = this.length;
        if (setnetworkavailable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getRequestMoneyInfoFeature");
        }
        setnetworkavailable.dispose();
        this.toIntRange.dispose();
        this.values.dispose();
    }
}
