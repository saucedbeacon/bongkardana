package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lid/dana/data/nearbyme/repository/MerchantReviewEntityRepository;", "Lid/dana/domain/nearbyme/MerchantReviewRepository;", "networkMerchantInfoEntityData", "Lid/dana/data/nearbyme/repository/source/network/NetworkMerchantInfoEntityData;", "preferenceAccountEntityData", "Lid/dana/data/account/repository/source/preference/PreferenceAccountEntityData;", "networkFileUploadEntityData", "Lid/dana/data/account/avatar/repository/source/network/NetworkFileUploadEntityData;", "(Lid/dana/data/nearbyme/repository/source/network/NetworkMerchantInfoEntityData;Lid/dana/data/account/repository/source/preference/PreferenceAccountEntityData;Lid/dana/data/account/avatar/repository/source/network/NetworkFileUploadEntityData;)V", "createMerchantReview", "", "review", "Lid/dana/domain/nearbyme/model/MerchantCreateReview;", "(Lid/dana/domain/nearbyme/model/MerchantCreateReview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "", "image", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getWorkerHandler implements AESUtil {
    private final isAtTop networkFileUploadEntityData;
    private final isSticky networkMerchantInfoEntityData;
    private final getFrameMarginVertical$core preferenceAccountEntityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, d2 = {"createMerchantReview", "", "review", "Lid/dana/domain/nearbyme/model/MerchantCreateReview;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.nearbyme.repository.MerchantReviewEntityRepository", f = "MerchantReviewEntityRepository.kt", i = {}, l = {31}, m = "createMerchantReview", n = {}, s = {})
    static final class length extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getWorkerHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getWorkerHandler getworkerhandler, Continuation continuation) {
            super(continuation);
            this.this$0 = getworkerhandler;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createMerchantReview((getSerialNumber) null, this);
        }
    }

    @Inject
    public getWorkerHandler(@NotNull isSticky issticky, @NotNull getFrameMarginVertical$core getframemarginvertical_core, @NotNull isAtTop isattop) {
        Intrinsics.checkNotNullParameter(issticky, "networkMerchantInfoEntityData");
        Intrinsics.checkNotNullParameter(getframemarginvertical_core, "preferenceAccountEntityData");
        Intrinsics.checkNotNullParameter(isattop, "networkFileUploadEntityData");
        this.networkMerchantInfoEntityData = issticky;
        this.preferenceAccountEntityData = getframemarginvertical_core;
        this.networkFileUploadEntityData = isattop;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createMerchantReview(@org.jetbrains.annotations.NotNull o.getSerialNumber r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof o.getWorkerHandler.length
            if (r0 == 0) goto L_0x0014
            r0 = r14
            o.getWorkerHandler$length r0 = (o.getWorkerHandler.length) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            o.getWorkerHandler$length r0 = new o.getWorkerHandler$length
            r0.<init>(r12, r14)
        L_0x0019:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0062
        L_0x002a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r14)
            o.isSticky r14 = r12.networkMerchantInfoEntityData
            o.ExitCallback r2 = new o.ExitCallback
            java.lang.String r5 = r13.getReview()
            int r6 = r13.getRating()
            java.util.List r7 = r13.getPositiveTags()
            java.util.List r8 = r13.getNegativeTags()
            java.util.List r9 = r13.getImages()
            java.lang.String r10 = r13.getShopId()
            boolean r11 = r13.getShareToFeed()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.label = r3
            java.lang.Object r13 = r14.createReview(r2, r0)
            if (r13 != r1) goto L_0x0062
            return r1
        L_0x0062:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getWorkerHandler.createMerchantReview(o.getSerialNumber, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r3 = r3.blockingFirst();
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r4) {
        /*
            r2 = this;
            o.isAtTop r4 = r2.networkFileUploadEntityData
            o.getFrameMarginVertical$core r0 = r2.preferenceAccountEntityData
            java.lang.String r0 = r0.getUUIDAsString()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000d
            r0 = r1
        L_0x000d:
            o.TitleBarRightButtonView$1 r3 = r4.uploadAvatar(r3, r0)
            if (r3 == 0) goto L_0x001e
            java.lang.Object r3 = r3.blockingFirst()
            o.getOwner r3 = (o.getOwner) r3
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = r3.url
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r3
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getWorkerHandler.uploadImage(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
