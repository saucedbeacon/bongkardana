package id.dana.social.base;

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
import o.onLeScan;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u001bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lid/dana/social/base/BaseSocialSyncWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "getContext", "()Landroid/content/Context;", "getParams", "()Landroidx/work/WorkerParameters;", "doSync", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "Landroidx/work/ListenableWorker$Result;", "enqueueAnotherWork", "", "injectDependency", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "logError", "result", "Lid/dana/domain/social/Result$Error;", "onError", "onSuccess", "Lid/dana/domain/social/Result$Success;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class BaseSocialSyncWorker extends CoroutineWorker {
    @NotNull
    public static final length getMax = new length((byte) 0);
    @NotNull
    private final Context getMin;
    @NotNull
    private final WorkerParameters setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"doWork", "", "continuation", "Lkotlin/coroutines/Continuation;", "Landroidx/work/ListenableWorker$Result;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.social.base.BaseSocialSyncWorker", f = "BaseSocialSyncWorker.kt", i = {0}, l = {33}, m = "doWork$suspendImpl", n = {"this"}, s = {"L$0"})
    static final class setMin extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseSocialSyncWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(BaseSocialSyncWorker baseSocialSyncWorker, Continuation continuation) {
            super(continuation);
            this.this$0 = baseSocialSyncWorker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseSocialSyncWorker.getMin(this.this$0, this);
        }
    }

    @Nullable
    public final Object getMin(@NotNull Continuation<? super ListenableWorker.setMax> continuation) {
        return getMin(this, continuation);
    }

    @Nullable
    public abstract Object length(@NotNull Continuation<? super forThisDevice<onLeScan>> continuation);

    public abstract void length();

    public abstract void setMin(@NotNull PrepareException.AnonymousClass1 r1);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSocialSyncWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(workerParameters, "params");
        this.getMin = context;
        this.setMin = workerParameters;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object getMin(id.dana.social.base.BaseSocialSyncWorker r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof id.dana.social.base.BaseSocialSyncWorker.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r6
            id.dana.social.base.BaseSocialSyncWorker$setMin r0 = (id.dana.social.base.BaseSocialSyncWorker.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            id.dana.social.base.BaseSocialSyncWorker$setMin r0 = new id.dana.social.base.BaseSocialSyncWorker$setMin
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "failure()"
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r5 = r0.L$0
            id.dana.social.base.BaseSocialSyncWorker r5 = (id.dana.social.base.BaseSocialSyncWorker) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0069
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r6)
            int r6 = r5.getRunAttemptCount()
            r2 = 3
            if (r6 <= r2) goto L_0x004a
            androidx.work.ListenableWorker$setMax r5 = androidx.work.ListenableWorker.setMax.setMax()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            return r5
        L_0x004a:
            android.content.Context r6 = r5.getApplicationContext()
            if (r6 == 0) goto L_0x00ce
            id.dana.DanaApplication r6 = (id.dana.DanaApplication) r6
            o.PrepareException$1 r6 = r6.getApplicationComponent()
            java.lang.String r2 = "(applicationContext as D…ion).applicationComponent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r5.setMin(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.length(r0)
            if (r6 != r1) goto L_0x0069
            return r1
        L_0x0069:
            o.forThisDevice r6 = (o.forThisDevice) r6
            boolean r0 = r6 instanceof o.forThisDevice.setMax
            if (r0 == 0) goto L_0x008a
            o.forThisDevice$setMax r6 = (o.forThisDevice.setMax) r6
            java.lang.Object r6 = r6.getData()
            o.onLeScan r6 = (o.onLeScan) r6
            boolean r6 = r6.getShouldEnqueueAnotherWork()
            if (r6 == 0) goto L_0x0080
            r5.length()
        L_0x0080:
            androidx.work.ListenableWorker$setMax r5 = androidx.work.ListenableWorker.setMax.getMin()
            java.lang.String r6 = "success()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        L_0x008a:
            boolean r5 = r6 instanceof o.forThisDevice.getMin
            if (r5 == 0) goto L_0x00c8
            o.forThisDevice$getMin r6 = (o.forThisDevice.getMin) r6
            r6.getException()
            java.lang.Class<id.dana.social.base.BaseSocialSyncWorker> r5 = id.dana.social.base.BaseSocialSyncWorker.class
            kotlin.reflect.KClass r5 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r5)
            java.lang.String r5 = r5.getSimpleName()
            java.lang.Exception r0 = r6.getException()
            java.lang.String r0 = r0.getMessage()
            java.lang.Exception r1 = r6.getException()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            o.updateActionSheetContent.e(r5, r0, r1)
            java.lang.Exception r5 = r6.getException()
            boolean r5 = r5 instanceof id.dana.domain.social.SocialSyncRetryException
            if (r5 == 0) goto L_0x00c0
            androidx.work.ListenableWorker$setMax r5 = androidx.work.ListenableWorker.setMax.setMin()
            java.lang.String r6 = "retry()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        L_0x00c0:
            androidx.work.ListenableWorker$setMax r5 = androidx.work.ListenableWorker.setMax.setMax()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            return r5
        L_0x00c8:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x00ce:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type id.dana.DanaApplication"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.base.BaseSocialSyncWorker.getMin(id.dana.social.base.BaseSocialSyncWorker, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/social/base/BaseSocialSyncWorker$Companion;", "", "()V", "MAX_SYNC_ATTEMPT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
