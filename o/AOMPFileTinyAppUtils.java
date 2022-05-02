package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lid/dana/domain/nearbyme/interactor/CreateDanaDealsVoucherOrder;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/nearbyme/interactor/CreateDanaDealsVoucherOrder$Param;", "Lid/dana/domain/nearbyme/model/ProductOrder;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;)V", "getMerchantInfoRepository", "()Lid/dana/domain/nearbyme/MerchantInfoRepository;", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/nearbyme/interactor/CreateDanaDealsVoucherOrder$Param;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class AOMPFileTinyAppUtils extends buildModelMapWithLock<getMax, getSubPath> {
    @NotNull
    private final setStorageProxy merchantInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/CreateDanaDealsVoucherOrder$Param;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/nearbyme/model/ProductOrder;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.CreateDanaDealsVoucherOrder", f = "CreateDanaDealsVoucherOrder.kt", i = {}, l = {33}, m = "buildUseCase", n = {}, s = {})
    static final class setMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AOMPFileTinyAppUtils this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(AOMPFileTinyAppUtils aOMPFileTinyAppUtils, Continuation continuation) {
            super(continuation);
            this.this$0 = aOMPFileTinyAppUtils;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((getMax) null, (Continuation<? super forThisDevice<getSubPath>>) this);
        }
    }

    @NotNull
    public final setStorageProxy getMerchantInfoRepository() {
        return this.merchantInfoRepository;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public AOMPFileTinyAppUtils(@NotNull setStorageProxy setstorageproxy) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        this.merchantInfoRepository = setstorageproxy;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/domain/nearbyme/interactor/CreateDanaDealsVoucherOrder$Param;", "", "orderRequest", "Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;", "(Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;)V", "getOrderRequest", "()Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @NotNull
        private final getAndroidIdEncrypt orderRequest;

        public static /* synthetic */ getMax copy$default(getMax getmax, getAndroidIdEncrypt getandroididencrypt, int i, Object obj) {
            if ((i & 1) != 0) {
                getandroididencrypt = getmax.orderRequest;
            }
            return getmax.copy(getandroididencrypt);
        }

        @NotNull
        public final getAndroidIdEncrypt component1() {
            return this.orderRequest;
        }

        @NotNull
        public final getMax copy(@NotNull getAndroidIdEncrypt getandroididencrypt) {
            Intrinsics.checkNotNullParameter(getandroididencrypt, "orderRequest");
            return new getMax(getandroididencrypt);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMax) && Intrinsics.areEqual((Object) this.orderRequest, (Object) ((getMax) obj).orderRequest);
            }
            return true;
        }

        public final int hashCode() {
            getAndroidIdEncrypt getandroididencrypt = this.orderRequest;
            if (getandroididencrypt != null) {
                return getandroididencrypt.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(orderRequest=");
            sb.append(this.orderRequest);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull getAndroidIdEncrypt getandroididencrypt) {
            Intrinsics.checkNotNullParameter(getandroididencrypt, "orderRequest");
            this.orderRequest = getandroididencrypt;
        }

        @NotNull
        public final getAndroidIdEncrypt getOrderRequest() {
            return this.orderRequest;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.AOMPFileTinyAppUtils.getMax r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.getSubPath>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.AOMPFileTinyAppUtils.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.AOMPFileTinyAppUtils$setMin r0 = (o.AOMPFileTinyAppUtils.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.AOMPFileTinyAppUtils$setMin r0 = new o.AOMPFileTinyAppUtils$setMin
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0044
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            o.setStorageProxy r6 = r4.merchantInfoRepository
            o.getAndroidIdEncrypt r5 = r5.getOrderRequest()
            r0.label = r3
            java.lang.Object r6 = r6.createDanaDealsVoucherOrder(r5, r0)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            o.getSubPath r6 = (o.getSubPath) r6
            java.lang.String r5 = r6.getCheckOutUrl()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x0063
            o.forThisDevice$getMin r5 = new o.forThisDevice$getMin
            java.lang.Exception r6 = new java.lang.Exception
            r6.<init>()
            r5.<init>(r6)
            o.forThisDevice r5 = (o.forThisDevice) r5
            return r5
        L_0x0063:
            o.forThisDevice$setMax r5 = new o.forThisDevice$setMax
            r5.<init>(r6)
            o.forThisDevice r5 = (o.forThisDevice) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AOMPFileTinyAppUtils.buildUseCase(o.AOMPFileTinyAppUtils$getMax, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
