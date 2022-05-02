package o;

import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverAppCenter;
import o.GriverResourceManager;
import o.GriverUpdateProgressExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/promocode/RedeemPromoCodePresenter;", "Lid/dana/promocode/RedeemPromoCodeContract$Presenter;", "view", "Lid/dana/promocode/RedeemPromoCodeContract$View;", "applyPromoCode", "Lid/dana/domain/promocode/interactor/ApplyPromoCode;", "(Lid/dana/promocode/RedeemPromoCodeContract$View;Lid/dana/domain/promocode/interactor/ApplyPromoCode;)V", "doOnError", "", "throwable", "", "code", "", "doOnSuccessApply", "promoCode", "Lid/dana/domain/promocode/model/PromoCode;", "getPrizeInfoVOModel", "Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "prizeAwardVO", "Lid/dana/domain/promocode/model/PrizeAwardVO;", "getVoucherId", "extendInfo", "", "onDestroy", "redeemCode", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverChooseFileExtensionImpl implements GriverUpdateProgressExtension.getMax {
    @NotNull
    public static final getMin setMin = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public final GriverUpdateProgressExtension.length length;
    private final GriverAppCenter setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ String $code;
        final /* synthetic */ GriverChooseFileExtensionImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(GriverChooseFileExtensionImpl griverChooseFileExtensionImpl, String str) {
            super(1);
            this.this$0 = griverChooseFileExtensionImpl;
            this.$code = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.APPLY_PROMO_CODE);
            sb.append(this.this$0.getClass().getName());
            sb.append(":onError");
            updateActionSheetContent.e(DanaLogConstants.BizType.PROMO_CENTER, sb.toString(), th);
            this.this$0.length.dismissProgress();
            GriverChooseFileExtensionImpl.getMin(this.this$0, th, this.$code);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/promocode/model/PromoCode;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<GriverResourceManager.AnonymousClass1, Unit> {
        final /* synthetic */ String $code;
        final /* synthetic */ GriverChooseFileExtensionImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(GriverChooseFileExtensionImpl griverChooseFileExtensionImpl, String str) {
            super(1);
            this.this$0 = griverChooseFileExtensionImpl;
            this.$code = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GriverResourceManager.AnonymousClass1) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GriverResourceManager.AnonymousClass1 r3) {
            Intrinsics.checkNotNullParameter(r3, "it");
            this.this$0.length.dismissProgress();
            GriverChooseFileExtensionImpl.setMin(this.this$0, this.$code, r3);
        }
    }

    @Inject
    public GriverChooseFileExtensionImpl(@NotNull GriverUpdateProgressExtension.length length2, @NotNull GriverAppCenter griverAppCenter) {
        Intrinsics.checkNotNullParameter(length2, "view");
        Intrinsics.checkNotNullParameter(griverAppCenter, "applyPromoCode");
        this.length = length2;
        this.setMax = griverAppCenter;
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        this.length.showProgress();
        this.setMax.execute(new GriverAppCenter.setMax(str), new setMin(this, str), new setMax(this, str));
    }

    public final void setMax() {
        this.setMax.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/promocode/RedeemPromoCodePresenter$Companion;", "", "()V", "EMPTY_PRIZE", "", "VOUCHER_ID_KEY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: o.GriverAMCSAppUpdater} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: o.GriverAMCSAppUpdater} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.GriverAMCSAppUpdater} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: o.GriverAMCSAppUpdater} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: o.GriverAMCSAppUpdater} */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void setMin(o.GriverChooseFileExtensionImpl r10, java.lang.String r11, o.GriverResourceManager.AnonymousClass1 r12) {
        /*
            java.util.List r12 = r12.getPrizeAwards()
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0056
            r0 = 0
            java.lang.Object r12 = r12.get(r0)
            o.GriverResourceManager$2$1 r12 = (o.GriverResourceManager.AnonymousClass2.AnonymousClass1) r12
            o.GriverUpdateProgressExtension$length r10 = r10.length
            o.GriverResourceManager$2 r0 = r12.getPrizeInfoVO()
            r1 = 0
            if (r0 == 0) goto L_0x004e
            java.lang.String r3 = r12.getPrizeAwardOrderId()
            java.lang.String r4 = r12.getBizNo()
            java.util.Map r2 = r12.getExtendInfo()
            if (r2 == 0) goto L_0x0035
            java.lang.String r1 = "voucherId"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0035:
            r8 = r1
            java.lang.String r1 = "$this$toPrizeInfoEntity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            o.GriverAMCSAppUpdater r1 = new o.GriverAMCSAppUpdater
            java.lang.String r5 = r0.getPrizeId()
            r6 = 0
            java.lang.String r7 = r0.getPrizeType()
            java.lang.String r9 = r0.getPrizeName()
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x004e:
            java.lang.String r12 = r12.getActivityId()
            r10.onRedeemResult(r11, r1, r12)
            return
        L_0x0056:
            o.GriverUpdateProgressExtension$length r10 = r10.length
            java.lang.String r12 = ""
            java.lang.String r0 = "Empty Prize"
            r10.onErrorResult(r12, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverChooseFileExtensionImpl.setMin(o.GriverChooseFileExtensionImpl, java.lang.String, o.GriverResourceManager$1):void");
    }

    public static final /* synthetic */ void getMin(GriverChooseFileExtensionImpl griverChooseFileExtensionImpl, Throwable th, String str) {
        if (th instanceof NetworkException) {
            griverChooseFileExtensionImpl.length.onErrorResult(((NetworkException) th).getErrorCode(), th.getMessage(), str);
        } else {
            griverChooseFileExtensionImpl.length.onErrorResult("", th.getMessage(), str);
        }
    }
}
