package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o.ModelSpecificDistanceUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/SetReviewCoachmark;", "Lid/dana/domain/social/core/CompletableUseCase;", "Lid/dana/domain/nearbyme/interactor/SetReviewCoachmark$Params;", "merchantInfoRepository", "Lid/dana/domain/nearbyme/MerchantInfoRepository;", "(Lid/dana/domain/nearbyme/MerchantInfoRepository;)V", "buildUseCase", "Lid/dana/domain/social/Result;", "", "params", "(Lid/dana/domain/nearbyme/interactor/SetReviewCoachmark$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class isH5 extends ModelSpecificDistanceUpdater.CompletionHandler<getMax> {
    private final setStorageProxy merchantInfoRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"buildUseCase", "", "params", "Lid/dana/domain/nearbyme/interactor/SetReviewCoachmark$Params;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.nearbyme.interactor.SetReviewCoachmark", f = "SetReviewCoachmark.kt", i = {}, l = {25}, m = "buildUseCase", n = {}, s = {})
    static final class getMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ isH5 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(isH5 ish5, Continuation continuation) {
            super(continuation);
            this.this$0 = ish5;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.buildUseCase((getMax) null, (Continuation<? super forThisDevice<Unit>>) this);
        }
    }

    @Inject
    public isH5(@NotNull setStorageProxy setstorageproxy) {
        Intrinsics.checkNotNullParameter(setstorageproxy, "merchantInfoRepository");
        this.merchantInfoRepository = setstorageproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object buildUseCase(@org.jetbrains.annotations.NotNull o.isH5.getMax r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<kotlin.Unit>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.isH5.getMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.isH5$getMin r0 = (o.isH5.getMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.isH5$getMin r0 = new o.isH5$getMin
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
            boolean r5 = r5.getEnabled()
            r0.label = r3
            java.lang.Object r5 = r6.setReviewCoachmark(r5, r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            o.forThisDevice$setMax r6 = new o.forThisDevice$setMax
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isH5.buildUseCase(o.isH5$getMax, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/SetReviewCoachmark$Params;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private final boolean enabled;

        public static /* synthetic */ getMax copy$default(getMax getmax, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = getmax.enabled;
            }
            return getmax.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        @NotNull
        public final getMax copy(boolean z) {
            return new getMax(z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof getMax) && this.enabled == ((getMax) obj).enabled;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(enabled=");
            sb.append(this.enabled);
            sb.append(")");
            return sb.toString();
        }

        public getMax(boolean z) {
            this.enabled = z;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }
    }
}
