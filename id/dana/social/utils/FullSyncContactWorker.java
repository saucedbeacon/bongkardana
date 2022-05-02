package id.dana.social.utils;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.social.base.BaseSocialSyncWorker;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.findCalculatorForModelWithLock;
import o.setButtonStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lid/dana/social/utils/FullSyncContactWorker;", "Lid/dana/social/base/BaseSocialSyncWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "syncRunner", "Lid/dana/domain/social/SyncRunner;", "getSyncRunner", "()Lid/dana/domain/social/SyncRunner;", "setSyncRunner", "(Lid/dana/domain/social/SyncRunner;)V", "doSync", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueAnotherWork", "", "injectDependency", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FullSyncContactWorker extends BaseSocialSyncWorker {
    @NotNull
    public static final setMax getMin = new setMax((byte) 0);
    @Inject
    @Named("fullsync")
    public findCalculatorForModelWithLock syncRunner;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H@"}, d2 = {"doSync", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.social.utils.FullSyncContactWorker", f = "FullSyncContactWorker.kt", i = {0}, l = {40, 66, 43}, m = "doSync", n = {"this"}, s = {"L$0"})
    static final class getMax extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FullSyncContactWorker this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(FullSyncContactWorker fullSyncContactWorker, Continuation continuation) {
            super(continuation);
            this.this$0 = fullSyncContactWorker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.length(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullSyncContactWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    public final void setMin(@NotNull PrepareException.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "applicationComponent");
        r2.length(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092 A[LOOP:0: B:28:0x0090->B:29:0x0092, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object length(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super o.forThisDevice<o.onLeScan>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof id.dana.social.utils.FullSyncContactWorker.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r11
            id.dana.social.utils.FullSyncContactWorker$getMax r0 = (id.dana.social.utils.FullSyncContactWorker.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L_0x0019
        L_0x0014:
            id.dana.social.utils.FullSyncContactWorker$getMax r0 = new id.dana.social.utils.FullSyncContactWorker$getMax
            r0.<init>(r10, r11)
        L_0x0019:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00cc
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003b:
            java.lang.Object r2 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r2
            goto L_0x00be
        L_0x0043:
            java.lang.Object r2 = r0.L$0
            id.dana.social.utils.FullSyncContactWorker r2 = (id.dana.social.utils.FullSyncContactWorker) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0067
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r11)
            o.findCalculatorForModelWithLock r11 = r10.syncRunner
            if (r11 != 0) goto L_0x0057
            java.lang.String r2 = "syncRunner"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0057:
            int r2 = r10.getRunAttemptCount()
            r0.L$0 = r10
            r0.label = r5
            java.lang.Object r11 = r11.sync(r2, r0)
            if (r11 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r10
        L_0x0067:
            r6 = r11
            o.forThisDevice r6 = (o.forThisDevice) r6
            boolean r7 = r6 instanceof o.forThisDevice.setMax
            if (r7 == 0) goto L_0x00cb
            o.forThisDevice$setMax r6 = (o.forThisDevice.setMax) r6
            java.lang.Object r6 = r6.getData()
            o.onLeScan r6 = (o.onLeScan) r6
            boolean r6 = r6.getShouldEnqueueAnotherWork()
            if (r6 != 0) goto L_0x00cb
            kotlin.Pair[] r6 = new kotlin.Pair[r5]
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            java.lang.String r7 = "All_CONTACT_SYNCHED"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r7, r5)
            r7 = 0
            r6[r7] = r5
            o.updateAppearance$getMin r5 = new o.updateAppearance$getMin
            r5.<init>()
        L_0x0090:
            if (r7 > 0) goto L_0x00a4
            r8 = r6[r7]
            java.lang.Object r9 = r8.getFirst()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getSecond()
            r5.getMax(r9, r8)
            int r7 = r7 + 1
            goto L_0x0090
        L_0x00a4:
            o.updateAppearance r6 = new o.updateAppearance
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.length
            r6.<init>((java.util.Map<java.lang.String, ?>) r5)
            o.updateAppearance.setMax((o.updateAppearance) r6)
            java.lang.String r5 = "dataBuilder.build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r2 = r2.getMin(r6, r0)
            if (r2 != r1) goto L_0x00be
            return r1
        L_0x00be:
            r4 = 5000(0x1388, double:2.4703E-320)
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r0 = o.getConfiguration.length(r4, r0)
            if (r0 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            r0 = r11
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.social.utils.FullSyncContactWorker.length(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void length() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        setButtonStyle.getMax(applicationContext, ExistingWorkPolicy.REPLACE, 1, TimeUnit.MINUTES);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/social/utils/FullSyncContactWorker$Companion;", "", "()V", "All_CONTACT_SYNCHED", "", "DELAY_SETTING_PROGRESS", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }
}
