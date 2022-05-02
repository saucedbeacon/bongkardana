package o;

import id.dana.contract.deeplink.path.FeatureParams;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.GriverSecurity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002!\"B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\n \u0019*\u0004\u0018\u00010\u00100\u0010H\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0016\u0010\u001f\u001a\u0004\u0018\u00010 *\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0010H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lid/dana/domain/nearbyme/interactor/merchantreview/GetReviewableMerchantForm;", "Lid/dana/domain/social/core/SingleUseCase;", "Lid/dana/domain/nearbyme/interactor/merchantreview/GetReviewableMerchantForm$Param;", "Lid/dana/domain/nearbyme/model/MerchantConsult;", "merchantReviewFormRepository", "Lid/dana/domain/nearbyme/MerchantReviewFormRepository;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "featureConfigRepository", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "(Lid/dana/domain/nearbyme/MerchantReviewFormRepository;Lid/dana/domain/nearbyme/MerchantInfoRepository;Lid/dana/domain/featureconfig/FeatureConfigRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "params", "(Lid/dana/domain/nearbyme/interactor/merchantreview/GetReviewableMerchantForm$Param;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstTimeShown", "", "it", "", "getReviewableMerchantConsult", "shopId", "", "ignoreFormDismissCheck", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFeatureAmcsEnabled", "kotlin.jvm.PlatformType", "()Ljava/lang/Boolean;", "isNotInCooldown", "merchantNotDismissed", "preconditionCheck", "", "getReviewableMerchant", "Lid/dana/domain/nearbyme/model/Shop;", "Companion", "Param", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getIMEI extends buildModelMapWithLock<getMax, DiskUtil> {
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    private static final long GAP_TIME_BETWEEN_REVIEW = 300000;
    @NotNull
    public static final String REVIEW_MERCHANT_FEATURE_NAME = "reviewmerchant";
    public static final int SHOP_INFO_PAGE_SIZE = 30;
    private final setDefaultFontSize featureConfigRepository;
    private final setStorageProxy merchantInfoRepository;
    private final GriverSecurity.AnonymousClass1 merchantReviewFormRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@"}, d2 = {"getReviewableMerchantConsult", "", "shopId", "", "ignoreFormDismissCheck", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/nearbyme/model/MerchantConsult;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.merchantreview.GetReviewableMerchantForm", f = "GetReviewableMerchantForm.kt", i = {0, 0, 0, 0, 0}, l = {72}, m = "getReviewableMerchantConsult", n = {"this", "shopId", "hasMore", "pageNum", "ignoreFormDismissCheck"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"})
    static final class setMax extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getIMEI this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getIMEI getimei, Continuation continuation) {
            super(continuation);
            this.this$0 = getimei;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getReviewableMerchantConsult((String) null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/merchantreview/GetReviewableMerchantForm$Param;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/nearbyme/model/MerchantConsult;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.merchantreview.GetReviewableMerchantForm", f = "GetReviewableMerchantForm.kt", i = {}, l = {37}, m = "buildUseCase", n = {}, s = {})
    static final class setMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getIMEI this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getIMEI getimei, Continuation continuation) {
            super(continuation);
            this.this$0 = getimei;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((getMax) null, (Continuation<? super forThisDevice<DiskUtil>>) this);
        }
    }

    private final boolean firstTimeShown(long j) {
        return j == 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getIMEI(@NotNull GriverSecurity.AnonymousClass1 r3, @NotNull setStorageProxy setstorageproxy, @NotNull setDefaultFontSize setdefaultfontsize) {
        super((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(r3, "merchantReviewFormRepository");
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        Intrinsics.checkNotNullParameter(setdefaultfontsize, "featureConfigRepository");
        this.merchantReviewFormRepository = r3;
        this.merchantInfoRepository = setstorageproxy;
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.getIMEI.getMax r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.DiskUtil>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.getIMEI.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.getIMEI$setMin r0 = (o.getIMEI.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.getIMEI$setMin r0 = new o.getIMEI$setMin
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004d
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.getIgnoreFormDismissCheck()
            r4.preconditionCheck(r6)
            java.lang.String r6 = r5.getShopId()
            boolean r5 = r5.getIgnoreFormDismissCheck()
            r0.label = r3
            java.lang.Object r6 = r4.getReviewableMerchantConsult(r6, r5, r0)
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            o.forThisDevice$setMax r5 = new o.forThisDevice$setMax
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIMEI.buildUseCase(o.getIMEI$getMax, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void preconditionCheck(boolean z) {
        if (!isFeatureAmcsEnabled().booleanValue()) {
            throw new AOMPDeviceUtils();
        } else if (!isNotInCooldown() && !z) {
            throw new Throwable() {
            };
        }
    }

    private final Boolean isFeatureAmcsEnabled() {
        return this.featureConfigRepository.checkVisibilityFeature("reviewmerchant").blockingFirst();
    }

    private final boolean merchantNotDismissed(String str) {
        return !this.merchantReviewFormRepository.getDismissedMerchantReview(str);
    }

    private final boolean isNotInCooldown() {
        long lastShownMerchantReviewShown = this.merchantReviewFormRepository.getLastShownMerchantReviewShown();
        return firstTimeShown(lastShownMerchantReviewShown) || System.currentTimeMillis() - lastShownMerchantReviewShown > 300000;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object getReviewableMerchantConsult(java.lang.String r10, boolean r11, kotlin.coroutines.Continuation<? super o.DiskUtil> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o.getIMEI.setMax
            if (r0 == 0) goto L_0x0014
            r0 = r12
            o.getIMEI$setMax r0 = (o.getIMEI.setMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            o.getIMEI$setMax r0 = new o.getIMEI$setMax
            r0.<init>(r9, r12)
        L_0x0019:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            boolean r10 = r0.Z$0
            java.lang.Object r11 = r0.L$3
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r2 = (kotlin.jvm.internal.Ref.BooleanRef) r2
            java.lang.Object r4 = r0.L$1
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.L$0
            o.getIMEI r5 = (o.getIMEI) r5
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r0
            r0 = r10
            r10 = r4
        L_0x003e:
            r4 = r2
            r2 = r1
            r1 = r8
            goto L_0x0081
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.jvm.internal.Ref$BooleanRef r12 = new kotlin.jvm.internal.Ref$BooleanRef
            r12.<init>()
            r12.element = r3
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            r2.element = r3
            r5 = r9
            r8 = r12
            r12 = r11
            r11 = r2
            r2 = r8
        L_0x0060:
            boolean r4 = r2.element
            if (r4 == 0) goto L_0x009d
            o.setStorageProxy r4 = r5.merchantInfoRepository
            r6 = 30
            int r7 = r11.element
            r0.L$0 = r5
            r0.L$1 = r10
            r0.L$2 = r2
            r0.L$3 = r11
            r0.Z$0 = r12
            r0.label = r3
            java.lang.Object r4 = r4.consultMerchantReview(r10, r6, r7, r0)
            if (r4 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r8 = r0
            r0 = r12
            r12 = r4
            goto L_0x003e
        L_0x0081:
            o.DiskUtil r12 = (o.DiskUtil) r12
            o.GriverConfigUtils r6 = r5.getReviewableMerchant(r12, r0)
            if (r6 == 0) goto L_0x008d
            r12.setReviewableShop(r6)
            return r12
        L_0x008d:
            boolean r12 = r12.getHasMore()
            r4.element = r12
            int r12 = r11.element
            int r12 = r12 + r3
            r11.element = r12
            r12 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            goto L_0x0060
        L_0x009d:
            o.shouldInstall r10 = new o.shouldInstall
            r10.<init>()
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            goto L_0x00a6
        L_0x00a5:
            throw r10
        L_0x00a6:
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIMEI.getReviewableMerchantConsult(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final GriverConfigUtils getReviewableMerchant(DiskUtil diskUtil, boolean z) {
        Object obj;
        boolean z2;
        Iterator it = diskUtil.getShopInfos().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            GriverConfigUtils griverConfigUtils = (GriverConfigUtils) obj;
            if (z) {
                z2 = true;
                continue;
            } else {
                String shopId = griverConfigUtils.getShopId();
                if (shopId == null) {
                    shopId = "";
                }
                z2 = merchantNotDismissed(shopId);
                continue;
            }
            if (z2) {
                break;
            }
        }
        return (GriverConfigUtils) obj;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/domain/nearbyme/interactor/merchantreview/GetReviewableMerchantForm$Param;", "", "shopId", "", "ignoreFormDismissCheck", "", "(Ljava/lang/String;Z)V", "getIgnoreFormDismissCheck", "()Z", "getShopId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private final boolean ignoreFormDismissCheck;
        @NotNull
        private final String shopId;

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getmax.shopId;
            }
            if ((i & 2) != 0) {
                z = getmax.ignoreFormDismissCheck;
            }
            return getmax.copy(str, z);
        }

        @NotNull
        public final String component1() {
            return this.shopId;
        }

        public final boolean component2() {
            return this.ignoreFormDismissCheck;
        }

        @NotNull
        public final getMax copy(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
            return new getMax(str, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.shopId, (Object) getmax.shopId) && this.ignoreFormDismissCheck == getmax.ignoreFormDismissCheck;
        }

        public final int hashCode() {
            String str = this.shopId;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.ignoreFormDismissCheck;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Param(shopId=");
            sb.append(this.shopId);
            sb.append(", ignoreFormDismissCheck=");
            sb.append(this.ignoreFormDismissCheck);
            sb.append(")");
            return sb.toString();
        }

        public getMax(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
            this.shopId = str;
            this.ignoreFormDismissCheck = z;
        }

        @NotNull
        public final String getShopId() {
            return this.shopId;
        }

        public final boolean getIgnoreFormDismissCheck() {
            return this.ignoreFormDismissCheck;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/domain/nearbyme/interactor/merchantreview/GetReviewableMerchantForm$Companion;", "", "()V", "GAP_TIME_BETWEEN_REVIEW", "", "REVIEW_MERCHANT_FEATURE_NAME", "", "SHOP_INFO_PAGE_SIZE", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
