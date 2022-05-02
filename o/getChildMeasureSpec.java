package o;

import com.twilio.verify.TwilioVerifyException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0001\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072V\u0010\t\u001aR\u0012\u001d\u0012\u001b\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012)\u0012'\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\b`\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\nH\u0000\u001a\u0001\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00112\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072b\u0010\t\u001a^\u0012)\u0012'\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u0002H\u0011`\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012)\u0012'\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\b`\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\nH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000*(\u0010\u0013\u001a\u0004\b\u0000\u0010\u0014\"\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u00020\u00030\u00072\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u00020\u00030\u0007*\u0016\u0010\u0015\"\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0005*(\u0010\u0016\u001a\u0004\b\u0000\u0010\u0011\"\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00030\u00072\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\u00030\u0007¨\u0006\u0017"}, d2 = {"executorService", "Ljava/util/concurrent/ExecutorService;", "execute", "", "success", "Lkotlin/Function0;", "error", "Lkotlin/Function1;", "Lcom/twilio/verify/TwilioVerifyException;", "block", "Lkotlin/Function2;", "Lcom/twilio/verify/threading/SafeSuccess;", "Lkotlin/ParameterName;", "name", "onSuccess", "Lcom/twilio/verify/threading/SafeError;", "onError", "T", "Lcom/twilio/verify/threading/SafeSuccessResult;", "SafeError", "E", "SafeSuccess", "SafeSuccessResult", "verify_release"}, k = 2, mv = {1, 1, 16})
public final class getChildMeasureSpec {
    private static final ExecutorService setMin;

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
        Intrinsics.checkExpressionValueIsNotNull(newFixedThreadPool, "Executors.newFixedThreadPool(10)");
        setMin = newFixedThreadPool;
    }

    public static final <T> void setMin(@NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12, @NotNull Function2<? super Function1<? super T, Unit>, ? super Function1<? super TwilioVerifyException, Unit>, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        Intrinsics.checkParameterIsNotNull(function2, "block");
        setMin.execute(new getDecoratedMeasuredWidth(function2, function1, function12));
    }

    public static final void setMin(@NotNull Function0<Unit> function0, @NotNull Function1<? super TwilioVerifyException, Unit> function1, @NotNull Function2<? super Function0<Unit>, ? super Function1<? super TwilioVerifyException, Unit>, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(function0, "success");
        Intrinsics.checkParameterIsNotNull(function1, "error");
        Intrinsics.checkParameterIsNotNull(function2, "block");
        setMin.execute(new getDecoratedMeasuredWidth(new getMax(function2), new getMin(function0), function1));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0001`\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "onSuccess", "Lkotlin/Function1;", "Lcom/twilio/verify/threading/SafeSuccessResult;", "onError", "Lcom/twilio/verify/TwilioVerifyException;", "Lcom/twilio/verify/threading/SafeError;", "invoke"}, k = 3, mv = {1, 1, 16})
    static final class getMax extends Lambda implements Function2<Function1<? super Unit, ? extends Unit>, Function1<? super TwilioVerifyException, ? extends Unit>, Unit> {
        final /* synthetic */ Function2 $block;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(Function2 function2) {
            super(2);
            this.$block = function2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Function1<? super Unit, Unit>) (Function1) obj, (Function1<? super TwilioVerifyException, Unit>) (Function1) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull final Function1<? super Unit, Unit> function1, @NotNull Function1<? super TwilioVerifyException, Unit> function12) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            Intrinsics.checkParameterIsNotNull(function12, "onError");
            this.$block.invoke(new Function0<Unit>() {
                public final void invoke() {
                    function1.invoke(Unit.INSTANCE);
                }
            }, function12);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 16})
    static final class getMin extends Lambda implements Function1<Unit, Unit> {
        final /* synthetic */ Function0 $success;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Function0 function0) {
            super(1);
            this.$success = function0;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Unit unit) {
            Intrinsics.checkParameterIsNotNull(unit, "it");
            this.$success.invoke();
        }
    }
}
