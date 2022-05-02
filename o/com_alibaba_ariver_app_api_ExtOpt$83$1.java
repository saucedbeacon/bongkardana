package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/data/loyalty/repository/source/network/NetworkLoyaltyEntityData;", "Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "loyaltyApi", "Lid/dana/data/loyalty/repository/source/network/LoyaltyApi;", "(Lid/dana/data/loyalty/repository/source/network/LoyaltyApi;)V", "submitReceipt", "Lio/reactivex/Single;", "Lid/dana/data/loyalty/repository/source/network/response/SubmitReceiptResponse;", "submitReceiptRequest", "Lid/dana/data/loyalty/repository/source/network/request/SubmitReceiptRequest;", "token", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$83$1 implements com_alibaba_ariver_app_api_ExtOpt$75$1 {
    private final com_alibaba_ariver_app_api_ExtOpt$82$1 loyaltyApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lid/dana/data/loyalty/repository/source/network/response/SubmitReceiptResponse;", "kotlin.jvm.PlatformType", "response", "Lid/dana/data/loyalty/repository/source/network/response/BaseLoyaltyResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<com_alibaba_ariver_app_api_ExtOpt$89$1<com_alibaba_ariver_app_api_ExtOpt$88$1>, setMinDuration<? extends com_alibaba_ariver_app_api_ExtOpt$88$1>> {
        final /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$83$1 getMax;

        getMax(com_alibaba_ariver_app_api_ExtOpt$83$1 com_alibaba_ariver_app_api_extopt_83_1) {
            this.getMax = com_alibaba_ariver_app_api_extopt_83_1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
            r0 = r0.getStatus();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
            /*
                r2 = this;
                o.com_alibaba_ariver_app_api_ExtOpt$89$1 r3 = (o.com_alibaba_ariver_app_api_ExtOpt$89$1) r3
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                o.com_alibaba_ariver_app_api_ExtOpt$86$1 r0 = r3.getResultInfo()
                if (r0 == 0) goto L_0x001a
                java.lang.String r0 = r0.getStatus()
                if (r0 == 0) goto L_0x001a
                java.lang.String r1 = "SUCCESS"
                boolean r0 = r0.equals(r1)
                goto L_0x001b
            L_0x001a:
                r0 = 0
            L_0x001b:
                if (r0 == 0) goto L_0x001f
                r0 = r3
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                if (r0 == 0) goto L_0x002d
                java.lang.Object r3 = r0.getBody()
                o.TitleBarRightButtonView$CornerMarkingUIController$1 r3 = o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.getMax(r3)
                o.setMinDuration r3 = (o.setMinDuration) r3
                return r3
            L_0x002d:
                java.lang.Throwable r0 = new java.lang.Throwable
                o.com_alibaba_ariver_app_api_ExtOpt$86$1 r3 = r3.getResultInfo()
                if (r3 == 0) goto L_0x003b
                java.lang.String r3 = r3.getMessage()
                if (r3 != 0) goto L_0x003d
            L_0x003b:
                java.lang.String r3 = "Error Result"
            L_0x003d:
                r0.<init>(r3)
                o.TitleBarRightButtonView$CornerMarkingUIController$1 r3 = o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMin((java.lang.Throwable) r0)
                o.setMinDuration r3 = (o.setMinDuration) r3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.com_alibaba_ariver_app_api_ExtOpt.83.1.getMax.apply(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$83$1(@NotNull com_alibaba_ariver_app_api_ExtOpt$82$1 com_alibaba_ariver_app_api_extopt_82_1) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_82_1, "loyaltyApi");
        this.loyaltyApi = com_alibaba_ariver_app_api_extopt_82_1;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$88$1> submitReceipt(@NotNull com_alibaba_ariver_app_api_ExtOpt$81$1 com_alibaba_ariver_app_api_extopt_81_1, @NotNull String str) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_81_1, "submitReceiptRequest");
        Intrinsics.checkNotNullParameter(str, "token");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$89$1<com_alibaba_ariver_app_api_ExtOpt$88$1>> submitReceipt = this.loyaltyApi.submitReceipt("Bearer ".concat(String.valueOf(str)), new com_alibaba_ariver_app_api_ExtOpt$85$1(com_alibaba_ariver_app_api_extopt_81_1));
        RedDotDrawable getmax = new getMax(this);
        setRefreshAnimation.getMax(getmax, "mapper is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$88$1> switchtobluetheme = new switchToBlueTheme<>(submitReceipt, getmax);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            switchtobluetheme = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, switchtobluetheme);
        }
        Intrinsics.checkNotNullExpressionValue(switchtobluetheme, "loyaltyApi.submitReceipt…          }\n            }");
        return switchtobluetheme;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> saveReceiptData(@NotNull com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_80_1, "loyaltyReceiptEntity");
        TitleBarRightButtonView.AnonymousClass1<Long> just = TitleBarRightButtonView.AnonymousClass1.just(null);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(null)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$80$1> getReceiptDataByUserLoyaltyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userLoyaltyId");
        TitleBarRightButtonView.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$80$1> just = TitleBarRightButtonView.AnonymousClass1.just(null);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(null)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> deleteReceiptDataByUserLoyaltyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userLoyaltyId");
        TitleBarRightButtonView.AnonymousClass1<Integer> just = TitleBarRightButtonView.AnonymousClass1.just(null);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(null)");
        return just;
    }
}
