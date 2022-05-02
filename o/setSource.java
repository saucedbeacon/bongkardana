package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.KClassesJvm;
import o.NativeCallContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J1\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ1\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ?\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150#H@ø\u0001\u0000¢\u0006\u0002\u0010$J!\u0010%\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0019\u0010'\u001a\u00020(2\u0006\u0010\f\u001a\u00020)H@ø\u0001\u0000¢\u0006\u0002\u0010*J9\u0010+\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0019\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0002\u00101R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lid/dana/data/nearbyme/repository/source/session/LocalMerchantInfoEntityData;", "Lid/dana/data/nearbyme/MerchantInfoEntityData;", "merchantInfoPreferences", "Lid/dana/data/nearbyme/repository/source/session/MerchantInfoPreferences;", "(Lid/dana/data/nearbyme/repository/source/session/MerchantInfoPreferences;)V", "createProductOrder", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/ProductOrderResult;", "productOrderRequest", "Lid/dana/data/nearbyme/repository/source/network/request/ProductOrderRequest;", "(Lid/dana/data/nearbyme/repository/source/network/request/ProductOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantreview/MerchantCreateReviewResult;", "request", "Lid/dana/data/nearbyme/repository/source/network/request/merchantreview/MerchantCreateReviewRequest;", "(Lid/dana/data/nearbyme/repository/source/network/request/merchantreview/MerchantCreateReviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCoachmarkVisibility", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantImage", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;", "merchantId", "", "shopId", "pageNum", "", "pageSize", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantInfo", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantDetailInfoResult;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantPromoDanaDeal", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantPromoDanaDealResult;", "getMerchantReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantQueryReviewResult;", "filterCriteria", "", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantReviewSummary", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantReviewSummaryResult;", "queryAdditionalInfo", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantAdditionalInfoResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantAdditionalInfoRequest;", "(Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantAdditionalInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMerchantImage", "", "data", "(Ljava/lang/String;Ljava/lang/String;IILid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCoachmarkVisibility", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setSource {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String MERCHANT_COACHMARK = "user_review_coachmark";
    private final NativeCallContext.AnonymousClass1 merchantInfoPreferences;

    @Inject
    public setSource(@NotNull NativeCallContext.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "merchantInfoPreferences");
        this.merchantInfoPreferences = r2;
    }

    @Nullable
    public final Object getMerchantInfo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super NativeCallContext> continuation) {
        onSingleFailed preferenceFacade$data_productionRelease = this.merchantInfoPreferences.getPreferenceFacade$data_productionRelease();
        StringBuilder sb = new StringBuilder();
        sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(NativeCallContext.class)));
        sb.append("");
        Object object = preferenceFacade$data_productionRelease.getObject(sb.toString(), NativeCallContext.class);
        Intrinsics.checkNotNullExpressionValue(object, "merchantInfoPreferences.…rchantDetailInfoResult>()");
        return object;
    }

    @Nullable
    public final Object getMerchantReviewSummary(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super newBuilder> continuation) {
        onSingleFailed preferenceFacade$data_productionRelease = this.merchantInfoPreferences.getPreferenceFacade$data_productionRelease();
        StringBuilder sb = new StringBuilder();
        sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(newBuilder.class)));
        sb.append("");
        Object object = preferenceFacade$data_productionRelease.getObject(sb.toString(), newBuilder.class);
        Intrinsics.checkNotNullExpressionValue(object, "merchantInfoPreferences.…antReviewSummaryResult>()");
        return object;
    }

    @Nullable
    public final Object getMerchantReview(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<String> list, @NotNull Continuation<? super getParams> continuation) {
        onSingleFailed preferenceFacade$data_productionRelease = this.merchantInfoPreferences.getPreferenceFacade$data_productionRelease();
        StringBuilder sb = new StringBuilder();
        sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(getParams.class)));
        sb.append("");
        Object object = preferenceFacade$data_productionRelease.getObject(sb.toString(), getParams.class);
        Intrinsics.checkNotNullExpressionValue(object, "merchantInfoPreferences.…chantQueryReviewResult>()");
        return object;
    }

    @Nullable
    public final Object getMerchantImage(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super InitParams> continuation) {
        return this.merchantInfoPreferences.getMerchantImageResult(str, str2, i, i2);
    }

    @Nullable
    public final Object saveMerchantImage(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull InitParams initParams, @NotNull Continuation<? super Unit> continuation) {
        this.merchantInfoPreferences.saveMerchantImageResult(str, str2, i, i2, initParams);
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getMerchantPromoDanaDeal(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super setPluginId> continuation) {
        onSingleFailed preferenceFacade$data_productionRelease = this.merchantInfoPreferences.getPreferenceFacade$data_productionRelease();
        StringBuilder sb = new StringBuilder();
        sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(setPluginId.class)));
        sb.append("");
        Object object = preferenceFacade$data_productionRelease.getObject(sb.toString(), setPluginId.class);
        Intrinsics.checkNotNullExpressionValue(object, "merchantInfoPreferences.…antPromoDanaDealResult>()");
        return object;
    }

    @Nullable
    public final Object createProductOrder(@NotNull getPluginId getpluginid, @NotNull Continuation<? super setParams> continuation) {
        onSingleFailed preferenceFacade$data_productionRelease = this.merchantInfoPreferences.getPreferenceFacade$data_productionRelease();
        StringBuilder sb = new StringBuilder();
        sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(setParams.class)));
        sb.append("");
        Object object = preferenceFacade$data_productionRelease.getObject(sb.toString(), setParams.class);
        Intrinsics.checkNotNullExpressionValue(object, "merchantInfoPreferences.…ect<ProductOrderResult>()");
        return object;
    }

    @Nullable
    public final Object createReview(@NotNull ExitCallback exitCallback, @NotNull Continuation<? super setAppxDomain> continuation) {
        onSingleFailed preferenceFacade$data_productionRelease = this.merchantInfoPreferences.getPreferenceFacade$data_productionRelease();
        StringBuilder sb = new StringBuilder();
        sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(setAppxDomain.class)));
        sb.append("");
        Object object = preferenceFacade$data_productionRelease.getObject(sb.toString(), setAppxDomain.class);
        Intrinsics.checkNotNullExpressionValue(object, "merchantInfoPreferences.…hantCreateReviewResult>()");
        return object;
    }

    @Nullable
    public final Object queryAdditionalInfo(@NotNull getSourceProcess getsourceprocess, @NotNull Continuation<? super LoadParams> continuation) {
        onSingleFailed preferenceFacade$data_productionRelease = this.merchantInfoPreferences.getPreferenceFacade$data_productionRelease();
        StringBuilder sb = new StringBuilder();
        sb.append(KClassesJvm.getJvmName(Reflection.getOrCreateKotlinClass(LoadParams.class)));
        sb.append("");
        Object object = preferenceFacade$data_productionRelease.getObject(sb.toString(), LoadParams.class);
        Intrinsics.checkNotNullExpressionValue(object, "merchantInfoPreferences.getObject()");
        return object;
    }

    @Nullable
    public final Object getCoachmarkVisibility(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.merchantInfoPreferences.getBoolean(MERCHANT_COACHMARK, true));
    }

    @Nullable
    public final Object setCoachmarkVisibility(boolean z, @NotNull Continuation<? super Unit> continuation) {
        this.merchantInfoPreferences.saveBoolean(MERCHANT_COACHMARK, z);
        return Unit.INSTANCE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/nearbyme/repository/source/session/LocalMerchantInfoEntityData$Companion;", "", "()V", "MERCHANT_COACHMARK", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final Object consultMerchantReview(@NotNull callBridgeApi callbridgeapi, @NotNull Continuation<? super GoBackCallback> continuation) {
        return new GoBackCallback((List) null, (Boolean) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }
}
