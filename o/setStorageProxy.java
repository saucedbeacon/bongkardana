package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0012JH\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001aH&J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010!J;\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010$JE\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H¦@ø\u0001\u0000¢\u0006\u0002\u0010(J!\u0010)\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010+\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010,J!\u0010-\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u00103ø\u0001\u0001\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, d2 = {"Lid/dana/domain/nearbyme/MerchantInfoRepository;", "", "consultMerchantReview", "Lid/dana/domain/nearbyme/model/MerchantConsult;", "shopId", "", "pageSize", "", "pageNum", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDanaDealsVoucherOrder", "Lid/dana/domain/nearbyme/model/ProductOrder;", "danaDealsOrderRequest", "Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;", "(Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createProductOrder", "createOrderRequest", "Lid/dana/domain/exploredana/model/CreateOrderRequest;", "(Lid/dana/domain/exploredana/model/CreateOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantImage", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/domain/social/Result;", "", "Lid/dana/domain/nearbyme/model/MerchantImage;", "merchantId", "skipCache", "", "getMerchantInfo", "Lid/dana/domain/nearbyme/model/Shop;", "useNewMerchantCategory", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantPromo", "Lid/dana/domain/nearbyme/model/PromoInfo;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantPromoDanaDeal", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantReview", "Lid/dana/domain/nearbyme/model/MerchantReviews;", "filterCriteria", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantReviewSummary", "Lid/dana/domain/nearbyme/model/MerchantReviewSummary;", "getReviewCoachmark", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAdditionalInfo", "Lid/dana/domain/nearbyme/model/MerchantAdditionalInfo;", "bizInfo", "setReviewCoachmark", "", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface setStorageProxy {
    @Nullable
    Object consultMerchantReview(@NotNull String str, int i, int i2, @NotNull Continuation<? super DiskUtil> continuation);

    @Nullable
    Object createDanaDealsVoucherOrder(@NotNull getAndroidIdEncrypt getandroididencrypt, @NotNull Continuation<? super getSubPath> continuation);

    @Nullable
    Object createProductOrder(@NotNull getSerifFontFamily getseriffontfamily, @NotNull Continuation<? super getSubPath> continuation);

    @NotNull
    onWebsocketHandshakeSentAsClient<forThisDevice<List<getUtdid>>> getMerchantImage(@NotNull String str, @NotNull String str2, int i, int i2, boolean z);

    @Nullable
    Object getMerchantInfo(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation<? super GriverConfigUtils> continuation);

    @Nullable
    Object getMerchantPromo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super List<FileCache.AnonymousClass1>> continuation);

    @Nullable
    Object getMerchantPromoDanaDeal(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super List<mediaMounted>> continuation);

    @Nullable
    Object getMerchantReview(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<String> list, @NotNull Continuation<? super getSubDir> continuation);

    @Nullable
    Object getMerchantReviewSummary(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super containCachePath> continuation);

    @Nullable
    Object getReviewCoachmark(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryAdditionalInfo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super getIMEIEncrypt> continuation);

    @Nullable
    Object setReviewCoachmark(boolean z, @NotNull Continuation<? super Unit> continuation);
}
