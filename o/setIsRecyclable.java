package o;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/RxIAPConnectBus;", "", "()V", "behaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "iapConnected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setIsRecyclable {
    private static final removeString<Boolean> getMin;
    @NotNull
    public static final setIsRecyclable setMin = new setIsRecyclable();

    static {
        removeString<Boolean> max = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "BehaviorSubject.create()");
        getMin = max;
    }

    private setIsRecyclable() {
    }

    @JvmStatic
    @NotNull
    public static final removeString<Boolean> getMax() {
        return getMin;
    }
}
