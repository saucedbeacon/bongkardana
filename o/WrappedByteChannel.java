package o;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0005\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "checkContext", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class WrappedByteChannel {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "count", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {
        final /* synthetic */ BasicWebSocketContext $this_checkContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(BasicWebSocketContext basicWebSocketContext) {
            super(2);
            this.$this_checkContext = basicWebSocketContext;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(invoke(((Number) obj).intValue(), (CoroutineContext.Element) obj2));
        }

        public final int invoke(int i, @NotNull CoroutineContext.Element element) {
            CoroutineContext.Key key = element.getKey();
            CoroutineContext.Element element2 = this.$this_checkContext.collectContext.get(key);
            if (key == DictionaryKeys.getMax) {
                DictionaryKeys dictionaryKeys = (DictionaryKeys) element2;
                if (element != null) {
                    DictionaryKeys max = WrappedByteChannel.setMax((DictionaryKeys) element, dictionaryKeys);
                    if (max == dictionaryKeys) {
                        return dictionaryKeys == null ? i : i + 1;
                    }
                    StringBuilder sb = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                    sb.append(max);
                    sb.append(", expected child of ");
                    sb.append(dictionaryKeys);
                    sb.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                    throw new IllegalStateException(sb.toString().toString());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.Job");
            } else if (element != element2) {
                return Integer.MIN_VALUE;
            } else {
                return i + 1;
            }
        }
    }

    @Nullable
    public static final DictionaryKeys setMax(@Nullable DictionaryKeys dictionaryKeys, @Nullable DictionaryKeys dictionaryKeys2) {
        while (dictionaryKeys != null) {
            if (dictionaryKeys == dictionaryKeys2 || !(dictionaryKeys instanceof WebSocketCallback)) {
                return dictionaryKeys;
            }
            dictionaryKeys = ((WebSocketCallback) dictionaryKeys).invoke();
        }
        return null;
    }
}
