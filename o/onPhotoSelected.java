package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.data.constant.UrlTag;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.sendmoney.TransferType;
import id.dana.sendmoney.model.ExternalWithdrawChannelModel;
import id.dana.sendmoney.model.WithdrawChannelModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.getNonBeaconLeScanCallback;
import o.getRangingNotifiers;
import o.notifyFail;
import o.updateScanPeriods;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0010\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aJ\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016J\u0014\u0010/\u001a\u00020\u001d2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001901R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lid/dana/sendmoney/external/SendMoneyExternalPresenter;", "Lid/dana/sendmoney/external/SendMoneyExternalContract$Presenter;", "context", "Landroid/content/Context;", "initTransferMoney", "Lid/dana/domain/sendmoney/interactor/InitTransferMoney;", "initWithdraw", "Lid/dana/domain/sendmoney/interactor/InitWithdraw;", "transferMethodMapper", "Lid/dana/sendmoney/mapper/TransferMethodMapper;", "isNeedToShowExternalOnboardingDialog", "Lid/dana/domain/sendmoney/interactor/IsNeedToShowExternalOnboardingDialog;", "saveExternalOnboardingDialog", "Lid/dana/domain/sendmoney/interactor/SaveExternalOnboardingDialog;", "getUserInfoWithKyc", "Lid/dana/domain/user/interactor/GetUserInfoWithKyc;", "checkSendMoneyPeerToCash", "Lid/dana/domain/featureconfig/interactor/CheckSendMoneyPeerToCash;", "withdrawInitMethodOptionModelMapper", "Lid/dana/sendmoney/mapper/WithdrawInitMethodOptionModelMapper;", "view", "Lid/dana/sendmoney/external/SendMoneyExternalContract$View;", "(Landroid/content/Context;Lid/dana/domain/sendmoney/interactor/InitTransferMoney;Lid/dana/domain/sendmoney/interactor/InitWithdraw;Lid/dana/sendmoney/mapper/TransferMethodMapper;Lid/dana/domain/sendmoney/interactor/IsNeedToShowExternalOnboardingDialog;Lid/dana/domain/sendmoney/interactor/SaveExternalOnboardingDialog;Lid/dana/domain/user/interactor/GetUserInfoWithKyc;Lid/dana/domain/featureconfig/interactor/CheckSendMoneyPeerToCash;Lid/dana/sendmoney/mapper/WithdrawInitMethodOptionModelMapper;Lid/dana/sendmoney/external/SendMoneyExternalContract$View;)V", "p2cSupportedOutlets", "Ljava/util/ArrayList;", "Lid/dana/sendmoney/model/ExternalWithdrawChannelModel;", "Lkotlin/collections/ArrayList;", "userInfoResponse", "Lid/dana/domain/user/UserInfoResponse;", "", "createInitParam", "Lid/dana/domain/sendmoney/model/TransferInitParam;", "createSaveOnboardingDialogParam", "Lid/dana/domain/sendmoney/interactor/SaveExternalOnboardingDialog$Param;", "isShow", "", "getAtmWithdrawOption", "getOutletWithdrawOption", "getP2CSupportedOutlets", "getPeerToCashSupportedOutlet", "getUserKycStatus", "isNeedToShowOnboardingDialog", "isOutletSupportPeerToCash", "instId", "", "onDestroy", "saveShowOnboardingDialog", "setP2CSupportedOutlets", "outlets", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onPhotoSelected implements notifyFail.getMin {
    @NotNull
    public static final getMin length = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public final PhotoPagerListener FastBitmap$CoordinateSystem;
    private final getRangingNotifiers IsOverlapping;
    /* access modifiers changed from: private */
    public final addDatas equals;
    /* access modifiers changed from: private */
    public final Context getMax;
    private final updateScanPeriods getMin;
    private final setNonBeaconLeScanCallback isInside;
    ArrayList<ExternalWithdrawChannelModel> setMax = new ArrayList<>();
    /* access modifiers changed from: private */
    public disconnect setMin;
    private final getDefaultUserAgent toDoubleRange;
    private final notifyCharacteristicValue toFloatRange;
    private final getNonBeaconLeScanCallback toIntRange;
    /* access modifiers changed from: private */
    public final notifyFail.length toString;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ onPhotoSelected this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(onPhotoSelected onphotoselected) {
            super(1);
            this.this$0 = onphotoselected;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.toString.setMax(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Boolean, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Inject
    public onPhotoSelected(@NotNull Context context, @NotNull updateScanPeriods updatescanperiods, @NotNull getRangingNotifiers getrangingnotifiers, @NotNull addDatas adddatas, @NotNull setNonBeaconLeScanCallback setnonbeaconlescancallback, @NotNull getNonBeaconLeScanCallback getnonbeaconlescancallback, @NotNull notifyCharacteristicValue notifycharacteristicvalue, @NotNull getDefaultUserAgent getdefaultuseragent, @NotNull PhotoPagerListener photoPagerListener, @NotNull notifyFail.length length2) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(updatescanperiods, "initTransferMoney");
        Intrinsics.checkNotNullParameter(getrangingnotifiers, "initWithdraw");
        Intrinsics.checkNotNullParameter(adddatas, "transferMethodMapper");
        Intrinsics.checkNotNullParameter(setnonbeaconlescancallback, "isNeedToShowExternalOnboardingDialog");
        Intrinsics.checkNotNullParameter(getnonbeaconlescancallback, "saveExternalOnboardingDialog");
        Intrinsics.checkNotNullParameter(notifycharacteristicvalue, "getUserInfoWithKyc");
        Intrinsics.checkNotNullParameter(getdefaultuseragent, "checkSendMoneyPeerToCash");
        Intrinsics.checkNotNullParameter(photoPagerListener, "withdrawInitMethodOptionModelMapper");
        Intrinsics.checkNotNullParameter(length2, "view");
        this.getMax = context;
        this.getMin = updatescanperiods;
        this.IsOverlapping = getrangingnotifiers;
        this.equals = adddatas;
        this.isInside = setnonbeaconlescancallback;
        this.toIntRange = getnonbeaconlescancallback;
        this.toFloatRange = notifycharacteristicvalue;
        this.toDoubleRange = getdefaultuseragent;
        this.FastBitmap$CoordinateSystem = photoPagerListener;
        this.toString = length2;
    }

    public static final /* synthetic */ disconnect length(onPhotoSelected onphotoselected) {
        disconnect disconnect = onphotoselected.setMin;
        if (disconnect == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfoResponse");
        }
        return disconnect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney/external/SendMoneyExternalPresenter$getAtmWithdrawOption$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/sendmoney/model/TransferInit;", "onError", "", "error", "", "onNext", "transferInit", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends GriverAppVirtualHostProxy<getDataFieldCount> {
        final /* synthetic */ onPhotoSelected getMin;

        length(onPhotoSelected onphotoselected) {
            this.getMin = onphotoselected;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List<ExternalWithdrawChannelModel> list;
            Object obj2;
            List<onLoadCanceled> list2;
            Object obj3;
            List<WithdrawChannelModel> list3;
            getDataFieldCount getdatafieldcount = (getDataFieldCount) obj;
            Intrinsics.checkNotNullParameter(getdatafieldcount, "transferInit");
            Object apply = this.getMin.equals.apply(getdatafieldcount);
            Intrinsics.checkNotNullExpressionValue(apply, "transferMethodMapper.apply(transferInit)");
            Iterator it = ((Iterable) apply).iterator();
            while (true) {
                list = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                GridAdapter gridAdapter = (GridAdapter) obj2;
                Intrinsics.checkNotNullExpressionValue(gridAdapter, "it");
                if (Intrinsics.areEqual((Object) gridAdapter.setMax, (Object) TransferType.ATM_TRANSFER)) {
                    break;
                }
            }
            GridAdapter gridAdapter2 = (GridAdapter) obj2;
            if (!(gridAdapter2 == null || (list2 = gridAdapter2.isInside) == null)) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual((Object) ((onLoadCanceled) obj3).getMax, (Object) "WITHDRAW_ATM")) {
                        break;
                    }
                }
                onLoadCanceled onloadcanceled = (onLoadCanceled) obj3;
                if (!(onloadcanceled == null || (list3 = onloadcanceled.length) == null)) {
                    list = isConfigToDisableImageObserver.setMax(list3);
                }
            }
            notifyFail.length min = this.getMin.toString;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            min.length(list);
            this.getMin.toString.getMin();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
            this.getMin.toString.getMin();
            this.getMin.toString.onError(this.getMin.getMax.getString(R.string.general_error_msg));
        }
    }

    public final void getMin() {
        this.toString.setMin();
        getIdentifierCount getidentifiercount = new getIdentifierCount();
        getidentifiercount.setNeedPayMethod(true);
        getidentifiercount.setNeedTransferMethod(true);
        getidentifiercount.setNeedWithdrawMethod(true);
        this.getMin.execute(new length(this), updateScanPeriods.setMax.forSendMoneyInit(getidentifiercount));
    }

    public final void getMax() {
        this.isInside.execute(onReceivedIcon.INSTANCE, new equals(this), IsOverlapping.INSTANCE);
    }

    public final void length(boolean z) {
        this.toIntRange.execute(new getNonBeaconLeScanCallback.getMin(z), toIntRange.INSTANCE, toFloatRange.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney/external/SendMoneyExternalPresenter$getOutletWithdrawOption$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/sendmoney/model/WithdrawInit;", "onError", "", "error", "", "onNext", "withdrawInit", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<ensureMaxSize> {
        final /* synthetic */ onPhotoSelected getMax;

        getMax(onPhotoSelected onphotoselected) {
            this.getMax = onphotoselected;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.Collection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r15) {
            /*
                r14 = this;
                o.ensureMaxSize r15 = (o.ensureMaxSize) r15
                java.lang.String r0 = "withdrawInit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                java.util.List r15 = r15.getWithdrawMethodViewList()
                if (r15 == 0) goto L_0x00b7
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.Iterator r15 = r15.iterator()
            L_0x0013:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto L_0x00b7
                java.lang.Object r0 = r15.next()
                o.byteArrayToFormattedString r0 = (o.byteArrayToFormattedString) r0
                o.onPhotoSelected r1 = r14.getMax
                o.PhotoPagerListener r1 = r1.FastBitmap$CoordinateSystem
                java.util.List r0 = r0.getWithdrawMethodViews()
                java.lang.Object r0 = r1.apply(r0)
                java.lang.String r1 = "withdrawInitMethodOption…  it.withdrawMethodViews)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0038:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x0051
                java.lang.Object r1 = r0.next()
                r3 = r1
                o.isConfigToDisableQCompact r3 = (o.isConfigToDisableQCompact) r3
                java.lang.String r3 = r3.setMax
                java.lang.String r4 = "WITHDRAW_OTC"
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
                if (r3 == 0) goto L_0x0038
                goto L_0x0052
            L_0x0051:
                r1 = r2
            L_0x0052:
                o.isConfigToDisableQCompact r1 = (o.isConfigToDisableQCompact) r1
                if (r1 == 0) goto L_0x009d
                java.util.List<o.onLoadComplete> r0 = r1.length
                if (r0 == 0) goto L_0x009d
                java.lang.String r1 = "$this$toExternalWithdrawChannelModels"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
                r1.<init>(r2)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x0072:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x009a
                java.lang.Object r2 = r0.next()
                o.onLoadComplete r2 = (o.onLoadComplete) r2
                id.dana.sendmoney.model.ExternalWithdrawChannelModel r13 = new id.dana.sendmoney.model.ExternalWithdrawChannelModel
                java.lang.String r4 = r2.setMax
                java.lang.String r5 = r2.length
                java.lang.String r6 = r2.getMin
                java.lang.String r7 = r2.setMin
                java.lang.String r8 = r2.isInside
                java.lang.Boolean r9 = r2.getMax
                java.lang.String r10 = r2.equals
                java.lang.String r11 = r2.toIntRange
                java.lang.String r12 = r2.toFloatRange
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r1.add(r13)
                goto L_0x0072
            L_0x009a:
                r2 = r1
                java.util.List r2 = (java.util.List) r2
            L_0x009d:
                o.onPhotoSelected r0 = r14.getMax
                o.notifyFail$length r0 = r0.toString
                if (r2 != 0) goto L_0x00a9
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L_0x00a9:
                r0.setMax((java.util.List<id.dana.sendmoney.model.ExternalWithdrawChannelModel>) r2)
                o.onPhotoSelected r0 = r14.getMax
                o.notifyFail$length r0 = r0.toString
                r0.setMax()
                goto L_0x0013
            L_0x00b7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onPhotoSelected.getMax.onNext(java.lang.Object):void");
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
            this.getMax.toString.setMax();
            this.getMax.toString.onError(this.getMax.getMax.getString(R.string.general_error_msg));
        }
    }

    public final void setMin() {
        this.toString.length();
        this.IsOverlapping.execute(new getMax(this), new getRangingNotifiers.setMin(false, "OTC"));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney/external/SendMoneyExternalPresenter$checkSendMoneyPeerToCash$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "error", "", "onNext", "isEnabled", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<Boolean> {
        final /* synthetic */ onPhotoSelected setMin;

        setMin(onPhotoSelected onphotoselected) {
            this.setMin = onphotoselected;
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.setMin.toString.getMax(((Boolean) obj).booleanValue());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
        }
    }

    public final void length() {
        this.toDoubleRange.execute(new setMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/sendmoney/external/SendMoneyExternalPresenter$getUserKycStatus$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onComplete", "", "onError", "error", "", "onNext", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ onPhotoSelected setMin;

        isInside(onPhotoSelected onphotoselected) {
            this.setMin = onphotoselected;
        }

        public final /* synthetic */ void onNext(Object obj) {
            disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            this.setMin.setMin = disconnect;
        }

        public final void onComplete() {
            this.setMin.toString.getMin(onPhotoSelected.length(this.setMin).isKycCertified());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
            this.setMin.toString.onError(this.setMin.getMax.getString(R.string.general_error_msg));
        }
    }

    public final void isInside() {
        this.toFloatRange.execute(new isInside(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/sendmoney/external/SendMoneyExternalPresenter$getPeerToCashSupportedOutlet$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/sendmoney/model/TransferInit;", "onError", "", "error", "", "onNext", "transferInit", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<getDataFieldCount> {
        final /* synthetic */ onPhotoSelected setMax;

        setMax(onPhotoSelected onphotoselected) {
            this.setMax = onphotoselected;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: o.onLoadCanceled} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: o.onLoadCanceled} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.onLoadCanceled} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: o.onLoadCanceled} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r5) {
            /*
                r4 = this;
                o.getDataFieldCount r5 = (o.getDataFieldCount) r5
                java.lang.String r0 = "transferInit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                o.onPhotoSelected r0 = r4.setMax
                o.addDatas r0 = r0.equals
                java.lang.Object r5 = r0.apply(r5)
                java.lang.String r0 = "transferMethodMapper.apply(transferInit)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x001c:
                boolean r0 = r5.hasNext()
                r1 = 0
                if (r0 == 0) goto L_0x003a
                java.lang.Object r0 = r5.next()
                r2 = r0
                o.GridAdapter r2 = (o.GridAdapter) r2
                java.lang.String r3 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                java.lang.String r2 = r2.setMax
                java.lang.String r3 = "OTC"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
                if (r2 == 0) goto L_0x001c
                goto L_0x003b
            L_0x003a:
                r0 = r1
            L_0x003b:
                o.GridAdapter r0 = (o.GridAdapter) r0
                if (r0 == 0) goto L_0x007b
                java.util.List<o.onLoadCanceled> r5 = r0.isInside
                if (r5 == 0) goto L_0x007b
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x0049:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0061
                java.lang.Object r0 = r5.next()
                r2 = r0
                o.onLoadCanceled r2 = (o.onLoadCanceled) r2
                java.lang.String r2 = r2.getMax
                java.lang.String r3 = "WITHDRAW_REMITTANCE"
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
                if (r2 == 0) goto L_0x0049
                r1 = r0
            L_0x0061:
                o.onLoadCanceled r1 = (o.onLoadCanceled) r1
                if (r1 == 0) goto L_0x007b
                java.util.List<id.dana.sendmoney.model.WithdrawChannelModel> r5 = r1.length
                if (r5 == 0) goto L_0x007b
                java.util.List r5 = o.isConfigToDisableImageObserver.setMax(r5)
                o.onPhotoSelected r0 = r4.setMax
                java.lang.String r1 = "outlets"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                java.util.ArrayList<id.dana.sendmoney.model.ExternalWithdrawChannelModel> r0 = r0.setMax
                java.util.Collection r5 = (java.util.Collection) r5
                r0.addAll(r5)
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onPhotoSelected.setMax.onNext(java.lang.Object):void");
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "error");
            updateActionSheetContent.e(DanaLogConstants.TAG.SEND_MONEY_TAG, th.getMessage(), th);
        }
    }

    public final void equals() {
        getIdentifierCount getidentifiercount = new getIdentifierCount();
        getidentifiercount.setNeedPayMethod(true);
        getidentifiercount.setNeedTransferMethod(true);
        getidentifiercount.setNeedWithdrawMethod(true);
        this.getMin.execute(new setMax(this), updateScanPeriods.setMax.forSendMoneyInit(getidentifiercount));
    }

    public final void setMax() {
        this.getMin.dispose();
        this.isInside.dispose();
        this.toIntRange.dispose();
        this.IsOverlapping.dispose();
        this.toDoubleRange.dispose();
        this.toFloatRange.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/sendmoney/external/SendMoneyExternalPresenter$Companion;", "", "()V", "WITHDRAW_METHOD_ATM", "", "WITHDRAW_METHOD_OTC", "WITHDRAW_METHOD_REMITTANCE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final boolean length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Iterable<ExternalWithdrawChannelModel> iterable = this.setMax;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ExternalWithdrawChannelModel externalWithdrawChannelModel : iterable) {
            if (Intrinsics.areEqual((Object) externalWithdrawChannelModel.getMin, (Object) str)) {
                return true;
            }
        }
        return false;
    }
}
