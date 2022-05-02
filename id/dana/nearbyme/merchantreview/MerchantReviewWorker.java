package id.dana.nearbyme.merchantreview;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H$J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u001cR\u0012\u0010\t\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lid/dana/nearbyme/merchantreview/MerchantReviewWorker;", "R", "", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "maxRetry", "", "getMaxRetry", "()I", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lid/dana/domain/social/Result;", "handleException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "injectDependency", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onSuccess", "data", "(Ljava/lang/Object;)Landroidx/work/ListenableWorker$Result;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class MerchantReviewWorker<R> extends CoroutineWorker {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"doWork", "", "R", "continuation", "Lkotlin/coroutines/Continuation;", "Landroidx/work/ListenableWorker$Result;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.nearbyme.merchantreview.MerchantReviewWorker", f = "MerchantReviewWorker.kt", i = {0}, l = {37}, m = "doWork$suspendImpl", n = {"this"}, s = {"L$0"})
    static final class getMax extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MerchantReviewWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MerchantReviewWorker merchantReviewWorker, Continuation continuation) {
            super(continuation);
            this.this$0 = merchantReviewWorker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MerchantReviewWorker.getMin(this.this$0, this);
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public abstract ListenableWorker.setMax getMax(@NotNull R r);

    @Nullable
    public final Object getMin(@NotNull Continuation<? super ListenableWorker.setMax> continuation) {
        return getMin(this, continuation);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Object length(@NotNull Continuation<? super forThisDevice<? extends R>> continuation);

    /* access modifiers changed from: protected */
    public abstract int setMax();

    /* access modifiers changed from: protected */
    public abstract void setMax(@NotNull PrepareException.AnonymousClass1 r1);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MerchantReviewWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object getMin(id.dana.nearbyme.merchantreview.MerchantReviewWorker r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof id.dana.nearbyme.merchantreview.MerchantReviewWorker.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r5
            id.dana.nearbyme.merchantreview.MerchantReviewWorker$getMax r0 = (id.dana.nearbyme.merchantreview.MerchantReviewWorker.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            id.dana.nearbyme.merchantreview.MerchantReviewWorker$getMax r0 = new id.dana.nearbyme.merchantreview.MerchantReviewWorker$getMax
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.L$0
            id.dana.nearbyme.merchantreview.MerchantReviewWorker r4 = (id.dana.nearbyme.merchantreview.MerchantReviewWorker) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0058
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r5)
            android.content.Context r5 = r4.getApplicationContext()
            if (r5 == 0) goto L_0x00a6
            id.dana.DanaApplication r5 = (id.dana.DanaApplication) r5
            o.PrepareException$1 r5 = r5.getApplicationComponent()
            java.lang.String r2 = "(applicationContext as D…ion).applicationComponent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r4.setMax(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.length(r0)
            if (r5 != r1) goto L_0x0058
            return r1
        L_0x0058:
            o.forThisDevice r5 = (o.forThisDevice) r5
            boolean r0 = r5 instanceof o.forThisDevice.setMax
            if (r0 == 0) goto L_0x0069
            o.forThisDevice$setMax r5 = (o.forThisDevice.setMax) r5
            java.lang.Object r5 = r5.getData()
            androidx.work.ListenableWorker$setMax r4 = r4.getMax(r5)
            return r4
        L_0x0069:
            boolean r0 = r5 instanceof o.forThisDevice.getMin
            if (r0 == 0) goto L_0x00a0
            o.forThisDevice$getMin r5 = (o.forThisDevice.getMin) r5
            java.lang.Exception r5 = r5.getException()
            java.lang.String r0 = r5.getLocalizedMessage()
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = ""
        L_0x007b:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r1 = "NearbyMeMerchantReview"
            o.updateActionSheetContent.e(r1, r0, r5)
            int r5 = r4.getRunAttemptCount()
            int r4 = r4.setMax()
            if (r5 >= r4) goto L_0x0096
            androidx.work.ListenableWorker$setMax r4 = androidx.work.ListenableWorker.setMax.setMin()
            java.lang.String r5 = "Result.retry()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        L_0x0096:
            androidx.work.ListenableWorker$setMax r4 = androidx.work.ListenableWorker.setMax.getMin()
            java.lang.String r5 = "Result.success()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        L_0x00a0:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x00a6:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type id.dana.DanaApplication"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantreview.MerchantReviewWorker.getMin(id.dana.nearbyme.merchantreview.MerchantReviewWorker, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
