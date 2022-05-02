package o;

import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.domain.nearbyme.DefaultDispatcher;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.FileCache;
import o.decodeFrames;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetShopPromoAndDeals;", "Lid/dana/domain/core/usecase/FlowUseCase;", "Lid/dana/domain/nearbyme/interactor/GetShopPromoAndDeals$Params;", "Lid/dana/domain/nearbyme/model/PromoDealsInfo;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lid/dana/domain/social/Result;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isPreDownloadFileExists extends onHideCustomView<setMin, transferStringConfigToInt> {
    /* access modifiers changed from: private */
    public final setStorageProxy merchantInfoRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isPreDownloadFileExists(@NotNull setStorageProxy setstorageproxy, @NotNull @DefaultDispatcher APExpansion.AnonymousClass1 r3) {
        super(r3);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        Intrinsics.checkNotNullParameter(r3, "defaultDispatcher");
        this.merchantInfoRepository = setstorageproxy;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lid/dana/domain/nearbyme/model/PromoInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetShopPromoAndDeals$execute$promoFlow$1", f = "GetShopPromoAndDeals.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    static final class setMax extends SuspendLambda implements Function2<onWebsocketPong<? super List<? extends FileCache.AnonymousClass1>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ setMin $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ isPreDownloadFileExists this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(isPreDownloadFileExists ispredownloadfileexists, setMin setmin, Continuation continuation) {
            super(2, continuation);
            this.this$0 = ispredownloadfileexists;
            this.$params = setmin;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            setMax setmax = new setMax(this.this$0, this.$params, continuation);
            setmax.L$0 = obj;
            return setmax;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((setMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.onWebsocketPong} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0053
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.L$0
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0047
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                o.isPreDownloadFileExists r7 = r6.this$0
                o.setStorageProxy r7 = r7.merchantInfoRepository
                o.isPreDownloadFileExists$setMin r4 = r6.$params
                java.lang.String r4 = r4.getMerchantId()
                o.isPreDownloadFileExists$setMin r5 = r6.$params
                java.lang.String r5 = r5.getShopId()
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r7.getMerchantPromo(r4, r5, r6)
                if (r7 != r0) goto L_0x0047
                return r0
            L_0x0047:
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L_0x0053
                return r0
            L_0x0053:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isPreDownloadFileExists.setMax.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public final onWebsocketHandshakeSentAsClient<forThisDevice<transferStringConfigToInt>> execute(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return new decodeFrames.getMax(new createWebSocket(new setMax(this, setmin, (Continuation) null)), new createWebSocket(new getMax(this, setmin, (Continuation) null)), new length((Continuation) null));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetShopPromoAndDeals$execute$dealsFlow$1", f = "GetShopPromoAndDeals.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
    static final class getMax extends SuspendLambda implements Function2<onWebsocketPong<? super List<? extends mediaMounted>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ setMin $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ isPreDownloadFileExists this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(isPreDownloadFileExists ispredownloadfileexists, setMin setmin, Continuation continuation) {
            super(2, continuation);
            this.this$0 = ispredownloadfileexists;
            this.$params = setmin;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            getMax getmax = new getMax(this.this$0, this.$params, continuation);
            getmax.L$0 = obj;
            return getmax;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((getMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.onWebsocketPong} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0059
            L_0x0012:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001a:
                java.lang.Object r1 = r12.L$0
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x004d
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                o.onWebsocketPong r1 = (o.onWebsocketPong) r1
                o.isPreDownloadFileExists r13 = r12.this$0
                o.setStorageProxy r4 = r13.merchantInfoRepository
                o.isPreDownloadFileExists$setMin r13 = r12.$params
                java.lang.String r5 = r13.getMerchantId()
                o.isPreDownloadFileExists$setMin r13 = r12.$params
                java.lang.String r6 = r13.getShopId()
                r7 = 0
                r8 = 0
                r10 = 12
                r11 = 0
                r12.L$0 = r1
                r12.label = r3
                r9 = r12
                java.lang.Object r13 = o.GriverKVSpStorage.getMerchantPromoDanaDeal$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L_0x004d
                return r0
            L_0x004d:
                r3 = 0
                r12.L$0 = r3
                r12.label = r2
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L_0x0059
                return r0
            L_0x0059:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isPreDownloadFileExists.getMax.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lid/dana/domain/social/Result$Success;", "Lid/dana/domain/nearbyme/model/PromoDealsInfo;", "promoInfo", "", "Lid/dana/domain/nearbyme/model/PromoInfo;", "dealsInfo", "Lid/dana/domain/nearbyme/model/MerchantProductInfo;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetShopPromoAndDeals$execute$1", f = "GetShopPromoAndDeals.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class length extends SuspendLambda implements Function3<List<? extends FileCache.AnonymousClass1>, List<? extends mediaMounted>, Continuation<? super forThisDevice.setMax<? extends transferStringConfigToInt>>, Object> {
        private /* synthetic */ Object L$0;
        private /* synthetic */ Object L$1;
        int label;

        length(Continuation continuation) {
            super(3, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull List<FileCache.AnonymousClass1> list, @NotNull List<mediaMounted> list2, @NotNull Continuation<? super forThisDevice.setMax<transferStringConfigToInt>> continuation) {
            Intrinsics.checkNotNullParameter(list, "promoInfo");
            Intrinsics.checkNotNullParameter(list2, "dealsInfo");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            length length = new length(continuation);
            length.L$0 = list;
            length.L$1 = list2;
            return length;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ((length) create((List) obj, (List) obj2, (Continuation) obj3)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return new forThisDevice.setMax(new transferStringConfigToInt((List) this.L$0, (List) this.L$1));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetShopPromoAndDeals$Params;", "", "merchantId", "", "shopId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "getShopId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String merchantId;
        @NotNull
        private final String shopId;

        public static /* synthetic */ setMin copy$default(setMin setmin, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setmin.merchantId;
            }
            if ((i & 2) != 0) {
                str2 = setmin.shopId;
            }
            return setmin.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.merchantId;
        }

        @NotNull
        public final String component2() {
            return this.shopId;
        }

        @NotNull
        public final setMin copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            return new setMin(str, str2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return Intrinsics.areEqual((Object) this.merchantId, (Object) setmin.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) setmin.shopId);
        }

        public final int hashCode() {
            String str = this.merchantId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.shopId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(merchantId=");
            sb.append(this.merchantId);
            sb.append(", shopId=");
            sb.append(this.shopId);
            sb.append(")");
            return sb.toString();
        }

        public setMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            this.merchantId = str;
            this.shopId = str2;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        @NotNull
        public final String getShopId() {
            return this.shopId;
        }
    }
}
