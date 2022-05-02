package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJa\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\n0\r2'\b\u0002\u0010\u0011\u001a!\u0012\u0017\u0012\u00150\u0012j\u0002`\u0013¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lid/dana/domain/social/core/SingleUseCase;", "T", "R", "", "Lid/dana/domain/social/core/BaseUseCase;", "threadExecutor", "Lkotlinx/coroutines/CoroutineDispatcher;", "postThreadExecutor", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "", "params", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "domain_release"}, k = 1, mv = {1, 4, 2})
public abstract class buildModelMapWithLock<T, R> extends ModelSpecificDistanceCalculator<T, R> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "R", "", "it", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<R, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final void invoke(@NotNull R r) {
            Intrinsics.checkNotNullParameter(r, "it");
        }
    }

    public buildModelMapWithLock() {
        this((APExpansion.AnonymousClass1) null, (APExpansion.AnonymousClass1) null, 3, (DefaultConstructorMarker) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "R", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Exception, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ buildModelMapWithLock(APExpansion.AnonymousClass1 r1, APExpansion.AnonymousClass1 r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DeviceTokenClient.setMax() : r1, (i & 2) != 0 ? DeviceTokenClient.length() : r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public buildModelMapWithLock(@NotNull APExpansion.AnonymousClass1 r2, @NotNull APExpansion.AnonymousClass1 r3) {
        super(r2, r3);
        Intrinsics.checkNotNullParameter(r2, "threadExecutor");
        Intrinsics.checkNotNullParameter(r3, "postThreadExecutor");
    }

    public static /* synthetic */ void execute$default(buildModelMapWithLock buildmodelmapwithlock, Object obj, Function1 function1, Function1 function12, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                function1 = setMin.INSTANCE;
            }
            if ((i & 4) != 0) {
                function12 = getMin.INSTANCE;
            }
            buildmodelmapwithlock.execute(obj, function1, function12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
    }

    public final void execute(T t, @NotNull Function1<? super R, Unit> function1, @NotNull Function1<? super Exception, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "onSuccess");
        Intrinsics.checkNotNullParameter(function12, "onError");
        invoke(t, function1, function12);
    }
}
