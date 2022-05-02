package o;

import id.dana.domain.social.FullSyncHasFinishedException;
import java.util.List;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o.ScanHelper;
import o.TitleBarRightButtonView;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0011\u0010\u000b\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\u0015\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001d\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010!\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001f\u0010\"\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lid/dana/domain/social/sync/FullSyncContactRunner;", "Lid/dana/domain/social/sync/BaseSyncContactRunner;", "socialSyncContactRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lid/dana/domain/social/SocialSyncRepository;)V", "nextOffsetToBeSavedIfSyncSuccess", "", "calculateNextSyncOffset", "", "syncContactOffset", "size", "cancelSyncIfFullSyncFinished", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueAnotherWorkIfSynchedContactNotEmpty", "Lid/dana/domain/social/Result$Success;", "Lid/dana/domain/social/model/SyncResult;", "result", "getContactToBeSynched", "", "Lid/dana/domain/social/model/SocialContact;", "initFeedFirstTime", "needFirstTimeInitFeed", "", "onSyncContactError", "Lid/dana/domain/social/Result$Error;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSyncContactSuccess", "Lid/dana/domain/social/Result;", "(Lid/dana/domain/social/Result$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSyncStarting", "saveNextOffsetToBeUsedForNextSync", "setFullSyncFinishFlagTrueIfResultIsEmpty", "domain_release"}, k = 1, mv = {1, 4, 2})
public class ScanJob extends ScanHelper.ScanProcessor {
    private int nextOffsetToBeSavedIfSyncSuccess;

    /* renamed from: o.ScanJob$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<List<String>> getSocialMediaCategoryShare();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"onSyncStarting", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.FullSyncContactRunner", f = "FullSyncContactRunner.kt", i = {0, 1, 2}, l = {30, 31, 32, 34}, m = "onSyncStarting$suspendImpl", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    static final class getMax extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(ScanJob scanJob, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJob;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanJob.onSyncStarting$suspendImpl(this.this$0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"needFirstTimeInitFeed", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.FullSyncContactRunner", f = "FullSyncContactRunner.kt", i = {}, l = {42}, m = "needFirstTimeInitFeed", n = {}, s = {})
    static final class getMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(ScanJob scanJob, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJob;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.needFirstTimeInitFeed(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"setFullSyncFinishFlagTrueIfResultIsEmpty", "", "result", "Lid/dana/domain/social/Result$Success;", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.FullSyncContactRunner", f = "FullSyncContactRunner.kt", i = {}, l = {82}, m = "setFullSyncFinishFlagTrueIfResultIsEmpty", n = {}, s = {})
    static final class isInside extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(ScanJob scanJob, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJob;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.setFullSyncFinishFlagTrueIfResultIsEmpty((forThisDevice.setMax<Integer>) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"cancelSyncIfFullSyncFinished", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.FullSyncContactRunner", f = "FullSyncContactRunner.kt", i = {}, l = {47}, m = "cancelSyncIfFullSyncFinished", n = {}, s = {})
    static final class length extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(ScanJob scanJob, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJob;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.cancelSyncIfFullSyncFinished(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H@"}, d2 = {"onSyncContactSuccess", "", "result", "Lid/dana/domain/social/Result$Success;", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.FullSyncContactRunner", f = "FullSyncContactRunner.kt", i = {0, 0, 1, 1}, l = {64, 65}, m = "onSyncContactSuccess$suspendImpl", n = {"this", "result", "this", "result"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class setMax extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ScanJob scanJob, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJob;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanJob.onSyncContactSuccess$suspendImpl(this.this$0, (forThisDevice.setMax) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H@"}, d2 = {"getContactToBeSynched", "", "continuation", "Lkotlin/coroutines/Continuation;", "", "Lid/dana/domain/social/model/SocialContact;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.FullSyncContactRunner", f = "FullSyncContactRunner.kt", i = {0, 0, 1, 1, 2, 2}, l = {53, 54, 54}, m = "getContactToBeSynched$suspendImpl", n = {"this", "$this$run", "this", "syncContactOffset", "this", "syncContactOffset"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    static final class setMin extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJob this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(ScanJob scanJob, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJob;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanJob.getContactToBeSynched$suspendImpl(this.this$0, this);
        }
    }

    @Nullable
    public Object getContactToBeSynched(@NotNull Continuation<? super List<ScanHelper.ScanData>> continuation) {
        return getContactToBeSynched$suspendImpl(this, continuation);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public Object onSyncContactError(@NotNull Exception exc, @NotNull Continuation<? super forThisDevice.getMin> continuation) {
        return onSyncContactError$suspendImpl(this, exc, continuation);
    }

    @Nullable
    public Object onSyncContactSuccess(@NotNull forThisDevice.setMax<Integer> setmax, @NotNull Continuation<? super forThisDevice<onLeScan>> continuation) {
        return onSyncContactSuccess$suspendImpl(this, setmax, continuation);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public Object onSyncStarting(@NotNull Continuation<? super Unit> continuation) {
        return onSyncStarting$suspendImpl(this, continuation);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanJob(@NotNull getRequestedModel getrequestedmodel) {
        super(getrequestedmodel);
        Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncContactRepository");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object onSyncStarting$suspendImpl(o.ScanJob r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof o.ScanJob.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r8
            o.ScanJob$getMax r0 = (o.ScanJob.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            o.ScanJob$getMax r0 = new o.ScanJob$getMax
            r0.<init>(r7, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r6) goto L_0x004b
            if (r2 == r5) goto L_0x0043
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008b
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            java.lang.Object r7 = r0.L$0
            o.ScanJob r7 = (o.ScanJob) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x007f
        L_0x0043:
            java.lang.Object r7 = r0.L$0
            o.ScanJob r7 = (o.ScanJob) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x006c
        L_0x004b:
            java.lang.Object r7 = r0.L$0
            o.ScanJob r7 = (o.ScanJob) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0061
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r8 = r7.cancelSyncIfFullSyncFinished(r0)
            if (r8 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r7.needFirstTimeInitFeed(r0)
            if (r8 != r1) goto L_0x006c
            return r1
        L_0x006c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007f
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r7.initFeedFirstTime(r0)
            if (r8 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r7 = super.onSyncStarting(r0)
            if (r7 != r1) goto L_0x008b
            return r1
        L_0x008b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJob.onSyncStarting$suspendImpl(o.ScanJob, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object initFeedFirstTime(Continuation<? super Unit> continuation) {
        Object initFeedFirstTime = getSocialSyncContactRepository().initFeedFirstTime(continuation);
        if (initFeedFirstTime == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return initFeedFirstTime;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object needFirstTimeInitFeed(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.ScanJob.getMin
            if (r0 == 0) goto L_0x0014
            r0 = r5
            o.ScanJob$getMin r0 = (o.ScanJob.getMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            o.ScanJob$getMin r0 = new o.ScanJob$getMin
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0042
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r5)
            o.getRequestedModel r5 = r4.getSocialSyncContactRepository()
            r0.label = r3
            java.lang.Object r5 = r5.isFirstTimeInitFeedFinished(r0)
            if (r5 != r1) goto L_0x0042
            return r1
        L_0x0042:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJob.needFirstTimeInitFeed(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object cancelSyncIfFullSyncFinished(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.ScanJob.length
            if (r0 == 0) goto L_0x0014
            r0 = r5
            o.ScanJob$length r0 = (o.ScanJob.length) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            o.ScanJob$length r0 = new o.ScanJob$length
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0042
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r5)
            o.getRequestedModel r5 = r4.getSocialSyncContactRepository()
            r0.label = r3
            java.lang.Object r5 = r5.getFullSyncFinishedFlag(r0)
            if (r5 != r1) goto L_0x0042
            return r1
        L_0x0042:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x004d
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x004d:
            id.dana.domain.social.FullSyncHasFinishedException r5 = new id.dana.domain.social.FullSyncHasFinishedException
            r5.<init>()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJob.cancelSyncIfFullSyncFinished(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object getContactToBeSynched$suspendImpl(o.ScanJob r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof o.ScanJob.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r8
            o.ScanJob$setMin r0 = (o.ScanJob.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            o.ScanJob$setMin r0 = new o.ScanJob$setMin
            r0.<init>(r7, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r5) goto L_0x004d
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            int r7 = r0.I$0
            java.lang.Object r0 = r0.L$0
            o.ScanJob r0 = (o.ScanJob) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00a3
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            int r7 = r0.I$0
            java.lang.Object r2 = r0.L$1
            o.getRequestedModel r2 = (o.getRequestedModel) r2
            java.lang.Object r4 = r0.L$0
            o.ScanJob r4 = (o.ScanJob) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008c
        L_0x004d:
            java.lang.Object r7 = r0.L$1
            o.getRequestedModel r7 = (o.getRequestedModel) r7
            java.lang.Object r2 = r0.L$0
            o.ScanJob r2 = (o.ScanJob) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r6 = r2
            r2 = r7
            r7 = r6
            goto L_0x0073
        L_0x005c:
            kotlin.ResultKt.throwOnFailure(r8)
            o.getRequestedModel r8 = r7.getSocialSyncContactRepository()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r2 = r8.getOffsetLastSynchedContact(r0)
            if (r2 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x0073:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.L$0 = r7
            r0.L$1 = r2
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r4 = r2.getMaxContactPerbatch(r0)
            if (r4 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L_0x008c:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.L$0 = r4
            r5 = 0
            r0.L$1 = r5
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r8 = r2.getAllContact(r8, r7, r0)
            if (r8 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r0 = r4
        L_0x00a3:
            java.util.List r8 = (java.util.List) r8
            int r1 = r8.size()
            r0.calculateNextSyncOffset(r7, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJob.getContactToBeSynched$suspendImpl(o.ScanJob, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void calculateNextSyncOffset(int i, int i2) {
        this.nextOffsetToBeSavedIfSyncSuccess = i + i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: o.forThisDevice$setMax} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object onSyncContactSuccess$suspendImpl(o.ScanJob r6, o.forThisDevice.setMax r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof o.ScanJob.setMax
            if (r0 == 0) goto L_0x0014
            r0 = r8
            o.ScanJob$setMax r0 = (o.ScanJob.setMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            o.ScanJob$setMax r0 = new o.ScanJob$setMax
            r0.<init>(r6, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r6 = r0.L$1
            o.forThisDevice$setMax r6 = (o.forThisDevice.setMax) r6
            java.lang.Object r7 = r0.L$0
            o.ScanJob r7 = (o.ScanJob) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x006a
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            o.forThisDevice$setMax r7 = (o.forThisDevice.setMax) r7
            java.lang.Object r6 = r0.L$0
            o.ScanJob r6 = (o.ScanJob) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005a
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.saveNextOffsetToBeUsedForNextSync(r0)
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r6.setFullSyncFinishFlagTrueIfResultIsEmpty(r7, r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x006a:
            o.forThisDevice$setMax r6 = r7.enqueueAnotherWorkIfSynchedContactNotEmpty(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJob.onSyncContactSuccess$suspendImpl(o.ScanJob, o.forThisDevice$setMax, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object onSyncContactError$suspendImpl(ScanJob scanJob, Exception exc, Continuation continuation) {
        if (exc instanceof FullSyncHasFinishedException) {
            return new forThisDevice.getMin(exc);
        }
        return super.onSyncContactError(exc, continuation);
    }

    private final forThisDevice.setMax<onLeScan> enqueueAnotherWorkIfSynchedContactNotEmpty(forThisDevice.setMax<Integer> setmax) {
        return new forThisDevice.setMax<>(new onLeScan(setmax.getData().intValue() != 0));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object setFullSyncFinishFlagTrueIfResultIsEmpty(o.forThisDevice.setMax<java.lang.Integer> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.ScanJob.isInside
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.ScanJob$isInside r0 = (o.ScanJob.isInside) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.ScanJob$isInside r0 = new o.ScanJob$isInside
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004e
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r5 = r5.getData()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x004e
            o.getRequestedModel r5 = r4.getSocialSyncContactRepository()
            r0.label = r3
            java.lang.Object r5 = r5.saveFullSyncFinishedFlag(r3, r0)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJob.setFullSyncFinishFlagTrueIfResultIsEmpty(o.forThisDevice$setMax, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object saveNextOffsetToBeUsedForNextSync(Continuation<? super Unit> continuation) {
        Object saveOffsetLastSynchedContact = getSocialSyncContactRepository().saveOffsetLastSynchedContact(this.nextOffsetToBeSavedIfSyncSuccess, continuation);
        if (saveOffsetLastSynchedContact == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return saveOffsetLastSynchedContact;
        }
        return Unit.INSTANCE;
    }
}
