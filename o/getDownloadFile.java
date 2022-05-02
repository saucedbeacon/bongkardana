package o;

import id.dana.contract.deeplink.path.FeatureParams;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantReviews;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/nearbyme/interactor/GetMerchantReviews$Param;", "Lid/dana/domain/nearbyme/model/MerchantReviews;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;Lid/dana/domain/account/AccountRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/nearbyme/interactor/GetMerchantReviews$Param;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getDownloadFile extends buildModelMapWithLock<setMax, getSubDir> {
    private final getCommonResources accountRepository;
    private final setStorageProxy merchantInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/GetMerchantReviews$Param;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/nearbyme/model/MerchantReviews;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.GetMerchantReviews", f = "GetMerchantReviews.kt", i = {0}, l = {42}, m = "buildUseCase", n = {"currentUserId"}, s = {"L$0"})
    static final class getMin extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getDownloadFile this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getDownloadFile getdownloadfile, Continuation continuation) {
            super(continuation);
            this.this$0 = getdownloadfile;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((setMax) null, (Continuation<? super forThisDevice<getSubDir>>) this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getDownloadFile(@NotNull setStorageProxy setstorageproxy, @NotNull getCommonResources getcommonresources) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        this.merchantInfoRepository = setstorageproxy;
        this.accountRepository = getcommonresources;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetMerchantReviews$Param;", "", "merchantId", "", "shopId", "pageNum", "", "pageSize", "filterCriteria", "", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "getFilterCriteria", "()Ljava/util/List;", "getMerchantId", "()Ljava/lang/String;", "getPageNum", "()I", "getPageSize", "getShopId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final List<String> filterCriteria;
        @NotNull
        private final String merchantId;
        private final int pageNum;
        private final int pageSize;
        @NotNull
        private final String shopId;

        public static /* synthetic */ setMax copy$default(setMax setmax, String str, String str2, int i, int i2, List<String> list, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = setmax.merchantId;
            }
            if ((i3 & 2) != 0) {
                str2 = setmax.shopId;
            }
            String str3 = str2;
            if ((i3 & 4) != 0) {
                i = setmax.pageNum;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = setmax.pageSize;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                list = setmax.filterCriteria;
            }
            return setmax.copy(str, str3, i4, i5, list);
        }

        @NotNull
        public final String component1() {
            return this.merchantId;
        }

        @NotNull
        public final String component2() {
            return this.shopId;
        }

        public final int component3() {
            return this.pageNum;
        }

        public final int component4() {
            return this.pageSize;
        }

        @NotNull
        public final List<String> component5() {
            return this.filterCriteria;
        }

        @NotNull
        public final setMax copy(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(list, "filterCriteria");
            return new setMax(str, str2, i, i2, list);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            return Intrinsics.areEqual((Object) this.merchantId, (Object) setmax.merchantId) && Intrinsics.areEqual((Object) this.shopId, (Object) setmax.shopId) && this.pageNum == setmax.pageNum && this.pageSize == setmax.pageSize && Intrinsics.areEqual((Object) this.filterCriteria, (Object) setmax.filterCriteria);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(merchantId=");
            sb.append(this.merchantId);
            sb.append(", shopId=");
            sb.append(this.shopId);
            sb.append(", pageNum=");
            sb.append(this.pageNum);
            sb.append(", pageSize=");
            sb.append(this.pageSize);
            sb.append(", filterCriteria=");
            sb.append(this.filterCriteria);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "merchantId");
            Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
            Intrinsics.checkNotNullParameter(list, "filterCriteria");
            this.merchantId = str;
            this.shopId = str2;
            this.pageNum = i;
            this.pageSize = i2;
            this.filterCriteria = list;
        }

        @NotNull
        public final String getMerchantId() {
            return this.merchantId;
        }

        @NotNull
        public final String getShopId() {
            return this.shopId;
        }

        public final int getPageNum() {
            return this.pageNum;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ setMax(String str, String str2, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i3 & 4) != 0 ? 1 : i, (i3 & 8) != 0 ? 10 : i2, (i3 & 16) != 0 ? CollectionsKt.emptyList() : list);
        }

        @NotNull
        public final List<String> getFilterCriteria() {
            return this.filterCriteria;
        }

        public final int hashCode() {
            String str = this.merchantId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.shopId;
            int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.valueOf(this.pageNum).hashCode()) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31;
            List<String> list = this.filterCriteria;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.getDownloadFile.setMax r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.getSubDir>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof o.getDownloadFile.getMin
            if (r0 == 0) goto L_0x0014
            r0 = r12
            o.getDownloadFile$getMin r0 = (o.getDownloadFile.getMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            o.getDownloadFile$getMin r0 = new o.getDownloadFile$getMin
            r0.<init>(r10, r12)
        L_0x0019:
            r7 = r0
            java.lang.Object r12 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r8 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 != r8) goto L_0x002f
            java.lang.Object r11 = r7.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x006a
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r12)
            o.getCommonResources r12 = r10.accountRepository
            o.TitleBarRightButtonView$1 r12 = r12.getUserId()
            java.lang.Object r12 = r12.blockingFirst()
            java.lang.String r12 = (java.lang.String) r12
            o.setStorageProxy r1 = r10.merchantInfoRepository
            java.lang.String r2 = r11.getMerchantId()
            java.lang.String r3 = r11.getShopId()
            int r4 = r11.getPageNum()
            int r5 = r11.getPageSize()
            java.util.List r6 = r11.getFilterCriteria()
            r7.L$0 = r12
            r7.label = r8
            java.lang.Object r11 = r1.getMerchantReview(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L_0x0067
            return r0
        L_0x0067:
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x006a:
            r0 = r12
            o.getSubDir r0 = (o.getSubDir) r0
            java.util.List r1 = r0.getReviews()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x007e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00a2
            java.lang.Object r3 = r1.next()
            r4 = r3
            o.FileCache r4 = (o.FileCache) r4
            java.lang.String r4 = r4.getUserId()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r11)
            r4 = r4 ^ r8
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x007e
            r2.add(r3)
            goto L_0x007e
        L_0x00a2:
            java.util.List r2 = (java.util.List) r2
            r0.setReviews(r2)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            o.forThisDevice$setMax r11 = new o.forThisDevice$setMax
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDownloadFile.buildUseCase(o.getDownloadFile$setMax, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
