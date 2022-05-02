package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import o.DeviceTokenClient;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\b\u001aU\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "getREUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "getUNDEFINED$annotations", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class onClose {
    /* access modifiers changed from: private */
    public static final closeBlocking length = new closeBlocking("UNDEFINED");
    @NotNull
    @JvmField
    public static final closeBlocking setMin = new closeBlocking("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        if (r1.toFloatRange() != false) goto L_0x00c2;
     */
    @kotlinx.coroutines.InternalCoroutinesApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void getMax(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r8, @org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            boolean r0 = r8 instanceof o.onSSLHandshake
            if (r0 == 0) goto L_0x00ea
            o.onSSLHandshake r8 = (o.onSSLHandshake) r8
            java.lang.Throwable r0 = kotlin.Result.m4exceptionOrNullimpl(r9)
            if (r0 != 0) goto L_0x000e
            r1 = r9
            goto L_0x0013
        L_0x000e:
            o.APExpansion r1 = new o.APExpansion
            r1.<init>(r0)
        L_0x0013:
            o.APExpansion$1 r0 = r8.setMax
            r8.getContext()
            boolean r0 = r0.setMax()
            r2 = 1
            if (r0 == 0) goto L_0x002f
            r8.getMax = r1
            r8.length = r2
            o.APExpansion$1 r9 = r8.setMax
            kotlin.coroutines.CoroutineContext r0 = r8.getContext()
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r9.getMin(r0, r8)
            return
        L_0x002f:
            o.getApdidToken.setMax()
            o.isNeedRead r0 = o.isNeedRead.setMin
            o.DeviceTokenClient$InitResultListener r0 = o.isNeedRead.getMin()
            boolean r3 = r0.toIntRange()
            if (r3 == 0) goto L_0x0053
            r8.getMax = r1
            r8.length = r2
            o.createConfiguration r8 = (o.createConfiguration) r8
            o.removeAttribute<o.createConfiguration<?>> r9 = r0.getMax
            if (r9 != 0) goto L_0x004f
            o.removeAttribute r9 = new o.removeAttribute
            r9.<init>()
            r0.getMax = r9
        L_0x004f:
            r9.setMin(r8)
            return
        L_0x0053:
            r3 = r8
            o.createConfiguration r3 = (o.createConfiguration) r3
            long r4 = r0.setMin
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            long r4 = r4 + r6
            r0.setMin = r4
            r4 = 0
            kotlin.coroutines.CoroutineContext r5 = r8.getContext()     // Catch:{ all -> 0x00dd }
            o.DictionaryKeys$getMin r6 = o.DictionaryKeys.getMax     // Catch:{ all -> 0x00dd }
            kotlin.coroutines.CoroutineContext$Key r6 = (kotlin.coroutines.CoroutineContext.Key) r6     // Catch:{ all -> 0x00dd }
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)     // Catch:{ all -> 0x00dd }
            o.DictionaryKeys r5 = (o.DictionaryKeys) r5     // Catch:{ all -> 0x00dd }
            if (r5 == 0) goto L_0x009a
            boolean r6 = r5.B_()     // Catch:{ all -> 0x00dd }
            if (r6 != 0) goto L_0x009a
            java.util.concurrent.CancellationException r5 = r5.C_()     // Catch:{ all -> 0x00dd }
            r6 = r5
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00dd }
            boolean r7 = r1 instanceof o.getAD108     // Catch:{ all -> 0x00dd }
            if (r7 == 0) goto L_0x0089
            o.getAD108 r1 = (o.getAD108) r1     // Catch:{ all -> 0x00dd }
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r1.length     // Catch:{ all -> 0x00dd }
            r1.invoke(r6)     // Catch:{ all -> 0x00dd }
        L_0x0089:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x00dd }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00dd }
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r5)     // Catch:{ all -> 0x00dd }
            java.lang.Object r1 = kotlin.Result.m1constructorimpl(r1)     // Catch:{ all -> 0x00dd }
            r8.resumeWith(r1)     // Catch:{ all -> 0x00dd }
            r1 = 1
            goto L_0x009b
        L_0x009a:
            r1 = 0
        L_0x009b:
            if (r1 != 0) goto L_0x00d3
            kotlin.coroutines.Continuation<T> r1 = r8.toFloatRange     // Catch:{ all -> 0x00dd }
            java.lang.Object r5 = r8.getMin     // Catch:{ all -> 0x00dd }
            kotlin.coroutines.CoroutineContext r6 = r1.getContext()     // Catch:{ all -> 0x00dd }
            java.lang.Object r5 = o.WebSocketClient.getMin(r6, r5)     // Catch:{ all -> 0x00dd }
            o.closeBlocking r7 = o.WebSocketClient.getMax     // Catch:{ all -> 0x00dd }
            if (r5 == r7) goto L_0x00b2
            o.unwrap r1 = o.registerLog.getMin(r1, r6, r5)     // Catch:{ all -> 0x00dd }
            goto L_0x00b3
        L_0x00b2:
            r1 = r4
        L_0x00b3:
            kotlin.coroutines.Continuation<T> r8 = r8.toFloatRange     // Catch:{ all -> 0x00c6 }
            r8.resumeWith(r9)     // Catch:{ all -> 0x00c6 }
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x00c2
            boolean r8 = r1.toFloatRange()     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x00d3
        L_0x00c2:
            o.WebSocketClient.length(r6, r5)     // Catch:{ all -> 0x00dd }
            goto L_0x00d3
        L_0x00c6:
            r8 = move-exception
            if (r1 == 0) goto L_0x00cf
            boolean r9 = r1.toFloatRange()     // Catch:{ all -> 0x00dd }
            if (r9 == 0) goto L_0x00d2
        L_0x00cf:
            o.WebSocketClient.length(r6, r5)     // Catch:{ all -> 0x00dd }
        L_0x00d2:
            throw r8     // Catch:{ all -> 0x00dd }
        L_0x00d3:
            boolean r8 = r0.toFloatRange()     // Catch:{ all -> 0x00dd }
            if (r8 != 0) goto L_0x00d3
            r0.setMax((boolean) r2)
            return
        L_0x00dd:
            r8 = move-exception
            r3.getMin(r8, r4)     // Catch:{ all -> 0x00e5 }
            r0.setMax((boolean) r2)
            return
        L_0x00e5:
            r8 = move-exception
            r0.setMax((boolean) r2)
            throw r8
        L_0x00ea:
            r8.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClose.getMax(kotlin.coroutines.Continuation, java.lang.Object):void");
    }

    public static final boolean setMin(@NotNull onSSLHandshake<? super Unit> onsslhandshake) {
        Unit unit = Unit.INSTANCE;
        getApdidToken.setMax();
        isNeedRead isneedread = isNeedRead.setMin;
        DeviceTokenClient.InitResultListener min = isNeedRead.getMin();
        if (min.isInside()) {
            return false;
        }
        if (min.toIntRange()) {
            onsslhandshake.getMax = unit;
            onsslhandshake.length = 1;
            createConfiguration createconfiguration = onsslhandshake;
            removeAttribute<createConfiguration<?>> removeattribute = min.getMax;
            if (removeattribute == null) {
                removeattribute = new removeAttribute<>();
                min.getMax = removeattribute;
            }
            removeattribute.setMin(createconfiguration);
            return true;
        }
        createConfiguration createconfiguration2 = onsslhandshake;
        min.setMin += 4294967296L;
        try {
            onsslhandshake.run();
            do {
            } while (min.toFloatRange());
        } catch (Throwable th) {
            min.setMax(true);
            throw th;
        }
        min.setMax(true);
        return false;
    }
}
