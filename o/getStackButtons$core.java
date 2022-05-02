package o;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/showagreement/RxShowAgreementBus;", "", "()V", "serviceKeyBehaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "serviceKey", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getStackButtons$core {
    @NotNull
    public static final getStackButtons$core INSTANCE = new getStackButtons$core();
    private static final removeString<String> serviceKeyBehaviorSubject;

    static {
        removeString<String> max = removeString.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "BehaviorSubject.create()");
        serviceKeyBehaviorSubject = max;
    }

    private getStackButtons$core() {
    }

    @JvmStatic
    @NotNull
    public static final removeString<String> serviceKey() {
        return serviceKeyBehaviorSubject;
    }
}
