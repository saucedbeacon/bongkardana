package o;

import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u001c"}, d2 = {"Lid/dana/data/loyalty/repository/LoyaltyEntityRepository;", "Lid/dana/domain/loyalty/LoyaltyRepository;", "loyaltyEntityDataFactory", "Lid/dana/data/loyalty/repository/source/LoyaltyEntityDataFactory;", "(Lid/dana/data/loyalty/repository/source/LoyaltyEntityDataFactory;)V", "localLoyaltyEntityData", "Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "getLocalLoyaltyEntityData", "()Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "localLoyaltyEntityData$delegate", "Lkotlin/Lazy;", "networkLoyaltyEntityData", "getNetworkLoyaltyEntityData", "networkLoyaltyEntityData$delegate", "getReceiptData", "Lio/reactivex/Observable;", "Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "userLoyaltyId", "", "removeReceiptData", "", "saveReceiptData", "fileOcrReceiptLoyalty", "submitReceipt", "Lid/dana/domain/loyalty/model/SubmitReceiptResult;", "base64ReceiptLoyalty", "Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty;", "token", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class com_alibaba_ariver_app_api_ExtOpt$71$1 implements GriverRVMonitorImpl {
    private final Lazy localLoyaltyEntityData$delegate = LazyKt.lazy(new setMax(this));
    /* access modifiers changed from: private */
    public final com_alibaba_ariver_app_api_ExtOpt$73$1 loyaltyEntityDataFactory;
    private final Lazy networkLoyaltyEntityData$delegate = LazyKt.lazy(new length(this));

    private final com_alibaba_ariver_app_api_ExtOpt$75$1 getLocalLoyaltyEntityData() {
        return (com_alibaba_ariver_app_api_ExtOpt$75$1) this.localLoyaltyEntityData$delegate.getValue();
    }

    private final com_alibaba_ariver_app_api_ExtOpt$75$1 getNetworkLoyaltyEntityData() {
        return (com_alibaba_ariver_app_api_ExtOpt$75$1) this.networkLoyaltyEntityData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Long;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<Long, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        public static final getMax getMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Long) obj, "it");
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/loyalty/repository/source/local/entity/LoyaltyReceiptEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<com_alibaba_ariver_app_api_ExtOpt$80$1, code> {
        public static final getMin setMax = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            com_alibaba_ariver_app_api_ExtOpt$80$1 com_alibaba_ariver_app_api_extopt_80_1 = (com_alibaba_ariver_app_api_ExtOpt$80$1) obj;
            Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_80_1, "it");
            return com_alibaba_ariver_app_api_ExtOpt$70$1.toOcrReceiptLoyalty(com_alibaba_ariver_app_api_extopt_80_1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Integer;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<Integer, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        public static final setMin getMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Integer) obj, "it");
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/loyalty/model/SubmitReceiptResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/loyalty/repository/source/network/response/SubmitReceiptResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<com_alibaba_ariver_app_api_ExtOpt$88$1, threshold> {
        public static final toFloatRange getMin = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            com_alibaba_ariver_app_api_ExtOpt$88$1 com_alibaba_ariver_app_api_extopt_88_1 = (com_alibaba_ariver_app_api_ExtOpt$88$1) obj;
            Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_88_1, "it");
            return com_alibaba_ariver_app_api_ExtOpt$70$1.toSubmitReceiptResult(com_alibaba_ariver_app_api_extopt_88_1);
        }
    }

    @Inject
    public com_alibaba_ariver_app_api_ExtOpt$71$1(@NotNull com_alibaba_ariver_app_api_ExtOpt$73$1 com_alibaba_ariver_app_api_extopt_73_1) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_73_1, "loyaltyEntityDataFactory");
        this.loyaltyEntityDataFactory = com_alibaba_ariver_app_api_extopt_73_1;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<threshold> submitReceipt(@NotNull MonitorMap monitorMap, @NotNull String str) {
        TitleBarRightButtonView.AnonymousClass1<threshold> r2;
        Intrinsics.checkNotNullParameter(monitorMap, "base64ReceiptLoyalty");
        Intrinsics.checkNotNullParameter(str, "token");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<com_alibaba_ariver_app_api_ExtOpt$88$1> submitReceipt = getNetworkLoyaltyEntityData().submitReceipt(com_alibaba_ariver_app_api_ExtOpt$70$1.toSubmitReceiptRequest(monitorMap), str);
        RedDotDrawable redDotDrawable = toFloatRange.getMin;
        setRefreshAnimation.getMax(redDotDrawable, "mapper is null");
        setMinDuration releaseviewlist = new releaseViewList(submitReceipt, redDotDrawable);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable2 = SecuritySignature.toString;
        if (redDotDrawable2 != null) {
            releaseviewlist = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable2, releaseviewlist);
        }
        if (releaseviewlist instanceof getSecondFloorView) {
            r2 = ((getSecondFloorView) releaseviewlist).setMax();
        } else {
            r2 = new setTitleLoading<>(releaseviewlist);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable3 = SecuritySignature.FastBitmap$CoordinateSystem;
            if (redDotDrawable3 != null) {
                r2 = (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable3, r2);
            }
        }
        Intrinsics.checkNotNullExpressionValue(r2, "networkLoyaltyEntityData…          .toObservable()");
        return r2;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveReceiptData(@NotNull code code) {
        Intrinsics.checkNotNullParameter(code, "fileOcrReceiptLoyalty");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getLocalLoyaltyEntityData().saveReceiptData(com_alibaba_ariver_app_api_ExtOpt$70$1.toLoyaltyReceiptEntity(code)).flatMap(getMax.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "localLoyaltyEntityData.s…{ Observable.just(true) }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<code> getReceiptData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userLoyaltyId");
        TitleBarRightButtonView.AnonymousClass1<R> map = getLocalLoyaltyEntityData().getReceiptDataByUserLoyaltyId(str).map(getMin.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "localLoyaltyEntityData.g…t.toOcrReceiptLoyalty() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> removeReceiptData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "userLoyaltyId");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getLocalLoyaltyEntityData().deleteReceiptDataByUserLoyaltyId(str).flatMap(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "localLoyaltyEntityData.d…{ Observable.just(true) }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<com_alibaba_ariver_app_api_ExtOpt$75$1> {
        final /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$71$1 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(com_alibaba_ariver_app_api_ExtOpt$71$1 com_alibaba_ariver_app_api_extopt_71_1) {
            super(0);
            this.this$0 = com_alibaba_ariver_app_api_extopt_71_1;
        }

        @NotNull
        public final com_alibaba_ariver_app_api_ExtOpt$75$1 invoke() {
            return this.this$0.loyaltyEntityDataFactory.createData("network");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/loyalty/repository/source/LoyaltyEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<com_alibaba_ariver_app_api_ExtOpt$75$1> {
        final /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$71$1 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(com_alibaba_ariver_app_api_ExtOpt$71$1 com_alibaba_ariver_app_api_extopt_71_1) {
            super(0);
            this.this$0 = com_alibaba_ariver_app_api_extopt_71_1;
        }

        @NotNull
        public final com_alibaba_ariver_app_api_ExtOpt$75$1 invoke() {
            return this.this$0.loyaltyEntityDataFactory.createData("local");
        }
    }
}
