package o;

import id.dana.contract.deeplink.path.FeatureParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.EngineUtils;
import o.FileCache;
import o.WebSocketImpl;
import o.b;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H@ø\u0001\u0000¢\u0006\u0002\u0010)JB\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,0+2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00100\u001a\u000201H\u0016J)\u00102\u001a\u0002032\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00104\u001a\u000201H@ø\u0001\u0000¢\u0006\u0002\u00105J'\u00106\u001a\b\u0012\u0004\u0012\u0002070-2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0002\u00108J7\u00109\u001a\b\u0012\u0004\u0012\u00020:0-2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010;J?\u0010<\u001a\u00020=2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001c0-H@ø\u0001\u0000¢\u0006\u0002\u0010?J!\u0010@\u001a\u00020A2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0002\u00108J\u0011\u0010B\u001a\u000201H@ø\u0001\u0000¢\u0006\u0002\u0010CJ!\u0010D\u001a\u00020E2\u0006\u0010/\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0002\u00108J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u000201H@ø\u0001\u0000¢\u0006\u0002\u0010JR\u000e\u0010\u0013\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, d2 = {"Lid/dana/data/nearbyme/repository/MerchantInfoEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "danaDealsVoucherOrderMapper", "Lid/dana/data/nearbyme/mapper/DanaDealsVoucherOrderMapper;", "localMerchantInfoEntityData", "Lid/dana/data/nearbyme/repository/source/session/LocalMerchantInfoEntityData;", "networkMerchantInfoEntityData", "Lid/dana/data/nearbyme/repository/source/network/NetworkMerchantInfoEntityData;", "networkNearbyMeEntityData", "Lid/dana/data/nearbyme/repository/source/network/NetworkNearbyMeEntityData;", "accountEntityData", "nearbyShopsResultMapper", "Lid/dana/data/nearbyme/mapper/NearbyShopsResultMapper;", "nearbyMeEntityRepository", "Lid/dana/data/nearbyme/repository/NearbyMeEntityRepository;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/nearbyme/mapper/DanaDealsVoucherOrderMapper;Lid/dana/data/nearbyme/repository/source/session/LocalMerchantInfoEntityData;Lid/dana/data/nearbyme/repository/source/network/NetworkMerchantInfoEntityData;Lid/dana/data/nearbyme/repository/source/network/NetworkNearbyMeEntityData;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/nearbyme/mapper/NearbyShopsResultMapper;Lid/dana/data/nearbyme/repository/NearbyMeEntityRepository;)V", "consultMerchantReview", "Lid/dana/domain/nearbyme/model/MerchantConsult;", "shopId", "", "pageSize", "", "pageNum", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDanaDealsVoucherOrder", "Lid/dana/domain/nearbyme/model/ProductOrder;", "danaDealsOrderRequest", "Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;", "(Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createProductOrder", "createOrderRequest", "Lid/dana/domain/exploredana/model/CreateOrderRequest;", "(Lid/dana/domain/exploredana/model/CreateOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantImage", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/domain/social/Result$Success;", "", "Lid/dana/domain/nearbyme/model/MerchantImage;", "merchantId", "skipCache", "", "getMerchantInfo", "Lid/dana/domain/nearbyme/model/Shop;", "useNewMerchantCategory", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantPromo", "Lid/dana/domain/nearbyme/model/PromoInfo;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantPromoDanaDeal", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantReview", "Lid/dana/domain/nearbyme/model/MerchantReviews;", "filterCriteria", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantReviewSummary", "Lid/dana/domain/nearbyme/model/MerchantReviewSummary;", "getReviewCoachmark", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAdditionalInfo", "Lid/dana/domain/nearbyme/model/MerchantAdditionalInfo;", "bizInfo", "setReviewCoachmark", "", "enabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class tryToInjectStartupParamsAndPushWorker extends setMinProgress implements setStorageProxy {
    private final DialogLayout accountEntityData;
    private final removeProxy danaDealsVoucherOrderMapper;
    /* access modifiers changed from: private */
    public final setSource localMerchantInfoEntityData;
    private final setTargetExtension nearbyMeEntityRepository;
    private final EngineUtils nearbyShopsResultMapper;
    /* access modifiers changed from: private */
    public final isSticky networkMerchantInfoEntityData;
    private final BindingExecutor networkNearbyMeEntityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH@"}, d2 = {"getMerchantInfo", "", "merchantId", "", "shopId", "useNewMerchantCategory", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/Shop;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {0}, l = {71}, m = "getMerchantInfo", n = {"this"}, s = {"L$0"})
    static final class IsOverlapping extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
            super(continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getMerchantInfo((String) null, (String) null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@"}, d2 = {"getMerchantReview", "", "merchantId", "", "shopId", "pageNum", "", "pageSize", "filterCriteria", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/MerchantReviews;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {}, l = {96}, m = "getMerchantReview", n = {}, s = {})
    static final class equals extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
            super(continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getMerchantReview((String) null, (String) null, 0, 0, (List<String>) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH@"}, d2 = {"consultMerchantReview", "", "shopId", "", "pageSize", "", "pageNum", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/MerchantConsult;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {0}, l = {160}, m = "consultMerchantReview", n = {"this"}, s = {"L$0"})
    static final class getMin extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
            super(continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.consultMerchantReview((String) null, 0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"getMerchantReviewSummary", "", "merchantId", "", "shopId", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/MerchantReviewSummary;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {}, l = {80}, m = "getMerchantReviewSummary", n = {}, s = {})
    static final class isInside extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
            super(continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getMerchantReviewSummary((String) null, (String) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"createDanaDealsVoucherOrder", "", "danaDealsOrderRequest", "Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/ProductOrder;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {}, l = {150}, m = "createDanaDealsVoucherOrder", n = {}, s = {})
    static final class setMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
            super(continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createDanaDealsVoucherOrder((getAndroidIdEncrypt) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH@"}, d2 = {"getMerchantPromoDanaDeal", "", "merchantId", "", "shopId", "pageNum", "", "pageSize", "continuation", "Lkotlin/coroutines/Continuation;", "", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {}, l = {136}, m = "getMerchantPromoDanaDeal", n = {}, s = {})
    static final class toIntRange extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
            super(continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getMerchantPromoDanaDeal((String) null, (String) null, 0, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"createProductOrder", "", "createOrderRequest", "Lid/dana/domain/exploredana/model/CreateOrderRequest;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/ProductOrder;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository", f = "MerchantInfoEntityRepository.kt", i = {}, l = {201}, m = "createProductOrder", n = {}, s = {})
    static final class getMax extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, Continuation continuation) {
            super(continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createProductOrder((getSerifFontFamily) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public tryToInjectStartupParamsAndPushWorker(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull removeProxy removeproxy, @NotNull setSource setsource, @NotNull isSticky issticky, @NotNull BindingExecutor bindingExecutor, @NotNull DialogLayout dialogLayout2, @NotNull EngineUtils engineUtils, @NotNull setTargetExtension settargetextension) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(removeproxy, "danaDealsVoucherOrderMapper");
        Intrinsics.checkNotNullParameter(setsource, "localMerchantInfoEntityData");
        Intrinsics.checkNotNullParameter(issticky, "networkMerchantInfoEntityData");
        Intrinsics.checkNotNullParameter(bindingExecutor, "networkNearbyMeEntityData");
        Intrinsics.checkNotNullParameter(dialogLayout2, "accountEntityData");
        Intrinsics.checkNotNullParameter(engineUtils, "nearbyShopsResultMapper");
        Intrinsics.checkNotNullParameter(settargetextension, "nearbyMeEntityRepository");
        this.danaDealsVoucherOrderMapper = removeproxy;
        this.localMerchantInfoEntityData = setsource;
        this.networkMerchantInfoEntityData = issticky;
        this.networkNearbyMeEntityData = bindingExecutor;
        this.accountEntityData = dialogLayout2;
        this.nearbyShopsResultMapper = engineUtils;
        this.nearbyMeEntityRepository = settargetextension;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMerchantInfo(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.GriverConfigUtils> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof o.tryToInjectStartupParamsAndPushWorker.IsOverlapping
            if (r0 == 0) goto L_0x0014
            r0 = r9
            o.tryToInjectStartupParamsAndPushWorker$IsOverlapping r0 = (o.tryToInjectStartupParamsAndPushWorker.IsOverlapping) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L_0x0019
        L_0x0014:
            o.tryToInjectStartupParamsAndPushWorker$IsOverlapping r0 = new o.tryToInjectStartupParamsAndPushWorker$IsOverlapping
            r0.<init>(r5, r9)
        L_0x0019:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r6 = r0.L$0
            o.tryToInjectStartupParamsAndPushWorker r6 = (o.tryToInjectStartupParamsAndPushWorker) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x006e
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r9)
            o.setTargetExtension r9 = r5.nearbyMeEntityRepository
            o.TitleBarRightButtonView$1 r9 = r9.getMerchantTopupAgent()
            java.lang.Object r9 = r9.blockingFirst()
            java.util.Map r9 = (java.util.Map) r9
            o.setTargetExtension r2 = r5.nearbyMeEntityRepository
            o.TitleBarRightButtonView$1 r2 = r2.getMerchantSubcategories(r8)
            java.lang.Object r2 = r2.blockingFirst()
            java.util.Map r2 = (java.util.Map) r2
            o.EngineUtils r4 = r5.nearbyShopsResultMapper
            r4.setUsingNewMerchantCategories(r8)
            o.EngineUtils r8 = r5.nearbyShopsResultMapper
            r8.setMerchantInstId(r9)
            o.EngineUtils r8 = r5.nearbyShopsResultMapper
            r8.setMerchantSubcategory(r2)
            o.isSticky r8 = r5.networkMerchantInfoEntityData
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r9 = r8.getMerchantInfo(r6, r7, r0)
            if (r9 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r6 = r5
        L_0x006e:
            o.NativeCallContext r9 = (o.NativeCallContext) r9
            o.Render r7 = r9.getShopInfo()
            o.EngineUtils r6 = r6.nearbyShopsResultMapper
            o.GriverConfigUtils r6 = r6.transformShopEntity(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.getMerchantInfo(java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMerchantReviewSummary(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.containCachePath> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.tryToInjectStartupParamsAndPushWorker.isInside
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.tryToInjectStartupParamsAndPushWorker$isInside r0 = (o.tryToInjectStartupParamsAndPushWorker.isInside) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.tryToInjectStartupParamsAndPushWorker$isInside r0 = new o.tryToInjectStartupParamsAndPushWorker$isInside
            r0.<init>(r4, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0040
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r7)
            o.isSticky r7 = r4.networkMerchantInfoEntityData
            r0.label = r3
            java.lang.Object r7 = r7.getMerchantReviewSummary(r5, r6, r0)
            if (r7 != r1) goto L_0x0040
            return r1
        L_0x0040:
            o.newBuilder r7 = (o.newBuilder) r7
            o.containCachePath r5 = r7.toMerchantReviewSummary()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.getMerchantReviewSummary(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMerchantReview(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, int r11, int r12, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.getSubDir> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof o.tryToInjectStartupParamsAndPushWorker.equals
            if (r0 == 0) goto L_0x0014
            r0 = r14
            o.tryToInjectStartupParamsAndPushWorker$equals r0 = (o.tryToInjectStartupParamsAndPushWorker.equals) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            o.tryToInjectStartupParamsAndPushWorker$equals r0 = new o.tryToInjectStartupParamsAndPushWorker$equals
            r0.<init>(r8, r14)
        L_0x0019:
            r7 = r0
            java.lang.Object r14 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0046
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r14)
            o.isSticky r1 = r8.networkMerchantInfoEntityData
            r7.label = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r14 = r1.getMerchantReview(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto L_0x0046
            return r0
        L_0x0046:
            o.getParams r14 = (o.getParams) r14
            o.getSubDir r9 = r14.toMerchantReviews()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.getMerchantReview(java.lang.String, java.lang.String, int, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository$getMerchantImage$1", f = "MerchantInfoEntityRepository.kt", i = {0, 1}, l = {107, 108, 114}, m = "invokeSuspend", n = {"$this$flow", "$this$run"}, s = {"L$0", "L$0"})
    static final class length extends SuspendLambda implements Function2<onWebsocketPong<? super InitParams>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $merchantId;
        final /* synthetic */ int $pageNum;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $shopId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, String str, String str2, int i, int i2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
            this.$merchantId = str;
            this.$shopId = str2;
            this.$pageNum = i;
            this.$pageSize = i2;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            length length = new length(this.this$0, this.$merchantId, this.$shopId, this.$pageNum, this.$pageSize, continuation);
            length.L$0 = obj;
            return length;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((length) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: o.onWebsocketPong} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002e
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0079
            L_0x0015:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001d:
                java.lang.Object r1 = r11.L$0
                o.InitParams r1 = (o.InitParams) r1
                kotlin.ResultKt.throwOnFailure(r12)
                r8 = r1
                goto L_0x005e
            L_0x0026:
                java.lang.Object r1 = r11.L$0
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0050
            L_0x002e:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                o.tryToInjectStartupParamsAndPushWorker r12 = r11.this$0
                o.isSticky r5 = r12.networkMerchantInfoEntityData
                java.lang.String r6 = r11.$merchantId
                java.lang.String r7 = r11.$shopId
                int r8 = r11.$pageNum
                int r9 = r11.$pageSize
                r11.L$0 = r1
                r11.label = r4
                r10 = r11
                java.lang.Object r12 = r5.getMerchantImage(r6, r7, r8, r9, r10)
                if (r12 != r0) goto L_0x0050
                return r0
            L_0x0050:
                o.InitParams r12 = (o.InitParams) r12
                r11.L$0 = r12
                r11.label = r3
                java.lang.Object r1 = r1.emit(r12, r11)
                if (r1 != r0) goto L_0x005d
                return r0
            L_0x005d:
                r8 = r12
            L_0x005e:
                o.tryToInjectStartupParamsAndPushWorker r12 = r11.this$0
                o.setSource r3 = r12.localMerchantInfoEntityData
                java.lang.String r4 = r11.$merchantId
                java.lang.String r5 = r11.$shopId
                int r6 = r11.$pageNum
                int r7 = r11.$pageSize
                r12 = 0
                r11.L$0 = r12
                r11.label = r2
                r9 = r11
                java.lang.Object r12 = r3.saveMerchantImage(r4, r5, r6, r7, r8, r9)
                if (r12 != r0) goto L_0x0079
                return r0
            L_0x0079:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.length.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements onWebsocketHandshakeSentAsClient<forThisDevice.setMax<? extends List<? extends getUtdid>>> {
        final /* synthetic */ onWebsocketHandshakeSentAsClient $this_unsafeTransform$inlined;

        public setMax(onWebsocketHandshakeSentAsClient onwebsockethandshakesentasclient) {
            this.$this_unsafeTransform$inlined = onwebsockethandshakesentasclient;
        }

        @Nullable
        public final Object collect(@NotNull final onWebsocketPong onwebsocketpong, @NotNull Continuation continuation) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new onWebsocketPong<InitParams>() {
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    Object emit = onwebsocketpong.emit(new forThisDevice.setMax(((InitParams) obj).toMerchantImages()), continuation);
                    return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
                }
            }, continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
    }

    @NotNull
    public final onWebsocketHandshakeSentAsClient<forThisDevice.setMax<List<getUtdid>>> getMerchantImage(@NotNull String str, @NotNull String str2, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        return new setMax(new WebSocketImpl.setMin(new createWebSocket(new length(this, str, str2, i, i2, (Continuation) null)), new toFloatRange(this, z, str, str2, i, i2, (Continuation) null)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lid/dana/data/nearbyme/repository/source/network/result/merchantdetail/MerchantImageResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantInfoEntityRepository$getMerchantImage$2", f = "MerchantInfoEntityRepository.kt", i = {0}, l = {122, 125}, m = "invokeSuspend", n = {"$this$onStart"}, s = {"L$0"})
    static final class toFloatRange extends SuspendLambda implements Function2<onWebsocketPong<? super InitParams>, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $merchantId;
        final /* synthetic */ int $pageNum;
        final /* synthetic */ int $pageSize;
        final /* synthetic */ String $shopId;
        final /* synthetic */ boolean $skipCache;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ tryToInjectStartupParamsAndPushWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(tryToInjectStartupParamsAndPushWorker trytoinjectstartupparamsandpushworker, boolean z, String str, String str2, int i, int i2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = trytoinjectstartupparamsandpushworker;
            this.$skipCache = z;
            this.$merchantId = str;
            this.$shopId = str2;
            this.$pageNum = i;
            this.$pageSize = i2;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            toFloatRange tofloatrange = new toFloatRange(this.this$0, this.$skipCache, this.$merchantId, this.$shopId, this.$pageNum, this.$pageSize, continuation);
            tofloatrange.L$0 = obj;
            return tofloatrange;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((toFloatRange) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.onWebsocketPong} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0075
            L_0x0012:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001a:
                java.lang.Object r1 = r10.L$0
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x004b
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                boolean r11 = r10.$skipCache
                if (r11 == 0) goto L_0x0031
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            L_0x0031:
                o.tryToInjectStartupParamsAndPushWorker r11 = r10.this$0
                o.setSource r4 = r11.localMerchantInfoEntityData
                java.lang.String r5 = r10.$merchantId
                java.lang.String r6 = r10.$shopId
                int r7 = r10.$pageNum
                int r8 = r10.$pageSize
                r10.L$0 = r1
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.getMerchantImage(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L_0x004b
                return r0
            L_0x004b:
                r4 = r11
                o.InitParams r4 = (o.InitParams) r4
                java.util.List r4 = r4.getImages()
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                r3 = r3 ^ r4
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                boolean r3 = r3.booleanValue()
                r4 = 0
                if (r3 == 0) goto L_0x0065
                goto L_0x0066
            L_0x0065:
                r11 = r4
            L_0x0066:
                o.InitParams r11 = (o.InitParams) r11
                if (r11 == 0) goto L_0x0075
                r10.L$0 = r4
                r10.label = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L_0x0075
                return r0
            L_0x0075:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.toFloatRange.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getMerchantPromoDanaDeal(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9, int r10, int r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<o.mediaMounted>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof o.tryToInjectStartupParamsAndPushWorker.toIntRange
            if (r0 == 0) goto L_0x0014
            r0 = r12
            o.tryToInjectStartupParamsAndPushWorker$toIntRange r0 = (o.tryToInjectStartupParamsAndPushWorker.toIntRange) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            o.tryToInjectStartupParamsAndPushWorker$toIntRange r0 = new o.tryToInjectStartupParamsAndPushWorker$toIntRange
            r0.<init>(r7, r12)
        L_0x0019:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0045
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r12)
            o.isSticky r1 = r7.networkMerchantInfoEntityData
            r6.label = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.getMerchantPromoDanaDeal(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L_0x0045
            return r0
        L_0x0045:
            o.setPluginId r12 = (o.setPluginId) r12
            java.util.List r8 = r12.toProductInfoList()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.getMerchantPromoDanaDeal(java.lang.String, java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createDanaDealsVoucherOrder(@org.jetbrains.annotations.NotNull o.getAndroidIdEncrypt r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.getSubPath> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.tryToInjectStartupParamsAndPushWorker.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.tryToInjectStartupParamsAndPushWorker$setMin r0 = (o.tryToInjectStartupParamsAndPushWorker.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.tryToInjectStartupParamsAndPushWorker$setMin r0 = new o.tryToInjectStartupParamsAndPushWorker$setMin
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x006d
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            o.removeProxy r6 = r4.danaDealsVoucherOrderMapper
            java.lang.Object r5 = r6.apply(r5)
            o.getPluginId r5 = (o.getPluginId) r5
            o.DialogLayout r6 = r4.accountEntityData
            java.lang.String r2 = "local"
            o.setDrawDivider r6 = r6.createData((java.lang.String) r2)
            java.lang.String r2 = "accountEntityData.createData(Source.LOCAL)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            o.TitleBarRightButtonView$1 r6 = r6.getUserId()
            java.lang.Object r6 = r6.blockingFirst()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r2 = "userId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r5.setParam(r6)
            o.isSticky r6 = r4.networkMerchantInfoEntityData
            java.lang.String r2 = "productOrderRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r0.label = r3
            java.lang.Object r6 = r6.createProductOrder(r5, r0)
            if (r6 != r1) goto L_0x006d
            return r1
        L_0x006d:
            o.setParams r6 = (o.setParams) r6
            o.getSubPath r5 = r6.toProductOrder()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.createDanaDealsVoucherOrder(o.getAndroidIdEncrypt, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object consultMerchantReview(@org.jetbrains.annotations.NotNull java.lang.String r5, int r6, int r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.DiskUtil> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof o.tryToInjectStartupParamsAndPushWorker.getMin
            if (r0 == 0) goto L_0x0014
            r0 = r8
            o.tryToInjectStartupParamsAndPushWorker$getMin r0 = (o.tryToInjectStartupParamsAndPushWorker.getMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            o.tryToInjectStartupParamsAndPushWorker$getMin r0 = new o.tryToInjectStartupParamsAndPushWorker$getMin
            r0.<init>(r4, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r5 = r0.L$0
            o.tryToInjectStartupParamsAndPushWorker r5 = (o.tryToInjectStartupParamsAndPushWorker) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0064
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r8)
            o.isSticky r8 = r4.networkMerchantInfoEntityData
            r2 = r5
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            o.callBridgeApi r2 = new o.callBridgeApi
            r2.<init>(r5, r6, r7)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r8 = r8.consultMerchantReview(r2, r0)
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r5 = r4
        L_0x0064:
            o.GoBackCallback r8 = (o.GoBackCallback) r8
            o.EngineUtils r5 = r5.nearbyShopsResultMapper
            o.DiskUtil r5 = r8.toMerchantConsult(r8, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.consultMerchantReview(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object queryAdditionalInfo(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.getIMEIEncrypt> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o.tryToInjectStartupParamsAndPushWorker$FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.tryToInjectStartupParamsAndPushWorker$FastBitmap$CoordinateSystem r0 = (o.tryToInjectStartupParamsAndPushWorker$FastBitmap$CoordinateSystem) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.tryToInjectStartupParamsAndPushWorker$FastBitmap$CoordinateSystem r0 = new o.tryToInjectStartupParamsAndPushWorker$FastBitmap$CoordinateSystem
            r0.<init>(r4, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0045
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r7)
            o.isSticky r7 = r4.networkMerchantInfoEntityData
            o.getSourceProcess r2 = new o.getSourceProcess
            r2.<init>(r5, r6)
            r0.label = r3
            java.lang.Object r7 = r7.queryAdditionalInfo(r2, r0)
            if (r7 != r1) goto L_0x0045
            return r1
        L_0x0045:
            o.LoadParams r7 = (o.LoadParams) r7
            o.getIMEIEncrypt r5 = r7.toMerchantAdditionalInfo()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.queryAdditionalInfo(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object getReviewCoachmark(@NotNull Continuation<? super Boolean> continuation) {
        return this.localMerchantInfoEntityData.getCoachmarkVisibility(continuation);
    }

    @Nullable
    public final Object setReviewCoachmark(boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object coachmarkVisibility = this.localMerchantInfoEntityData.setCoachmarkVisibility(z, continuation);
        if (coachmarkVisibility == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return coachmarkVisibility;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object getMerchantPromo(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super List<FileCache.AnonymousClass1>> continuation) {
        List<setScrollChangedCallback> promoInfos;
        ApiContext apiContext = new ApiContext();
        apiContext.merchantId = str;
        apiContext.shopId = str2;
        EngineInitCallback blockingFirst = this.networkNearbyMeEntityData.getNearbyMerchantPromo(CollectionsKt.listOf(apiContext)).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "nearbyShopsPromoResult");
        List<EngineUtils.AnonymousClass2.AnonymousClass1> shops = blockingFirst.getShops();
        Intrinsics.checkNotNullExpressionValue(shops, "nearbyShopsPromoResult.shops");
        EngineUtils.AnonymousClass2.AnonymousClass1 r1 = (EngineUtils.AnonymousClass2.AnonymousClass1) CollectionsKt.firstOrNull(shops);
        if (r1 == null || (promoInfos = r1.getPromoInfos()) == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<setScrollChangedCallback> iterable = promoInfos;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (setScrollChangedCallback promoInfo : iterable) {
            arrayList.add(promoInfo.toPromoInfo());
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createProductOrder(@org.jetbrains.annotations.NotNull o.getSerifFontFamily r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.getSubPath> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof o.tryToInjectStartupParamsAndPushWorker.getMax
            if (r2 == 0) goto L_0x0018
            r2 = r1
            o.tryToInjectStartupParamsAndPushWorker$getMax r2 = (o.tryToInjectStartupParamsAndPushWorker.getMax) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0018
            int r1 = r2.label
            int r1 = r1 - r4
            r2.label = r1
            goto L_0x001d
        L_0x0018:
            o.tryToInjectStartupParamsAndPushWorker$getMax r2 = new o.tryToInjectStartupParamsAndPushWorker$getMax
            r2.<init>(r0, r1)
        L_0x001d:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0091
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r1)
            o.getAppDir r1 = r24.getAmount()
            if (r1 == 0) goto L_0x0051
            o.onWorkerReady r4 = new o.onWorkerReady
            java.lang.String r6 = r1.getAmount()
            java.lang.String r7 = r1.getCurrency()
            java.lang.String r1 = r1.getCurrencyCode()
            r4.<init>(r6, r7, r1)
            goto L_0x005c
        L_0x0051:
            o.onWorkerReady r4 = new o.onWorkerReady
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x005c:
            r21 = r4
            o.isSticky r1 = r0.networkMerchantInfoEntityData
            o.getPluginId r4 = new o.getPluginId
            java.lang.String r15 = r24.getProductCode()
            java.lang.String r16 = r24.getGoodsId()
            java.lang.String r6 = r24.getAggregatorGoodsId()
            if (r6 != 0) goto L_0x0072
            java.lang.String r6 = ""
        L_0x0072:
            r17 = r6
            java.lang.String r18 = r24.getRequestId()
            java.lang.String r19 = r24.getParam()
            java.lang.String r20 = r24.getSecondaryBizParam()
            java.lang.String r22 = r24.getBizType()
            r14 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r2.label = r5
            java.lang.Object r1 = r1.createProductOrder(r4, r2)
            if (r1 != r3) goto L_0x0091
            return r3
        L_0x0091:
            o.setParams r1 = (o.setParams) r1
            o.getSubPath r1 = r1.toProductOrder()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tryToInjectStartupParamsAndPushWorker.createProductOrder(o.getSerifFontFamily, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
