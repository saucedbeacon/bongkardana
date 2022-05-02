package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import o.CreateParams;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0017H'J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u001aH'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001aH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/MerchantInfoFacade;", "", "consultReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantConsultResult;", "request", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/BaseMerchantInfoRequest;", "createProductOrder", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/ProductOrderResult;", "Lid/dana/data/nearbyme/repository/source/network/request/ProductOrderRequest;", "createReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantreview/MerchantCreateReviewResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantreview/MerchantCreateReviewRequest;", "queryAdditionalInfo", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantAdditionalInfoResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantAdditionalInfoRequest;", "queryImage", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantImageRequest;", "queryInfo", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantDetailInfoResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantDetailInfoRequest;", "queryPromoDanaDeal", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantPromoDanaDealResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantPromoDanaDealRequest;", "queryReview", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantQueryReviewResult;", "Lid/dana/data/nearbyme/repository/source/network/request/merchantdetail/MerchantQueryReviewRequest;", "queryReviewSummary", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantReviewSummaryResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface BindingId {
    @OperationType("alipayplus.mobilewallet.merchant.info.consult")
    @NotNull
    @SignCheck
    GoBackCallback consultReview(@NotNull callBridgeApi callbridgeapi);

    @OperationType("alipayplus.mobilewallet.product.order")
    @NotNull
    setParams createProductOrder(@NotNull getPluginId getpluginid);

    @OperationType("alipayplus.mobilewallet.merchant.info.create.review")
    @NotNull
    setAppxDomain createReview(@NotNull ExitCallback exitCallback);

    @OperationType("alipayplus.mobilewallet.merchant.info.additional.information")
    @NotNull
    LoadParams queryAdditionalInfo(@NotNull getSourceProcess getsourceprocess);

    @OperationType("alipayplus.mobilewallet.merchant.info.image")
    @NotNull
    InitParams queryImage(@NotNull getInternalView getinternalview);

    @OperationType("alipayplus.mobilewallet.merchant.info.query")
    @NotNull
    @SignCheck
    NativeCallContext queryInfo(@NotNull sendEvent sendevent);

    @OperationType("alipayplus.mobilewallet.merchant.info.promo.deal")
    @NotNull
    setPluginId queryPromoDanaDeal(@NotNull CreateParams.AnonymousClass1 r1);

    @OperationType("alipayplus.mobilewallet.merchant.info.review.query")
    @NotNull
    getParams queryReview(@NotNull CreateParams createParams);

    @OperationType("alipayplus.mobilewallet.merchant.info.review.summary")
    @NotNull
    newBuilder queryReviewSummary(@NotNull CreateParams createParams);
}
