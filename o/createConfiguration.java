package o;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public abstract class createConfiguration<T> extends readStringLine {
    @JvmField
    public int length;

    @Nullable
    public abstract Object getMin();

    public <T> T getMin(@Nullable Object obj) {
        return obj;
    }

    public void setMin(@Nullable Object obj, @NotNull Throwable th) {
    }

    @NotNull
    public abstract Continuation<T> toIntRange();

    public createConfiguration(int i) {
        this.length = i;
    }

    @Nullable
    public Throwable length(@Nullable Object obj) {
        if (!(obj instanceof APExpansion)) {
            obj = null;
        }
        APExpansion aPExpansion = (APExpansion) obj;
        if (aPExpansion != null) {
            return aPExpansion.setMax;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (r4.toFloatRange() != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        if (r4.toFloatRange() != false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = o.getApdidToken.setMax()
            if (r0 == 0) goto L_0x0019
            int r0 = r10.length
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0019:
            o.translateHandshakeHttp r0 = r10.toIntRange
            kotlin.coroutines.Continuation r1 = r10.toIntRange()     // Catch:{ all -> 0x00f1 }
            if (r1 == 0) goto L_0x00e9
            o.onSSLHandshake r1 = (o.onSSLHandshake) r1     // Catch:{ all -> 0x00f1 }
            kotlin.coroutines.Continuation<T> r2 = r1.toFloatRange     // Catch:{ all -> 0x00f1 }
            java.lang.Object r1 = r1.getMin     // Catch:{ all -> 0x00f1 }
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch:{ all -> 0x00f1 }
            java.lang.Object r1 = o.WebSocketClient.getMin(r3, r1)     // Catch:{ all -> 0x00f1 }
            o.closeBlocking r4 = o.WebSocketClient.getMax     // Catch:{ all -> 0x00f1 }
            r5 = 0
            if (r1 == r4) goto L_0x0039
            o.unwrap r4 = o.registerLog.getMin(r2, r3, r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x003a
        L_0x0039:
            r4 = r5
        L_0x003a:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch:{ all -> 0x00dc }
            java.lang.Object r7 = r10.getMin()     // Catch:{ all -> 0x00dc }
            java.lang.Throwable r8 = r10.length(r7)     // Catch:{ all -> 0x00dc }
            if (r8 != 0) goto L_0x005b
            int r9 = r10.length     // Catch:{ all -> 0x00dc }
            boolean r9 = o.APSecuritySdk.TokenResult.getMax(r9)     // Catch:{ all -> 0x00dc }
            if (r9 == 0) goto L_0x005b
            o.DictionaryKeys$getMin r9 = o.DictionaryKeys.getMax     // Catch:{ all -> 0x00dc }
            kotlin.coroutines.CoroutineContext$Key r9 = (kotlin.coroutines.CoroutineContext.Key) r9     // Catch:{ all -> 0x00dc }
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r9)     // Catch:{ all -> 0x00dc }
            o.DictionaryKeys r6 = (o.DictionaryKeys) r6     // Catch:{ all -> 0x00dc }
            goto L_0x005c
        L_0x005b:
            r6 = r5
        L_0x005c:
            if (r6 == 0) goto L_0x0093
            boolean r9 = r6.B_()     // Catch:{ all -> 0x00dc }
            if (r9 != 0) goto L_0x0093
            java.util.concurrent.CancellationException r6 = r6.C_()     // Catch:{ all -> 0x00dc }
            r8 = r6
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x00dc }
            r10.setMin(r7, r8)     // Catch:{ all -> 0x00dc }
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x00dc }
            boolean r7 = o.getApdidToken.length()     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x0085
            boolean r7 = r2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame     // Catch:{ all -> 0x00dc }
            if (r7 != 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00dc }
            r7 = r2
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7     // Catch:{ all -> 0x00dc }
            java.lang.Throwable r6 = o.WebSocketCallbackAdapter.length((java.lang.Throwable) r6, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r7)     // Catch:{ all -> 0x00dc }
            goto L_0x0087
        L_0x0085:
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00dc }
        L_0x0087:
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)     // Catch:{ all -> 0x00dc }
            java.lang.Object r6 = kotlin.Result.m1constructorimpl(r6)     // Catch:{ all -> 0x00dc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00dc }
            goto L_0x00b0
        L_0x0093:
            if (r8 == 0) goto L_0x00a3
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x00dc }
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r8)     // Catch:{ all -> 0x00dc }
            java.lang.Object r6 = kotlin.Result.m1constructorimpl(r6)     // Catch:{ all -> 0x00dc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00dc }
            goto L_0x00b0
        L_0x00a3:
            java.lang.Object r6 = r10.getMin(r7)     // Catch:{ all -> 0x00dc }
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x00dc }
            java.lang.Object r6 = kotlin.Result.m1constructorimpl(r6)     // Catch:{ all -> 0x00dc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00dc }
        L_0x00b0:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00dc }
            if (r4 == 0) goto L_0x00ba
            boolean r2 = r4.toFloatRange()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x00bd
        L_0x00ba:
            o.WebSocketClient.length(r3, r1)     // Catch:{ all -> 0x00f1 }
        L_0x00bd:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x00c9 }
            r0.getMin()     // Catch:{ all -> 0x00c9 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00c9 }
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x00d4
        L_0x00c9:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)
        L_0x00d4:
            java.lang.Throwable r0 = kotlin.Result.m4exceptionOrNullimpl(r0)
            r10.getMin(r5, r0)
            return
        L_0x00dc:
            r2 = move-exception
            if (r4 == 0) goto L_0x00e5
            boolean r4 = r4.toFloatRange()     // Catch:{ all -> 0x00f1 }
            if (r4 == 0) goto L_0x00e8
        L_0x00e5:
            o.WebSocketClient.length(r3, r1)     // Catch:{ all -> 0x00f1 }
        L_0x00e8:
            throw r2     // Catch:{ all -> 0x00f1 }
        L_0x00e9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>"
            r1.<init>(r2)     // Catch:{ all -> 0x00f1 }
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x00fe }
            r0.getMin()     // Catch:{ all -> 0x00fe }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00fe }
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)     // Catch:{ all -> 0x00fe }
            goto L_0x0109
        L_0x00fe:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)
        L_0x0109:
            java.lang.Throwable r0 = kotlin.Result.m4exceptionOrNullimpl(r0)
            r10.getMin(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createConfiguration.run():void");
    }

    public final void getMin(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                ExceptionsKt.addSuppressed(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            StringBuilder sb = new StringBuilder("Fatal exception in coroutines machinery for ");
            sb.append(this);
            sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
            String obj = sb.toString();
            Intrinsics.checkNotNull(th);
            APExpansion.AnonymousClass2.setMin(toIntRange().getContext(), new baseInitToken(obj, th));
        }
    }
}
