package o;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DefaultWebSocketClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "updateState", "Lkotlinx/coroutines/internal/ThreadState;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class WebSocketClient {
    @NotNull
    @JvmField
    public static final closeBlocking getMax = new closeBlocking("NO_THREAD_ELEMENTS");
    private static final Function2<writeMore<?>, CoroutineContext.Element, writeMore<?>> length = setMax.INSTANCE;
    private static final Function2<onClosing, CoroutineContext.Element, onClosing> setMax = setMin.INSTANCE;
    private static final Function2<Object, CoroutineContext.Element, Object> setMin = length.INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/scheduling/GlobalQueue;", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Lkotlinx/coroutines/scheduling/Task;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public final class WebsocketWriteThread extends DefaultWebSocketClient.SCConnectionTimerRunnable<readStringLine> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "", "countOrElement", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function2<Object, CoroutineContext.Element, Object> {
        public static final length INSTANCE = new length();

        length() {
            super(2);
        }

        @Nullable
        public final Object invoke(@Nullable Object obj, @NotNull CoroutineContext.Element element) {
            if (!(element instanceof writeMore)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            if (intValue == 0) {
                return element;
            }
            return Integer.valueOf(intValue + 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/ThreadContextElement;", "found", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function2<writeMore<?>, CoroutineContext.Element, writeMore<?>> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(2);
        }

        @Nullable
        public final writeMore<?> invoke(@Nullable writeMore<?> writemore, @NotNull CoroutineContext.Element element) {
            if (writemore != null) {
                return writemore;
            }
            if (!(element instanceof writeMore)) {
                element = null;
            }
            return (writeMore) element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function2<onClosing, CoroutineContext.Element, onClosing> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(2);
        }

        @NotNull
        public final onClosing invoke(@NotNull onClosing onclosing, @NotNull CoroutineContext.Element element) {
            if (element instanceof writeMore) {
                writeMore<Object> writemore = (writeMore) element;
                onclosing.getMax[onclosing.setMin] = writemore.getMin(onclosing.length);
                writeMore<Object>[] writemoreArr = onclosing.setMax;
                int i = onclosing.setMin;
                onclosing.setMin = i + 1;
                if (writemore != null) {
                    writemoreArr[i] = writemore;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
            }
            return onclosing;
        }
    }

    @NotNull
    public static final Object getMin(@NotNull CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, setMin);
        Intrinsics.checkNotNull(fold);
        return fold;
    }

    @Nullable
    public static final Object getMin(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, setMin);
            Intrinsics.checkNotNull(obj);
        }
        if (obj == 0) {
            return getMax;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new onClosing(coroutineContext, ((Number) obj).intValue()), setMax);
        }
        if (obj != null) {
            return ((writeMore) obj).getMin(coroutineContext);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    public static final void length(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj != getMax) {
            if (obj instanceof onClosing) {
                onClosing onclosing = (onClosing) obj;
                int length2 = onclosing.setMax.length;
                while (true) {
                    length2--;
                    if (length2 >= 0) {
                        writeMore<Object> writemore = onclosing.setMax[length2];
                        Intrinsics.checkNotNull(writemore);
                        writemore.getMin(onclosing.getMax[length2]);
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = coroutineContext.fold(null, length);
                if (fold != null) {
                    ((writeMore) fold).getMin(obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
        }
    }
}
