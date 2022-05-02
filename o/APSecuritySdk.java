package o;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import o.APExpansion;
import o.DeviceTokenClient;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class APSecuritySdk {
    public static final /* synthetic */ int[] getMax;
    public static final /* synthetic */ int[] setMax;

    static {
        int[] iArr = new int[CoroutineStart.values().length];
        setMax = iArr;
        iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
        setMax[CoroutineStart.ATOMIC.ordinal()] = 2;
        setMax[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        setMax[CoroutineStart.LAZY.ordinal()] = 4;
        int[] iArr2 = new int[CoroutineStart.values().length];
        getMax = iArr2;
        iArr2[CoroutineStart.DEFAULT.ordinal()] = 1;
        getMax[CoroutineStart.ATOMIC.ordinal()] = 2;
        getMax[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        getMax[CoroutineStart.LAZY.ordinal()] = 4;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
    public final class InitResultListener {
        @NotNull
        public static final String length(@NotNull Continuation<?> continuation) {
            Object obj;
            if (continuation instanceof onSSLHandshake) {
                return continuation.toString();
            }
            try {
                Result.Companion companion = Result.Companion;
                StringBuilder sb = new StringBuilder();
                sb.append(continuation);
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(continuation)));
                obj = Result.m1constructorimpl(sb.toString());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m1constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m4exceptionOrNullimpl(obj) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(continuation.getClass().getName());
                sb2.append('@');
                sb2.append(Integer.toHexString(System.identityHashCode(continuation)));
                obj = sb2.toString();
            }
            return (String) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
    public final class TokenResult {
        public static final boolean getMax(int i) {
            return i == 1 || i == 2;
        }

        public static final boolean setMin(int i) {
            return i == 2;
        }

        public static final <T> void getMin(@NotNull createConfiguration<? super T> createconfiguration, int i) {
            boolean z = true;
            if (getApdidToken.setMax()) {
                if (!(i != -1)) {
                    throw new AssertionError();
                }
            }
            Continuation<? super T> intRange = createconfiguration.toIntRange();
            if (i != 4) {
                z = false;
            }
            if (z || !(intRange instanceof onSSLHandshake) || getMax(i) != getMax(createconfiguration.length)) {
                setMax(createconfiguration, intRange, z);
                return;
            }
            APExpansion.AnonymousClass1 r5 = ((onSSLHandshake) intRange).setMax;
            CoroutineContext context = intRange.getContext();
            if (r5.setMax()) {
                r5.getMin(context, createconfiguration);
            } else {
                setMin((createConfiguration<?>) createconfiguration);
            }
        }

        private static <T> void setMax(@NotNull createConfiguration<? super T> createconfiguration, @NotNull Continuation<? super T> continuation, boolean z) {
            Object obj;
            Object min = createconfiguration.getMin();
            Throwable length = createconfiguration.length(min);
            if (length != null) {
                Result.Companion companion = Result.Companion;
                obj = ResultKt.createFailure(length);
            } else {
                Result.Companion companion2 = Result.Companion;
                obj = createconfiguration.getMin(min);
            }
            Object r3 = Result.m1constructorimpl(obj);
            if (!z) {
                continuation.resumeWith(r3);
            } else if (continuation != null) {
                onSSLHandshake onsslhandshake = (onSSLHandshake) continuation;
                Continuation<T> continuation2 = onsslhandshake.toFloatRange;
                Object obj2 = onsslhandshake.getMin;
                CoroutineContext context = continuation2.getContext();
                Object min2 = WebSocketClient.getMin(context, obj2);
                unwrap<?> min3 = min2 != WebSocketClient.getMax ? registerLog.getMin(continuation2, context, min2) : null;
                try {
                    onsslhandshake.toFloatRange.resumeWith(r3);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    if (min3 == null || min3.toFloatRange()) {
                        WebSocketClient.length(context, min2);
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
            }
        }

        private static final void setMin(createConfiguration<?> createconfiguration) {
            isNeedRead isneedread = isNeedRead.setMin;
            DeviceTokenClient.InitResultListener min = isNeedRead.getMin();
            if (min.toIntRange()) {
                removeAttribute<createConfiguration<?>> removeattribute = min.getMax;
                if (removeattribute == null) {
                    removeattribute = new removeAttribute<>();
                    min.getMax = removeattribute;
                }
                removeattribute.setMin(createconfiguration);
                return;
            }
            min.setMin += DeviceTokenClient.InitResultListener.equals();
            try {
                setMax(createconfiguration, createconfiguration.toIntRange(), true);
                do {
                } while (min.toFloatRange());
            } catch (Throwable th) {
                createconfiguration.getMin(th, (Throwable) null);
            } finally {
                min.setMax(true);
            }
        }
    }
}
