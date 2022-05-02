package o;

import id.dana.domain.social.FullSyncNotFinishedException;
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
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u0011\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0017\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001d\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u001fj\u0002` H@ø\u0001\u0000¢\u0006\u0002\u0010!J%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120#2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0011\u0010&\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0011\u0010'\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lid/dana/domain/social/sync/PartialSyncContactRunner;", "Lid/dana/domain/social/sync/BaseSyncContactRunner;", "socialSyncContactRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lid/dana/domain/social/SocialSyncRepository;)V", "contactSizeForCalculatingOffsetAndNextSyncTime", "", "lastSyncContactOffset", "lastSyncTime", "", "maxContactPerbatch", "nextOffsetToBeSavedIfSyncSuccess", "calculateNextSyncOffsetToBeSaveIfSyncSuccess", "", "cancelSyncIfFullSyncNotFinished", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueAnotherWorkIfSynchedContactIsEqualToMaxPerbatch", "Lid/dana/domain/social/Result$Success;", "Lid/dana/domain/social/model/SyncResult;", "result", "getContactToBeSynched", "", "Lid/dana/domain/social/model/SocialContact;", "getLastSyncTimeAndItsContactOffsetForCurrentSync", "getNewSyncTime", "getTimeToBeUsedForNextSync", "isQueryContactEmptyAfterUsingCurrentSyncTime", "", "onSyncContactError", "Lid/dana/domain/social/Result$Error;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSyncContactSuccess", "Lid/dana/domain/social/Result;", "(Lid/dana/domain/social/Result$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSyncStarting", "saveOffsetOfCurrentSyncTimeForNextSync", "saveSyncTimeForNextSync", "domain_release"}, k = 1, mv = {1, 4, 2})
public class ScanJobScheduler extends ScanHelper.ScanProcessor {
    private int contactSizeForCalculatingOffsetAndNextSyncTime;
    private int lastSyncContactOffset;
    private String lastSyncTime = "";
    private int maxContactPerbatch = 50;
    private int nextOffsetToBeSavedIfSyncSuccess;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"getLastSyncTimeAndItsContactOffsetForCurrentSync", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.PartialSyncContactRunner", f = "PartialSyncContactRunner.kt", i = {0, 0, 1, 1}, l = {47, 48, 49}, m = "getLastSyncTimeAndItsContactOffsetForCurrentSync", n = {"this", "$this$run", "this", "$this$run"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class getMax extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJobScheduler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(ScanJobScheduler scanJobScheduler, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJobScheduler;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.getLastSyncTimeAndItsContactOffsetForCurrentSync(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"cancelSyncIfFullSyncNotFinished", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.PartialSyncContactRunner", f = "PartialSyncContactRunner.kt", i = {}, l = {40}, m = "cancelSyncIfFullSyncNotFinished", n = {}, s = {})
    static final class getMin extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJobScheduler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(ScanJobScheduler scanJobScheduler, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJobScheduler;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.cancelSyncIfFullSyncNotFinished(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H@"}, d2 = {"onSyncContactSuccess", "", "result", "Lid/dana/domain/social/Result$Success;", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.PartialSyncContactRunner", f = "PartialSyncContactRunner.kt", i = {0, 0, 1, 1}, l = {66, 67}, m = "onSyncContactSuccess$suspendImpl", n = {"this", "result", "this", "result"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class length extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJobScheduler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(ScanJobScheduler scanJobScheduler, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJobScheduler;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanJobScheduler.onSyncContactSuccess$suspendImpl(this.this$0, (forThisDevice.setMax) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H@"}, d2 = {"getContactToBeSynched", "", "continuation", "Lkotlin/coroutines/Continuation;", "", "Lid/dana/domain/social/model/SocialContact;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.PartialSyncContactRunner", f = "PartialSyncContactRunner.kt", i = {0}, l = {55}, m = "getContactToBeSynched$suspendImpl", n = {"this"}, s = {"L$0"})
    static final class setMax extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJobScheduler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ScanJobScheduler scanJobScheduler, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJobScheduler;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanJobScheduler.getContactToBeSynched$suspendImpl(this.this$0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"onSyncStarting", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.domain.social.sync.PartialSyncContactRunner", f = "PartialSyncContactRunner.kt", i = {0, 1}, l = {34, 35, 36}, m = "onSyncStarting$suspendImpl", n = {"this", "this"}, s = {"L$0", "L$0"})
    static final class setMin extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ScanJobScheduler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(ScanJobScheduler scanJobScheduler, Continuation continuation) {
            super(continuation);
            this.this$0 = scanJobScheduler;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanJobScheduler.onSyncStarting$suspendImpl(this.this$0, this);
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
    public ScanJobScheduler(@NotNull getRequestedModel getrequestedmodel) {
        super(getrequestedmodel);
        Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncContactRepository");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object onSyncStarting$suspendImpl(o.ScanJobScheduler r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof o.ScanJobScheduler.setMin
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.ScanJobScheduler$setMin r0 = (o.ScanJobScheduler.setMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.ScanJobScheduler$setMin r0 = new o.ScanJobScheduler$setMin
            r0.<init>(r6, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x006d
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            java.lang.Object r6 = r0.L$0
            o.ScanJobScheduler r6 = (o.ScanJobScheduler) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0061
        L_0x0040:
            java.lang.Object r6 = r0.L$0
            o.ScanJobScheduler r6 = (o.ScanJobScheduler) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0056
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = super.onSyncStarting(r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r6.cancelSyncIfFullSyncNotFinished(r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.getLastSyncTimeAndItsContactOffsetForCurrentSync(r0)
            if (r6 != r1) goto L_0x006d
            return r1
        L_0x006d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJobScheduler.onSyncStarting$suspendImpl(o.ScanJobScheduler, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object cancelSyncIfFullSyncNotFinished(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.ScanJobScheduler.getMin
            if (r0 == 0) goto L_0x0014
            r0 = r5
            o.ScanJobScheduler$getMin r0 = (o.ScanJobScheduler.getMin) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            o.ScanJobScheduler$getMin r0 = new o.ScanJobScheduler$getMin
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
            if (r5 == 0) goto L_0x004d
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L_0x004d:
            id.dana.domain.social.FullSyncNotFinishedException r5 = new id.dana.domain.social.FullSyncNotFinishedException
            r5.<init>()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJobScheduler.cancelSyncIfFullSyncNotFinished(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object getLastSyncTimeAndItsContactOffsetForCurrentSync(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.ScanJobScheduler.getMax
            if (r0 == 0) goto L_0x0014
            r0 = r8
            o.ScanJobScheduler$getMax r0 = (o.ScanJobScheduler.getMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            o.ScanJobScheduler$getMax r0 = new o.ScanJobScheduler$getMax
            r0.<init>(r7, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x004d
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r0 = r0.L$0
            o.ScanJobScheduler r0 = (o.ScanJobScheduler) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00a8
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003d:
            java.lang.Object r2 = r0.L$2
            o.ScanJobScheduler r2 = (o.ScanJobScheduler) r2
            java.lang.Object r4 = r0.L$1
            o.getRequestedModel r4 = (o.getRequestedModel) r4
            java.lang.Object r5 = r0.L$0
            o.ScanJobScheduler r5 = (o.ScanJobScheduler) r5
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008f
        L_0x004d:
            java.lang.Object r2 = r0.L$2
            o.ScanJobScheduler r2 = (o.ScanJobScheduler) r2
            java.lang.Object r5 = r0.L$1
            o.getRequestedModel r5 = (o.getRequestedModel) r5
            java.lang.Object r6 = r0.L$0
            o.ScanJobScheduler r6 = (o.ScanJobScheduler) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0077
        L_0x005d:
            kotlin.ResultKt.throwOnFailure(r8)
            o.getRequestedModel r8 = r7.getSocialSyncContactRepository()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r5
            java.lang.Object r2 = r8.getLastSynchedTime(r0)
            if (r2 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r6 = r7
            r5 = r8
            r8 = r2
            r2 = r6
        L_0x0077:
            java.lang.String r8 = (java.lang.String) r8
            r2.lastSyncTime = r8
            java.lang.String r8 = r6.lastSyncTime
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r8 = r5.getOffsetAtSpecificSyncTime(r8, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r4 = r5
            r2 = r6
            r5 = r2
        L_0x008f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r2.lastSyncContactOffset = r8
            r0.L$0 = r5
            r8 = 0
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r8 = r4.getMaxContactPerbatch(r0)
            if (r8 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r0 = r5
        L_0x00a8:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.maxContactPerbatch = r8
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJobScheduler.getLastSyncTimeAndItsContactOffsetForCurrentSync(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object getContactToBeSynched$suspendImpl(o.ScanJobScheduler r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof o.ScanJobScheduler.setMax
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.ScanJobScheduler$setMax r0 = (o.ScanJobScheduler.setMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            o.ScanJobScheduler$setMax r0 = new o.ScanJobScheduler$setMax
            r0.<init>(r6, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r6 = r0.L$0
            o.ScanJobScheduler r6 = (o.ScanJobScheduler) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004e
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            o.getRequestedModel r7 = r6.getSocialSyncContactRepository()
            int r2 = r6.maxContactPerbatch
            int r4 = r6.lastSyncContactOffset
            java.lang.String r5 = r6.lastSyncTime
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.getModifiedContactSinceSpecificTime(r2, r4, r5, r0)
            if (r7 != r1) goto L_0x004e
            return r1
        L_0x004e:
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            r6.contactSizeForCalculatingOffsetAndNextSyncTime = r0
            r6.calculateNextSyncOffsetToBeSaveIfSyncSuccess()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJobScheduler.getContactToBeSynched$suspendImpl(o.ScanJobScheduler, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void calculateNextSyncOffsetToBeSaveIfSyncSuccess() {
        this.nextOffsetToBeSavedIfSyncSuccess = this.lastSyncContactOffset + this.contactSizeForCalculatingOffsetAndNextSyncTime;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: o.forThisDevice$setMax} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object onSyncContactSuccess$suspendImpl(o.ScanJobScheduler r6, o.forThisDevice.setMax r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof o.ScanJobScheduler.length
            if (r0 == 0) goto L_0x0014
            r0 = r8
            o.ScanJobScheduler$length r0 = (o.ScanJobScheduler.length) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            o.ScanJobScheduler$length r0 = new o.ScanJobScheduler$length
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
            o.ScanJobScheduler r7 = (o.ScanJobScheduler) r7
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
            o.ScanJobScheduler r6 = (o.ScanJobScheduler) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005a
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.saveOffsetOfCurrentSyncTimeForNextSync(r0)
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = r6.saveSyncTimeForNextSync(r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x006a:
            o.forThisDevice$setMax r6 = r7.enqueueAnotherWorkIfSynchedContactIsEqualToMaxPerbatch(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ScanJobScheduler.onSyncContactSuccess$suspendImpl(o.ScanJobScheduler, o.forThisDevice$setMax, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object onSyncContactError$suspendImpl(ScanJobScheduler scanJobScheduler, Exception exc, Continuation continuation) {
        if (exc instanceof FullSyncNotFinishedException) {
            return new forThisDevice.getMin(exc);
        }
        return super.onSyncContactError(exc, continuation);
    }

    private final forThisDevice.setMax<onLeScan> enqueueAnotherWorkIfSynchedContactIsEqualToMaxPerbatch(forThisDevice.setMax<Integer> setmax) {
        return new forThisDevice.setMax<>(new onLeScan(setmax.getData().intValue() >= this.maxContactPerbatch));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object saveOffsetOfCurrentSyncTimeForNextSync(Continuation<? super Unit> continuation) {
        Object saveOffsetAtSpecificSyncTime = getSocialSyncContactRepository().saveOffsetAtSpecificSyncTime(this.nextOffsetToBeSavedIfSyncSuccess, this.lastSyncTime, continuation);
        if (saveOffsetAtSpecificSyncTime == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return saveOffsetAtSpecificSyncTime;
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object saveSyncTimeForNextSync(Continuation<? super Unit> continuation) {
        Object saveLastSynchedTime = getSocialSyncContactRepository().saveLastSynchedTime(getTimeToBeUsedForNextSync(), continuation);
        if (saveLastSynchedTime == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return saveLastSynchedTime;
        }
        return Unit.INSTANCE;
    }

    private final String getTimeToBeUsedForNextSync() {
        if (isQueryContactEmptyAfterUsingCurrentSyncTime()) {
            return getNewSyncTime();
        }
        return this.lastSyncTime;
    }

    private final boolean isQueryContactEmptyAfterUsingCurrentSyncTime() {
        return this.contactSizeForCalculatingOffsetAndNextSyncTime == 0;
    }

    private final String getNewSyncTime() {
        return String.valueOf(System.currentTimeMillis());
    }
}
