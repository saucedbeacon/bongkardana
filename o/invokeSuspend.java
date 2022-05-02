package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class invokeSuspend extends Lambda implements Function1<ICustomTabsCallback, Unit> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Grayscale$Algorithm f10819a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public invokeSuspend(Grayscale$Algorithm grayscale$Algorithm) {
        super(1);
        this.f10819a = grayscale$Algorithm;
    }

    public final Object invoke(Object obj) {
        ICustomTabsCallback iCustomTabsCallback = (ICustomTabsCallback) obj;
        Intrinsics.checkNotNullParameter(iCustomTabsCallback, "balanceResult");
        this.f10819a.c.invoke(iCustomTabsCallback);
        this.f10819a.f10803a.length.getMin((CancellationException) null);
        return Unit.INSTANCE;
    }
}
